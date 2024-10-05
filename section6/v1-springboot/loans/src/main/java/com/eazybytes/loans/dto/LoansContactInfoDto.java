package com.eazybytes.loans.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "loans")
@Data
public class LoansContactInfoDto {
    String message;
    Map<String, String> contactDetails;
    List<String> onCallSupport;
}
