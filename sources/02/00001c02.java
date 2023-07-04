package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
final class b implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ji.l f13799a;

    /* renamed from: b  reason: collision with root package name */
    private ji.h f13800b;

    /* renamed from: c  reason: collision with root package name */
    private ji.i f13801c;

    public b(ji.l lVar) {
        this.f13799a = lVar;
    }

    @Override // com.google.android.exoplayer2.source.m
    public void a(long j11, long j12) {
        ((ji.h) ak.a.e(this.f13800b)).a(j11, j12);
    }

    @Override // com.google.android.exoplayer2.source.m
    public void b() {
        ji.h hVar = this.f13800b;
        if (hVar instanceof pi.f) {
            ((pi.f) hVar).j();
        }
    }

    @Override // com.google.android.exoplayer2.source.m
    public long c() {
        ji.i iVar = this.f13801c;
        if (iVar != null) {
            return iVar.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6.getPosition() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.getPosition() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // com.google.android.exoplayer2.source.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(zj.f r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, ji.j r15) {
        /*
            r7 = this;
            ji.e r6 = new ji.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f13801c = r6
            ji.h r8 = r7.f13800b
            if (r8 == 0) goto L10
            return
        L10:
            ji.l r8 = r7.f13799a
            ji.h[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f13800b = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.d(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f13800b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            ak.a.f(r14)
            r6.d()
            goto L70
        L35:
            ji.h r1 = r7.f13800b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            ji.h r9 = r7.f13800b
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            ak.a.f(r13)
            r6.d()
            throw r8
        L57:
            ji.h r1 = r7.f13800b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            ak.a.f(r1)
            r6.d()
            int r0 = r0 + 1
            goto L22
        L70:
            ji.h r10 = r7.f13800b
            if (r10 == 0) goto L7a
        L74:
            ji.h r8 = r7.f13800b
            r8.b(r15)
            return
        L7a:
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            java.lang.String r8 = ak.k0.L(r8)
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            int r11 = r11 + 58
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = ak.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.d(zj.f, android.net.Uri, java.util.Map, long, long, ji.j):void");
    }

    @Override // com.google.android.exoplayer2.source.m
    public int e(ji.u uVar) {
        return ((ji.h) ak.a.e(this.f13800b)).e((ji.i) ak.a.e(this.f13801c), uVar);
    }

    @Override // com.google.android.exoplayer2.source.m
    public void release() {
        ji.h hVar = this.f13800b;
        if (hVar != null) {
            hVar.release();
            this.f13800b = null;
        }
        this.f13801c = null;
    }
}