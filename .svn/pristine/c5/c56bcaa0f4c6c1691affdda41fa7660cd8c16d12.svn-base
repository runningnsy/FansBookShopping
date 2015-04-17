<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>购物车</title>
</head>
<body>

	<table width="800" border="1" cellspacing="1" cellpadding="5">
		<tr>
			<th>书名</th>
			<th>作者</th>
			<th>出版社</th>
			<th>当前价格</th>
			<th>描述信息</th>
		</tr>

		<s:iterator value="order.orderItems">
			<tr>
				<td><s:property value="book.name" />
				</td>
				<td><s:property value="book.author" />
				</td>
				<td><s:property value="book.press" />
				</td>
				<td><s:property value="book.currentPrice" />
				</td>
				<td><s:property value="book.description" />
				</td>
			</tr>
		</s:iterator>
	</table>
	<a href="pay.action">结算</a>
</body>
</html>