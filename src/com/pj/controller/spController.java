package com.pj.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pj.mybatis.pojo.Dept;
import com.pj.mybatis.pojo.Emp;
import com.pj.mybatis.pojo.User;

@Controller
 
public class spController {
	// http://localhost:8080/spring_mybatis_testf/test

	@RequestMapping(name = "/test", method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("message", "fisrt Hello Spring MVC Framework!");
		System.out.println("第一次进入了test GET Method!");
		return "test";
	}

	@RequestMapping(name = "/test", method = RequestMethod.POST)
	public String test(ModelMap model, User user) throws IOException {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		System.out.println("进入了  test Method!");
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Emp> empList = sqlSession.selectList("findEmp");

		model.addAttribute("deptno", empList.get(0).getDeptno());
		model.addAttribute("ename", empList.get(0).getEname());
		model.addAttribute("sal", empList.get(0).getSal());
		model.addAttribute("userid", user.getUserid());
		model.addAttribute("username", user.getUsername());
		String userid = user.getUserid();
		String username = user.getUsername();
		System.out.println(userid + username);
		if (userid != null && !"".equals(userid.trim())) {
			if (username != null && !"".equals(username.trim())) {
				System.out.println("帐号密码无误，跳转到信息界面！");
				return "login";
			} else {
				System.out.println("密码错误！");
				return "error";
			}
		} else {
			System.out.println("帐号错误！");
			return "error";	
		}
	}
}