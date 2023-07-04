package com.google.android.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
final class u0 extends a {

    /* renamed from: e  reason: collision with root package name */
    private final int f14412e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14413f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f14414g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f14415h;

    /* renamed from: i  reason: collision with root package name */
    private final z0[] f14416i;

    /* renamed from: j  reason: collision with root package name */
    private final Object[] f14417j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<Object, Integer> f14418k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Collection<? extends o0> collection, fj.s sVar) {
        super(false, sVar);
        int i11 = 0;
        int size = collection.size();
        this.f14414g = new int[size];
        this.f14415h = new int[size];
        this.f14416i = new z0[size];
        this.f14417j = new Object[size];
        this.f14418k = new HashMap<>();
        int i12 = 0;
        int i13 = 0;
        for (o0 o0Var : collection) {
            this.f14416i[i13] = o0Var.b();
            this.f14415h[i13] = i11;
            this.f14414g[i13] = i12;
            i11 += this.f14416i[i13].p();
            i12 += this.f14416i[i13].i();
            this.f14417j[i13] = o0Var.a();
            this.f14418k.put(this.f14417j[i13], Integer.valueOf(i13));
            i13++;
        }
        this.f14412e = i11;
        this.f14413f = i12;
    }

    @Override // com.google.android.exoplayer2.a
    protected int A(int i11) {
        return this.f14415h[i11];
    }

    @Override // com.google.android.exoplayer2.a
    protected z0 D(int i11) {
        return this.f14416i[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<z0> E() {
        return Arrays.asList(this.f14416i);
    }

    @Override // com.google.android.exoplayer2.z0
    public int i() {
        return this.f14413f;
    }

    @Override // com.google.android.exoplayer2.z0
    public int p() {
        return this.f14412e;
    }

    @Override // com.google.android.exoplayer2.a
    protected int s(Object obj) {
        Integer num = this.f14418k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.a
    protected int t(int i11) {
        return ak.k0.h(this.f14414g, i11 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    protected int u(int i11) {
        return ak.k0.h(this.f14415h, i11 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    protected Object x(int i11) {
        return this.f14417j[i11];
    }

    @Override // com.google.android.exoplayer2.a
    protected int z(int i11) {
        return this.f14414g[i11];
    }
}