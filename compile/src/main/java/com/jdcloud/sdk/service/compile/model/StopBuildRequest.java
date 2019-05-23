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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 停止构建任务
 */
public class StopBuildRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * job uuid
     * Required:true
     */
    @Required
    private String jobid;

    /**
     * 构建任务uuid
     * Required:true
     */
    @Required
    private String id;


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
     * get job uuid
     *
     * @return
     */
    public String getJobid() {
        return jobid;
    }

    /**
     * set job uuid
     *
     * @param jobid
     */
    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    /**
     * get 构建任务uuid
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 构建任务uuid
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public StopBuildRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set job uuid
     *
     * @param jobid
     */
    public StopBuildRequest jobid(String jobid) {
        this.jobid = jobid;
        return this;
    }

    /**
     * set 构建任务uuid
     *
     * @param id
     */
    public StopBuildRequest id(String id) {
        this.id = id;
        return this;
    }


}