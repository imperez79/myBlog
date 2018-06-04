package Store.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Store.DAO.Interface.ICategoryDAO;
import Store.DB.DBUtil;

import Store.Domain.Category;

public class CategoryImpl implements ICategoryDAO {
	DBUtil cp = DBUtil.getInstance();

	@Override
	public void edit(Category model) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_UPDATE);
			ps.setString(1, model.getName());
			ps.setInt(2, model.getId());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}

	}

	@Override
	public void delete(Category model) {
		int id = model.getId();
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_DELETE);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
	}

	@Override
	public void insert(Category model) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_INSERT);
			ps.setString(1, model.getName());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}

	}

	@Override
	public ArrayList<Category> getAll() {
		ArrayList<Category> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Category category = new Category(rs.getInt(1), rs.getString(2));
				list.add(category);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {

				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return list;
	}

	@Override
	public Category getById(int id) {
		Category cat = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_BY_ID);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				cat = new Category(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {

				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return cat;
	}

	@Override
	public Category getCategoryByName(String name) {
		Category cat = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_BY_NAME);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				cat = new Category(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {

				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return cat;

	}
}