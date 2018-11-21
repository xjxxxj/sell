package com.xinyan.sell.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @program: sell
 * @description: 读取微信配置
 * @author: 谢庆香
 * @create: 2018-11-21 15:59
 **/
@Configuration
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /**公众号appid*/
    private String appid ;
    /**公众号secret*/
    private String secret ;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}