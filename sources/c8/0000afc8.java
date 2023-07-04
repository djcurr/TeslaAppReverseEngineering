package r1;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import g2.b;
import o1.f;

/* loaded from: classes.dex */
public final class r extends z0 implements g2.b, g2.d<p> {

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<p, vz.b0> f49012b;

    /* renamed from: c  reason: collision with root package name */
    private p f49013c;

    /* renamed from: d  reason: collision with root package name */
    private final g2.f<p> f49014d;

    /* loaded from: classes.dex */
    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        private boolean f49015a = r1.a.f48969a.b();

        a() {
        }

        @Override // r1.p
        public void a(boolean z11) {
            this.f49015a = z11;
        }

        @Override // r1.p
        public boolean b() {
            return this.f49015a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(h00.l<? super p, vz.b0> focusPropertiesScope, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(focusPropertiesScope, "focusPropertiesScope");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f49012b = focusPropertiesScope;
        this.f49014d = q.b();
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) b.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) b.a.c(this, r11, pVar);
    }

    @Override // g2.d
    /* renamed from: b */
    public p getValue() {
        a aVar = new a();
        this.f49012b.invoke(aVar);
        p pVar = this.f49013c;
        if (pVar != null && !kotlin.jvm.internal.s.c(pVar, r1.a.f48969a)) {
            aVar.a(pVar.b());
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && kotlin.jvm.internal.s.c(this.f49012b, ((r) obj).f49012b);
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return b.a.d(this, fVar);
    }

    @Override // g2.d
    public g2.f<p> getKey() {
        return this.f49014d;
    }

    public int hashCode() {
        return this.f49012b.hashCode();
    }

    @Override // g2.b
    public void n0(g2.e scope) {
        kotlin.jvm.internal.s.g(scope, "scope");
        this.f49013c = (p) scope.g0(q.b());
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return b.a.a(this, lVar);
    }
}