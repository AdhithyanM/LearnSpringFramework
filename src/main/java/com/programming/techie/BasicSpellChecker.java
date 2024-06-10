package com.programming.techie;

import org.springframework.stereotype.Component;

@Component
class BasicSpellChecker implements SpellChecker {

    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking Spelling using Basic Spell Checker..");
            System.out.println("Checking spelling...");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }
}
