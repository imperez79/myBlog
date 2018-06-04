package Store.Domain;

public class Role extends StoreModel {

	private static final long serialVersionUID = 4650665325263521588L;
	public static final String TABLE_NAME = "ROLE";
	public static final String NAME_COLUMN = "NAME";

	private String name;

	public Role() {
	}

	public Role(int id) {
		super(id);
	}

	public Role(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
