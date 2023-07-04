package j$.time.format;

import j$.time.temporal.x;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.l f32904a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32905b;

    /* renamed from: c  reason: collision with root package name */
    private final int f32906c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f32907d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(j$.time.temporal.l lVar, int i11, int i12, boolean z11) {
        Objects.requireNonNull(lVar, "field");
        if (!lVar.g().f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + lVar);
        } else if (i11 < 0 || i11 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i11);
        } else if (i12 < 1 || i12 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i12);
        } else if (i12 >= i11) {
            this.f32904a = lVar;
            this.f32905b = i11;
            this.f32906c = i12;
            this.f32907d = z11;
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i12 + " < " + i11);
        }
    }

    @Override // j$.time.format.g
    public boolean c(q qVar, StringBuilder sb2) {
        Long e11 = qVar.e(this.f32904a);
        if (e11 == null) {
            return false;
        }
        s b11 = qVar.b();
        long longValue = e11.longValue();
        x g11 = this.f32904a.g();
        g11.b(longValue, this.f32904a);
        BigDecimal valueOf = BigDecimal.valueOf(g11.e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(g11.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        if (stripTrailingZeros.scale() != 0) {
            String a11 = b11.a(stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.f32905b), this.f32906c), RoundingMode.FLOOR).toPlainString().substring(2));
            if (this.f32907d) {
                sb2.append(b11.b());
            }
            sb2.append(a11);
            return true;
        } else if (this.f32905b > 0) {
            if (this.f32907d) {
                sb2.append(b11.b());
            }
            for (int i11 = 0; i11 < this.f32905b; i11++) {
                sb2.append(b11.e());
            }
            return true;
        } else {
            return true;
        }
    }

    public String toString() {
        String str = this.f32907d ? ",DecimalPoint" : "";
        return "Fraction(" + this.f32904a + "," + this.f32905b + "," + this.f32906c + str + ")";
    }
}