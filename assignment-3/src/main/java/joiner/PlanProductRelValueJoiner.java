package joiner;

import avro.Plan;
import avro.PlanProductRel;
import avro.TempDto;
import org.apache.kafka.streams.kstream.ValueJoiner;

import java.util.ArrayList;
import java.util.List;

public class PlanProductRelValueJoiner implements ValueJoiner<Plan, List<PlanProductRel>, List<TempDto>> {
    @Override
    public List<TempDto> apply(Plan plan, List<PlanProductRel> planProductRelList) {
        List<TempDto> tempDtoList = new ArrayList<>();
        planProductRelList.forEach(planProductRel -> {
            TempDto tempDtoNew = new TempDto();
            tempDtoNew.setId(planProductRel.getProductId());
            tempDtoNew.setPlanName(plan.getPlanName());
            tempDtoList.add(tempDtoNew);
        });
        return tempDtoList;
    }
}
