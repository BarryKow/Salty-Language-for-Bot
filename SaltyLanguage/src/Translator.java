
// класс переводчик

public class Translator {

    final static char [] VOWEL_LETTERS={'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};

 public static String translator (String str) {
        String result="";
        int count=0;
        for (int i=0; i<str.length(); i++){
            count=result.length();
            for (int j=0;j<VOWEL_LETTERS.length;j++){

                if(str.charAt(i)==VOWEL_LETTERS[j]){
                result+=str.charAt(i)+"c"+str.charAt(i);

                }
            }
            if(count==result.length()) result+=str.charAt(i);
        }
        return result;
    }


}
