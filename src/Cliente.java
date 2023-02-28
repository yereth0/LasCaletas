public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String correoElectronicoCliente;
    private String numeroTelefonoCliente;

    public Cliente(int idCliente, String nombreCliente, String correoElectronicoCliente, String numeroTelefonoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.correoElectronicoCliente = correoElectronicoCliente;
        this.numeroTelefonoCliente = numeroTelefonoCliente;
    }
//Getters y Setters para cada attributo
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
}