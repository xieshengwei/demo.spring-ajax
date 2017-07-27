package main.java.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
	   //ResponseBody会自动的将返回结果的
	   // JavaBean转换为JSON字符串发送到浏览器客户端,底层用了
	   // Jackson API,
	@RequestMapping("/ary.do")
	@ResponseBody
      public Object test(){
    	String[] ary = {"周杰伦","小公举","小甜甜"};  
    	return ary;
      }
	@RequestMapping("/bean.do")
	@ResponseBody
	//将javaBean作为返回值,ResponseBody注解将
	//Bean转换为Json字符串发送到浏览器;
	public Object bean(){
		return new Foo(8,"Tom",32.3);
	}
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Foo> foo(){
		List<Foo> list = new ArrayList();
		list.add(new Foo(2,"Jay",32));
		list.add(new Foo(3,"JJ",33));
		list.add(new Foo(4,"KK",34));
		return list;
	}
	
	@RequestMapping("/map.do")
	@ResponseBody
	public Map map(){
		Map map = new HashMap();
		map.put(1, "JJJ");
		map.put(2, 222);
		map.put(3, null);
		map.put(4, false);
		return map;
	}
    @RequestMapping("/list2.do")	
    @ResponseBody
    public Object list2(){
    	List<String> list = new ArrayList<String>();
    	list.add("王力宏");
    	list.add("周杰伦");
    	list.add("张惠妹");
    	return list;
    }
     //List<Map>
    @RequestMapping("/map2.do")
    @ResponseBody
    public Object map2(){
    	List<Map<String,Object>> list = 
    			new ArrayList<Map<String,Object>>();
    	Map<String,Object> map  = new  LinkedHashMap<String,Object>();
    	map.put("age", 5);
    	map.put("name", "Tom");
    	map.put("price", 4.5);
    	list.add(map);
    	map  = new  LinkedHashMap<String,Object>();
    	map.put("age", 6);
    	map.put("name", "jerry");
    	map.put("price", 34.3);
    	list.add(map);
    	map  = new  LinkedHashMap<String,Object>();
    	map.put("age", 7);
    	map.put("name", "lily");
    	map.put("price", 35.3);
    	list.add(map);
    	return list;
    }
    
    
}











