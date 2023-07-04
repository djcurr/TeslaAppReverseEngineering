package c1;

import android.os.Trace;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    public static final z1 f8727a = new z1();

    private z1() {
    }

    public final Object a(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        Trace.beginSection(name);
        return null;
    }

    public final void b(Object obj) {
        Trace.endSection();
    }
}