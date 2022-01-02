import java.util.Locale;

public class XAndO {
public static void main (String[] args){
    System.out.println(XO("zzoo"));

}

public static boolean XO(String a){

    a=a.toLowerCase(Locale.ROOT);

    if(a.contains("x") && a.contains("o") || !(a.contains("x") && a.contains("o"))){
        int countX = 0;
        int countO = 0;
        char[] charArray = a.toCharArray();
        for (int i =0; i<a.length();i++){
            if(charArray[i]=='x'){
                countX++;
            }
            else if(charArray[i]=='o'){
                countO++;
            }
        }
        if(countX == countO){
            return true;
        }

    }
    return false;
}
}
