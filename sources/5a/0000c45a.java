package z5;

import android.graphics.Bitmap;
import vz.b0;

/* loaded from: classes.dex */
public final class i extends t {

    /* renamed from: a  reason: collision with root package name */
    private final t5.d f60228a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t5.d referenceCounter) {
        super(null);
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        this.f60228a = referenceCounter;
    }

    @Override // z5.t
    public Object f(b6.k kVar, zz.d<? super b0> dVar) {
        Bitmap b11;
        t5.d dVar2 = this.f60228a;
        b11 = u.b(kVar);
        if (b11 != null) {
            dVar2.a(b11, false);
        }
        return b0.f54756a;
    }
}