package Practice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.io.Serializable;
import java.util.Arrays;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({"Name", "Costs"})
public class Shop implements Serializable {

    @XmlAttribute
    public String name;
    public float[] cost;


    @Override
    public String toString() {
        return "Название магазина: " + name + "\nЕго расходы: " + Arrays.toString(cost) + "\n";
    }

    public Shop(String name, float[] cost) {
        this.name = name;
        this.cost = cost;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Costs")
    @JacksonXmlElementWrapper(localName = "Costs")
    public float[] getCost() {
        return cost;
    }

    @JsonProperty("Costs")
    @JacksonXmlElementWrapper(localName = "Costs")
    public void setCost(float[] cost) {
        this.cost = cost;
    }

}
