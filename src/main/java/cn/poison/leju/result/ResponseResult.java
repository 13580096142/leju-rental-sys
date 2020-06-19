package cn.poison.leju.result;

import cn.poison.leju.constant.ResultCode;

/**
 * 统一响应结果封装
 *
 * @Tools Created by IntelliJ IDEA.
 * @author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/11 13:23
 */

public class ResponseResult<T> {
    /** 返回状态码  */
    private Integer code;
    /** 返回描述信息  */
    private String msg;
    /** 返回内容体  */
    private T data;

    public ResponseResult<T> setCode(ResultCode resultCode){
        this.code=resultCode.code;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public ResponseResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
