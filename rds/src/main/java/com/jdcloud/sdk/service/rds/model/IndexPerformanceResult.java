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
 * 性能统计
 * 性能统计相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * indexPerformanceResult
 */
public class IndexPerformanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名
     */
    private String db;

    /**
     * 表名
     */
    private String table;

    /**
     * 索引名
     */
    private String index;

    /**
     * 索引大小，单位KB
     */
    private Integer sizeKB;

    /**
     * 服务器启动以来，累计索引搜索次数
     */
    private Integer userSeeks;

    /**
     * 服务器启动以来，累计表扫描次数
     */
    private Integer userScans;

    /**
     * 服务器启动以来，累计索引更新次数
     */
    private Integer userUpdates;

    /**
     * 最近索引搜索时间，格式为YYYY-MM-DD hh:mm:ss
     */
    private String lastUserSeek;

    /**
     * 最近表扫描时间，格式为YYYY-MM-DD hh:mm:ss
     */
    private String lastUserScan;

    /**
     * 最近索引更新时间，格式为YYYY-MM-DD hh:mm:ss
     */
    private String lastUserUpdate;


    /**
     * get 数据库名
     *
     * @return
     */
    public String getDb() {
        return db;
    }

    /**
     * set 数据库名
     *
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * get 表名
     *
     * @return
     */
    public String getTable() {
        return table;
    }

    /**
     * set 表名
     *
     * @param table
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * get 索引名
     *
     * @return
     */
    public String getIndex() {
        return index;
    }

    /**
     * set 索引名
     *
     * @param index
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * get 索引大小，单位KB
     *
     * @return
     */
    public Integer getSizeKB() {
        return sizeKB;
    }

    /**
     * set 索引大小，单位KB
     *
     * @param sizeKB
     */
    public void setSizeKB(Integer sizeKB) {
        this.sizeKB = sizeKB;
    }

    /**
     * get 服务器启动以来，累计索引搜索次数
     *
     * @return
     */
    public Integer getUserSeeks() {
        return userSeeks;
    }

    /**
     * set 服务器启动以来，累计索引搜索次数
     *
     * @param userSeeks
     */
    public void setUserSeeks(Integer userSeeks) {
        this.userSeeks = userSeeks;
    }

    /**
     * get 服务器启动以来，累计表扫描次数
     *
     * @return
     */
    public Integer getUserScans() {
        return userScans;
    }

    /**
     * set 服务器启动以来，累计表扫描次数
     *
     * @param userScans
     */
    public void setUserScans(Integer userScans) {
        this.userScans = userScans;
    }

    /**
     * get 服务器启动以来，累计索引更新次数
     *
     * @return
     */
    public Integer getUserUpdates() {
        return userUpdates;
    }

    /**
     * set 服务器启动以来，累计索引更新次数
     *
     * @param userUpdates
     */
    public void setUserUpdates(Integer userUpdates) {
        this.userUpdates = userUpdates;
    }

    /**
     * get 最近索引搜索时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @return
     */
    public String getLastUserSeek() {
        return lastUserSeek;
    }

    /**
     * set 最近索引搜索时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param lastUserSeek
     */
    public void setLastUserSeek(String lastUserSeek) {
        this.lastUserSeek = lastUserSeek;
    }

    /**
     * get 最近表扫描时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @return
     */
    public String getLastUserScan() {
        return lastUserScan;
    }

    /**
     * set 最近表扫描时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param lastUserScan
     */
    public void setLastUserScan(String lastUserScan) {
        this.lastUserScan = lastUserScan;
    }

    /**
     * get 最近索引更新时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @return
     */
    public String getLastUserUpdate() {
        return lastUserUpdate;
    }

    /**
     * set 最近索引更新时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param lastUserUpdate
     */
    public void setLastUserUpdate(String lastUserUpdate) {
        this.lastUserUpdate = lastUserUpdate;
    }


    /**
     * set 数据库名
     *
     * @param db
     */
    public IndexPerformanceResult db(String db) {
        this.db = db;
        return this;
    }

    /**
     * set 表名
     *
     * @param table
     */
    public IndexPerformanceResult table(String table) {
        this.table = table;
        return this;
    }

    /**
     * set 索引名
     *
     * @param index
     */
    public IndexPerformanceResult index(String index) {
        this.index = index;
        return this;
    }

    /**
     * set 索引大小，单位KB
     *
     * @param sizeKB
     */
    public IndexPerformanceResult sizeKB(Integer sizeKB) {
        this.sizeKB = sizeKB;
        return this;
    }

    /**
     * set 服务器启动以来，累计索引搜索次数
     *
     * @param userSeeks
     */
    public IndexPerformanceResult userSeeks(Integer userSeeks) {
        this.userSeeks = userSeeks;
        return this;
    }

    /**
     * set 服务器启动以来，累计表扫描次数
     *
     * @param userScans
     */
    public IndexPerformanceResult userScans(Integer userScans) {
        this.userScans = userScans;
        return this;
    }

    /**
     * set 服务器启动以来，累计索引更新次数
     *
     * @param userUpdates
     */
    public IndexPerformanceResult userUpdates(Integer userUpdates) {
        this.userUpdates = userUpdates;
        return this;
    }

    /**
     * set 最近索引搜索时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param lastUserSeek
     */
    public IndexPerformanceResult lastUserSeek(String lastUserSeek) {
        this.lastUserSeek = lastUserSeek;
        return this;
    }

    /**
     * set 最近表扫描时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param lastUserScan
     */
    public IndexPerformanceResult lastUserScan(String lastUserScan) {
        this.lastUserScan = lastUserScan;
        return this;
    }

    /**
     * set 最近索引更新时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param lastUserUpdate
     */
    public IndexPerformanceResult lastUserUpdate(String lastUserUpdate) {
        this.lastUserUpdate = lastUserUpdate;
        return this;
    }


}