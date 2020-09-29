package design.patterns.creational.factory;

public class NotificationFactoryDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        factory.getNotification(NotificationType.EMAIL).sendNotification();
        factory.getNotification(NotificationType.SMS).sendNotification();
        factory.getNotification(NotificationType.PUSH).sendNotification();
    }
}
