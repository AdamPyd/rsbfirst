package com.adam.rsbfirst.dao.impl;

import com.adam.rsbfirst.dao.TestDao;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestDaoImpl
 * @Package com.adam.rsbfirst.dao.impl
 * @Description TODO
 * @Author adam
 * @Date 2020/5/14 00:41
 * @Version 1.0.0
 **/
@Service
public class TestDaoImpl implements TestDao {

    @Override
    public void testDao() {
        System.out.println("testDao~");
    }
}
