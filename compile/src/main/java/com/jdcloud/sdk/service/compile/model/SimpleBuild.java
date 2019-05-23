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

package com.jdcloud.sdk.service.compile.model;


/**
 * simpleBuild
 */
public class SimpleBuild  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 构建任务的uuid
     */
    private String uuid;

    /**
     * 构建任务所属的job名
     */
    private String jobName;

    /**
     * 构建任务创建时间
     */
    private Integer createdAt;

    /**
     * 构建类型
     */
    private String compilerType;

    /**
     * 构建任务的运行状态
     */
    private String status;

    /**
     * 构建任务运行时间
     */
    private Integer duration;


    /**
     * get 构建任务的uuid
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 构建任务的uuid
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get 构建任务所属的job名
     *
     * @return
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set 构建任务所属的job名
     *
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * get 构建任务创建时间
     *
     * @return
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    /**
     * set 构建任务创建时间
     *
     * @param createdAt
     */
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * get 构建类型
     *
     * @return
     */
    public String getCompilerType() {
        return compilerType;
    }

    /**
     * set 构建类型
     *
     * @param compilerType
     */
    public void setCompilerType(String compilerType) {
        this.compilerType = compilerType;
    }

    /**
     * get 构建任务的运行状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 构建任务的运行状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 构建任务运行时间
     *
     * @return
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * set 构建任务运行时间
     *
     * @param duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    /**
     * set 构建任务的uuid
     *
     * @param uuid
     */
    public SimpleBuild uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 构建任务所属的job名
     *
     * @param jobName
     */
    public SimpleBuild jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * set 构建任务创建时间
     *
     * @param createdAt
     */
    public SimpleBuild createdAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set 构建类型
     *
     * @param compilerType
     */
    public SimpleBuild compilerType(String compilerType) {
        this.compilerType = compilerType;
        return this;
    }

    /**
     * set 构建任务的运行状态
     *
     * @param status
     */
    public SimpleBuild status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 构建任务运行时间
     *
     * @param duration
     */
    public SimpleBuild duration(Integer duration) {
        this.duration = duration;
        return this;
    }


}