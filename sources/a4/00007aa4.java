package j$.time.format;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class j implements g {

    /* renamed from: f  reason: collision with root package name */
    static final long[] f32908f = {0, 10, 100, 1000, AbstractComponentTracker.LINGERING_TIMEOUT, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* renamed from: a  reason: collision with root package name */
    final j$.time.temporal.l f32909a;

    /* renamed from: b  reason: collision with root package name */
    final int f32910b;

    /* renamed from: c  reason: collision with root package name */
    final int f32911c;

    /* renamed from: d  reason: collision with root package name */
    private final u f32912d;

    /* renamed from: e  reason: collision with root package name */
    final int f32913e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(j$.time.temporal.l lVar, int i11, int i12, u uVar) {
        this.f32909a = lVar;
        this.f32910b = i11;
        this.f32911c = i12;
        this.f32912d = uVar;
        this.f32913e = 0;
    }

    protected j(j$.time.temporal.l lVar, int i11, int i12, u uVar, int i13) {
        this.f32909a = lVar;
        this.f32910b = i11;
        this.f32911c = i12;
        this.f32912d = uVar;
        this.f32913e = i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ u a(j jVar) {
        return jVar.f32912d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j b() {
        return this.f32913e == -1 ? this : new j(this.f32909a, this.f32910b, this.f32911c, this.f32912d, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[LOOP:0: B:34:0x009a->B:36:0x00a3, LOOP_END] */
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(j$.time.format.q r11, java.lang.StringBuilder r12) {
        /*
            r10 = this;
            j$.time.temporal.l r0 = r10.f32909a
            java.lang.Long r0 = r11.e(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            long r2 = r0.longValue()
            j$.time.format.s r11 = r11.b()
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1b
            java.lang.String r0 = "9223372036854775808"
            goto L23
        L1b:
            long r4 = java.lang.Math.abs(r2)
            java.lang.String r0 = java.lang.Long.toString(r4)
        L23:
            int r4 = r0.length()
            int r5 = r10.f32911c
            java.lang.String r6 = " cannot be printed as the value "
            java.lang.String r7 = "Field "
            if (r4 > r5) goto Lb1
            r11.a(r0)
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 2
            r8 = 1
            if (r4 < 0) goto L5c
            int[] r4 = j$.time.format.d.f32894a
            j$.time.format.u r6 = r10.f32912d
            int r6 = r6.ordinal()
            r4 = r4[r6]
            if (r4 == r8) goto L49
            if (r4 == r5) goto L57
            goto L9a
        L49:
            int r4 = r10.f32910b
            r5 = 19
            if (r4 >= r5) goto L9a
            long[] r5 = j$.time.format.j.f32908f
            r4 = r5[r4]
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L9a
        L57:
            char r2 = r11.d()
            goto L97
        L5c:
            int[] r4 = j$.time.format.d.f32894a
            j$.time.format.u r9 = r10.f32912d
            int r9 = r9.ordinal()
            r4 = r4[r9]
            if (r4 == r8) goto L93
            if (r4 == r5) goto L93
            r5 = 3
            if (r4 == r5) goto L93
            r5 = 4
            if (r4 == r5) goto L71
            goto L9a
        L71:
            j$.time.c r11 = new j$.time.c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            j$.time.temporal.l r0 = r10.f32909a
            r12.append(r0)
            r12.append(r6)
            r12.append(r2)
            java.lang.String r0 = " cannot be negative according to the SignStyle"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L93:
            char r2 = r11.c()
        L97:
            r12.append(r2)
        L9a:
            int r2 = r10.f32910b
            int r3 = r0.length()
            int r2 = r2 - r3
            if (r1 >= r2) goto Lad
            char r2 = r11.e()
            r12.append(r2)
            int r1 = r1 + 1
            goto L9a
        Lad:
            r12.append(r0)
            return r8
        Lb1:
            j$.time.c r11 = new j$.time.c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            j$.time.temporal.l r0 = r10.f32909a
            r12.append(r0)
            r12.append(r6)
            r12.append(r2)
            java.lang.String r0 = " exceeds the maximum print width of "
            r12.append(r0)
            int r0 = r10.f32911c
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.c(j$.time.format.q, java.lang.StringBuilder):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j d(int i11) {
        return new j(this.f32909a, this.f32910b, this.f32911c, this.f32912d, this.f32913e + i11);
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        int i11 = this.f32910b;
        if (i11 == 1 && this.f32911c == 19 && this.f32912d == u.NORMAL) {
            sb2 = new StringBuilder();
            sb2.append("Value(");
            obj = this.f32909a;
        } else if (i11 == this.f32911c && this.f32912d == u.NOT_NEGATIVE) {
            sb2 = new StringBuilder();
            sb2.append("Value(");
            sb2.append(this.f32909a);
            sb2.append(",");
            sb2.append(this.f32910b);
            sb2.append(")");
            return sb2.toString();
        } else {
            sb2 = new StringBuilder();
            sb2.append("Value(");
            sb2.append(this.f32909a);
            sb2.append(",");
            sb2.append(this.f32910b);
            sb2.append(",");
            sb2.append(this.f32911c);
            sb2.append(",");
            obj = this.f32912d;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}