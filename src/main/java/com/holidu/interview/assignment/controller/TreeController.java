/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holidu.interview.assignment.controller;

import com.holidu.interview.assignment.service.TreeService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author oghomwen.aigbedion
 */
@RestController
public class TreeController {

    @Autowired
    private TreeService treeService;

    @RequestMapping(value = "/{x}/{y}/{radius}", method = RequestMethod.GET)
    public Map getTrees(@PathVariable("x") double x, @PathVariable("y") double y, @PathVariable("radius") double radius) {
        return treeService.getTrees(x, y, radius);
    }

}
