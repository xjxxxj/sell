package com.xinyan.sell.controller;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @program: sell
 * @description: 获取openid
 * @author: 谢庆香
 * @create: 2018-11-21 00:35
 **/
@Controller
@RequestMapping("/wechat")
public class WeiXinController {

    @Autowired
    private WxMpService wxMpService ;

    /**
     * @Description:
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 16:52
     */ 
    @GetMapping("/authorize")
    public String authorize(@RequestParam("returnUrl") String returnUrl){
        //设置回调地址
        String url = "http://2278w434u3.51mypc.cn:35519/sell/wechat/userInfo" ;
        try {
            //按照规范对url进行处理
            returnUrl = wxMpService.oauth2buildAuthorizationUrl(url,WxConsts.OAuth2Scope.SNSAPI_USERINFO,URLEncoder.encode(returnUrl,"utf-8")) ;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(returnUrl) ;
        return "redirect:" + returnUrl ;
    }

    @GetMapping("/userInfo")
    @ResponseBody
    public String userInfo(@RequestParam("code") String code , @RequestParam("state") String returnUrl){
        WxMpUser wxMpUser = null ;
        try {
            WxMpOAuth2AccessToken accessToken = wxMpService.oauth2getAccessToken(code) ;
            //获取用户的基本信息
            wxMpUser = wxMpService.oauth2getUserInfo(accessToken,null) ;
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        //获取openid
        String openid = wxMpUser.getOpenId() ;
        System.out.println(openid) ;
        //转发
        return returnUrl + "&openid=" + openid ;
    }

    @ResponseBody
    @PostMapping("/wechat")
    public void verificationExit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(11111111) ;
        String echostr = request.getParameter("echostr") ;
        response.getWriter().write(echostr);
    }
}