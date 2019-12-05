package test_p36;

import java.io.*;

class test_p36 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test_p35/test1.txt"));

            String str1 = br.readLine();
            String str2 = br.readLine();

            System.out.println("寫入檔案中的兩個字串是");
            System.out.println(str1);
            System.out.println(str2);

            br.close();
        } catch (IOException e) {
            System.out.println("輸出入錯誤");
        }
    }
}