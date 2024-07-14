public record Moneda(double conversion_result) {
    @Override
    public String toString() {
        return " "+conversion_result;
    }
}
