package com.example.springboot.common;

import lombok.*;

/**
 * Interface to return message class
 * Author: Lenny
 * Date: 2024-11-16 11:00 p.m.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {

    public static final String CODE_SUCCESS = "200";
    public static final String CODE_AUTH_ERROR = "401";
    public static final String CODE_SYS_ERROR = "500";

    /**
     * Request return code  200   401   404  500
     * This request result: success/failure
     */
    private String code;
    /**
     * msg: error details
     */
    private String msg;
    /**
     * data is the output
     * user  Object type: User
     * List  Object type: List
     * Map   Object type: Map
     */
    private Object data;


    public static Result success() {

        return Result.builder().code(CODE_SUCCESS).msg("Request successfully").build();
    }

    public static Result success(Object data) {

        return new Result(CODE_SUCCESS, "Request successfully", data);
    }

    public static Result error(String msg) {

        return new Result(CODE_SYS_ERROR, msg, null);
    }

    public static Result error(String code, String msg) {

        return new Result(code, msg, null);
    }

    public static Result error() {

        return new Result(CODE_SYS_ERROR, "System error", null);
    }

}