package design.patterns.creational.factory;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sending notification via via SMS");
    }
}
