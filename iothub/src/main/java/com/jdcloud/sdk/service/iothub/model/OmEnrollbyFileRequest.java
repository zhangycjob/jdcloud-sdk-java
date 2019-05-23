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
 * OMManager
 * 用于完成物模型管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 物模型通过文件上传注册接口

 */
public class OmEnrollbyFileRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 待上传物模型的IoT Hub实例编号
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 物模型文件名称
     * Required:true
     */
    @Required
    private String fileName;


    /**
     * get 待上传物模型的IoT Hub实例编号
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 待上传物模型的IoT Hub实例编号
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 物模型文件名称
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 物模型文件名称
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * set 待上传物模型的IoT Hub实例编号
     *
     * @param instanceId
     */
    public OmEnrollbyFileRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 物模型文件名称
     *
     * @param fileName
     */
    public OmEnrollbyFileRequest fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


}