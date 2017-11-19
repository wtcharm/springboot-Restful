package cn.wt.bootrestful.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import cn.wt.bootrestful.StartSpringBootMain;
import cn.wt.bootrestful.vo.Member;
import groovyjarjarantlr.collections.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration	//现在要使用一个WEB程序启动
@SpringBootTest(classes = StartSpringBootMain.class)
public class TestRestTemplate {
	public static final String MEMBER_GET_URL="http://localhost/member/get?mid=";
	public static final String MEMBER_LIST_URL="http://localhost/member/list";
	@Resource
	private RestTemplate restTemplate;
	@Test
	public void testlist() {
		 List allMembers = this.restTemplate.getForObject(MEMBER_LIST_URL,List.class);
		 System.err.println(allMembers);
	}
	@Test
	public void testGet() {
		 Member obj = this.restTemplate.getForObject(MEMBER_GET_URL+"mldnjava",Member.class);
	}

}


















