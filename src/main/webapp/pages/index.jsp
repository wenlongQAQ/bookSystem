<%--
  Created by IntelliJ IDEA.
  User: 86152
  Date: 2022/9/29
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <!-- 引入组件库 -->
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<script>

    axios.post("http://localhost:80/bookController_Web/books",{
        "id":88,
        "name":"天天吃牛",
        "money":6666
    }).then((resp)=>{
      alert(resp.data)
    })

        // axios.get("http://localhost:80/bookController_Web/books/"+"李文龙").then((resp) =>{
        //     alert(resp.data);
        // })
</script>

</body>
</html>
