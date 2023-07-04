package b6;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: c  reason: collision with root package name */
    public static final f f7440c = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final v f7439b = a.f7441a;

    /* loaded from: classes.dex */
    static final class a implements v {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7441a = new a();

        a() {
        }

        @Override // androidx.lifecycle.v
        public final p getLifecycle() {
            return f.f7440c;
        }
    }

    private f() {
    }

    @Override // androidx.lifecycle.p
    public void a(u observer) {
        s.g(observer, "observer");
        if (observer instanceof DefaultLifecycleObserver) {
            DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) observer;
            v vVar = f7439b;
            defaultLifecycleObserver.onCreate(vVar);
            defaultLifecycleObserver.onStart(vVar);
            defaultLifecycleObserver.onResume(vVar);
            return;
        }
        throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.p
    public p.c b() {
        return p.c.RESUMED;
    }

    @Override // androidx.lifecycle.p
    public void c(u observer) {
        s.g(observer, "observer");
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}