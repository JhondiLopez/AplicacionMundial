<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Octavos de final</title>
    <link rel="stylesheet" href="styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Bungee&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@1,300&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="https://img.freepik.com/vector-premium/copa-mundial-fifa-qatar-2022-logotipo-estilizado-vector-ilustracion-aislada-futbol_633888-126.jpg?w=2000" type="image/x-icon">
</head>
<body>
    
    <header class="texto">
        <h1>Octavos de final *</h1>
    </header>

    <main>

        <section>
            <form action ="${pageContext.request.contextPath}/ServletEquipo?accion=cuartos" id="formulario" class="form-select-lg mb-3 was-validated" method="POST">
                <div class="texto grupos">
                    <div>
                        <c:forEach var="equipo" items="${EquiposOctavos}">
                            <c:if test = "${equipo.id==1}">
                                <input type="text" name="equipo_uno" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_uno" min="0" max="99" required>
                                <input type="number" name="orden_uno" value="1" hidden>
                            </c:if>
                            <c:if test = "${equipo.id==5}">
                                <input type="text" name="equipo_dos" value="${equipo.id}" hidden>
                                <input type="number" name="goles_dos" min="0" max="99" required >
                                <input type="number" name="orden_dos" value="1" hidden>
                                <label>${equipo.nombre}</label>
                                <img src="${equipo.bandera}" alt="" width="25px">
                            </c:if>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                    <div>
                        <c:forEach var="equipo" items="${EquiposOctavos}">
                            <c:if test = "${equipo.id==2}">
                                <input type="text" name="equipo_tres" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_tres" min="0" max="99" required>
                                <input type="number" name="orden_tres" value="2" hidden>
                            </c:if>
                            <c:if test = "${equipo.id==4}">
                                <input type="number" name="goles_cuatro" min="0" max="99" required>
                                <input type="text" name="equipo_cuatro" value="${equipo.id}" hidden>
                                <input type="number" name="orden_cuatro" value="2" hidden>
                                <label>${equipo.nombre}</label>
                                <img src="${equipo.bandera}" alt="" width="25px">
                            </c:if>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                    <div>
                        <c:forEach var="equipo" items="${EquiposOctavos}">
                            <c:if test = "${equipo.id==7}">
                                <input type="text" name="equipo_cinco" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_cinco" min="0" max="99" required>
                                <input type="number" name="orden_cinco" value="3" hidden>
                            </c:if>
                            <c:if test = "${equipo.id==11}">
                                <input type="number" name="goles_seis" min="0" max="99" required>
                                <input type="text" name="equipo_seis" value="${equipo.id}" hidden>
                                <input type="number" name="orden_seis" value="3" hidden>

                                <label>${equipo.nombre}</label>
                                <img src="${equipo.bandera}" alt="" width="25px">
                            </c:if>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                    <div>
                        <c:forEach var="equipo" items="${EquiposOctavos}">
                            <c:if test = "${equipo.id==8}">
                                <input type="text" name="equipo_siete" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_siete" min="0" max="99" required>
                                <input type="number" name="orden_siete" value="4" hidden>
                            </c:if>
                            <c:if test = "${equipo.id==10}">
                                <input type="number" name="goles_ocho" min="0" max="99" required>
                                <input type="text" name="equipo_ocho" value="${equipo.id}" hidden>
                                <input type="number" name="orden_ocho" value="4" hidden>
                                <label>${equipo.nombre}</label>
                                <img src="${equipo.bandera}" alt="" width="25px">
                            </c:if>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                    <div>
                        <c:forEach var="equipo" items="${EquiposOctavos}">
                            <c:if test = "${equipo.id==13}">
                                <input type="text" name="equipo_nueve" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_nueve" min="0" max="99" required>
                                <input type="number" name="orden_nueve" value="5" hidden>
                            </c:if>
                            <c:if test = "${equipo.id==17}">
                                <input type="number" name="goles_diez" min="0" max="99" required>
                                <input type="text" name="equipo_diez" value="${equipo.id}" hidden>
                                <input type="number" name="orden_diez" value="5" hidden>
                                <label>${equipo.nombre}</label>
                                <img src="${equipo.bandera}" alt="" width="25px">
                            </c:if>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                    <div>
                        <c:forEach var="equipo" items="${EquiposOctavos}">
                            <c:if test = "${equipo.id==14}">
                                <input type="text" name="equipo_once" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_once" min="0" max="99" required>
                                <input type="number" name="orden_once" value="6" hidden>
                            </c:if>
                            <c:if test = "${equipo.id==16}">
                                <input type="number" name="goles_doce" min="0" max="99" required>
                                <input type="text" name="equipo_doce" value="${equipo.id}" hidden>
                                <input type="number" name="orden_doce" value="6" hidden>
                                <label>${equipo.nombre}</label>
                                <img src="${equipo.bandera}" alt="" width="25px">
                            </c:if>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                    <div>
                        <c:forEach var="equipo" items="${EquiposOctavos}">
                            <c:if test = "${equipo.id==19}">
                                <input type="text" name="equipo_trece" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_trece" min="0" max="99" required>
                                <input type="number" name="orden_trece" value="7" hidden>
                            </c:if>
                            <c:if test = "${equipo.id==23}">
                                <input type="number" name="goles_catorce" min="0" max="99" required>
                                <input type="text" name="equipo_catorce" value="${equipo.id}" hidden>
                                <input type="number" name="orden_catorce" value="7" hidden>
                                <label>${equipo.nombre}</label>
                                <img src="${equipo.bandera}" alt="" width="25px">
                            </c:if>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                    <div>
                        <c:forEach var="equipo" items="${EquiposOctavos}">
                            <c:if test = "${equipo.id==20}">
                                <input type="text" name="equipo_quince" value="${equipo.id}" hidden>
                                <img src="${equipo.bandera}" alt="" width="25px">
                                <label>${equipo.nombre}</label>
                                <input type="number" name="goles_quince" min="0" max="99" required>
                                <input type="number" name="orden_quince" value="8" hidden>

                            </c:if>
                            <c:if test = "${equipo.id==22}">
                                <input type="number" name="goles_dieciseis" min="0" max="99" required>
                                <input type="text" name="equipo_dieciseis" value="${equipo.id}" hidden>
                                <input type="number" name="orden_dieciseis" value="8" hidden>
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