<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mundial Qatar 2022</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Bungee&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@1,300&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="https://img.freepik.com/vector-premium/copa-mundial-fifa-qatar-2022-logotipo-estilizado-vector-ilustracion-aislada-futbol_633888-126.jpg?w=2000" type="image/x-icon">
</head>
<body class="cuerpo">
    
    <header class="titulo">
        <h1>Campeón del mundo</h1>
    </header>

    <main class="texto btns" style="margin-left: 40% ;">
        <c:forEach var="equipo" items="${EquiposCampeon}">
            <img src="${equipo.bandera}" alt="" width="200px">
            <h2>${equipo.nombre}</h2>
        </c:forEach>

        <a href="${pageContext.request.contextPath}/ServletEquipo?accion=restart" class="btn1">Volver  intentarlo</a>

    </main>

    <footer class="footer texto">
        <p> Copyright &copy; Jhon Diego L&#243;pez Morales</p>
    </footer>
    

</body>
</html>