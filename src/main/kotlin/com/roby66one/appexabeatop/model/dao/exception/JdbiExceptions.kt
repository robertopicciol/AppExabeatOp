package com.roby66one.appexabeatop.model.dao.exception

class JdbiPhoenixBadConfig (message:String): Exception(message) {
    companion object{
        const val ERRORCONFIG = "Phoenix Jdbi just config"
        const val ERRORHOSTNOTCONFIG = "Phoenix host is not configured"
    }
}

class JdbiOracleBadConfig (message:String): Exception(message) {
    companion object{
        const val ERRORCONFIG = "Oracle Jdbi just config"
        const val ERRORHOSTNOTCONFIG = "Oracle host is not configured"
    }
}
