

// класс для запуска

public class StartProg {
    public static void main(String[] args) {
    ScanClass message=new ScanClass();
        String str=message.myScanner();
// test        System.out.println(str);

        System.out.println("переведено: "+Translator.translator(str));
    }

}
