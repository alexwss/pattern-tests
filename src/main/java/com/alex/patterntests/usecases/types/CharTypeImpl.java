package com.alex.patterntests.usecases.types;

import com.alex.patterntests.domain.core.interfaces.TypeStrategy;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component("CHAR")
public class CharTypeImpl implements TypeStrategy {

    private static final Integer MAX_LENGTH = 15;

    @Override
    public boolean execute(String field, String content) {

        if (Objects.isNull(content)){
            return false;
        }

        if (content.length() < MAX_LENGTH) {
            return true;
        }

        throw new RuntimeException(String.format("Field %s is invalid, content doesn't match with max size=%d.",
                field, MAX_LENGTH));
    }

}
