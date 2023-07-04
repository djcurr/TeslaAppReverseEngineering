package x60;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class k {

    /* renamed from: e  reason: collision with root package name */
    public static final k f57181e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f57182f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f57183g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f57184h;

    /* renamed from: i  reason: collision with root package name */
    public static final k f57185i;

    /* renamed from: j  reason: collision with root package name */
    private static Map<Object, k> f57186j;

    /* renamed from: a  reason: collision with root package name */
    private final int f57187a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57188b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57189c;

    /* renamed from: d  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f57190d;

    /* loaded from: classes5.dex */
    static class a extends HashMap<Object, k> {
        a() {
            k kVar = k.f57181e;
            put(Integer.valueOf(kVar.f57187a), kVar);
            k kVar2 = k.f57182f;
            put(Integer.valueOf(kVar2.f57187a), kVar2);
            k kVar3 = k.f57183g;
            put(Integer.valueOf(kVar3.f57187a), kVar3);
            k kVar4 = k.f57184h;
            put(Integer.valueOf(kVar4.f57187a), kVar4);
            k kVar5 = k.f57185i;
            put(Integer.valueOf(kVar5.f57187a), kVar5);
        }
    }

    static {
        org.bouncycastle.asn1.k kVar = r40.b.f49141c;
        f57181e = new k(5, 32, 5, kVar);
        f57182f = new k(6, 32, 10, kVar);
        f57183g = new k(7, 32, 15, kVar);
        f57184h = new k(8, 32, 20, kVar);
        f57185i = new k(9, 32, 25, kVar);
        f57186j = new a();
    }

    protected k(int i11, int i12, int i13, org.bouncycastle.asn1.k kVar) {
        this.f57187a = i11;
        this.f57188b = i12;
        this.f57189c = i13;
        this.f57190d = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k e(int i11) {
        return f57186j.get(Integer.valueOf(i11));
    }

    public org.bouncycastle.asn1.k b() {
        return this.f57190d;
    }

    public int c() {
        return this.f57189c;
    }

    public int d() {
        return this.f57188b;
    }

    public int f() {
        return this.f57187a;
    }
}