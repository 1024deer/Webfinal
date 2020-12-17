package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.ICatalogService;
import vo.Catalog;

@Controller
public class CatalogController {
	@Autowired
	private ICatalogService catalogService;
	
	@RequestMapping(value = "/querymanu.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> querymanu() {
		List<Catalog> list =new ArrayList<Catalog>();
		Map<String, Object> map = new HashMap<String, Object>();
		list=catalogService.queryCatalog();
		map.put("rows", list);
		return map; 
	}
	
}
