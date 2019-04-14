package com.cn.sm.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//afs34
//556233
@Controller
public class SringMvcHandler {
	@RequestMapping("welcome")
    public String welcome(){
    	System.out.println("welc°¢·²´ïo333asfdadfme.....");
    	return "success";
    	
    }
}
