package com.alex.patterntests.entrypoint;

import com.alex.patterntests.domain.core.interfaces.factories.TypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/test")
@RestController
public class FieldValidatorController {

    @Autowired
    private TypeFactory typeFactory;

    @GetMapping
    public ResponseEntity<?> validateField(@RequestParam("field") String field,
                                           @RequestParam("type") String type,
                                           @RequestParam("content") String content) {

        var strategy = this.typeFactory.getType(type);

        var result = strategy.execute(field, content);

        return ResponseEntity.ok(result);
    }

}
