package com.programming.techie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {
//        EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);

        emailClient.sendEmail("Hey, " +
                "This is my first email message.");
        emailClient.sendEmail("Hey, " +
                "This is my second email message.");

        // Bean Scopes
        AdvancedSpellChecker advancedSpellChecker1 = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellChecker1);
        AdvancedSpellChecker advancedSpellChecker2 = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellChecker2);

        ((AnnotationConfigApplicationContext) applicationContext).registerShutdownHook();

    }
}
