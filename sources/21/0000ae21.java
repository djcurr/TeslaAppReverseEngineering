package qi;

import ak.k0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
final class r {

    /* renamed from: a  reason: collision with root package name */
    public final o f48326a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48327b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f48328c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f48329d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48330e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f48331f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f48332g;

    /* renamed from: h  reason: collision with root package name */
    public final long f48333h;

    public r(o oVar, long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11) {
        ak.a.a(iArr.length == jArr2.length);
        ak.a.a(jArr.length == jArr2.length);
        ak.a.a(iArr2.length == jArr2.length);
        this.f48326a = oVar;
        this.f48328c = jArr;
        this.f48329d = iArr;
        this.f48330e = i11;
        this.f48331f = jArr2;
        this.f48332g = iArr2;
        this.f48333h = j11;
        this.f48327b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | PKIFailureInfo.duplicateCertReq;
        }
    }

    public int a(long j11) {
        for (int i11 = k0.i(this.f48331f, j11, true, false); i11 >= 0; i11--) {
            if ((this.f48332g[i11] & 1) != 0) {
                return i11;
            }
        }
        return -1;
    }

    public int b(long j11) {
        for (int e11 = k0.e(this.f48331f, j11, true, false); e11 < this.f48331f.length; e11++) {
            if ((this.f48332g[e11] & 1) != 0) {
                return e11;
            }
        }
        return -1;
    }
}