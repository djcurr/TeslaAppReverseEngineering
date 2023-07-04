package qi;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f48291a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48292b;

    /* renamed from: c  reason: collision with root package name */
    public final long f48293c;

    /* renamed from: d  reason: collision with root package name */
    public final long f48294d;

    /* renamed from: e  reason: collision with root package name */
    public final long f48295e;

    /* renamed from: f  reason: collision with root package name */
    public final ci.i f48296f;

    /* renamed from: g  reason: collision with root package name */
    public final int f48297g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f48298h;

    /* renamed from: i  reason: collision with root package name */
    public final long[] f48299i;

    /* renamed from: j  reason: collision with root package name */
    public final int f48300j;

    /* renamed from: k  reason: collision with root package name */
    private final p[] f48301k;

    public o(int i11, int i12, long j11, long j12, long j13, ci.i iVar, int i13, p[] pVarArr, int i14, long[] jArr, long[] jArr2) {
        this.f48291a = i11;
        this.f48292b = i12;
        this.f48293c = j11;
        this.f48294d = j12;
        this.f48295e = j13;
        this.f48296f = iVar;
        this.f48297g = i13;
        this.f48301k = pVarArr;
        this.f48300j = i14;
        this.f48298h = jArr;
        this.f48299i = jArr2;
    }

    public p a(int i11) {
        p[] pVarArr = this.f48301k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i11];
    }
}