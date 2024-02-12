package day12;
//UNICODE

// ASCII  :
// A - 65    a = 97
// B - 66    b = 98

import if_else_program.else_if;

// Z - 90    z = 122

public class str5 {
    public static void main(String[] args) {
        String lassi = "Aello";
        int i;
        for (i = 0; i < lassi.length(); i++) {
            char fugga = lassi.charAt(i);
            if (fugga >= 65 && fugga <= 90) {
                fugga = (char) (fugga + 32);
            } else {
                fugga = (char) (fugga - 32);
            }
            System.out.println(fugga);

        }
    }

}
