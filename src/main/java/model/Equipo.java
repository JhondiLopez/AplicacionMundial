package model;

public class Equipo {

    private int id;
    private String nombre;
    private int golesFavor;
    private int golesContra;
    private int diferenciaGol;

    private int partidosJugados;
    private int puntos;

    private int orden;
    private String bandera;

    public Equipo() {
    }

    public Equipo(int id) {
        this.id = id;
    }

    public Equipo(String nombre, int golesFavor, int golesContra, int diferenciaGol, int puntos, String bandera) {
        this.nombre = nombre;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.diferenciaGol = diferenciaGol;
        this.puntos = puntos;
        this.bandera = bandera;
    }

    public Equipo(int id, String nombre, int golesFavor, int golesContra, int diferenciaGol, int puntos, String bandera) {
        this.id = id;
        this.nombre = nombre;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.diferenciaGol = diferenciaGol;
        this.puntos = puntos;
        this.bandera = bandera;
    }

    public Equipo(int id, int golesFavor, int golesContra) {
        this.id = id;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
    }

    public Equipo(int id, int golesFavor, int golesContra, int orden) {
        this.id = id;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.orden = orden;
    }

    public Equipo(int id, String nombre, int golesFavor, int golesContra, int diferenciaGol, int partidosJugados, int puntos, String bandera) {
        this.id = id;
        this.nombre = nombre;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.diferenciaGol = diferenciaGol;
        this.partidosJugados = partidosJugados;
        this.puntos = puntos;
        this.bandera = bandera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getDiferenciaGol() {
        return diferenciaGol;
    }

    public void setDiferenciaGol(int diferenciaGol) {
        this.diferenciaGol = diferenciaGol;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", golesFavor=" + golesFavor +
                ", golesContra=" + golesContra +
                ", diferenciaGol=" + diferenciaGol +
                ", partidosJugados=" + partidosJugados +
                ", puntos=" + puntos +
                ", orden=" + orden +
                ", bandera='" + bandera + '\'' +
                '}';
    }
}
