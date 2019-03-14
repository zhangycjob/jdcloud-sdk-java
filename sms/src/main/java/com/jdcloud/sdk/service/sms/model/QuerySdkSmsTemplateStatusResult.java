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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.sms.model.RespQuerySdkSmsTemplateStatusData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询短信模板接口
 */
public class QuerySdkSmsTemplateStatusResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private List<RespQuerySdkSmsTemplateStatusData> data;

    /**
     * message参数
     */
    private String message;

    /**
     * status参数
     */
    private String status;


    /**
     * get data
     *
     * @return
     */
    public List<RespQuerySdkSmsTemplateStatusData> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<RespQuerySdkSmsTemplateStatusData> data) {
        this.data = data;
    }

    /**
     * get message参数
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set message参数
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get status参数
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set status参数
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * set data
     *
     * @param data
     */
    public QuerySdkSmsTemplateStatusResult data(List<RespQuerySdkSmsTemplateStatusData> data) {
        this.data = data;
        return this;
    }

    /**
     * set message参数
     *
     * @param message
     */
    public QuerySdkSmsTemplateStatusResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set status参数
     *
     * @param status
     */
    public QuerySdkSmsTemplateStatusResult status(String status) {
        this.status = status;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(RespQuerySdkSmsTemplateStatusData data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}