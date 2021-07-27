package entities;

public class ImportedProduct extends ProductTagName{
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	@Override
	public String priceTag() {
		return getName()
				+ " $ " 
				+ String.format("%.2f", getPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")"
				+ " Total - $ "
				+ String.format("%.2f",totalPrice());
		
	}
}
