package com.alex.patterntests.usecases.types;

import com.alex.patterntests.domain.core.interfaces.factories.TypeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CharTypeImplTest {

    @Autowired
    private TypeFactory typeFactory;

    @Test
    void shouldInstantiateWithSucess() {

        var aCharTypeImpl = typeFactory.getType("CHAR");

        Assertions.assertTrue(aCharTypeImpl.execute("my_fake_field", "Hello there"));
    }

}
