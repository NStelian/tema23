package ro.itschool.tema23.controller;

import org.springframework.web.bind.annotation.*;
import ro.itschool.tema23.model.Markup;
import ro.itschool.tema23.service.MarkupService;

import java.util.List;

@RestController
@RequestMapping("/documents/{documentId}/markups")
public class MarkupController {
    private final MarkupService markupService;

    public MarkupController(MarkupService markupService) {
        this.markupService = markupService;
    }

    @GetMapping()
    List<Markup> getMarkups(@PathVariable String documentId) {
        return markupService.getMarkups(documentId);
    }

    @PostMapping()
    Markup addMarkup(@PathVariable String documentId, @RequestBody Markup markup) {
        return markupService.addMarkup(documentId, markup);
    }

    @GetMapping("{markupId}")
    Markup getMarkupById(@PathVariable String documentId, @PathVariable String markupId) {
        return markupService.getMarkupById(documentId, markupId);
    }

    @PutMapping("{markupId}")
    Markup updateMarkup(@PathVariable String documentId, @PathVariable String markupId, @RequestBody Markup markup) {
        return markupService.updateMarkup(documentId, markupId, markup);
    }

    @DeleteMapping("{markupId}")
    Markup deleteMarkup(@PathVariable String documentId, @PathVariable String markupId) {
        return markupService.deleteMarkup(documentId, markupId);
    }

}
