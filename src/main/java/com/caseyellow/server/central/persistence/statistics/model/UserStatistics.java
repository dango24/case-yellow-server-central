package com.caseyellow.server.central.persistence.statistics.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.caseyellow.server.central.domain.analyzer.model.IdentifierDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "cy_user_statistics")
public class UserStatistics {

    @DynamoDBHashKey(attributeName = "user_name")
    private String user;

    @DynamoDBRangeKey(attributeName = "date_timestamp")
    private long timestamp;

    @DynamoDBAttribute(attributeName = "identifier_details")
    private Map<String, IdentifierDetails> identifierDetails;

}
