package com.connector;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.model.ProductModel;
import com.ripository.Product_Ripository;
import com.service.ProductService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet({"/index","/insertproduct"})
@MultipartConfig(fileSizeThreshold = (1024*1024), maxFileSize = (1024*1024),maxRequestSize = (1024*1024))
public class Main extends HttpServlet {
	
	ProductService ps;
	@Override
	public void init(ServletConfig config) throws ServletException {
		 ps=new Product_Ripository();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd= req.getRequestDispatcher("home.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getServletPath().equals("/insertproduct")) {			
		String category=req.getParameter("category");
		String name=req.getParameter("name");
		String intro=req.getParameter("intro");
		String image=req.getPart("file").getSubmittedFileName();
		float quantity=Float.parseFloat(req.getParameter("quantity"));
		float price=Float.parseFloat(req.getParameter("price"));
		boolean stock=req.getParameter("stock")==null?false:true;
		float weight=Float.parseFloat(req.getParameter("weight"));
		String description=req.getParameter("description");
		for (Part p : req.getParts()) {
			p.write("C:\\Users\\Rudraa\\eclipse-workspace\\Ogani_Shop\\src\\main\\webapp\\upload\\"+image);	
		}
		ProductModel product= new ProductModel(0, category, name, intro, image, quantity, price, stock, weight, description);
		ps.Insert(product);
		}
	}

}
