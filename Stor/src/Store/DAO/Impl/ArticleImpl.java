package Store.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Store.DAO.Interface.IArticleDAO;
import Store.DB.DBUtil;
import Store.Domain.Article;

public class ArticleImpl implements IArticleDAO {
	DBUtil cp = DBUtil.getInstance();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public Article getById(int id) {
		Article article = null;
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_BY_ID);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				article = new Article();
				article.setId(id);
				article.setName(rs.getString(2));
				article.setDescription(rs.getString(3));
				article.setPicture(rs.getString(4));
				article.setAuthor(rs.getString(5));
				article.setSubCategoryID(rs.getInt(6));
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
		return article;
	}

	@Override
	public void edit(Article model) {

		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_ALL);
			ps.setString(1, model.getName());
			ps.setString(2, model.getDescription());
			ps.setString(3, model.getPicture());
			ps.setString(4, model.getAuthor());
			ps.setInt(5, model.getSubCategoryID());
			ps.setInt(6, model.getId());

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

	}

	@Override
	public void delete(Article model) {
		int id = model.getId();
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_DELETE);
			ps.setInt(1, id);
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
	}

	@Override
	public void insert(Article model) {
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_INSERT);
			ps.setInt(1, model.getId());
			ps.setString(2, model.getName());
			ps.setString(3, model.getDescription());
			ps.setString(4, model.getPicture());
			ps.setString(5, model.getAuthor());
			ps.setInt(6, model.getSubCategoryID());
			ps.executeUpdate();
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
	}

	@Override
	public ArrayList<Article> getAll() {
		ArrayList<Article> list = new ArrayList<>();
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Article article = new Article(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getInt(6));
				list.add(article);
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
	public ArrayList<Article> getAllBySubCaregoryID(int id) {

		ArrayList<Article> list = new ArrayList<>();
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_ALL_BY_SUBCATEGORYID);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				Article article = new Article(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getInt(6));
				list.add(article);
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

}