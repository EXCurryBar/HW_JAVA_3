package test_p35;

import java.io.*;

class test_p35 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test_p35/test1.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            pw.println("Hello!");
            pw.println("GoodBye!");

            pw.close();
            System.out.println("已經寫入檔案了");
        } catch (IOException e) {
            System.out.println("輸出入錯誤");
        }
    }
}