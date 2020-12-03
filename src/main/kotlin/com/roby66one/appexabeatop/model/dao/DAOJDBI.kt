package com.roby66one.appexabeatop.model.dao

import org.jdbi.v3.core.Jdbi
import com.roby66one.appexabeatop.model.dao.exception.JdbiOracleBadConfig
import com.roby66one.appexabeatop.model.dao.exception.JdbiPhoenixBadConfig
import org.jdbi.v3.core.kotlin.KotlinPlugin
import org.jdbi.v3.sqlobject.kotlin.KotlinSqlObjectPlugin

object DAOJDBI{
    private var phoenihJdbi : Jdbi? = null
    private var phoenixHost : String? = null
    private var phoenixUser : String? = null
    private var phoenixPasswd : String? = null

    private var oracleJdbi : Jdbi? = null
    private var oracleHost : String? = null
    private var oracleUser : String? = null
    private var oraclePasswd : String? = null
    private var oracleSid : String? = null

    private fun jdbiPhoenixInstance(): Jdbi {
        if (this.phoenixHost == null ){
            throw JdbiPhoenixBadConfig(JdbiPhoenixBadConfig.ERRORHOSTNOTCONFIG)
        }
        val conn = "jdbc:phoenix:" + this.phoenixHost
        Class.forName("org.apache.phoenix.jdbc.PhoenixDriver").newInstance()
        val jdbi = Jdbi.create(conn, this.phoenixUser, this.phoenixPasswd).installPlugins()
        jdbi.installPlugin(KotlinPlugin())
        jdbi.installPlugin(KotlinSqlObjectPlugin())
        return jdbi
    }

    fun jdbiPhoenix(): Jdbi {
        return this.phoenihJdbi ?: jdbiPhoenixInstance()
    }

    private fun jdbiOracleInstance(): Jdbi {
        if (this.oracleHost == null ){
            throw JdbiOracleBadConfig(JdbiOracleBadConfig.ERRORHOSTNOTCONFIG)
        }
        val conn = "jdbc:oracle:thin:@" + this.oracleHost +  ":1521:" +  this.oracleSid
        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance()
        this.oracleJdbi = Jdbi.create(conn, this.oracleUser, this.oraclePasswd).installPlugins()
        this.oracleJdbi?.installPlugin(KotlinPlugin())
        this.oracleJdbi?.installPlugin(KotlinSqlObjectPlugin())
        return this.oracleJdbi!!
    }

    fun jdbiOracle(): Jdbi {
        return this.oracleJdbi ?: jdbiOracleInstance()
    }

    fun initDaoJdbiPhoenix( host : String, user : String, passwd : String) {
        if (this.phoenixHost != null ) {
            throw JdbiPhoenixBadConfig(JdbiPhoenixBadConfig.ERRORCONFIG)
        }

        this.phoenixHost = host
        this.phoenixUser = user
        this.phoenixPasswd = passwd
    }

    fun initDaoJdbiOracle( host : String, oracleSid : String, user : String, passwd : String) {
        if (this.oracleHost != null ) {
            throw JdbiOracleBadConfig(JdbiOracleBadConfig.ERRORCONFIG)
        }

        this.oracleHost = host
        this.oracleSid = oracleSid
        this.oracleUser = user
        this.oraclePasswd = passwd

    }


}