package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import ci.i;
import ci.q;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer2.upstream.a;
import hj.d;
import hj.e;
import hj.f;
import hj.j;
import hj.m;
import java.io.IOException;
import java.util.List;
import qi.o;
import qi.p;
import xj.g;
import zj.l;
import zj.n;

/* loaded from: classes3.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a  reason: collision with root package name */
    private final l f14249a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14250b;

    /* renamed from: c  reason: collision with root package name */
    private final f[] f14251c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f14252d;

    /* renamed from: e  reason: collision with root package name */
    private g f14253e;

    /* renamed from: f  reason: collision with root package name */
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f14254f;

    /* renamed from: g  reason: collision with root package name */
    private int f14255g;

    /* renamed from: h  reason: collision with root package name */
    private IOException f14256h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0254a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0258a f14257a;

        public C0254a(a.InterfaceC0258a interfaceC0258a) {
            this.f14257a = interfaceC0258a;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(l lVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i11, g gVar, n nVar) {
            com.google.android.exoplayer2.upstream.a a11 = this.f14257a.a();
            if (nVar != null) {
                a11.b(nVar);
            }
            return new a(lVar, aVar, i11, gVar, a11);
        }
    }

    /* loaded from: classes3.dex */
    private static final class b extends hj.b {
        public b(a.b bVar, int i11, int i12) {
            super(i12, bVar.f14325k - 1);
        }
    }

    public a(l lVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, int i11, g gVar, com.google.android.exoplayer2.upstream.a aVar2) {
        this.f14249a = lVar;
        this.f14254f = aVar;
        this.f14250b = i11;
        this.f14253e = gVar;
        this.f14252d = aVar2;
        a.b bVar = aVar.f14309f[i11];
        this.f14251c = new f[gVar.length()];
        int i12 = 0;
        while (i12 < this.f14251c.length) {
            int e11 = gVar.e(i12);
            i iVar = bVar.f14324j[e11];
            p[] pVarArr = iVar.f9208o != null ? ((a.C0255a) ak.a.e(aVar.f14308e)).f14314c : null;
            int i13 = bVar.f14315a;
            int i14 = i12;
            this.f14251c[i14] = new d(new qi.g(3, null, new o(e11, i13, bVar.f14317c, -9223372036854775807L, aVar.f14310g, iVar, 0, pVarArr, i13 == 2 ? 4 : 0, null, null)), bVar.f14315a, iVar);
            i12 = i14 + 1;
        }
    }

    private static m k(i iVar, com.google.android.exoplayer2.upstream.a aVar, Uri uri, int i11, long j11, long j12, long j13, int i12, Object obj, f fVar) {
        return new j(aVar, new com.google.android.exoplayer2.upstream.b(uri), iVar, i12, obj, j11, j12, j13, -9223372036854775807L, i11, 1, j11, fVar);
    }

    private long l(long j11) {
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f14254f;
        if (aVar.f14307d) {
            a.b bVar = aVar.f14309f[this.f14250b];
            int i11 = bVar.f14325k - 1;
            return (bVar.e(i11) + bVar.c(i11)) - j11;
        }
        return -9223372036854775807L;
    }

    @Override // hj.i
    public void a() {
        IOException iOException = this.f14256h;
        if (iOException == null) {
            this.f14249a.a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void b(g gVar) {
        this.f14253e = gVar;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void c(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        a.b[] bVarArr = this.f14254f.f14309f;
        int i11 = this.f14250b;
        a.b bVar = bVarArr[i11];
        int i12 = bVar.f14325k;
        a.b bVar2 = aVar.f14309f[i11];
        if (i12 != 0 && bVar2.f14325k != 0) {
            int i13 = i12 - 1;
            long e11 = bVar.e(i13) + bVar.c(i13);
            long e12 = bVar2.e(0);
            if (e11 <= e12) {
                this.f14255g += i12;
            } else {
                this.f14255g += bVar.d(e12);
            }
        } else {
            this.f14255g += i12;
        }
        this.f14254f = aVar;
    }

    @Override // hj.i
    public long d(long j11, q qVar) {
        a.b bVar = this.f14254f.f14309f[this.f14250b];
        int d11 = bVar.d(j11);
        long e11 = bVar.e(d11);
        return qVar.a(j11, e11, (e11 >= j11 || d11 >= bVar.f14325k + (-1)) ? e11 : bVar.e(d11 + 1));
    }

    @Override // hj.i
    public final void e(long j11, long j12, List<? extends m> list, hj.g gVar) {
        int g11;
        long j13 = j12;
        if (this.f14256h != null) {
            return;
        }
        com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.f14254f;
        a.b bVar = aVar.f14309f[this.f14250b];
        if (bVar.f14325k == 0) {
            gVar.f29264b = !aVar.f14307d;
            return;
        }
        if (list.isEmpty()) {
            g11 = bVar.d(j13);
        } else {
            g11 = (int) (list.get(list.size() - 1).g() - this.f14255g);
            if (g11 < 0) {
                this.f14256h = new BehindLiveWindowException();
                return;
            }
        }
        if (g11 >= bVar.f14325k) {
            gVar.f29264b = !this.f14254f.f14307d;
            return;
        }
        long j14 = j13 - j11;
        long l11 = l(j11);
        int length = this.f14253e.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new hj.n[length];
        for (int i11 = 0; i11 < length; i11++) {
            mediaChunkIteratorArr[i11] = new b(bVar, this.f14253e.e(i11), g11);
        }
        this.f14253e.n(j11, j14, l11, list, mediaChunkIteratorArr);
        long e11 = bVar.e(g11);
        long c11 = e11 + bVar.c(g11);
        if (!list.isEmpty()) {
            j13 = -9223372036854775807L;
        }
        long j15 = j13;
        int i12 = g11 + this.f14255g;
        int a11 = this.f14253e.a();
        f fVar = this.f14251c[a11];
        gVar.f29263a = k(this.f14253e.p(), this.f14252d, bVar.a(this.f14253e.e(a11), g11), i12, e11, c11, j15, this.f14253e.q(), this.f14253e.g(), fVar);
    }

    @Override // hj.i
    public boolean f(e eVar, boolean z11, Exception exc, long j11) {
        if (z11 && j11 != -9223372036854775807L) {
            g gVar = this.f14253e;
            if (gVar.c(gVar.b(eVar.f29257d), j11)) {
                return true;
            }
        }
        return false;
    }

    @Override // hj.i
    public void g(e eVar) {
    }

    @Override // hj.i
    public int i(long j11, List<? extends m> list) {
        if (this.f14256h == null && this.f14253e.length() >= 2) {
            return this.f14253e.m(j11, list);
        }
        return list.size();
    }

    @Override // hj.i
    public boolean j(long j11, e eVar, List<? extends m> list) {
        if (this.f14256h != null) {
            return false;
        }
        return this.f14253e.k(j11, eVar, list);
    }

    @Override // hj.i
    public void release() {
        for (f fVar : this.f14251c) {
            fVar.release();
        }
    }
}