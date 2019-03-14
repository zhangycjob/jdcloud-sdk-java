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
import com.jdcloud.sdk.service.live.model.PornData;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询直播鉴黄张数数据
 */
public class DescribeLivePornDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pornData
     */
    private List<PornData> pornData;


    /**
     * get pornData
     *
     * @return
     */
    public List<PornData> getPornData() {
        return pornData;
    }

    /**
     * set pornData
     *
     * @param pornData
     */
    public void setPornData(List<PornData> pornData) {
        this.pornData = pornData;
    }


    /**
     * set pornData
     *
     * @param pornData
     */
    public DescribeLivePornDataResult pornData(List<PornData> pornData) {
        this.pornData = pornData;
        return this;
    }


    /**
     * add item to pornData
     *
     * @param pornData
     */
    public void addPornData(PornData pornData) {
        if (this.pornData == null) {
            this.pornData = new ArrayList<>();
        }
        this.pornData.add(pornData);
    }

}