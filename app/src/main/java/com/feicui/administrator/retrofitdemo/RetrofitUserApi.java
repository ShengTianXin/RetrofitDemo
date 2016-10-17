package com.feicui.administrator.retrofitdemo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2016/9/28 0028.
 */
public interface RetrofitUserApi {

    @GET("https://api.github.com/users/gqq")
    Call<ResponseBody> getData();

    /**
     * post请求需要添加GSON转换器吗，加依赖
     */
    @POST("/Handler/UserHandler.ashx?action=register")
    Call<UserResult> useRegister(@Body User user);
    /**
     * 请求方式：@GET("url")，@POST(url)
     * 请求头：一条信息时 @Headers("Accept-type:json")，多条信息时 @Headers({"Accept-type:json","...","..."})
     * 修改请求头：Call<UserResult> useRegister(@Body User user, @Header("Accept-type")String cd)
     * 请求体：@Body User user
     * */

///**    1.url可替换快{user}  @Path
//*     https://api.github.com/users/gqq/name
//*     https://api.github.com/users/{user}/name
//*     https://api.github.com/users/{owner}/{repo}
//*     2.https://api.github.com/search/issues?q=java&w=zxc&...;
// *    3.综合使用 POST https://api.github.com/users/{owner}/{repo}
// *    4.FormUrlEncoded 以表单形式提交
// *    5.多部分提交，Multipart
// */
//@GET("https://api.github.com/users/{owner}/{repo}")
//    Call<ResponseBody> getUser(@Path("owner")String user, @Path("repo")String rew);
//@GET("https://api.github.com/search/issues")
//    Call<ResponseBody> getDat(@Body User user,@Query("q")String da, @Query("w")String ta);
//@POST("https://api.github.com/users/{owner}")
//   Call<ResponseBody> getDa(@Body User user,@Path("owner")String us,@Query("q")String da);
//    @FormUrlEncoded
//    @POST("https://api.github.com/repos/")
//    Call<ResponseBody> getUserD(@Field("name")String name,@Field("password")String password);
//    @Multipart
//    @POST("https://api.github.com;")
//    Call<ResponseBody> getMult(@Part("photo")String photo,@Part("user")ResponseBody user,@Part("other")ResponseBody other);
}
