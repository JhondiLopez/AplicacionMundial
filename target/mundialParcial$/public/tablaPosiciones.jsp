
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Button trigger modal -->
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
                        <th scope="col" colspan="8"><p class="text-center texto">Grupo A<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto">POS</p></th>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">EQUIPO</p></th>
                        <th scope="col"><p class="text-center texto">PJ</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">PUNTOS</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <%int pos=1;%>
                    <c:forEach var="equipo" items="${equiposATabla}">
                        <%String color= (pos==1 || pos==2) ? "text-info" : "text-danger";%>
                        <tr>
                            <td class="text-center <%=color%>"><%=pos%></td>
                            <td class="text-center <%=color%>"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center <%=color%>">${equipo.nombre}</td>
                            <td class="text-center <%=color%>">${equipo.partidosJugados}</td>
                            <td class="text-center <%=color%>">${equipo.golesFavor}</td>
                            <td class="text-center <%=color%>">${equipo.golesContra}</td>
                            <td class="text-center <%=color%>">${equipo.diferenciaGol}</td>
                            <td class="text-center <%=color%>">${equipo.puntos}</td>
                            <%pos++;%>
                        </tr>
                    </c:forEach>
                    <%pos=1;%>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="8"><p class="text-center texto">Grupo B<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto">POS</p></th>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">EQUIPO</p></th>
                        <th scope="col"><p class="text-center texto">PJ</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">PUNTOS</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposBTabla}">
                        <%String color= (pos==1 || pos==2) ? "text-info" : "text-danger";%>
                        <tr>
                            <td class="text-center <%=color%>"><%=pos%></td>
                            <td class="text-center <%=color%>"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center <%=color%>">${equipo.nombre}</td>
                            <td class="text-center <%=color%>">${equipo.partidosJugados}</td>
                            <td class="text-center <%=color%>">${equipo.golesFavor}</td>
                            <td class="text-center <%=color%>">${equipo.golesContra}</td>
                            <td class="text-center <%=color%>">${equipo.diferenciaGol}</td>
                            <td class="text-center <%=color%>">${equipo.puntos}</td>
                            <%pos++;%>
                        </tr>
                    </c:forEach>
                    <%pos=1;%>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="8"><p class="text-center texto">Grupo C<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto">POS</p></th>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">EQUIPO</p></th>
                        <th scope="col"><p class="text-center texto">PJ</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">PUNTOS</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposCTabla}">
                        <%String color= (pos==1 || pos==2) ? "text-info" : "text-danger";%>
                        <tr>
                            <td class="text-center <%=color%>"><%=pos%></td>
                            <td class="text-center <%=color%>"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center <%=color%>">${equipo.nombre}</td>
                            <td class="text-center <%=color%>">${equipo.partidosJugados}</td>
                            <td class="text-center <%=color%>">${equipo.golesFavor}</td>
                            <td class="text-center <%=color%>">${equipo.golesContra}</td>
                            <td class="text-center <%=color%>">${equipo.diferenciaGol}</td>
                            <td class="text-center <%=color%>">${equipo.puntos}</td>
                            <%pos++;%>
                        </tr>
                    </c:forEach>
                    <%pos=1;%>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="8"><p class="text-center texto">Grupo D<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto">POS</p></th>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">EQUIPO</p></th>
                        <th scope="col"><p class="text-center texto">PJ</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">PUNTOS</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposDTabla}">
                        <%String color= (pos==1 || pos==2) ? "text-info" : "text-danger";%>
                        <tr>
                            <td class="text-center <%=color%>"><%=pos%></td>
                            <td class="text-center <%=color%>"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center <%=color%>">${equipo.nombre}</td>
                            <td class="text-center <%=color%>">${equipo.partidosJugados}</td>
                            <td class="text-center <%=color%>">${equipo.golesFavor}</td>
                            <td class="text-center <%=color%>">${equipo.golesContra}</td>
                            <td class="text-center <%=color%>">${equipo.diferenciaGol}</td>
                            <td class="text-center <%=color%>">${equipo.puntos}</td>
                            <%pos++;%>
                        </tr>
                    </c:forEach>
                    <%pos=1;%>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="8"><p class="text-center texto">Grupo E<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto">POS</p></th>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">EQUIPO</p></th>
                        <th scope="col"><p class="text-center texto">PJ</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">PUNTOS</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposETabla}">
                        <%String color= (pos==1 || pos==2) ? "text-info" : "text-danger";%>
                        <tr>
                            <td class="text-center <%=color%>"><%=pos%></td>
                            <td class="text-center <%=color%>"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center <%=color%>">${equipo.nombre}</td>
                            <td class="text-center <%=color%>">${equipo.partidosJugados}</td>
                            <td class="text-center <%=color%>">${equipo.golesFavor}</td>
                            <td class="text-center <%=color%>">${equipo.golesContra}</td>
                            <td class="text-center <%=color%>">${equipo.diferenciaGol}</td>
                            <td class="text-center <%=color%>">${equipo.puntos}</td>
                            <%pos++;%>
                        </tr>
                    </c:forEach>
                    <%pos=1;%>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="8"><p class="text-center texto">Grupo F<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto">POS</p></th>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">EQUIPO</p></th>
                        <th scope="col"><p class="text-center texto">PJ</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">PUNTOS</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposFTabla}">
                        <%String color= (pos==1 || pos==2) ? "text-info" : "text-danger";%>
                        <tr>
                            <td class="text-center <%=color%>"><%=pos%></td>
                            <td class="text-center <%=color%>"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center <%=color%>">${equipo.nombre}</td>
                            <td class="text-center <%=color%>">${equipo.partidosJugados}</td>
                            <td class="text-center <%=color%>">${equipo.golesFavor}</td>
                            <td class="text-center <%=color%>">${equipo.golesContra}</td>
                            <td class="text-center <%=color%>">${equipo.diferenciaGol}</td>
                            <td class="text-center <%=color%>">${equipo.puntos}</td>
                            <%pos++;%>
                        </tr>
                    </c:forEach>
                    <%pos=1;%>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="8"><p class="text-center texto">Grupo G<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto">POS</p></th>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">EQUIPO</p></th>
                        <th scope="col"><p class="text-center texto">PJ</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">PUNTOS</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposGTabla}">
                        <%String color= (pos==1 || pos==2) ? "text-info" : "text-danger";%>
                        <tr>
                            <td class="text-center <%=color%>"><%=pos%></td>
                            <td class="text-center <%=color%>"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center <%=color%>">${equipo.nombre}</td>
                            <td class="text-center <%=color%>">${equipo.partidosJugados}</td>
                            <td class="text-center <%=color%>">${equipo.golesFavor}</td>
                            <td class="text-center <%=color%>">${equipo.golesContra}</td>
                            <td class="text-center <%=color%>">${equipo.diferenciaGol}</td>
                            <td class="text-center <%=color%>">${equipo.puntos}</td>
                            <%pos++;%>
                        </tr>
                    </c:forEach>
                    <%pos=1;%>
                    </tbody>

                    <thead>
                    <tr>
                        <th scope="col" colspan="8"><p class="text-center texto">Grupo H<p></p></th>
                    </tr>
                    <tr>
                        <th scope="col"><p class="text-center texto">POS</p></th>
                        <th scope="col"><p class="text-center texto"></p></th>
                        <th scope="col"><p class="text-center texto">EQUIPO</p></th>
                        <th scope="col"><p class="text-center texto">PJ</p></th>
                        <th scope="col"><p class="text-center texto">GF</p></th>
                        <th scope="col"><p class="text-center texto">GC</p></th>
                        <th scope="col"><p class="text-center texto">DG</p></th>
                        <th scope="col"><p class="text-center texto">PUNTOS</p></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="equipo" items="${equiposHTabla}">
                        <%String color= (pos==1 || pos==2) ? "text-info" : "text-danger";%>
                        <tr>
                            <td class="text-center <%=color%>"><%=pos%></td>
                            <td class="text-center <%=color%>"><img src="${equipo.bandera}" alt="" width="20px"></td>
                            <td class="text-center <%=color%>">${equipo.nombre}</td>
                            <td class="text-center <%=color%>">${equipo.partidosJugados}</td>
                            <td class="text-center <%=color%>">${equipo.golesFavor}</td>
                            <td class="text-center <%=color%>">${equipo.golesContra}</td>
                            <td class="text-center <%=color%>">${equipo.diferenciaGol}</td>
                            <td class="text-center <%=color%>">${equipo.puntos}</td>
                            <%pos++;%>
                        </tr>
                    </c:forEach>
                    <%pos=1;%>
                    </tbody>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
