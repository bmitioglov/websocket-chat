package com.mitioglov.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;


/**
 * Created by Boris Mitioglov on 17/04/2017.
 */
public class LoginLogoutEventListener {

    @EventListener
    private void handleSessionConnected(SessionConnectEvent event) {
        SimpMessageHeaderAccessor headers = SimpMessageHeaderAccessor.wrap(event.getMessage());
        String username = headers.getUser().getName();
        System.out.println("[Test] Username = " + username);
    }

    @EventListener
    private void handleSessionDisconnect(SessionDisconnectEvent event) {
        System.out.println("[Test] Event = " + event);
    }
}
