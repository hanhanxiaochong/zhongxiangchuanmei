package com.hanhanxiaochong.zhongxiangchuanmei.config;

import okhttp3.MultipartBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

/**
 * service-接口
 */

public interface HttpPostService {


    @FormUrlEncoded
    @POST("getOrderWX.action")
    Observable<String> getOrderWX(@Field("json") String json);


    @FormUrlEncoded
    @POST("getorderInfo.action")
    Observable<String> getOrderAli(@Field("json") String json);
    @FormUrlEncoded
    @POST("balance_consumptionQuery.action")
    Observable<String> luckydraw(@Field("json") String json);

    @FormUrlEncoded
    @POST("prizebyStarttimeTime.action")
    Observable<String> luckydraws(@Field("json") String json);

    @FormUrlEncoded
    @POST("Byitsdict.action")
    Observable<String> screen(@Field("json") String json);

    // 查询优惠的类型
    @FormUrlEncoded
    @POST("querydiscountBytype.action")
    Observable<String> querydiscountBytype(@Field("json") String json);

    // 查询所有油卡信息
    @FormUrlEncoded
    @POST("refuelingBysfid.action")
    Observable<String> refuelingBysfid(@Field("json") String json);

    // 查询所有手机号信息
    @FormUrlEncoded
    @POST("telephoneBysfid.action")
    Observable<String> telephoneByid(@Field("json") String json);

    @FormUrlEncoded
    @POST("AddressAdd.action")
    Observable<String> myaddressadd(@Field("json") String json);

    @FormUrlEncoded
    @POST("AddressModify.action")
    Observable<String> myaddressupdate(@Field("json") String json);

    @FormUrlEncoded
    @POST("queryByprovince.action")
    Observable<String> province(@Field("json") String json);

    @FormUrlEncoded
    @POST("queryBycity.action")
    Observable<String> city(@Field("json") String json);

    @FormUrlEncoded
    @POST("queryByarea.action")
    Observable<String> areas(@Field("json") String json);

    @FormUrlEncoded
    @POST("addressdefault.action")
    Observable<String> addressdefault(@Field("json") String json);

    @FormUrlEncoded
    @POST("telephoneBysfid.action")
    Observable<String> phone(@Field("json") String json);

    @FormUrlEncoded
    @POST("telephoneDel.action")
    Observable<String> phonedel(@Field("json") String json);

    @FormUrlEncoded
    @POST("telephoneModify.action")
    Observable<String> phoneupdate(@Field("json") String json);

    @FormUrlEncoded
    @POST("telephoneAdd.action")
    Observable<String> phoneadd(@Field("json") String json);

    @FormUrlEncoded
    @POST("refuelingBysfid.action")
    Observable<String> card(@Field("json") String json);

    @FormUrlEncoded
    @POST("refuelingAdd.action")
    Observable<String> cardadd(@Field("json") String json);

    @FormUrlEncoded
    @POST("refuelingDel.action")
    Observable<String> carddel(@Field("json") String json);

    @FormUrlEncoded
    @POST("refuelingModify.action")
    Observable<String> cardupdate(@Field("json") String json);


    @FormUrlEncoded
    @POST("AppFiftyToneGraph/videoLink")
    Observable<String> getAllVedioBy(@Field("once_no") boolean once_no);

    //Post请求后台数据
    @FormUrlEncoded
    @POST("{action}")
    Observable<String> postConection(@Path("action") String actoin, @Field("json") String json);

    @Multipart
    @POST("modifyPoliceInfoImg.action")
    Observable<String> image(@Part MultipartBody.Part json, @Part MultipartBody.Part file);


    @Multipart
//    @FormUrlEncoded
    @POST("uploadImage.action")
    Observable<String> image(@Part("token") String token, @Part MultipartBody.Part files);

    @FormUrlEncoded
    @POST("financingBysfidhih.action")
    Observable<String> finance(@Field("json") String json);

    @FormUrlEncoded
    @POST("mobile_queryStaff_info.action")
    Observable<String> financemoney(@Field("json") String json);

    @FormUrlEncoded
    @POST("staff_idbyWealthMoney.action")
    Observable<String> wealthmoney(@Field("json") String json);

    @FormUrlEncoded
    @POST("financingBysfid.action")
    Observable<String> financedistory(@Field("json") String json);

    @FormUrlEncoded
    @POST("interestBysfid.action")
    Observable<String> addfinanceone(@Field("json") String json);

    @FormUrlEncoded
    @POST("financingAdd.action")
    Observable<String> financeadd(@Field("json") String json);

    @FormUrlEncoded
    @POST("querydiscountBytype.action")
    Observable<String> addfinatwo(@Field("json") String json);
    @FormUrlEncoded
    @POST("queryShoppingList.action")
    Observable<String> store(@Field("json") String json);

    @FormUrlEncoded
    @POST("Shoppingbydispreferential.action")
    Observable<String> special(@Field("json") String json);

    @FormUrlEncoded
    @POST("shoppingcolorbyptid.action")
    Observable<String> storedetail(@Field("json") String json);

    @FormUrlEncoded
    @POST("shoppingattnamebyptid.action")
    Observable<String> detailimage(@Field("json") String json);

    @FormUrlEncoded
    @POST("selectRedpacketById.action")
    Observable<String> selected(@Field("json") String json);

    @FormUrlEncoded
    @POST("queryaddressById.action")
    Observable<String> myaddress(@Field("json") String json);

    @FormUrlEncoded
    @POST("OdersAdd.action")
    Observable<String> submitorders(@Field("json") String json);

    @FormUrlEncoded
    @POST("paymentindent.action")
    Observable<String> paymoney(@Field("json") String json);

    @FormUrlEncoded
    @POST("AddressDel.action")
    Observable<String> myaddressdel(@Field("json") String json);

    @FormUrlEncoded
    @POST("addressById.action")
    Observable<String> myaddressecho(@Field("json") String json);


}