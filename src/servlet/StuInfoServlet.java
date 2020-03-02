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
		//����һ���������ݵı���
		req.setCharacterEncoding("UTF-8");
		// ��servlet��ȥ����service�еĶ���
		StuInfoService stu=new StuInfoServiceImpl();
		StuInfo info=new StuInfo();
		//���ҳ���ϵ�����
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
