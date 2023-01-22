<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mundial Qatar 2022</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Bungee&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@1,300&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="https://img.freepik.com/vector-premium/copa-mundial-fifa-qatar-2022-logotipo-estilizado-vector-ilustracion-aislada-futbol_633888-126.jpg?w=2000" type="image/x-icon">
</head>
<body>
    
    <header class="texto" style="margin-top: 100px ;">
        <h1>Resultados</h1>
    </header>

    <!-- Button trigger modal -->
    <main class="btns">
        <button type="button" href="grupos.html" class="btn1" style="margin-top: 100px;" data-bs-toggle="modal" data-bs-target="#tablaModal">
            Tabla de posiciones
        </button>

    <!-- Modal -->
    <div class="modal fade" id="tablaModal" tabindex="-1" aria-labelledby="tablaModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
            <h1 class="modal-title fs-5" id="tablaModalLabel">Tabla de posiciones</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <table class="table table-dark table-hover">
                    <thead>
                    <tr>
                        <th scope="col" colspan="6"><p class="text-center texto">Grupo A<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">Equipo</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">Puntos</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposATabla}">
                        <tr>
                            <td class="text-center"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center">${equipo.nombre}</td>
                            <td class="text-center">${equipo.golesFavor}</td>
                            <td class="text-center">${equipo.golesContra}</td>
                            <td class="text-center">${equipo.diferenciaGol}</td>
                            <td class="text-center">${equipo.puntos}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="6"><p class="text-center texto">Grupo B<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">Equipo</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">Puntos</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposBTabla}">
                        <tr>
                            <td class="text-center"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center">${equipo.nombre}</td>
                            <td class="text-center">${equipo.golesFavor}</td>
                            <td class="text-center">${equipo.golesContra}</td>
                            <td class="text-center">${equipo.diferenciaGol}</td>
                            <td class="text-center">${equipo.puntos}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="6"><p class="text-center texto">Grupo C<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">Equipo</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">Puntos</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposCTabla}">
                        <tr>
                            <td class="text-center"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center">${equipo.nombre}</td>
                            <td class="text-center">${equipo.golesFavor}</td>
                            <td class="text-center">${equipo.golesContra}</td>
                            <td class="text-center">${equipo.diferenciaGol}</td>
                            <td class="text-center">${equipo.puntos}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="6"><p class="text-center texto">Grupo D<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">Equipo</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">Puntos</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposDTabla}">
                        <tr>
                            <td class="text-center"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center">${equipo.nombre}</td>
                            <td class="text-center">${equipo.golesFavor}</td>
                            <td class="text-center">${equipo.golesContra}</td>
                            <td class="text-center">${equipo.diferenciaGol}</td>
                            <td class="text-center">${equipo.puntos}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="6"><p class="text-center texto">Grupo E<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">Equipo</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">Puntos</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposETabla}">
                        <tr>
                            <td class="text-center"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center">${equipo.nombre}</td>
                            <td class="text-center">${equipo.golesFavor}</td>
                            <td class="text-center">${equipo.golesContra}</td>
                            <td class="text-center">${equipo.diferenciaGol}</td>
                            <td class="text-center">${equipo.puntos}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="6"><p class="text-center texto">Grupo F<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">Equipo</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">Puntos</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposFTabla}">
                        <tr>
                            <td class="text-center"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center">${equipo.nombre}</td>
                            <td class="text-center">${equipo.golesFavor}</td>
                            <td class="text-center">${equipo.golesContra}</td>
                            <td class="text-center">${equipo.diferenciaGol}</td>
                            <td class="text-center">${equipo.puntos}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="6"><p class="text-center texto">Grupo G<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">Equipo</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">Puntos</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposGTabla}">
                        <tr>
                            <td class="text-center"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center">${equipo.nombre}</td>
                            <td class="text-center">${equipo.golesFavor}</td>
                            <td class="text-center">${equipo.golesContra}</td>
                            <td class="text-center">${equipo.diferenciaGol}</td>
                            <td class="text-center">${equipo.puntos}</td>
                        </tr>
                    </c:forEach>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="6"><p class="text-center texto">Grupo H<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">Equipo</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">Puntos</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposHTabla}">
                        <tr>
                            <td class="text-center"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center">${equipo.nombre}</td>
                            <td class="text-center">${equipo.golesFavor}</td>
                            <td class="text-center">${equipo.golesContra}</td>
                            <td class="text-center">${equipo.diferenciaGol}</td>
                            <td class="text-center">${equipo.puntos}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            </div>
        </div>
        </div>
    </div>

        <a href="${pageContext.request.contextPath}/ServletEquipo?accion=fecha2" class="btn1" style="margin-top: 100px;">Siguiente fecha</a>
    </main>

    <footer class="footer texto">
        <p> Copyright &copy; Jhon Diego L&#243;pez Morales</p>
    </footer>
    
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>