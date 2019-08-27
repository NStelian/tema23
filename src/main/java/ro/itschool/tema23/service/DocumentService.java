package ro.itschool.tema23.service;

import org.springframework.stereotype.Service;
import ro.itschool.tema23.model.Document;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

@Service
public class DocumentService {
    private final List<Document> documents = new ArrayList<>();

    public List<Document> getDocuments(String name) {
        return ofNullable(name)
                .map(this::getByName)
                .orElse(documents);
    }

    private List<Document> getByName(String name) {
        return documents.stream()
                .filter(document -> document.getName().equals(name))
                .collect(toList());
    }

    public Document addDocument(Document document) {
        documents.add(document);
        return document;
    }

    public Document getDocumentById(String documentId) {
        return documents.stream()
                .filter(document -> document.getDocumentId().equals(documentId))
                .findFirst()
                .orElse(null);
    }

    public Document updateDocument(String documentId, Document document) {
        final Document existingDocument = getDocumentById(documentId);
        if (existingDocument != null) {
            documents.remove(existingDocument);
            documents.add(document);
            return existingDocument;
        } else {
            return null;
        }
    }

    public Document deleteDocument(String documentId) {
        final Document document = getDocumentById(documentId);
        if (documents.remove(document)) {
            return document;
        } else {
            return null;
        }
    }
}
