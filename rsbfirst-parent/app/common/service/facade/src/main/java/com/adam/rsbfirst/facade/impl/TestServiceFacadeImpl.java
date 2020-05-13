package com.adam.rsbfirst.facade.impl;

import com.adam.rsbfirst.facade.TestServiceFacade;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceFacadeImpl
 * @Package com.adam.rsbfirst.facade.impl
 * @Description TODO
 * @Author adam
 * @Date 2020/5/14 00:45
 * @Version 1.0.0
 **/
@Service
public class TestServiceFacadeImpl implements TestServiceFacade {
    @Override
    public void testServiceFacade() {
        System.out.println("testServiceFacade");
    }
}
