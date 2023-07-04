package rn;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class a {
    private static String a(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        sb2.append('#');
        sb2.append(constructor.getDeclaringClass().getSimpleName());
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i11].getSimpleName());
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    public static void b(Field field) {
        try {
            field.setAccessible(true);
        } catch (Exception e11) {
            throw new JsonIOException("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", e11);
        }
    }

    public static String c(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e11) {
            return "Failed making constructor '" + a(constructor) + "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e11.getMessage();
        }
    }
}