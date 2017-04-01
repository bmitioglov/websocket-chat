package com.mitioglov.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.socket.config.WebSocketMessageBrokerStats;


@Configuration
public class ChatConfig {

    public static class Destinations {
        private Destinations() {
        }

        private static final String LOGIN = "/topic/chat.login";
        private static final String LOGOUT = "/topic/chat.logout";
    }

    private static final int MAX_PROFANITY_LEVEL = 5;

    /*
     * @Bean
     *
     * @Description("Application event multicaster to process events asynchonously"
     * ) public ApplicationEventMulticaster applicationEventMulticaster() {
     * SimpleApplicationEventMulticaster multicaster = new
     * SimpleApplicationEventMulticaster();
     * multicaster.setTaskExecutor(Executors.newFixedThreadPool(10)); return
     * multicaster; }
     */


}


