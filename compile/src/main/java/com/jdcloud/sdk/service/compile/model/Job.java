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

package com.jdcloud.sdk.service.compile.model;


/**
 * job
 */
public class Job  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 构建任务uuid
     */
    private String uuid;

    /**
     * 创建时间戳
     */
    private Integer createdAt;

    /**
     * 最后一次更新时间
     */
    private Integer updatedAt;

    /**
     * 构建名称
     */
    private String name;

    /**
     * 代码存储类型，目前只支持github
     */
    private String codeType;

    /**
     * 代码clone路径
     */
    private String codeRepoUrl;

    /**
     * 代码名称的显示Label
     */
    private String codeRepoUrlLabel;

    /**
     * 分支
     */
    private String codeRepoBranch;

    /**
     * 创建者
     */
    private String createUserName;

    /**
     * 是否是私有仓库
     */
    private Boolean codeRepoPrivate;

    /**
     * 最后一次更细者
     */
    private String createUserPin;

    /**
     * 用户云存储路径，如果为空，使用公用的云存储
     */
    private String ossPath;

    /**
     * 用户云存储主机，实际为用户云存储所在地域
     */
    private String ossHost;

    /**
     * 用户云存储bucket，如果为空，使用公用的云存储
     */
    private String ossBucket;

    /**
     * 编译镜像地址
     */
    private String buildImage;

    /**
     * 编译镜像的显示Label
     */
    private String buildImageLabel;

    /**
     * 是否在页面配置构建方式，这项为true，则buildSetConfig需要有内容，如果这项为false，即使buildSetConfig有内容，也不生效
     */
    private Boolean isUserBuildSetConfig;

    /**
     * 见isUserBuildSetConfig的说明
     */
    private String buildSetConfig;

    /**
     * 超时时间，单位秒
     */
    private Integer buildTimeOut;

    /**
     * cpu分配核数
     */
    private Integer buildResourceCpu;

    /**
     * 内存分配大小，单位MB
     */
    private Integer buildResourceMem;

    /**
     * 通知邮件
     */
    private String noticeMail;

    /**
     * 通知频率， MAIL_FAILED失败时通知，MAIL_EVERY每次构建就通知
     */
    private String noticeType;

    /**
     * 构建类型
     */
    private String compilerType;

    /**
     * 镜像注册表名
     */
    private String dockerRegistry;

    /**
     * 镜像仓库名
     */
    private String dockerRepository;

    /**
     * 注册表的URI
     */
    private String dockerRegistryUri;


    /**
     * get 构建任务uuid
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 构建任务uuid
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get 创建时间戳
     *
     * @return
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    /**
     * set 创建时间戳
     *
     * @param createdAt
     */
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * get 最后一次更新时间
     *
     * @return
     */
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    /**
     * set 最后一次更新时间
     *
     * @param updatedAt
     */
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * get 构建名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 构建名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 代码存储类型，目前只支持github
     *
     * @return
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * set 代码存储类型，目前只支持github
     *
     * @param codeType
     */
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    /**
     * get 代码clone路径
     *
     * @return
     */
    public String getCodeRepoUrl() {
        return codeRepoUrl;
    }

    /**
     * set 代码clone路径
     *
     * @param codeRepoUrl
     */
    public void setCodeRepoUrl(String codeRepoUrl) {
        this.codeRepoUrl = codeRepoUrl;
    }

    /**
     * get 代码名称的显示Label
     *
     * @return
     */
    public String getCodeRepoUrlLabel() {
        return codeRepoUrlLabel;
    }

    /**
     * set 代码名称的显示Label
     *
     * @param codeRepoUrlLabel
     */
    public void setCodeRepoUrlLabel(String codeRepoUrlLabel) {
        this.codeRepoUrlLabel = codeRepoUrlLabel;
    }

    /**
     * get 分支
     *
     * @return
     */
    public String getCodeRepoBranch() {
        return codeRepoBranch;
    }

    /**
     * set 分支
     *
     * @param codeRepoBranch
     */
    public void setCodeRepoBranch(String codeRepoBranch) {
        this.codeRepoBranch = codeRepoBranch;
    }

    /**
     * get 创建者
     *
     * @return
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * set 创建者
     *
     * @param createUserName
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * get 是否是私有仓库
     *
     * @return
     */
    public Boolean getCodeRepoPrivate() {
        return codeRepoPrivate;
    }

    /**
     * set 是否是私有仓库
     *
     * @param codeRepoPrivate
     */
    public void setCodeRepoPrivate(Boolean codeRepoPrivate) {
        this.codeRepoPrivate = codeRepoPrivate;
    }

    /**
     * get 最后一次更细者
     *
     * @return
     */
    public String getCreateUserPin() {
        return createUserPin;
    }

    /**
     * set 最后一次更细者
     *
     * @param createUserPin
     */
    public void setCreateUserPin(String createUserPin) {
        this.createUserPin = createUserPin;
    }

    /**
     * get 用户云存储路径，如果为空，使用公用的云存储
     *
     * @return
     */
    public String getOssPath() {
        return ossPath;
    }

    /**
     * set 用户云存储路径，如果为空，使用公用的云存储
     *
     * @param ossPath
     */
    public void setOssPath(String ossPath) {
        this.ossPath = ossPath;
    }

    /**
     * get 用户云存储主机，实际为用户云存储所在地域
     *
     * @return
     */
    public String getOssHost() {
        return ossHost;
    }

    /**
     * set 用户云存储主机，实际为用户云存储所在地域
     *
     * @param ossHost
     */
    public void setOssHost(String ossHost) {
        this.ossHost = ossHost;
    }

    /**
     * get 用户云存储bucket，如果为空，使用公用的云存储
     *
     * @return
     */
    public String getOssBucket() {
        return ossBucket;
    }

    /**
     * set 用户云存储bucket，如果为空，使用公用的云存储
     *
     * @param ossBucket
     */
    public void setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
    }

    /**
     * get 编译镜像地址
     *
     * @return
     */
    public String getBuildImage() {
        return buildImage;
    }

    /**
     * set 编译镜像地址
     *
     * @param buildImage
     */
    public void setBuildImage(String buildImage) {
        this.buildImage = buildImage;
    }

    /**
     * get 编译镜像的显示Label
     *
     * @return
     */
    public String getBuildImageLabel() {
        return buildImageLabel;
    }

    /**
     * set 编译镜像的显示Label
     *
     * @param buildImageLabel
     */
    public void setBuildImageLabel(String buildImageLabel) {
        this.buildImageLabel = buildImageLabel;
    }

    /**
     * get 是否在页面配置构建方式，这项为true，则buildSetConfig需要有内容，如果这项为false，即使buildSetConfig有内容，也不生效
     *
     * @return
     */
    public Boolean getIsUserBuildSetConfig() {
        return isUserBuildSetConfig;
    }

    /**
     * set 是否在页面配置构建方式，这项为true，则buildSetConfig需要有内容，如果这项为false，即使buildSetConfig有内容，也不生效
     *
     * @param isUserBuildSetConfig
     */
    public void setIsUserBuildSetConfig(Boolean isUserBuildSetConfig) {
        this.isUserBuildSetConfig = isUserBuildSetConfig;
    }

    /**
     * get 见isUserBuildSetConfig的说明
     *
     * @return
     */
    public String getBuildSetConfig() {
        return buildSetConfig;
    }

    /**
     * set 见isUserBuildSetConfig的说明
     *
     * @param buildSetConfig
     */
    public void setBuildSetConfig(String buildSetConfig) {
        this.buildSetConfig = buildSetConfig;
    }

    /**
     * get 超时时间，单位秒
     *
     * @return
     */
    public Integer getBuildTimeOut() {
        return buildTimeOut;
    }

    /**
     * set 超时时间，单位秒
     *
     * @param buildTimeOut
     */
    public void setBuildTimeOut(Integer buildTimeOut) {
        this.buildTimeOut = buildTimeOut;
    }

    /**
     * get cpu分配核数
     *
     * @return
     */
    public Integer getBuildResourceCpu() {
        return buildResourceCpu;
    }

    /**
     * set cpu分配核数
     *
     * @param buildResourceCpu
     */
    public void setBuildResourceCpu(Integer buildResourceCpu) {
        this.buildResourceCpu = buildResourceCpu;
    }

    /**
     * get 内存分配大小，单位MB
     *
     * @return
     */
    public Integer getBuildResourceMem() {
        return buildResourceMem;
    }

    /**
     * set 内存分配大小，单位MB
     *
     * @param buildResourceMem
     */
    public void setBuildResourceMem(Integer buildResourceMem) {
        this.buildResourceMem = buildResourceMem;
    }

    /**
     * get 通知邮件
     *
     * @return
     */
    public String getNoticeMail() {
        return noticeMail;
    }

    /**
     * set 通知邮件
     *
     * @param noticeMail
     */
    public void setNoticeMail(String noticeMail) {
        this.noticeMail = noticeMail;
    }

    /**
     * get 通知频率， MAIL_FAILED失败时通知，MAIL_EVERY每次构建就通知
     *
     * @return
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * set 通知频率， MAIL_FAILED失败时通知，MAIL_EVERY每次构建就通知
     *
     * @param noticeType
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * get 构建类型
     *
     * @return
     */
    public String getCompilerType() {
        return compilerType;
    }

    /**
     * set 构建类型
     *
     * @param compilerType
     */
    public void setCompilerType(String compilerType) {
        this.compilerType = compilerType;
    }

    /**
     * get 镜像注册表名
     *
     * @return
     */
    public String getDockerRegistry() {
        return dockerRegistry;
    }

    /**
     * set 镜像注册表名
     *
     * @param dockerRegistry
     */
    public void setDockerRegistry(String dockerRegistry) {
        this.dockerRegistry = dockerRegistry;
    }

    /**
     * get 镜像仓库名
     *
     * @return
     */
    public String getDockerRepository() {
        return dockerRepository;
    }

    /**
     * set 镜像仓库名
     *
     * @param dockerRepository
     */
    public void setDockerRepository(String dockerRepository) {
        this.dockerRepository = dockerRepository;
    }

    /**
     * get 注册表的URI
     *
     * @return
     */
    public String getDockerRegistryUri() {
        return dockerRegistryUri;
    }

    /**
     * set 注册表的URI
     *
     * @param dockerRegistryUri
     */
    public void setDockerRegistryUri(String dockerRegistryUri) {
        this.dockerRegistryUri = dockerRegistryUri;
    }


    /**
     * set 构建任务uuid
     *
     * @param uuid
     */
    public Job uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 创建时间戳
     *
     * @param createdAt
     */
    public Job createdAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set 最后一次更新时间
     *
     * @param updatedAt
     */
    public Job updatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * set 构建名称
     *
     * @param name
     */
    public Job name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 代码存储类型，目前只支持github
     *
     * @param codeType
     */
    public Job codeType(String codeType) {
        this.codeType = codeType;
        return this;
    }

    /**
     * set 代码clone路径
     *
     * @param codeRepoUrl
     */
    public Job codeRepoUrl(String codeRepoUrl) {
        this.codeRepoUrl = codeRepoUrl;
        return this;
    }

    /**
     * set 代码名称的显示Label
     *
     * @param codeRepoUrlLabel
     */
    public Job codeRepoUrlLabel(String codeRepoUrlLabel) {
        this.codeRepoUrlLabel = codeRepoUrlLabel;
        return this;
    }

    /**
     * set 分支
     *
     * @param codeRepoBranch
     */
    public Job codeRepoBranch(String codeRepoBranch) {
        this.codeRepoBranch = codeRepoBranch;
        return this;
    }

    /**
     * set 创建者
     *
     * @param createUserName
     */
    public Job createUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    /**
     * set 是否是私有仓库
     *
     * @param codeRepoPrivate
     */
    public Job codeRepoPrivate(Boolean codeRepoPrivate) {
        this.codeRepoPrivate = codeRepoPrivate;
        return this;
    }

    /**
     * set 最后一次更细者
     *
     * @param createUserPin
     */
    public Job createUserPin(String createUserPin) {
        this.createUserPin = createUserPin;
        return this;
    }

    /**
     * set 用户云存储路径，如果为空，使用公用的云存储
     *
     * @param ossPath
     */
    public Job ossPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }

    /**
     * set 用户云存储主机，实际为用户云存储所在地域
     *
     * @param ossHost
     */
    public Job ossHost(String ossHost) {
        this.ossHost = ossHost;
        return this;
    }

    /**
     * set 用户云存储bucket，如果为空，使用公用的云存储
     *
     * @param ossBucket
     */
    public Job ossBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }

    /**
     * set 编译镜像地址
     *
     * @param buildImage
     */
    public Job buildImage(String buildImage) {
        this.buildImage = buildImage;
        return this;
    }

    /**
     * set 编译镜像的显示Label
     *
     * @param buildImageLabel
     */
    public Job buildImageLabel(String buildImageLabel) {
        this.buildImageLabel = buildImageLabel;
        return this;
    }

    /**
     * set 是否在页面配置构建方式，这项为true，则buildSetConfig需要有内容，如果这项为false，即使buildSetConfig有内容，也不生效
     *
     * @param isUserBuildSetConfig
     */
    public Job isUserBuildSetConfig(Boolean isUserBuildSetConfig) {
        this.isUserBuildSetConfig = isUserBuildSetConfig;
        return this;
    }

    /**
     * set 见isUserBuildSetConfig的说明
     *
     * @param buildSetConfig
     */
    public Job buildSetConfig(String buildSetConfig) {
        this.buildSetConfig = buildSetConfig;
        return this;
    }

    /**
     * set 超时时间，单位秒
     *
     * @param buildTimeOut
     */
    public Job buildTimeOut(Integer buildTimeOut) {
        this.buildTimeOut = buildTimeOut;
        return this;
    }

    /**
     * set cpu分配核数
     *
     * @param buildResourceCpu
     */
    public Job buildResourceCpu(Integer buildResourceCpu) {
        this.buildResourceCpu = buildResourceCpu;
        return this;
    }

    /**
     * set 内存分配大小，单位MB
     *
     * @param buildResourceMem
     */
    public Job buildResourceMem(Integer buildResourceMem) {
        this.buildResourceMem = buildResourceMem;
        return this;
    }

    /**
     * set 通知邮件
     *
     * @param noticeMail
     */
    public Job noticeMail(String noticeMail) {
        this.noticeMail = noticeMail;
        return this;
    }

    /**
     * set 通知频率， MAIL_FAILED失败时通知，MAIL_EVERY每次构建就通知
     *
     * @param noticeType
     */
    public Job noticeType(String noticeType) {
        this.noticeType = noticeType;
        return this;
    }

    /**
     * set 构建类型
     *
     * @param compilerType
     */
    public Job compilerType(String compilerType) {
        this.compilerType = compilerType;
        return this;
    }

    /**
     * set 镜像注册表名
     *
     * @param dockerRegistry
     */
    public Job dockerRegistry(String dockerRegistry) {
        this.dockerRegistry = dockerRegistry;
        return this;
    }

    /**
     * set 镜像仓库名
     *
     * @param dockerRepository
     */
    public Job dockerRepository(String dockerRepository) {
        this.dockerRepository = dockerRepository;
        return this;
    }

    /**
     * set 注册表的URI
     *
     * @param dockerRegistryUri
     */
    public Job dockerRegistryUri(String dockerRegistryUri) {
        this.dockerRegistryUri = dockerRegistryUri;
        return this;
    }


}