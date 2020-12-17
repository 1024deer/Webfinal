package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.ICatalogService;
import service.ILunboimageService;
import vo.Lunboimage;

@Controller
public class LunboimageController {
	@Autowired
	private ILunboimageService LunboimageService;
	

	@RequestMapping(value = "/queryimages.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> queryimages() {
		List<Lunboimage> list =new ArrayList<Lunboimage>();
		Map<String, Object> map = new HashMap<String, Object>();
		list=LunboimageService.queryimages();
		map.put("rows", list);
		return map; // 框架使用MappingJackson2HttpMessageConverter类将java类型转换为json字符串放在response
					// body中
	}
}
