package composite1;

import java.util.*;
public class App 
{
    public static void main( String[] args ) {
    	// Creación y definición de la asignatura de BBDD y sus actividades evaluables
    	Compuesto bbdd = new Compuesto("Base de Datos");
    	Hoja examenFinalBBDD = new Hoja("Examen Final", 0.5, 8);
    	Hoja trabajoFinalBBDD = new Hoja("Trabajo Final", 0.5, 7);
    	bbdd.addComponente(examenFinalBBDD);
    	bbdd.addComponente(trabajoFinalBBDD);
    	System.out.println("Nota de " + bbdd.getNombre() + ": " + bbdd.operacion());
    	
    	// Creación y definición de la asignatura de SSOO y sus actividades evaluables
    	Compuesto ssoo = new Compuesto("Sistemas Operativos");
    	Hoja examenFinalSSOO = new Hoja("Examen Final", 0.6, 5.5);
    	Compuesto labSSOO = new Compuesto("Laboratorio");
    	Hoja sesion1labSSOO = new Hoja("Sesión 1", 0.1, 6.1);
    	Hoja sesion2labSSOO = new Hoja("Sesión 2", 0.1, 7.3);
    	Hoja sesion3labSSOO = new Hoja("Sesión 3", 0.1, 8.2);
    	Hoja sesion4labSSOO = new Hoja("Sesión 4", 0.1, 5.9);
    	labSSOO.addComponente(sesion1labSSOO);
    	labSSOO.addComponente(sesion2labSSOO);
    	labSSOO.addComponente(sesion3labSSOO);
    	labSSOO.addComponente(sesion4labSSOO);
    	ssoo.addComponente(examenFinalSSOO);
    	ssoo.addComponente(labSSOO);
    	System.out.println("Nota de " + ssoo.getNombre() + ": " + ssoo.operacion());
    	
    	// Creación y definición de la asignatura de Técnicas de Programación y sus actividades evaluables
    	Compuesto tecProg = new Compuesto("Técnicas de Programación");
    	Hoja examenParcialTecProg = new Hoja("Examen Parcial", 0.4, 6.7);
    	Hoja proyectoFinalTecProg = new Hoja("Proyecto Final", 0.3, 7.2);
    	Compuesto tareasSemanalestecProg = new Compuesto("Tareas Semanales");
    	Hoja tarea1TecProg = new Hoja("Tarea 1", 0.03, 8.3);
    	Hoja tarea2TecProg = new Hoja("Tarea 2", 0.03, 7.1);
    	Hoja tarea3TecProg = new Hoja("Tarea 3", 0.03, 6.9);
    	Hoja tarea4TecProg = new Hoja("Tarea 4", 0.03, 5.8);
    	Hoja tarea5TecProg = new Hoja("Tarea 5", 0.03, 6.5);
    	Hoja tarea6TecProg = new Hoja("Tarea 6", 0.03, 7.9);
    	Hoja tarea7TecProg = new Hoja("Tarea 7", 0.03, 8.1);
    	Hoja tarea8TecProg = new Hoja("Tarea 8", 0.03, 7.7);
    	Hoja tarea9TecProg = new Hoja("Tarea 9", 0.03, 6.3);
    	Hoja tarea10TecProg = new Hoja("Tarea 10", 0.03, 5.5);
    	tareasSemanalestecProg.addComponente(tarea1TecProg);
    	tareasSemanalestecProg.addComponente(tarea2TecProg);
    	tareasSemanalestecProg.addComponente(tarea3TecProg);
    	tareasSemanalestecProg.addComponente(tarea4TecProg);
    	tareasSemanalestecProg.addComponente(tarea5TecProg);
    	tareasSemanalestecProg.addComponente(tarea6TecProg);
    	tareasSemanalestecProg.addComponente(tarea7TecProg);
    	tareasSemanalestecProg.addComponente(tarea8TecProg);
    	tareasSemanalestecProg.addComponente(tarea9TecProg);
    	tareasSemanalestecProg.addComponente(tarea10TecProg);
    	tecProg.addComponente(examenParcialTecProg);
    	tecProg.addComponente(proyectoFinalTecProg);
    	tecProg.addComponente(tareasSemanalestecProg);
    	System.out.println("Nota de " + tecProg.getNombre() + ": " + tecProg.operacion());
    	
    	 
    }
}
