
interface MessageSender {
    void sendMessage(String message);
}


class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


class NotificationService {

    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void alertUser(String message) {
        sender.sendMessage(message);
    }
}


public class Main3 {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        NotificationService emailService = new NotificationService(email);
        emailService.alertUser("Meeting starts at 10 AM.");

        MessageSender sms = new SMSSender();
        NotificationService smsService = new NotificationService(sms);
        smsService.alertUser("Your OTP is 123456.");
    }
}
