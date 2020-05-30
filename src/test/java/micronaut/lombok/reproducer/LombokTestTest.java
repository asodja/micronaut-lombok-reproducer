package micronaut.lombok.reproducer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.micronaut.core.beans.BeanIntrospection;
import io.micronaut.core.type.Argument;

public class LombokTestTest {

    @Test
    public void shouldHaveConstructorParameters() throws Exception {
        // Given, When
        Argument<?>[] arguments = BeanIntrospection.getIntrospection(LombokClass.class)
                .getConstructorArguments();

        // Then
        // This fails:
        // arguments[0].getName() returns arg0 but should field1
        // arguments[1].getName() returns arg1 but should field2
        assertEquals("field1", arguments[0].getName());
        assertEquals("field2", arguments[1].getName());
    }

}
