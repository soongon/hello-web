package kr.co.acomp.hello.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.acomp.hello.vo.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*.xml")
public class ArticleDAOTest {
	
	@Autowired
	private ArticleDAO dao;
	
	@Test
	public void testInsertArticle() {
		dao.insertArticle(null);
	}
	
	@Test
	@Ignore
	public void testSelectArticleById() {
		
		Article article = dao.selectArticleById(null);
		
		Assert.assertTrue(article.getAuthor().equals("leee"));
	}

}
