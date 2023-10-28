package com.example.springbootauth0angular.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

@Configuration
public class OAuth2Config {

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        return new ClientRegistrationRepository() {
            @Override
            public ClientRegistration findByRegistrationId(String registrationId) {
                // Define your OAuth2 client registration details here
                // For example, if you are using Google as an identity provider:
                return ClientRegistration.withRegistrationId("okta")
                        .clientId("9vwwBPEklP14FL4knRAvjLzsX0SQdG86")
                        .clientSecret("pEVrKQHK7uKHaZJHT0q5OmXB0-AzT_caW4YQzopFVP2Uc_d_-JFQqAQyBCymY4t2")
                        .authorizationUri("https://dev-mtxbw5kf7kzxzhds.us.auth0.com/authorize")
                        .tokenUri("https://dev-mtxbw5kf7kzxzhds.us.auth0.com/oauth/token")
                        .userInfoUri("https://dev-mtxbw5kf7kzxzhds.us.auth0.com/userinfo")
                        .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                            .redirectUri("http://localhost:4200/login/oauth2/code/okta")
                        .scope("openid", "profile", "email")
                        .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
                        .build();
            }
        };
    }
    @Bean
    public JwtDecoder jwtDecoder() {
        return JwtDecoders.fromIssuerLocation("https://dev-mtxbw5kf7kzxzhds.us.auth0.com/");
    }
}

