public class WhatsappService implements MessageService {
    private final String phoneNumber;

    public WhatsappService(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp message to " + phoneNumber + ": " + message);
    }
}
