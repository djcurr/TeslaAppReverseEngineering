package u2;

import android.text.TextPaint;
import kotlin.jvm.internal.s;
import t1.a0;
import t1.a1;
import t1.c0;
import w2.e;

/* loaded from: classes.dex */
public final class g extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    private w2.e f53022a;

    /* renamed from: b  reason: collision with root package name */
    private a1 f53023b;

    public g(int i11, float f11) {
        super(i11);
        ((TextPaint) this).density = f11;
        this.f53022a = w2.e.f55408b.c();
        this.f53023b = a1.f51374d.a();
    }

    public final void a(long j11) {
        int j12;
        if (!(j11 != a0.f51365b.f()) || getColor() == (j12 = c0.j(j11))) {
            return;
        }
        setColor(j12);
    }

    public final void b(a1 a1Var) {
        if (a1Var == null) {
            a1Var = a1.f51374d.a();
        }
        if (s.c(this.f53023b, a1Var)) {
            return;
        }
        this.f53023b = a1Var;
        if (s.c(a1Var, a1.f51374d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(this.f53023b.b(), s1.f.l(this.f53023b.d()), s1.f.m(this.f53023b.d()), c0.j(this.f53023b.c()));
        }
    }

    public final void c(w2.e eVar) {
        if (eVar == null) {
            eVar = w2.e.f55408b.c();
        }
        if (s.c(this.f53022a, eVar)) {
            return;
        }
        this.f53022a = eVar;
        e.a aVar = w2.e.f55408b;
        setUnderlineText(eVar.d(aVar.d()));
        setStrikeThruText(this.f53022a.d(aVar.b()));
    }
}