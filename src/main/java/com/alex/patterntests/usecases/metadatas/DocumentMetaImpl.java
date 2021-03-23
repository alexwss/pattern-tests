package com.alex.patterntests.usecases.metadatas;

import com.alex.patterntests.domain.core.interfaces.MetadataStrategy;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component("DOCUMENT")
public class DocumentMetaImpl implements MetadataStrategy {

    private static final Integer CPF_SIZE = 11;
    private static final Integer CNPJ_SIZE = 14;

    @Override
    public boolean execute(String field, String content) {

        if (Objects.isNull(content)) {
            return false;
        }

        if( content.length() == CPF_SIZE
            || content.length() == CNPJ_SIZE) {
            return true;
        }

        throw new RuntimeException(String.format("Field %s isn't match with CPF/CNPJ", field));
    }
}
