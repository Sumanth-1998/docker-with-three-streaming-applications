package joiner;

import avro.Product;
import avro.TempDto;
import org.apache.kafka.streams.kstream.ValueJoiner;

public class MappedPlanProductRelProductJoiner implements ValueJoiner<TempDto, Product, TempDto> {
    @Override
    public TempDto apply(TempDto tempDto, Product product) {
        tempDto.setProductName(product.getProductName());
        return tempDto;
    }
}
