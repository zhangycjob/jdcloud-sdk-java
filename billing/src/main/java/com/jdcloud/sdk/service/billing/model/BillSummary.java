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

package com.jdcloud.sdk.service.billing.model;


/**
 * billSummary
 */
public class BillSummary  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * appCode
     */
    private String appCode;

    /**
     * 产品线代码名称
     */
    private String appCodeName;

    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * 产品代码名称
     */
    private String serviceCodeName;

    /**
     * 计费类型
     */
    private Integer billingType;

    /**
     * 计费类型描述
     */
    private String billingTypeName;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 区域
     */
    private String region;

    /**
     * 费用类型
     */
    private String actionTypeName;

    /**
     * 规格
     */
    private String formula;

    /**
     * 计费开始时间
     */
    private String startTime;

    /**
     * 计费结束时间
     */
    private String endTime;

    /**
     * 账单生成时间
     */
    private String billTime;

    /**
     * 账单总额
     */
    private Number totalFee;

    /**
     * 优惠金额
     */
    private Number discountFee;

    /**
     * 优惠后总价金额
     */
    private Number realTotalFee;

    /**
     * 代金券支付金额
     */
    private Number cashCouponPayFee;

    /**
     * 余额支付金额
     */
    private Number balancePayFee;

    /**
     * 现金支付金额
     */
    private Number cashPayFee;

    /**
     * 欠费金额
     */
    private Number arrearFee;


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get appCode
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get 产品线代码名称
     *
     * @return
     */
    public String getAppCodeName() {
        return appCodeName;
    }

    /**
     * set 产品线代码名称
     *
     * @param appCodeName
     */
    public void setAppCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
    }

    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 产品代码名称
     *
     * @return
     */
    public String getServiceCodeName() {
        return serviceCodeName;
    }

    /**
     * set 产品代码名称
     *
     * @param serviceCodeName
     */
    public void setServiceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
    }

    /**
     * get 计费类型
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    /**
     * get 计费类型描述
     *
     * @return
     */
    public String getBillingTypeName() {
        return billingTypeName;
    }

    /**
     * set 计费类型描述
     *
     * @param billingTypeName
     */
    public void setBillingTypeName(String billingTypeName) {
        this.billingTypeName = billingTypeName;
    }

    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * get 区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 费用类型
     *
     * @return
     */
    public String getActionTypeName() {
        return actionTypeName;
    }

    /**
     * set 费用类型
     *
     * @param actionTypeName
     */
    public void setActionTypeName(String actionTypeName) {
        this.actionTypeName = actionTypeName;
    }

    /**
     * get 规格
     *
     * @return
     */
    public String getFormula() {
        return formula;
    }

    /**
     * set 规格
     *
     * @param formula
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * get 计费开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 计费开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 计费结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 计费结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 账单生成时间
     *
     * @return
     */
    public String getBillTime() {
        return billTime;
    }

    /**
     * set 账单生成时间
     *
     * @param billTime
     */
    public void setBillTime(String billTime) {
        this.billTime = billTime;
    }

    /**
     * get 账单总额
     *
     * @return
     */
    public Number getTotalFee() {
        return totalFee;
    }

    /**
     * set 账单总额
     *
     * @param totalFee
     */
    public void setTotalFee(Number totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * get 优惠金额
     *
     * @return
     */
    public Number getDiscountFee() {
        return discountFee;
    }

    /**
     * set 优惠金额
     *
     * @param discountFee
     */
    public void setDiscountFee(Number discountFee) {
        this.discountFee = discountFee;
    }

    /**
     * get 优惠后总价金额
     *
     * @return
     */
    public Number getRealTotalFee() {
        return realTotalFee;
    }

    /**
     * set 优惠后总价金额
     *
     * @param realTotalFee
     */
    public void setRealTotalFee(Number realTotalFee) {
        this.realTotalFee = realTotalFee;
    }

    /**
     * get 代金券支付金额
     *
     * @return
     */
    public Number getCashCouponPayFee() {
        return cashCouponPayFee;
    }

    /**
     * set 代金券支付金额
     *
     * @param cashCouponPayFee
     */
    public void setCashCouponPayFee(Number cashCouponPayFee) {
        this.cashCouponPayFee = cashCouponPayFee;
    }

    /**
     * get 余额支付金额
     *
     * @return
     */
    public Number getBalancePayFee() {
        return balancePayFee;
    }

    /**
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public void setBalancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
    }

    /**
     * get 现金支付金额
     *
     * @return
     */
    public Number getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
    }

    /**
     * get 欠费金额
     *
     * @return
     */
    public Number getArrearFee() {
        return arrearFee;
    }

    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public void setArrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public BillSummary pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public BillSummary appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set 产品线代码名称
     *
     * @param appCodeName
     */
    public BillSummary appCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public BillSummary serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 产品代码名称
     *
     * @param serviceCodeName
     */
    public BillSummary serviceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
        return this;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public BillSummary billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set 计费类型描述
     *
     * @param billingTypeName
     */
    public BillSummary billingTypeName(String billingTypeName) {
        this.billingTypeName = billingTypeName;
        return this;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public BillSummary resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public BillSummary resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public BillSummary region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 费用类型
     *
     * @param actionTypeName
     */
    public BillSummary actionTypeName(String actionTypeName) {
        this.actionTypeName = actionTypeName;
        return this;
    }

    /**
     * set 规格
     *
     * @param formula
     */
    public BillSummary formula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * set 计费开始时间
     *
     * @param startTime
     */
    public BillSummary startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 计费结束时间
     *
     * @param endTime
     */
    public BillSummary endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 账单生成时间
     *
     * @param billTime
     */
    public BillSummary billTime(String billTime) {
        this.billTime = billTime;
        return this;
    }

    /**
     * set 账单总额
     *
     * @param totalFee
     */
    public BillSummary totalFee(Number totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    /**
     * set 优惠金额
     *
     * @param discountFee
     */
    public BillSummary discountFee(Number discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    /**
     * set 优惠后总价金额
     *
     * @param realTotalFee
     */
    public BillSummary realTotalFee(Number realTotalFee) {
        this.realTotalFee = realTotalFee;
        return this;
    }

    /**
     * set 代金券支付金额
     *
     * @param cashCouponPayFee
     */
    public BillSummary cashCouponPayFee(Number cashCouponPayFee) {
        this.cashCouponPayFee = cashCouponPayFee;
        return this;
    }

    /**
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public BillSummary balancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
        return this;
    }

    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public BillSummary cashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }

    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public BillSummary arrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
        return this;
    }


}