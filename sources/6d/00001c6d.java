package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import ak.i0;
import ak.k0;
import android.net.Uri;
import ci.i;
import com.google.android.exoplayer2.Format;
import ej.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import qi.p;

/* loaded from: classes3.dex */
public class a implements ej.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f14304a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14305b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14306c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14307d;

    /* renamed from: e  reason: collision with root package name */
    public final C0255a f14308e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f14309f;

    /* renamed from: g  reason: collision with root package name */
    public final long f14310g;

    /* renamed from: h  reason: collision with root package name */
    public final long f14311h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0255a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f14312a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f14313b;

        /* renamed from: c  reason: collision with root package name */
        public final p[] f14314c;

        public C0255a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f14312a = uuid;
            this.f14313b = bArr;
            this.f14314c = pVarArr;
        }
    }

    public a(int i11, int i12, long j11, long j12, long j13, int i13, boolean z11, C0255a c0255a, b[] bVarArr) {
        this(i11, i12, j12 == 0 ? -9223372036854775807L : k0.I0(j12, 1000000L, j11), j13 != 0 ? k0.I0(j13, 1000000L, j11) : -9223372036854775807L, i13, z11, c0255a, bVarArr);
    }

    @Override // ej.a
    /* renamed from: b */
    public final a a(List<c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            c cVar = (c) arrayList.get(i11);
            b bVar2 = this.f14309f[cVar.f25188b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((i[]) arrayList3.toArray(new i[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f14324j[cVar.f25189c]);
            i11++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((i[]) arrayList3.toArray(new i[0])));
        }
        return new a(this.f14304a, this.f14305b, this.f14310g, this.f14311h, this.f14306c, this.f14307d, this.f14308e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f14315a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14316b;

        /* renamed from: c  reason: collision with root package name */
        public final long f14317c;

        /* renamed from: d  reason: collision with root package name */
        public final String f14318d;

        /* renamed from: e  reason: collision with root package name */
        public final int f14319e;

        /* renamed from: f  reason: collision with root package name */
        public final int f14320f;

        /* renamed from: g  reason: collision with root package name */
        public final int f14321g;

        /* renamed from: h  reason: collision with root package name */
        public final int f14322h;

        /* renamed from: i  reason: collision with root package name */
        public final String f14323i;

        /* renamed from: j  reason: collision with root package name */
        public final i[] f14324j;

        /* renamed from: k  reason: collision with root package name */
        public final int f14325k;

        /* renamed from: l  reason: collision with root package name */
        private final String f14326l;

        /* renamed from: m  reason: collision with root package name */
        private final String f14327m;

        /* renamed from: n  reason: collision with root package name */
        private final List<Long> f14328n;

        /* renamed from: o  reason: collision with root package name */
        private final long[] f14329o;

        /* renamed from: p  reason: collision with root package name */
        private final long f14330p;

        public b(String str, String str2, int i11, String str3, long j11, String str4, int i12, int i13, int i14, int i15, String str5, Format[] formatArr, List<Long> list, long j12) {
            this(str, str2, i11, str3, j11, str4, i12, i13, i14, i15, str5, formatArr, list, k0.J0(list, 1000000L, j11), k0.I0(j12, 1000000L, j11));
        }

        public Uri a(int i11, int i12) {
            ak.a.f(this.f14324j != null);
            ak.a.f(this.f14328n != null);
            ak.a.f(i12 < this.f14328n.size());
            String num = Integer.toString(this.f14324j[i11].f9201h);
            String l11 = this.f14328n.get(i12).toString();
            return i0.d(this.f14326l, this.f14327m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l11).replace("{start_time}", l11));
        }

        public b b(i[] iVarArr) {
            return new b(this.f14326l, this.f14327m, this.f14315a, this.f14316b, this.f14317c, this.f14318d, this.f14319e, this.f14320f, this.f14321g, this.f14322h, this.f14323i, iVarArr, this.f14328n, this.f14329o, this.f14330p);
        }

        public long c(int i11) {
            if (i11 == this.f14325k - 1) {
                return this.f14330p;
            }
            long[] jArr = this.f14329o;
            return jArr[i11 + 1] - jArr[i11];
        }

        public int d(long j11) {
            return k0.i(this.f14329o, j11, true, true);
        }

        public long e(int i11) {
            return this.f14329o[i11];
        }

        private b(String str, String str2, int i11, String str3, long j11, String str4, int i12, int i13, int i14, int i15, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j12) {
            this.f14326l = str;
            this.f14327m = str2;
            this.f14315a = i11;
            this.f14316b = str3;
            this.f14317c = j11;
            this.f14318d = str4;
            this.f14319e = i12;
            this.f14320f = i13;
            this.f14321g = i14;
            this.f14322h = i15;
            this.f14323i = str5;
            this.f14324j = formatArr;
            this.f14328n = list;
            this.f14329o = jArr;
            this.f14330p = j12;
            this.f14325k = list.size();
        }
    }

    private a(int i11, int i12, long j11, long j12, int i13, boolean z11, C0255a c0255a, b[] bVarArr) {
        this.f14304a = i11;
        this.f14305b = i12;
        this.f14310g = j11;
        this.f14311h = j12;
        this.f14306c = i13;
        this.f14307d = z11;
        this.f14308e = c0255a;
        this.f14309f = bVarArr;
    }
}