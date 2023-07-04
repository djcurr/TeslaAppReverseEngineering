package d8;

import b8.j;
import b8.k;
import b8.l;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<c8.c> f23806a;

    /* renamed from: b  reason: collision with root package name */
    private final v7.d f23807b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23808c;

    /* renamed from: d  reason: collision with root package name */
    private final long f23809d;

    /* renamed from: e  reason: collision with root package name */
    private final a f23810e;

    /* renamed from: f  reason: collision with root package name */
    private final long f23811f;

    /* renamed from: g  reason: collision with root package name */
    private final String f23812g;

    /* renamed from: h  reason: collision with root package name */
    private final List<c8.h> f23813h;

    /* renamed from: i  reason: collision with root package name */
    private final l f23814i;

    /* renamed from: j  reason: collision with root package name */
    private final int f23815j;

    /* renamed from: k  reason: collision with root package name */
    private final int f23816k;

    /* renamed from: l  reason: collision with root package name */
    private final int f23817l;

    /* renamed from: m  reason: collision with root package name */
    private final float f23818m;

    /* renamed from: n  reason: collision with root package name */
    private final float f23819n;

    /* renamed from: o  reason: collision with root package name */
    private final int f23820o;

    /* renamed from: p  reason: collision with root package name */
    private final int f23821p;

    /* renamed from: q  reason: collision with root package name */
    private final j f23822q;

    /* renamed from: r  reason: collision with root package name */
    private final k f23823r;

    /* renamed from: s  reason: collision with root package name */
    private final b8.b f23824s;

    /* renamed from: t  reason: collision with root package name */
    private final List<i8.a<Float>> f23825t;

    /* renamed from: u  reason: collision with root package name */
    private final b f23826u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f23827v;

    /* renamed from: w  reason: collision with root package name */
    private final c8.a f23828w;

    /* renamed from: x  reason: collision with root package name */
    private final f8.j f23829x;

    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<c8.c> list, v7.d dVar, String str, long j11, a aVar, long j12, String str2, List<c8.h> list2, l lVar, int i11, int i12, int i13, float f11, float f12, int i14, int i15, j jVar, k kVar, List<i8.a<Float>> list3, b bVar, b8.b bVar2, boolean z11, c8.a aVar2, f8.j jVar2) {
        this.f23806a = list;
        this.f23807b = dVar;
        this.f23808c = str;
        this.f23809d = j11;
        this.f23810e = aVar;
        this.f23811f = j12;
        this.f23812g = str2;
        this.f23813h = list2;
        this.f23814i = lVar;
        this.f23815j = i11;
        this.f23816k = i12;
        this.f23817l = i13;
        this.f23818m = f11;
        this.f23819n = f12;
        this.f23820o = i14;
        this.f23821p = i15;
        this.f23822q = jVar;
        this.f23823r = kVar;
        this.f23825t = list3;
        this.f23826u = bVar;
        this.f23824s = bVar2;
        this.f23827v = z11;
        this.f23828w = aVar2;
        this.f23829x = jVar2;
    }

    public c8.a a() {
        return this.f23828w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v7.d b() {
        return this.f23807b;
    }

    public f8.j c() {
        return this.f23829x;
    }

    public long d() {
        return this.f23809d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<i8.a<Float>> e() {
        return this.f23825t;
    }

    public a f() {
        return this.f23810e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<c8.h> g() {
        return this.f23813h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h() {
        return this.f23826u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        return this.f23808c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long j() {
        return this.f23811f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f23821p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f23820o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String m() {
        return this.f23812g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<c8.c> n() {
        return this.f23806a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f23817l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f23816k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.f23815j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float r() {
        return this.f23819n / this.f23807b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j s() {
        return this.f23822q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k t() {
        return this.f23823r;
    }

    public String toString() {
        return y("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b8.b u() {
        return this.f23824s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float v() {
        return this.f23818m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l w() {
        return this.f23814i;
    }

    public boolean x() {
        return this.f23827v;
    }

    public String y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i());
        sb2.append("\n");
        e t11 = this.f23807b.t(j());
        if (t11 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(t11.i());
            e t12 = this.f23807b.t(t11.j());
            while (t12 != null) {
                sb2.append("->");
                sb2.append(t12.i());
                t12 = this.f23807b.t(t12.j());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!g().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(g().size());
            sb2.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f23806a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (c8.c cVar : this.f23806a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}