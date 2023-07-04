package f6;

import b6.e;
import b6.h;
import b6.k;
import vz.b0;
import zz.d;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25910b = new a();

    private a() {
    }

    @Override // f6.b
    public Object a(c cVar, h hVar, d<? super b0> dVar) {
        if (hVar instanceof k) {
            cVar.a(((k) hVar).a());
        } else if (hVar instanceof e) {
            cVar.d(hVar.a());
        }
        return b0.f54756a;
    }

    public String toString() {
        return "coil.transition.NoneTransition";
    }
}