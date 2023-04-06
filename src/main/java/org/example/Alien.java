package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("#{20}")
    private int x;
    @Value("#{30}")
    private int y;
    @Value("#{alien.x + alien.y}")
    private int z;

    @Value("#{T(org.example.Alien).hello(5.77)}")
    private double d;

    @Value("#{new java.lang.String('Genspark')}")
    private String name;

    @Value("#{true}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public static double hello(double a) {
        return a;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", d=" + d +
                '}';
    }
}
