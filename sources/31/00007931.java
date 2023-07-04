package io.sentry.android.ndk;

import io.sentry.e0;
import io.sentry.f3;
import io.sentry.g;
import io.sentry.g3;
import io.sentry.protocol.w;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import rz.j;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class c implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final g3 f32180a;

    /* renamed from: b  reason: collision with root package name */
    private final b f32181b;

    public c(g3 g3Var) {
        this(g3Var, new NativeScope());
    }

    @Override // io.sentry.e0
    public void a(String str, String str2) {
        try {
            this.f32181b.a(str, str2);
        } catch (Throwable th2) {
            this.f32180a.getLogger().a(f3.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.e0
    public void b(String str, String str2) {
        try {
            this.f32181b.b(str, str2);
        } catch (Throwable th2) {
            this.f32180a.getLogger().a(f3.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.e0
    public void c(w wVar) {
        try {
            if (wVar == null) {
                this.f32181b.d();
            } else {
                this.f32181b.e(wVar.g(), wVar.f(), wVar.h(), wVar.j());
            }
        } catch (Throwable th2) {
            this.f32180a.getLogger().a(f3.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.e0
    public void e(io.sentry.c cVar) {
        try {
            String lowerCase = cVar.h() != null ? cVar.h().name().toLowerCase(Locale.ROOT) : null;
            String f11 = g.f(cVar.j());
            Map<String, Object> g11 = cVar.g();
            this.f32181b.c(lowerCase, cVar.i(), cVar.f(), cVar.k(), f11, g11.isEmpty() ? null : this.f32180a.getSerializer().e(g11));
        } catch (Throwable th2) {
            this.f32180a.getLogger().a(f3.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    c(g3 g3Var, b bVar) {
        this.f32180a = (g3) j.a(g3Var, "The SentryOptions object is required.");
        this.f32181b = (b) j.a(bVar, "The NativeScope object is required.");
    }
}