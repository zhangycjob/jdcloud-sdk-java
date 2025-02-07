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

package com.jdcloud.sdk.service.kubernetes.model;

import java.util.List;
import java.util.ArrayList;

/**
 * cluster 详情
 */
public class Cluster  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 集群id
     */
    private String clusterId;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * kubernetes的版本
     */
    private String version;

    /**
     * 集群所在的az
     */
    private List<String> azs;

    /**
     * 节点组列表
     */
    private List<NodeGroup> nodeGroups;

    /**
     * k8s的cluster的cidr
     */
    private String clusterCidr;

    /**
     * 认证信息
     */
    private MasterAuth masterAuth;

    /**
     * 状态  [pending,running,reconciling（升级时的状态）, deleting, deleted, error]
     */
    private String clusterState;

    /**
     * 状态变更原因
     */
    private String stateMessage;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 用户的AccessKey，插件调用open-api时的认证凭证
     */
    private String accessKey;

    /**
     * basicAuth
     */
    private Boolean basicAuth;

    /**
     * clientCertificate
     */
    private Boolean clientCertificate;

    /**
     * 用户访问的ip
     */
    private String endpoint;

    /**
     * endpoint的port
     */
    private String endpointPort;

    /**
     * endpoint的dashboard port
     */
    private String dashboardPort;

    /**
     * deprecated 优先以addonsConfig中的配置为准 &lt;br&gt;用户是否启用集群自定义监控，true 表示开启用，false 表示未开启用
     */
    private Boolean userMetrics;

    /**
     * 集群组件配置信息
     */
    private List<AddonConfig> addonsConfig;

    /**
     * 是否开启集群自动升级，true 表示开启，false 表示未开启
     */
    private Boolean autoUpgrade;

    /**
     * 配置集群维护策略
     */
    private MaintenanceWindow maintenanceWindow;

    /**
     * 集群升级计划信息, 仅展示最新一条升级计划信息
     */
    private UpgradePlan upgradePlan;

    /**
     * 控制节点操作进度
     */
    private MaintenanceWindow masterProgress;


    /**
     * get 集群id
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set 集群id
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get kubernetes的版本
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set kubernetes的版本
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 集群所在的az
     *
     * @return
     */
    public List<String> getAzs() {
        return azs;
    }

    /**
     * set 集群所在的az
     *
     * @param azs
     */
    public void setAzs(List<String> azs) {
        this.azs = azs;
    }

    /**
     * get 节点组列表
     *
     * @return
     */
    public List<NodeGroup> getNodeGroups() {
        return nodeGroups;
    }

    /**
     * set 节点组列表
     *
     * @param nodeGroups
     */
    public void setNodeGroups(List<NodeGroup> nodeGroups) {
        this.nodeGroups = nodeGroups;
    }

    /**
     * get k8s的cluster的cidr
     *
     * @return
     */
    public String getClusterCidr() {
        return clusterCidr;
    }

    /**
     * set k8s的cluster的cidr
     *
     * @param clusterCidr
     */
    public void setClusterCidr(String clusterCidr) {
        this.clusterCidr = clusterCidr;
    }

    /**
     * get 认证信息
     *
     * @return
     */
    public MasterAuth getMasterAuth() {
        return masterAuth;
    }

    /**
     * set 认证信息
     *
     * @param masterAuth
     */
    public void setMasterAuth(MasterAuth masterAuth) {
        this.masterAuth = masterAuth;
    }

    /**
     * get 状态  [pending,running,reconciling（升级时的状态）, deleting, deleted, error]
     *
     * @return
     */
    public String getClusterState() {
        return clusterState;
    }

    /**
     * set 状态  [pending,running,reconciling（升级时的状态）, deleting, deleted, error]
     *
     * @param clusterState
     */
    public void setClusterState(String clusterState) {
        this.clusterState = clusterState;
    }

    /**
     * get 状态变更原因
     *
     * @return
     */
    public String getStateMessage() {
        return stateMessage;
    }

    /**
     * set 状态变更原因
     *
     * @param stateMessage
     */
    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 用户的AccessKey，插件调用open-api时的认证凭证
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set 用户的AccessKey，插件调用open-api时的认证凭证
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * get basicAuth
     *
     * @return
     */
    public Boolean getBasicAuth() {
        return basicAuth;
    }

    /**
     * set basicAuth
     *
     * @param basicAuth
     */
    public void setBasicAuth(Boolean basicAuth) {
        this.basicAuth = basicAuth;
    }

    /**
     * get clientCertificate
     *
     * @return
     */
    public Boolean getClientCertificate() {
        return clientCertificate;
    }

    /**
     * set clientCertificate
     *
     * @param clientCertificate
     */
    public void setClientCertificate(Boolean clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    /**
     * get 用户访问的ip
     *
     * @return
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * set 用户访问的ip
     *
     * @param endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * get endpoint的port
     *
     * @return
     */
    public String getEndpointPort() {
        return endpointPort;
    }

    /**
     * set endpoint的port
     *
     * @param endpointPort
     */
    public void setEndpointPort(String endpointPort) {
        this.endpointPort = endpointPort;
    }

    /**
     * get endpoint的dashboard port
     *
     * @return
     */
    public String getDashboardPort() {
        return dashboardPort;
    }

    /**
     * set endpoint的dashboard port
     *
     * @param dashboardPort
     */
    public void setDashboardPort(String dashboardPort) {
        this.dashboardPort = dashboardPort;
    }

    /**
     * get deprecated 优先以addonsConfig中的配置为准 &lt;br&gt;用户是否启用集群自定义监控，true 表示开启用，false 表示未开启用
     *
     * @return
     */
    public Boolean getUserMetrics() {
        return userMetrics;
    }

    /**
     * set deprecated 优先以addonsConfig中的配置为准 &lt;br&gt;用户是否启用集群自定义监控，true 表示开启用，false 表示未开启用
     *
     * @param userMetrics
     */
    public void setUserMetrics(Boolean userMetrics) {
        this.userMetrics = userMetrics;
    }

    /**
     * get 集群组件配置信息
     *
     * @return
     */
    public List<AddonConfig> getAddonsConfig() {
        return addonsConfig;
    }

    /**
     * set 集群组件配置信息
     *
     * @param addonsConfig
     */
    public void setAddonsConfig(List<AddonConfig> addonsConfig) {
        this.addonsConfig = addonsConfig;
    }

    /**
     * get 是否开启集群自动升级，true 表示开启，false 表示未开启
     *
     * @return
     */
    public Boolean getAutoUpgrade() {
        return autoUpgrade;
    }

    /**
     * set 是否开启集群自动升级，true 表示开启，false 表示未开启
     *
     * @param autoUpgrade
     */
    public void setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
    }

    /**
     * get 配置集群维护策略
     *
     * @return
     */
    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * set 配置集群维护策略
     *
     * @param maintenanceWindow
     */
    public void setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    /**
     * get 集群升级计划信息, 仅展示最新一条升级计划信息
     *
     * @return
     */
    public UpgradePlan getUpgradePlan() {
        return upgradePlan;
    }

    /**
     * set 集群升级计划信息, 仅展示最新一条升级计划信息
     *
     * @param upgradePlan
     */
    public void setUpgradePlan(UpgradePlan upgradePlan) {
        this.upgradePlan = upgradePlan;
    }

    /**
     * get 控制节点操作进度
     *
     * @return
     */
    public MaintenanceWindow getMasterProgress() {
        return masterProgress;
    }

    /**
     * set 控制节点操作进度
     *
     * @param masterProgress
     */
    public void setMasterProgress(MaintenanceWindow masterProgress) {
        this.masterProgress = masterProgress;
    }


    /**
     * set 集群id
     *
     * @param clusterId
     */
    public Cluster clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public Cluster name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public Cluster description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set kubernetes的版本
     *
     * @param version
     */
    public Cluster version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 集群所在的az
     *
     * @param azs
     */
    public Cluster azs(List<String> azs) {
        this.azs = azs;
        return this;
    }

    /**
     * set 节点组列表
     *
     * @param nodeGroups
     */
    public Cluster nodeGroups(List<NodeGroup> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }

    /**
     * set k8s的cluster的cidr
     *
     * @param clusterCidr
     */
    public Cluster clusterCidr(String clusterCidr) {
        this.clusterCidr = clusterCidr;
        return this;
    }

    /**
     * set 认证信息
     *
     * @param masterAuth
     */
    public Cluster masterAuth(MasterAuth masterAuth) {
        this.masterAuth = masterAuth;
        return this;
    }

    /**
     * set 状态  [pending,running,reconciling（升级时的状态）, deleting, deleted, error]
     *
     * @param clusterState
     */
    public Cluster clusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }

    /**
     * set 状态变更原因
     *
     * @param stateMessage
     */
    public Cluster stateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public Cluster updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public Cluster createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 用户的AccessKey，插件调用open-api时的认证凭证
     *
     * @param accessKey
     */
    public Cluster accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * set basicAuth
     *
     * @param basicAuth
     */
    public Cluster basicAuth(Boolean basicAuth) {
        this.basicAuth = basicAuth;
        return this;
    }

    /**
     * set clientCertificate
     *
     * @param clientCertificate
     */
    public Cluster clientCertificate(Boolean clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }

    /**
     * set 用户访问的ip
     *
     * @param endpoint
     */
    public Cluster endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * set endpoint的port
     *
     * @param endpointPort
     */
    public Cluster endpointPort(String endpointPort) {
        this.endpointPort = endpointPort;
        return this;
    }

    /**
     * set endpoint的dashboard port
     *
     * @param dashboardPort
     */
    public Cluster dashboardPort(String dashboardPort) {
        this.dashboardPort = dashboardPort;
        return this;
    }

    /**
     * set deprecated 优先以addonsConfig中的配置为准 &lt;br&gt;用户是否启用集群自定义监控，true 表示开启用，false 表示未开启用
     *
     * @param userMetrics
     */
    public Cluster userMetrics(Boolean userMetrics) {
        this.userMetrics = userMetrics;
        return this;
    }

    /**
     * set 集群组件配置信息
     *
     * @param addonsConfig
     */
    public Cluster addonsConfig(List<AddonConfig> addonsConfig) {
        this.addonsConfig = addonsConfig;
        return this;
    }

    /**
     * set 是否开启集群自动升级，true 表示开启，false 表示未开启
     *
     * @param autoUpgrade
     */
    public Cluster autoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }

    /**
     * set 配置集群维护策略
     *
     * @param maintenanceWindow
     */
    public Cluster maintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * set 集群升级计划信息, 仅展示最新一条升级计划信息
     *
     * @param upgradePlan
     */
    public Cluster upgradePlan(UpgradePlan upgradePlan) {
        this.upgradePlan = upgradePlan;
        return this;
    }

    /**
     * set 控制节点操作进度
     *
     * @param masterProgress
     */
    public Cluster masterProgress(MaintenanceWindow masterProgress) {
        this.masterProgress = masterProgress;
        return this;
    }


    /**
     * add item to 集群所在的az
     *
     * @param az
     */
    public void addAz(String az) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(az);
    }

    /**
     * add item to 节点组列表
     *
     * @param nodeGroup
     */
    public void addNodeGroup(NodeGroup nodeGroup) {
        if (this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        this.nodeGroups.add(nodeGroup);
    }

    /**
     * add item to 集群组件配置信息
     *
     * @param addonsConfig
     */
    public void addAddonsConfig(AddonConfig addonsConfig) {
        if (this.addonsConfig == null) {
            this.addonsConfig = new ArrayList<>();
        }
        this.addonsConfig.add(addonsConfig);
    }

}