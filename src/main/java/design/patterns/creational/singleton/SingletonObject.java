package design.patterns.creational.singleton;

public class SingletonObject {

    private static  volatile SingletonObject instance ;  //declaring volatile drastically reduces the calls to synchronized block

    //prevents the callers of the class initiating the object using new operator
    private SingletonObject() {

    }
    public static SingletonObject getInstance() {
        if(instance == null) {
            synchronized (SingletonObject.class) {
                // second check to ensure any other thread has created the object already
                if(instance == null) {
                    instance = new SingletonObject();
                }
            }
        }
        return instance;
    }

}
