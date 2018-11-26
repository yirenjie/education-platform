package com.little.edu.appweb.modules.smallapp.service;

import com.little.edu.appweb.common.utils.R;
import com.little.edu.appweb.modules.smallapp.reqBean.AppLogin;

/**
 * 登录相关的接口
 */
public interface SmallLoginService {

    /**
     * 小程序的登录逻辑
     * @param req
     * @return
     */
    R appLogin(AppLogin req);


}
