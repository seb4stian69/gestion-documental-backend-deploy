package docdoc.handle.service;

import docdoc.handle.model.DocumentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@CrossOrigin(value = "*")
@RestController
@RequestMapping("document")
public class RestControllerDocument {

    private final DocumentService service;

    @Autowired
    public RestControllerDocument(DocumentService service) {
        this.service = service;
    }

    // Actualizar servicios
    @PutMapping("/update/{id}")
    public Mono<ResponseEntity<DocumentModel>> updateDocument(@PathVariable String id, @RequestBody DocumentModel documentModel) {
        return service.updateDocument(id, documentModel);
    }

}