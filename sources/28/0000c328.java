package yu;

import android.content.Context;
import retrofit2.t;
import yu.a0;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f59796a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static at.f f59797b;

    private j() {
    }

    public static final js.b a(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        js.b l11 = z.p(context.getApplicationContext()).l();
        kotlin.jvm.internal.s.f(l11, "getInstance(context.appl…onContext).authRepository");
        return l11;
    }

    public static final at.f b(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        if (f59797b == null) {
            synchronized (f59796a) {
                if (f59797b == null) {
                    t.b bVar = new t.b();
                    a0.a aVar = a0.f59768c;
                    f59797b = (at.f) bVar.c(aVar.c()).g(aVar.b(context, a(context)).f()).a(kx.g.a()).b(k80.a.f()).e().b(at.f.class);
                }
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }
        at.f fVar = f59797b;
        kotlin.jvm.internal.s.e(fVar);
        return fVar;
    }
}