<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Final</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Bungee&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@1,300&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="https://img.freepik.com/vector-premium/copa-mundial-fifa-qatar-2022-logotipo-estilizado-vector-ilustracion-aislada-futbol_633888-126.jpg?w=2000" type="image/x-icon">
</head>
<body>
    
    <header class="texto">
        <h1>Final *</h1>
    </header>

    <main>

        <section>
            <form action ="${pageContext.request.contextPath}/ServletEquipo?accion=campeon" id="formulario" class="form-select-lg mb-3 was-validated" method="POST">
                <div class="texto grupos">
                    <div>
                        <c:forEach var="equipo" items="${EquiposFinal}">
                            <c:if test = "${equipo.id==1}">
                                <input type="text" name="equipo_uno" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_uno" min="0" max="99" required>
                            </c:if>
                            <c:if test = "${equipo.id==2}">
                                <input type="text" name="equipo_dos" value="${equipo.id}" hidden>
                                <input type="number" name="goles_dos" min="0" max="99" required >
                                <label>${equipo.nombre}</label>
                                <img src="${equipo.bandera}" alt="" width="25px">
                            </c:if>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                </div>
                <div class="btns">
                    <button type="submit" class="btn1" style="margin-top: 100px; margin-bottom: 50px;">Enviar</button>
                </div>
            </form>
        </section>

        <p class="texto" style="margin-left: 70px; margin-bottom: 50px;">*Si cree que el partido va a quedar empatado en el tiempo regular y se definirá por cobros desde el punto penal, por favor agréguele un gol más al ganador</p>
        
    </main>

    <footer class="texto">
        <p> Copyright &copy; Jhon Diego L&#243;pez Morales</p>
    </footer>

</body>
</html>