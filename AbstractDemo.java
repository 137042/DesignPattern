
public class AbstractDemo{


    public static void main(String[] args) {
        Animal a = null;
        Dog baduki = new Dog();
        Cat nabi = new Cat();

        a = baduki; a.say();
        a = nabi; a.say();

        Animal c1 = new Animal(); //Compile Error!
        Animal c2 = new Cat();
        Cat c3 = new Animal(); //Compile Error!
        Cat c4 = new Cat();

        Animal d1 = new Canine(); //Compile Error!
        Animal d2 = new Dog();
        Canine d3 = new Dog();
        Canine d4 = new Canine(); //Compile Error!
        Dog d5 = new Canine(); //Compile Error!
        Dog d6 = new Dog();

    }
}


abstract class Animal{
    private String name;
    abstract public void say();
}

class Cat extends Animal{
    private void meow(){
        System.out.println("meow");
    }
    public void say(){
        meow();
    }
}

abstract class Canine extends Animal{
    protected boolean likeBones;
}

class Dog extends Canine{
    private void bark(){
        System.out.println("bark");
    }
    public void say(){
        bark();
    }
}