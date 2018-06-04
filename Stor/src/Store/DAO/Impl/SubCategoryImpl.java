package Store.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Store.DAO.Interface.ISubCaregoryDAO;
import Store.DB.DBUtil;
import Store.Domain.SubCategory;

public class SubCategoryImpl implements ISubCaregoryDAO{
	DBUtil cp = DBUtil.getInstance();
	@Override
	public SubCategory getById(int id) {
		SubCategory subcategory = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_FIND_BY_ID);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()){
				subcategory =new SubCategory(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		return subcategory;
	}

	@Override
	public void edit(SubCategory model) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_UPDATE);
			ps.setString(1, model.getName());
			ps.setInt(2, model.getId_category());
			ps.setInt(3, model.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			
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
	public void delete(SubCategory model) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_DELETE);
			ps.setInt(1, model.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			
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
	public void insert(SubCategory model) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = cp.getConnection();
			ps = con.prepareStatement(SQL_INSERT);
			ps.setInt(1, model.getId());
			ps.setString(2, model.getName());
			ps.setInt(3, model.getId_category());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			
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
	public ArrayList<SubCategory> getAll() {
		ArrayList<SubCategory> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con =cp.getConnection();
			ps = con.prepareStatement("SELECT * FROM SUBCATEGORY  ");
			rs = ps.executeQuery();
			while(rs.next()) {
				SubCategory subCategory = new SubCategory(rs.getInt(1),rs.getString(2),rs.getInt(3));
				list.add(subCategory);	
			}
			
		} catch (SQLException e) {
				e.printStackTrace();
		}
		finally {
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

	

	public ArrayList<SubCategory> getAllByIdCategory(int id_category) {
		ArrayList<SubCategory> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con =cp.getConnection();
			ps = con.prepareStatement("SELECT * FROM SUBCATEGORY WHERE IDCATEGORY = ? ");
			ps.setInt(1, id_category);
			rs = ps.executeQuery();
			while(rs.next()) {
				SubCategory subCategory = new SubCategory(rs.getInt(1),rs.getString(2),rs.getInt(3));
				list.add(subCategory);	
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
		}
		finally {
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
	

