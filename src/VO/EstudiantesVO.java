package VO;

/**
 *
 * @author Carolina Maria Camacho Zambrano
 */
public class EstudiantesVO {
    //Declaro Variables o atributos
    private String nombres;
    private String apellidos;
    private String fecha_de_nacimiento;
    private String correo_institucional;
    private String correo_personal;
    private long N_celular;
    private long N_fijo;
    private String programa_academico;
    //creamos constructor vacio para anadir registros
    public EstudiantesVO(){
    }
    // Creamos el Constructor para generar el objeto de trabajo
    public EstudiantesVO (String nombre, String apellidos, String fecha_de_nacimiento, String correo_institucional,
            String correo_personal, long N_celular, long N_fijo, String programa_academico){
        this.nombres=nombre;
        this.apellidos=apellidos;
        this.fecha_de_nacimiento=fecha_de_nacimiento;
        this.correo_institucional=correo_institucional;
        this.correo_personal=correo_personal;
        this.N_celular=N_celular;
        this.N_fijo=N_fijo;
        this.programa_academico=programa_academico;
    }
    //Metodos setter y getter
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }
    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
    public String getCorreo_institucional() {
        return correo_institucional;
    }
    public void setCorreo_institucional(String correo_institucional) {
        this.correo_institucional = correo_institucional;
    }
    public String getCorreo_personal() {
        return correo_personal;
    }
    public void setCorreo_personal(String correo_personal) {
        this.correo_personal = correo_personal;
    }
    public long getN_celular() {
        return N_celular;
    }
    public void setN_celular(long N_celular) {
        this.N_celular = N_celular;
    }
    public long getN_fijo() {
        return N_fijo;
    }
    public void setN_fijo(long N_fijo) {
        this.N_fijo = N_fijo;
    }
    public String getPrograma_academico() {
        return programa_academico;
    }
    public void setPrograma_academico(String programa_academico) {
        this.programa_academico = programa_academico;
    }
    //Metodo para unir los metodos setter y getter (OPCIONAL)
    @Override
    public String toString (){
        return this.getNombres()+" "+this.getApellidos();
    }
}
