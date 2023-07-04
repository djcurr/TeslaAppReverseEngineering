package w0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class l0 {
    public static final boolean a(KeyEvent isTypedEvent) {
        kotlin.jvm.internal.s.g(isTypedEvent, "$this$isTypedEvent");
        return isTypedEvent.getAction() == 0 && isTypedEvent.getUnicodeChar() != 0;
    }
}