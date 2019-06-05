package com.kd.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author bob
* @version 创建时间：2019年5月29日 下午8:21:32
*/
@RestController
public class Controller {
	@RequestMapping("/ierp")
	public String test() {
		return "Hello World..";
	}
}
