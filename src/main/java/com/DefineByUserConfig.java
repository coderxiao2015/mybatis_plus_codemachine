package com;

/**
 * @author coderxiao
 * @date [2020-06-28]
 * 代码机相关配置自定义项
 */
public class DefineByUserConfig {


    /**
     * 数据库相关
     */
    //host+port+dbname  eg:localhost:3306/ars
    public static final String DB_URL="localhost:3306/ares";
    public static final String DB_USER_NAME="root";
    public static final String DB_PASSWORD="xiaoyi";
    //需要生成的表
    public static final String[] DB_TABLE_NAMES= { "pt_user" };


    /**
     * Java代码相关
     */
    //业务模块包名
    public static final String J_MODULE="auth";


    /**
     * mapper xml代码相关
     */

    //策略





    /**
     * freemarker 代码相关
     */





    /**
     * 必填项校验
     */
    static{

    }

}
