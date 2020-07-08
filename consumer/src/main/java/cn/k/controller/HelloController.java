package cn.k.controller;

import cn.kkkk.studentInter;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Reference
    private studentInter studentInter;

    @GetMapping("/")
    public String get(){
        return studentInter.getNow();
    }
}
