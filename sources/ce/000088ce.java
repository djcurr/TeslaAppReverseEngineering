package n0;

import g2.d;
import o1.f;

/* loaded from: classes.dex */
final class s implements g2.d<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final s f40120a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final g2.f<Boolean> f40121b = e0.d();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f40122c = true;

    private s() {
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) d.a.b(this, r11, pVar);
    }

    @Override // g2.d
    /* renamed from: a */
    public Boolean getValue() {
        return Boolean.valueOf(f40122c);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) d.a.c(this, r11, pVar);
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return d.a.d(this, fVar);
    }

    @Override // g2.d
    public g2.f<Boolean> getKey() {
        return f40121b;
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return d.a.a(this, lVar);
    }
}