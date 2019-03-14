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
 * 短信模板接口
 * API related to addSdkSmsTemplate
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 新增短信模板接口
 */
public class AddSdkSmsTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appId参数
     */
    private String appId;

    /**
     * name参数
     */
    private String name;

    /**
     * type参数
     */
    private String type;

    /**
     * template参数
     */
    private String template;

    /**
     * description参数
     */
    private String description;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get appId参数
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set appId参数
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get name参数
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name参数
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get type参数
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type参数
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get template参数
     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set template参数
     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * get description参数
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description参数
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set appId参数
     *
     * @param appId
     */
    public AddSdkSmsTemplateRequest appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set name参数
     *
     * @param name
     */
    public AddSdkSmsTemplateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set type参数
     *
     * @param type
     */
    public AddSdkSmsTemplateRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set template参数
     *
     * @param template
     */
    public AddSdkSmsTemplateRequest template(String template) {
        this.template = template;
        return this;
    }

    /**
     * set description参数
     *
     * @param description
     */
    public AddSdkSmsTemplateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AddSdkSmsTemplateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}