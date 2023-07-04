package b2;

import android.view.KeyEvent;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d {
    public static final long a(KeyEvent key) {
        s.g(key, "$this$key");
        return g.a(key.getKeyCode());
    }

    public static final int b(KeyEvent type) {
        s.g(type, "$this$type");
        int action = type.getAction();
        if (action != 0) {
            if (action != 1) {
                return c.f7345a.c();
            }
            return c.f7345a.b();
        }
        return c.f7345a.a();
    }

    public static final int c(KeyEvent utf16CodePoint) {
        s.g(utf16CodePoint, "$this$utf16CodePoint");
        return utf16CodePoint.getUnicodeChar();
    }

    public static final boolean d(KeyEvent isCtrlPressed) {
        s.g(isCtrlPressed, "$this$isCtrlPressed");
        return isCtrlPressed.isCtrlPressed();
    }

    public static final boolean e(KeyEvent isShiftPressed) {
        s.g(isShiftPressed, "$this$isShiftPressed");
        return isShiftPressed.isShiftPressed();
    }
}