package org.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("morseParser")
public class MorseParser {

    @GetMapping("/{textToParse}")
    public String getMorseValue(@PathVariable("textToParse") String textToParse) {
        textToParse = textToParse.toUpperCase();
        String morseCode = "";
        for (int i = 0; i < textToParse.length(); i++) {
            if (textToParse.charAt(i) == MorseEnum.BLANK_SPACE.textValue) {
                morseCode = morseCode + MorseEnum.BLANK_SPACE.morseRepresentation;
            } else {
                morseCode = morseCode +
                        MorseEnum.findValue(textToParse.charAt(i)).morseRepresentation +
                        MorseEnum.CHAR_SEPARATOR.morseRepresentation;
            }
        }

        return morseCode;

    }
}