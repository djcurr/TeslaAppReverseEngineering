package vu;

import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f54626a;

    /* renamed from: b  reason: collision with root package name */
    private int f54627b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54628c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54629d;

    /* renamed from: e  reason: collision with root package name */
    private final int f54630e;

    /* renamed from: f  reason: collision with root package name */
    private final yt.b f54631f;

    /* renamed from: g  reason: collision with root package name */
    private String f54632g;

    public c(String publicKeyHex, int i11, int i12, String epochHex, int i13, yt.b domain, String str) {
        s.g(publicKeyHex, "publicKeyHex");
        s.g(epochHex, "epochHex");
        s.g(domain, "domain");
        this.f54626a = publicKeyHex;
        this.f54627b = i11;
        this.f54628c = i12;
        this.f54629d = epochHex;
        this.f54630e = i13;
        this.f54631f = domain;
        this.f54632g = str;
    }

    public static /* synthetic */ c b(c cVar, String str, int i11, int i12, String str2, int i13, yt.b bVar, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = cVar.f54626a;
        }
        if ((i14 & 2) != 0) {
            i11 = cVar.f54627b;
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            i12 = cVar.f54628c;
        }
        int i16 = i12;
        if ((i14 & 8) != 0) {
            str2 = cVar.f54629d;
        }
        String str4 = str2;
        if ((i14 & 16) != 0) {
            i13 = cVar.f54630e;
        }
        int i17 = i13;
        if ((i14 & 32) != 0) {
            bVar = cVar.f54631f;
        }
        yt.b bVar2 = bVar;
        if ((i14 & 64) != 0) {
            str3 = cVar.f54632g;
        }
        return cVar.a(str, i15, i16, str4, i17, bVar2, str3);
    }

    public final c a(String publicKeyHex, int i11, int i12, String epochHex, int i13, yt.b domain, String str) {
        s.g(publicKeyHex, "publicKeyHex");
        s.g(epochHex, "epochHex");
        s.g(domain, "domain");
        return new c(publicKeyHex, i11, i12, epochHex, i13, domain, str);
    }

    public final int c() {
        return this.f54628c;
    }

    public final int d() {
        return this.f54627b;
    }

    public final yt.b e() {
        return this.f54631f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(this.f54626a, cVar.f54626a) && this.f54627b == cVar.f54627b && this.f54628c == cVar.f54628c && s.c(this.f54629d, cVar.f54629d) && this.f54630e == cVar.f54630e && this.f54631f == cVar.f54631f && s.c(this.f54632g, cVar.f54632g);
        }
        return false;
    }

    public final String f() {
        return this.f54629d;
    }

    public final int g() {
        return this.f54630e;
    }

    public final String h() {
        return this.f54626a;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f54626a.hashCode() * 31) + Integer.hashCode(this.f54627b)) * 31) + Integer.hashCode(this.f54628c)) * 31) + this.f54629d.hashCode()) * 31) + Integer.hashCode(this.f54630e)) * 31) + this.f54631f.hashCode()) * 31;
        String str = this.f54632g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f54632g;
    }

    public final int j() {
        return ((int) (System.currentTimeMillis() / 1000)) - this.f54630e;
    }

    public final void k() {
        this.f54627b++;
    }

    public final void l(String str) {
        this.f54632g = str;
    }

    public String toString() {
        String str = this.f54626a;
        int i11 = this.f54627b;
        int i12 = this.f54628c;
        String str2 = this.f54629d;
        int i13 = this.f54630e;
        yt.b bVar = this.f54631f;
        String str3 = this.f54632g;
        return "VehicleSessionInfo(publicKeyHex=" + str + ", counter=" + i11 + ", clockTime=" + i12 + ", epochHex=" + str2 + ", epochStartSeconds=" + i13 + ", domain=" + bVar + ", requestId=" + str3 + ")";
    }
}