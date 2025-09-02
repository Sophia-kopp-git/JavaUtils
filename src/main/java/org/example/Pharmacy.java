package org.example;

import java.util.*;

public class Pharmacy {
    Map<String, Medication> medicaments = new HashMap<>();


    public int getCount() {
        return medicaments.size();
    }

    public void save(Medication medication) {
        medicaments.put(medication.getName(), medication);
    }
    public Medication find(String medicationName){
    Medication medicament = medicaments.get(medicationName);
        return medicament;
    }
    public void delete(String medicationName){
        medicaments.remove(medicationName);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medicaments=" + medicaments.toString() +
                '}';
    }
}
