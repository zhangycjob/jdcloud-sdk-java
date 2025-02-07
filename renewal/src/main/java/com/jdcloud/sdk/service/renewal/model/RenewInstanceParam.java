/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.renewal.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * renewInstanceParam
 */
public class RenewInstanceParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务线
     * Required:true
     */
    @Required
    private String appCode;

    /**
     * 产品线
     * Required:true
     */
    @Required
    private String serviceCode;

    /**
     * 时间单位 1:小时 2:天 3:月 4:年
     * Required:true
     */
    @Required
    private Integer timeUnit;

    /**
     * 时长
     * Required:true
     */
    @Required
    private Integer timeSpan;

    /**
     * 签名 md5(pin+serviceCode+key)
     * Required:true
     */
    @Required
    private String sign;

    /**
     * 待续费资源id列表,英文逗号分隔
     * Required:true
     */
    @Required
    private String instanceIds;

    /**
     * 是否统一续费到期日续费 1-是 0-否（默认为0）
     */
    private Integer unifyDate;

    /**
     * 是否自动支付 true-是 false-否（默认为true）
     */
    private Boolean autoPay;

    /**
     * 回调地址
     */
    private String returnURL;


    /**
     * get 业务线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 业务线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 时间单位 1:小时 2:天 3:月 4:年
     *
     * @return
     */
    public Integer getTimeUnit() {
        return timeUnit;
    }

    /**
     * set 时间单位 1:小时 2:天 3:月 4:年
     *
     * @param timeUnit
     */
    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * get 时长
     *
     * @return
     */
    public Integer getTimeSpan() {
        return timeSpan;
    }

    /**
     * set 时长
     *
     * @param timeSpan
     */
    public void setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
    }

    /**
     * get 签名 md5(pin+serviceCode+key)
     *
     * @return
     */
    public String getSign() {
        return sign;
    }

    /**
     * set 签名 md5(pin+serviceCode+key)
     *
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * get 待续费资源id列表,英文逗号分隔
     *
     * @return
     */
    public String getInstanceIds() {
        return instanceIds;
    }

    /**
     * set 待续费资源id列表,英文逗号分隔
     *
     * @param instanceIds
     */
    public void setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
    }

    /**
     * get 是否统一续费到期日续费 1-是 0-否（默认为0）
     *
     * @return
     */
    public Integer getUnifyDate() {
        return unifyDate;
    }

    /**
     * set 是否统一续费到期日续费 1-是 0-否（默认为0）
     *
     * @param unifyDate
     */
    public void setUnifyDate(Integer unifyDate) {
        this.unifyDate = unifyDate;
    }

    /**
     * get 是否自动支付 true-是 false-否（默认为true）
     *
     * @return
     */
    public Boolean getAutoPay() {
        return autoPay;
    }

    /**
     * set 是否自动支付 true-是 false-否（默认为true）
     *
     * @param autoPay
     */
    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    /**
     * get 回调地址
     *
     * @return
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * set 回调地址
     *
     * @param returnURL
     */
    public void setReturnURL(String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * set 业务线
     *
     * @param appCode
     */
    public RenewInstanceParam appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public RenewInstanceParam serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 时间单位 1:小时 2:天 3:月 4:年
     *
     * @param timeUnit
     */
    public RenewInstanceParam timeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * set 时长
     *
     * @param timeSpan
     */
    public RenewInstanceParam timeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    /**
     * set 签名 md5(pin+serviceCode+key)
     *
     * @param sign
     */
    public RenewInstanceParam sign(String sign) {
        this.sign = sign;
        return this;
    }

    /**
     * set 待续费资源id列表,英文逗号分隔
     *
     * @param instanceIds
     */
    public RenewInstanceParam instanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    /**
     * set 是否统一续费到期日续费 1-是 0-否（默认为0）
     *
     * @param unifyDate
     */
    public RenewInstanceParam unifyDate(Integer unifyDate) {
        this.unifyDate = unifyDate;
        return this;
    }

    /**
     * set 是否自动支付 true-是 false-否（默认为true）
     *
     * @param autoPay
     */
    public RenewInstanceParam autoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    /**
     * set 回调地址
     *
     * @param returnURL
     */
    public RenewInstanceParam returnURL(String returnURL) {
        this.returnURL = returnURL;
        return this;
    }


}