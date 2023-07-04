package zu;

import android.database.CursorWindow;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public class d {
    public static void a() {
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            declaredField.set(null, 104857600);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}