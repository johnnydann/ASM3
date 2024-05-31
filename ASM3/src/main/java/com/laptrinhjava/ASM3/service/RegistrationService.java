package com.laptrinhjava.ASM3.service;

import com.laptrinhjava.ASM3.models.Registration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationService {
    private List<Registration> registrations = new ArrayList<>();

    public void register(Registration registration) {
        registrations.add(registration);
    }

    public List<Registration> getAllRegistrations() {
        return registrations;
    }
}
