package tr.com.is.dal;

import java.util.List;

import tr.com.is.core.ObjectHelper;
import tr.com.is.interfaces.DalInterface;

public class CustomerDAL <CustomerContract> extends ObjectHelper implements DalInterface<CustomerContract>{

	@Override
	public void Insert(CustomerContract entitiy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerContract> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerContract Delete(CustomerContract entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(CustomerContract entitiy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerContract> GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}