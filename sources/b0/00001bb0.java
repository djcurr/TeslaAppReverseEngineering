package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.j0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f13501a;

    /* renamed from: b  reason: collision with root package name */
    public final g f13502b;

    /* renamed from: c  reason: collision with root package name */
    public final f f13503c;

    /* renamed from: d  reason: collision with root package name */
    public final j0 f13504d;

    /* renamed from: e  reason: collision with root package name */
    public final d f13505e;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13506a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f13507b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f13506a.equals(bVar.f13506a) && ak.k0.c(this.f13507b, bVar.f13507b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f13506a.hashCode() * 31;
            Object obj = this.f13507b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        private b(Uri uri, Object obj) {
            this.f13506a = uri;
            this.f13507b = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private float A;
        private float B;

        /* renamed from: a  reason: collision with root package name */
        private String f13508a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f13509b;

        /* renamed from: c  reason: collision with root package name */
        private String f13510c;

        /* renamed from: d  reason: collision with root package name */
        private long f13511d;

        /* renamed from: e  reason: collision with root package name */
        private long f13512e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f13513f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f13514g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f13515h;

        /* renamed from: i  reason: collision with root package name */
        private Uri f13516i;

        /* renamed from: j  reason: collision with root package name */
        private Map<String, String> f13517j;

        /* renamed from: k  reason: collision with root package name */
        private UUID f13518k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f13519l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f13520m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f13521n;

        /* renamed from: o  reason: collision with root package name */
        private List<Integer> f13522o;

        /* renamed from: p  reason: collision with root package name */
        private byte[] f13523p;

        /* renamed from: q  reason: collision with root package name */
        private List<ej.c> f13524q;

        /* renamed from: r  reason: collision with root package name */
        private String f13525r;

        /* renamed from: s  reason: collision with root package name */
        private List<h> f13526s;

        /* renamed from: t  reason: collision with root package name */
        private Uri f13527t;

        /* renamed from: u  reason: collision with root package name */
        private Object f13528u;

        /* renamed from: v  reason: collision with root package name */
        private Object f13529v;

        /* renamed from: w  reason: collision with root package name */
        private j0 f13530w;

        /* renamed from: x  reason: collision with root package name */
        private long f13531x;

        /* renamed from: y  reason: collision with root package name */
        private long f13532y;

        /* renamed from: z  reason: collision with root package name */
        private long f13533z;

        public i0 a() {
            g gVar;
            ak.a.f(this.f13516i == null || this.f13518k != null);
            Uri uri = this.f13509b;
            if (uri != null) {
                String str = this.f13510c;
                UUID uuid = this.f13518k;
                e eVar = uuid != null ? new e(uuid, this.f13516i, this.f13517j, this.f13519l, this.f13521n, this.f13520m, this.f13522o, this.f13523p) : null;
                Uri uri2 = this.f13527t;
                g gVar2 = new g(uri, str, eVar, uri2 != null ? new b(uri2, this.f13528u) : null, this.f13524q, this.f13525r, this.f13526s, this.f13529v);
                String str2 = this.f13508a;
                if (str2 == null) {
                    str2 = uri.toString();
                }
                this.f13508a = str2;
                gVar = gVar2;
            } else {
                gVar = null;
            }
            String str3 = (String) ak.a.e(this.f13508a);
            d dVar = new d(this.f13511d, this.f13512e, this.f13513f, this.f13514g, this.f13515h);
            f fVar = new f(this.f13531x, this.f13532y, this.f13533z, this.A, this.B);
            j0 j0Var = this.f13530w;
            if (j0Var == null) {
                j0Var = new j0.b().a();
            }
            return new i0(str3, dVar, gVar, fVar, j0Var);
        }

        public c b(String str) {
            this.f13525r = str;
            return this;
        }

        public c c(long j11) {
            this.f13531x = j11;
            return this;
        }

        public c d(String str) {
            this.f13508a = str;
            return this;
        }

        public c e(String str) {
            this.f13510c = str;
            return this;
        }

        public c f(List<ej.c> list) {
            List<ej.c> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.f13524q = emptyList;
            return this;
        }

        public c g(List<h> list) {
            List<h> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.f13526s = emptyList;
            return this;
        }

        public c h(Object obj) {
            this.f13529v = obj;
            return this;
        }

        public c i(Uri uri) {
            this.f13509b = uri;
            return this;
        }

        public c() {
            this.f13512e = Long.MIN_VALUE;
            this.f13522o = Collections.emptyList();
            this.f13517j = Collections.emptyMap();
            this.f13524q = Collections.emptyList();
            this.f13526s = Collections.emptyList();
            this.f13531x = -9223372036854775807L;
            this.f13532y = -9223372036854775807L;
            this.f13533z = -9223372036854775807L;
            this.A = -3.4028235E38f;
            this.B = -3.4028235E38f;
        }

        private c(i0 i0Var) {
            this();
            d dVar = i0Var.f13505e;
            this.f13512e = dVar.f13535b;
            this.f13513f = dVar.f13536c;
            this.f13514g = dVar.f13537d;
            this.f13511d = dVar.f13534a;
            this.f13515h = dVar.f13538e;
            this.f13508a = i0Var.f13501a;
            this.f13530w = i0Var.f13504d;
            f fVar = i0Var.f13503c;
            this.f13531x = fVar.f13547a;
            this.f13532y = fVar.f13548b;
            this.f13533z = fVar.f13549c;
            this.A = fVar.f13550d;
            this.B = fVar.f13551e;
            g gVar = i0Var.f13502b;
            if (gVar != null) {
                this.f13525r = gVar.f13557f;
                this.f13510c = gVar.f13553b;
                this.f13509b = gVar.f13552a;
                this.f13524q = gVar.f13556e;
                this.f13526s = gVar.f13558g;
                this.f13529v = gVar.f13559h;
                e eVar = gVar.f13554c;
                if (eVar != null) {
                    this.f13516i = eVar.f13540b;
                    this.f13517j = eVar.f13541c;
                    this.f13519l = eVar.f13542d;
                    this.f13521n = eVar.f13544f;
                    this.f13520m = eVar.f13543e;
                    this.f13522o = eVar.f13545g;
                    this.f13518k = eVar.f13539a;
                    this.f13523p = eVar.a();
                }
                b bVar = gVar.f13555d;
                if (bVar != null) {
                    this.f13527t = bVar.f13506a;
                    this.f13528u = bVar.f13507b;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f13534a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13535b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13536c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f13537d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13538e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f13534a == dVar.f13534a && this.f13535b == dVar.f13535b && this.f13536c == dVar.f13536c && this.f13537d == dVar.f13537d && this.f13538e == dVar.f13538e;
            }
            return false;
        }

        public int hashCode() {
            long j11 = this.f13534a;
            long j12 = this.f13535b;
            return (((((((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + (this.f13536c ? 1 : 0)) * 31) + (this.f13537d ? 1 : 0)) * 31) + (this.f13538e ? 1 : 0);
        }

        private d(long j11, long j12, boolean z11, boolean z12, boolean z13) {
            this.f13534a = j11;
            this.f13535b = j12;
            this.f13536c = z11;
            this.f13537d = z12;
            this.f13538e = z13;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f13539a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f13540b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, String> f13541c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f13542d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f13543e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f13544f;

        /* renamed from: g  reason: collision with root package name */
        public final List<Integer> f13545g;

        /* renamed from: h  reason: collision with root package name */
        private final byte[] f13546h;

        public byte[] a() {
            byte[] bArr = this.f13546h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.f13539a.equals(eVar.f13539a) && ak.k0.c(this.f13540b, eVar.f13540b) && ak.k0.c(this.f13541c, eVar.f13541c) && this.f13542d == eVar.f13542d && this.f13544f == eVar.f13544f && this.f13543e == eVar.f13543e && this.f13545g.equals(eVar.f13545g) && Arrays.equals(this.f13546h, eVar.f13546h);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f13539a.hashCode() * 31;
            Uri uri = this.f13540b;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f13541c.hashCode()) * 31) + (this.f13542d ? 1 : 0)) * 31) + (this.f13544f ? 1 : 0)) * 31) + (this.f13543e ? 1 : 0)) * 31) + this.f13545g.hashCode()) * 31) + Arrays.hashCode(this.f13546h);
        }

        private e(UUID uuid, Uri uri, Map<String, String> map, boolean z11, boolean z12, boolean z13, List<Integer> list, byte[] bArr) {
            ak.a.a((z12 && uri == null) ? false : true);
            this.f13539a = uuid;
            this.f13540b = uri;
            this.f13541c = map;
            this.f13542d = z11;
            this.f13544f = z12;
            this.f13543e = z13;
            this.f13545g = list;
            this.f13546h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f13547a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13548b;

        /* renamed from: c  reason: collision with root package name */
        public final long f13549c;

        /* renamed from: d  reason: collision with root package name */
        public final float f13550d;

        /* renamed from: e  reason: collision with root package name */
        public final float f13551e;

        static {
            new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        }

        public f(long j11, long j12, long j13, float f11, float f12) {
            this.f13547a = j11;
            this.f13548b = j12;
            this.f13549c = j13;
            this.f13550d = f11;
            this.f13551e = f12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f13547a == fVar.f13547a && this.f13548b == fVar.f13548b && this.f13549c == fVar.f13549c && this.f13550d == fVar.f13550d && this.f13551e == fVar.f13551e;
            }
            return false;
        }

        public int hashCode() {
            long j11 = this.f13547a;
            long j12 = this.f13548b;
            long j13 = this.f13549c;
            int i11 = ((((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31;
            float f11 = this.f13550d;
            int floatToIntBits = (i11 + (f11 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f13551e;
            return floatToIntBits + (f12 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f12) : 0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13552a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13553b;

        /* renamed from: c  reason: collision with root package name */
        public final e f13554c;

        /* renamed from: d  reason: collision with root package name */
        public final b f13555d;

        /* renamed from: e  reason: collision with root package name */
        public final List<ej.c> f13556e;

        /* renamed from: f  reason: collision with root package name */
        public final String f13557f;

        /* renamed from: g  reason: collision with root package name */
        public final List<h> f13558g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f13559h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f13552a.equals(gVar.f13552a) && ak.k0.c(this.f13553b, gVar.f13553b) && ak.k0.c(this.f13554c, gVar.f13554c) && ak.k0.c(this.f13555d, gVar.f13555d) && this.f13556e.equals(gVar.f13556e) && ak.k0.c(this.f13557f, gVar.f13557f) && this.f13558g.equals(gVar.f13558g) && ak.k0.c(this.f13559h, gVar.f13559h);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f13552a.hashCode() * 31;
            String str = this.f13553b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f13554c;
            int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b bVar = this.f13555d;
            int hashCode4 = (((hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f13556e.hashCode()) * 31;
            String str2 = this.f13557f;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f13558g.hashCode()) * 31;
            Object obj = this.f13559h;
            return hashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        private g(Uri uri, String str, e eVar, b bVar, List<ej.c> list, String str2, List<h> list2, Object obj) {
            this.f13552a = uri;
            this.f13553b = str;
            this.f13554c = eVar;
            this.f13555d = bVar;
            this.f13556e = list;
            this.f13557f = str2;
            this.f13558g = list2;
            this.f13559h = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13560a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13561b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13562c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13563d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13564e;

        /* renamed from: f  reason: collision with root package name */
        public final String f13565f;

        public h(Uri uri, String str, String str2, int i11) {
            this(uri, str, str2, i11, 0, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.f13560a.equals(hVar.f13560a) && this.f13561b.equals(hVar.f13561b) && ak.k0.c(this.f13562c, hVar.f13562c) && this.f13563d == hVar.f13563d && this.f13564e == hVar.f13564e && ak.k0.c(this.f13565f, hVar.f13565f);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.f13560a.hashCode() * 31) + this.f13561b.hashCode()) * 31;
            String str = this.f13562c;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f13563d) * 31) + this.f13564e) * 31;
            String str2 = this.f13565f;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public h(Uri uri, String str, String str2, int i11, int i12, String str3) {
            this.f13560a = uri;
            this.f13561b = str;
            this.f13562c = str2;
            this.f13563d = i11;
            this.f13564e = i12;
            this.f13565f = str3;
        }
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return ak.k0.c(this.f13501a, i0Var.f13501a) && this.f13505e.equals(i0Var.f13505e) && ak.k0.c(this.f13502b, i0Var.f13502b) && ak.k0.c(this.f13503c, i0Var.f13503c) && ak.k0.c(this.f13504d, i0Var.f13504d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f13501a.hashCode() * 31;
        g gVar = this.f13502b;
        return ((((((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f13503c.hashCode()) * 31) + this.f13505e.hashCode()) * 31) + this.f13504d.hashCode();
    }

    private i0(String str, d dVar, g gVar, f fVar, j0 j0Var) {
        this.f13501a = str;
        this.f13502b = gVar;
        this.f13503c = fVar;
        this.f13504d = j0Var;
        this.f13505e = dVar;
    }
}