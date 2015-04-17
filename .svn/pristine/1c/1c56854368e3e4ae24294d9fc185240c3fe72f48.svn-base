<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<link rel="stylesheet" rev="stylesheet" href="css/index.css"
	type="text/css" media="all" />
<link rel="stylesheet" rev="stylesheet" href="css/public_menu.css"
	type="text/css" media="all" />
<link rel="stylesheet" rev="stylesheet" href="css/public_bar.css"
	type="text/css" media="all" />

<title>在线书店</title>
</head>
<body>

	<div id="container">
		<%@include file="header.jsp"%>

		<div id="menu">
			<ul>
				<li><a href="welcome.action" title="首页" target="_self"> 首页
				</a>
				</li>
				<s:iterator value="bookCategories">

					<li><a
						href="pageCategoryBooks.action?pageIndex=1&bookCategoryId=${bookCategoryId}"
						title="${name}" target="_self"> <s:property value="name" /> </a>
					</li>


				</s:iterator>
			</ul>
		</div>

		<table width="960" border="1" cellspacing="1" cellpadding="5">
			<tr>
				<th>书名</th>
				<th>作者</th>
				<th>出版社</th>
				<th>出版时间</th>
				<th>当前价格</th>
			
				<th>购物</th>
				<th>图片</th>
			</tr>
			<s:iterator value="books">
				<tr>
					<td><s:property value="name" />
					</td>
					<td><s:property value="author" />
					</td>
					<td><s:property value="press" />
					</td>
					<td><s:property value="pressDate" />
					</td>
					<td><s:property value="currentPrice" />
					</td>
					
					</td>
					<td><a href="shoppingcart.action?bookId=${bookId}"
						target="_about">购买</a>
					</td>
					<td><img src="images/${image}"/></td>
				</tr>
			</s:iterator>
		</table>


		<s:if test="pageIndex>1">
			<a
				href="pageCategoryBooks.action?pageIndex=
					${pageIndex-1}&bookCategoryId=
					${bookCategoryId}">上一页</a>
		</s:if>
		<s:else>上一页</s:else>

		<s:bean name="org.apache.struts2.util.Counter" id="counter">
			<s:param name="first" value="left" />
			<s:param name="last" value="right" />
			<s:iterator>
				<a
					href="pageCategoryBooks.action?pageIndex=
					<s:property/>&bookCategoryId=
					${bookCategoryId}"
					title="第<s:property/>页"><s:property /> </a>
			</s:iterator>
		</s:bean>

		<s:if test="pageIndex<pageCounter">
			<a
				href="pageCategoryBooks.action?pageIndex=
					${pageIndex+1}&bookCategoryId=
					${bookCategoryId}">下一页</a>
		</s:if>
		<s:else>下一页</s:else>

		<%@include file="footer.jsp"%>
	</div>
</body>
</html>
