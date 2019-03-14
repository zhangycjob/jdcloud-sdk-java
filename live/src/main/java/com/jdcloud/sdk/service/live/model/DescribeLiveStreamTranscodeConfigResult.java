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
import com.jdcloud.sdk.service.live.model.TemplateConfig;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询转码模板配置
 */
public class DescribeLiveStreamTranscodeConfigResult extends JdcloudResult implements java.io.Serializable {

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
     * transcodeConfigs
     */
    private List<TemplateConfig> transcodeConfigs;


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
     * get transcodeConfigs
     *
     * @return
     */
    public List<TemplateConfig> getTranscodeConfigs() {
        return transcodeConfigs;
    }

    /**
     * set transcodeConfigs
     *
     * @param transcodeConfigs
     */
    public void setTranscodeConfigs(List<TemplateConfig> transcodeConfigs) {
        this.transcodeConfigs = transcodeConfigs;
    }


    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public DescribeLiveStreamTranscodeConfigResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public DescribeLiveStreamTranscodeConfigResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public DescribeLiveStreamTranscodeConfigResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set transcodeConfigs
     *
     * @param transcodeConfigs
     */
    public DescribeLiveStreamTranscodeConfigResult transcodeConfigs(List<TemplateConfig> transcodeConfigs) {
        this.transcodeConfigs = transcodeConfigs;
        return this;
    }


    /**
     * add item to transcodeConfigs
     *
     * @param transcodeConfig
     */
    public void addTranscodeConfig(TemplateConfig transcodeConfig) {
        if (this.transcodeConfigs == null) {
            this.transcodeConfigs = new ArrayList<>();
        }
        this.transcodeConfigs.add(transcodeConfig);
    }

}