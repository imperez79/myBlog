package Store.DAO.Interface;

import Store.Domain.User;

public interface IUserDAO extends IStoreDAO<User> {
	public static final String SQL_FIND_ALL = "SELECT * FROM " + User.TABLE_NAME;
	
	public static final String SQL_FIND_BY_ID_USER = SQL_FIND_ALL + " WHERE " + User.ID_COLUMN + " = ?";
	
	public static final String SQL_INSERT_USER = "INSERT INTO " + User.TABLE_NAME + " ( " + User.NAME_COLUMN + " , "
			+ User.PASSWORD_COLUMN + " , " + User.TMP_PASSWORD + " , " + User.EMAIL + " , " + User.ID_ROLE
			+ " ) VALUES(?,?,?,?,?)";
	
	public static final String SQL_UPDATE_USER = "UPDATE " + User.TABLE_NAME + " SET " + User.NAME_COLUMN + " = ? ,"
			+ User.PASSWORD_COLUMN + " = ? ," + User.TMP_PASSWORD + " = ? ," + User.EMAIL + " = ? ," + User.ID_ROLE
			+ " = ? " + " WHERE " + User.ID_COLUMN + " = ?";
	
	public static final String SQL_DELETE_USER = "DELETE FROM " + User.TABLE_NAME + " WHERE " + User.ID_COLUMN + " = ?";
	
	public static final String SQL_FIND_BY_NAME_PASSWORD_USER = SQL_FIND_ALL + " WHERE " + User.NAME_COLUMN + " = ?  "
			+ "AND " + User.PASSWORD_COLUMN + " =? ";

	public User getUserByNameAndPassword(String username, String password);
}
