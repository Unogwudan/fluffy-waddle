package com.reloadly.transactionmicroservice.helpers;

import com.reloadly.transactionmicroservice.dto.response.TransactionMicroServiceResponse;
import com.reloadly.transactionmicroservice.enums.ResponseCode;
import java.time.LocalDateTime;

public class Helper {

    public static TransactionMicroServiceResponse buildResponse(ResponseCode responseCode, Object data) {
        return TransactionMicroServiceResponse.builder()
                .statusCode(responseCode.getCanonicalCode())
                .statusMessage(responseCode.getDescription())
                .timestamp(LocalDateTime.now().toString())
                .data(data)
                .build();
    }
}
