package designpatterns.old.creationalpatterns.singletonpattern;

/**
 * @author: java
 * @date: 4:52 PM 6/15/16
 * @version: 1.0
 * @description:
 */


public class SingletonPatternDemo {

    public static void main(String[] args) {
        NotThreadSafeLzaySingleton notThreadSafeLzaySingleton = NotThreadSafeLzaySingleton.getInstance();
        notThreadSafeLzaySingleton.show();

        ThreadSafeLazySingleton threadSafeLazySingleton = ThreadSafeLazySingleton.getInstance();
        threadSafeLazySingleton.show();

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.show();
    }
}
