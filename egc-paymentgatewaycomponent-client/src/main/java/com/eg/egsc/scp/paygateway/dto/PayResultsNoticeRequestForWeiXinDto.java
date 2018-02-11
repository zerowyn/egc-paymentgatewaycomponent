/**
 * @Probject Name: scp-pay-gateway-app-client
 * @Path: com.eg.egsc.scp.paygateway.dtoOrderQueryRequestForBackendDto.java
 * @Create By caiqinli
 * @Create In 2018年2月6日 下午2:15:14
 * TODO
 */
package com.eg.egsc.scp.paygateway.dto;


import com.eg.egsc.framework.client.dto.BaseBusinessDto;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

/**
 * @Class Name PayResultsNoticeRequestForBackendDto
 * @Author fandong
 * @Create In 2018年2月11日
 */
@Component
public class PayResultsNoticeRequestForWeiXinDto extends BaseBusinessDto {

  /**
   * 指定请求的目标平台-‘WEIXIN’或‘ALIPAY’，必填
   *
   */
  @NotBlank(message = "scp.pay.gateway.app.backend.request.platform.notblank")
  private String platform;

  /**
   * SUCCESS/FAIL
   * 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
   */
  private String return_code;

  /**
   * 返回信息，如非空，为错误原因
   * 签名失败
   * 参数格式校验错误
   */
  private String return_msg;

  /**
   * 微信开放平台审核通过的应用APPID
   *
   */
  private String appid;

  /**
   * 微信支付分配的商户号
   *
   */
  private String mch_id;

  /**
   * 微信支付分配的终端设备号
   *
   */
  private String device_info;


  /**
   * 随机字符串，不长于32位
   *
   */
  private String nonce_str;

  /**
   * 验签
   */
  private String sign;

  /**
   * 业务结果
   * 微信：SUCCESS/FAIL
   支付宝到本接口的代码转换(存入代码转换表)：
   TRADE_CLOSED->FAIL  未付款交易超时关闭，或支付完成后全额退款
   TRADE_SUCCESS->SUCCESS  交易支付成功
   *
   */
  private String result_code;

  /**
   * 错误代码
   *
   */
  private String err_code;

  /**
   * 错误代码描述
   *
   */
  private String err_code_des;

  /**
   * 用户在商户appid下的唯一标识
   *
   */
  private String openid;

  /**
   * 用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效
   *
   */
  private String is_subscribe;

  /**
   * 调用接口提交的交易类型
   *
   */
  private String trade_type;

  /**
   * 交易状态
   *
   */
  private String trade_state;

  /**
   * 银行类型，采用字符串类型的银行标识
   *
   */
  private String bank_type;

  /**
   * 订单总金额，单位为分
   *
   */
  private Integer total_fee;

  /**
   * 货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY
   */
    private String fee_type;

  /**
   * 现金支付金额订单现金支付金额
   *
   */
  private Integer cash_fee;

  /**
   * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY
   *
   */
  private String cash_fee_type;

  /**
   * 代金券金额：“代金券或立减优惠”金额<=订单总金额，订单总金额-“代金券或立减优惠”金额=现金支付金额
   *
   */
  private Integer coupon_fee;

  /**
   * 代金券或立减优惠使用数量
   *
   */
  private String coupon_count;

  /**
   * 代金券类别：
   * CASH 微信充值代金券
   NO CASH 微信非充值优惠券
   COUPON 支付宝红包
   POINT 支付宝集分宝
   DISCOUNT 支付宝折扣券
   MCARD 支付宝商家储值卡
   MDISCOUNT 支付宝商户优惠券
   MCOUPON 商户红包
   *
   */
  private String coupon_type_$n;

  /**
   * 代金券或立减优惠ID, $n为下标，从0开始编号
   *
   */
  private String coupon_id_$n;

  /**
   * 单个代金券或立减优惠支付金额, $n为下标，从0开始编号
   *
   */
  private String coupon_fee_$n;

  /**
   * 转发给微信订单查询接口的消息格式-微信的订单号，优先使用
   *
   */
  private String transaction_id;

  /**
   * 转发给微信订单查询接口的消息格式-缴费后台内部订单号，
   * 当没提供transaction_id时需要传这个。
   * 要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。
   *
   */
  private String out_trade_no;

