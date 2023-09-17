package mapper;

import avro.TempDto;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KeyValueMapper;

import java.util.ArrayList;
import java.util.List;

public class PlanProductRelMapper implements KeyValueMapper<String, List<TempDto>, List<KeyValue<String, TempDto>>> {

    @Override
    public List<KeyValue<String, TempDto>> apply(String key, List<TempDto> tempDtoList) {
        List<KeyValue<String, TempDto>> keyValueList = new ArrayList<>();
        tempDtoList.forEach(tempDto -> {
            keyValueList.add(new KeyValue<>(tempDto.getId().toString(), tempDto));
        });
        return keyValueList;
    }
}
