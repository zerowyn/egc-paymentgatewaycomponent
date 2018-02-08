/**
 * @Probject Name: scp-pay-gateway-app-service
 * @Path: com.eg.egsc.scp.paygateway.apiOrderQueryApi.java
 * @Create By caiqinli
 * @Create In 2018年2月6日 下午2:04:08
 * TODO
 */
package com.eg.egsc.scp.paygateway.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eg.egsc.framework.client.dto.RequestDto;
import com.eg.egsc.framework.client.dto.ResponseDto;
import com.eg.egsc.framework.service.base.api.BaseApiController;
import com.eg.egsc.scp.paygateway.dto.OrderQueryRequestForBackendDto;
import com.eg.egsc.scp.paygateway.service.OrderQueryService;
import com.eg.egsc.scp.paygateway.service.model.OrderQueryRequestForBackendSystem;

/**
 * @Class Name OrderQueryApi
 * @Author caiqinli
 * @Create In 2018年2月6日
 */
@Api(value = "支付网关订单查询相关api")
@RestController
@RequestMapping(value = "/api/pay")
public class OrderQueryApi  extends BaseApiController {
 
  @Autowired
  OrderQueryService orderQueryServiceImpl;
  
  @Autowired
  private OrderQueryRequestForBackendDto orderQueryRequestForBackendDto;
  
  @Autowired
  private OrderQueryRequestForBackendSystem orderQueryRequestForBackendSystem;
  
  protected final Logger logger = LoggerFactory.getLogger(OrderQueryApi.class);
  
  /**
   * 缴费后台查询支付订单
    * @param req 删除用户信息的条件
    * @return ResponseDto 返回的结果
   */
   @ApiOperation(value = "缴费后台查询支付订单信息")
   @RequestMapping(value = "/orderquery", method = RequestMethod.POST)
   public ResponseDto orderQuery(@RequestBody RequestDto<OrderQueryRequestForBackendDto> req) {
     ResponseDto result = new ResponseDto();
     try {
       orderQueryRequestForBackendDto = req.getData();
       orderQueryRequestForBackendSystem.setPlatform(orderQueryRequestForBackendDto.getPlatform());
       orderQueryRequestForBackendSystem.setAppid(orderQueryRequestForBackendDto.getAppid());
       orderQueryRequestForBackendSystem.setMch_id(orderQueryRequestForBackendDto.getMch_id());
       orderQueryRequestForBackendSystem.setOut_trade_no(orderQueryRequestForBackendDto.getOut_trade_no());
       orderQueryRequestForBackendSystem.setTransaction_id(orderQueryRequestForBackendDto.getTransaction_id());
       
       String message = orderQueryServiceImpl.orderQueryRequestFromBackendSystme(orderQueryRequestForBackendSystem);    
       result.setMessage(message);     
     } catch (Exception e) {
       logger.error(e.getMessage());
       result.setMessage("支付网关：支付订单查询出现异常！");
     }
     return result;
   }

}