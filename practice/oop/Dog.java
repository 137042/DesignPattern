package practice.oop;

class Dog extends Canine implements Sayable {

    private void bark(){
        System.out.println("bark");
    }

    public void say() {
        bark();
    }

}