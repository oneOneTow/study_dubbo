package com.vens.dubbo.provider;

import com.vens.dubbo.service.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/9/21
 */
@Service("dubboService")
public class DubboServiceImpl implements DubboService {
    public String sayHello(String name) {
        return "good afternoon "+name;
    }
}
