package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.f1;
import androidx.camera.core.impl.s;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.j;
import androidx.lifecycle.v;
import c0.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v3.h;
import z.e;
import z.z0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final c f2578c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final LifecycleCameraRepository f2579a = new LifecycleCameraRepository();

    /* renamed from: b  reason: collision with root package name */
    private j f2580b;

    private c() {
    }

    public static com.google.common.util.concurrent.c<c> d(Context context) {
        h.f(context);
        return f.o(j.r(context), new p.a() { // from class: androidx.camera.lifecycle.b
            @Override // p.a
            public final Object apply(Object obj) {
                c e11;
                e11 = c.e((j) obj);
                return e11;
            }
        }, b0.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c e(j jVar) {
        c cVar = f2578c;
        cVar.f(jVar);
        return cVar;
    }

    private void f(j jVar) {
        this.f2580b = jVar;
    }

    public z.b b(v vVar, e eVar, z0 z0Var, f1... f1VarArr) {
        a0.j.a();
        e.a c11 = e.a.c(eVar);
        for (f1 f1Var : f1VarArr) {
            e s11 = f1Var.f().s(null);
            if (s11 != null) {
                Iterator<z.c> it2 = s11.c().iterator();
                while (it2.hasNext()) {
                    c11.a(it2.next());
                }
            }
        }
        LinkedHashSet<s> a11 = c11.b().a(this.f2580b.n().d());
        LifecycleCamera c12 = this.f2579a.c(vVar, CameraUseCaseAdapter.m(a11));
        Collection<LifecycleCamera> e11 = this.f2579a.e();
        for (f1 f1Var2 : f1VarArr) {
            for (LifecycleCamera lifecycleCamera : e11) {
                if (lifecycleCamera.n(f1Var2) && lifecycleCamera != c12) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", f1Var2));
                }
            }
        }
        if (c12 == null) {
            c12 = this.f2579a.b(vVar, new CameraUseCaseAdapter(a11, this.f2580b.m(), this.f2580b.p()));
        }
        if (f1VarArr.length == 0) {
            return c12;
        }
        this.f2579a.a(c12, z0Var, Arrays.asList(f1VarArr));
        return c12;
    }

    public z.b c(v vVar, e eVar, f1... f1VarArr) {
        return b(vVar, eVar, null, f1VarArr);
    }

    public void g() {
        a0.j.a();
        this.f2579a.k();
    }
}