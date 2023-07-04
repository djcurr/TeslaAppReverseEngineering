package u1;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final double f52969a;

    /* renamed from: b  reason: collision with root package name */
    private final double f52970b;

    /* renamed from: c  reason: collision with root package name */
    private final double f52971c;

    /* renamed from: d  reason: collision with root package name */
    private final double f52972d;

    /* renamed from: e  reason: collision with root package name */
    private final double f52973e;

    /* renamed from: f  reason: collision with root package name */
    private final double f52974f;

    /* renamed from: g  reason: collision with root package name */
    private final double f52975g;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.l.<init>(double, double, double, double, double, double, double):void");
    }

    public final double a() {
        return this.f52970b;
    }

    public final double b() {
        return this.f52971c;
    }

    public final double c() {
        return this.f52972d;
    }

    public final double d() {
        return this.f52973e;
    }

    public final double e() {
        return this.f52974f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return s.c(Double.valueOf(this.f52969a), Double.valueOf(lVar.f52969a)) && s.c(Double.valueOf(this.f52970b), Double.valueOf(lVar.f52970b)) && s.c(Double.valueOf(this.f52971c), Double.valueOf(lVar.f52971c)) && s.c(Double.valueOf(this.f52972d), Double.valueOf(lVar.f52972d)) && s.c(Double.valueOf(this.f52973e), Double.valueOf(lVar.f52973e)) && s.c(Double.valueOf(this.f52974f), Double.valueOf(lVar.f52974f)) && s.c(Double.valueOf(this.f52975g), Double.valueOf(lVar.f52975g));
        }
        return false;
    }

    public final double f() {
        return this.f52975g;
    }

    public final double g() {
        return this.f52969a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f52969a) * 31) + Double.hashCode(this.f52970b)) * 31) + Double.hashCode(this.f52971c)) * 31) + Double.hashCode(this.f52972d)) * 31) + Double.hashCode(this.f52973e)) * 31) + Double.hashCode(this.f52974f)) * 31) + Double.hashCode(this.f52975g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f52969a + ", a=" + this.f52970b + ", b=" + this.f52971c + ", c=" + this.f52972d + ", d=" + this.f52973e + ", e=" + this.f52974f + ", f=" + this.f52975g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ l(double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d11, d12, d13, d14, d15, (i11 & 32) != 0 ? 0.0d : d16, (i11 & 64) != 0 ? 0.0d : d17);
    }
}