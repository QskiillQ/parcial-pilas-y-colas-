public class ObjNavegador {
    private String Url;
    private String Titulo;
    private String FechadeAcceso;
    public ObjNavegador(String url, String titulo, String fechadeAcceso) {
        Url = url;
        Titulo = titulo;
        FechadeAcceso = fechadeAcceso;
    }
    public String getUrl() {
        return Url;
    }
    public void setUrl(String url) {
        Url = url;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getFechadeAcceso() {
        return FechadeAcceso;
    }
    public void setFechadeAcceso(String fechadeAcceso) {
        FechadeAcceso = fechadeAcceso;
    }

}
