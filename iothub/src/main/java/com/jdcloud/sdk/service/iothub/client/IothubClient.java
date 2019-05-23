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
 * JCLOUD IoT Hub API
 * API related to IoT Hub
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.iothub.model.DeployModuleRequest;
import com.jdcloud.sdk.service.iothub.model.DeployModuleResponse;
import com.jdcloud.sdk.service.iothub.client.DeployModuleExecutor;
import com.jdcloud.sdk.service.iothub.model.OmEnrollRequest;
import com.jdcloud.sdk.service.iothub.model.OmEnrollResponse;
import com.jdcloud.sdk.service.iothub.client.OmEnrollExecutor;
import com.jdcloud.sdk.service.iothub.model.DeviceActivateRequest;
import com.jdcloud.sdk.service.iothub.model.DeviceActivateResponse;
import com.jdcloud.sdk.service.iothub.client.DeviceActivateExecutor;
import com.jdcloud.sdk.service.iothub.model.DeleteDeviceRequest;
import com.jdcloud.sdk.service.iothub.model.DeleteDeviceResponse;
import com.jdcloud.sdk.service.iothub.client.DeleteDeviceExecutor;
import com.jdcloud.sdk.service.iothub.model.ModuleEnrollRequest;
import com.jdcloud.sdk.service.iothub.model.ModuleEnrollResponse;
import com.jdcloud.sdk.service.iothub.client.ModuleEnrollExecutor;
import com.jdcloud.sdk.service.iothub.model.DevicesEnrollRequest;
import com.jdcloud.sdk.service.iothub.model.DevicesEnrollResponse;
import com.jdcloud.sdk.service.iothub.client.DevicesEnrollExecutor;
import com.jdcloud.sdk.service.iothub.model.DeviceCommandRequest;
import com.jdcloud.sdk.service.iothub.model.DeviceCommandResponse;
import com.jdcloud.sdk.service.iothub.client.DeviceCommandExecutor;
import com.jdcloud.sdk.service.iothub.model.ModuleStateRequest;
import com.jdcloud.sdk.service.iothub.model.ModuleStateResponse;
import com.jdcloud.sdk.service.iothub.client.ModuleStateExecutor;
import com.jdcloud.sdk.service.iothub.model.CheckDeviceIdRequest;
import com.jdcloud.sdk.service.iothub.model.CheckDeviceIdResponse;
import com.jdcloud.sdk.service.iothub.client.CheckDeviceIdExecutor;
import com.jdcloud.sdk.service.iothub.model.EdgeEnrollRequest;
import com.jdcloud.sdk.service.iothub.model.EdgeEnrollResponse;
import com.jdcloud.sdk.service.iothub.client.EdgeEnrollExecutor;
import com.jdcloud.sdk.service.iothub.model.OmEnrollbyFileRequest;
import com.jdcloud.sdk.service.iothub.model.OmEnrollbyFileResponse;
import com.jdcloud.sdk.service.iothub.client.OmEnrollbyFileExecutor;
import com.jdcloud.sdk.service.iothub.model.QueryDeviceOnlineInfosRequest;
import com.jdcloud.sdk.service.iothub.model.QueryDeviceOnlineInfosResponse;
import com.jdcloud.sdk.service.iothub.client.QueryDeviceOnlineInfosExecutor;
import com.jdcloud.sdk.service.iothub.model.QueryDeviceStatesRequest;
import com.jdcloud.sdk.service.iothub.model.QueryDeviceStatesResponse;
import com.jdcloud.sdk.service.iothub.client.QueryDeviceStatesExecutor;
import com.jdcloud.sdk.service.iothub.model.ModuleEnrollmentRequest;
import com.jdcloud.sdk.service.iothub.model.ModuleEnrollmentResponse;
import com.jdcloud.sdk.service.iothub.client.ModuleEnrollmentExecutor;
import com.jdcloud.sdk.service.iothub.model.DeleteEdgeRequest;
import com.jdcloud.sdk.service.iothub.model.DeleteEdgeResponse;
import com.jdcloud.sdk.service.iothub.client.DeleteEdgeExecutor;
import com.jdcloud.sdk.service.iothub.model.QueryDeviceCommandsRequest;
import com.jdcloud.sdk.service.iothub.model.QueryDeviceCommandsResponse;
import com.jdcloud.sdk.service.iothub.client.QueryDeviceCommandsExecutor;
import com.jdcloud.sdk.service.iothub.model.GetOMPrivateURLRequest;
import com.jdcloud.sdk.service.iothub.model.GetOMPrivateURLResponse;
import com.jdcloud.sdk.service.iothub.client.GetOMPrivateURLExecutor;
import com.jdcloud.sdk.service.iothub.model.DeviceStateRequest;
import com.jdcloud.sdk.service.iothub.model.DeviceStateResponse;
import com.jdcloud.sdk.service.iothub.client.DeviceStateExecutor;
import com.jdcloud.sdk.service.iothub.model.DeleteModuleRequest;
import com.jdcloud.sdk.service.iothub.model.DeleteModuleResponse;
import com.jdcloud.sdk.service.iothub.client.DeleteModuleExecutor;

/**
 * iothubClient
 */
