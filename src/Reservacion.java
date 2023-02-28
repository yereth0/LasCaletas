import java.util.Date;

public class Reservacion {
    private int idReservacion;
    private Date fechaLlegada;
    private Date fechaSalida;
    private int idHabitacion;
    private String nombreCliente;
    private String correoElectronicoCliente;
    private String numeroTelefonoCliente;
    private double precioTotalReservacion;

    public Reservacion(int idReservacion, Date fechaLlegada, Date fechaSalida, int idHabitacion, String nombreCliente, String correoElectronicoCliente, String numeroTelefonoCliente, double precioTotalReservacion) {
        this.idReservacion = idReservacion;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.idHabitacion = idHabitacion;
        this.nombreCliente = nombreCliente;
        this.correoElectronicoCliente = correoElectronicoCliente;
        this.numeroTelefonoCliente = numeroTelefonoCliente;
        this.precioTotalReservacion = precioTotalReservacion;
    }
//Getters y Setters para cada attributo
    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoElectronicoCliente() {
        return correoElectronicoCliente;
    }

    public void setCorreoElectronicoCliente(String correoElectronicoCliente) {
        this.correoElectronicoCliente = correoElectronicoCliente;
    }

    public String getNumeroTelefonoCliente() {
        return numeroTelefonoCliente;
    }

    public void setNumeroTelefonoCliente(String numeroTelefonoCliente) {
        this.numeroTelefonoCliente = numeroTelefonoCliente;
    }

    public double getPrecioTotalReservacion() {
        return precioTotalReservacion;
    }

    public void setPrecioTotalReservacion(double precioTotalReservacion) {
        this.precioTotalReservacion = precioTotalReservacion;
    }
}