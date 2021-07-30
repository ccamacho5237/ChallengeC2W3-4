/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdirectorioestudiantes;

import BO.EstudiantesBO;
import VO.EstudiantesVO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Carolina Maria Camacho Zambrano
 */
public class AppDirectorioEstudiantes {

    public static void main(String[] args) throws IOException {
        try{
        //cargar el buffered para leer datos desde consola
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        //Declaro Variables
        int opcion=1;
        long telefonos;
        String correo_personal, programa_academico;
        //Crear un arreglo generico (Instanciar BO)
        EstudiantesBO objestBO=new EstudiantesBO();
        // Uso del while pare crear el menu
        while (opcion >=1 && opcion <=6){
            System.out.println("INSTITUTO LA FLORESTA");
            System.out.println("Seleccione tarea a realizar: ");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar Estudiante");           
            System.out.println("5. Ver directorio de estudiantes");
            System.out.println("6. Salir");
            System.out.println("Opción: ");
            opcion=Integer.parseInt(leer.readLine());
            switch (opcion){
                case 1:
                    //Instanciar la clase EstudiantesVO para anadir estudiantes
                    EstudiantesVO nuevo=new EstudiantesVO();
                    System.out.println("Ingresar estudiante");
                    System.out.println("Ingresar nombres: ");
                    nuevo.setNombres(leer.readLine());
                    System.out.println("Ingresar apellidos: ");
                    nuevo.setApellidos(leer.readLine());
                    System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD): ");
                    nuevo.setFecha_de_nacimiento(leer.readLine());
                    System.out.println("Ingresar correo institucional: ");
                    nuevo.setCorreo_institucional(leer.readLine());
                    System.out.println("Ingresar correo personal: ");
                    nuevo.setCorreo_personal(leer.readLine());
                    System.out.println("Ingresar número de celular: ");
                    telefonos=Long.parseLong(leer.readLine());
                    nuevo.setN_celular(telefonos);
                    System.out.println("Ingresar número fijo: ");
                    telefonos=Long.parseLong(leer.readLine());
                    nuevo.setN_fijo(telefonos);
                    System.out.println("Ingresar programa: ");
                    nuevo.setPrograma_academico(leer.readLine());
                    System.out.println("Se agregó el estudiante");
                    System.out.println(" ");
                    //Cargar los datos usando (variable nuevo)
                    objestBO.insertarEstudiante(nuevo);
                    break;
                case 2:
                    //Consultar estudiante por correo institucional
                    System.out.println("Buscar estudiante");
                    System.out.println("Ingresar correo institucional: ");
                    String correo_institucional=leer.readLine();
                    EstudiantesVO encontrado=objestBO.obtenerEstudiante(correo_institucional);
                    if(encontrado !=null){
                        System.out.println(" ");
                        System.out.println("Información del estudiante");
                        System.out.println("Nombres: "+encontrado.getNombres());
                        System.out.println("Apellidos: "+encontrado.getApellidos());
                        System.out.println("Fecha nacimiento: "+encontrado.getFecha_de_nacimiento());
                        System.out.println("Correo institucional: "+encontrado.getCorreo_institucional());
                        System.out.println("Correo personal: "+encontrado.getCorreo_personal());
                        System.out.println("Número de teléfono celular: "+encontrado.getN_celular());
                        System.out.println("Número de teléfono fijo: "+encontrado.getN_fijo());
                        System.out.println("Programa académico: "+encontrado.getPrograma_academico());
                        System.out.println(" ");
                    }
                    else{
                        System.out.println("El estudiante no existe");
                    }
                    break;
                case 3:
                    //Modificar estudiante
                    EstudiantesVO modificar=new EstudiantesVO();
                    System.out.println("Modificar estudiante");
                    System.out.println("Ingresar correo institucional: ");
                    correo_institucional=leer.readLine();
                    modificar=objestBO.obtenerEstudiante(correo_institucional);
                    System.out.println("Ingresar correo personal: ");
                    correo_personal=leer.readLine();
                    modificar.setCorreo_personal(correo_personal);
                    System.out.println("Ingresar número de celular: ");
                    telefonos=Long.parseLong(leer.readLine());
                    modificar.setN_celular(telefonos);
                    System.out.println("Ingresar número fijo: ");
                    telefonos=Long.parseLong(leer.readLine());
                    modificar.setN_fijo(telefonos);
                    System.out.println("Ingresar programa: ");
                    programa_academico=leer.readLine();
                    modificar.setPrograma_academico(programa_academico);
                    objestBO.actualizarEstudiante(modificar);
                    System.out.println("Se modificó el estudiante");
                    System.out.println(" ");
                    break;
                case 4:
                    //Eliminar estudiante
                    System.out.println("Eliminar estudiante");
                    System.out.println("Ingresar correo institucional: ");
                    correo_institucional=leer.readLine();
                    EstudiantesVO estudiante=objestBO.obtenerEstudiante(correo_institucional);
                    objestBO.eliminarEstudiante(estudiante);
                    System.out.println("Se eliminó el estudiante");
                    System.out.println(" ");
                    break;
                case 5:
                    // Directorio de estudiantes
                    for(EstudiantesVO estudiantes : objestBO.obtenerEstudiantes()){
                        System.out.println("El directorio de los estudiantes");
                        System.out.println(" ");
                        System.out.println("Nombres: "+estudiantes.getNombres());
                        System.out.println("Apellidos: "+estudiantes.getApellidos());
                        System.out.println("Fecha nacimiento: "+estudiantes.getFecha_de_nacimiento());
                        System.out.println("Correo institucional: "+estudiantes.getCorreo_institucional());
                        System.out.println("Correo personal: "+estudiantes.getCorreo_personal());
                        System.out.println("Número de teléfono celular: "+estudiantes.getN_celular());
                        System.out.println("Número de teléfono fijo: "+estudiantes.getN_fijo());
                        System.out.println("Programa académico: "+estudiantes.getPrograma_academico());
                        System.out.println(" ");}
                        break;
                case 6:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;                                                       
                }           
            }
        }
        catch (NumberFormatException exs){
        System.out.println("Error, la excepción es: "+exs);
}
        finally{
            System.out.println("Programa finalizado");
        }
    }
}
