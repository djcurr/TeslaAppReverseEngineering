package net.time4j.calendar;

import net.time4j.engine.g;
import net.time4j.engine.s;
import net.time4j.engine.y;
import net.time4j.x0;
import net.time4j.z0;

/* loaded from: classes5.dex */
class r<D extends net.time4j.engine.g> implements y<D, x0> {

    /* renamed from: a  reason: collision with root package name */
    private final z0 f40929a;

    /* renamed from: b  reason: collision with root package name */
    private final s<D, net.time4j.engine.k<D>> f40930b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(z0 z0Var, s<D, net.time4j.engine.k<D>> sVar) {
        this.f40929a = z0Var;
        this.f40930b = sVar;
    }

    private static x0 h(long j11) {
        return x0.valueOf(net.time4j.base.c.d(j11 + 5, 7) + 1);
    }

    @Override // net.time4j.engine.y
    /* renamed from: c */
    public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
        return null;
    }

    @Override // net.time4j.engine.y
    /* renamed from: d */
    public net.time4j.engine.p<?> getChildAtFloor(D d11) {
        return null;
    }

    @Override // net.time4j.engine.y
    /* renamed from: e */
    public x0 getMaximum(D d11) {
        net.time4j.engine.k<D> apply = this.f40930b.apply(d11);
        if ((d11.b() + 7) - getValue(d11).getValue(this.f40929a) > apply.a()) {
            return h(apply.a());
        }
        return this.f40929a.f().roll(6);
    }

    @Override // net.time4j.engine.y
    /* renamed from: f */
    public x0 getMinimum(D d11) {
        net.time4j.engine.k<D> apply = this.f40930b.apply(d11);
        if ((d11.b() + 1) - getValue(d11).getValue(this.f40929a) < apply.c()) {
            return h(apply.c());
        }
        return this.f40929a.f();
    }

    @Override // net.time4j.engine.y
    /* renamed from: g */
    public x0 getValue(D d11) {
        return h(d11.b());
    }

    @Override // net.time4j.engine.y
    /* renamed from: i */
    public boolean isValid(D d11, x0 x0Var) {
        if (x0Var == null) {
            return false;
        }
        long b11 = (d11.b() + x0Var.getValue(this.f40929a)) - getValue(d11).getValue(this.f40929a);
        net.time4j.engine.k<D> apply = this.f40930b.apply(d11);
        return b11 >= apply.c() && b11 <= apply.a();
    }

    @Override // net.time4j.engine.y
    /* renamed from: j */
    public D withValue(D d11, x0 x0Var, boolean z11) {
        if (x0Var != null) {
            int value = getValue(d11).getValue(this.f40929a);
            long b11 = (d11.b() + x0Var.getValue(this.f40929a)) - value;
            net.time4j.engine.k<D> apply = this.f40930b.apply(d11);
            if (b11 >= apply.c() && b11 <= apply.a()) {
                return apply.b(b11);
            }
            throw new IllegalArgumentException("New day out of supported range.");
        }
        throw new IllegalArgumentException("Missing weekday.");
    }
}