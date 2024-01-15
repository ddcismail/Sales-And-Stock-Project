package tr.com.is.types;

import java.util.Date;

public class SalesContract {
	private int id;
	private int customerId;
	private int employeeId;
	private int piece;
	private int productId;
	private Date history;

	public int getPersonelId() {
		return employeeId;
	}

	public void setPersonelId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMusteriId() {
		return customerId;
	}

	public void setMusteriId(int customerId) {
		this.customerId = customerId;
	}

	public int getAdet() {
		return piece;
	}

	public void setAdet(int piece) {
		this.piece = piece;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Date getHistory() {
		return history;
	}

	public void setHistory(Date history) {
		this.history = history;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + customerId + " " + employeeId + " " + productId + " " + piece + " " + history;
	}

}