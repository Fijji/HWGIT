package hw11;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class JustForFun {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        read();
        write();

    }

    public static void write() throws IOException, ClassNotFoundException {
        LocalDate today = LocalDate.now();
        FileOutputStream outputStream = new FileOutputStream("C:\\project\\HWGIT\\src\\hw11\\" + today.toString() + ".txt");
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);

        ArrayList<String> ludi = new ArrayList<>();

        for (int i = 0; i < ludi.size(); i++) {
            oos.writeObject(ludi.get(i));
        }
        oos.flush();
        outputStream.close();
        oos.close();

    }

    public static void read() throws IOException, ClassNotFoundException {
        File dir = new File("C:\\project\\HWGIT\\src\\hw11\\");
        ArrayList<String> test = new ArrayList<>();
        for (String path : dir.list()) {
            if (path.contains(".txt")) {

                FileInputStream fis = new FileInputStream("C:\\project\\HWGIT\\src\\hw11\\" + path);
                ObjectInputStream oin = new ObjectInputStream(fis);

                while (fis.available() > 0) {
                    String t = (String) oin.readObject().toString();
                    test.add(t);
                    System.out.println(t);
                }

                String s = path.split("\\.")[0];
                LocalDate specific = LocalDate.now();
                LocalDate x = LocalDate.parse(s);
                if (specific.compareTo(x) >= 3) {
                    byte[] buffer = new byte[1024];
                    FileOutputStream fos = new FileOutputStream("C:\\java_base_1\\kirill\\src\\home\\hwNEW\\IOfun\\MyFile.zip");
                    ZipOutputStream zos = new ZipOutputStream(fos);
                    ZipEntry ze = new ZipEntry(path);
                    zos.putNextEntry(ze);

                    int len;
                    while ((len = oin.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }

                    oin.close();
                    zos.closeEntry();
                    zos.close();

                    System.out.println("Done");
                }
                System.out.println(specific.compareTo(x));
            }
        }
    }
}