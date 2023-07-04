package f70;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: i  reason: collision with root package name */
    private static final Map<Integer, x> f26023i;

    /* renamed from: a  reason: collision with root package name */
    private final w f26024a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26025b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26026c;

    /* renamed from: d  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f26027d;

    /* renamed from: e  reason: collision with root package name */
    private final int f26028e;

    /* renamed from: f  reason: collision with root package name */
    private final String f26029f;

    /* renamed from: g  reason: collision with root package name */
    private final int f26030g;

    /* renamed from: h  reason: collision with root package name */
    private final m f26031h;

    static {
        HashMap hashMap = new HashMap();
        Integer d11 = r70.f.d(1);
        org.bouncycastle.asn1.k kVar = r40.b.f49141c;
        hashMap.put(d11, new x(10, kVar));
        hashMap.put(r70.f.d(2), new x(16, kVar));
        hashMap.put(r70.f.d(3), new x(20, kVar));
        Integer d12 = r70.f.d(4);
        org.bouncycastle.asn1.k kVar2 = r40.b.f49145e;
        hashMap.put(d12, new x(10, kVar2));
        hashMap.put(r70.f.d(5), new x(16, kVar2));
        hashMap.put(r70.f.d(6), new x(20, kVar2));
        Integer d13 = r70.f.d(7);
        org.bouncycastle.asn1.k kVar3 = r40.b.f49157m;
        hashMap.put(d13, new x(10, kVar3));
        hashMap.put(r70.f.d(8), new x(16, kVar3));
        hashMap.put(r70.f.d(9), new x(20, kVar3));
        Integer d14 = r70.f.d(10);
        org.bouncycastle.asn1.k kVar4 = r40.b.f49158n;
        hashMap.put(d14, new x(10, kVar4));
        hashMap.put(r70.f.d(11), new x(16, kVar4));
        hashMap.put(r70.f.d(12), new x(20, kVar4));
        f26023i = Collections.unmodifiableMap(hashMap);
    }

    public x(int i11, org.bouncycastle.asn1.k kVar) {
        if (i11 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        Objects.requireNonNull(kVar, "digest == null");
        this.f26025b = i11;
        this.f26026c = a();
        String b11 = f.b(kVar);
        this.f26029f = b11;
        this.f26027d = kVar;
        m mVar = new m(kVar);
        this.f26031h = mVar;
        int c11 = mVar.c();
        this.f26030g = c11;
        int d11 = mVar.d();
        this.f26028e = d11;
        this.f26024a = e.c(b11, c11, d11, mVar.a(), i11);
    }

    public x(int i11, org.bouncycastle.crypto.p pVar) {
        this(i11, f.c(pVar.getAlgorithmName()));
    }

    private int a() {
        int i11 = 2;
        while (true) {
            int i12 = this.f26025b;
            if (i11 > i12) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i12 - i11) % 2 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public static x k(int i11) {
        return f26023i.get(r70.f.d(i11));
    }

    public int b() {
        return this.f26025b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f26026c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f26031h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w e() {
        return this.f26024a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.f26029f;
    }

    public org.bouncycastle.asn1.k g() {
        return this.f26027d;
    }

    public int h() {
        return this.f26030g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return new k(this.f26031h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f26028e;
    }
}