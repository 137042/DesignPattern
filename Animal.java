abstract class Animal{
    protected String name;
    abstract public void say();
}

class Cat extends Animal implements Sayable{
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

class Dog extends Canine implements Sayable{
    private void bark(){
        System.out.println("bark");
    }
    public void say() {
        bark();
    }
}

class Robot implements Sayable{
    private void printOut(){
        System.out.println("pout");
    }
    public void say(){
        printOut();
    }
}
