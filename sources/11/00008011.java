package kotlinx.coroutines.internal;

import vz.q;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f35485a;

    static {
        Object b11;
        try {
            q.a aVar = vz.q.f54772b;
            b11 = vz.q.b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        f35485a = vz.q.h(b11);
    }

    public static final boolean a() {
        return f35485a;
    }
}