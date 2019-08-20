package com.tpc.controller.pc.controller.system;

import com.tpc.common.core.controller.BaseController;
import com.tpc.common.core.domain.AjaxResult;
import com.tpc.common.utils.ServletUtils;
import com.tpc.common.utils.StringUtils;
import io.swagger.annotations.Api;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
* 登录验证
* @author TPC
* $data 2019-08-20 23:05
*/
@Api("用户登录验证")
@RestController
@RequestMapping("/login")
public class sysLoginController extends BaseController {

    @GetMapping("/login")
    public AjaxResult login(String username, String password, Boolean rememberMe)
    {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try
        {
            subject.login(token);
            return success();
        }
        catch (AuthenticationException e)
        {
            String msg = "用户或密码错误";
            if (StringUtils.isNotEmpty(e.getMessage()))
            {
                msg = e.getMessage();
            }
            return error(msg);
        }
    }
    @PostMapping("/login")
    @ResponseBody
    public AjaxResult ajaxLogin(String username, String password, Boolean rememberMe)
    {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try
        {
            subject.login(token);
            return success();
        }
        catch (AuthenticationException e)
        {
            String msg = "用户或密码错误";
            if (StringUtils.isNotEmpty(e.getMessage()))
            {
                msg = e.getMessage();
            }
            return error(msg);
        }
    }
    @GetMapping("/unauth")
    public AjaxResult unauth()
    {
        return AjaxResult.UNAUTH("无妨问权限", new ArrayList<>());
//        return "error/unauth";
    }
}
