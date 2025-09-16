package com.author.chen.Exception;


import com.author.chen.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GobalExceptionHandle {

    @ExceptionHandler
    public Result exceptionHandler(Exception e){
        log.error("程序出错了",e);

        return Result.error("程序出错了 联系客服");
    }
    
    @ExceptionHandler
    public Result DuplicateEntryException(DuplicateKeyException e){
        String err = e.getMessage();
        int i = err.indexOf("Duplicate entry");
        String[] arr = err.substring(i).split(" ");


        return Result.error(arr[2]+"已经存在");
    }
    @ExceptionHandler
    public Result bigIntegerDataException(BigIntegerToviolation e){
        log.error("数据过大",e);

        return Result.error("数据过载 不能超过255");
    }
    @ExceptionHandler
    public Result clazzHavPersonException(HavPersonException e){
        log.error("还有人",e);

        return Result.error("还有人😅😅😅");
    }
}
