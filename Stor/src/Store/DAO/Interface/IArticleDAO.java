package Store.DAO.Interface;

import java.util.ArrayList;

import Store.Domain.Article;

public interface IArticleDAO extends IStoreDAO<Article> {

	public static final String SQL_FIND_ALL = "select * from " + Article.TABLE_NAME;

	public static final String SQL_FIND_BY_ID = SQL_FIND_ALL + " where " + Article.ID_COLUMN + " = ?";

	public static final String SQL_INSERT = "insert into " + Article.TABLE_NAME + " ( " + Article.NAME_COLUMN + ", "
			+ Article.DESCRIPTION + ", " + Article.PICTURE + ", " + Article.AUTHOR + ", " + Article.SUBCATEGORY_ID
			+ ") values ( ?, ?, ?, ?, ?)";

	public static final String SQL_UPDATE = "UPDATE" + Article.TABLE_NAME + "SET" + Article.NAME_COLUMN + "= ?" + ","
			+ Article.DESCRIPTION + "= ?" + "," + Article.PICTURE + "= ?" + "," + Article.AUTHOR + "= ?" + "," + ","
			+ Article.SUBCATEGORY_ID + "= ?" + "WHERE" + Article.ID_COLUMN + "= ?";

	public static final String SQL_DELETE = "delete from " + Article.TABLE_NAME + " where " + Article.ID_COLUMN
			+ " = ?";

	public static final String SQL_FIND_ALL_BY_SUBCATEGORYID = SQL_FIND_ALL + " where " + Article.SUBCATEGORY_ID
			+ " = ?";

	public ArrayList<Article> getAllBySubCaregoryID(int id);

}
