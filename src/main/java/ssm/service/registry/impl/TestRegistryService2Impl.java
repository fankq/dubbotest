package ssm.service.registry.impl;

import org.springframework.stereotype.Service;
import ssm.service.registry.TestRegistryService2;

/**
 * Created by 18510 on 2018/8/10.
 */
@Service("testRegistryService2")
public class TestRegistryService2Impl implements TestRegistryService2 {

    @Override
    public void sayHello2() {
        System.out.println("11111111");
    }
}
