package cn.poison.leju.exception.handler;

import cn.poison.leju.constant.ResultCode;
import cn.poison.leju.exception.BusinessException;
import cn.poison.leju.result.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @Tools Created by IntelliJ IDEA.
 * @author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/11 12:35
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义业务异常
     *
     * @param ex   异常类型
     * @return     返回结果
     */
    @ExceptionHandler(BusinessException.class)
    public ResponseResult<Object> handleBusinessException(BusinessException ex){
        logger.error(ex.getMessage(),ex);
        return new ResponseResult<>().setCode(ResultCode.FAIL).setMsg(ex.getMessage());
    }

    /**
     * 处理方法参数校验
     *
     * @param e 参数校验异常
     * @return  返回结果
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseResult<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        logger.error(e.getMessage(), e);
        return new ResponseResult<>().setCode(ResultCode.FAIL).setMsg(e.getBindingResult().getFieldError().getDefaultMessage());
    }

    /**
     * 处理数据唯一性异常
     *
     * @param e  数据唯一性异常
     * @return   返回结果
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseResult<Object> handleDuplicateKeyException(DuplicateKeyException e) {
        logger.error(e.getMessage(), e);
        return new ResponseResult<>().setCode(ResultCode.FAIL).setMsg("数据重复，请检查后提交");
    }

    /**
     * 处理未知系统异常
     *
     * @param e  系统异常
     * @return   返回结果
     */
    @ExceptionHandler(Exception.class)
    public ResponseResult<Object> handleException(Exception e) {
        logger.error(e.getMessage(), e);
        return new ResponseResult<>().setCode(ResultCode.INTERNET_SERVER_ERR).setMsg("系统繁忙,请稍后再试");
    }

}
