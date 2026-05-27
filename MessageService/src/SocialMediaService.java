public class SocialMediaService implements MessageService {
    private final String username;

    public SocialMediaService(String username) {
        this.username = username;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Posting to social media account " + username + ": " + message);
    }
}
