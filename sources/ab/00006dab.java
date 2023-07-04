package f70;

import java.util.Objects;

/* loaded from: classes5.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private final w f25973a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25974b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25975c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25976d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25977e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25978f;

    /* renamed from: g  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f25979g;

    /* JADX INFO: Access modifiers changed from: protected */
    public m(org.bouncycastle.asn1.k kVar) {
        Objects.requireNonNull(kVar, "treeDigest == null");
        this.f25979g = kVar;
        org.bouncycastle.crypto.p a11 = f.a(kVar);
        int h11 = a0.h(a11);
        this.f25974b = h11;
        this.f25975c = 16;
        int ceil = (int) Math.ceil((h11 * 8) / a0.o(16));
        this.f25977e = ceil;
        int floor = ((int) Math.floor(a0.o((16 - 1) * ceil) / a0.o(16))) + 1;
        this.f25978f = floor;
        int i11 = ceil + floor;
        this.f25976d = i11;
        l c11 = l.c(a11.getAlgorithmName(), h11, 16, i11);
        this.f25973a = c11;
        if (c11 != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + a11.getAlgorithmName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        return this.f25976d;
    }

    public org.bouncycastle.asn1.k b() {
        return this.f25979g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c() {
        return this.f25974b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d() {
        return this.f25975c;
    }
}