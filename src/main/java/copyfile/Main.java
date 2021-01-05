package copyfile;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*        char c;
        System.out.println("Bвeдитe символы,  ' q ' - для выхода . ");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');*/
//        String s = "";
//        do {
//            s = br.readLine();
//            System.out.println(s);
//        } while (!Objects.equals(s, "stop"));

        PrintWriter pw = new PrintWriter(new File("test1.txt"));

        pw.write(1167550);
        pw.flush();

        FileReader fileReader = new FileReader("test1.txt");

        while (fileReader.ready()){
            System.out.print((char)fileReader.read());
        }

    }
}
