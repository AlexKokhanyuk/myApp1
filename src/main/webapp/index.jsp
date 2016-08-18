<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" ; charset="utf-8">
    <title>$Title$</title>
</head>
<body>

<div class="box" align='center'>
    <p class="text1">Fortune cookies</p>
    <%--<form class="test" action="index.html" method="post">--%>
    <%--<div class="message">--%>
    <%--</div>--%>
    <%--<button type="submit" name="submit">Open Cookies</button>--%>
    <%--</form>--%>

    <form action="${pageContext.request.contextPath}/Controller"  method="post">
        <input type="submit" name="Click">
    </form>
</div>
</body>
</html>
