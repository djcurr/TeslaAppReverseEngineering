package f2;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import f2.i0;
import o1.f;

/* loaded from: classes.dex */
final class k0 extends z0 implements i0 {

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<x2.o, vz.b0> f25580b;

    /* renamed from: c  reason: collision with root package name */
    private long f25581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(h00.l<? super x2.o, vz.b0> onSizeChanged, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(onSizeChanged, "onSizeChanged");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f25580b = onSizeChanged;
        this.f25581c = x2.p.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) i0.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) i0.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return kotlin.jvm.internal.s.c(this.f25580b, ((k0) obj).f25580b);
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return i0.a.d(this, fVar);
    }

    public int hashCode() {
        return this.f25580b.hashCode();
    }

    @Override // f2.i0
    public void o(long j11) {
        if (x2.o.e(this.f25581c, j11)) {
            return;
        }
        this.f25580b.invoke(x2.o.b(j11));
        this.f25581c = j11;
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return i0.a.a(this, lVar);
    }
}