package com.author.chen.controller;


import com.author.chen.pojo.Result;
import com.author.chen.utils.AliyunOSSOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class fileController {

    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;

    /**
     *  本地磁盘上传文件
     */
  /*  @PostMapping("/upload")
    public Result upload(String name, Integer age, MultipartFile file) throws IOException {

        String fileName = UUID.randomUUID().toString();
        log.info("接收参数 {} {} {} ",name,age,file);

        String originalFilename = file.getOriginalFilename();
        String extend = originalFilename.substring(originalFilename.lastIndexOf("."));

        file.transferTo(new File("D:\\Chen\\Pictures\\"+fileName+extend));

        return Result.success();
    }*/

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        log.info("上传文件: {}" ,file.getOriginalFilename());
        String url = aliyunOSSOperator.upload(file.getBytes(), file.getOriginalFilename());

        log.info("上传文件oss: {}" ,url);
        return Result.success(url);
    }
}
