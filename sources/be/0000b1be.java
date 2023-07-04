package s2;

import kotlin.jvm.internal.m0;

/* loaded from: classes.dex */
public final class i implements d {
    @Override // s2.d
    public void a(g buffer) {
        kotlin.jvm.internal.s.g(buffer, "buffer");
        buffer.a();
    }

    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    public int hashCode() {
        return m0.b(i.class).hashCode();
    }

    public String toString() {
        return "FinishComposingTextCommand()";
    }
}