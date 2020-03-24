package com.system.vegetables.entity;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private Double goodsPrices;

    private Double goodsDiscount;

    private Integer goodsStatus;

    private Integer goodsCount;

    private Integer goodsIsNew;

    private Integer goodsIsHot;

    private Integer goodsType;

    private String goodsBrief;

    private String goodsDetails;

    private String goodsPhoto;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Double getGoodsPrices() {
        return goodsPrices;
    }

    public void setGoodsPrices(Double goodsPrices) {
        this.goodsPrices = goodsPrices;
    }

    public Double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getGoodsIsNew() {
        return goodsIsNew;
    }

    public void setGoodsIsNew(Integer goodsIsNew) {
        this.goodsIsNew = goodsIsNew;
    }

    public Integer getGoodsIsHot() {
        return goodsIsHot;
    }

    public void setGoodsIsHot(Integer goodsIsHot) {
        this.goodsIsHot = goodsIsHot;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief == null ? null : goodsBrief.trim();
    }

    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails == null ? null : goodsDetails.trim();
    }

    public String getGoodsPhoto() {
        return goodsPhoto;
    }

    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto == null ? null : goodsPhoto.trim();
    }
}