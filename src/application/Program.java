package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department (1,"books");
		
		Seller seller = new Seller(1, "lula", "lua@gh.com.br", new Date(), 5000.00, obj);
		
		SellerDao sellerDao = DaoFactory.criateSellerDao();
		
		System.out.println(seller);

	}

}
