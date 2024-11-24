package Iot.org.tobePJ.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import org.springframework.data.annotation.Id;

@DynamoDBTable(tableName = "iot_project_DB")
public class IotData {

    @Id
    @DynamoDBHashKey(attributeName = "id") // Primary Key
    private String id;

    @DynamoDBAttribute(attributeName = "mode")
    private String mode;

    @DynamoDBAttribute(attributeName = "humidity")
    private Integer humidity;

    @DynamoDBAttribute(attributeName = "humidityUpdatedAt")
    private String humidityUpdatedAt;

    @DynamoDBAttribute(attributeName = "led")
    private Boolean led;

    @DynamoDBAttribute(attributeName = "ledUpdatedAt")
    private String ledUpdatedAt;

    @DynamoDBAttribute(attributeName = "pump")
    private Boolean pump;

    @DynamoDBAttribute(attributeName = "pumpUpdatedAt")
    private String pumpUpdatedAt;

    @DynamoDBAttribute(attributeName = "temperature")
    private Integer temperature;

    @DynamoDBAttribute(attributeName = "temperatureUpdatedAt")
    private String temperatureUpdatedAt;

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public String getHumidityUpdatedAt() {
        return humidityUpdatedAt;
    }

    public void setHumidityUpdatedAt(String humidityUpdatedAt) {
        this.humidityUpdatedAt = humidityUpdatedAt;
    }

    public Boolean getLed() {
        return led;
    }

    public void setLed(Boolean led) {
        this.led = led;
    }

    public String getLedUpdatedAt() {
        return ledUpdatedAt;
    }

    public void setLedUpdatedAt(String ledUpdatedAt) {
        this.ledUpdatedAt = ledUpdatedAt;
    }

    public Boolean getPump() {
        return pump;
    }

    public void setPump(Boolean pump) {
        this.pump = pump;
    }

    public String getPumpUpdatedAt() {
        return pumpUpdatedAt;
    }

    public void setPumpUpdatedAt(String pumpUpdatedAt) {
        this.pumpUpdatedAt = pumpUpdatedAt;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getTemperatureUpdatedAt() {
        return temperatureUpdatedAt;
    }

    public void setTemperatureUpdatedAt(String temperatureUpdatedAt) {
        this.temperatureUpdatedAt = temperatureUpdatedAt;
    }
}
