package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.StuInfo;
import service.StuInfoService;
import service.impl.StuInfoServiceImpl;
@WebServlet("/Add")
public class StuInfoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置一个请求数据的编码
		req.setCharacterEncoding("UTF-8");
		// 在servlet中去访问service中的对象
		StuInfoService stu=new StuInfoServiceImpl();
		StuInfo info=new StuInfo();
		//获得页面上的数据
		int stuNo = Integer.parseInt(req.getParameter("stuNo"));
		String stuName=req.getParameter("stuName");
		int gender = Integer.parseInt(req.getParameter("gender"));
		int age = Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		info.setStuNo(stuNo);
		info.setStuName(stuName);
		info.setGender(gender);
		info.setAge(age);
		info.setEmail(email);
		stu.getAll();
	}
}
