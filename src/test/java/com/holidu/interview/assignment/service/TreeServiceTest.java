/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holidu.interview.assignment.service;

import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oghomwen.aigbedion
 */
public class TreeServiceTest {

    public TreeServiceTest() {
    }

    /**
     * Test of getTrees method, of class TreeService.
     */
    @Test
    public void testGetTrees() {
        System.out.println("getTrees");
        double x = 1043105.317;
        double y = 206180.8675;
        double radius = 10000;
        TreeService instance = new TreeService();
        int expResult = 3;
        Map result = instance.getTrees(x, y, radius);
        assertEquals(expResult, result.size());
    }

}
