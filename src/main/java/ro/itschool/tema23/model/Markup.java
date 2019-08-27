package ro.itschool.tema23.model;

import java.util.Objects;

public class Markup {
    private final String markupId;
    private String documentId;
    private final String content;
    private final int position;

    public Markup(String markupId, String documentId, String content, int position) {
        this.markupId = markupId;
        this.documentId = documentId;
        this.content = content;
        this.position = position;
    }

    public String getMarkupId() {
        return markupId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getContent() {
        return content;
    }

    public int getPosition() {
        return position;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Markup markup = (Markup) o;
        return position == markup.position &&
                Objects.equals(markupId, markup.markupId) &&
                Objects.equals(documentId, markup.documentId) &&
                Objects.equals(content, markup.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupId, documentId, content, position);
    }

    @Override
    public String toString() {
        return "Markup{" +
                "markupId='" + markupId + '\'' +
                ", documentId='" + documentId + '\'' +
                ", content='" + content + '\'' +
                ", position=" + position +
                '}';
    }
}
