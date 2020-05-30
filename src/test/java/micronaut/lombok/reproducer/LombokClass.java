package micronaut.lombok.reproducer;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;

@Introspected
@AllArgsConstructor
public class LombokClass {

    private String field1;
    private String field2;

}