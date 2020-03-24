package com.system.vegetables.entity;

public class Addrs {
    private Integer addrId;

    private String receiveName;

    private String receivePhone;

    private String receiveAddr;

    private Integer isDefaultAddr;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getReceiveAddr() {
        return receiveAddr;
    }

    public void setReceiveAddr(String receiveAddr) {
        this.receiveAddr = receiveAddr == null ? null : receiveAddr.trim();
    }

    public Integer getIsDefaultAddr() {
        return isDefaultAddr;
    }

    public void setIsDefaultAddr(Integer isDefaultAddr) {
        this.isDefaultAddr = isDefaultAddr;
    }
}