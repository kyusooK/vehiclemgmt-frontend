package com.posco.assignoperation.s20g01.domain.vehiclePerformance.mybatis;

import com.posco.assignoperation.s20g01.domain.Period;
import java.util.Date;
import lombok.Data;

@Data
public class SearchVehiclePerformanceMybatisEntity {

    private Date registrationDate;
    private Period period;
}
