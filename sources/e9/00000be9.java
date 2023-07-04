package b2;

import android.view.KeyEvent;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final KeyEvent f7344a;

    private /* synthetic */ b(KeyEvent keyEvent) {
        this.f7344a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public static KeyEvent b(KeyEvent nativeKeyEvent) {
        s.g(nativeKeyEvent, "nativeKeyEvent");
        return nativeKeyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof b) && s.c(keyEvent, ((b) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.f7344a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f7344a;
    }

    public int hashCode() {
        return d(this.f7344a);
    }

    public String toString() {
        return e(this.f7344a);
    }
}