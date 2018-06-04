package Store.DAO.Interface;

import Store.Domain.Role;

public interface IRoleDAO extends IStoreDAO<Role> {

	public static final String SQL_FIND_ALL = "SELECT * FROM " + Role.TABLE_NAME;
	public static final String SQL_FIND_BY_ID_ROLE = SQL_FIND_ALL + " WHERE " + Role.ID_COLUMN + " = ?";
	public static final String SQL_INSERT_ROLE = "INSERT INTO" + Role.TABLE_NAME + "(" + Role.NAME_COLUMN
			+ ") VALUES(?)";
	public static final String SQL_UPDATE_ROLE = "UPDATE " + Role.TABLE_NAME + " SET " + Role.NAME_COLUMN + " = ? ";
	public static final String SQL_DELETE_ROLE = "DELETE FROM " + Role.TABLE_NAME + " WHERE " + Role.ID_COLUMN + " = ?";

}
