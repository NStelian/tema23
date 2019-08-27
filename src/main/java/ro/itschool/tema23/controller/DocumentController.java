package ro.itschool.tema23.controller;

import org.springframework.web.bind.annotation.*;
import ro.itschool.tema23.model.Document;
import ro.itschool.tema23.service.DocumentService;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping
    List<Document> getDocuments(@RequestParam(required = false) String name) {
        return documentService.getDocuments(name);
    }

    @PostMapping
    Document addDocument(@RequestBody Document document) {
        return documentService.addDocument(document);
    }

    @GetMapping("{documentId}")
    Document getDocumentById(@PathVariable String documentId) {
        return documentService.getDocumentById(documentId);
    }

    @PutMapping("{documentId}")
    Document updateDocument(@PathVariable String documentId, @RequestBody Document document) {
        return documentService.updateDocument(documentId, document);
    }

    @DeleteMapping("{documentId}")
    Document deleteDocument(@PathVariable String documentId) {
        return documentService.deleteDocument(documentId);
    }
}
