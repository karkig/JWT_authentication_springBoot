package com.practice.springpractice;

public class EmployeeJi {
    String name;
    int salary;
    String dpt;

    public EmployeeJi(String name, int salary, String dpt) {
        this.name = name;
        this.salary = salary;
        this.dpt = dpt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    @Override
    public String toString() {
        return "EmployeeJi{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dpt='" + dpt + '\'' +
                '}';
    }
}
