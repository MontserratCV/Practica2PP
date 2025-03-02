package com.poo.controllers;
import java.util.ArrayList;

import java.util.Scanner;

import com.poo.models.Universidad;
import com.poo.models.Docente;
import com.poo.models.Materia;
import com.poo.models.Persona;

public class MateriasController extends UniversidadController{
    
    private ArrayList<Materia> materias = new ArrayList<>();

    private Scanner scan = new Scanner(System.in);

    public MateriasController(Universidad miUniversidad){
        super(miUniversidad);
    }

    public void materias(){
        int opc;

        do{
        System.out.println("Seleccione la opicón que dese ejecutar \n" +
                "1- Dar de alta una materia \n" +
                "2- Mostrar alumnos de una materia \n" +
                "3- Mostrar al profesor de una materia \n" +
                "4- Dar de baja una materia  \n" +
<<<<<<< HEAD
                "5- Mostrar todas la materias \n"+
                "6- Regresar \n ");
=======
                "5- Mostrar todas las materias \n" +
                "6- Regresar \n ");

>>>>>>> e77e26f389bbc86763fb79f2ea27236c8e482908
    
        opc=scan.nextInt();
        scan.nextLine();

        switch(opc){
            case 1: 
                addMateria();
                break;
            case 2:
                getAlumnMateria();
                break;
            case 3:
                getProfesor();
                break;
            case 4:
                deleteMateria();
                break;
            case 5:
                impMaterias();
                break;
            case 6:
                return;
            default:
                System.out.println("Inserte una opción válida \n");


        }
        
        }while(true);
    }

    public void addMateria(){;
        Materia NewMateria= capturarDatosMateria();
        universidad.getMaterias().add(NewMateria);

        
    }

    public void getAlumnMateria(){
        if(universidad.getAlumnos().isEmpty()) System.out.println("No hay alumnos inscritos en la universidad, ingrese primero los alumnos");
        else {
        String nombreMateria;
        System.out.println("Introduzca el nombre de la materia de la que quiere mostrar los alumnos \n");
        nombreMateria = scan.nextLine();
        scan.nextLine();
        for(int i=0;i<universidad.getMaterias().size();i++){
            if(universidad.getAlumnos().get(i).getTiraMaterias().getInscripcionMaterias().getMateriadeTira().getNombreMateria().equals(nombreMateria)){
                //System.out.println(universidad.getMaterias().get(i).getNombreMateria());
                System.out.println(universidad.getAlumnos().get(i).getNombreAlumno());
            }
            
        }
    }

    }

    public void getProfesor(){
        if(universidad.getDocentes().isEmpty()) System.out.println("No hay docentes inscritos en la universidad, ingrese primero los docentes");
        else{
        String nombreMateria;
        System.out.println("Introduzca el nombre de la materia de la que quiere mostrar el profesor \n");
        nombreMateria = scan.nextLine();
        scan.nextLine();
        for(int i=0;i<universidad.getMaterias().size();i++){
            if(universidad.getMaterias().get(i).getNombreMateria().equals(nombreMateria)){
                //System.out.println(universidad.getMaterias().get(i).getNombreMateria());
                System.out.println(universidad.getDocentes().get(i).getNombre());
            }
        
        }
    }
}

    public void deleteMateria(){
        String nombreMateria;
        System.out.println("Introduzca el nombre de la materia de la que quiere Eliminar \n");
        nombreMateria = scan.nextLine();
        scan.nextLine();        
        for(int i=0;i<universidad.getMaterias().size();i++){
            System.out.println("For, Nombreingresado:"+nombreMateria+" Nombre de la busqueda: "+universidad.getMaterias().get(i).getNombreMateria()+"a\n");
            if(universidad.getMaterias().get(i).getNombreMateria().equals(nombreMateria)){
                System.out.println("IFFFF");
                universidad.getMaterias().remove(i);
                //universidad.setMaterias(universidad.getMaterias().remove(i));
                //i--;
            }
        }


    }

    public void impMaterias(){
        for(int i=0;i<universidad.getMaterias().size();i++){
            System.out.println(universidad.getMaterias().get(i).getNombreMateria());
        }

    }


public Materia capturarDatosMateria(){
    Materia materia;
    String nombreMateria, claveGrupo,nombreDocente;
    Docente docente;
    int id;

    System.out.println("Introduzca el nombre de la nueva materia \n");
    nombreMateria = scan.nextLine();
    scan.nextLine();
    System.out.println("Introduzca el ID de la nueva materia\n");
    id = scan.nextInt();
    scan.nextLine();
    System.out.println("Introduzca la clave del grupo donde se impartira la nueva materia\n");
    claveGrupo =  scan.nextLine();
    scan.nextLine();
    //System.out.println("Introduzca el nombre del docente que impartira la nueva materia\n");
    //nombreDocente =  scan.nextLine();
    docente=null;



materia = new Materia(id,nombreMateria,claveGrupo,docente);

return materia;
}
}
