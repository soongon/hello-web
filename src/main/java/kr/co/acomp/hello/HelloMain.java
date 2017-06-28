package kr.co.acomp.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {

		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloDAO dao = ctx.getBean("helloDAO", HelloDAO.class);
		int result = dao.addTwoNumber(5, 67);
		System.out.println(result);
	}

}
