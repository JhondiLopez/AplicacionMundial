package datos;

import model.Equipo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipoDao {

    private static final String SELECT_A_TAB="Select id_grupo_a, nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, partidos_jugados, bandera from grupo_a order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc ";
    private static final String SELECT_A="Select * from grupo_a";
    private static final String SELECT_B_TAB="Select id_grupo_b, nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, partidos_jugados, bandera from grupo_b order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc ";
    private static final String SELECT_B="Select * from grupo_b";
    private static final String SELECT_C_TAB="Select id_grupo_c, nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, partidos_jugados, bandera from grupo_c order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc ";
    private static final String SELECT_C="Select * from grupo_c";
    private static final String SELECT_D_TAB="Select id_grupo_d, nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, partidos_jugados, bandera from grupo_d order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc ";
    private static final String SELECT_D="Select * from grupo_d  ";
    private static final String SELECT_E_TAB="Select id_grupo_e, nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, partidos_jugados, bandera from grupo_e order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc ";
    private static final String SELECT_E="Select * from grupo_e ";
    private static final String SELECT_F_TAB="Select id_grupo_f, nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, partidos_jugados, bandera from grupo_f order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc ";
    private static final String SELECT_F="Select * from grupo_f ";
    private static final String SELECT_G_TAB="Select id_grupo_g, nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, partidos_jugados, bandera from grupo_g order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc ";
    private static final String SELECT_G="Select * from grupo_g ";
    private static final String SELECT_H_TAB="Select id_grupo_h, nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, partidos_jugados, bandera from grupo_h order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc ";
    private static final String SELECT_H="Select * from grupo_h ";
    private static final String UPDATE_A="UPDATE grupo_a SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?, partidos_jugados=partidos_jugados+1, puntos=puntos+? WHERE id_grupo_a=?;";
    private static final String UPDATE_B="UPDATE grupo_b SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?, partidos_jugados=partidos_jugados+1, puntos=puntos+? WHERE id_grupo_b=?;";
    private static final String UPDATE_C="UPDATE grupo_c SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?, partidos_jugados=partidos_jugados+1, puntos=puntos+? WHERE id_grupo_c=?;";
    private static final String UPDATE_D="UPDATE grupo_d SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?, partidos_jugados=partidos_jugados+1, puntos=puntos+? WHERE id_grupo_d=?;";
    private static final String UPDATE_E="UPDATE grupo_e SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?, partidos_jugados=partidos_jugados+1, puntos=puntos+? WHERE id_grupo_e=?;";
    private static final String UPDATE_F="UPDATE grupo_f SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?, partidos_jugados=partidos_jugados+1, puntos=puntos+? WHERE id_grupo_f=?;";
    private static final String UPDATE_G="UPDATE grupo_g SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?, partidos_jugados=partidos_jugados+1, puntos=puntos+? WHERE id_grupo_g=?;";
    private static final String UPDATE_H="UPDATE grupo_h SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?, partidos_jugados=partidos_jugados+1, puntos=puntos+? WHERE id_grupo_h=?;";
    private static final String UPDATE_OCT_FIN_RES="UPDATE octavos_final SET goles_favor=?,goles_contra=?,diferencia_gol=?,puntos=?,orden_cuartos=? WHERE id_equipo=?;";
    private static final String UPDATE_CUA_FIN_RES="UPDATE cuartos_final SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?,puntos=puntos+? WHERE id_equipo=?;";
    private static final String UPDATE_SEMIFINAL_RES="UPDATE SEMIFINAL SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?,puntos=puntos+? WHERE id_equipo=?;";
    private static final String UPDATE_FINAL_RES="UPDATE FINAL SET goles_favor=goles_favor+?,goles_contra=goles_contra+?,diferencia_gol=diferencia_gol+?,puntos=puntos+? WHERE id_equipo=?;";
    private static final String CREATE_OCT_FIN="CREATE TABLE IF NOT EXISTS octavos_final (\n" +
            "    id_equipo INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    nombre_equipo VARCHAR(40),\n" +
            "    goles_favor INT ,\n" +
            "    goles_contra INT,\n" +
            "    diferencia_gol INT,\n" +
            "    puntos INT,\n" +
            "    orden_cuartos INT,\n" +
            "    bandera VARCHAR(100) \n" +
            ");";
    private static final String CREATE_CUA_FIN="CREATE TABLE IF NOT EXISTS cuartos_final (\n" +
            "    id_equipo INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    nombre_equipo VARCHAR(40),\n" +
            "    goles_favor INT ,\n" +
            "    goles_contra INT,\n" +
            "    diferencia_gol INT,\n" +
            "    puntos INT,\n" +
            "    bandera VARCHAR(100) \n" +
            ");";
    private static final String CREATE_SEMIFINAL="CREATE TABLE IF NOT EXISTS semifinal (\n" +
            "    id_equipo INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    nombre_equipo VARCHAR(40),\n" +
            "    goles_favor INT ,\n" +
            "    goles_contra INT,\n" +
            "    diferencia_gol INT,\n" +
            "    puntos INT,\n" +
            "    bandera VARCHAR(100) \n" +
            ");";
    private static final String CREATE_FINAL="CREATE TABLE IF NOT EXISTS final (\n" +
            "    id_equipo INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "    nombre_equipo VARCHAR(40),\n" +
            "    goles_favor INT ,\n" +
            "    goles_contra INT,\n" +
            "    diferencia_gol INT,\n" +
            "    puntos INT,\n" +
            "    bandera VARCHAR(100) \n" +
            ");";
    private static final String INSERT_A_OCT_FIN = "insert into octavos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from grupo_a order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 2;";
    private static final String INSERT_B_OCT_FIN = "insert into octavos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from grupo_b order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 2;";
    private static final String INSERT_C_OCT_FIN = "insert into octavos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from grupo_c order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 2;";
    private static final String INSERT_D_OCT_FIN = "insert into octavos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from grupo_d order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 2;";
    private static final String INSERT_E_OCT_FIN = "insert into octavos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from grupo_e order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 2;";
    private static final String INSERT_F_OCT_FIN = "insert into octavos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from grupo_f order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 2;";
    private static final String INSERT_G_OCT_FIN = "insert into octavos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from grupo_g order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 2;";
    private static final String INSERT_H_OCT_FIN = "insert into octavos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from grupo_h order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 2;";
    private static final String INSERT_CUA_FIN = "insert into cuartos_final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from octavos_final order by puntos desc, orden_cuartos asc limit 8;";
    private static final String INSERT_SEMIFINAL = "insert into semifinal (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from cuartos_final order by puntos desc, id_equipo asc limit 4;";
    private static final String INSERT_FINAL = "insert into final (nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera)\n" +
            "Select nombre_equipo, goles_favor, goles_contra, diferencia_gol, puntos, bandera from semifinal order by puntos desc, id_equipo asc limit 2;";
    private static final String UPDATE_OCT_FIN="UPDATE octavos_final SET goles_favor=0,goles_contra=0,diferencia_gol=0,puntos=0";
    private static final String UPDATE_CUA_FIN="UPDATE cuartos_final SET goles_favor=0,goles_contra=0,diferencia_gol=0,puntos=0";
    private static final String UPDATE_SEMIFINAL="UPDATE semifinal SET goles_favor=0,goles_contra=0,diferencia_gol=0,puntos=0";
    private static final String UPDATE_FINAL="UPDATE final SET goles_favor=0,goles_contra=0,diferencia_gol=0,puntos=0";
    private static final String SELECT_OCT_FIN="select * from octavos_final;";
    private static final String SELECT_CUA_FIN="select * from cuartos_final;";
    private static final String SELECT_SEMIFINAL="select * from semifinal;";
    private static final String SELECT_FINAL="select * from final;";
    private static final String SELECT_CAMPEON="select * from final order by puntos desc, diferencia_gol desc, goles_favor desc, goles_contra asc limit 1;";
    private static final String DROP_OCTAVOS="Drop table if exists octavos_final;";
    private static final String DROP_CUARTOS="Drop table if exists cuartos_final;";
    private static final String DROP_SEMIFINAL="Drop table if exists semifinal;";
    private static final String DROP_FINAL="Drop table if exists final;";
    private static final String UPDATE_A_RESTART="UPDATE mundial_parcial.grupo_a SET goles_favor = 0, goles_contra = 0, partidos_jugados=0, puntos = 0, diferencia_gol = 0 WHERE id_grupo_a between 1 and 4;";
    private static final String UPDATE_B_RESTART="UPDATE mundial_parcial.grupo_b SET goles_favor = 0, goles_contra = 0, partidos_jugados=0, puntos = 0, diferencia_gol = 0 WHERE id_grupo_b between 1 and 4;";
    private static final String UPDATE_C_RESTART="UPDATE mundial_parcial.grupo_c SET goles_favor = 0, goles_contra = 0, partidos_jugados=0, puntos = 0, diferencia_gol = 0 WHERE id_grupo_c between 1 and 4;";
    private static final String UPDATE_D_RESTART="UPDATE mundial_parcial.grupo_d SET goles_favor = 0, goles_contra = 0, partidos_jugados=0, puntos = 0, diferencia_gol = 0 WHERE id_grupo_d between 1 and 4;";
    private static final String UPDATE_E_RESTART="UPDATE mundial_parcial.grupo_e SET goles_favor = 0, goles_contra = 0, partidos_jugados=0, puntos = 0, diferencia_gol = 0 WHERE id_grupo_e between 1 and 4;";
    private static final String UPDATE_F_RESTART="UPDATE mundial_parcial.grupo_f SET goles_favor = 0, goles_contra = 0, partidos_jugados=0, puntos = 0, diferencia_gol = 0 WHERE id_grupo_f between 1 and 4;";
    private static final String UPDATE_G_RESTART="UPDATE mundial_parcial.grupo_g SET goles_favor = 0, goles_contra = 0, partidos_jugados=0, puntos = 0, diferencia_gol = 0 WHERE id_grupo_g between 1 and 4;";
    private static final String UPDATE_H_RESTART="UPDATE mundial_parcial.grupo_h SET goles_favor = 0, goles_contra = 0, partidos_jugados=0, puntos = 0, diferencia_gol = 0 WHERE id_grupo_h between 1 and 4;";



    public List<Equipo> listarA(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_A);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_a");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarATabla(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_A_TAB);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_a");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int partidosJugados = rs.getInt("partidos_jugados");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, partidosJugados, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarB(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_B);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_b");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarBTabla(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_B_TAB);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_b");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int partidosJugados = rs.getInt("partidos_jugados");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, partidosJugados, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarC(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_C);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_c");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarCTabla(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_C_TAB);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_c");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int partidosJugados = rs.getInt("partidos_jugados");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, partidosJugados, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarD(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_D);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_d");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarDTabla(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_D_TAB);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_d");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int partidosJugados = rs.getInt("partidos_jugados");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, partidosJugados, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarE(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_E);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_e");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarETabla(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_E_TAB);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_e");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int partidosJugados = rs.getInt("partidos_jugados");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, partidosJugados, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarF(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_F);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_f");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarFTabla(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_F_TAB);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_f");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int partidosJugados = rs.getInt("partidos_jugados");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, partidosJugados, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarG(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_G);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_g");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarGTabla(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_G_TAB);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_g");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int partidosJugados = rs.getInt("partidos_jugados");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, partidosJugados, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarH(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_H);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_h");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public List<Equipo> listarHTabla(){

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT_H_TAB);
            rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_grupo_h");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int partidosJugados = rs.getInt("partidos_jugados");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, partidosJugados, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;

    }

    public boolean actualizarA(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_A);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra(); //Cambiar
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public boolean actualizarB(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_B);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public boolean actualizarC(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_C);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public boolean actualizarD(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_D);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public boolean actualizarE(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_E);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public boolean actualizarF(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_F);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public boolean actualizarG(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_G);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public boolean actualizarH(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_H);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public List<Equipo> listarOctFin(){
        Connection conn = null;
        Statement stmtCreate=null;
        PreparedStatement stmtInsert = null;
        PreparedStatement stmtSelect = null;
        PreparedStatement stmtUpdate = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();
        int rows = 0;
        boolean rowActulizar = false;

        try {
            conn = Conexion.getConnection();
            stmtCreate=conn.createStatement();

            stmtCreate.executeUpdate(CREATE_OCT_FIN);

            stmtInsert = conn.prepareStatement(INSERT_A_OCT_FIN);
            rows = stmtInsert.executeUpdate();

            stmtInsert = conn.prepareStatement(INSERT_B_OCT_FIN);
            rows = stmtInsert.executeUpdate();

            stmtInsert = conn.prepareStatement(INSERT_C_OCT_FIN);
            rows = stmtInsert.executeUpdate();

            stmtInsert = conn.prepareStatement(INSERT_D_OCT_FIN);
            rows = stmtInsert.executeUpdate();

            stmtInsert = conn.prepareStatement(INSERT_E_OCT_FIN);
            rows = stmtInsert.executeUpdate();

            stmtInsert = conn.prepareStatement(INSERT_F_OCT_FIN);
            rows = stmtInsert.executeUpdate();

            stmtInsert = conn.prepareStatement(INSERT_G_OCT_FIN);
            rows = stmtInsert.executeUpdate();

            stmtInsert = conn.prepareStatement(INSERT_H_OCT_FIN);
            rows = stmtInsert.executeUpdate();

            stmtUpdate = conn.prepareStatement(UPDATE_OCT_FIN);
            rowActulizar = stmtUpdate.executeUpdate()>0;

            stmtSelect = conn.prepareStatement(SELECT_OCT_FIN);
            rs = stmtSelect.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_equipo");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmtSelect != null) {
                Conexion.close(stmtSelect);
            }
            if (stmtInsert != null) {
                Conexion.close(stmtInsert);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;
    }

    public boolean actualizarOctFin(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_OCT_FIN_RES);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5,equipo.getOrden());
            stmt.setInt(6, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public List<Equipo> listarCuaFin(){
        Connection conn = null;
        Statement stmtCreate=null;
        PreparedStatement stmtInsert = null;
        PreparedStatement stmtSelect = null;
        PreparedStatement stmtUpdate = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();
        int rows = 0;
        boolean rowActulizar = false;

        try {
            conn = Conexion.getConnection();
            stmtCreate=conn.createStatement();

            stmtCreate.executeUpdate(CREATE_CUA_FIN);

            stmtInsert = conn.prepareStatement(INSERT_CUA_FIN);
            rows = stmtInsert.executeUpdate();

            stmtUpdate = conn.prepareStatement(UPDATE_CUA_FIN  );
            rowActulizar = stmtUpdate.executeUpdate()>0;

            stmtSelect = conn.prepareStatement(SELECT_CUA_FIN);
            rs = stmtSelect.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_equipo");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmtSelect != null) {
                Conexion.close(stmtSelect);
            }
            if (stmtInsert != null) {
                Conexion.close(stmtInsert);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;
    }

    public boolean actualizarCuaFin(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_CUA_FIN_RES);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public List<Equipo> listarSemifinal(){
        Connection conn = null;
        Statement stmtCreate=null;
        PreparedStatement stmtInsert = null;
        PreparedStatement stmtSelect = null;
        PreparedStatement stmtUpdate = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();
        int rows = 0;
        boolean rowActulizar = false;

        try {
            conn = Conexion.getConnection();
            stmtCreate=conn.createStatement();

            stmtCreate.executeUpdate(CREATE_SEMIFINAL);

            stmtInsert = conn.prepareStatement(INSERT_SEMIFINAL);
            rows = stmtInsert.executeUpdate();

            stmtUpdate = conn.prepareStatement(UPDATE_SEMIFINAL);
            rowActulizar = stmtUpdate.executeUpdate()>0;

            stmtSelect = conn.prepareStatement(SELECT_SEMIFINAL);
            rs = stmtSelect.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_equipo");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmtSelect != null) {
                Conexion.close(stmtSelect);
            }
            if (stmtInsert != null) {
                Conexion.close(stmtInsert);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;
    }

    public boolean actualizarSemifinal(Equipo equipo){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_SEMIFINAL_RES);

            int diferenciaGol=equipo.getGolesFavor()-equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()){
                puntos= 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            }else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    public List<Equipo> listarFinal(){
        Connection conn = null;
        Statement stmtCreate=null;
        PreparedStatement stmtInsert = null;
        PreparedStatement stmtSelect = null;
        PreparedStatement stmtUpdate = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();
        int rows = 0;
        boolean rowActulizar = false;

        try {
            conn = Conexion.getConnection();
            stmtCreate=conn.createStatement();

            stmtCreate.executeUpdate(CREATE_FINAL);

            stmtInsert = conn.prepareStatement(INSERT_FINAL);
            rows = stmtInsert.executeUpdate();

            stmtUpdate = conn.prepareStatement(UPDATE_FINAL);
            rowActulizar = stmtUpdate.executeUpdate()>0;

            stmtSelect = conn.prepareStatement(SELECT_FINAL);
            rs = stmtSelect.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_equipo");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmtSelect != null) {
                Conexion.close(stmtSelect);
            }
            if (stmtInsert != null) {
                Conexion.close(stmtInsert);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;
    }

    public boolean actualizarFinal(Equipo equipo) {

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_FINAL_RES);

            int diferenciaGol = equipo.getGolesFavor() - equipo.getGolesContra();
            int puntos;

            if (equipo.getGolesFavor() > equipo.getGolesContra()) {
                puntos = 3;
            } else if (equipo.getGolesFavor() < equipo.getGolesContra()) {
                puntos = 0;
            } else {
                puntos = 1;
            }

            stmt.setInt(1, equipo.getGolesFavor());
            stmt.setInt(2, equipo.getGolesContra());
            stmt.setInt(3, diferenciaGol);
            stmt.setInt(4, puntos);
            stmt.setInt(5, equipo.getId());

            rowActulizar = stmt.executeUpdate() > 0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }
        return rowActulizar;
    }

    public List<Equipo> listarCampeon(){
        Connection conn = null;
        PreparedStatement stmtSelect = null;
        ResultSet rs = null;
        Equipo equipo;
        List<Equipo> equipos = new ArrayList<>();
        int rows = 0;
        boolean rowActulizar = false;

        try {
            conn = Conexion.getConnection();

            stmtSelect = conn.prepareStatement(SELECT_CAMPEON);
            rs = stmtSelect.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id_equipo");
                String nombre = rs.getString("nombre_equipo");
                int golesFavor = rs.getInt("goles_favor");
                int golesContra = rs.getInt("goles_contra");
                int diferenciaGol = rs.getInt("diferencia_gol");
                int puntos = rs.getInt("puntos");
                String bandera = rs.getString("bandera");
                equipo = new Equipo(id, nombre, golesFavor, golesContra, diferenciaGol, puntos, bandera);
                equipos.add(equipo);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmtSelect != null) {
                Conexion.close(stmtSelect);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return equipos;
    }

    public void eliminarOctavos(){
        Connection conn = null;
        Statement stmtDelete=null;

        try {
            conn = Conexion.getConnection();
            stmtDelete=conn.createStatement();

            stmtDelete.executeUpdate(DROP_OCTAVOS);

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            }
            if (conn != null) {
                Conexion.close(conn);
            }

    }

    public void eliminarCuartos(){
        Connection conn = null;
        Statement stmtDelete=null;

        try {
            conn = Conexion.getConnection();
            stmtDelete=conn.createStatement();

            stmtDelete.executeUpdate(DROP_CUARTOS);

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
        }
        if (conn != null) {
            Conexion.close(conn);
        }

    }
    public void eliminarSemifinal(){
        Connection conn = null;
        Statement stmtDelete=null;

        try {
            conn = Conexion.getConnection();
            stmtDelete=conn.createStatement();

            stmtDelete.executeUpdate(DROP_SEMIFINAL);

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
        }
        if (conn != null) {
            Conexion.close(conn);
        }

    }

    public void eliminarFinal(){
        Connection conn = null;
        Statement stmtDelete=null;

        try {
            conn = Conexion.getConnection();
            stmtDelete=conn.createStatement();

            stmtDelete.executeUpdate(DROP_FINAL);

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
        }
        if (conn != null) {
            Conexion.close(conn);
        }

    }

    public boolean actualizarRestart(){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();

            stmt = conn.prepareStatement(UPDATE_A_RESTART);
            rowActulizar = stmt.executeUpdate()>0;

            stmt = conn.prepareStatement(UPDATE_B_RESTART);
            rowActulizar = stmt.executeUpdate()>0;

            stmt = conn.prepareStatement(UPDATE_C_RESTART);
            rowActulizar = stmt.executeUpdate()>0;

            stmt = conn.prepareStatement(UPDATE_D_RESTART);
            rowActulizar = stmt.executeUpdate()>0;

            stmt = conn.prepareStatement(UPDATE_E_RESTART);
            rowActulizar = stmt.executeUpdate()>0;

            stmt = conn.prepareStatement(UPDATE_F_RESTART);
            rowActulizar = stmt.executeUpdate()>0;

            stmt = conn.prepareStatement(UPDATE_G_RESTART);
            rowActulizar = stmt.executeUpdate()>0;

            stmt = conn.prepareStatement(UPDATE_H_RESTART);
            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }

    /*public boolean actualizarBRESTART(){

        boolean rowActulizar = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(UPDATE_A_RESTART);

            rowActulizar = stmt.executeUpdate()>0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            if (rs != null) {
                Conexion.close(rs);
            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (conn != null) {
                Conexion.close(conn);
            }

        }

        return rowActulizar;

    }*/


}
