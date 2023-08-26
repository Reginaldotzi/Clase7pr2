package com.example;
import pkgAlumnos.Alumno;
import pkgAlumnos.CursoAsignado;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<CursoAsignado> cat_cursos = new ArrayList<>();
        cat_cursos.add(new CursoAsignado(101,"Programación",500));
        cat_cursos.add(new CursoAsignado(105,"Derecho",1));
        cat_cursos.add(new CursoAsignado(110,"Estadistica",450));
        cat_cursos.add(new CursoAsignado(120,"Electronica",400));





        Alumno al1 = new Alumno("2023015","Andrea","55555","5 calle 8-36 zona1");
        al1.agregarCursoAsignad(cat_cursos.get(0));
        al1.agregarCursoAsignad(cat_cursos.get(2));
        System.out.println("Total del alumno:"+al1.getNombre()+" Q."+al1.getTotalCursos());

   Alumno al2 = new Alumno("2020005","Monica","1111","4 calle 8-35 zona5");
        al2.agregarCursoAsignad(cat_cursos.get(3));
        al2.agregarCursoAsignad(cat_cursos.get(2));
        al1.agregarCursoAsignad(cat_cursos.get(1));
        System.out.println("Total del alumno:"+al2.getNombre()+" Q."+al2.getTotalCursos());

        Alumno al3 = new Alumno("202167", "Camilo","696969","6ta calle zona 3");
        al1.agregarCursoAsignad(cat_cursos.get(0));
        al1.agregarCursoAsignad(cat_cursos.get(2));
        al1.agregarCursoAsignad(cat_cursos.get(1));
        System.out.println("Total del alumno:"+al3.getNombre()+" Q."+al3.getTotalCursos());


        Alumno al4 = new Alumno("2025024", "Luis","131313","9na Calle 6-7 zona 5");
        al1.agregarCursoAsignad(cat_cursos.get(3));
        al1.agregarCursoAsignad(cat_cursos.get(1));
        al1.agregarCursoAsignad(cat_cursos.get(0));
        System.out.println("Total del alumno:"+al4.getNombre()+" Q."+al4.getTotalCursos());

        System.out.println(al1.getTotalCursos()+al2.getTotalCursos()+al3.getTotalCursos()+al4.getTotalCursos());


    }
}