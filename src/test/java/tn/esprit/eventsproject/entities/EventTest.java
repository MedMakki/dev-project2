package tn.esprit.eventsproject.entities;

import java.time.LocalDate;

public class EventTest {
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float cout;

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        if (dateDebut.isAfter(dateFin)) {
            throw new IllegalArgumentException("La date de début ne peut pas être après la date de fin.");
        }
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        if (dateFin.isBefore(dateDebut)) {
            throw new IllegalArgumentException("La date de fin ne peut pas être avant la date de début.");
        }
        this.dateFin = dateFin;
    }

    public float getCout() {
        return cout;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }
}
