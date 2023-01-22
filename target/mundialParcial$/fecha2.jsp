<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Fecha 2</title>
  <link rel="stylesheet" href="styles.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Bungee&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@1,300&display=swap" rel="stylesheet">
  <link rel="shortcut icon" href="https://img.freepik.com/vector-premium/copa-mundial-fifa-qatar-2022-logotipo-estilizado-vector-ilustracion-aislada-futbol_633888-126.jpg?w=2000" type="image/x-icon">
</head>
<body>

<header class="texto">
  <h1>Fecha 2</h1>
</header>

<main>

  <section>
    <form action ="${pageContext.request.contextPath}/ServletEquipo?accion=actualizarF2" id="formulario" class="form-select-lg mb-3 was-validated" method="POST">
      <div class="texto grupos">
        <h2>Grupo A</h2>
        <div>
          <c:forEach var="equipo" items="${equiposA}">
            <c:if test = "${equipo.id==1}">
              <input type="text" name="equipo_uno_a" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_uno_a" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==3}">
              <input type="number" name="goles_tres_a" min="0" max="99" required>
              <input type="text" name="equipo_tres_a" value="${equipo.id}" hidden>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>
        <br>
        <br>
        <div>
          <%--<c:out value="${Collections.reverse(equiposA)}"/>--%>
          <c:forEach var="equipo" items="${equiposA}">
            <c:if test = "${equipo.id==2}">
              <input type="text" name="equipo_dos_a" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_dos_a" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==4}">
              <input type="text" name="equipo_cuatro_a" value="${equipo.id}" hidden>
              <input type="number" name="goles_cuatro_a" min="0" max="99" required >
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>

        <h2>Grupo B</h2>
        <div>
          <c:forEach var="equipo" items="${equiposB}">
            <c:if test = "${equipo.id==1}">
              <input type="text" name="equipo_uno_b" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_uno_b" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==3}">
              <input type="text" name="equipo_tres_b" value="${equipo.id}" hidden>
              <input type="number" name="goles_tres_b" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>
        <br>
        <br>
        <div>
          <c:forEach var="equipo" items="${equiposB}">
            <c:if test = "${equipo.id==2}">
              <input type="text" name="equipo_dos_b" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_dos_b" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==4}">
              <input type="text" name="equipo_cuatro_b" value="${equipo.id}" hidden>
              <input type="number" name="goles_cuatro_b" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>

        <h2>Grupo C</h2>
        <div>
          <c:forEach var="equipo" items="${equiposC}">
            <c:if test = "${equipo.id==1}">
              <input type="text" name="equipo_uno_c" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_uno_c" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==3}">
              <input type="text" name="equipo_tres_c" value="${equipo.id}" hidden>
              <input type="number" name="goles_tres_c" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>
        <br>
        <br>
        <div>
          <c:forEach var="equipo" items="${equiposC}">
            <c:if test = "${equipo.id==2}">
              <input type="text" name="equipo_dos_c" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_dos_c" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==4}">
              <input type="text" name="equipo_cuatro_c" value="${equipo.id}" hidden>
              <input type="number" name="goles_cuatro_c" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>

        <h2>Grupo D</h2>
        <div>
          <c:forEach var="equipo" items="${equiposD}">
            <c:if test = "${equipo.id==1}">
              <input type="text" name="equipo_uno_d" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_uno_d" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==3}">
              <input type="text" name="equipo_tres_d" value="${equipo.id}" hidden>
              <input type="number" name="goles_tres_d" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>
        <br>
        <br>
        <div>
          <c:forEach var="equipo" items="${equiposD}">
            <c:if test = "${equipo.id==2}">
              <input type="text" name="equipo_dos_d" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_dos_d" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==4}">
              <input type="text" name="equipo_cuatro_d" value="${equipo.id}" hidden>
              <input type="number" name="goles_cuatro_d" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>

        <h2>Grupo E</h2>
        <div>
          <c:forEach var="equipo" items="${equiposE}">
            <c:if test = "${equipo.id==1}">
              <input type="text" name="equipo_uno_e" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_uno_e" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==3}">
              <input type="text" name="equipo_tres_e" value="${equipo.id}" hidden>
              <input type="number" name="goles_tres_e" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>
        <br>
        <br>
        <div>
          <c:forEach var="equipo" items="${equiposE}">
            <c:if test = "${equipo.id==2}">
              <input type="text" name="equipo_dos_e" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_dos_e" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==4}">
              <input type="text" name="equipo_cuatro_e" value="${equipo.id}" hidden>
              <input type="number" name="goles_cuatro_e" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>

        <h2>Grupo F</h2>
        <div>
          <c:forEach var="equipo" items="${equiposF}">
            <c:if test = "${equipo.id==1}">
              <input type="text" name="equipo_uno_f" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_uno_f" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==3}">
              <input type="text" name="equipo_tres_f" value="${equipo.id}" hidden>
              <input type="number" name="goles_tres_f" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>
        <br>
        <br>
        <div>
          <c:forEach var="equipo" items="${equiposF}">
            <c:if test = "${equipo.id==2}">
              <input type="text" name="equipo_dos_f" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_dos_f" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==4}">
              <input type="text" name="equipo_cuatro_f" value="${equipo.id}" hidden>
              <input type="number" name="goles_cuatro_f" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>

        <h2>Grupo G</h2>
        <div>
          <c:forEach var="equipo" items="${equiposG}">
            <c:if test = "${equipo.id==1}">
              <input type="text" name="equipo_uno_g" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_uno_g" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==3}">
              <input type="text" name="equipo_tres_g" value="${equipo.id}" hidden>
              <input type="number" name="goles_tres_g" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>
        <br>
        <br>
        <div>
          <c:forEach var="equipo" items="${equiposG}">
            <c:if test = "${equipo.id==2}">
              <input type="text" name="equipo_dos_g" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_dos_g" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==4}">
              <input type="text" name="equipo_cuatro_g" value="${equipo.id}" hidden>
              <input type="number" name="goles_cuatro_g" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>

        <h2>Grupo H</h2>
        <div>
          <c:forEach var="equipo" items="${equiposH}">
            <c:if test = "${equipo.id==1}">
              <input type="text" name="equipo_uno_h" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_uno_h" min="0" max="99" require>
            </c:if>
            <c:if test = "${equipo.id==3}">
              <input type="text" name="equipo_tres_h" value="${equipo.id}" hidden>
              <input type="number" name="goles_tres_h" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>
        <br>
        <br>
        <div>
          <c:forEach var="equipo" items="${equiposH}">
            <c:if test = "${equipo.id==2}">
              <input type="text" name="equipo_dos_h" value="${equipo.id}" hidden>
              <img src="${equipo.bandera}" alt="" width="25px">
              <label>${equipo.nombre}</label>
              <input type="number" name="goles_dos_h" min="0" max="99" required>
            </c:if>
            <c:if test = "${equipo.id==4}">
              <input type="text" name="equipo_cuatro_h" value="${equipo.id}" hidden>
              <input type="number" name="goles_cuatro_h" min="0" max="99" required>
              <label>${equipo.nombre}</label>
              <img src="${equipo.bandera}" alt="" width="25px">
            </c:if>
          </c:forEach>
        </div>

      </div>
      <div class="btns">
        <button type="submit" class="btn1" style="margin-top: 100px; margin-bottom: 100px;">Enviar</button>
      </div>
    </form>
  </section>



</main>

<footer class="texto">
  <p> Copyright &copy; Jhon Diego L&#243;pez Morales</p>
</footer>

</body>
</html>
