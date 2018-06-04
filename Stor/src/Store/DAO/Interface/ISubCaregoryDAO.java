package Store.DAO.Interface;

import Store.Domain.SubCategory;

public interface ISubCaregoryDAO extends IStoreDAO<SubCategory> {
	public static final String SQL_FIND_ALL = "SELECT*FROM " + SubCategory.TABLE_NAME;

	public static final String SQL_FIND_ALL_BY_CATEGORY_ID = SQL_FIND_ALL + " WHERE " + SubCategory.ID_CATEGORY
			+ " = ?";

	public static final String SQL_FIND_BY_ID = SQL_FIND_ALL + " WHERE " + SubCategory.ID_COLUMN + " = ?";

	public static final String SQL_INSERT = "INSERT INTO " + SubCategory.TABLE_NAME + " ( " + SubCategory.ID_COLUMN
			+ ", " + SubCategory.NAME_OF_CATEGORY + ", " + SubCategory.ID_CATEGORY + " ) VALUES ( ?, ?,?)";

	public static final String SQL_UPDATE = " UPDATE " + SubCategory.TABLE_NAME + " SET " + SubCategory.NAME_OF_CATEGORY
			+ " = ? " + " , " + SubCategory.ID_CATEGORY + "= ? " + " WHERE " + SubCategory.ID_COLUMN + "= ? ";

	public static final String SQL_DELETE = " DELETE FROM " + SubCategory.TABLE_NAME + "  WHERE "
			+ SubCategory.ID_COLUMN + " = ?";
}
