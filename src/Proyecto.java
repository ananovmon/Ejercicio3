public class Proyecto {
    private int id;
    private String nombre;
    private String vertical;
    private int horas;

    public Proyecto(int id, String nombre, String vertical, int horas) {
        this.id = id;
        this.nombre = nombre;
        this.vertical = vertical;
        this.horas = horas;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVertical() {
        return vertical;
    }

    public int getHoras() {
        return horas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Proyecto [id=" + id + ", nombre=" + nombre + ", vertical=" + vertical + ", horas=" + horas + "]";
    }

}
