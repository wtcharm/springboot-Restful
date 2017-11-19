package cn.wt.bootrestful.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wt.bootrestful.vo.Member;

@RestController
public class MemberController {
	@RequestMapping("/member/list")
	public Object list() {
		List<Member> allMember = new ArrayList<Member>();
		for(int x=0;x<5;x++) {
			Member vo = new Member();
			vo.setMid("mldn-"+x);
			vo.setName("天天-"+x);
			vo.setAge(20 + x);
			vo.setDeptno(10L +x);
			vo.setBirthday(new Date());
			vo.setSalary(50.53 + x);
			allMember.add(vo);
		}
		return allMember;
	}
	@RequestMapping("/member/get")
	public Object get(String mid) {
		 Member vo = new Member();
		vo.setMid(mid);
		vo.setName(mid +"甜甜");
		vo.setAge(46);
		vo.setBirthday(new Date());
		vo.setDeptno(10L);
		vo.setSalary(76.5);
		return vo.toString();
	}
}
