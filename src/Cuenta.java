import java.util.Date;

public class Cuenta {
    private int idCuenta;
    private int idReservacion;
    private Date fechaApertura;
    private Date fechaCierre;
    private double totalCuenta;

    public Cuenta(int idCuenta, int idReservacion, Date fechaApertura, Date fechaCierre, double totalCuenta) {
        this.idCuenta = idCuenta;
        this.idReservacion = idReservacion;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.totalCuenta = totalCuenta;
    }
//Getters y Setters para cada attributo
    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public double getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(double totalCuenta) {
        this.totalCuenta = totalCuenta;
    }
}