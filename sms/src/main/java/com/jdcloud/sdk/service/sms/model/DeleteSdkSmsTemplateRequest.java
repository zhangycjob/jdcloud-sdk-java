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
 * 删除短信模板接口
 */
public class DeleteSdkSmsTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * templateId参数
     */
    private String templateId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get templateId参数
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set templateId参数
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
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
     * set templateId参数
     *
     * @param templateId
     */
    public DeleteSdkSmsTemplateRequest templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteSdkSmsTemplateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}