
/**  
* @Title: HystrixController.java
* @Package com.synwing.cloud.demo.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author jiangliu.wang
* @date 2018年8月1日
* @version V1.0  
*/
package com.synwing.cloud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synwing.cloud.demo.hystrix.service.UserService;

/**
 * @ClassName: HystrixController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author jiangliu.wang
 * @date 2018年8月1日
 *
 */
@RestController
@RequestMapping(value="/cloud")
public class HystrixController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value= "/hystrix")
	public String testHystrix() {
		return userService.getUser("123");
	} 
	
}
