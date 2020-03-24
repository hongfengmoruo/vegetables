package com.system.vegetables.entity;

public class Merchants {
    private Integer posId;

    private String posName;

    private String posPhone;

    private String posAddr;

    private String posShopName;

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName == null ? null : posName.trim();
    }

    public String getPosPhone() {
        return posPhone;
    }

    public void setPosPhone(String posPhone) {
        this.posPhone = posPhone == null ? null : posPhone.trim();
    }

    public String getPosAddr() {
        return posAddr;
    }

    public void setPosAddr(String posAddr) {
        this.posAddr = posAddr == null ? null : posAddr.trim();
    }

    public String getPosShopName() {
        return posShopName;
    }

    public void setPosShopName(String posShopName) {
        this.posShopName = posShopName == null ? null : posShopName.trim();
    }
}