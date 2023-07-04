package com.google.common.collect;

import com.google.common.base.o;
import com.google.common.collect.b0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    boolean f15963a;

    /* renamed from: b  reason: collision with root package name */
    int f15964b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f15965c = -1;

    /* renamed from: d  reason: collision with root package name */
    b0.n f15966d;

    /* renamed from: e  reason: collision with root package name */
    b0.n f15967e;

    /* renamed from: f  reason: collision with root package name */
    com.google.common.base.j<Object> f15968f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int i11 = this.f15965c;
        if (i11 == -1) {
            return 4;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        int i11 = this.f15964b;
        if (i11 == -1) {
            return 16;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.base.j<Object> c() {
        return (com.google.common.base.j) com.google.common.base.o.a(this.f15968f, d().defaultEquivalence());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0.n d() {
        return (b0.n) com.google.common.base.o.a(this.f15966d, b0.n.STRONG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0.n e() {
        return (b0.n) com.google.common.base.o.a(this.f15967e, b0.n.STRONG);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        if (!this.f15963a) {
            return new ConcurrentHashMap(b(), 0.75f, a());
        }
        return b0.b(this);
    }

    a0 g(b0.n nVar) {
        b0.n nVar2 = this.f15966d;
        com.google.common.base.u.x(nVar2 == null, "Key strength was already set to %s", nVar2);
        this.f15966d = (b0.n) com.google.common.base.u.o(nVar);
        if (nVar != b0.n.STRONG) {
            this.f15963a = true;
        }
        return this;
    }

    public a0 h() {
        return g(b0.n.WEAK);
    }

    public String toString() {
        o.b c11 = com.google.common.base.o.c(this);
        int i11 = this.f15964b;
        if (i11 != -1) {
            c11.b("initialCapacity", i11);
        }
        int i12 = this.f15965c;
        if (i12 != -1) {
            c11.b("concurrencyLevel", i12);
        }
        b0.n nVar = this.f15966d;
        if (nVar != null) {
            c11.d("keyStrength", com.google.common.base.c.c(nVar.toString()));
        }
        b0.n nVar2 = this.f15967e;
        if (nVar2 != null) {
            c11.d("valueStrength", com.google.common.base.c.c(nVar2.toString()));
        }
        if (this.f15968f != null) {
            c11.k("keyEquivalence");
        }
        return c11.toString();
    }
}