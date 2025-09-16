package com.author.chen.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Data
public class ClazzQueryParam {
    private String name;
    @DateTimeFormat( pattern = "yyyy-dd-MM")
    private LocalDate begin;
    @DateTimeFormat( pattern = "yyyy-dd-MM")
    private LocalDate end;
    private Integer page=1;
    private Integer pagSize=10;
}
