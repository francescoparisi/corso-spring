package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SpellCheckerConfig.class)
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( new SpellChecker() );
    }

    /*@Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }*/
}

//per prova spostare il bean in un altro Config e usare @Import