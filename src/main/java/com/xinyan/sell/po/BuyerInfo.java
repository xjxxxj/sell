package com.xinyan.sell.po;

import javax.persistence.Entity;
import javax.persistence.Id;

/**

* @Description:    BuyerInfo 买家信息表
* @Author:         Hp
* @CreateDate:     17/11/2018 18:27
* @UpdateUser:     Hp
* @UpdateDate:     17/11/2018 18:27
* @UpdateRemark:
* @Version:
*/
@Entity(name = "tb_buyer")
public class BuyerInfo {
    /**买家OpenId，买家唯一标识*/
    @Id
    private String buyerOpenId;
    /**买家姓名*/
    private String buyerName;
    /**买家手机号*/
    private String buyerPhone;
    /**买家地址*/
    private String buyerAddress;

    public BuyerInfo() {
    }

    public BuyerInfo(String buyerName, String buyerPhone, String buyerAddress, String buyerOpenId) {
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.buyerAddress = buyerAddress;
        this.buyerOpenId = buyerOpenId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerOpenId() {
        return buyerOpenId;
    }

    public void setBuyerOpenId(String buyerOpenId) {
        this.buyerOpenId = buyerOpenId;
    }

    @Override
    public String toString() {
        return "BuyerInfo{" +
                "buyerName='" + buyerName + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", buyerAddress='" + buyerAddress + '\'' +
                ", buyerOpenId='" + buyerOpenId + '\'' +
                '}';
    }
}
