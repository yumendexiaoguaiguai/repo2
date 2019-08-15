package com.itheima.crm.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.crm.domain.Customer;
import com.itheima.crm.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/customer")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	//模型驱动接收页面参数
	private Customer model = new Customer();
	@Override
	public Customer getModel() {
		return model;
	}
	@Autowired
	private CustomerService customerService;
	
	@Action(value="save",results={
			@Result(name="success",location="/succ.jsp",type="redirect"),
			@Result(name="error",location="/error.jsp",type="redirect")
	})
	public String save() {
		try {
			customerService.save(model);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
