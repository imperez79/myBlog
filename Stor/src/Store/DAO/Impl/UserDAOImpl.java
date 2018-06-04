package Store.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Store.DAO.Interface.IUserDAO;
import Store.DB.DBUtil;
import Store.Domain.User;

public class UserDAOImpl implements IUserDAO {

	DBUtil cp = DBUtil.getInstance();

	@Override
	public User getById(int id) {
		User user = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = cp.getConnection();
			ps = conn.prepareStatement(SQL_FIND_BY_ID_USER);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				do {
					user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(6));

				} while (rs.next());

				return user;
			} else {
				return user;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();

				}
			}
			if (ps != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();

				}
			}
			if (conn != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();

				}
			}

		}
		return user;
	}

	@Override
	public void edit(User model) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = cp.getConnection();
			ps = conn.prepareStatement(SQL_UPDATE_USER);
			ps.setString(1, model.getName());
			ps.setString(2, model.getPassword());
			ps.setString(3, model.getTmpPassword());
			ps.setString(4, model.getEmail());
			ps.setInt(5, model.getIdRole());
			ps.setInt(6, model.getId());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {

			if (ps != null) {

				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (conn != null) {

					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

	@Override
	public void delete(User model) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = cp.getConnection();
			ps = conn.prepareStatement(SQL_DELETE_USER);
			ps.setInt(1, model.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			if (ps != null) {

				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (conn != null) {

					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

	@Override
	public void insert(User model) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = cp.getConnection();
			ps = conn.prepareStatement(SQL_INSERT_USER);
			ps.setString(1, model.getName());
			ps.setString(2, model.getPassword());
			ps.setString(3, model.getTmpPassword());
			ps.setString(4, model.getEmail());
			ps.setInt(5, model.getIdRole());

			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {

			if (ps != null) {

				try {
					ps.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				if (conn != null) {

					try {
						conn.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
				}
			}
		}

	}

	@Override
	public ArrayList<User> getAll() {
		ArrayList<User> list = new ArrayList<User>();
		User user = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setTmpPassword(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setIdRole(rs.getInt(6));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (ps != null) {

				try {
					ps.close();
				} catch (SQLException e) {

					e.printStackTrace();
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
		return list;
	}

	public User getUserByNameAndPassword(String username, String password) {

		User user = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {

			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_BY_NAME_PASSWORD_USER);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				do {
					user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(6));

				} while (rs.next());

				return user;
			} else {
				return user;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return user;
	}

}
