package cn.jxufe.crm.controller;

import cn.jxufe.crm.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController extends BaseController {

    /**
     * 系统登录页
     *
     *
     * @param
     * @return java.lang.String
     */
    @RequestMapping("index")
    public String index(){
        return "index";
    }


    /**
     * 系统界面欢迎页
     *
     *
     * @param
     * @return java.lang.String
     */
    @RequestMapping("welcome")
    public String welcome(){
        return "welcome";
    }

    /**
     * 后端管理主页面
     *
     *
     * @param
     * @return java.lang.String
     */
    @RequestMapping("main")
    public String main(HttpServletRequest request){
        return "main";
    }


}
