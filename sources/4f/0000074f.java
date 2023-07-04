package androidx.lifecycle;

import java.io.Closeable;
import v20.f2;

/* loaded from: classes.dex */
public final class e implements Closeable, v20.o0 {

    /* renamed from: a  reason: collision with root package name */
    private final zz.g f5131a;

    public e(zz.g context) {
        kotlin.jvm.internal.s.g(context, "context");
        this.f5131a = context;
    }

    @Override // v20.o0
    public zz.g J() {
        return this.f5131a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f2.f(J(), null, 1, null);
    }
}