package tn.esprit.eventsproject.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticipantTest {

    @Test
    void testParticipantCreation() {
        // Créer un participant avec une tâche spécifique
        Participant participant = new Participant();
        participant.setNom("John");
        participant.setPrenom("Doe");
        participant.setTache(Tache.ORGANISATEUR);

        // Vérifier les attributs
        assertEquals("John", participant.getNom());
        assertEquals("Doe", participant.getPrenom());
        assertEquals(Tache.ORGANISATEUR, participant.getTache());
    }

    @Test
    void testTacheEnum() {
        // Vérifier que l'énumération Tache fonctionne correctement
        Participant participant = new Participant();
        participant.setTache(Tache.INVITE);

        assertEquals(Tache.INVITE, participant.getTache());
    }
}
