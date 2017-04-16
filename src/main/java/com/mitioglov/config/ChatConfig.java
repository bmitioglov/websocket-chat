package com.mitioglov.config;

import org.springframework.context.annotation.Configuration;


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


