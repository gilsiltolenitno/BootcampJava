import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MessageService sms = new SmsService("+1234567890");
        MessageService email = new EmailService("user@example.com");
        MessageService social = new SocialMediaService("john_doe");
        MessageService whatsapp = new WhatsappService("+1234567890");


        MessageDispatcher dispatcher = new MessageDispatcher(Arrays.asList(sms, email, social, whatsapp));
        String mensagem = "Promoção: 50% de desconto nos ingressos hoje! Aproveite e garanta o seu lugar." ;

        dispatcher.sendToAll(mensagem);

        MessageDispatcher seletor = new MessageDispatcher();
        seletor.addService(new EmailService("user@example.com"));
        seletor.addService(new WhatsappService("+1234567890"));
        seletor.sendToAll("Oferta exclusiva para clientes VIP: desconto adicional de 10%.");
    }
}
