//package com.example.springbootauth0angular.config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.JwtDecoders;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//
//@Configuration
//public class OAuth2Config {
//
//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository() {
//        return new ClientRegistrationRepository() {
//            @Override
//            public ClientRegistration findByRegistrationId(String registrationId) {
//                // Define your OAuth2 client registration details here
//                // For example, if you are using Google as an identity provider:
//                return CommonOAuth2Provider.GOOGLE.getBuilder(registrationId)
//                        .clientId("9vwwBPEklP14FL4knRAvjLzsX0SQdG86")
//                        .clientSecret("pEVrKQHK7uKHaZJHT0q5OmXB0-AzT_caW4YQzopFVP2Uc_d_-JFQqAQyBCymY4t2")
//                        .scope("openid", "profile", "email")
//                        .build();
//            }
//        };
//    }
//    @Bean
//    public JwtDecoder jwtDecoder() {
//        return JwtDecoders.fromIssuerLocation("https://dev-mtxbw5kf7kzxzhds.us.auth0.com/");
//    }
//}
//
