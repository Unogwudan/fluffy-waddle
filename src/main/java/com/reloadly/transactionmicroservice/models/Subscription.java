package com.reloadly.transactionmicroservice.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.reloadly.transactionmicroservice.enums.SubscriptionStatus;
import com.reloadly.transactionmicroservice.enums.SubscriptionType;
import com.reloadly.transactionmicroservice.enums.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Builder
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction")
public class Subscription extends BaseModel<Subscription> {
    @NotNull
    private Long accountId;

    @NotNull
    private String referenceNumber;

    @NotNull
    private BigDecimal amount;

    @NotNull
    private SubscriptionStatus status;

    @NotNull
    private SubscriptionType type;
}
