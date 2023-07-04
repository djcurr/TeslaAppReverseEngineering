package x60;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: f  reason: collision with root package name */
    public static final e f57147f;

    /* renamed from: g  reason: collision with root package name */
    public static final e f57148g;

    /* renamed from: h  reason: collision with root package name */
    public static final e f57149h;

    /* renamed from: i  reason: collision with root package name */
    public static final e f57150i;

    /* renamed from: j  reason: collision with root package name */
    private static final Map<Object, e> f57151j;

    /* renamed from: a  reason: collision with root package name */
    private final int f57152a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57153b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57154c;

    /* renamed from: d  reason: collision with root package name */
    private final int f57155d;

    /* renamed from: e  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f57156e;

    /* loaded from: classes5.dex */
    static class a extends HashMap<Object, e> {
        a() {
            e eVar = e.f57147f;
            put(Integer.valueOf(eVar.f57152a), eVar);
            e eVar2 = e.f57148g;
            put(Integer.valueOf(eVar2.f57152a), eVar2);
            e eVar3 = e.f57149h;
            put(Integer.valueOf(eVar3.f57152a), eVar3);
            e eVar4 = e.f57150i;
            put(Integer.valueOf(eVar4.f57152a), eVar4);
        }
    }

    static {
        org.bouncycastle.asn1.k kVar = r40.b.f49141c;
        f57147f = new e(1, 32, 1, 265, 7, 8516, kVar);
        f57148g = new e(2, 32, 2, 133, 6, 4292, kVar);
        f57149h = new e(3, 32, 4, 67, 4, 2180, kVar);
        f57150i = new e(4, 32, 8, 34, 0, 1124, kVar);
        f57151j = new a();
    }

    protected e(int i11, int i12, int i13, int i14, int i15, int i16, org.bouncycastle.asn1.k kVar) {
        this.f57152a = i11;
        this.f57153b = i12;
        this.f57154c = i13;
        this.f57155d = i14;
        this.f57156e = kVar;
    }

    public static e e(int i11) {
        return f57151j.get(Integer.valueOf(i11));
    }

    public org.bouncycastle.asn1.k b() {
        return this.f57156e;
    }

    public int c() {
        return this.f57153b;
    }

    public int d() {
        return this.f57155d;
    }

    public int f() {
        return this.f57152a;
    }

    public int g() {
        return this.f57154c;
    }
}