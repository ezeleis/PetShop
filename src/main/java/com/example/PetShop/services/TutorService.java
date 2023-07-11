package com.example.PetShop.services;

import com.example.PetShop.Entities.Tutor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TutorService {

    private final Map<String, Tutor> tutors = new HashMap<>();

    public List<Tutor> getAllTutors() {
        return new ArrayList<>(tutors.values());
    }

    public Tutor getTutor(String id) {
        return tutors.get(id);
    }

    public Tutor createTutor(Tutor tutor) {
        tutors.put(tutor.getId(), tutor);
        return tutor;
    }

    public Tutor updateTutor(String id, Tutor tutor) {
        tutors.put(id, tutor);
        return tutor;
    }

    public void deleteTutor(String id) {
        tutors.remove(id);
    }
}