  /**
   * 附加数据，原样返回
   *
   */
  private String attach;

  /**
   * 订单支付时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。
   *
   */
  private String time_end;

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public String getReturn_code() {
    return return_code;
  }

  public void setReturn_code(String return_code) {
    this.return_code = return_code;
  }

  public String getReturn_msg() {
    return return_msg;
  }

  public void setReturn_msg(String return_msg) {
    this.return_msg = return_msg;
  }

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getMch_id() {
    return mch_id;
  }

  public void setMch_id(String mch_id) {
    this.mch_id = mch_id;
  }

  public String getDevice_info() {
    return device_info;
  }

  public void setDevice_info(String device_info) {
    this.device_info = device_info;
  }

  public String getNonce_str() {
    return nonce_str;
  }

  public void setNonce_str(String nonce_str) {
    this.nonce_str = nonce_str;
  }

  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  public String getResult_code() {
    return result_code;
  }

  public void setResult_code(String result_code) {
    this.result_code = result_code;
  }

  public String getErr_code() {
    return err_code;
  }

  public void setErr_code(String err_code) {
    this.err_code = err_code;
  }

  public String getErr_code_des() {
    return err_code_des;
  }

  public void setErr_code_des(String err_code_des) {
    this.err_code_des = err_code_des;
  }

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getIs_subscribe() {
    return is_subscribe;
  }

  public void setIs_subscribe(String is_subscribe) {
    this.is_subscribe = is_subscribe;
  }

  public String getTrade_type() {
    return trade_type;
  }

  public void setTrade_type(String trade_type) {
    this.trade_type = trade_type;
  }

  public String getTrade_state() {
    return trade_state;
  }

  public void setTrade_state(String trade_state) {
    this.trade_state = trade_state;
  }

  public String getBank_type() {
    return bank_type;
  }

  public void setBank_type(String bank_type) {
    this.bank_type = bank_type;
  }

  public Integer getTotal_fee() {
    return total_fee;
  }

  public void setTotal_fee(Integer total_fee) {
    this.total_fee = total_fee;
  }

  public String getFee_type() {
    return fee_type;
  }

  public void setFee_type(String fee_type) {
    this.fee_type = fee_type;
  }

  public Integer getCash_fee() {
    return cash_fee;
  }

  public void setCash_fee(Integer cash_fee) {
    this.cash_fee = cash_fee;
  }

  public String getCash_fee_type() {
    return cash_fee_type;
  }

  public void setCash_fee_type(String cash_fee_type) {
    this.cash_fee_type = cash_fee_type;
  }

  public Integer getCoupon_fee() {
    return coupon_fee;
  }

  public void setCoupon_fee(Integer coupon_fee) {
    this.coupon_fee = coupon_fee;
  }

  public String getCoupon_count() {
    return coupon_count;
  }

  public void setCoupon_count(String coupon_count) {
    this.coupon_count = coupon_count;
  }

  public String getCoupon_type_$n() {
    return coupon_type_$n;
  }

  public void setCoupon_type_$n(String coupon_type_$n) {
    this.coupon_type_$n = coupon_type_$n;
  }

  public String getCoupon_id_$n() {
    return coupon_id_$n;
  }

  public void setCoupon_id_$n(String coupon_id_$n) {
    this.coupon_id_$n = coupon_id_$n;
  }

  public String getCoupon_fee_$n() {
    return coupon_fee_$n;
  }

  public void setCoupon_fee_$n(String coupon_fee_$n) {
    this.coupon_fee_$n = coupon_fee_$n;
  }

  public String getTransaction_id() {
    return transaction_id;
  }

  public void setTransaction_id(String transaction_id) {
    this.transaction_id = transaction_id;
  }

  public String getOut_trade_no() {
    return out_trade_no;
  }

  public void setOut_trade_no(String out_trade_no) {
    this.out_trade_no = out_trade_no;
  }

  public String getAttach() {
    return attach;
  }

  public void setAttach(String attach) {
    this.attach = attach;
  }

  public String getTime_end() {
    return time_end;
  }

  public void setTime_end(String time_end) {
    this.time_end = time_end;
  }
}
