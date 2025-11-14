package com.jgroup.financemanager.application.dto;

import com.jgroup.financemanager.application.domain.enums.CategoryEnum;
import com.jgroup.financemanager.application.domain.enums.TypeTransactionEnum;
import com.jgroup.financemanager.application.domain.model.User;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransactionDTO {
    private Double value;
    private LocalDate date;
    private TypeTransactionEnum typeTransactionEnum;
    private CategoryEnum categoryEnum;
    private User user;

}
