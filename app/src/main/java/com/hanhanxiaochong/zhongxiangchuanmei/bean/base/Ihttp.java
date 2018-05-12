package com.hanhanxiaochong.zhongxiangchuanmei.bean.base;

/**
 * Created by dahei on 2017/10/23.
 */

public interface Ihttp {


    //人口删除/BasicInformationCollection/mobilePersonneDelete.action
    String PERSONNEDELETE="mobilePersonneDelete.action";
    //订单列表 接口：EmployeeWelfare/ mobile_SelectOrderList.action
    String SELECTORDERlIST="mobile_SelectOrderList.action";
    //订单详情 mobile_selectProductDetails.action
    String SELECTPRODUCTDETAILS="mobile_SelectOrderMess.action";
    //确认收货 EmployeeWelfare/mobile_UpdateOrderState.action
    String UPDATEORDERSTATE="mobile_UpdateOrderState.action";
    //延长收货日期 EmployeeWelfare/mobile_ExtendReceiving.action
    String EXTENDrECEIVING="mobile_ExtendReceiving.action";
    //申请退货接口 EmployeeWelfare/mobile_ApplicationReturns.action
    String APPLICATIONRETURN="mobile_ApplicationReturns.action";
    //提现接口 EmployeeWelfare/mobile_withdraWApplication.action
    String WITHDRAWAPPLICATION="mobile_withdraWApplication.action";
    //订单评价接口 EmployeeWelfare/mobile_evaluationOrdes.action
    String EVALUATIONORDES="mobile_evaluationOrdes.action";
    //申请退款接口 EmployeeWelfare/mobile_ApplicationRefund.action
    String APPLICATIONREFUND="mobile_ApplicationRefund.action";
    //支付宝支付 getorderInfo.action
    String GETORDERINFO="getorderInfo.action";
    //取消订单 mobile_modifyOrderState.action
    String MODIFYORDERSTATE="mobile_modifyOrderState.action";

    //商城(或积分商城)页面推荐信息查询 EmployeeWelfare/mobile_selectHomeRecommended.action
    String SELECTHOMERECOMMENDED= "mobile_selectHomeRecommended.action";
    //添加订单 mobile_orderApplication.action
    String ORDERAPPLICATION = "mobile_orderApplication.action";
    String BASEFILE="http://47.92.97.45:8030/EmployeeWelfare";
    //订单历史记录 EmployeeWelfare/mobile_selectTixiansqjl.action
    String SELECTTIXIANSQJL="mobile_selectTixiansqjl.action";
    // 赚币金额配置查询mobile_selectDictionary.action
    String SELECTDICTIONARY = "mobile_selectDictionary.action";
    //查询用户充值或者提现金额后的等级及汇率变化mobile_selectProportion.action
    String SELECTPROPORTION = "mobile_selectProportion.action";
    //查询客服接口 backweixinandqq.action
    String BACKWEIXINANDQQ = "backweixinandqq.action";

}
