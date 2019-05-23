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


/**
 * 控制节点进度
 */
public class MasterProgress  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作类型 upgrade,rollback,downgrade 等
     */
    private String action;

    /**
     * 升级范围, 目前只有三个值：0, 50, 100
     */
    private String progress;


    /**
     * get 操作类型 upgrade,rollback,downgrade 等
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 操作类型 upgrade,rollback,downgrade 等
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 升级范围, 目前只有三个值：0, 50, 100
     *
     * @return
     */
    public String getProgress() {
        return progress;
    }

    /**
     * set 升级范围, 目前只有三个值：0, 50, 100
     *
     * @param progress
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }


    /**
     * set 操作类型 upgrade,rollback,downgrade 等
     *
     * @param action
     */
    public MasterProgress action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 升级范围, 目前只有三个值：0, 50, 100
     *
     * @param progress
     */
    public MasterProgress progress(String progress) {
        this.progress = progress;
        return this;
    }


}