package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.service.registry.TestRegistryService;

/**
 * Created by 18510 on 2018/8/10.
 */
@Controller("index")
public class IndexController {
    @Autowired
    private TestRegistryService testRegistryService;

    @RequestMapping("/hello")
    public String index(){
        String name=testRegistryService.sayHello();
        System.out.println(name);
        return "";
    }
}
