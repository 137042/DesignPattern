package practice.oop;

class X {

    void methodA(int num) {
        System.out.println ("methodA:" + num);
    }

    void methodA(int num1, int num2) {
        System.out.println ("methodA:" + num1 + "," + num2);
    }

    double methodA(double num) {
        System.out.println("methodA:" + num);
        return num;
    }

    public void methodA() { //Base class method
        System.out.println ("hello, I'm methodA of class X");
    }

}
