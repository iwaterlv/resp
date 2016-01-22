package com.fh.controller.customer;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.entity.system.Role;
import com.fh.service.customer.CustomerService;
import com.fh.service.system.menu.MenuService;
import com.fh.service.system.role.RoleService;
import com.fh.service.system.user.UserService;
import com.fh.util.Const;
import com.fh.util.PageData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by M on 2016/1/10.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController{

    @Resource(name="customerService")
    CustomerService customerService;

    @RequestMapping("/list")
    public ModelAndView list(Page page)throws Exception{
        ModelAndView mv = this.getModelAndView();
        PageData pd = new PageData();
        page.setPd(pd);
        List<PageData> customerlist = customerService.customerlistPage(page);
        mv.setViewName("customer/customerList");
        mv.addObject("customerList",customerlist);
        mv.addObject(Const.SESSION_QX, this.getHC()); // 按钮权限
        return mv;
    }

    /* ===============================权限================================== */
    public Map<String, String> getHC() {
        Subject currentUser = SecurityUtils.getSubject(); // shiro管理的session
        Session session = currentUser.getSession();
        return (Map<String, String>) session.getAttribute(Const.SESSION_QX);
    }
	/* ===============================权限================================== */
}
