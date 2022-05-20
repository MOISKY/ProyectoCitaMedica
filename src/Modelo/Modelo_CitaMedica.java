package Modelo;
public class Modelo_CitaMedica {
    private String dia;
    private String mes;
    private String año;
    private String especialidad;
    private String horaInicio;
    private String minutosInicio;
    private String horaFinal;
    private String minutosFinal;

    public Modelo_CitaMedica(String dia, String mes, String año, String especialidad, String horaInicio, String minutosInicio, String horaFinal, String minutosFinal) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.especialidad = especialidad;
        this.horaInicio = horaInicio;
        this.minutosInicio = minutosInicio;
        this.horaFinal = horaFinal;
        this.minutosFinal = minutosFinal;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getMinutosInicio() {
        return minutosInicio;
    }

    public void setMinutosInicio(String minutosInicio) {
        this.minutosInicio = minutosInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getMinutosFinal() {
        return minutosFinal;
    }

    public void setMinutosFinal(String minutosFinal) {
        this.minutosFinal = minutosFinal;
    }
    
    
}