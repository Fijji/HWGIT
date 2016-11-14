package hw11;

import java.io.*;

public class TryToRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        readandcheck();
        writeAdd("This string will be added");
        rewrite();

    }

    private static void writeAdd(String str) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\project\\HWGIT\\src\\hw11\\test.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            sb.append(str);
            String everything = sb.toString();
            System.out.println(everything);
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\project\\HWGIT\\src\\hw11\\test.txt"));
            bw.write(everything);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void rewrite() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\project\\HWGIT\\src\\hw11\\test.txt"));
        String add = "smtng to add";
        bw.write(add);
        bw.close();
    }

    public static String readandcheck() throws IOException, ClassNotFoundException {
        BufferedReader br;
        try {
            FileReader fileReader = new FileReader("C:\\project\\HWGIT\\src\\hw11\\test.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return null;
        }
        try {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                if (line.contains("pop")) count++;
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
            String everything = sb.toString();
            System.out.println(everything);
            System.out.println("number of times contained pop = " + count);     //11.4


        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("can't close reade");
            }
        }
        return new String("thats all!");
    }
}
