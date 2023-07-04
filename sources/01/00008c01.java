package net.time4j;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class l0 implements net.time4j.engine.s<net.time4j.engine.q<?>, BigDecimal> {

    /* renamed from: a  reason: collision with root package name */
    private final net.time4j.engine.p<? extends Number> f41477a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f41478b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(net.time4j.engine.p<? extends Number> pVar, boolean z11) {
        this.f41477a = pVar;
        this.f41478b = z11;
    }

    @Override // net.time4j.engine.s
    /* renamed from: a */
    public BigDecimal apply(net.time4j.engine.q<?> qVar) {
        long longValue = ((Number) qVar.l(this.f41477a)).longValue();
        long longValue2 = ((Number) qVar.f(this.f41477a)).longValue();
        long longValue3 = ((Number) qVar.e(this.f41477a)).longValue();
        if (longValue > longValue3) {
            longValue = longValue3;
        }
        if (longValue == longValue2) {
            return BigDecimal.ZERO;
        }
        if (this.f41478b && (qVar instanceof h0) && !((h0) h0.class.cast(qVar)).x0(this.f41477a)) {
            if (longValue == longValue3) {
                return BigDecimal.ONE;
            }
            longValue3--;
        }
        return new BigDecimal(longValue - longValue2).setScale(15).divide(new BigDecimal((longValue3 - longValue2) + 1), RoundingMode.HALF_UP).stripTrailingZeros();
    }
}