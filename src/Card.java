public class Card {
    private String type;
    private String color;
    private String value;

    public Card() {
    }

    public Card(String type, String color, String value) {
        this.type = type;
        this.color = color;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + type  + "}" + "{" + color + "}" + "{" + value + "}";
    }
}
