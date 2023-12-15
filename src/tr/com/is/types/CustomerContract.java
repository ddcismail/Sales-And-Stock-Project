package tr.com.is.types;

public class CustomerContract {
 
 private int id;
 private String nameLastName;
 private String phone;
 private String address;
 private String cityId;

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getAdSoyad() {
  return nameLastName;
 }

 public void setAdSoyad(String nameLastName) {
  this.nameLastName = nameLastName;
 }

 public String getTelefon() {
  return phone;
 }

 public void setTelefon(String phone) {
  this.phone = phone;
 }

 public String getAdres() {
  return address;
 }

 public void setAdres(String address) {
  this.address = address;
 }

 public String getSehirId() {
  return cityId;
 }

 public void setSehirId(String cityId) {
  this.cityId = cityId;
 }

 @Override
 public String toString() {
  // TODO Auto-generated method stub
  return id + " " + nameLastName + " " + cityId + " " + address + " " + phone;
 }

}