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
 * job api
 * API COMPILE CODE TO PACKAGE
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.compile.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 新建构建任务
 */
public class CreateJobResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 构建任务的uuid
     */
    private String id;

    /**
     * 项目所有者/项目名称
     */
    private String codeRepoUrlLabel;

    /**
     * 构建成功则是true
     */
    private Boolean result;


    /**
     * get 构建任务的uuid
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 构建任务的uuid
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 项目所有者/项目名称
     *
     * @return
     */
    public String getCodeRepoUrlLabel() {
        return codeRepoUrlLabel;
    }

    /**
     * set 项目所有者/项目名称
     *
     * @param codeRepoUrlLabel
     */
    public void setCodeRepoUrlLabel(String codeRepoUrlLabel) {
        this.codeRepoUrlLabel = codeRepoUrlLabel;
    }

    /**
     * get 构建成功则是true
     *
     * @return
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * set 构建成功则是true
     *
     * @param result
     */
    public void setResult(Boolean result) {
        this.result = result;
    }


    /**
     * set 构建任务的uuid
     *
     * @param id
     */
    public CreateJobResult id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 项目所有者/项目名称
     *
     * @param codeRepoUrlLabel
     */
    public CreateJobResult codeRepoUrlLabel(String codeRepoUrlLabel) {
        this.codeRepoUrlLabel = codeRepoUrlLabel;
        return this;
    }

    /**
     * set 构建成功则是true
     *
     * @param result
     */
    public CreateJobResult result(Boolean result) {
        this.result = result;
        return this;
    }


}