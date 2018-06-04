package Store.Domain;

public class SubCategory extends StoreModel {

	private static final long serialVersionUID = -7342005013830527272L;

	public static final String TABLE_NAME = "SUBCATEGORY";
	public static final String NAME_OF_CATEGORY = "NAME";
	public static final String ID_CATEGORY = "IDCATEGORY";

	String name;
	int id_category;

	public SubCategory() {

	}

	public SubCategory(int id) {
		super(id);
	}

	public SubCategory(int id, String name, int category) {
		super(id);
		this.name = name;
		this.id_category = category;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SubCategory [id=" + getId() + ",name=" + name + ", category=" + id_category + "]";
	}

}
