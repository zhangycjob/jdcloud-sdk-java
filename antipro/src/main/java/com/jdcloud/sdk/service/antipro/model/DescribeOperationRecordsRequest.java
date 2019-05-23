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
 * Operation Records APIs
 * Anti DDoS Protection Package Operation Records APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询操作日志
 */
public class DescribeOperationRecordsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 开始时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 结束时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 操作类型, 默认查全部.
- 0: 全部
- 1: 套餐变更
- 2: 防护规则变更
- 3: 防护对象变更
- 4: IP 地址变更
- 5: 防护包名称变更

     */
    private Integer action;

    /**
     * 防护包名称, 支持模糊匹配
     */
    private String name;


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 开始时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 操作类型, 默认查全部.
- 0: 全部
- 1: 套餐变更
- 2: 防护规则变更
- 3: 防护对象变更
- 4: IP 地址变更
- 5: 防护包名称变更

     *
     * @return
     */
    public Integer getAction() {
        return action;
    }

    /**
     * set 操作类型, 默认查全部.
- 0: 全部
- 1: 套餐变更
- 2: 防护规则变更
- 3: 防护对象变更
- 4: IP 地址变更
- 5: 防护包名称变更

     *
     * @param action
     */
    public void setAction(Integer action) {
        this.action = action;
    }

    /**
     * get 防护包名称, 支持模糊匹配
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 防护包名称, 支持模糊匹配
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeOperationRecordsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeOperationRecordsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 开始时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public DescribeOperationRecordsRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public DescribeOperationRecordsRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 操作类型, 默认查全部.
- 0: 全部
- 1: 套餐变更
- 2: 防护规则变更
- 3: 防护对象变更
- 4: IP 地址变更
- 5: 防护包名称变更

     *
     * @param action
     */
    public DescribeOperationRecordsRequest action(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * set 防护包名称, 支持模糊匹配
     *
     * @param name
     */
    public DescribeOperationRecordsRequest name(String name) {
        this.name = name;
        return this;
    }


}