package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f14632a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14633b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14634c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f14635d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f14636e;

    /* renamed from: f  reason: collision with root package name */
    public final long f14637f;

    /* renamed from: g  reason: collision with root package name */
    public final long f14638g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14639h;

    /* renamed from: i  reason: collision with root package name */
    public final int f14640i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f14641j;

    /* renamed from: com.google.android.exoplayer2.upstream.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0259b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f14642a;

        /* renamed from: b  reason: collision with root package name */
        private long f14643b;

        /* renamed from: c  reason: collision with root package name */
        private int f14644c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f14645d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f14646e;

        /* renamed from: f  reason: collision with root package name */
        private long f14647f;

        /* renamed from: g  reason: collision with root package name */
        private long f14648g;

        /* renamed from: h  reason: collision with root package name */
        private String f14649h;

        /* renamed from: i  reason: collision with root package name */
        private int f14650i;

        /* renamed from: j  reason: collision with root package name */
        private Object f14651j;

        public b a() {
            ak.a.i(this.f14642a, "The uri must be set.");
            return new b(this.f14642a, this.f14643b, this.f14644c, this.f14645d, this.f14646e, this.f14647f, this.f14648g, this.f14649h, this.f14650i, this.f14651j);
        }

        public C0259b b(int i11) {
            this.f14650i = i11;
            return this;
        }

        public C0259b c(byte[] bArr) {
            this.f14645d = bArr;
            return this;
        }

        public C0259b d(int i11) {
            this.f14644c = i11;
            return this;
        }

        public C0259b e(Map<String, String> map) {
            this.f14646e = map;
            return this;
        }

        public C0259b f(String str) {
            this.f14649h = str;
            return this;
        }

        public C0259b g(long j11) {
            this.f14648g = j11;
            return this;
        }

        public C0259b h(long j11) {
            this.f14647f = j11;
            return this;
        }

        public C0259b i(Uri uri) {
            this.f14642a = uri;
            return this;
        }

        public C0259b j(String str) {
            this.f14642a = Uri.parse(str);
            return this;
        }

        public C0259b() {
            this.f14644c = 1;
            this.f14646e = Collections.emptyMap();
            this.f14648g = -1L;
        }

        private C0259b(b bVar) {
            this.f14642a = bVar.f14632a;
            this.f14643b = bVar.f14633b;
            this.f14644c = bVar.f14634c;
            this.f14645d = bVar.f14635d;
            this.f14646e = bVar.f14636e;
            this.f14647f = bVar.f14637f;
            this.f14648g = bVar.f14638g;
            this.f14649h = bVar.f14639h;
            this.f14650i = bVar.f14640i;
            this.f14651j = bVar.f14641j;
        }
    }

    public static String c(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public C0259b a() {
        return new C0259b();
    }

    public final String b() {
        return c(this.f14634c);
    }

    public boolean d(int i11) {
        return (this.f14640i & i11) == i11;
    }

    public b e(long j11) {
        long j12 = this.f14638g;
        return f(j11, j12 != -1 ? j12 - j11 : -1L);
    }

    public b f(long j11, long j12) {
        return (j11 == 0 && this.f14638g == j12) ? this : new b(this.f14632a, this.f14633b, this.f14634c, this.f14635d, this.f14636e, this.f14637f + j11, j12, this.f14639h, this.f14640i, this.f14641j);
    }

    public String toString() {
        String b11 = b();
        String valueOf = String.valueOf(this.f14632a);
        long j11 = this.f14637f;
        long j12 = this.f14638g;
        String str = this.f14639h;
        int i11 = this.f14640i;
        StringBuilder sb2 = new StringBuilder(String.valueOf(b11).length() + 70 + valueOf.length() + String.valueOf(str).length());
        sb2.append("DataSpec[");
        sb2.append(b11);
        sb2.append(" ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", ");
        sb2.append(j12);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    public b(Uri uri) {
        this(uri, 0L, -1L);
    }

    public b(Uri uri, long j11, long j12) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j11, j12, null, 0, null);
    }

    private b(Uri uri, long j11, int i11, byte[] bArr, Map<String, String> map, long j12, long j13, String str, int i12, Object obj) {
        byte[] bArr2 = bArr;
        boolean z11 = true;
        ak.a.a(j11 + j12 >= 0);
        ak.a.a(j12 >= 0);
        if (j13 <= 0 && j13 != -1) {
            z11 = false;
        }
        ak.a.a(z11);
        this.f14632a = uri;
        this.f14633b = j11;
        this.f14634c = i11;
        this.f14635d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f14636e = Collections.unmodifiableMap(new HashMap(map));
        this.f14637f = j12;
        this.f14638g = j13;
        this.f14639h = str;
        this.f14640i = i12;
        this.f14641j = obj;
    }
}