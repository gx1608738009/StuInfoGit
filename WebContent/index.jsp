<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
    <form action="Index" method="post">
     <table>
          <tr>
              <td>学号：</td>
              <td><input type="text" name="stuNo" value=""/></td>
          </tr>
          <tr>
              <td>姓名：</td>
              <td><input type="text" name="stuName" value=""/></td>
          </tr>
          <tr>
              <td>学生成绩：</td>
              <td><input type="text" name="gender" value=""/></td>
          </tr>
          <tr>
              <td>学生年龄：</td>
              <td><input type="text" name="age" value=""/></td>
          </tr>
          <tr>
              <td>邮箱：</td>
              <td><input type="text" name="email" value=""/></td>
          </tr>
       </table>
    </form>
</body>
</html>