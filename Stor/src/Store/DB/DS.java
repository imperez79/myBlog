package Store.DB;

import org.h2.jdbcx.JdbcConnectionPool;

public class DS {
	private static final String DB_CONNECTION = "jdbc:h2:~/myDataBase";
	private static final String DB_USER = "user";
	private static final String DB_PASSWORD = "user";
	private static final String DB_DRIVER = "org.h2.DRIVER";

	public static JdbcConnectionPool getConnectionPool() {
		JdbcConnectionPool cp = null;
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		cp = JdbcConnectionPool.create(DB_CONNECTION, DB_USER, DB_PASSWORD);
		cp.setMaxConnections(6);

		return cp;
	}

}
