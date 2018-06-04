package Store.DAO.Interface;

import Store.Domain.Article;
import Store.Domain.Category;

public interface ICategoryDAO extends IStoreDAO<Category> {

	public static final String SQL_FIND_ALL = "select * from " + Category.TABLE_NAME;

	public static final String SQL_FIND_BY_ID = SQL_FIND_ALL + " WHERE " + Category.ID_COLUMN + " = ?";

	public static final String SQL_FIND_BY_NAME = SQL_FIND_ALL + " WHERE " + Category.NAME_OF_CATEGORY + " = ?";

	public static final String SQL_INSERT = "INSERT INTO " + Category.TABLE_NAME + " ( " + Category.NAME_OF_CATEGORY
			+ ") VALUES ( ?)";

	public static final String SQL_UPDATE = "UPDATE " + Category.TABLE_NAME + " SET " + Category.NAME_OF_CATEGORY
			+ " = ? " + "WHERE " + Category.ID_COLUMN + " = ? ";

	public static final String SQL_DELETE = "DELETE FROM " + Category.TABLE_NAME + " WHERE " + Article.ID_COLUMN
			+ " = ?";

	public Category getCategoryByName(String name);

}
