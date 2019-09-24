package by.kazak.spring.transportAppWithEnum.core;

import by.kazak.spring.transportAppWithEnum.beans.Terminal;
import by.kazak.spring.transportAppWithEnum.beans.TransportKind;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransportApp {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transportContext.xml");

        Terminal terminal = context.getBean("terminal", Terminal.class);

        terminal.chooseTransport(TransportKind.AIR);
        terminal.chooseTransport(TransportKind.GROUND);
        terminal.chooseTransport(TransportKind.MARINE);
        terminal.chooseTransport(TransportKind.UNDERGROUND);

        context.close();
    }
}
