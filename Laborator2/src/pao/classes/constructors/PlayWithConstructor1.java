package pao.classes.constructors;

class Base{
    Base(){
        System.out.println("Base class constructor called");
    }
}

class Derved extends Base{

    //default constructor also generated by the compiler
    Derved(){
        System.out.println("Derived class constructor called");
    }
}

