package o2;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class h implements l {
    @Override // o2.l
    public StaticLayout a(n params) {
        s.g(params, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(params.p(), params.o(), params.e(), params.m(), params.s());
        obtain.setTextDirection(params.q());
        obtain.setAlignment(params.a());
        obtain.setMaxLines(params.l());
        obtain.setEllipsize(params.c());
        obtain.setEllipsizedWidth(params.d());
        obtain.setLineSpacing(params.j(), params.k());
        obtain.setIncludePad(params.g());
        obtain.setBreakStrategy(params.b());
        obtain.setHyphenationFrequency(params.f());
        obtain.setIndents(params.i(), params.n());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            i iVar = i.f42150a;
            s.f(obtain, "this");
            iVar.a(obtain, params.h());
        }
        if (i11 >= 28) {
            j jVar = j.f42151a;
            s.f(obtain, "this");
            jVar.a(obtain, params.r());
        }
        StaticLayout build = obtain.build();
        s.f(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}