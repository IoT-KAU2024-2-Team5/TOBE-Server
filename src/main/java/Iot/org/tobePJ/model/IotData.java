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
    private Integer led;

    @DynamoDBAttribute(attributeName = "ledUpdatedAt")
    private String ledUpdatedAt;

    @DynamoDBAttribute(attributeName = "pump")
    private Boolean pump;

    @DynamoDBAttribute(attributeName = "pumpUpdatedAt")
    private String pumpUpdatedAt;

    @DynamoDBAttribute(attributeName = "brightness")
    private Integer brightness;

    @DynamoDBAttribute(attributeName = "brightnessUpdatedAt")
    private String brightnessUpdatedAt;

    @DynamoDBAttribute(attributeName = "plantName")
    private String plantName;

    @DynamoDBAttribute(attributeName = "plantNameUpdatedAt")
    private String plantNameUpdatedAt;

    @DynamoDBAttribute(attributeName = "plantName")
    private String plantName;

    @DynamoDBAttribute(attributeName = "plantNameUpdatedAt")
    private String plantNameUpdatedAt;

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

    public Integer getLed() {
        return led;
    }

    public void setLed(Integer led) {
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

    public Integer getBrightness() {
        return brightness;
    }

    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    public String getBrightnessUpdatedAt() {
        return brightnessUpdatedAt;
    }

    public void setBrightnessUpdatedAt(String brightnessUpdatedAt) {
        this.brightnessUpdatedAt = brightnessUpdatedAt;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getPlantNameUpdatedAt() {
        return plantNameUpdatedAt;
    }

    public void setPlantNameUpdatedAt(String plantNameUpdatedAt) {
        this.plantNameUpdatedAt = plantNameUpdatedAt;
    }

}
