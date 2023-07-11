package com.example.PetShop.Repositories;

import com.example.PetShop.Entities.Tutor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TutorRepository {

    private static final Map<String, Tutor> tutors = new HashMap<>();

    public List<Tutor> getAllTutors() {
        return new ArrayList<>(tutors.values());
    }

    public static Tutor getTutor(String id) {
        return tutors.get(id);
    }

    public void createTutor(Tutor tutor) {
        tutors.put(tutor.getId(), tutor);
    }

    public void updateTutor(String id, Tutor tutor) {
        tutors.put(id, tutor);
    }

    public void deleteTutor(String id) {
        tutors.remove(id);
    }
}
