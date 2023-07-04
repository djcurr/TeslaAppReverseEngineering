package okio;

/* loaded from: classes5.dex */
public final class w implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final f f42687a;

    /* renamed from: b  reason: collision with root package name */
    private z f42688b;

    /* renamed from: c  reason: collision with root package name */
    private int f42689c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42690d;

    /* renamed from: e  reason: collision with root package name */
    private long f42691e;

    /* renamed from: f  reason: collision with root package name */
    private final h f42692f;

    public w(h upstream) {
        kotlin.jvm.internal.s.g(upstream, "upstream");
        this.f42692f = upstream;
        f b11 = upstream.b();
        this.f42687a = b11;
        z zVar = b11.f42645a;
        this.f42688b = zVar;
        this.f42689c = zVar != null ? zVar.f42702b : -1;
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42690d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f42702b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // okio.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(okio.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.s.g(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f42690d
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            okio.z r5 = r8.f42688b
            if (r5 == 0) goto L2a
            okio.f r6 = r8.f42687a
            okio.z r6 = r6.f42645a
            if (r5 != r6) goto L2b
            int r5 = r8.f42689c
            kotlin.jvm.internal.s.e(r6)
            int r6 = r6.f42702b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            okio.h r0 = r8.f42692f
            long r1 = r8.f42691e
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            okio.z r0 = r8.f42688b
            if (r0 != 0) goto L53
            okio.f r0 = r8.f42687a
            okio.z r0 = r0.f42645a
            if (r0 == 0) goto L53
            r8.f42688b = r0
            kotlin.jvm.internal.s.e(r0)
            int r0 = r0.f42702b
            r8.f42689c = r0
        L53:
            okio.f r0 = r8.f42687a
            long r0 = r0.P0()
            long r2 = r8.f42691e
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.f r2 = r8.f42687a
            long r4 = r8.f42691e
            r3 = r9
            r6 = r10
            r2.m(r3, r4, r6)
            long r0 = r8.f42691e
            long r0 = r0 + r10
            r8.f42691e = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.w.read(okio.f, long):long");
    }

    @Override // okio.e0
    public f0 timeout() {
        return this.f42692f.timeout();
    }
}