package n10;

import k20.k1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: k  reason: collision with root package name */
    public static final y f40231k;

    /* renamed from: l  reason: collision with root package name */
    public static final y f40232l;

    /* renamed from: m  reason: collision with root package name */
    public static final y f40233m;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f40234a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f40235b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f40236c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f40237d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f40238e;

    /* renamed from: f  reason: collision with root package name */
    private final y f40239f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f40240g;

    /* renamed from: h  reason: collision with root package name */
    private final y f40241h;

    /* renamed from: i  reason: collision with root package name */
    private final y f40242i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f40243j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40244a;

        static {
            int[] iArr = new int[k1.values().length];
            iArr[k1.IN_VARIANCE.ordinal()] = 1;
            iArr[k1.INVARIANT.ordinal()] = 2;
            f40244a = iArr;
        }
    }

    static {
        new a(null);
        y yVar = new y(false, false, false, false, false, null, false, null, null, false, 1023, null);
        f40231k = yVar;
        y yVar2 = new y(false, false, false, false, false, null, false, null, null, true, 511, null);
        f40232l = yVar2;
        new y(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f40233m = new y(false, false, false, false, false, yVar, false, null, null, false, 988, null);
        new y(false, false, false, false, false, yVar2, false, null, null, true, 476, null);
        new y(false, true, false, false, false, yVar, false, null, null, false, 988, null);
        new y(false, false, false, true, false, yVar, false, null, null, false, 983, null);
        new y(false, false, false, true, false, yVar, false, null, null, false, 919, null);
        new y(false, false, true, false, false, yVar, false, null, null, false, 984, null);
    }

    public y(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, y yVar, boolean z16, y yVar2, y yVar3, boolean z17) {
        this.f40234a = z11;
        this.f40235b = z12;
        this.f40236c = z13;
        this.f40237d = z14;
        this.f40238e = z15;
        this.f40239f = yVar;
        this.f40240g = z16;
        this.f40241h = yVar2;
        this.f40242i = yVar3;
        this.f40243j = z17;
    }

    public final boolean a() {
        return this.f40240g;
    }

    public final boolean b() {
        return this.f40243j;
    }

    public final boolean c() {
        return this.f40235b;
    }

    public final boolean d() {
        return this.f40234a;
    }

    public final boolean e() {
        return this.f40236c;
    }

    public final y f(k1 effectiveVariance, boolean z11) {
        kotlin.jvm.internal.s.g(effectiveVariance, "effectiveVariance");
        if (!z11 || !this.f40236c) {
            int i11 = b.f40244a[effectiveVariance.ordinal()];
            if (i11 == 1) {
                y yVar = this.f40241h;
                if (yVar != null) {
                    return yVar;
                }
            } else if (i11 != 2) {
                y yVar2 = this.f40239f;
                if (yVar2 != null) {
                    return yVar2;
                }
            } else {
                y yVar3 = this.f40242i;
                if (yVar3 != null) {
                    return yVar3;
                }
            }
        }
        return this;
    }

    public final y g() {
        return new y(this.f40234a, true, this.f40236c, this.f40237d, this.f40238e, this.f40239f, this.f40240g, this.f40241h, this.f40242i, false, 512, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ y(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, n10.y r17, boolean r18, n10.y r19, n10.y r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r12
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r13
        L11:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L18
            r4 = r5
            goto L19
        L18:
            r4 = r14
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L1f
            r6 = r5
            goto L20
        L1f:
            r6 = r15
        L20:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            r7 = r5
            goto L28
        L26:
            r7 = r16
        L28:
            r8 = r0 & 32
            if (r8 == 0) goto L2e
            r8 = 0
            goto L30
        L2e:
            r8 = r17
        L30:
            r9 = r0 & 64
            if (r9 == 0) goto L35
            goto L37
        L35:
            r2 = r18
        L37:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L3d
            r9 = r8
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L45
            r10 = r8
            goto L47
        L45:
            r10 = r20
        L47:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r5 = r21
        L4e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n10.y.<init>(boolean, boolean, boolean, boolean, boolean, n10.y, boolean, n10.y, n10.y, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}