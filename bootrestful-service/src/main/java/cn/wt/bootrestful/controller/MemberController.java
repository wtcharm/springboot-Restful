package cn.wt.bootrestful.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.wt.bootrestful.vo.Member;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
//http://localhost/swagger-ui.html  Swagger 访问地址
@RestController
public class MemberController {
	@ApiOperation(value = "获取全部用户信息", notes = "将获取全部的数据，不需要传递任何的参数")
	@RequestMapping(value="/member/list",method=RequestMethod.GET)
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
	@ApiOperation(value = "获取指定编号的人员信息", notes = "只需要设置mid的信息就可以获取Member完整内容")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "mid", value = "用户编号", required = true, dataType = "String")})
	@RequestMapping(value="/member/get",method=RequestMethod.GET)
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
