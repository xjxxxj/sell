package com.xinyan.sell.config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: sell
 * @description: 微信公众号api配置
 * @author: 谢庆香
 * @create: 2018-11-21 16:06
 **/
@Configuration
public class WechatMpConfig {

    @Autowired
    private WechatAccountConfig accountConfig ;

    @Bean
    public WxMpService wxMpService(){
        //创建WxMpService实例并设置appid和secret
        WxMpServiceImpl wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
        return wxMpService ;
    }

    @Bean
    public WxMpConfigStorage wxMpConfigStorage(){
        WxMpInMemoryConfigStorage storage = new WxMpInMemoryConfigStorage();
        storage.setAppId(accountConfig.getAppid());
        storage.setSecret(accountConfig.getSecret());
        return storage ;
    }

}