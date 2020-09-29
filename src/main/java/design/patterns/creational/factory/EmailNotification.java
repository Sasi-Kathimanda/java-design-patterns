package design.patterns.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sending notification via EMAIL ");
    }
}
