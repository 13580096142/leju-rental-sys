package cn.poison.leju.constant;

/**
 * 响应状态码枚举类
 *
 * @Tools Created by IntelliJ IDEA.
 * @author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/11 13:11
 */
public enum ResultCode {
    /** 成功 */
    SUCCESS(200),

    /** 失败  */
    FAIL(400),

    /** 未认证(签名错误) */
    UNAUTHORIZED(401),

    /** 资源不存在  */
    NOT_FOUND(404),

    /** 服务器内部错误  */
    INTERNET_SERVER_ERR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
