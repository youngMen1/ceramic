package com.ceramic.ceramicrestapi.domain;

import lombok.Data;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/4/3 17:02
 * @description
 **/
@Data
public class UserRequest {

    private String username;

    private String password;

    private String grantType;
}
