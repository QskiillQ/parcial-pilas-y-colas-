public class ObjBanco {
    private int ID;
    private String Nombre ;
    private String TipodeServicio;
    private String HoradeLlegada;
    private Boolean Estado;
    public ObjBanco(int iD, String nombre, String tipodeServicio, String horadeLlegada, Boolean estado) {
        ID = iD;
        Nombre = nombre;
        TipodeServicio = tipodeServicio;
        HoradeLlegada = horadeLlegada;
        Estado = estado;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getTipodeServicio() {
        return TipodeServicio;
    }
    public void setTipodeServicio(String tipodeServicio) {
        TipodeServicio = tipodeServicio;
    }
    public String getHoradeLlegada() {
        return HoradeLlegada;
    }
    public void setHoradeLlegada(String horadeLlegada) {
        HoradeLlegada = horadeLlegada;
    }
    public Boolean getEstado() {
        return Estado;
    }
    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
