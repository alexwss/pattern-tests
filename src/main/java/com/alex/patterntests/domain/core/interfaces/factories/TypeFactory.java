package com.alex.patterntests.domain.core.interfaces.factories;

import com.alex.patterntests.domain.core.interfaces.TypeStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TypeFactory {

    @Autowired
    private ApplicationContext context;

    public TypeStrategy getType(String type) {

        try {

            return (TypeStrategy) context.getBean(type);
        } catch (Exception ex) {
            throw ex;
        }

    }

}
