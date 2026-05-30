package ca.modmonster.playerupgrades.api;

import java.lang.reflect.InvocationTargetException;

public class PlayerUpgradesAPI {

    public static final String MOD_ID = "playerupgrades";

    private static final InternalMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalMethods) Class.forName("ca.modmonster.playerupgrades.InternalMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
