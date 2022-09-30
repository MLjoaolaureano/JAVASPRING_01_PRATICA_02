package org.example;

public enum MorseEnum {
    A('A',".-"),
    B('B',"-..."),
    C('C',"-.-."),
    D('D',"-.."),
    E('E',"."),
    F('F',"..-."),
    G('G',"--."),
    H('H',"...."),
    I('I',".."),
    J('J',".---"),
    K('K',"-.-"),
    L('L',".-.."),
    M('M',"--"),
    N('N',"-."),
    O('O',"---"),
    P('P',".--."),
    Q('Q',"--.-"),
    R('R',".-."),
    S('S',"..."),
    T('T',"-"),
    U('U',"..-"),
    V('V',"...-"),
    W('W',".--"),
    X('X',"-..-"),
    Y('Y',"-.--"),
    Z('Z',"--.."),
    ZERO('0', "-----"),
    ONE('1', ".----"),
    TWO('2', "..---"),
    THREE('3', "...--"),
    FOUR('4', "....-"),
    FIVE('5', "....."),
    SIX('6', "-...."),
    SEVEN('7', "--..."),
    EIGHT('8', "---.."),
    NINE('9', "----."),
    BLANK_SPACE(' ',"   "),
    CHAR_SEPARATOR(' ', " ");

    public final char textValue;
    public final String morseRepresentation;

    MorseEnum(char textValue, String morseRepresentation){
        this.textValue = textValue;
        this.morseRepresentation = morseRepresentation;
    }

    static MorseEnum findValue(char valueToFind){
        for(MorseEnum me:MorseEnum.values()){
            if(me.textValue == valueToFind)
                return me;
        }
        return null;
    }
}
