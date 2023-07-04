package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import net.time4j.f;

/* loaded from: classes5.dex */
final class f0 extends net.time4j.engine.f implements v, Serializable {
    private static final long serialVersionUID = 1988843503875912054L;
    private final int policy;
    private final f unit;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(f fVar, int i11) {
        this.unit = fVar;
        this.policy = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.f
    public <T extends net.time4j.engine.q<T>> net.time4j.engine.k0<T> a(net.time4j.engine.w<T> wVar) {
        if (wVar.v(g0.f41292n)) {
            return new f.j(this.unit, this.policy);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return this.unit == f0Var.unit && this.policy == f0Var.policy;
        }
        return false;
    }

    @Override // net.time4j.engine.v
    public double getLength() {
        return this.unit.getLength();
    }

    @Override // net.time4j.x
    public char getSymbol() {
        return (char) 0;
    }

    public int hashCode() {
        return (this.unit.hashCode() * 23) + (this.policy * 37);
    }

    @Override // net.time4j.engine.v
    public boolean isCalendrical() {
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.unit.getSymbol());
        sb2.append(CoreConstants.DASH_CHAR);
        switch (this.policy) {
            case 1:
                sb2.append("NEXT_VALID_DATE");
                break;
            case 2:
                sb2.append("END_OF_MONTH");
                break;
            case 3:
                sb2.append("CARRY_OVER");
                break;
            case 4:
                sb2.append("UNLESS_INVALID");
                break;
            case 5:
                sb2.append("KEEPING_LAST_DATE");
                break;
            case 6:
                sb2.append("JODA_METRIC");
                break;
            default:
                sb2.append("PREVIOUS_VALID_DATE");
                break;
        }
        return sb2.toString();
    }
}