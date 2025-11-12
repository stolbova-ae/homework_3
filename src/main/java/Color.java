public enum Color {
    WHITE("Белый"), GREY("Серый"), BLACK("Черный"), RED("Красный");

    private final String colorName;

    private Color(String name) {
        this.colorName = name;
    }

    public String getRussianColorName() {
        return colorName;
    }
}
