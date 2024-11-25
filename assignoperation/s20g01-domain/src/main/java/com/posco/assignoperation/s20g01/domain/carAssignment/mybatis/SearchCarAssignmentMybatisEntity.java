package com.posco.assignoperation.s20g01.domain.carAssignment.mybatis;

import com.posco.assignoperation.s20g01.domain.Period;
import java.util.Date;
import lombok.Data;

@Data
public class SearchCarAssignmentMybatisEntity {

    private Date approvalDate;
    private Date requestDate;
    private Period period;
}
