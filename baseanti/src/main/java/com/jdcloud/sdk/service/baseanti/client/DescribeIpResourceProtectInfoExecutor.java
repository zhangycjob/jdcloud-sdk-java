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
 * IP Resource APIs
 * Anti DDoS Basic IP Resource APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.baseanti.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.baseanti.model.DescribeIpResourceProtectInfoResponse;

/**
 * 查询公网 IP 的攻击记录, 仅支持 ipv4. (已废弃, 建议使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-basic/api/describeattacklogs&quot;&gt;describeAttackLogs&lt;/a&gt; 接口)

 */
class DescribeIpResourceProtectInfoExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/ipResources/{ip}/protectInfo";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DescribeIpResourceProtectInfoResponse.class;
    }
}
