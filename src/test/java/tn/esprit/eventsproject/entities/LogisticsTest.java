package tn.esprit.eventsproject.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogisticsTest {

    @Test
    void testLogisticsEntity() {
        Logistics logistics = new Logistics();
        logistics.setIdLog(1);
        logistics.setDescription("Test Description");
        logistics.setReserve(true);
        logistics.setPrixUnit(150.75f);
        logistics.setQuantite(30);

        assertEquals(1, logistics.getIdLog());
        assertEquals("Test Description", logistics.getDescription());
        assertTrue(logistics.isReserve());
        assertEquals(150.75f, logistics.getPrixUnit());
        assertEquals(30, logistics.getQuantite());
    }

    @Test
    void testConstructor() {
        Logistics logistics = new Logistics(2, "Another Description", false, 200.50f, 15);

        assertEquals(2, logistics.getIdLog());
        assertEquals("Another Description", logistics.getDescription());
        assertFalse(logistics.isReserve());
        assertEquals(200.50f, logistics.getPrixUnit());
        assertEquals(15, logistics.getQuantite());
    }
}
