package cn.poison.leju.exception;

/**
 * 自定义业务异常
 *
 * @Tools Created by IntelliJ IDEA.
 * @author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/11 14:19
 */
public class BusinessException extends RuntimeException{

    /**  异常状态码  */
    private Integer errCode;

    /** 异常提示信息  */
    private String message;

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
