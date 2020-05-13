package com.adam.rsbfirst.integration.impl;

import com.adam.rsbfirst.integration.TestIntergration;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestIntegrationImpl
 * @Package com.adam.rsbfirst.integration.impl
 * @Description TODO
 * @Author adam
 * @Date 2020/5/14 00:43
 * @Version 1.0.0
 **/
@Service
public class TestIntegrationImpl implements TestIntergration {
    @Override
    public void testIntegration() {
        System.out.println("TestIntegration~");
    }
}
