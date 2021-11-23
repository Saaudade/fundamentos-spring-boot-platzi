package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyNameDependencyImplementation implements MyNameWithDependency {

    MyName myName;

    public MyNameDependencyImplementation(MyName myName) {
        this.myName = myName;
    }

    @Override
    public void namePrint() {
        String name = "Christian Alberto Tamayo Robayo";
        System.out.println(myName.name(name));
        System.out.println("Por fin lo logré");
    }
}
