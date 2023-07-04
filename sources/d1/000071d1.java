package h10;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public b20.c f28593a;

    @Override // h10.j
    public w00.c a(l10.g javaClass) {
        s.g(javaClass, "javaClass");
        return b().b(javaClass);
    }

    public final b20.c b() {
        b20.c cVar = this.f28593a;
        if (cVar != null) {
            return cVar;
        }
        s.x("resolver");
        return null;
    }

    public final void c(b20.c cVar) {
        s.g(cVar, "<set-?>");
        this.f28593a = cVar;
    }
}