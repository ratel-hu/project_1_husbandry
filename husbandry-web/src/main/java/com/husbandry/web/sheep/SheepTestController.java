package com.husbandry.web.sheep;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ratelhu
 * @Date 2020/12/16 15:03
 * @Version 1.0
 */
@RestController
@RequestMapping("/")
public class SheepTestController {
    @RequestMapping("")
    public String test(){
        return "Helo World!!";
    }
}
