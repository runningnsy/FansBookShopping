<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单支付成功</title>
</head>
<body>
	<center>
		<table width="600" border="1">
			<tr>
				<td>订单ID： ${order.orderId}</td>

				<td>订单状态：${order.status}</td>

				<td>支付方式：${order.payStyle}</td>

				<td>订单总额：${order.totalMoney}</td>
			</tr>

			<s:iterator value="order.orderItems">
				<tr>
					<td>订单项ID：${orderItemId}</td>
					<td>价格：${price}</td>
					<td>数量：${amount}</td>
					<td>书名：${book.name}</td>
				</tr>
			</s:iterator>
		</table>
	</center>
</body>
</html>