<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>登录系统</title>
<s:head />
</head>
<body>

	<table width=780 align="center">
		<tr>
			<td>请输入用户名和密码来登录<br /> <s:if test="tip!=null">
					<div class="error">
						<s:property value="tip" />
					</div>
				</s:if> <s:actionerror cssClass="error" />
				<div align="center">
					<s:form action="checkLogin.action">
						<s:textfield name="user.name" label="用户名" />
						<s:password name="user.password" label="密码" />					
						<tr>
							<td colspan="2"><s:submit value="登录" theme="simple" />
								<s:reset theme="simple" value="重填" /></td>
						</tr>
					</s:form>
				</div> </td>
		</tr>
	</table>

</body>
</html>
