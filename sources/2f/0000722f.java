package h2;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class v extends b<b2.e> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o wrapped, b2.e modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    @Override // h2.b, h2.o
    public void G1() {
        super.G1();
        a2().e(this);
    }

    @Override // h2.b, h2.o
    public v d1() {
        return this;
    }

    public final boolean j2(KeyEvent keyEvent) {
        kotlin.jvm.internal.s.g(keyEvent, "keyEvent");
        h00.l<b2.b, Boolean> b11 = a2().b();
        Boolean invoke = b11 == null ? null : b11.invoke(b2.b.a(keyEvent));
        if (kotlin.jvm.internal.s.c(invoke, Boolean.TRUE)) {
            return invoke.booleanValue();
        }
        v b12 = b1();
        if (b12 == null) {
            return false;
        }
        return b12.j2(keyEvent);
    }

    public final boolean k2(KeyEvent keyEvent) {
        Boolean invoke;
        kotlin.jvm.internal.s.g(keyEvent, "keyEvent");
        v b12 = b1();
        Boolean valueOf = b12 == null ? null : Boolean.valueOf(b12.k2(keyEvent));
        if (kotlin.jvm.internal.s.c(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        h00.l<b2.b, Boolean> c11 = a2().c();
        if (c11 == null || (invoke = c11.invoke(b2.b.a(keyEvent))) == null) {
            return false;
        }
        return invoke.booleanValue();
    }
}