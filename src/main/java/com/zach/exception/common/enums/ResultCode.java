package com.zach.exception.common.enums;

/**
 * @Classname ResultCode
 * @Description: 异常状态码
 * @Date 2020/5/2 16:20
 * @Created by Zach
 */
public enum ResultCode {
    /*
    成功状态码
     */
    SUCCESS(1, "成功"),

    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID(10001, "参数无效"),
    PARAM_IS_BLANK(10002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
    PARAM_NOT_COMPLETE(10004, "参数缺失"),

    /* 用户错误：20001-29999*/
    USER_NOT_LOGGED_IN(20001, "用户未登录"),
    USER_LOGIN_ERROR(20002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(20003, "账号已被禁用"),
    USER_NOT_EXIST(20004, "用户不存在"),
    USER_HAS_EXISTED(20005, "用户已存在"),
    LOGIN_CREDENTIAL_EXISTED(20006, "凭证已存在"),
    DB_CONN_CONFIG_ERROR(200101, "数据库连接配置有误"),
    DB_CONN_CONFIG_DUP_NAME(200102, "已存在同名数据库连接"),
    DB_CONN_CONFIG_DUP(200103, "已存在相同实例的数据库连接"),

    /* 业务错误：30001-39999 */
    SPECIFIED_QUESTIONED_USER_NOT_EXIST(30001, "业务错误"),
    NAME_EXIST(30002, "名称已存在"),

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),

    /* 数据错误：50001-599999 */
    DATA_NONE(50001, "数据未找到"),
    DATA_IS_WRONG(50002, "数据有误"),
    DATA_ALREADY_EXISTED(50003, "数据已存在"),

    /* 接口错误：60001-69999 */
    INTERFACE_INSIDE_INVOKE_ERROR(60001, "内部系统接口调用异常"),
    INTERFACE_OUTSIDE_INVOKE_ERROR(60002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),
    INTERFACE_METHOD_NOT_SUPPORT(60007, "接口请求类型不支持"),

    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限"),
    RESOURCE_EXISTED(70002, "资源已存在"),
    RESOURCE_NOT_EXISTED(70003, "资源不存在"),
    TOKEN_INVALID(70004, "令牌无效"),
    /*文件类型错误：80001-89999*/
    FILE_FAIL(80001, "文件类型错误"),
    FILE_NOT_FOUND(80104, "文件不存在"),
    IO_EXCEPTION(80105, "IO异常"),
    SQL_EXCEPTION(80108, "sql语句执行异常");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.getCode();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
