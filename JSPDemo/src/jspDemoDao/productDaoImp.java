package jspDemoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JSPdemo.Product;
import jspDemoDao.ProductDao;

public class productDaoImp implements ProductDao{
	

	@Override
	public boolean insert(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Product p) {
		Connection con=dbconnection.getConnection();
	
		String q="update product set description=?,name=?,price=?,category_no=? where product_id=?";
		try {
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1,p.getDescription());
			pst.setString(2,p.getName());
			pst.setInt(3,p.getPrice());
			pst.setInt(4,p.getCategory_no());
			pst.setInt(5,p.getProduct_id());
			int r=pst.executeUpdate();
			System.out.println("Record"+r);
			if(r==1)
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}

	@Override
	public boolean delete(int id) {
		
		return false;
	}
	
	
	
	
	
	
	
	
	

	@Override
	public ArrayList<Product> DisplayAll() {
		
		Connection con=null;
		ArrayList<Product> alist=new ArrayList<Product>();
		 con=dbconnection.getConnection();
		String q="select *from product";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				int product_id=rs.getInt(1);
				String description=rs.getString(2);
				String name=rs.getString(3);
				int price=rs.getInt(4);
				int category_no=rs.getInt(5);
				Product p2 =new Product(product_id,description,name,price,category_no);
				alist.add(p2);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return alist;
	
	}

	@Override
	
		public Product getProduct(int id) {
			Connection con=dbconnection.getConnection();
	        String query="select * from product where product_id=?";		
			Product p=null;
	        try {
				PreparedStatement pst=con.prepareStatement(query);
				pst.setInt(1, id);
				ResultSet rs=pst.executeQuery();
				while(rs.next()){
					   
					int product_id=rs.getInt(1);
					String description=rs.getString(2);
					String name=rs.getString(3);
					int price=rs.getInt(4);
					int category_id=rs.getInt(5);
					p=new Product(product_id,description,name,price,category_id);
					
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}   
			
			return p;

		

	}
	

}