public class IothubClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.1.1";
    public final static String DefaultEndpoint = "iothub.jdcloud-api.com";
    public final static String ServiceName = "iothub";
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

    private IothubClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 计算模块部署
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeployModuleResponse deployModule(DeployModuleRequest request) throws JdcloudSdkException {
        return new DeployModuleExecutor().client(this).execute(request);
    }

    /**
     * 物模型注册接口

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public OmEnrollResponse omEnroll(OmEnrollRequest request) throws JdcloudSdkException {
        return new OmEnrollExecutor().client(this).execute(request);
    }

    /**
     * 激活一个设备，包括Edge、Dragon和普通设备

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeviceActivateResponse deviceActivate(DeviceActivateRequest request) throws JdcloudSdkException {
        return new DeviceActivateExecutor().client(this).execute(request);
    }

    /**
     * 删除设备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws JdcloudSdkException {
        return new DeleteDeviceExecutor().client(this).execute(request);
    }

    /**
     * 计算模块登记
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModuleEnrollResponse moduleEnroll(ModuleEnrollRequest request) throws JdcloudSdkException {
        return new ModuleEnrollExecutor().client(this).execute(request);
    }

    /**
     * 客户用该接口可以批量登记设备

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DevicesEnrollResponse devicesEnroll(DevicesEnrollRequest request) throws JdcloudSdkException {
        return new DevicesEnrollExecutor().client(this).execute(request);
    }

    /**
     * 客户用该接口可以对设备下发命令

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeviceCommandResponse deviceCommand(DeviceCommandRequest request) throws JdcloudSdkException {
        return new DeviceCommandExecutor().client(this).execute(request);
    }

    /**
     * 客户用该接口可以修改模块预期状态

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModuleStateResponse moduleState(ModuleStateRequest request) throws JdcloudSdkException {
        return new ModuleStateExecutor().client(this).execute(request);
    }

    /**
     * 验证DeviceId是否可用

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CheckDeviceIdResponse checkDeviceId(CheckDeviceIdRequest request) throws JdcloudSdkException {
        return new CheckDeviceIdExecutor().client(this).execute(request);
    }

    /**
     * 添加边缘计算设备
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EdgeEnrollResponse edgeEnroll(EdgeEnrollRequest request) throws JdcloudSdkException {
        return new EdgeEnrollExecutor().client(this).execute(request);
    }

    /**
     * 物模型通过文件上传注册接口

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public OmEnrollbyFileResponse omEnrollbyFile(OmEnrollbyFileRequest request) throws JdcloudSdkException {
        return new OmEnrollbyFileExecutor().client(this).execute(request);
    }

    /**
     * 查询设备在线信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryDeviceOnlineInfosResponse queryDeviceOnlineInfos(QueryDeviceOnlineInfosRequest request) throws JdcloudSdkException {
        return new QueryDeviceOnlineInfosExecutor().client(this).execute(request);
    }

    /**
     * 客户用该接口可以查询设备预期状态

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryDeviceStatesResponse queryDeviceStates(QueryDeviceStatesRequest request) throws JdcloudSdkException {
        return new QueryDeviceStatesExecutor().client(this).execute(request);
    }

    /**
     * 客户用该接口可以登记模块

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModuleEnrollmentResponse moduleEnrollment(ModuleEnrollmentRequest request) throws JdcloudSdkException {
        return new ModuleEnrollmentExecutor().client(this).execute(request);
    }

    /**
     * 边缘计算设备删除接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteEdgeResponse deleteEdge(DeleteEdgeRequest request) throws JdcloudSdkException {
        return new DeleteEdgeExecutor().client(this).execute(request);
    }

    /**
     * 客户用该接口可以查询设备命令列表

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryDeviceCommandsResponse queryDeviceCommands(QueryDeviceCommandsRequest request) throws JdcloudSdkException {
        return new QueryDeviceCommandsExecutor().client(this).execute(request);
    }

    /**
     * 获取下载物模型的外链地址

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetOMPrivateURLResponse getOMPrivateURL(GetOMPrivateURLRequest request) throws JdcloudSdkException {
        return new GetOMPrivateURLExecutor().client(this).execute(request);
    }

    /**
     * 客户用该接口可以修改设备预期状态

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeviceStateResponse deviceState(DeviceStateRequest request) throws JdcloudSdkException {
        return new DeviceStateExecutor().client(this).execute(request);
    }

    /**
     * 计算模块删除接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteModuleResponse deleteModule(DeleteModuleRequest request) throws JdcloudSdkException {
        return new DeleteModuleExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public IothubClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private IothubClient iothubClient;

        public DefaultBuilder() {
            iothubClient = new IothubClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            iothubClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            iothubClient.httpRequestConfig = config;
            return this;
        }

        public IothubClient build() throws JdcloudSdkException {

            if (iothubClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                iothubClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (iothubClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("IothubClient build error: jdcloud credentials provider not set");
                }
            }
            if (iothubClient.httpRequestConfig == null) {
                iothubClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (iothubClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("IothubClient build error: http request config not set");
                }
            }
            return iothubClient;
        }

        public Builder environment(Environment environment) {
            iothubClient.environment = environment;
            return this;
        }
    }
}
