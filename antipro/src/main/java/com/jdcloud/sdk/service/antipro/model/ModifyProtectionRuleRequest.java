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
 * Instance APIs
 * Anti DDoS Protection Package Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.antipro.model.ProtectionRuleSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改防护包实例或 IP 的防护规则
 */
public class ModifyProtectionRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改防护规则请求参数
     * Required:true
     */
    @Required
    private ProtectionRuleSpec protectionRuleSpec;

    /**
     * 地域编码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 防护包实例 Id
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 修改防护规则请求参数
     *
     * @return
     */
    public ProtectionRuleSpec getProtectionRuleSpec() {
        return protectionRuleSpec;
    }

    /**
     * set 修改防护规则请求参数
     *
     * @param protectionRuleSpec
     */
    public void setProtectionRuleSpec(ProtectionRuleSpec protectionRuleSpec) {
        this.protectionRuleSpec = protectionRuleSpec;
    }

    /**
     * get 地域编码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域编码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 防护包实例 Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 防护包实例 Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 修改防护规则请求参数
     *
     * @param protectionRuleSpec
     */
    public ModifyProtectionRuleRequest protectionRuleSpec(ProtectionRuleSpec protectionRuleSpec) {
        this.protectionRuleSpec = protectionRuleSpec;
        return this;
    }

    /**
     * set 地域编码
     *
     * @param regionId
     */
    public ModifyProtectionRuleRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 防护包实例 Id
     *
     * @param instanceId
     */
    public ModifyProtectionRuleRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}