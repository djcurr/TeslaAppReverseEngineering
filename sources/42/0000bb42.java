package w0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class o {
    public static final boolean a(KeyEvent cancelsTextSelection) {
        kotlin.jvm.internal.s.g(cancelsTextSelection, "$this$cancelsTextSelection");
        return cancelsTextSelection.getKeyCode() == 4 && b2.c.e(b2.d.b(cancelsTextSelection), b2.c.f7345a.b());
    }

    public static final void b() {
    }
}