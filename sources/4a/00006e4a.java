package fj;

import android.net.Uri;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.z0;

/* loaded from: classes3.dex */
public final class t extends z0 {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f26337n = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final long f26338b;

    /* renamed from: c  reason: collision with root package name */
    private final long f26339c;

    /* renamed from: d  reason: collision with root package name */
    private final long f26340d;

    /* renamed from: e  reason: collision with root package name */
    private final long f26341e;

    /* renamed from: f  reason: collision with root package name */
    private final long f26342f;

    /* renamed from: g  reason: collision with root package name */
    private final long f26343g;

    /* renamed from: h  reason: collision with root package name */
    private final long f26344h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f26345i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f26346j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f26347k;

    /* renamed from: l  reason: collision with root package name */
    private final i0 f26348l;

    /* renamed from: m  reason: collision with root package name */
    private final i0.f f26349m;

    static {
        new i0.c().d("SinglePeriodTimeline").i(Uri.EMPTY).a();
    }

    public t(long j11, boolean z11, boolean z12, boolean z13, Object obj, i0 i0Var) {
        this(j11, j11, 0L, 0L, z11, z12, z13, obj, i0Var);
    }

    @Override // com.google.android.exoplayer2.z0
    public int b(Object obj) {
        return f26337n.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.z0
    public z0.b g(int i11, z0.b bVar, boolean z11) {
        ak.a.c(i11, 0, 1);
        return bVar.n(null, z11 ? f26337n : null, 0, this.f26341e, -this.f26343g);
    }

    @Override // com.google.android.exoplayer2.z0
    public int i() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.z0
    public Object m(int i11) {
        ak.a.c(i11, 0, 1);
        return f26337n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 > r5) goto L7;
     */
    @Override // com.google.android.exoplayer2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.z0.c o(int r25, com.google.android.exoplayer2.z0.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            ak.a.c(r3, r1, r2)
            long r1 = r0.f26344h
            boolean r14 = r0.f26346j
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2a
            r5 = 0
            int r5 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r5 == 0) goto L2a
            long r5 = r0.f26342f
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L23
        L20:
            r16 = r3
            goto L2c
        L23:
            long r1 = r1 + r27
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2a
            goto L20
        L2a:
            r16 = r1
        L2c:
            java.lang.Object r4 = com.google.android.exoplayer2.z0.c.f14785r
            com.google.android.exoplayer2.i0 r5 = r0.f26348l
            java.lang.Object r6 = r0.f26347k
            long r7 = r0.f26338b
            long r9 = r0.f26339c
            long r11 = r0.f26340d
            boolean r13 = r0.f26345i
            com.google.android.exoplayer2.i0$f r15 = r0.f26349m
            long r1 = r0.f26342f
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f26343g
            r22 = r1
            r3 = r26
            com.google.android.exoplayer2.z0$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.t.o(int, com.google.android.exoplayer2.z0$c, long):com.google.android.exoplayer2.z0$c");
    }

    @Override // com.google.android.exoplayer2.z0
    public int p() {
        return 1;
    }

    public t(long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, Object obj, i0 i0Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j11, j12, j13, j14, z11, z12, obj, i0Var, z13 ? i0Var.f13503c : null);
    }

    public t(long j11, long j12, long j13, long j14, long j15, long j16, long j17, boolean z11, boolean z12, Object obj, i0 i0Var, i0.f fVar) {
        this.f26338b = j11;
        this.f26339c = j12;
        this.f26340d = j13;
        this.f26341e = j14;
        this.f26342f = j15;
        this.f26343g = j16;
        this.f26344h = j17;
        this.f26345i = z11;
        this.f26346j = z12;
        this.f26347k = obj;
        this.f26348l = (i0) ak.a.e(i0Var);
        this.f26349m = fVar;
    }
}