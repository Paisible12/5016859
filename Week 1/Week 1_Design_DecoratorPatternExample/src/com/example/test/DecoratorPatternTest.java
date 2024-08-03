package com.example.test;

import com.example.decorator.EmailNotifier;
import com.example.decorator.Notifier;
import com.example.decorator.SMSNotifierDecorator;
import com.example.decorator.SlackNotifierDecorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        slackNotifier.send("Hello, World!");
    }
}

