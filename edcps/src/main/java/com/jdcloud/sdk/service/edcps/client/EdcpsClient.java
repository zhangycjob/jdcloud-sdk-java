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
 * 分布式云物理服务器
 * 分布式云物理服务器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.edcps.model.ModifyInstanceRequest;
import com.jdcloud.sdk.service.edcps.model.ModifyInstanceResponse;
import com.jdcloud.sdk.service.edcps.client.ModifyInstanceExecutor;
import com.jdcloud.sdk.service.edcps.model.DisassociateElasticIpRequest;
import com.jdcloud.sdk.service.edcps.model.DisassociateElasticIpResponse;
import com.jdcloud.sdk.service.edcps.client.DisassociateElasticIpExecutor;
import com.jdcloud.sdk.service.edcps.model.CreateKeypairsRequest;
import com.jdcloud.sdk.service.edcps.model.CreateKeypairsResponse;
import com.jdcloud.sdk.service.edcps.client.CreateKeypairsExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeVpcsRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeVpcsResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeVpcsExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeVpcRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeVpcResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeVpcExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeInstancesRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeInstancesResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeInstancesExecutor;
import com.jdcloud.sdk.service.edcps.model.ModifySubnetRequest;
import com.jdcloud.sdk.service.edcps.model.ModifySubnetResponse;
import com.jdcloud.sdk.service.edcps.client.ModifySubnetExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeElasticIpsRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeElasticIpsResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeElasticIpsExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeOSRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeOSResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeOSExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeInstanceStatusRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeInstanceStatusResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeInstanceStatusExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeDeviceTypesRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeDeviceTypesResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeDeviceTypesExecutor;
import com.jdcloud.sdk.service.edcps.model.ModifyElasticIpBandwidthRequest;
import com.jdcloud.sdk.service.edcps.model.ModifyElasticIpBandwidthResponse;
import com.jdcloud.sdk.service.edcps.client.ModifyElasticIpBandwidthExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeInstanceRaidRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeInstanceRaidResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeInstanceRaidExecutor;
import com.jdcloud.sdk.service.edcps.model.RestartInstanceRequest;
import com.jdcloud.sdk.service.edcps.model.RestartInstanceResponse;
import com.jdcloud.sdk.service.edcps.client.RestartInstanceExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeSubnetsRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeSubnetsResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeSubnetsExecutor;
import com.jdcloud.sdk.service.edcps.model.DeleteVpcRequest;
import com.jdcloud.sdk.service.edcps.model.DeleteVpcResponse;
import com.jdcloud.sdk.service.edcps.client.DeleteVpcExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeElasticIpStockRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeElasticIpStockResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeElasticIpStockExecutor;
import com.jdcloud.sdk.service.edcps.model.ImportKeypairsRequest;
import com.jdcloud.sdk.service.edcps.model.ImportKeypairsResponse;
import com.jdcloud.sdk.service.edcps.client.ImportKeypairsExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeSubnetRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeSubnetResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeSubnetExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeLineTypesRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeLineTypesResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeLineTypesExecutor;
import com.jdcloud.sdk.service.edcps.model.StartInstanceRequest;
import com.jdcloud.sdk.service.edcps.model.StartInstanceResponse;
import com.jdcloud.sdk.service.edcps.client.StartInstanceExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeKeypairsRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeKeypairsResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeKeypairsExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeKeypairRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeKeypairResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeKeypairExecutor;
import com.jdcloud.sdk.service.edcps.model.AssociateElasticIpRequest;
import com.jdcloud.sdk.service.edcps.model.AssociateElasticIpResponse;
import com.jdcloud.sdk.service.edcps.client.AssociateElasticIpExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeDeviceStockRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeDeviceStockResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeDeviceStockExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeInstanceResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeInstanceExecutor;
import com.jdcloud.sdk.service.edcps.model.CreateInstancesRequest;
import com.jdcloud.sdk.service.edcps.model.CreateInstancesResponse;
import com.jdcloud.sdk.service.edcps.client.CreateInstancesExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeAvailablePrivateIpRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeAvailablePrivateIpResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeAvailablePrivateIpExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeInstanceNameRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeInstanceNameResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeInstanceNameExecutor;
import com.jdcloud.sdk.service.edcps.model.ResetPasswordRequest;
import com.jdcloud.sdk.service.edcps.model.ResetPasswordResponse;
import com.jdcloud.sdk.service.edcps.client.ResetPasswordExecutor;
import com.jdcloud.sdk.service.edcps.model.CreateSubnetRequest;
import com.jdcloud.sdk.service.edcps.model.CreateSubnetResponse;
import com.jdcloud.sdk.service.edcps.client.CreateSubnetExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeElasticIpRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeElasticIpResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeElasticIpExecutor;
import com.jdcloud.sdk.service.edcps.model.DeleteKeypairsRequest;
import com.jdcloud.sdk.service.edcps.model.DeleteKeypairsResponse;
import com.jdcloud.sdk.service.edcps.client.DeleteKeypairsExecutor;
import com.jdcloud.sdk.service.edcps.model.ModifyVpcRequest;
import com.jdcloud.sdk.service.edcps.model.ModifyVpcResponse;
import com.jdcloud.sdk.service.edcps.client.ModifyVpcExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeDeviceRaidsRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeDeviceRaidsResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeDeviceRaidsExecutor;
import com.jdcloud.sdk.service.edcps.model.CreateVpcRequest;
import com.jdcloud.sdk.service.edcps.model.CreateVpcResponse;
import com.jdcloud.sdk.service.edcps.client.CreateVpcExecutor;
import com.jdcloud.sdk.service.edcps.model.ReinstallInstanceRequest;
import com.jdcloud.sdk.service.edcps.model.ReinstallInstanceResponse;
import com.jdcloud.sdk.service.edcps.client.ReinstallInstanceExecutor;
import com.jdcloud.sdk.service.edcps.model.DeleteSubnetRequest;
import com.jdcloud.sdk.service.edcps.model.DeleteSubnetResponse;
import com.jdcloud.sdk.service.edcps.client.DeleteSubnetExecutor;
import com.jdcloud.sdk.service.edcps.model.StopInstanceRequest;
import com.jdcloud.sdk.service.edcps.model.StopInstanceResponse;
import com.jdcloud.sdk.service.edcps.client.StopInstanceExecutor;
import com.jdcloud.sdk.service.edcps.model.ApplyElasticIpsRequest;
import com.jdcloud.sdk.service.edcps.model.ApplyElasticIpsResponse;
import com.jdcloud.sdk.service.edcps.client.ApplyElasticIpsExecutor;
import com.jdcloud.sdk.service.edcps.model.DescribeEdCPSRegionsRequest;
import com.jdcloud.sdk.service.edcps.model.DescribeEdCPSRegionsResponse;
import com.jdcloud.sdk.service.edcps.client.DescribeEdCPSRegionsExecutor;

