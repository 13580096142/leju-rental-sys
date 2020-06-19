package cn.poison.leju.util;

import cn.poison.leju.constant.ResultCode;
import cn.poison.leju.result.ResponseResult;

/**
 * 请求响应处理工具类
 *
 * @Tools Created by IntelliJ IDEA.
 * @author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/11 13:48
 */
public class ResultUtil {

    /** 成功 */
    private static final String SUCCESS = "success";

    /** 失败 */
    private static final String FAIL = "fail";

    /**
     * 请求成功·默认结果返回
     *
     * @param <T> 泛型
     * @return    返回结果
     */
    public static <T> ResponseResult<T> makeOkRsp() {
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS).setMsg(SUCCESS);
    }

    /**
     * 请求成功·自定义提示信息处理方法
     *
     * @param msg  自定义提示信息
     * @param <T>  泛型
     * @return     返回结果
     */
    public static <T> ResponseResult<T> makeOkRsp(String msg) {
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS).setMsg(msg);
    }

    /**
     * 请求成功·返回响应内容体
     *
     * @param data  响应内容体
     * @param <T>   泛型
     * @return      返回结果
     */
    public static <T> ResponseResult<T> makeOkRsp(T data){
        return new ResponseResult<T>().setCode(ResultCode.SUCCESS).setMsg(SUCCESS).setData(data);
    }

    /**
     * 请求失败·服务器内部错误
     *
     * @param msg  自定义提示信息
     * @param <T>  泛型
     * @return     返回结果
     */
    public static <T> ResponseResult<T> makeErrRsp(String msg) {
        return new ResponseResult<T>().setCode(ResultCode.INTERNET_SERVER_ERR).setMsg(msg);
    }

    /**
     * 请求失败·指定状态码与返回信息
     *
     * @param code  响应状态码
     * @param msg   自定义提示信息
     * @param <T>   泛型
     * @return      返回结果
     */
    public static <T> ResponseResult<T> makeErrRsp(int code,String msg){
        return new ResponseResult<T>().setCode(code).setMsg(msg);
    }

    /**
     * 请求失败·指定返回结果
     *
     * @param code  响应状态码
     * @param msg   自定义提示信息
     * @param data  响应内容体
     * @param <T>   泛型
     * @return      返回结果
     */
    public static <T> ResponseResult<T> makeErrRsp(int code,String msg,T data){
        return new ResponseResult<T>().setCode(code).setMsg(msg).setData(data);
    }


}
