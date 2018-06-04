package Store.Domain;

public class User extends StoreModel {

	private static final long serialVersionUID = -8892825322437994774L;
	// Constant for a database tables
	public static final String TABLE_NAME = "USER";
	public static final String NAME_COLUMN = "NAME";
	public static final String PASSWORD_COLUMN = "PASSWORD";
	public static final String ID_ROLE = "ROLEID";
	public static final String TMP_PASSWORD = "TMPPASSWORD";
	public static final String EMAIL = "EMAIL";
	//variables
	private String name;
	private String password;
	private String tmpPassword;
	private String email;
	private int idRole;
	//default constructor
	public User() {

	}

	public User(int id) {

		super(id);
	}

	public User(int id, String name, String password, int idRole) {
		super(id);
		this.name = name;
		this.password = password;
		this.idRole = idRole;
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getTmpPassword() {
		return tmpPassword;
	}

	public void setTmpPassword(String tmpPassword) {
		this.tmpPassword = tmpPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
