package controller;

import datos.EquipoDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Equipo;

import java.io.IOException;
import java.util.List;

@WebServlet("/ServletEquipo")
public class ServletEquipo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.accionDefult(request, response);
    }

    private void accionDefult(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String accion = request.getParameter("accion");
        if (accion != null){
            switch (accion) {
                case "fecha1":
                    this.fecha1(request, response, accion);
                    break;
                case "fecha2":
                    this.fecha2(request, response, accion);
                    break;
                case "fecha3":
                    this.fecha3(request, response, accion);
                    break;
                case "octavos":
                    this.octavosFinal(request, response, accion);
                    break;
                case "restart":
                    this.restart(request, response, accion);
                    break;
                default:
                    this.grupos(request,response, accion);
            }
        } else {
            this.grupos(request,response, accion);
        }
    }


    private void grupos(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        if (accion.equalsIgnoreCase("fecha1") || accion.equalsIgnoreCase("fecha2") || accion.equalsIgnoreCase("fecha3")){
            List<Equipo> equiposA = new EquipoDao().listarA();
            List<Equipo> equiposB = new EquipoDao().listarB();
            List<Equipo> equiposC = new EquipoDao().listarC();
            List<Equipo> equiposD = new EquipoDao().listarD();
            List<Equipo> equiposE = new EquipoDao().listarE();
            List<Equipo> equiposF = new EquipoDao().listarF();
            List<Equipo> equiposG = new EquipoDao().listarG();
            List<Equipo> equiposH = new EquipoDao().listarH();
            HttpSession sesion = request.getSession();
            sesion.setAttribute("equiposA", equiposA);
            sesion.setAttribute("equiposB", equiposB);
            sesion.setAttribute("equiposC", equiposC);
            sesion.setAttribute("equiposD", equiposD);
            sesion.setAttribute("equiposE", equiposE);
            sesion.setAttribute("equiposF", equiposF);
            sesion.setAttribute("equiposG", equiposG);
            sesion.setAttribute("equiposH", equiposH);
        } else if (accion.equalsIgnoreCase("octavos")) {
            List<Equipo> EquiposOctavos = new EquipoDao().listarOctFin();
            HttpSession sesion = request.getSession();
            sesion.setAttribute("EquiposOctavos", EquiposOctavos);

        } else if (accion.equalsIgnoreCase("cuartos")) {
            this.datos(request,response,accion);
            List<Equipo> EquiposCuartos = new EquipoDao().listarCuaFin();
            HttpSession sesion = request.getSession();
            sesion.setAttribute("EquiposCuartos", EquiposCuartos);

        }else if (accion.equalsIgnoreCase("semifinal")) {
            this.datos(request,response,accion);
            List<Equipo> EquiposSemifinal = new EquipoDao().listarSemifinal();
            HttpSession sesion = request.getSession();
            sesion.setAttribute("EquiposSemifinal", EquiposSemifinal);

        }else if (accion.equalsIgnoreCase("final")) {
            this.datos(request,response,accion);
            List<Equipo> EquiposFinal = new EquipoDao().listarFinal();
            HttpSession sesion = request.getSession();
            sesion.setAttribute("EquiposFinal", EquiposFinal);

        }else if (accion.equalsIgnoreCase("campeon")) {
            this.datos(request,response,accion);
            List<Equipo> EquiposCampeon = new EquipoDao().listarCampeon();
            HttpSession sesion = request.getSession();
            sesion.setAttribute("EquiposCampeon", EquiposCampeon);

        } else if (accion.equalsIgnoreCase("restart")) {
            new EquipoDao().eliminarOctavos();
            new EquipoDao().eliminarCuartos();
            new EquipoDao().eliminarSemifinal();
            new EquipoDao().eliminarFinal();
            new EquipoDao().actualizarRestart();
        }

    }

    private void fecha1(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("fecha1.jsp");
    }

    private void fecha2(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("fecha2.jsp");
    }

    private void fecha3(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("fecha3.jsp");
    }

    private void octavosFinal(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("octavosFinal.jsp");
    }

    private void restart(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("index.jsp");
    }

    private void cuartosFinal(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("cuartosFinal.jsp");
    }

    private void semifinal(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("semifinal.jsp");
    }

    private void finalMun(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("final.jsp");
    }
    private void campeon(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        this.grupos(request, response, accion);
        response.sendRedirect("campeon.jsp");
    }

    private void tabla(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException{
        List<Equipo> equiposATabla = new EquipoDao().listarATabla();
        List<Equipo> equiposBTabla = new EquipoDao().listarBTabla();
        List<Equipo> equiposCTabla = new EquipoDao().listarCTabla();
        List<Equipo> equiposDTabla = new EquipoDao().listarDTabla();
        List<Equipo> equiposETabla = new EquipoDao().listarETabla();
        List<Equipo> equiposFTabla = new EquipoDao().listarFTabla();
        List<Equipo> equiposGTabla = new EquipoDao().listarGTabla();
        List<Equipo> equiposHTabla = new EquipoDao().listarHTabla();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("equiposATabla", equiposATabla);
        sesion.setAttribute("equiposBTabla", equiposBTabla);
        sesion.setAttribute("equiposCTabla", equiposCTabla);
        sesion.setAttribute("equiposDTabla", equiposDTabla);
        sesion.setAttribute("equiposETabla", equiposETabla);
        sesion.setAttribute("equiposFTabla", equiposFTabla);
        sesion.setAttribute("equiposGTabla", equiposGTabla);
        sesion.setAttribute("equiposHTabla", equiposHTabla);

        if(accion.equalsIgnoreCase("actualizarF1")){
            response.sendRedirect("resultadosUno.jsp");
        }

        if(accion.equalsIgnoreCase("actualizarF2")){
            response.sendRedirect("resultadosDos.jsp");
        }

        if(accion.equalsIgnoreCase("actualizarF3")){
            response.sendRedirect("resultadosTres.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null){
            switch (accion) {
                case "actualizarF1":
                    this.actualizarEquipo(request, response, accion);
                    break;
                case "actualizarF2":
                    this.actualizarEquipo(request, response, accion);
                    break;
                case "actualizarF3":
                    this.actualizarEquipo(request, response, accion);
                    break;
                case "cuartos":
                    this.cuartosFinal(request, response, accion);
                    break;
                case "semifinal":
                    this.semifinal(request, response, accion);
                    break;
                case "final":
                    this.finalMun(request, response, accion);
                    break;
                case "campeon":
                    this.campeon(request, response, accion);
                    break;
                default:
                    this.accionDefult(request,response);
            }
        } else {
            this.accionDefult(request,response);
        }
    }

    private void actualizarEquipo(HttpServletRequest request, HttpServletResponse response, String accion) throws IOException {

        this.datos(request,response, accion);

        //Redirigimos hacia accion por default
        //if (accion.equalsIgnoreCase("actualizarF1")){
            this.tabla(request,response, accion);
        //}
        //this.accionDefult(request, response);
    }
    public void datos(HttpServletRequest request, HttpServletResponse response, String accion)throws IOException {

        if (accion.equalsIgnoreCase("actualizarF1")|| accion.equalsIgnoreCase("actualizarF2") || accion.equalsIgnoreCase("actualizarF3")){
            //recuperamos los valores del formulario
            int idUnoA = Integer.parseInt(request.getParameter("equipo_uno_a")); //cambiar
            int golesUnoA = Integer.parseInt(request.getParameter("goles_uno_a"));
            int idDosA = Integer.parseInt(request.getParameter("equipo_dos_a")); //cambiar
            int golesDosA = Integer.parseInt(request.getParameter("goles_dos_a"));
            int idTresA = Integer.parseInt(request.getParameter("equipo_tres_a")); //cambiar
            int golesTresA = Integer.parseInt(request.getParameter("goles_tres_a"));
            int idCuatroA = Integer.parseInt(request.getParameter("equipo_cuatro_a")); //cambiar
            int golesCuatroA = Integer.parseInt(request.getParameter("goles_cuatro_a"));
            int idUnoB = Integer.parseInt(request.getParameter("equipo_uno_b")); //cambiar
            int golesUnoB = Integer.parseInt(request.getParameter("goles_uno_b"));
            int idDosB = Integer.parseInt(request.getParameter("equipo_dos_b")); //cambiar
            int golesDosB = Integer.parseInt(request.getParameter("goles_dos_b"));
            int idTresB = Integer.parseInt(request.getParameter("equipo_tres_b")); //cambiar
            int golesTresB = Integer.parseInt(request.getParameter("goles_tres_b"));
            int idCuatroB = Integer.parseInt(request.getParameter("equipo_cuatro_b")); //cambiar
            int golesCuatroB = Integer.parseInt(request.getParameter("goles_cuatro_b"));
            int idUnoC = Integer.parseInt(request.getParameter("equipo_uno_c")); //cambiar
            int golesUnoC = Integer.parseInt(request.getParameter("goles_uno_c"));
            int idDosC = Integer.parseInt(request.getParameter("equipo_dos_c")); //cambiar
            int golesDosC = Integer.parseInt(request.getParameter("goles_dos_c"));
            int idTresC = Integer.parseInt(request.getParameter("equipo_tres_c")); //cambiar
            int golesTresC = Integer.parseInt(request.getParameter("goles_tres_c"));
            int idCuatroC = Integer.parseInt(request.getParameter("equipo_cuatro_c")); //cambiar
            int golesCuatroC = Integer.parseInt(request.getParameter("goles_cuatro_c"));
            int idUnoD = Integer.parseInt(request.getParameter("equipo_uno_d")); //cambiar
            int golesUnoD = Integer.parseInt(request.getParameter("goles_uno_d"));
            int idDosD = Integer.parseInt(request.getParameter("equipo_dos_d")); //cambiar
            int golesDosD = Integer.parseInt(request.getParameter("goles_dos_d"));
            int idTresD = Integer.parseInt(request.getParameter("equipo_tres_d")); //cambiar
            int golesTresD = Integer.parseInt(request.getParameter("goles_tres_d"));
            int idCuatroD = Integer.parseInt(request.getParameter("equipo_cuatro_d")); //cambiar
            int golesCuatroD = Integer.parseInt(request.getParameter("goles_cuatro_d"));
            int idUnoE = Integer.parseInt(request.getParameter("equipo_uno_e")); //cambiar
            int golesUnoE = Integer.parseInt(request.getParameter("goles_uno_e"));
            int idDosE = Integer.parseInt(request.getParameter("equipo_dos_e")); //cambiar
            int golesDosE = Integer.parseInt(request.getParameter("goles_dos_e"));
            int idTresE = Integer.parseInt(request.getParameter("equipo_tres_e")); //cambiar
            int golesTresE = Integer.parseInt(request.getParameter("goles_tres_e"));
            int idCuatroE = Integer.parseInt(request.getParameter("equipo_cuatro_e")); //cambiar
            int golesCuatroE = Integer.parseInt(request.getParameter("goles_cuatro_e"));
            int idUnoF = Integer.parseInt(request.getParameter("equipo_uno_f")); //cambiar
            int golesUnoF = Integer.parseInt(request.getParameter("goles_uno_f"));
            int idDosF = Integer.parseInt(request.getParameter("equipo_dos_f")); //cambiar
            int golesDosF = Integer.parseInt(request.getParameter("goles_dos_f"));
            int idTresF = Integer.parseInt(request.getParameter("equipo_tres_f")); //cambiar
            int golesTresF = Integer.parseInt(request.getParameter("goles_tres_f"));
            int idCuatroF = Integer.parseInt(request.getParameter("equipo_cuatro_f")); //cambiar
            int golesCuatroF = Integer.parseInt(request.getParameter("goles_cuatro_f"));
            int idUnoG = Integer.parseInt(request.getParameter("equipo_uno_g")); //cambiar
            int golesUnoG = Integer.parseInt(request.getParameter("goles_uno_g"));
            int idDosG = Integer.parseInt(request.getParameter("equipo_dos_g")); //cambiar
            int golesDosG = Integer.parseInt(request.getParameter("goles_dos_g"));
            int idTresG = Integer.parseInt(request.getParameter("equipo_tres_g")); //cambiar
            int golesTresG = Integer.parseInt(request.getParameter("goles_tres_g"));
            int idCuatroG = Integer.parseInt(request.getParameter("equipo_cuatro_g")); //cambiar
            int golesCuatroG = Integer.parseInt(request.getParameter("goles_cuatro_g"));
            int idUnoH = Integer.parseInt(request.getParameter("equipo_uno_h")); //cambiar
            int golesUnoH = Integer.parseInt(request.getParameter("goles_uno_h"));
            int idDosH = Integer.parseInt(request.getParameter("equipo_dos_h")); //cambiar
            int golesDosH = Integer.parseInt(request.getParameter("goles_dos_h"));
            int idTresH = Integer.parseInt(request.getParameter("equipo_tres_h")); //cambiar
            int golesTresH = Integer.parseInt(request.getParameter("goles_tres_h"));
            int idCuatroH = Integer.parseInt(request.getParameter("equipo_cuatro_h")); //cambiar
            int golesCuatroH = Integer.parseInt(request.getParameter("goles_cuatro_h"));

            //Creamos el objeto (modelo)
            if (accion.equalsIgnoreCase("actualizarF1")){

                Equipo equipoUnoA = new Equipo(idUnoA,golesUnoA,golesDosA);
                Equipo equipoDosA = new Equipo(idDosA,golesDosA,golesUnoA);
                Equipo equipoTresA = new Equipo(idTresA,golesTresA,golesCuatroA);
                Equipo equipoCuatroA = new Equipo(idCuatroA,golesCuatroA,golesTresA);
                Equipo equipoUnoB = new Equipo(idUnoB,golesUnoB,golesDosB);
                Equipo equipoDosB = new Equipo(idDosB,golesDosB,golesUnoB);
                Equipo equipoTresB = new Equipo(idTresB,golesTresB,golesCuatroB);
                Equipo equipoCuatroB = new Equipo(idCuatroB,golesCuatroB,golesTresB);
                Equipo equipoUnoC = new Equipo(idUnoC,golesUnoC,golesDosC);
                Equipo equipoDosC = new Equipo(idDosC,golesDosC,golesUnoC);
                Equipo equipoTresC = new Equipo(idTresC,golesTresC,golesCuatroC);
                Equipo equipoCuatroC = new Equipo(idCuatroC,golesCuatroC,golesTresC);
                Equipo equipoUnoD = new Equipo(idUnoD,golesUnoD,golesDosD);
                Equipo equipoDosD = new Equipo(idDosD,golesDosD,golesUnoD);
                Equipo equipoTresD = new Equipo(idTresD,golesTresD,golesCuatroD);
                Equipo equipoCuatroD = new Equipo(idCuatroD,golesCuatroD,golesTresD);
                Equipo equipoUnoE = new Equipo(idUnoE,golesUnoE,golesDosE);
                Equipo equipoDosE = new Equipo(idDosE,golesDosE,golesUnoE);
                Equipo equipoTresE = new Equipo(idTresE,golesTresE,golesCuatroE);
                Equipo equipoCuatroE = new Equipo(idCuatroE,golesCuatroE,golesTresE);
                Equipo equipoUnoF = new Equipo(idUnoF,golesUnoF,golesDosF);
                Equipo equipoDosF = new Equipo(idDosF,golesDosF,golesUnoF);
                Equipo equipoTresF = new Equipo(idTresF,golesTresF,golesCuatroF);
                Equipo equipoCuatroF = new Equipo(idCuatroF,golesCuatroF,golesTresF);
                Equipo equipoUnoG = new Equipo(idUnoG,golesUnoG,golesDosG);
                Equipo equipoDosG = new Equipo(idDosG,golesDosG,golesUnoG);
                Equipo equipoTresG = new Equipo(idTresG,golesTresG,golesCuatroG);
                Equipo equipoCuatroG = new Equipo(idCuatroG,golesCuatroG,golesTresG);
                Equipo equipoUnoH = new Equipo(idUnoH,golesUnoH,golesDosH);
                Equipo equipoDosH = new Equipo(idDosH,golesDosH,golesUnoH);
                Equipo equipoTresH = new Equipo(idTresH,golesTresH,golesCuatroH);
                Equipo equipoCuatroH = new Equipo(idCuatroH,golesCuatroH,golesTresH);

                //Insertamos el nuevo objeto a la base de datos
                new EquipoDao().actualizarA(equipoUnoA);
                new EquipoDao().actualizarA(equipoDosA);
                new EquipoDao().actualizarA(equipoTresA);
                new EquipoDao().actualizarA(equipoCuatroA);
                new EquipoDao().actualizarB(equipoUnoB);
                new EquipoDao().actualizarB(equipoDosB);
                new EquipoDao().actualizarB(equipoTresB);
                new EquipoDao().actualizarB(equipoCuatroB);
                new EquipoDao().actualizarC(equipoUnoC);
                new EquipoDao().actualizarC(equipoDosC);
                new EquipoDao().actualizarC(equipoTresC);
                new EquipoDao().actualizarC(equipoCuatroC);
                new EquipoDao().actualizarD(equipoUnoD);
                new EquipoDao().actualizarD(equipoDosD);
                new EquipoDao().actualizarD(equipoTresD);
                new EquipoDao().actualizarD(equipoCuatroD);
                new EquipoDao().actualizarE(equipoUnoE);
                new EquipoDao().actualizarE(equipoDosE);
                new EquipoDao().actualizarE(equipoTresE);
                new EquipoDao().actualizarE(equipoCuatroE);
                new EquipoDao().actualizarF(equipoUnoF);
                new EquipoDao().actualizarF(equipoDosF);
                new EquipoDao().actualizarF(equipoTresF);
                new EquipoDao().actualizarF(equipoCuatroF);
                new EquipoDao().actualizarG(equipoUnoG);
                new EquipoDao().actualizarG(equipoDosG);
                new EquipoDao().actualizarG(equipoTresG);
                new EquipoDao().actualizarG(equipoCuatroG);
                new EquipoDao().actualizarH(equipoUnoH);
                new EquipoDao().actualizarH(equipoDosH);
                new EquipoDao().actualizarH(equipoTresH);
                new EquipoDao().actualizarH(equipoCuatroH);

            }else if (accion.equalsIgnoreCase("actualizarF2")){

                Equipo equipoUnoA = new Equipo(idUnoA,golesUnoA,golesTresA);
                Equipo equipoDosA = new Equipo(idDosA,golesDosA,golesCuatroA);
                Equipo equipoTresA = new Equipo(idTresA,golesTresA,golesUnoA);
                Equipo equipoCuatroA = new Equipo(idCuatroA,golesCuatroA,golesDosA);
                Equipo equipoUnoB = new Equipo(idUnoB,golesUnoB,golesTresB);
                Equipo equipoDosB = new Equipo(idDosB,golesDosB,golesCuatroB);
                Equipo equipoTresB = new Equipo(idTresB,golesTresB,golesUnoB);
                Equipo equipoCuatroB = new Equipo(idCuatroB,golesCuatroB,golesDosB);
                Equipo equipoUnoC = new Equipo(idUnoC,golesUnoC,golesTresC);
                Equipo equipoDosC = new Equipo(idDosC,golesDosC,golesCuatroC);
                Equipo equipoTresC = new Equipo(idTresC,golesTresC,golesUnoC);
                Equipo equipoCuatroC = new Equipo(idCuatroC,golesCuatroC,golesDosC);
                Equipo equipoUnoD = new Equipo(idUnoD,golesUnoD,golesTresD);
                Equipo equipoDosD = new Equipo(idDosD,golesDosD,golesCuatroD);
                Equipo equipoTresD = new Equipo(idTresD,golesTresD,golesUnoD);
                Equipo equipoCuatroD = new Equipo(idCuatroD,golesCuatroD,golesDosD);
                Equipo equipoUnoE = new Equipo(idUnoE,golesUnoE,golesTresE);
                Equipo equipoDosE = new Equipo(idDosE,golesDosE,golesCuatroE);
                Equipo equipoTresE = new Equipo(idTresE,golesTresE,golesUnoE);
                Equipo equipoCuatroE = new Equipo(idCuatroE,golesCuatroE,golesDosE);
                Equipo equipoUnoF = new Equipo(idUnoF,golesUnoF,golesTresF);
                Equipo equipoDosF = new Equipo(idDosF,golesDosF,golesCuatroF);
                Equipo equipoTresF = new Equipo(idTresF,golesTresF,golesUnoF);
                Equipo equipoCuatroF = new Equipo(idCuatroF,golesCuatroF,golesDosF);
                Equipo equipoUnoG = new Equipo(idUnoG,golesUnoG,golesTresG);
                Equipo equipoDosG = new Equipo(idDosG,golesDosG,golesCuatroG);
                Equipo equipoTresG = new Equipo(idTresG,golesTresG,golesUnoG);
                Equipo equipoCuatroG = new Equipo(idCuatroG,golesCuatroG,golesDosG);
                Equipo equipoUnoH = new Equipo(idUnoH,golesUnoH,golesTresH);
                Equipo equipoDosH = new Equipo(idDosH,golesDosH,golesCuatroH);
                Equipo equipoTresH = new Equipo(idTresH,golesTresH,golesUnoH);
                Equipo equipoCuatroH = new Equipo(idCuatroH,golesCuatroH,golesDosH);

                //Insertamos el nuevo objeto a la base de datos
                new EquipoDao().actualizarA(equipoUnoA);
                new EquipoDao().actualizarA(equipoDosA);
                new EquipoDao().actualizarA(equipoTresA);
                new EquipoDao().actualizarA(equipoCuatroA);
                new EquipoDao().actualizarB(equipoUnoB);
                new EquipoDao().actualizarB(equipoDosB);
                new EquipoDao().actualizarB(equipoTresB);
                new EquipoDao().actualizarB(equipoCuatroB);
                new EquipoDao().actualizarC(equipoUnoC);
                new EquipoDao().actualizarC(equipoDosC);
                new EquipoDao().actualizarC(equipoTresC);
                new EquipoDao().actualizarC(equipoCuatroC);
                new EquipoDao().actualizarD(equipoUnoD);
                new EquipoDao().actualizarD(equipoDosD);
                new EquipoDao().actualizarD(equipoTresD);
                new EquipoDao().actualizarD(equipoCuatroD);
                new EquipoDao().actualizarE(equipoUnoE);
                new EquipoDao().actualizarE(equipoDosE);
                new EquipoDao().actualizarE(equipoTresE);
                new EquipoDao().actualizarE(equipoCuatroE);
                new EquipoDao().actualizarF(equipoUnoF);
                new EquipoDao().actualizarF(equipoDosF);
                new EquipoDao().actualizarF(equipoTresF);
                new EquipoDao().actualizarF(equipoCuatroF);
                new EquipoDao().actualizarG(equipoUnoG);
                new EquipoDao().actualizarG(equipoDosG);
                new EquipoDao().actualizarG(equipoTresG);
                new EquipoDao().actualizarG(equipoCuatroG);
                new EquipoDao().actualizarH(equipoUnoH);
                new EquipoDao().actualizarH(equipoDosH);
                new EquipoDao().actualizarH(equipoTresH);
                new EquipoDao().actualizarH(equipoCuatroH);

            }else if (accion.equalsIgnoreCase("actualizarF3")){

                Equipo equipoUnoA = new Equipo(idUnoA,golesUnoA,golesCuatroA);
                Equipo equipoDosA = new Equipo(idDosA,golesDosA,golesTresA);
                Equipo equipoTresA = new Equipo(idTresA,golesTresA,golesDosA);
                Equipo equipoCuatroA = new Equipo(idCuatroA,golesCuatroA,golesUnoA);
                Equipo equipoUnoB = new Equipo(idUnoB,golesUnoB,golesCuatroB);
                Equipo equipoDosB = new Equipo(idDosB,golesDosB,golesTresB);
                Equipo equipoTresB = new Equipo(idTresB,golesTresB,golesDosB);
                Equipo equipoCuatroB = new Equipo(idCuatroB,golesCuatroB,golesUnoB);
                Equipo equipoUnoC = new Equipo(idUnoC,golesUnoC,golesCuatroC);
                Equipo equipoDosC = new Equipo(idDosC,golesDosC,golesTresC);
                Equipo equipoTresC = new Equipo(idTresC,golesTresC,golesDosC);
                Equipo equipoCuatroC = new Equipo(idCuatroC,golesCuatroC,golesUnoC);
                Equipo equipoUnoD = new Equipo(idUnoD,golesUnoD,golesCuatroD);
                Equipo equipoDosD = new Equipo(idDosD,golesDosD,golesTresD);
                Equipo equipoTresD = new Equipo(idTresD,golesTresD,golesDosD);
                Equipo equipoCuatroD = new Equipo(idCuatroD,golesCuatroD,golesUnoD);
                Equipo equipoUnoE = new Equipo(idUnoE,golesUnoE,golesCuatroE);
                Equipo equipoDosE = new Equipo(idDosE,golesDosE,golesTresE);
                Equipo equipoTresE = new Equipo(idTresE,golesTresE,golesDosE);
                Equipo equipoCuatroE = new Equipo(idCuatroE,golesCuatroE,golesUnoE);
                Equipo equipoUnoF = new Equipo(idUnoF,golesUnoF,golesCuatroF);
                Equipo equipoDosF = new Equipo(idDosF,golesDosF,golesTresF);
                Equipo equipoTresF = new Equipo(idTresF,golesTresF,golesDosF);
                Equipo equipoCuatroF = new Equipo(idCuatroF,golesCuatroF,golesUnoF);
                Equipo equipoUnoG = new Equipo(idUnoG,golesUnoG,golesCuatroG);
                Equipo equipoDosG = new Equipo(idDosG,golesDosG,golesTresG);
                Equipo equipoTresG = new Equipo(idTresG,golesTresG,golesDosG);
                Equipo equipoCuatroG = new Equipo(idCuatroG,golesCuatroG,golesUnoG);
                Equipo equipoUnoH = new Equipo(idUnoH,golesUnoH,golesCuatroH);
                Equipo equipoDosH = new Equipo(idDosH,golesDosH,golesTresH);
                Equipo equipoTresH = new Equipo(idTresH,golesTresH,golesDosH);
                Equipo equipoCuatroH = new Equipo(idCuatroH,golesCuatroH,golesUnoH);

                //Insertamos el nuevo objeto a la base de datos
                new EquipoDao().actualizarA(equipoUnoA);
                new EquipoDao().actualizarA(equipoDosA);
                new EquipoDao().actualizarA(equipoTresA);
                new EquipoDao().actualizarA(equipoCuatroA);
                new EquipoDao().actualizarB(equipoUnoB);
                new EquipoDao().actualizarB(equipoDosB);
                new EquipoDao().actualizarB(equipoTresB);
                new EquipoDao().actualizarB(equipoCuatroB);
                new EquipoDao().actualizarC(equipoUnoC);
                new EquipoDao().actualizarC(equipoDosC);
                new EquipoDao().actualizarC(equipoTresC);
                new EquipoDao().actualizarC(equipoCuatroC);
                new EquipoDao().actualizarD(equipoUnoD);
                new EquipoDao().actualizarD(equipoDosD);
                new EquipoDao().actualizarD(equipoTresD);
                new EquipoDao().actualizarD(equipoCuatroD);
                new EquipoDao().actualizarE(equipoUnoE);
                new EquipoDao().actualizarE(equipoDosE);
                new EquipoDao().actualizarE(equipoTresE);
                new EquipoDao().actualizarE(equipoCuatroE);
                new EquipoDao().actualizarF(equipoUnoF);
                new EquipoDao().actualizarF(equipoDosF);
                new EquipoDao().actualizarF(equipoTresF);
                new EquipoDao().actualizarF(equipoCuatroF);
                new EquipoDao().actualizarG(equipoUnoG);
                new EquipoDao().actualizarG(equipoDosG);
                new EquipoDao().actualizarG(equipoTresG);
                new EquipoDao().actualizarG(equipoCuatroG);
                new EquipoDao().actualizarH(equipoUnoH);
                new EquipoDao().actualizarH(equipoDosH);
                new EquipoDao().actualizarH(equipoTresH);
                new EquipoDao().actualizarH(equipoCuatroH);

            }
        }else if (accion.equalsIgnoreCase("cuartos") || accion.equalsIgnoreCase("semifinal")|| accion.equalsIgnoreCase("final" )|| accion.equalsIgnoreCase("campeon" )){
            if (accion.equalsIgnoreCase("cuartos")){
                int idUno = Integer.parseInt(request.getParameter("equipo_uno")); //cambiar
                int golesUno = Integer.parseInt(request.getParameter("goles_uno"));
                int idDos = Integer.parseInt(request.getParameter("equipo_dos")); //cambiar
                int golesDos = Integer.parseInt(request.getParameter("goles_dos"));
                int idTres = Integer.parseInt(request.getParameter("equipo_tres")); //cambiar
                int golesTres = Integer.parseInt(request.getParameter("goles_tres"));
                int idCuatro = Integer.parseInt(request.getParameter("equipo_cuatro")); //cambiar
                int golesCuatro = Integer.parseInt(request.getParameter("goles_cuatro"));
                int idCinco = Integer.parseInt(request.getParameter("equipo_cinco")); //cambiar
                int golesCinco = Integer.parseInt(request.getParameter("goles_cinco"));
                int idSeis = Integer.parseInt(request.getParameter("equipo_seis")); //cambiar
                int golesSeis = Integer.parseInt(request.getParameter("goles_seis"));
                int idSiete = Integer.parseInt(request.getParameter("equipo_siete")); //cambiar
                int golesSiete = Integer.parseInt(request.getParameter("goles_siete"));
                int idOcho = Integer.parseInt(request.getParameter("equipo_ocho")); //cambiar
                int golesOcho = Integer.parseInt(request.getParameter("goles_ocho"));
                int idNueve = Integer.parseInt(request.getParameter("equipo_nueve")); //cambiar
                int golesNueve = Integer.parseInt(request.getParameter("goles_nueve"));
                int idDiez = Integer.parseInt(request.getParameter("equipo_diez")); //cambiar
                int golesDiez = Integer.parseInt(request.getParameter("goles_diez"));
                int idOnce = Integer.parseInt(request.getParameter("equipo_once")); //cambiar
                int golesOnce = Integer.parseInt(request.getParameter("goles_once"));
                int idDoce = Integer.parseInt(request.getParameter("equipo_doce")); //cambiar
                int golesDoce = Integer.parseInt(request.getParameter("goles_doce"));
                int idTrece = Integer.parseInt(request.getParameter("equipo_trece")); //cambiar
                int golesTrece = Integer.parseInt(request.getParameter("goles_trece"));
                int idCatorce = Integer.parseInt(request.getParameter("equipo_catorce")); //cambiar
                int golesCatorce = Integer.parseInt(request.getParameter("goles_catorce"));
                int idQuince = Integer.parseInt(request.getParameter("equipo_quince")); //cambiar
                int golesQuince = Integer.parseInt(request.getParameter("goles_quince"));
                int idDieciseis = Integer.parseInt(request.getParameter("equipo_dieciseis")); //cambiar
                int golesDieciseis = Integer.parseInt(request.getParameter("goles_dieciseis"));

                //Para colocar el orden de los partidos de cuartos de final

                int ordenUno = Integer.parseInt(request.getParameter("orden_uno"));
                int ordenDos = Integer.parseInt(request.getParameter("orden_dos"));
                int ordenTres = Integer.parseInt(request.getParameter("orden_tres"));
                int ordenCuatro = Integer.parseInt(request.getParameter("orden_cuatro"));
                int ordenCinco = Integer.parseInt(request.getParameter("orden_cinco"));
                int ordenSeis = Integer.parseInt(request.getParameter("orden_seis"));
                int ordenSiete = Integer.parseInt(request.getParameter("orden_siete"));
                int ordenOcho = Integer.parseInt(request.getParameter("orden_ocho"));
                int ordenNueve = Integer.parseInt(request.getParameter("orden_nueve"));
                int ordenDiez = Integer.parseInt(request.getParameter("orden_diez"));
                int ordenOnce = Integer.parseInt(request.getParameter("orden_once"));
                int ordenDoce = Integer.parseInt(request.getParameter("orden_doce"));
                int ordenTrece = Integer.parseInt(request.getParameter("orden_trece"));
                int ordenCatorce = Integer.parseInt(request.getParameter("orden_catorce"));
                int ordenQuince = Integer.parseInt(request.getParameter("orden_quince"));
                int ordenDieciseis = Integer.parseInt(request.getParameter("orden_dieciseis"));

                Equipo equipoUno = new Equipo(idUno,golesUno,golesDos,ordenUno);
                Equipo equipoDos = new Equipo(idDos,golesDos,golesUno,ordenDos);
                Equipo equipoTres = new Equipo(idTres,golesTres,golesCuatro,ordenTres);
                Equipo equipoCuatro = new Equipo(idCuatro,golesCuatro,golesTres,ordenCuatro);
                Equipo equipoCinco = new Equipo(idCinco,golesCinco,golesSeis,ordenCinco);
                Equipo equipoSeis = new Equipo(idSeis,golesSeis,golesCinco,ordenSeis);
                Equipo equipoSiete = new Equipo(idSiete,golesSiete,golesOcho,ordenSiete);
                Equipo equipoOcho = new Equipo(idOcho,golesOcho,golesSiete,ordenOcho);
                Equipo equipoNueve = new Equipo(idNueve,golesNueve,golesDiez,ordenNueve);
                Equipo equipoDiez = new Equipo(idDiez,golesDiez,golesNueve,ordenDiez);
                Equipo equipoOnce = new Equipo(idOnce,golesOnce,golesDoce,ordenOnce);
                Equipo equipoDoce = new Equipo(idDoce,golesDoce,golesOnce,ordenDoce);
                Equipo equipoTrece = new Equipo(idTrece,golesTrece,golesCatorce,ordenTrece);
                Equipo equipoCatorce = new Equipo(idCatorce,golesCatorce,golesTrece,ordenCatorce);
                Equipo equipoQuince = new Equipo(idQuince,golesQuince,golesDieciseis,ordenQuince);
                Equipo equipoDieciseis = new Equipo(idDieciseis,golesDieciseis,golesQuince,ordenDieciseis);

                //Insertamos el nuevo objeto a la base de datos
                new EquipoDao().actualizarOctFin(equipoUno);
                new EquipoDao().actualizarOctFin(equipoDos);
                new EquipoDao().actualizarOctFin(equipoTres);
                new EquipoDao().actualizarOctFin(equipoCuatro);
                new EquipoDao().actualizarOctFin(equipoCinco);
                new EquipoDao().actualizarOctFin(equipoSeis);
                new EquipoDao().actualizarOctFin(equipoSiete);
                new EquipoDao().actualizarOctFin(equipoOcho);
                new EquipoDao().actualizarOctFin(equipoNueve);
                new EquipoDao().actualizarOctFin(equipoDiez);
                new EquipoDao().actualizarOctFin(equipoOnce);
                new EquipoDao().actualizarOctFin(equipoDoce);
                new EquipoDao().actualizarOctFin(equipoTrece);
                new EquipoDao().actualizarOctFin(equipoCatorce);
                new EquipoDao().actualizarOctFin(equipoQuince);
                new EquipoDao().actualizarOctFin(equipoDieciseis);

            } else if (accion.equalsIgnoreCase("semifinal")) {

                int idUno = Integer.parseInt(request.getParameter("equipo_uno")); //cambiar
                int golesUno = Integer.parseInt(request.getParameter("goles_uno"));
                int idDos = Integer.parseInt(request.getParameter("equipo_dos")); //cambiar
                int golesDos = Integer.parseInt(request.getParameter("goles_dos"));
                int idTres = Integer.parseInt(request.getParameter("equipo_tres")); //cambiar
                int golesTres = Integer.parseInt(request.getParameter("goles_tres"));
                int idCuatro = Integer.parseInt(request.getParameter("equipo_cuatro")); //cambiar
                int golesCuatro = Integer.parseInt(request.getParameter("goles_cuatro"));
                int idCinco = Integer.parseInt(request.getParameter("equipo_cinco")); //cambiar
                int golesCinco = Integer.parseInt(request.getParameter("goles_cinco"));
                int idSeis = Integer.parseInt(request.getParameter("equipo_seis")); //cambiar
                int golesSeis = Integer.parseInt(request.getParameter("goles_seis"));
                int idSiete = Integer.parseInt(request.getParameter("equipo_siete")); //cambiar
                int golesSiete = Integer.parseInt(request.getParameter("goles_siete"));
                int idOcho = Integer.parseInt(request.getParameter("equipo_ocho")); //cambiar
                int golesOcho = Integer.parseInt(request.getParameter("goles_ocho"));

                Equipo equipoUno = new Equipo(idUno,golesUno,golesDos);
                Equipo equipoDos = new Equipo(idDos,golesDos,golesUno);
                Equipo equipoTres = new Equipo(idTres,golesTres,golesCuatro);
                Equipo equipoCuatro = new Equipo(idCuatro,golesCuatro,golesTres);
                Equipo equipoCinco = new Equipo(idCinco,golesCinco,golesSeis);
                Equipo equipoSeis = new Equipo(idSeis,golesSeis,golesCinco);
                Equipo equipoSiete = new Equipo(idSiete,golesSiete,golesOcho);
                Equipo equipoOcho = new Equipo(idOcho,golesOcho,golesSiete);

                new EquipoDao().actualizarCuaFin(equipoUno);
                new EquipoDao().actualizarCuaFin(equipoDos);
                new EquipoDao().actualizarCuaFin(equipoTres);
                new EquipoDao().actualizarCuaFin(equipoCuatro);
                new EquipoDao().actualizarCuaFin(equipoCinco);
                new EquipoDao().actualizarCuaFin(equipoSeis);
                new EquipoDao().actualizarCuaFin(equipoSiete);
                new EquipoDao().actualizarCuaFin(equipoOcho);
            } else if (accion.equalsIgnoreCase("final" )) {

                int idUno = Integer.parseInt(request.getParameter("equipo_uno")); //cambiar
                int golesUno = Integer.parseInt(request.getParameter("goles_uno"));
                int idDos = Integer.parseInt(request.getParameter("equipo_dos")); //cambiar
                int golesDos = Integer.parseInt(request.getParameter("goles_dos"));
                int idTres = Integer.parseInt(request.getParameter("equipo_tres")); //cambiar
                int golesTres = Integer.parseInt(request.getParameter("goles_tres"));
                int idCuatro = Integer.parseInt(request.getParameter("equipo_cuatro")); //cambiar
                int golesCuatro = Integer.parseInt(request.getParameter("goles_cuatro"));

                Equipo equipoUno = new Equipo(idUno,golesUno,golesDos);
                Equipo equipoDos = new Equipo(idDos,golesDos,golesUno);
                Equipo equipoTres = new Equipo(idTres,golesTres,golesCuatro);
                Equipo equipoCuatro = new Equipo(idCuatro,golesCuatro,golesTres);

                new EquipoDao().actualizarSemifinal(equipoUno);
                new EquipoDao().actualizarSemifinal(equipoDos);
                new EquipoDao().actualizarSemifinal(equipoTres);
                new EquipoDao().actualizarSemifinal(equipoCuatro);
            } else if (accion.equalsIgnoreCase("campeon" )) {
                int idUno = Integer.parseInt(request.getParameter("equipo_uno")); //cambiar
                int golesUno = Integer.parseInt(request.getParameter("goles_uno"));
                int idDos = Integer.parseInt(request.getParameter("equipo_dos")); //cambiar
                int golesDos = Integer.parseInt(request.getParameter("goles_dos"));

                Equipo equipoUno = new Equipo(idUno,golesUno,golesDos);
                Equipo equipoDos = new Equipo(idDos,golesDos,golesUno);
                new EquipoDao().actualizarFinal(equipoUno);
                new EquipoDao().actualizarFinal(equipoDos);
            }
        }





    }


}
