package Store.Domain;

public class Category extends StoreModel {

	private static final long serialVersionUID = 78090198013772754L;

	public static final String TABLE_NAME = "CATEGORY";
	public static final String NAME_OF_CATEGORY = "NAME";

	private String name;

	public Category() {
		super();
	}

	public Category(int id, String name) {
		super(id);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
