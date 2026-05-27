public class SmsService implements MessageService  {
    private final String phoneNumber;

    public SmsService(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
