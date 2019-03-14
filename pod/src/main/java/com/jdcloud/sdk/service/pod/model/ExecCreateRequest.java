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
 * 原生容器
 * container 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建 exec

 */
public class ExecCreateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 执行的命令
     */
    private List<String> command;

    /**
     * 执行命令是否分配tty。默认不分配
     */
    private Boolean tty;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Pod ID
     * Required:true
     */
    @Required
    private String podId;

    /**
     * container name
     * Required:true
     */
    @Required
    private String containerName;


    /**
     * get 执行的命令
     *
     * @return
     */
    public List<String> getCommand() {
        return command;
    }

    /**
     * set 执行的命令
     *
     * @param command
     */
    public void setCommand(List<String> command) {
        this.command = command;
    }

    /**
     * get 执行命令是否分配tty。默认不分配
     *
     * @return
     */
    public Boolean getTty() {
        return tty;
    }

    /**
     * set 执行命令是否分配tty。默认不分配
     *
     * @param tty
     */
    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get Pod ID
     *
     * @return
     */
    public String getPodId() {
        return podId;
    }

    /**
     * set Pod ID
     *
     * @param podId
     */
    public void setPodId(String podId) {
        this.podId = podId;
    }

    /**
     * get container name
     *
     * @return
     */
    public String getContainerName() {
        return containerName;
    }

    /**
     * set container name
     *
     * @param containerName
     */
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }


    /**
     * set 执行的命令
     *
     * @param command
     */
    public ExecCreateRequest command(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * set 执行命令是否分配tty。默认不分配
     *
     * @param tty
     */
    public ExecCreateRequest tty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ExecCreateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Pod ID
     *
     * @param podId
     */
    public ExecCreateRequest podId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * set container name
     *
     * @param containerName
     */
    public ExecCreateRequest containerName(String containerName) {
        this.containerName = containerName;
        return this;
    }


    /**
     * add item to 执行的命令
     *
     * @param command
     */
    public void addCommand(String command) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(command);
    }

}