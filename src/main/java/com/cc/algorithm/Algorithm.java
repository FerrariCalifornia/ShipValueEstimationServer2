package com.cc.algorithm;


import com.cc.pojo.Ship;

import java.util.List;

/**
 * Created by cc on 2017/2/16.
 */
public class Algorithm {



    public List<Ship> predict(List<Ship> shipList ){
        TestSYL testSYL = new TestSYL();
        List<Ship> shipList1 = testSYL.predict(shipList);
        return shipList1;
    }


    public List<Ship> predict2(List<Ship> shipList ){
        TestSYL2 testSYL2 = new TestSYL2();
        List<Ship> shipList1 = testSYL2.predict(shipList);
        return shipList1;
    }
}
