package com.mml.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.mml.entity.Memberuser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MemberLoginAction extends ActionSupport {
	private Memberuser memberuser;
	
	public Memberuser getMemberUser() {
		return Memberuser;
	}

	public void setMemberUser(Memberuser memberuser) {
		this.memberuser = memberuser;
	}

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		
		System.out.println(request.getCharacterEncoding());
		
		if("root".equals(memberuser.getMName()) && "root123".equals(memberuser.getMPassword()))
		{
			Map session=ActionContext.getContext().getSession();
			session.put("memberuser.name", memberuser.getMName());
			
			System.out.println("��¼�ɹ�,�û���="+memberuser.getMName());
			return "success";
		}
		
		System.out.println("��¼ʧ�ܣ��û���="+memberuser.getMName());
		return "fail";
	}
	
}
