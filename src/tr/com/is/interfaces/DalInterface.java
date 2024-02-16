package tr.com.is.interfaces;

import java.util.List;

public interface DalInterface<T>
{
	//<T> generic interface

	public void Insert (T entitiy);  //veri tabanindan kayit almak icin
	
	public List<T> GetAll();  //verilerilistelemk icin
	
	public T Delete (T entity);  //contract turunde delete
	
	public void Update (T entitiy);
	
	public List<T> GetById(int id);
	
	
}
