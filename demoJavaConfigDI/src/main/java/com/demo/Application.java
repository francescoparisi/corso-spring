package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);


        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();
    }
}