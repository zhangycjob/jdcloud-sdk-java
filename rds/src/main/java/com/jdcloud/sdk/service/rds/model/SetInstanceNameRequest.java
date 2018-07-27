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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改RDS实例名称&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
 */
public class SetInstanceNameRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名称，名称支持中文、数字、小写字母及英文下划线“_”，且不少于2字符不超过32字符
     * Required:true
     */
    @Required
    private String instanceName;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Instance ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 实例名称，名称支持中文、数字、小写字母及英文下划线“_”，且不少于2字符不超过32字符
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称，名称支持中文、数字、小写字母及英文下划线“_”，且不少于2字符不超过32字符
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
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
     * get Instance ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 实例名称，名称支持中文、数字、小写字母及英文下划线“_”，且不少于2字符不超过32字符
     *
     * @param instanceName
     */
    public SetInstanceNameRequest instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public SetInstanceNameRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Instance ID
     *
     * @param instanceId
     */
    public SetInstanceNameRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}