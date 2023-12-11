package tr.com.is.types;

import java.util.Date;

public class ProductsContract {

	private int id;
	private String adi;
	private int categoryId;
	private Date date;
	private float price;

	public float getFiyat() {
		return price;
	}

	public void setFiyat(float fiyat) {
		this.price = fiyat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public int getKatagoriId() {
		return categoryId;
	}

	public void setKatagoriId(int katagoriId) {
		this.categoryId = katagoriId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + adi + " " + categoryId + " " + date + " " + price;
	}

}
