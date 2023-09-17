package joiner;

import avro.ProductAttributes;
import avro.TempDto;
import org.apache.kafka.streams.kstream.ValueJoiner;

import java.util.List;

public class ProductPlanAttributesJoiner implements ValueJoiner<TempDto, List<ProductAttributes>, TempDto> {
    @Override
    public TempDto apply(TempDto tempDto, List<ProductAttributes> productAttributes) {
        String quantity = productAttributes.stream()
                .filter(productAttribute -> productAttribute.getKey().toString().equals("Quantity"))
                .map(ProductAttributes::getValue)
                .findFirst()
                .orElse("")
                .toString();
        tempDto.setQuantity(quantity);
        return tempDto;
    }
}
