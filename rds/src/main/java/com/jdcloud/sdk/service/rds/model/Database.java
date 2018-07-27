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

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;

/**
 * database
 */
public class Database  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 数据库状态 building：创建中， running：运行中
     */
    private String dbStatus;

    /**
     * 字符集名称,mysql字符集包括：utf8；SQL Server字符集包括：Chinese_PRC_CI_AS、Chinese_PRC_CS_AS、SQL_Latin1_General_CP1_CI_AS、SQL_Latin1_General_CP1_CS_AS、Chinese_PRC_BIN
     */
    private String characterSetName;

    /**
     * 该数据库相关账户权限列表
     */
    private List<DBAccessPrivilege> accessPrivilege;


    /**
     * get 数据库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 数据库状态 building：创建中， running：运行中
     *
     * @return
     */
    public String getDbStatus() {
        return dbStatus;
    }

    /**
     * set 数据库状态 building：创建中， running：运行中
     *
     * @param dbStatus
     */
    public void setDbStatus(String dbStatus) {
        this.dbStatus = dbStatus;
    }

    /**
     * get 字符集名称,mysql字符集包括：utf8；SQL Server字符集包括：Chinese_PRC_CI_AS、Chinese_PRC_CS_AS、SQL_Latin1_General_CP1_CI_AS、SQL_Latin1_General_CP1_CS_AS、Chinese_PRC_BIN
     *
     * @return
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * set 字符集名称,mysql字符集包括：utf8；SQL Server字符集包括：Chinese_PRC_CI_AS、Chinese_PRC_CS_AS、SQL_Latin1_General_CP1_CI_AS、SQL_Latin1_General_CP1_CS_AS、Chinese_PRC_BIN
     *
     * @param characterSetName
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * get 该数据库相关账户权限列表
     *
     * @return
     */
    public List<DBAccessPrivilege> getAccessPrivilege() {
        return accessPrivilege;
    }

    /**
     * set 该数据库相关账户权限列表
     *
     * @param accessPrivilege
     */
    public void setAccessPrivilege(List<DBAccessPrivilege> accessPrivilege) {
        this.accessPrivilege = accessPrivilege;
    }


    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public Database dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 数据库状态 building：创建中， running：运行中
     *
     * @param dbStatus
     */
    public Database dbStatus(String dbStatus) {
        this.dbStatus = dbStatus;
        return this;
    }

    /**
     * set 字符集名称,mysql字符集包括：utf8；SQL Server字符集包括：Chinese_PRC_CI_AS、Chinese_PRC_CS_AS、SQL_Latin1_General_CP1_CI_AS、SQL_Latin1_General_CP1_CS_AS、Chinese_PRC_BIN
     *
     * @param characterSetName
     */
    public Database characterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * set 该数据库相关账户权限列表
     *
     * @param accessPrivilege
     */
    public Database accessPrivilege(List<DBAccessPrivilege> accessPrivilege) {
        this.accessPrivilege = accessPrivilege;
        return this;
    }


    /**
     * add item to 该数据库相关账户权限列表
     *
     * @param accessPrivilege
     */
    public void addAccessPrivilege(DBAccessPrivilege accessPrivilege) {
        if (this.accessPrivilege == null) {
            this.accessPrivilege = new ArrayList<>();
        }
        this.accessPrivilege.add(accessPrivilege);
    }

}