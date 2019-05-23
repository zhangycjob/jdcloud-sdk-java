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

package com.jdcloud.sdk.service.compile.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.compile.model.GetJobsResponse;

/**
 * 查询获取编译任务列表，并显示最后一次编译的一些信息
/v2/regions/cn-south-1/jobs/?sorts.1.name&#x3D;status&amp;sorts.1.direction&#x3D;asc&amp;pageNumber&#x3D;1&amp;pageSize&#x3D;10&amp;filters.1.name&#x3D;name&amp;filters.1.values.1&#x3D;我的job

 */
class GetJobsExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/jobs";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return GetJobsResponse.class;
    }
}
