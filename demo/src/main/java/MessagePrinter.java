import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private MessageService service;

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.service = messageService;
    }


    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
