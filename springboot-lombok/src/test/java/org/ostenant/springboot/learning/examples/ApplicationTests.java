package org.ostenant.springboot.learning.examples;

import org.junit.Test;
import org.ostenant.springboot.learning.examples.entities.ConstructorExample;
import org.ostenant.springboot.learning.examples.entities.GetterSetterExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationTests {

    private static Logger LOGGER = LoggerFactory.getLogger(ApplicationTests.class);

    @Test
    public void testGetterSetter() throws Exception {
        GetterSetterExample example = new GetterSetterExample();
        LOGGER.info("example: {}", example);
        example.setAge(20);
        example.setName("David");
        LOGGER.info("example: {}", example);
    }

    @Test
    public void testConstructor() throws Exception {
        ConstructorExample example = new ConstructorExample(1, "David", 20);
        LOGGER.info("example: {}", example);
    }


}
