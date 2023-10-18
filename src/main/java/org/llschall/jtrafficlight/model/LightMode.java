package org.llschall.jtrafficlight.model;

/**
 * A {@link LightMode} reflects the current behavior of the LED
 */
public enum LightMode {

    /**
     * The LED is switched off
     */
    OFF(0),
    /**
     * The LED is switched on
     */
    ON(9);

    final int value;

    LightMode(int value) {
        this.value = value;
    }

    String buildMessage() {
        return Integer.toString(value);
    }
}
