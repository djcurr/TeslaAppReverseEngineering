package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;

/* loaded from: classes5.dex */
final class m extends net.time4j.engine.e<BigDecimal> implements c1<BigDecimal> {
    private static final long serialVersionUID = -4837430960549551204L;

    /* renamed from: a  reason: collision with root package name */
    private final transient BigDecimal f41479a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str, BigDecimal bigDecimal) {
        super(str);
        this.f41479a = bigDecimal;
    }

    private Object readResolve() {
        Object E0 = h0.E0(name());
        if (E0 != null) {
            return E0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.engine.p
    public Class<BigDecimal> getType() {
        return BigDecimal.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* renamed from: o */
    public BigDecimal getDefaultMaximum() {
        return this.f41479a;
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public BigDecimal getDefaultMinimum() {
        return BigDecimal.ZERO;
    }
}