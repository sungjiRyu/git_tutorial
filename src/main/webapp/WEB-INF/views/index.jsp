<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        if(data != ''){
        alert('${data}');
    }
        const msg = '${loginMessage}';
        if(msg != ''){
            alert(msg);
        }
    </script>
</head>
<body>
    <h1>반가워</h1>
    ${data}<br>
    ${greet}
    <!-- loginUser가 null이 아니라면-->
    <c:if test="${loginUser != null">
        <!-- 이 내용을 표시한다 -->
    <div>
        ${loginUser.id}(${loginUser.name})
    </div>
</c:if>
</body>
</html>