/**
 * edcpsClient
 */
public class EdcpsClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.0";
    public final static String DefaultEndpoint = "edcps.jdcloud-api.com";
    public final static String ServiceName = "edcps";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private EdcpsClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 修改分布式云物理服务器部分信息，包括名称、描述
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws JdcloudSdkException {
        return new ModifyInstanceExecutor().client(this).execute(request);
    }

    /**
     * 解绑弹性公网IP

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateElasticIpResponse disassociateElasticIp(DisassociateElasticIpRequest request) throws JdcloudSdkException {
        return new DisassociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 创建密钥对
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateKeypairsResponse createKeypairs(CreateKeypairsRequest request) throws JdcloudSdkException {
        return new CreateKeypairsExecutor().client(this).execute(request);
    }

    /**
     * 查询私有网络列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) throws JdcloudSdkException {
        return new DescribeVpcsExecutor().client(this).execute(request);
    }

    /**
     * 查询私有网络详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeVpcResponse describeVpc(DescribeVpcRequest request) throws JdcloudSdkException {
        return new DescribeVpcExecutor().client(this).execute(request);
    }

    /**
     * 批量查询分布式云物理服务器详细信息&lt;br/&gt;
支持分页查询，默认每页20条&lt;br/&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws JdcloudSdkException {
        return new DescribeInstancesExecutor().client(this).execute(request);
    }

    /**
     * 修改子网
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifySubnetResponse modifySubnet(ModifySubnetRequest request) throws JdcloudSdkException {
        return new ModifySubnetExecutor().client(this).execute(request);
    }

    /**
     * 查询弹性公网IP列表&lt;br/&gt;
支持分页查询，默认每页20条&lt;br/&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeElasticIpsResponse describeElasticIps(DescribeElasticIpsRequest request) throws JdcloudSdkException {
        return new DescribeElasticIpsExecutor().client(this).execute(request);
    }

    /**
     * 查询分布式云物理服务器支持的操作系统
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeOSResponse describeOS(DescribeOSRequest request) throws JdcloudSdkException {
        return new DescribeOSExecutor().client(this).execute(request);
    }

    /**
     * 查询单个分布式云物理服务器硬件监控信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceStatusResponse describeInstanceStatus(DescribeInstanceStatusRequest request) throws JdcloudSdkException {
        return new DescribeInstanceStatusExecutor().client(this).execute(request);
    }

    /**
     * 查询分布式云物理服务器实例类型
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeviceTypesResponse describeDeviceTypes(DescribeDeviceTypesRequest request) throws JdcloudSdkException {
        return new DescribeDeviceTypesExecutor().client(this).execute(request);
    }

    /**
     * 修改弹性公网IP带宽

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyElasticIpBandwidthResponse modifyElasticIpBandwidth(ModifyElasticIpBandwidthRequest request) throws JdcloudSdkException {
        return new ModifyElasticIpBandwidthExecutor().client(this).execute(request);
    }

    /**
     * 查询单个分布式云物理服务器已安装的RAID信息，包括系统盘RAID信息和数据盘RAID信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceRaidResponse describeInstanceRaid(DescribeInstanceRaidRequest request) throws JdcloudSdkException {
        return new DescribeInstanceRaidExecutor().client(this).execute(request);
    }

    /**
     * 重启单台分布式云物理服务器，只能重启running状态的服务器 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws JdcloudSdkException {
        return new RestartInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询子网列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSubnetsResponse describeSubnets(DescribeSubnetsRequest request) throws JdcloudSdkException {
        return new DescribeSubnetsExecutor().client(this).execute(request);
    }

    /**
     * 删除私有网络

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) throws JdcloudSdkException {
        return new DeleteVpcExecutor().client(this).execute(request);
    }

    /**
     * 查询弹性公网IP库存
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeElasticIpStockResponse describeElasticIpStock(DescribeElasticIpStockRequest request) throws JdcloudSdkException {
        return new DescribeElasticIpStockExecutor().client(this).execute(request);
    }

    /**
     * 导入密钥对
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ImportKeypairsResponse importKeypairs(ImportKeypairsRequest request) throws JdcloudSdkException {
        return new ImportKeypairsExecutor().client(this).execute(request);
    }

    /**
     * 查询子网详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSubnetResponse describeSubnet(DescribeSubnetRequest request) throws JdcloudSdkException {
        return new DescribeSubnetExecutor().client(this).execute(request);
    }

    /**
     * 查询链路类型列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLineTypesResponse describeLineTypes(DescribeLineTypesRequest request) throws JdcloudSdkException {
        return new DescribeLineTypesExecutor().client(this).execute(request);
    }

    /**
     * 对单台分布式云物理服务器执行开机操作，只能启动stopped状态的服务器
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws JdcloudSdkException {
        return new StartInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询密钥对列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeKeypairsResponse describeKeypairs(DescribeKeypairsRequest request) throws JdcloudSdkException {
        return new DescribeKeypairsExecutor().client(this).execute(request);
    }

    /**
     * 查询密钥对详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeKeypairResponse describeKeypair(DescribeKeypairRequest request) throws JdcloudSdkException {
        return new DescribeKeypairExecutor().client(this).execute(request);
    }

    /**
     * 绑定弹性公网IP

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateElasticIpResponse associateElasticIp(AssociateElasticIpRequest request) throws JdcloudSdkException {
        return new AssociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 查询分布式云物理服务器库存
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeviceStockResponse describeDeviceStock(DescribeDeviceStockRequest request) throws JdcloudSdkException {
        return new DescribeDeviceStockExecutor().client(this).execute(request);
    }

    /**
     * 查询单台分布式云物理服务器详细信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws JdcloudSdkException {
        return new DescribeInstanceExecutor().client(this).execute(request);
    }

    /**
     * 创建一台或多台指定配置的分布式云物理服务器&lt;br/&gt;
- 地域与可用区&lt;br/&gt;
  - 调用接口（queryEdCPSRegions）获取分布式云物理服务器支持的地域与可用区&lt;br/&gt;
- 实例类型&lt;br/&gt;
  - 调用接口（describeDeviceTypes）获取物理实例类型列表&lt;br/&gt;
  - 不能使用已下线、或已售馨的实例类型&lt;br/&gt;
- 操作系统&lt;br/&gt;
  - 可调用接口（describeOS）获取分布式云物理服务器支持的操作系统列表&lt;br/&gt;
- 存储&lt;br/&gt;
  - 数据盘多种RAID可选，可调用接口（describeDeviceRaids）获取服务器支持的RAID列表&lt;br/&gt;
- 网络&lt;br/&gt;
  - 网络类型目前支持vpc&lt;br/&gt;
  - 线路目前支持联通un、电信ct、移动cm&lt;br/&gt;
  - 支持不启用外网，如果启用外网，带宽范围[1,200] 单位Mbps&lt;br/&gt;
- 其他&lt;br/&gt;
  - 购买时长，可按年或月购买：月取值范围[1,9], 年取值范围[1,3]&lt;br/&gt;
  - 密码设置参考公共参数规范&lt;br/&gt;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstancesResponse createInstances(CreateInstancesRequest request) throws JdcloudSdkException {
        return new CreateInstancesExecutor().client(this).execute(request);
    }

    /**
     * 查询可用的私有IP列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAvailablePrivateIpResponse describeAvailablePrivateIp(DescribeAvailablePrivateIpRequest request) throws JdcloudSdkException {
        return new DescribeAvailablePrivateIpExecutor().client(this).execute(request);
    }

    /**
     * 查询分布式云物理服务器名称
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceNameResponse describeInstanceName(DescribeInstanceNameRequest request) throws JdcloudSdkException {
        return new DescribeInstanceNameExecutor().client(this).execute(request);
    }

    /**
     * 重置分布式云物理服务器密码

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) throws JdcloudSdkException {
        return new ResetPasswordExecutor().client(this).execute(request);
    }

    /**
     * 创建子网
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) throws JdcloudSdkException {
        return new CreateSubnetExecutor().client(this).execute(request);
    }

    /**
     * 查询弹性公网IP详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeElasticIpResponse describeElasticIp(DescribeElasticIpRequest request) throws JdcloudSdkException {
        return new DescribeElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 删除密钥对
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteKeypairsResponse deleteKeypairs(DeleteKeypairsRequest request) throws JdcloudSdkException {
        return new DeleteKeypairsExecutor().client(this).execute(request);
    }

    /**
     * 修改私有网络

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyVpcResponse modifyVpc(ModifyVpcRequest request) throws JdcloudSdkException {
        return new ModifyVpcExecutor().client(this).execute(request);
    }

    /**
     * 查询某种实例类型的分布式云物理服务器支持的RAID类型，可查询系统盘RAID类型和数据盘RAID类型
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeviceRaidsResponse describeDeviceRaids(DescribeDeviceRaidsRequest request) throws JdcloudSdkException {
        return new DescribeDeviceRaidsExecutor().client(this).execute(request);
    }

    /**
     * 创建私有网络
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) throws JdcloudSdkException {
        return new CreateVpcExecutor().client(this).execute(request);
    }

    /**
     * 重装分布式云物理服务器，只能重装stopped状态的服务器&lt;br/&gt;
- 可调用接口（describeOS）获取分布式云物理服务器支持的操作系统列表
 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ReinstallInstanceResponse reinstallInstance(ReinstallInstanceRequest request) throws JdcloudSdkException {
        return new ReinstallInstanceExecutor().client(this).execute(request);
    }

    /**
     * 删除子网
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) throws JdcloudSdkException {
        return new DeleteSubnetExecutor().client(this).execute(request);
    }

    /**
     * 对单台分布式云物理服务器执行关机操作，只能停止running状态的服务器 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws JdcloudSdkException {
        return new StopInstanceExecutor().client(this).execute(request);
    }

    /**
     * 申请弹性公网IP

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ApplyElasticIpsResponse applyElasticIps(ApplyElasticIpsRequest request) throws JdcloudSdkException {
        return new ApplyElasticIpsExecutor().client(this).execute(request);
    }

    /**
     * 查询分布式分布式云物理服务器地域列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeEdCPSRegionsResponse describeEdCPSRegions(DescribeEdCPSRegionsRequest request) throws JdcloudSdkException {
        return new DescribeEdCPSRegionsExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public EdcpsClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private EdcpsClient edcpsClient;

        public DefaultBuilder() {
            edcpsClient = new EdcpsClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            edcpsClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            edcpsClient.httpRequestConfig = config;
            return this;
        }

        public EdcpsClient build() throws JdcloudSdkException {

            if (edcpsClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                edcpsClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (edcpsClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("EdcpsClient build error: jdcloud credentials provider not set");
                }
            }
            if (edcpsClient.httpRequestConfig == null) {
                edcpsClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (edcpsClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("EdcpsClient build error: http request config not set");
                }
            }
            return edcpsClient;
        }

        public Builder environment(Environment environment) {
            edcpsClient.environment = environment;
            return this;
        }
    }
}
