package ro.itschool.tema23.model;

import java.util.Objects;

public class Document {
    private final String documentId;
    private final String name;
    private final String content;
    private final String owner;

    public Document(String documentId, String name, String content, String owner) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
        this.owner = owner;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(documentId, document.documentId) &&
                Objects.equals(name, document.name) &&
                Objects.equals(content, document.content) &&
                Objects.equals(owner, document.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, content, owner);
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
