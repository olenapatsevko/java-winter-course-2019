import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
class TemperatureConverterTest {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    @org.junit.jupiter.api.Test
    void convertFtoC() {
        assertEquals(60.0, temperatureConverter.convertFtoC(140));
        assertEquals(171.10, temperatureConverter.convertFtoC(340), 0.1);
        assertEquals(-17.20, temperatureConverter.convertFtoC(1), 0.1);
    }

    @org.junit.jupiter.api.Test
    void convertCtoF() {
        assertEquals(131.0, temperatureConverter.convertCtoF(55), 0.1);
        assertEquals(523.4, temperatureConverter.convertCtoF(273), 0.1);
        assertEquals(32.0, temperatureConverter.convertCtoF(0), 0.1);
    }

    @org.junit.jupiter.api.Test
    void convertCtoK() {
        assertEquals(273.20, temperatureConverter.convertCtoK(0));
        assertEquals(283.2, temperatureConverter.convertCtoK(10));
        assertEquals(546.20, temperatureConverter.convertCtoK(273));
    }

    @org.junit.jupiter.api.Test
    void convertKtoC() {
        assertEquals(141.80, temperatureConverter.convertKtoC(415));
        assertEquals(-273.20, temperatureConverter.convertKtoC(0));
        assertEquals(-258.20, temperatureConverter.convertKtoC(15));

    }

    @org.junit.jupiter.api.Test
    void convertFtoK() {
        assertEquals(263.7, temperatureConverter.convertFtoK(15), 0.1);
        assertEquals(255.3, temperatureConverter.convertFtoK(0), 0.1);
        assertEquals(407.0, temperatureConverter.convertFtoK(273), 0.1);
    }

    @org.junit.jupiter.api.Test
    void convertKtoF() {
        assertEquals(-459.70, temperatureConverter.convertKtoF(0), 0.1);
        assertEquals(31.70, temperatureConverter.convertKtoF(273), 0.1);
        assertEquals(-441.70, temperatureConverter.convertKtoF(10), 0.1);
    }
}