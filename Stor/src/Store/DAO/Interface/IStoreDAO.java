package Store.DAO.Interface;

import java.util.ArrayList;

import Store.Domain.StoreModel;

public interface IStoreDAO<T extends StoreModel> {

	public T getById(int id);

	public void edit(T model);

	public void delete(T model);

	public void insert(T model);

	public ArrayList<T> getAll();

}
