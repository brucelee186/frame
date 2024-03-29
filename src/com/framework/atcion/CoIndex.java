package com.framework.atcion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoIndex {
	 
    /**
     * 1. 使用RequestMapping注解来映射请求的URL 2. 返回值会通过视图解析器解析为实际的物理视图,
     * 对于InternalResourceViewResolver视图解析器，会做如下解析 通过prefix+returnVal+suffix
     * 这样的方式得到实际的物理视图，然后会转发操作 "/WEB-INF/views/success.jsp"
     * 
     * @return
     */
	
	@RequestMapping("/coIndex")
	public String hello() {
		System.out.println("index");
		return "success";
	}
}