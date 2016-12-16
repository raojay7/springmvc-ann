<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/user/receiveVo.do" method="post">
    姓名：<input type="text" name="username" id="username">

    年龄：<input type="text" name="age" id="age">
    地址：<input type="text" name="address" id="address">
    <input type="submit" value="提交">
</form>
<hr size="12" color="blue"/>
<form action="${pageContext.request.contextPath }/user/receiveUserCus.do" method="post">
    姓名：<input type="text" name="user.username" >

    年龄：<input type="text" name="user.age" >
    地址：<input type="text" name="user.address" >
    <input type="submit" value="提交">
</form>
<hr size="12" color="blue"/>
<form action="${pageContext.request.contextPath }/user/receiveArray.do" method="post">
    ID：<input type="checkbox" name="ids" value="1" id="ids">
    ID：<input type="checkbox" name="ids" value="2" id="ids">
    ID：<input type="checkbox" name="ids" value="3" id="ids">
    <input type="submit" value="提交">
</form>



<hr size="12" color="blue"/>
<form action="${pageContext.request.contextPath }/user/receiveUserCusList.do" method="post">
    姓名：<input type="text" name="users[0].username" >
    年龄：<input type="text" name="users[0].age" >

    姓名：<input type="text" name="users[1].username" >
    年龄：<input type="text" name="users[1].age" >
    <input type="submit" value="提交">
</form>

<hr size="12" color="blue"/>
<form action="${pageContext.request.contextPath }/user/receiveUserCusMap.do" method="post">
    姓名：<input type="text" name="map['username']" >
    年龄：<input type="text" name="map['age']" >

    <input type="submit" value="提交">
</form>
</body>
</html>