package kr.co.acomp.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.acomp.hello.service.BbsService;
import kr.co.acomp.hello.service.HelloService;
import kr.co.acomp.hello.vo.Article;

public class HelloMain {

	public static void main(String[] args) {

		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
		BbsService service = ctx.getBean("bbsService", BbsService.class);
		service.registArticle(new Article());
		//System.out.println(result);
	}

}
