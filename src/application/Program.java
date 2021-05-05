package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department (1,"books");
		
		Seller seller = new Seller(1, "lula", "lua@gh.com.br", new Date(), 5000.00, obj);
		
		System.out.println(seller);

	}

}
