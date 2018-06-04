package Store.Domain;

public class Article extends StoreModel {

	private static final long serialVersionUID = 291906838741865467L;

	public static final String TABLE_NAME = "ARTICLE";
	public static final String ID_COLUMN = "ID";
	public static final String NAME_COLUMN = "NAME";
	public static final String PICTURE = "PICTURE";
	public static final String DESCRIPTION = "DESCRIPTION";
	public static final String AUTHOR = "AUTHOR";
	public static final String SUBCATEGORY_ID = "IDSUBCATEGORY";

	private String picture;
	private String name;
	private String description;
	private String author;
	private Integer subCategoryID;

	public Article() {
		super();
	}

	public Article(int int1, String string, String string2, String string3, String string4, int int2) {
		super(int1);
		name = string;
		description = string2;
		picture = string3;
		author = string4;
		subCategoryID = int2;

	}

	public String getHeadpiece() {
		return picture;
	}

	public void setHeadpiece(String headpiece) {
		this.picture = headpiece;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getSubCategoryID() {
		return subCategoryID;
	}

	public void setSubCategoryID(Integer subCategoryID) {
		this.subCategoryID = subCategoryID;
	}

}
