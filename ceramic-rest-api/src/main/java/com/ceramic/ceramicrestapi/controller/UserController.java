package com.ceramic.ceramicrestapi.controller;

import com.ceramic.ceramicrestapi.domain.UserRequest;
import com.snow.snowcore.web.SnowRequest;
import com.snow.snowcore.web.SnowResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/4/3 17:00
 * @description
 **/
@Slf4j
@RestController
@RequestMapping(value = "/login/oauth")
@Api(value = "login", tags = "登录API")
public class UserController {

    @PostMapping("/token")
    @ApiOperation(value = "系统登录", notes = "PC系统登录")
    public SnowResponse<Boolean> login(@Validated @RequestBody SnowRequest<UserRequest> userRequest) {

        return SnowResponse.ok(Boolean.TRUE);
    }
}
