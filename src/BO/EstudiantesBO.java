package BO;

/**
 *
 * @author Carolina Maria Camacho Zambrano
 */

import VO.EstudiantesVO;
import java.util.ArrayList;
import java.util.List;

public class EstudiantesBO {
    //Crear la lista de estudiantes o tipo estudiante
    List<EstudiantesVO> estudiantes;
    //LLenar la lista usando el constructor de la clase
    public EstudiantesBO(){
        estudiantes=new ArrayList<>();    
    }
    //Insertar estudiantes con  parametros
    public void insertarEstudiante(EstudiantesVO estudiante){
        estudiantes.add(estudiante);       
    }
    //Mostrar o consultar un estudiante con parametro 1
    public EstudiantesVO obtenerEstudiante(String correo_institucional){
        for(EstudiantesVO estudiante : estudiantes){
            if(estudiante.getCorreo_institucional().equals(correo_institucional)){
                return estudiante;
            }        
        }
        return null;
    }
    //Mostrar o consultar un estudiante con parametro 2
    public EstudiantesVO obtenerEstudiante1 (String correo_personal){
        for(EstudiantesVO estudiante : estudiantes){
            return estudiante;
        }
        return null;
    } 
    //Actualizar estudiante pasando parametros
    public void actualizarEstudiante(EstudiantesVO estudiante){
    // usamos un indice o variable de recorrido
        int i=0;
        while(i<estudiantes.size()){
            if(estudiantes.get(i).getCorreo_institucional().equals(estudiante.getCorreo_institucional())){
               estudiantes.set(i, estudiante);
               break;
            }
            // Para incrementar
            i++;
        }
    }      
    //Borrar o eliminar estudiante pasando parametro
    public void eliminarEstudiante(EstudiantesVO estudiante){
        estudiantes.remove(estudiante);             
    }
    //Obtener directorio de estudiantes
    public List<EstudiantesVO> obtenerEstudiantes(){
        return estudiantes;       
    }
}