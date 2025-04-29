package com.example.unitconverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitConverterTest {
    private final UnitConverter converter = new UnitConverter();

    @Test
    public void testMilesToKilometers() {
        assertEquals(16.0934, converter.milesToKilometers(10), 0.0001);
    }

    @Test
    public void testKilogramsToPounds() {
        assertEquals(22.0462, converter.kilogramsToPounds(10), 0.0001);
    }
}

