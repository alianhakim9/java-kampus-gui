package id.alian.gui.pertemuan7;

public class TwoStrings {
    synchronized static void print(String str1, String str2) {
        System.out.print(str1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignore) {
        }
        System.out.println(str2);
    }
}