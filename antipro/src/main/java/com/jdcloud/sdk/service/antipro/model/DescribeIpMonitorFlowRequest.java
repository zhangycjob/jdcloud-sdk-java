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
 * Attack Log APIs
 * Anti DDoS Protection Package Attack Log APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询公网 IP 的监控流量
 */
public class DescribeIpMonitorFlowRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间, 只能查询最近 90 天以内的数据, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询的结束时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * DDoS 防护包已防护的公网 IP
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist&quot;&gt;describeProtectedIpList&lt;/a&gt; 接口查询 DDoS 防护包已防护的公网 IP

     * Required:true
     */
    @Required
    private List<String> ip;


    /**
     * get 开始时间, 只能查询最近 90 天以内的数据, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间, 只能查询最近 90 天以内的数据, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询的结束时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询的结束时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get DDoS 防护包已防护的公网 IP
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist&quot;&gt;describeProtectedIpList&lt;/a&gt; 接口查询 DDoS 防护包已防护的公网 IP

     *
     * @return
     */
    public List<String> getIp() {
        return ip;
    }

    /**
     * set DDoS 防护包已防护的公网 IP
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist&quot;&gt;describeProtectedIpList&lt;/a&gt; 接口查询 DDoS 防护包已防护的公网 IP

     *
     * @param ip
     */
    public void setIp(List<String> ip) {
        this.ip = ip;
    }


    /**
     * set 开始时间, 只能查询最近 90 天以内的数据, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public DescribeIpMonitorFlowRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询的结束时间, UTC 时间, 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public DescribeIpMonitorFlowRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set DDoS 防护包已防护的公网 IP
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist&quot;&gt;describeProtectedIpList&lt;/a&gt; 接口查询 DDoS 防护包已防护的公网 IP

     *
     * @param ip
     */
    public DescribeIpMonitorFlowRequest ip(List<String> ip) {
        this.ip = ip;
        return this;
    }


    /**
     * add item to DDoS 防护包已防护的公网 IP
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeprotectediplist&quot;&gt;describeProtectedIpList&lt;/a&gt; 接口查询 DDoS 防护包已防护的公网 IP

     *
     * @param ip
     */
    public void addIp(String ip) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        this.ip.add(ip);
    }

}