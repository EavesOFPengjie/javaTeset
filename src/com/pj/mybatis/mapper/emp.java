package com.pj.mybatis.mapper;

import java.util.List;

import com.pj.mybatis.pojo.Emp;

public interface emp {
   //遵循四个原则
	//1.接口的方法名 == emp.xml中的 id名
	//2.返回值的类型  和Mapper.xml文件中的返回值类型要一致
	//3.方法入参的类型要与Mapper.xml中入参的类型保持一致
	//4.Mapper.xml 需要与本接口邦定
	public List<Emp> findEmp();
}
