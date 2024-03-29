
//특수문자(아스키코드)

//!@#$%^&*(\'"<>?:;
public class basic21 {
    public static void main(String[] args) {
        char[] characters = {
            (char) 33,  // !     exclamation point
            (char) 64,  // @     at sign
            (char) 35,  // #     number sign
            (char) 36,  // $     dollar sign
            (char) 37,  // %     percent sign 
            (char) 94,  // ^     caret
            (char) 38,  // &     ampersand
            (char) 42,  // *     asterisk
            (char) 40,  // (     parenthesis
            (char) 92,  // \     backslash
            (char) 39,  // '     apostrophe
            (char) 34,  // "     double quotation
            (char) 60,  // <     less-than sign
            (char) 62,  // >     greater-than sign
            (char) 63,  // ?     question mark
            (char) 58,  // :     colon
            (char) 59   // ;     semicolon
    };


        StringBuilder sb = new StringBuilder();
        for (char c : characters) {
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}

   


