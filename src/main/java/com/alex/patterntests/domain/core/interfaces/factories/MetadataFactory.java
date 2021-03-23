package com.alex.patterntests.domain.core.interfaces.factories;

import com.alex.patterntests.domain.core.interfaces.MetadataStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MetadataFactory {

    @Autowired
    private ApplicationContext context;

    public MetadataStrategy getMetadata(String metaData) {

        try {
            return context.getBean(MetadataStrategy.class, metaData);
        } catch (Exception ex) {
            throw ex;
        }

    }

}
