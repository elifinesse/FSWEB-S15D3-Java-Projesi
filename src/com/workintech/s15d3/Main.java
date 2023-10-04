package com.workintech.s15d3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


import java.util.Map;

public class Main {
    private static final String Map = null;

    public static void main(String[] args) {
       Employee employee1 = new Employee(1, "logan", "roy");
       Employee employee2 = new Employee(1, "loge", "roy");
       Employee employee3 = new Employee(2, "kendall", "roy");
       Employee employee4 = new Employee(3, "shiv", "roy");
       Employee employee5 = new Employee(4, "roman", "roy");
       Employee employee6 = new Employee(5, "connor", "roy");
       Employee employee7 = new Employee(5, "ewan", "roy");

       List<Employee> allEmployees = new LinkedList<>();
       allEmployees.add(employee1);
       allEmployees.add(employee1);
       allEmployees.add(employee2);
       allEmployees.add(employee3);
       allEmployees.add(employee4);
       allEmployees.add(employee5);
       allEmployees.add(employee6);
       allEmployees.add(employee7);

       System.out.println(allEmployees);

       

       Map<Integer, Employee> nonrepeatMap = new HashMap<>();

       

       List<Employee> repeat = new ArrayList<>();

       Iterator iterator = allEmployees.iterator();
       while(iterator.hasNext()){
            Employee employee = (Employee)iterator.next();
            if(nonrepeatMap.containsKey(employee.getId())){
                repeat.add(employee);
                iterator.remove();
            } else{
                nonrepeatMap.put(employee.getId(), employee);
            }
       }
       System.out.println(repeat);
       System.out.println(nonrepeatMap);
       System.out.println(allEmployees);
    }
}