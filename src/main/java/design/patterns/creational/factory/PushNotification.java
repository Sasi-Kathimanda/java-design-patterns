package design.patterns.creational.factory;

public class PushNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sending notification via via PUSH");
    }
}
