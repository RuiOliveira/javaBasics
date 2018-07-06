package Basics;

public class ChildClassDemo extends ParentClassDemo  {

    public void engine(){
        System.out.println("New engine");
    }

    public void color(){
        System.out.println(color);
    }

    public static void main(String[] args) {

        ChildClassDemo child = new ChildClassDemo();
        child.color();
        child.brakes();
    }

}
