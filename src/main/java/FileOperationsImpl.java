import java.io.*;

public class FileOperationsImpl implements FileOperations {

    @Override
    public void writeToFile(String filename, Object obj) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
        }
    }

    @Override
    public Object readFromFile(String filename) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return ois.readObject();
        }
    }
}
