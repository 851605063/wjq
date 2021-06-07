package com.qfggk.blog.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.RequestAttributes;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handlerException ( Exception e,RequestAttributes requestAttributes)
    {
        int error=0;
        Integer status = (Integer) requestAttributes.getAttribute("javax.servlet.error.status_code", error);
        log.debug("error:{}",error);
        return "index";
    }
}
