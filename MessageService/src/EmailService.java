public class EmailService implements MessageService {
    private final String emailAddress;

    public EmailService(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email to " + emailAddress + ": " + message);
    }
}
