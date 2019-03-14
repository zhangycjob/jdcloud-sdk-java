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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.live.model.SnapshotTemplate;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询直播截图模板列表
 */
public class DescribeCustomLiveStreamSnapshotTemplatesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页码
     */
    private Integer pageNumber;

    /**
     * 每页数量
     */
    private Integer pageSize;

    /**
     * 查询总数
     */
    private Integer totalCount;

    /**
     * snapshotTemplates
     */
    private List<SnapshotTemplate> snapshotTemplates;


    /**
     * get 当前页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 查询总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get snapshotTemplates
     *
     * @return
     */
    public List<SnapshotTemplate> getSnapshotTemplates() {
        return snapshotTemplates;
    }

    /**
     * set snapshotTemplates
     *
     * @param snapshotTemplates
     */
    public void setSnapshotTemplates(List<SnapshotTemplate> snapshotTemplates) {
        this.snapshotTemplates = snapshotTemplates;
    }


    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public DescribeCustomLiveStreamSnapshotTemplatesResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public DescribeCustomLiveStreamSnapshotTemplatesResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public DescribeCustomLiveStreamSnapshotTemplatesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set snapshotTemplates
     *
     * @param snapshotTemplates
     */
    public DescribeCustomLiveStreamSnapshotTemplatesResult snapshotTemplates(List<SnapshotTemplate> snapshotTemplates) {
        this.snapshotTemplates = snapshotTemplates;
        return this;
    }


    /**
     * add item to snapshotTemplates
     *
     * @param snapshotTemplate
     */
    public void addSnapshotTemplate(SnapshotTemplate snapshotTemplate) {
        if (this.snapshotTemplates == null) {
            this.snapshotTemplates = new ArrayList<>();
        }
        this.snapshotTemplates.add(snapshotTemplate);
    }

}