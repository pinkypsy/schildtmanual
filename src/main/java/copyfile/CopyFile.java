package copyfile;

import java.io.*;
public class CopyFile {

        public static void main(String[] args) throws IOException {
        String filePath1 = "test.txt";
        String filePath2 = "test2.txt";

        try (FileInputStream fileReader = new FileInputStream(filePath1);
             FileOutputStream fileOutputStream = new FileOutputStream((filePath2))) {
            int dataBit;
            do {
                dataBit = fileReader.read();
                if (dataBit != -1){
                    fileOutputStream.write(dataBit);
                }
            }while (dataBit != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
