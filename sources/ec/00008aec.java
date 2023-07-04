package net.time4j;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class d1<V> implements net.time4j.engine.s<b0, V> {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.p<V> f40943a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.tz.l f40944b;

    /* renamed from: c  reason: collision with root package name */
    private final net.time4j.tz.p f40945c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(net.time4j.engine.p<V> pVar, net.time4j.tz.l lVar) {
        Objects.requireNonNull(lVar, "Missing timezone.");
        this.f40943a = pVar;
        this.f40944b = lVar;
        this.f40945c = null;
    }

    @Override // net.time4j.engine.s
    /* renamed from: a */
    public V apply(b0 b0Var) {
        net.time4j.tz.p pVar = this.f40945c;
        if (pVar == null) {
            pVar = this.f40944b.B(b0Var);
        }
        if (this.f40943a == h0.C && b0Var.i0() && pVar.i() == 0 && pVar.h() % 60 == 0) {
            return this.f40943a.getType().cast(60);
        }
        return (V) i0.S(b0Var, pVar).l(this.f40943a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(net.time4j.engine.p<V> pVar, net.time4j.tz.p pVar2) {
        Objects.requireNonNull(pVar2, "Missing timezone offset.");
        this.f40943a = pVar;
        this.f40944b = null;
        this.f40945c = pVar2;
    }
}