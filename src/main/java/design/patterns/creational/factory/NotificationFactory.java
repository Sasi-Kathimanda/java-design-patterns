package design.patterns.creational.factory;

public class NotificationFactory {

    public Notification getNotification(NotificationType notificationType) {
        Notification notification = null;
        if(NotificationType.EMAIL.equals(notificationType)) {
            notification = new EmailNotification();
        } else if(NotificationType.SMS.equals(notificationType)) {
            notification =  new SMSNotification();
        } else if(NotificationType.PUSH.equals(notificationType)) {
            notification = new PushNotification();
        }
        return notification;
    }
}
