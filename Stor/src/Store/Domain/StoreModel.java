package Store.Domain;

import java.io.Serializable;

public class StoreModel implements Serializable, Comparable<StoreModel> {

	private static final long serialVersionUID = 1L;
	public static final String ID_COLUMN = "ID";
	private int id;

	public StoreModel() {

	}

	public StoreModel(int id) {

		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(StoreModel o) {

		return this.id - o.id;
	}

}
