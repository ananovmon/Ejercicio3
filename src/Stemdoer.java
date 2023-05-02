public class Stemdoer {

    private Integer id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Genero genero;
    private String email;
    private String oficina;
    private String vertical;


    public Stemdoer(Integer id, String nombre, String apellido1, String apellido2, Genero genero, String email,
            String oficina, String vertical) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.genero = genero;
        this.email = email;
        this.oficina = oficina;
        this.vertical = vertical;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido1() {
        return apellido1;
    }


    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }


    public String getApellido2() {
        return apellido2;
    }


    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }


    public Genero getGenero() {
        return genero;
    }


    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getOficina() {
        return oficina;
    }


    public void setOficina(String oficina) {
        this.oficina = oficina;
    }


    public String getVertical() {
        return vertical;
    }


    public void setVertical(String vertical) {
        this.vertical = vertical;
    }


    @Override
    public String toString() {
        return "Stemdoer [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + "]";
    }


}