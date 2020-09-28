package design.patterns.creational.singleton;

public class SingletonClientDemo {
    public static void main(String[] args) {
        SingletonObject singletonObject =  SingletonObject.getInstance();
        System.out.println("singletonObject = " + singletonObject);
    }
}
