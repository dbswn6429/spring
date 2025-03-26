package com.simple.ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
		
		DataSource ds = ctx.getBean(DataSource.class);
		System.out.println(ds.toString());
		
		MemberDAO md = ctx.getBean(MemberDAO.class);
		System.out.println(md.getDataSource().toString());
	}
}
