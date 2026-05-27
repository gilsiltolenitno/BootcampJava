import java.util.List;
import java.util.ArrayList;

public class MessageDispatcher {
    private final List<MessageService> services;

    public MessageDispatcher() {
        this.services = new ArrayList<>();
    }

    public MessageDispatcher(List<MessageService>  services) {
        this.services = services;
    }

    public void addService(MessageService service) {
        services.add(service);
    }
    public void sendToAll   (String message) {
        for (MessageService service : services) {
          try {
                service.sendMessage(message);
            } catch (Exception e) {
                System.err.println("Failed to send message via " + service.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
    }
}
