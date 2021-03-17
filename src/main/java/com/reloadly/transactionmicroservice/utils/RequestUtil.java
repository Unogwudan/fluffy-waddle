package com.reloadly.transactionmicroservice.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Slf4j
public class RequestUtil {

    public static Object getPrincipal() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        log.info("Authentication {}", authentication);

        if (authentication != null) {
           return authentication.getPrincipal();
        }

        return null;
    }
}
