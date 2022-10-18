package practice.oop;

class Cat extends Animal implements Sayable {

    private void meow(){
        System.out.println("meow");
    }

    public void say(){
        meow();
    }

}