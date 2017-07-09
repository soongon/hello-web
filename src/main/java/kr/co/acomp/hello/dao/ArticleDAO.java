package kr.co.acomp.hello.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.acomp.hello.vo.Article;

@Repository
public class ArticleDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public void insertArticle(Article article) {
		sqlSession.insert(
				"mappers.article-mapper.insertArticle", article);
	}

	public Article selectArticleById(String articleId) {
		
		return sqlSession.selectOne(
				"mappers.article-mapper.selectArticleById", articleId);
	}
}
