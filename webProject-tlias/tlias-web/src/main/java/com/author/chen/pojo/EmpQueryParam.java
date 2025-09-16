package com.author.chen.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpQueryParam {
    private Integer page;
    private Integer pageSize;
    private String name;
    private Integer gender;
    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private LocalDate begin;
    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private LocalDate end;
}
