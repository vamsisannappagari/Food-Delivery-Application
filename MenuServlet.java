package com.tap.servlets;

import java.io.IOException;
import java.util.List;

import com.tap.daoimpl.MenuDAOImpl;
import com.tap.model.Menu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	System.out.println("Menu Servlet called");
	
	int rid=Integer.parseInt(req.getParameter("restaurantId"));
	System.out.println(rid);

	
	try {
		MenuDAOImpl daoImpl=new MenuDAOImpl();
		
		List<Menu> menuList=daoImpl.getAllMenusByRestaurant(rid);
		req.setAttribute("menus", menuList);
		
		RequestDispatcher rd=req.getRequestDispatcher("MenuPage.jsp");
		rd.forward(req, resp);
		
		
	} catch (Exception e) {
		e.printStackTrace();

	}
	
		
	
	}
}
