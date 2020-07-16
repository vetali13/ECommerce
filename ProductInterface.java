package domain;

import java.util.Date;

public interface ProductInterface {
	
	public abstract String getName();
	
	public abstract void setName(String name);
	
	public abstract Money getPrice();
	
	public abstract void setPrice(Money price);
	
	public abstract Integer getQuantity();
	
	public abstract void setQuantity(Integer quantity);
	
	public abstract Date getExpiration();
	
	public abstract void setExpiration(Date expiration);
	
	public abstract String getManufactured();
	
	public abstract void setManufactured(String manufactured);
	
	public abstract Category getCategory();
	
	public abstract void setCategory(Category category);
	
	
}
