package com.itschool.course;

public class Person {

    private String firtName;

    private String lastName;

    private int age;

    private long cnp;

    public Person(){
    }

    public Person(long cnp, String lastName) {
        this.cnp = cnp;
        this.lastName = lastName;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }
}
