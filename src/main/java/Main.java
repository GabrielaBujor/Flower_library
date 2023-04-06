import java.io.*;
import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        InputDevice i = new InputDevice();
        OutputDevice o = new OutputDevice();

        Application App = new Application(i, o);
        App.run();

        FileInputStream fis = new FileInputStream("file.txt");
        int ch;
        while ((ch = fis.read()) != -1)
            System.out.print((char) ch);
        fis.close();

//        Scanner read = null;
//        FileWriter fileW = null;
//        String text;
//
//        try{
//            read = new Scanner(System.in);
//            fileW = new FileWriter("write.txt");
//            while(true){
//                text = read.nextLine();
//
//                if(text.equals("exit"))
//                {
//                    break;
//                }
//
//                fileW.write(text);
//                fileW.write("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (read != null) {
//                read.close();
//            }
//
//            try{
//                if(fileW != null){
//                    fileW.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}