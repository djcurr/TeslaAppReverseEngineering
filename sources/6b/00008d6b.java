package o1;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import h00.l;
import h00.p;
import h00.q;
import kotlin.jvm.internal.s;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends z0 implements f.c {

    /* renamed from: b  reason: collision with root package name */
    private final q<f, c1.i, Integer, f> f42059b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super y0, b0> inspectorInfo, q<? super f, ? super c1.i, ? super Integer, ? extends f> factory) {
        super(inspectorInfo);
        s.g(inspectorInfo, "inspectorInfo");
        s.g(factory, "factory");
        this.f42059b = factory;
    }

    @Override // o1.f
    public <R> R C(R r11, p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) f.c.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) f.c.a.c(this, r11, pVar);
    }

    public final q<f, c1.i, Integer, f> b() {
        return this.f42059b;
    }

    @Override // o1.f
    public f g0(f fVar) {
        return f.c.a.d(this, fVar);
    }

    @Override // o1.f
    public boolean p(l<? super f.c, Boolean> lVar) {
        return f.c.a.a(this, lVar);
    }
}