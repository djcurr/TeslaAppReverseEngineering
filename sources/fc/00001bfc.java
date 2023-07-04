package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.z0;
import com.google.common.collect.e0;
import com.google.common.collect.f0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class MergingMediaSource extends d<Integer> {

    /* renamed from: y  reason: collision with root package name */
    private static final i0 f13779y = new i0.c().d("MergingMediaSource").a();

    /* renamed from: j  reason: collision with root package name */
    private final boolean f13780j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f13781k;

    /* renamed from: l  reason: collision with root package name */
    private final j[] f13782l;

    /* renamed from: m  reason: collision with root package name */
    private final z0[] f13783m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList<j> f13784n;

    /* renamed from: o  reason: collision with root package name */
    private final fj.c f13785o;

    /* renamed from: p  reason: collision with root package name */
    private final Map<Object, Long> f13786p;

    /* renamed from: q  reason: collision with root package name */
    private final e0<Object, c> f13787q;

    /* renamed from: t  reason: collision with root package name */
    private int f13788t;

    /* renamed from: w  reason: collision with root package name */
    private long[][] f13789w;

    /* renamed from: x  reason: collision with root package name */
    private IllegalMergeException f13790x;

    /* loaded from: classes3.dex */
    public static final class IllegalMergeException extends IOException {
        public IllegalMergeException(int i11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a extends fj.f {

        /* renamed from: c  reason: collision with root package name */
        private final long[] f13791c;

        /* renamed from: d  reason: collision with root package name */
        private final long[] f13792d;

        public a(z0 z0Var, Map<Object, Long> map) {
            super(z0Var);
            int p11 = z0Var.p();
            this.f13792d = new long[z0Var.p()];
            z0.c cVar = new z0.c();
            for (int i11 = 0; i11 < p11; i11++) {
                this.f13792d[i11] = z0Var.n(i11, cVar).f14802p;
            }
            int i12 = z0Var.i();
            this.f13791c = new long[i12];
            z0.b bVar = new z0.b();
            for (int i13 = 0; i13 < i12; i13++) {
                z0Var.g(i13, bVar, true);
                long longValue = ((Long) ak.a.e(map.get(bVar.f14780b))).longValue();
                long[] jArr = this.f13791c;
                jArr[i13] = longValue == Long.MIN_VALUE ? bVar.f14782d : longValue;
                long j11 = bVar.f14782d;
                if (j11 != -9223372036854775807L) {
                    long[] jArr2 = this.f13792d;
                    int i14 = bVar.f14781c;
                    jArr2[i14] = jArr2[i14] - (j11 - jArr[i13]);
                }
            }
        }

        @Override // fj.f, com.google.android.exoplayer2.z0
        public z0.b g(int i11, z0.b bVar, boolean z11) {
            super.g(i11, bVar, z11);
            bVar.f14782d = this.f13791c[i11];
            return bVar;
        }

        @Override // fj.f, com.google.android.exoplayer2.z0
        public z0.c o(int i11, z0.c cVar, long j11) {
            long j12;
            super.o(i11, cVar, j11);
            long j13 = this.f13792d[i11];
            cVar.f14802p = j13;
            if (j13 != -9223372036854775807L) {
                long j14 = cVar.f14801o;
                if (j14 != -9223372036854775807L) {
                    j12 = Math.min(j14, j13);
                    cVar.f14801o = j12;
                    return cVar;
                }
            }
            j12 = cVar.f14801o;
            cVar.f14801o = j12;
            return cVar;
        }
    }

    public MergingMediaSource(j... jVarArr) {
        this(false, jVarArr);
    }

    private void K() {
        z0.b bVar = new z0.b();
        for (int i11 = 0; i11 < this.f13788t; i11++) {
            long j11 = -this.f13783m[0].f(i11, bVar).l();
            int i12 = 1;
            while (true) {
                z0[] z0VarArr = this.f13783m;
                if (i12 < z0VarArr.length) {
                    this.f13789w[i11][i12] = j11 - (-z0VarArr[i12].f(i11, bVar).l());
                    i12++;
                }
            }
        }
    }

    private void N() {
        z0[] z0VarArr;
        z0.b bVar = new z0.b();
        for (int i11 = 0; i11 < this.f13788t; i11++) {
            int i12 = 0;
            long j11 = Long.MIN_VALUE;
            while (true) {
                z0VarArr = this.f13783m;
                if (i12 >= z0VarArr.length) {
                    break;
                }
                long h11 = z0VarArr[i12].f(i11, bVar).h();
                if (h11 != -9223372036854775807L) {
                    long j12 = h11 + this.f13789w[i11][i12];
                    if (j11 == Long.MIN_VALUE || j12 < j11) {
                        j11 = j12;
                    }
                }
                i12++;
            }
            Object m11 = z0VarArr[0].m(i11);
            this.f13786p.put(m11, Long.valueOf(j11));
            for (c cVar : this.f13787q.get(m11)) {
                cVar.v(0L, j11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.d, com.google.android.exoplayer2.source.a
    public void A(zj.n nVar) {
        super.A(nVar);
        for (int i11 = 0; i11 < this.f13782l.length; i11++) {
            J(Integer.valueOf(i11), this.f13782l[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.d, com.google.android.exoplayer2.source.a
    public void C() {
        super.C();
        Arrays.fill(this.f13783m, (Object) null);
        this.f13788t = -1;
        this.f13790x = null;
        this.f13784n.clear();
        Collections.addAll(this.f13784n, this.f13782l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.d
    /* renamed from: L */
    public j.a E(Integer num, j.a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.d
    /* renamed from: M */
    public void I(Integer num, j jVar, z0 z0Var) {
        if (this.f13790x != null) {
            return;
        }
        if (this.f13788t == -1) {
            this.f13788t = z0Var.i();
        } else if (z0Var.i() != this.f13788t) {
            this.f13790x = new IllegalMergeException(0);
            return;
        }
        if (this.f13789w.length == 0) {
            this.f13789w = (long[][]) Array.newInstance(long.class, this.f13788t, this.f13783m.length);
        }
        this.f13784n.remove(jVar);
        this.f13783m[num.intValue()] = z0Var;
        if (this.f13784n.isEmpty()) {
            if (this.f13780j) {
                K();
            }
            a aVar = this.f13783m[0];
            if (this.f13781k) {
                N();
                aVar = new a(aVar, this.f13786p);
            }
            B(aVar);
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public i0 f() {
        j[] jVarArr = this.f13782l;
        return jVarArr.length > 0 ? jVarArr[0].f() : f13779y;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void g(i iVar) {
        if (this.f13781k) {
            c cVar = (c) iVar;
            Iterator<Map.Entry<Object, c>> it2 = this.f13787q.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<Object, c> next = it2.next();
                if (next.getValue().equals(cVar)) {
                    this.f13787q.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            iVar = cVar.f13802a;
        }
        l lVar = (l) iVar;
        int i11 = 0;
        while (true) {
            j[] jVarArr = this.f13782l;
            if (i11 >= jVarArr.length) {
                return;
            }
            jVarArr[i11].g(lVar.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public i k(j.a aVar, zj.b bVar, long j11) {
        int length = this.f13782l.length;
        i[] iVarArr = new i[length];
        int b11 = this.f13783m[0].b(aVar.f26303a);
        for (int i11 = 0; i11 < length; i11++) {
            iVarArr[i11] = this.f13782l[i11].k(aVar.c(this.f13783m[i11].m(b11)), bVar, j11 - this.f13789w[b11][i11]);
        }
        l lVar = new l(this.f13785o, this.f13789w[b11], iVarArr);
        if (this.f13781k) {
            c cVar = new c(lVar, true, 0L, ((Long) ak.a.e(this.f13786p.get(aVar.f26303a))).longValue());
            this.f13787q.put(aVar.f26303a, cVar);
            return cVar;
        }
        return lVar;
    }

    @Override // com.google.android.exoplayer2.source.d, com.google.android.exoplayer2.source.j
    public void p() {
        IllegalMergeException illegalMergeException = this.f13790x;
        if (illegalMergeException == null) {
            super.p();
            return;
        }
        throw illegalMergeException;
    }

    public MergingMediaSource(boolean z11, j... jVarArr) {
        this(z11, false, jVarArr);
    }

    public MergingMediaSource(boolean z11, boolean z12, j... jVarArr) {
        this(z11, z12, new fj.d(), jVarArr);
    }

    public MergingMediaSource(boolean z11, boolean z12, fj.c cVar, j... jVarArr) {
        this.f13780j = z11;
        this.f13781k = z12;
        this.f13782l = jVarArr;
        this.f13785o = cVar;
        this.f13784n = new ArrayList<>(Arrays.asList(jVarArr));
        this.f13788t = -1;
        this.f13783m = new z0[jVarArr.length];
        this.f13789w = new long[0];
        this.f13786p = new HashMap();
        this.f13787q = f0.a().a().e();
    }
}