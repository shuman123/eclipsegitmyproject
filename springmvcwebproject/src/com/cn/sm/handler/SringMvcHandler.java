package com.cn.sm.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//afsd
@Controller
public class SringMvcHandler {
	@RequestMapping("welcome")
    public String welcome(){
    	System.out.println("welc������o333asfdadfme.....");
    	return "success";
    	
    }
}
