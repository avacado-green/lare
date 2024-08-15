import java.io.IOException;

public interface FileOperations {
    void writeToFile(String filename, Object obj) throws IOException;
    Object readFromFile(String filename) throws IOException, ClassNotFoundException;
}
