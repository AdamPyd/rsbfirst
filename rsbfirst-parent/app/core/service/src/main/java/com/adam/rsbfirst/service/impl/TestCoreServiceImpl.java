package com.adam.rsbfirst.service.impl;

import com.adam.rsbfirst.dao.TestDao;
import com.adam.rsbfirst.integration.TestIntergration;
import com.adam.rsbfirst.model.TestModel;
import com.adam.rsbfirst.service.TestCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestCoreServiceImpl
 * @Package com.adam.rsbfirst.service.impl
 * @Description TODO
 * @Author adam
 * @Date 2020/5/14 00:54
 * @Version 1.0.0
 **/
@Service
public class TestCoreServiceImpl implements TestCoreService {
    @Autowired
    private TestIntergration testIntergration;
    @Autowired
    private TestDao testDao;
    @Override
    public void testCoreService() {
        testDao.testDao();
        testIntergration.testIntegration();
        TestModel testModel = new TestModel();
        testModel.setTestElement("element is a");
        System.out.println("testCoreService,testModel: " + testModel);
    }
}
