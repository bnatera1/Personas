package com.example.android.personas;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by android on 19/09/2017.
 */

public class Datos {
    private static ArrayList<Personas> personas = new ArrayList<>();

    public static void guardar(Personas p){
        personas.add(p);
    }

    public static ArrayList<Personas> obtener(){
        return personas;
    }


}
