package com.ripository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.ProductModel;
import com.service.ProductService;

public class Product_Ripository implements ProductService {
	private Connection conn = null;
	private Statement stm = null;
	private PreparedStatement pstm = null;

	private String productTable = "create table if not exists product" 
	+ "(psno int primary key auto_increment,"		
	+ "category text," 
	+ " name text," 
	+ "intro text," 
	+ "image text," 
	+ "quantity float," 
	+ "price float,"	
	+ "stock boolean," 
	+ "weight float," 
	+ "description text)";

	private final String relatedProductStrin = "create table if not exists relatedproduct"
			+ "(rpid int primary key auto_increment," 
			+ "rpsno int," 
			+ "psno int)";
	private final String reviewTable = "create table if not exists reviewtable"
			+ "(rsno int primary key auto_increment," 
			+ "psno int," 
			+ "userimage text," 
			+ "username text,"
			+ "feedback text," 
			+ "rate float)";
	private final String rpalter="alter table relatedproduct add constraint fk1_relatedproduct foreign key (psno) references product(psno)";
	private final String ralter="alter table reviewtable add constraint fk1_reviewtable foreign key (psno) references product(psno)";

	public Product_Ripository() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseName", "root", "root");
			stm = conn.createStatement();
			stm.execute(productTable);
			stm.execute(relatedProductStrin);
			stm.execute(reviewTable);
			stm.execute(rpalter);
			stm.execute(ralter);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int Insert(ProductModel product) {
		try {
		pstm=conn.prepareStatement("insert into product"
				+ "(category,"
				+ "name,"
				+ "intro,"
				+ "image,"
				+ "quantity,"
				+ "price,"
				+ "stock,"
				+ "weight,"
				+ "description) "
				+ "value (?,?,?,?,?,?,?,?,?)");
		
		pstm.setString(1, product.getCategory());
		pstm.setString(2, product.getName());
		pstm.setString(3, product.getIntro());
		pstm.setString(4, product.getImage());
		pstm.setFloat(5, product.getQuantity());
		pstm.setFloat(6, product.getPrice());
		pstm.setString(7, product.isStock());
		pstm.setFloat(8, product.getWeight());
		pstm.setString(9, product.getDescription());
		pstm.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public ArrayList<ProductModel> fetchAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ProductModel> fetchByKeyword() {
		// TODO Auto-generated method stub
		return null;
	}

}
