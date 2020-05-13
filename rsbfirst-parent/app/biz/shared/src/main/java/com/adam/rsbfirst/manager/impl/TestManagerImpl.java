package com.adam.rsbfirst.manager.impl;

import com.adam.rsbfirst.manager.TestManager;
import com.adam.rsbfirst.service.TestCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestManagerImpl
 * @Package com.adam.rsbfirst.manager.impl
 * @Description TODO
 * @Author adam
 * @Date 2020/5/14 01:06
 * @Version 1.0.0
 **/
@Service
public class TestManagerImpl implements TestManager {
    @Autowired
    private TestCoreService testCoreService;
    @Override
    public void testManager() {
        testCoreService.testCoreService();
        System.out.println("testManager");
    }
}
