package exercise_1.creational.factory;

public class DocumentFactory {
    public static Document createDocument(String type) {
        if (type.equalsIgnoreCase("pdf")) {
            return new PDFDocument();
        } else if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        }
        return null;
    }
}