package practice.oop;

public class Main {

    public static void main(String[] args) {
        Dog baduki = new Dog();
        Cat nabi = new Cat();
        Robot robo = new Robot();

        Animal aref = null;
        Sayable sref = null;
        Canine cref = null;

        aref = baduki; aref.say();
        aref = nabi; aref.say();
//        aref = robo; aref.say();  //Type mismatch


        sref = baduki; sref.say();
        sref = nabi; sref.say();
        sref = robo; sref.say();

        cref = baduki; cref.say();
//        cref = nabi; cref.say();  //Type mismatch
//        cref = robo; cref.say();  //Type mismatch


        X Obj = new X(); double result;
        Obj.methodA(20);
        Obj.methodA(20, 30);
        result = Obj.methodA(5.5);
        System.out.println("Answer is:" + result);
    }

}