package f70;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<Integer, r> f25991e;

    /* renamed from: a  reason: collision with root package name */
    private final w f25992a;

    /* renamed from: b  reason: collision with root package name */
    private final x f25993b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25994c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25995d;

    static {
        HashMap hashMap = new HashMap();
        Integer d11 = r70.f.d(1);
        org.bouncycastle.asn1.k kVar = r40.b.f49141c;
        hashMap.put(d11, new r(20, 2, kVar));
        hashMap.put(r70.f.d(2), new r(20, 4, kVar));
        hashMap.put(r70.f.d(3), new r(40, 2, kVar));
        hashMap.put(r70.f.d(4), new r(40, 4, kVar));
        hashMap.put(r70.f.d(5), new r(40, 8, kVar));
        hashMap.put(r70.f.d(6), new r(60, 3, kVar));
        hashMap.put(r70.f.d(7), new r(60, 6, kVar));
        hashMap.put(r70.f.d(8), new r(60, 12, kVar));
        Integer d12 = r70.f.d(9);
        org.bouncycastle.asn1.k kVar2 = r40.b.f49145e;
        hashMap.put(d12, new r(20, 2, kVar2));
        hashMap.put(r70.f.d(10), new r(20, 4, kVar2));
        hashMap.put(r70.f.d(11), new r(40, 2, kVar2));
        hashMap.put(r70.f.d(12), new r(40, 4, kVar2));
        hashMap.put(r70.f.d(13), new r(40, 8, kVar2));
        hashMap.put(r70.f.d(14), new r(60, 3, kVar2));
        hashMap.put(r70.f.d(15), new r(60, 6, kVar2));
        hashMap.put(r70.f.d(16), new r(60, 12, kVar2));
        Integer d13 = r70.f.d(17);
        org.bouncycastle.asn1.k kVar3 = r40.b.f49157m;
        hashMap.put(d13, new r(20, 2, kVar3));
        hashMap.put(r70.f.d(18), new r(20, 4, kVar3));
        hashMap.put(r70.f.d(19), new r(40, 2, kVar3));
        hashMap.put(r70.f.d(20), new r(40, 4, kVar3));
        hashMap.put(r70.f.d(21), new r(40, 8, kVar3));
        hashMap.put(r70.f.d(22), new r(60, 3, kVar3));
        hashMap.put(r70.f.d(23), new r(60, 6, kVar3));
        hashMap.put(r70.f.d(24), new r(60, 12, kVar3));
        Integer d14 = r70.f.d(25);
        org.bouncycastle.asn1.k kVar4 = r40.b.f49158n;
        hashMap.put(d14, new r(20, 2, kVar4));
        hashMap.put(r70.f.d(26), new r(20, 4, kVar4));
        hashMap.put(r70.f.d(27), new r(40, 2, kVar4));
        hashMap.put(r70.f.d(28), new r(40, 4, kVar4));
        hashMap.put(r70.f.d(29), new r(40, 8, kVar4));
        hashMap.put(r70.f.d(30), new r(60, 3, kVar4));
        hashMap.put(r70.f.d(31), new r(60, 6, kVar4));
        hashMap.put(r70.f.d(32), new r(60, 12, kVar4));
        f25991e = Collections.unmodifiableMap(hashMap);
    }

    public r(int i11, int i12, org.bouncycastle.asn1.k kVar) {
        this.f25994c = i11;
        this.f25995d = i12;
        this.f25993b = new x(j(i11, i12), kVar);
        this.f25992a = d.c(e(), f(), g(), c(), a(), i12);
    }

    public r(int i11, int i12, org.bouncycastle.crypto.p pVar) {
        this(i11, i12, f.c(pVar.getAlgorithmName()));
    }

    public static r i(int i11) {
        return f25991e.get(r70.f.d(i11));
    }

    private static int j(int i11, int i12) {
        if (i11 >= 2) {
            if (i11 % i12 == 0) {
                int i13 = i11 / i12;
                if (i13 != 1) {
                    return i13;
                }
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        throw new IllegalArgumentException("totalHeight must be > 1");
    }

    public int a() {
        return this.f25994c;
    }

    public int b() {
        return this.f25995d;
    }

    protected int c() {
        return this.f25993b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w d() {
        return this.f25992a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return this.f25993b.f();
    }

    public int f() {
        return this.f25993b.h();
    }

    int g() {
        return this.f25993b.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x h() {
        return this.f25993b;
    }
}