package com.alex.patterntests.usecases.metadatas;

import com.alex.patterntests.domain.core.interfaces.factories.MetadataFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class DocumentMetaImplTest {

    @Autowired
    private MetadataFactory metadataFactory;

    @Test
    void shouldExecuteDocumentWithSucess() {

        var aDocumentImpl = metadataFactory.getMetadata("DOCUMENT");

        Assertions.assertTrue(aDocumentImpl.execute("fake_cnpj_field", "09000000000100"));
    }
}
