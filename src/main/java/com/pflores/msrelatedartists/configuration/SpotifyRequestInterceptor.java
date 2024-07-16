package com.pflores.msrelatedartists.configuration;

import com.pflores.msrelatedartists.service.SpotifyAuthService;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpotifyRequestInterceptor implements RequestInterceptor {

    @Autowired
    private SpotifyAuthService spotifyAuthService;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        String accessToken = spotifyAuthService.getAccessToken();
        requestTemplate.header("Authorization", "Bearer " + accessToken);
    }
}