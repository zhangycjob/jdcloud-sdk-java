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
 * 参数管理
 * 参数配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.rds.model.ModifyParametersResponse;

/**
 * 修改SQL Server实例的配置参数，目前支持以下参数:max_worker_threads,max_degree_of_parallelism,max_server_memory_(MB)。 部分参数修改后，需要重启才能生效，具体可以参考微软的相关文档。&lt;br&gt;- 仅支持SQL Server
 */
class ModifyParametersExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PUT";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}/parameters";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ModifyParametersResponse.class;
    }
}
