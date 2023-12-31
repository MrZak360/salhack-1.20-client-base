package me.ionar.salhack.font;

import java.util.Stack;

public class AlphaOverride {
    private static final Stack<Float> alphaMultipliers = new Stack<>();

    public static void pushAlphaMul(float val) {
        alphaMultipliers.push(val);
    }

    public static void popAlphaMul() {
        alphaMultipliers.pop();
    }

    public static float compute(int initialAlpha) {
        float alpha = initialAlpha;
        for (Float alphaMultiplier : alphaMultipliers) {
            alpha *= alphaMultiplier;
        }
        return alpha;
    }

}
