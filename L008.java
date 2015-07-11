package Lection;

import java.io.*;
import java.util.Date;

public class L008 {

    public static void main(String[] args) throws Exception{

        // байтовые потоки
        FileOutputStream stream = new FileOutputStream(new File("text.txt"));

//        DataOutputStream dataOutputStream = new DataOutputStream(stream);  //   1
//
//        dataOutputStream.writeChars("asdasdasdasd");

        OutputStreamWriter  outputStreamWriter = new OutputStreamWriter(stream); // 2
        outputStreamWriter.write("Hello !!!");
        outputStreamWriter.flush();
        outputStreamWriter.close();
//
//        FileInputStream stream1=new FileInputStream("text.txt");
//        InputStreamReader reader = new InputStreamReader(stream1);


        // символьные потоки
        FileReader fileReader = new FileReader("text.txt");
            if(fileReader.ready()){
//            int t=0;
                char[] chars= new char[100];
//            while (( t= fileReader.read() ) != -1){
//                System.out.println("t -- " + t);
//            }

                fileReader.read(chars);
                String s = new String(chars);

            System.out.println("s -- " + s);
        }

        // символьные потоки

//        Writer writer=new StringWriter();
//        writer.write("qweqweqweqwe");


//

        StringWriter stringWriter =new StringWriter();

    }
}
