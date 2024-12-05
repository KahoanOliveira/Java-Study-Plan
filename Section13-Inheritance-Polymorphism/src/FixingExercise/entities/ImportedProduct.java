package FixingExercise.entities;

import java.text.SimpleDateFormat;

public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" $ ");
        sb.append(String.format("%.2f", totalPrice()));
        sb.append(" (Customs fee: $ ");
        sb.append(String.format("%.2f", customFee));
        sb.append(")");

        return sb.toString();
    }

    public double totalPrice(){
        return getPrice() + customFee;
    }
}
