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
 * 备份管理
 * 备份管理相关接口
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
 * 获取备份信息&lt;/br&gt;- SQL Server：支持&lt;/br&gt;- MySQL：暂不支持
 */
public class DescribeBackupsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 查询备份类型，0为手动备份，1为自动备份，不传表示全部. &lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     */
    private Integer auto;

    /**
     * 返回backupType等于指定值的备份列表。full为全量备份，diff为增量备份&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     */
    private String backupTypeFilter;

    /**
     * 返回dbName等于指定值的备份列表，不传或为空返回全部&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     */
    private String dbNameFilter;

    /**
     * 返回备份开始时间大于该时间的备份列表，格式为：YYYY-MM-DD HH:mm:ss&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     */
    private String backupTimeRangeStartFilter;

    /**
     * 返回备份开始时间小于等于该时间的备份列表，格式为：YYYY-MM-DD HH:mm:ss&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     */
    private String backupTimeRangeEndFilter;

    /**
     * 显示数据的页码，取值范围：[1,1000)，页码超过总页数时，显示最后一页，用于查询列表的接口
     * Required:true
     */
    @Required
    private Integer pageNumber;

    /**
     * 每页显示的数据条数，默认为10，取值范围：[1,100]，只能为10的倍数
     * Required:true
     */
    @Required
    private Integer pageSize;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 查询备份类型，0为手动备份，1为自动备份，不传表示全部. &lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @return
     */
    public Integer getAuto() {
        return auto;
    }

    /**
     * set 查询备份类型，0为手动备份，1为自动备份，不传表示全部. &lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param auto
     */
    public void setAuto(Integer auto) {
        this.auto = auto;
    }

    /**
     * get 返回backupType等于指定值的备份列表。full为全量备份，diff为增量备份&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @return
     */
    public String getBackupTypeFilter() {
        return backupTypeFilter;
    }

    /**
     * set 返回backupType等于指定值的备份列表。full为全量备份，diff为增量备份&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param backupTypeFilter
     */
    public void setBackupTypeFilter(String backupTypeFilter) {
        this.backupTypeFilter = backupTypeFilter;
    }

    /**
     * get 返回dbName等于指定值的备份列表，不传或为空返回全部&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @return
     */
    public String getDbNameFilter() {
        return dbNameFilter;
    }

    /**
     * set 返回dbName等于指定值的备份列表，不传或为空返回全部&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param dbNameFilter
     */
    public void setDbNameFilter(String dbNameFilter) {
        this.dbNameFilter = dbNameFilter;
    }

    /**
     * get 返回备份开始时间大于该时间的备份列表，格式为：YYYY-MM-DD HH:mm:ss&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @return
     */
    public String getBackupTimeRangeStartFilter() {
        return backupTimeRangeStartFilter;
    }

    /**
     * set 返回备份开始时间大于该时间的备份列表，格式为：YYYY-MM-DD HH:mm:ss&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param backupTimeRangeStartFilter
     */
    public void setBackupTimeRangeStartFilter(String backupTimeRangeStartFilter) {
        this.backupTimeRangeStartFilter = backupTimeRangeStartFilter;
    }

    /**
     * get 返回备份开始时间小于等于该时间的备份列表，格式为：YYYY-MM-DD HH:mm:ss&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @return
     */
    public String getBackupTimeRangeEndFilter() {
        return backupTimeRangeEndFilter;
    }

    /**
     * set 返回备份开始时间小于等于该时间的备份列表，格式为：YYYY-MM-DD HH:mm:ss&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param backupTimeRangeEndFilter
     */
    public void setBackupTimeRangeEndFilter(String backupTimeRangeEndFilter) {
        this.backupTimeRangeEndFilter = backupTimeRangeEndFilter;
    }

    /**
     * get 显示数据的页码，取值范围：[1,1000)，页码超过总页数时，显示最后一页，用于查询列表的接口
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 显示数据的页码，取值范围：[1,1000)，页码超过总页数时，显示最后一页，用于查询列表的接口
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页显示的数据条数，默认为10，取值范围：[1,100]，只能为10的倍数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[1,100]，只能为10的倍数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public DescribeBackupsRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 查询备份类型，0为手动备份，1为自动备份，不传表示全部. &lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param auto
     */
    public DescribeBackupsRequest auto(Integer auto) {
        this.auto = auto;
        return this;
    }

    /**
     * set 返回backupType等于指定值的备份列表。full为全量备份，diff为增量备份&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param backupTypeFilter
     */
    public DescribeBackupsRequest backupTypeFilter(String backupTypeFilter) {
        this.backupTypeFilter = backupTypeFilter;
        return this;
    }

    /**
     * set 返回dbName等于指定值的备份列表，不传或为空返回全部&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param dbNameFilter
     */
    public DescribeBackupsRequest dbNameFilter(String dbNameFilter) {
        this.dbNameFilter = dbNameFilter;
        return this;
    }

    /**
     * set 返回备份开始时间大于该时间的备份列表，格式为：YYYY-MM-DD HH:mm:ss&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param backupTimeRangeStartFilter
     */
    public DescribeBackupsRequest backupTimeRangeStartFilter(String backupTimeRangeStartFilter) {
        this.backupTimeRangeStartFilter = backupTimeRangeStartFilter;
        return this;
    }

    /**
     * set 返回备份开始时间小于等于该时间的备份列表，格式为：YYYY-MM-DD HH:mm:ss&lt;/br&gt;&lt;strong&gt;- 测试参数，后续可能被其他参数取代&lt;/strong&gt;
     *
     * @param backupTimeRangeEndFilter
     */
    public DescribeBackupsRequest backupTimeRangeEndFilter(String backupTimeRangeEndFilter) {
        this.backupTimeRangeEndFilter = backupTimeRangeEndFilter;
        return this;
    }

    /**
     * set 显示数据的页码，取值范围：[1,1000)，页码超过总页数时，显示最后一页，用于查询列表的接口
     *
     * @param pageNumber
     */
    public DescribeBackupsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[1,100]，只能为10的倍数
     *
     * @param pageSize
     */
    public DescribeBackupsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public DescribeBackupsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}