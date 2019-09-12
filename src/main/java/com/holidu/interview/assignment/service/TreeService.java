/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holidu.interview.assignment.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.holidu.interview.assignment.model.Tree;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author oghomwen.aigbedion
 */
@Service
public class TreeService {

    public Map getTrees(double x, double y, double radius) {
        double a = x + radius;
        double b = y + radius;

        Map<String, Integer> treesWithinRadius = new HashMap<>();

        try {
            //Read JSON file
            ObjectMapper om = new ObjectMapper();
            Tree[] trees = om.readValue(getTreeData(), Tree[].class);

            for (Tree tree : trees) {
                if (tree.getX_sp() >= x && tree.getX_sp() <= a && tree.getY_sp() >= y && tree.getY_sp() <= b) {
                    if (treesWithinRadius.get(tree.getSpc_common()) == null) {
                        treesWithinRadius.put(tree.getSpc_common(), 1);
                    } else {
                        treesWithinRadius.put(tree.getSpc_common(), treesWithinRadius.get(tree.getSpc_common()) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Exception : " + e.getMessage());
        }
        return treesWithinRadius;
    }

    private static String getTreeData() {
        StringBuilder treeData = new StringBuilder();
        try {
            String requestURl = "https://data.cityofnewyork.us/resource/nwxe-4ae8.json";
            URL url = new URL(requestURl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String resp;
            while ((resp = in.readLine()) != null) {
                treeData.append(resp);
            }
            in.close();
            connection.disconnect();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return treeData.toString();
    }
}
