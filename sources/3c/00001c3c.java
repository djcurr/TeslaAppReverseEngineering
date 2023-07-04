package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.common.collect.r;
import com.google.common.collect.t;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d extends lj.d {

    /* renamed from: d  reason: collision with root package name */
    public final int f14083d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14084e;

    /* renamed from: f  reason: collision with root package name */
    public final long f14085f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14086g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14087h;

    /* renamed from: i  reason: collision with root package name */
    public final long f14088i;

    /* renamed from: j  reason: collision with root package name */
    public final int f14089j;

    /* renamed from: k  reason: collision with root package name */
    public final long f14090k;

    /* renamed from: l  reason: collision with root package name */
    public final long f14091l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f14092m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f14093n;

    /* renamed from: o  reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.e f14094o;

    /* renamed from: p  reason: collision with root package name */
    public final List<C0252d> f14095p;

    /* renamed from: q  reason: collision with root package name */
    public final List<b> f14096q;

    /* renamed from: r  reason: collision with root package name */
    public final Map<Uri, c> f14097r;

    /* renamed from: s  reason: collision with root package name */
    public final long f14098s;

    /* renamed from: t  reason: collision with root package name */
    public final f f14099t;

    /* loaded from: classes3.dex */
    public static final class b extends e {

        /* renamed from: l  reason: collision with root package name */
        public final boolean f14100l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f14101m;

        public b(String str, C0252d c0252d, long j11, int i11, long j12, com.google.android.exoplayer2.drm.e eVar, String str2, String str3, long j13, long j14, boolean z11, boolean z12, boolean z13) {
            super(str, c0252d, j11, i11, j12, eVar, str2, str3, j13, j14, z11);
            this.f14100l = z12;
            this.f14101m = z13;
        }

        public b b(long j11, int i11) {
            return new b(this.f14106a, this.f14107b, this.f14108c, i11, j11, this.f14111f, this.f14112g, this.f14113h, this.f14114i, this.f14115j, this.f14116k, this.f14100l, this.f14101m);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f14102a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14103b;

        public c(Uri uri, long j11, int i11) {
            this.f14102a = j11;
            this.f14103b = i11;
        }
    }

    /* loaded from: classes3.dex */
    public static class e implements Comparable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final String f14106a;

        /* renamed from: b  reason: collision with root package name */
        public final C0252d f14107b;

        /* renamed from: c  reason: collision with root package name */
        public final long f14108c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14109d;

        /* renamed from: e  reason: collision with root package name */
        public final long f14110e;

        /* renamed from: f  reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.e f14111f;

        /* renamed from: g  reason: collision with root package name */
        public final String f14112g;

        /* renamed from: h  reason: collision with root package name */
        public final String f14113h;

        /* renamed from: i  reason: collision with root package name */
        public final long f14114i;

        /* renamed from: j  reason: collision with root package name */
        public final long f14115j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f14116k;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(Long l11) {
            if (this.f14110e > l11.longValue()) {
                return 1;
            }
            return this.f14110e < l11.longValue() ? -1 : 0;
        }

        private e(String str, C0252d c0252d, long j11, int i11, long j12, com.google.android.exoplayer2.drm.e eVar, String str2, String str3, long j13, long j14, boolean z11) {
            this.f14106a = str;
            this.f14107b = c0252d;
            this.f14108c = j11;
            this.f14109d = i11;
            this.f14110e = j12;
            this.f14111f = eVar;
            this.f14112g = str2;
            this.f14113h = str3;
            this.f14114i = j13;
            this.f14115j = j14;
            this.f14116k = z11;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f14117a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14118b;

        /* renamed from: c  reason: collision with root package name */
        public final long f14119c;

        /* renamed from: d  reason: collision with root package name */
        public final long f14120d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f14121e;

        public f(long j11, boolean z11, long j12, long j13, boolean z12) {
            this.f14117a = j11;
            this.f14118b = z11;
            this.f14119c = j12;
            this.f14120d = j13;
            this.f14121e = z12;
        }
    }

    public d(int i11, String str, List<String> list, long j11, long j12, boolean z11, int i12, long j13, int i13, long j14, long j15, boolean z12, boolean z13, boolean z14, com.google.android.exoplayer2.drm.e eVar, List<C0252d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z12);
        long j16;
        this.f14083d = i11;
        this.f14085f = j12;
        this.f14086g = z11;
        this.f14087h = i12;
        this.f14088i = j13;
        this.f14089j = i13;
        this.f14090k = j14;
        this.f14091l = j15;
        this.f14092m = z13;
        this.f14093n = z14;
        this.f14094o = eVar;
        this.f14095p = r.o(list2);
        this.f14096q = r.o(list3);
        this.f14097r = t.c(map);
        if (!list3.isEmpty()) {
            b bVar = (b) w.b(list3);
            this.f14098s = bVar.f14110e + bVar.f14108c;
        } else if (!list2.isEmpty()) {
            C0252d c0252d = (C0252d) w.b(list2);
            this.f14098s = c0252d.f14110e + c0252d.f14108c;
        } else {
            this.f14098s = 0L;
        }
        if (j11 == -9223372036854775807L) {
            j16 = -9223372036854775807L;
        } else {
            j16 = j11 >= 0 ? j11 : this.f14098s + j11;
        }
        this.f14084e = j16;
        this.f14099t = fVar;
    }

    @Override // ej.a
    /* renamed from: b */
    public d a(List<ej.c> list) {
        return this;
    }

    public d c(long j11, int i11) {
        return new d(this.f14083d, this.f37205a, this.f37206b, this.f14084e, j11, true, i11, this.f14088i, this.f14089j, this.f14090k, this.f14091l, this.f37207c, this.f14092m, this.f14093n, this.f14094o, this.f14095p, this.f14096q, this.f14099t, this.f14097r);
    }

    public d d() {
        return this.f14092m ? this : new d(this.f14083d, this.f37205a, this.f37206b, this.f14084e, this.f14085f, this.f14086g, this.f14087h, this.f14088i, this.f14089j, this.f14090k, this.f14091l, this.f37207c, true, this.f14093n, this.f14094o, this.f14095p, this.f14096q, this.f14099t, this.f14097r);
    }

    public long e() {
        return this.f14085f + this.f14098s;
    }

    public boolean f(d dVar) {
        if (dVar != null) {
            long j11 = this.f14088i;
            long j12 = dVar.f14088i;
            if (j11 > j12) {
                return true;
            }
            if (j11 < j12) {
                return false;
            }
            int size = this.f14095p.size() - dVar.f14095p.size();
            if (size != 0) {
                return size > 0;
            }
            int size2 = this.f14096q.size();
            int size3 = dVar.f14096q.size();
            if (size2 <= size3) {
                return size2 == size3 && this.f14092m && !dVar.f14092m;
            }
            return true;
        }
        return true;
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0252d extends e {

        /* renamed from: l  reason: collision with root package name */
        public final String f14104l;

        /* renamed from: m  reason: collision with root package name */
        public final List<b> f14105m;

        public C0252d(String str, long j11, long j12, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j11, j12, false, r.r());
        }

        public C0252d b(long j11, int i11) {
            ArrayList arrayList = new ArrayList();
            long j12 = j11;
            for (int i12 = 0; i12 < this.f14105m.size(); i12++) {
                b bVar = this.f14105m.get(i12);
                arrayList.add(bVar.b(j12, i11));
                j12 += bVar.f14108c;
            }
            return new C0252d(this.f14106a, this.f14107b, this.f14104l, this.f14108c, i11, j11, this.f14111f, this.f14112g, this.f14113h, this.f14114i, this.f14115j, this.f14116k, arrayList);
        }

        public C0252d(String str, C0252d c0252d, String str2, long j11, int i11, long j12, com.google.android.exoplayer2.drm.e eVar, String str3, String str4, long j13, long j14, boolean z11, List<b> list) {
            super(str, c0252d, j11, i11, j12, eVar, str3, str4, j13, j14, z11);
            this.f14104l = str2;
            this.f14105m = r.o(list);
        }
    }
}