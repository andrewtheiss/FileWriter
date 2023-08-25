public class FileWriter {
    public void write(String message) {
        System.out.println("Writing to file: " + message);
    }

    public String read(String fileName) {
        System.out.println("Reading from file: " + fileName);
        return "Hello World";
    }
}
