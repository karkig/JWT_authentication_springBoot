package com.practice.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@SpringBootApplication
@ComponentScan("com.practice")
public class SpringPracticeApplication {

    public static void main(String[] args) {
       SpringApplication.run(SpringPracticeApplication.class, args);
       // test();
        //readingFile();
    }
    public static void readingFile()
    {

    }


    public static void test() {
        EmployeeJi a = new EmployeeJi("Kailash", 30000, "IT");
        EmployeeJi b = new EmployeeJi("Hema", 33000, "medical");
        EmployeeJi c = new EmployeeJi("Kuldeep", 30000, "hotel");
        EmployeeJi d = new EmployeeJi("Kailash", 20000, "IT");
        EmployeeJi e = new EmployeeJi("Chandra", 30000, "hotel");
        EmployeeJi f = new EmployeeJi("Kailash", 35340, "medical");
        EmployeeJi g = new EmployeeJi("Rohit", 33000, "IT");
        List<EmployeeJi> employeeJiList = new ArrayList<>();
        employeeJiList.add(a);
        employeeJiList.add(b);
        employeeJiList.add(c);
        employeeJiList.add(d);
        employeeJiList.add(e);
        employeeJiList.add(f);
        employeeJiList.add(g);

		//List<EmployeeJi> collect = employeeJiList.stream().filter(t -> t.getSalary() > 30000).collect(Collectors.toList());
		//collect.stream().forEach(System.out::println);

		Map<String,List<EmployeeJi>> groupDept = employeeJiList.stream().collect(groupingBy(EmployeeJi::getDpt));
        Map<List<String>, List<EmployeeJi>> collect = employeeJiList.stream().collect(groupingBy(gro -> Arrays.asList(gro.getDpt(), gro.getName())));

        groupDept.entrySet().forEach(System.out::println);

        System.out.println("-------------------------");

        //  x.getValue().stream().forEach(System.out::println);
        collect.entrySet().stream().forEach(key->{

            key.getValue().stream().forEach(System.out::println);
            System.out.println("--");
        });


	}
}
