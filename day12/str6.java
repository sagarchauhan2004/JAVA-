package day12;

// str = lassi 
/// ch = fugga
//
public class str6 {
    String fun(String lassi) {
        String g = "";
        int i;
        for (i = 0; i < lassi.length(); i++) {
            char fugga = lassi.charAt(i);
            if (fugga >= 65 && fugga <= 90) {
                fugga = (char) (fugga + 32);
            } else if (fugga >= 97 && fugga <= 122) {
                fugga = (char) (fugga - 32);
            }
            g = g + fugga;
        }
        return g;
    }

    public static void main(String[] args) {
        String lassi = "Ae@llo";
        str6 obj = new str6();
        String ans = obj.fun(lassi);
        System.out.println(ans);
    }
}
