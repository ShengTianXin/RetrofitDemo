package com.feicui.administrator.retrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/9/28 0028.
 */
public final class UserResult {

    /**
     * code : 1
     * msg : 注册成功！
     * tokenid : 171
     */
    @SerializedName("errcode")
    private int code;
    @SerializedName("errmsg")
    private String msg;
    @SerializedName("tokenid")
    private int tokenid;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTokenid() {
        return tokenid;
    }

    public void setTokenid(int tokenid) {
        this.tokenid = tokenid;
    }

}
