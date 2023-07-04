package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import net.time4j.format.expert.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class t<T extends t<T>> extends net.time4j.engine.q<T> {
    abstract <E> E B();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void D(net.time4j.engine.p<?> pVar, int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void E(net.time4j.engine.p<?> pVar, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void F(Object obj);

    @Override // net.time4j.engine.q
    /* renamed from: G */
    public T x(net.time4j.engine.p<Integer> pVar, int i11) {
        D(pVar, i11);
        return this;
    }

    @Override // net.time4j.engine.q
    /* renamed from: H */
    public <V> T z(net.time4j.engine.p<V> pVar, V v11) {
        E(pVar, v11);
        return this;
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public final boolean c() {
        return q(b0.TIMEZONE_ID) || q(b0.TIMEZONE_OFFSET);
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public <V> V e(net.time4j.engine.p<V> pVar) {
        return pVar.getDefaultMaximum();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof net.time4j.format.expert.t
            r2 = 0
            if (r1 == 0) goto L57
            net.time4j.format.expert.t r7 = (net.time4j.format.expert.t) r7
            java.util.Set r1 = r6.t()
            java.util.Set r3 = r7.t()
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L1e
            return r2
        L1e:
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r1.next()
            net.time4j.engine.p r4 = (net.time4j.engine.p) r4
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L42
            java.lang.Object r5 = r6.l(r4)
            java.lang.Object r4 = r7.l(r4)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L22
        L42:
            return r2
        L43:
            java.lang.Object r1 = r6.B()
            java.lang.Object r7 = r7.B()
            if (r1 != 0) goto L52
            if (r7 != 0) goto L50
            goto L51
        L50:
            r0 = r2
        L51:
            return r0
        L52:
            boolean r7 = r1.equals(r7)
            return r7
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.t.equals(java.lang.Object):boolean");
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public <V> V f(net.time4j.engine.p<V> pVar) {
        return pVar.getDefaultMinimum();
    }

    public final int hashCode() {
        int hashCode = t().hashCode();
        Object B = B();
        return B != null ? hashCode + (B.hashCode() * 31) : hashCode;
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public final net.time4j.tz.k o() {
        Object l11;
        b0 b0Var = b0.TIMEZONE_ID;
        if (q(b0Var)) {
            l11 = l(b0Var);
        } else {
            b0 b0Var2 = b0.TIMEZONE_OFFSET;
            l11 = q(b0Var2) ? l(b0Var2) : null;
        }
        if (l11 instanceof net.time4j.tz.k) {
            return (net.time4j.tz.k) net.time4j.tz.k.class.cast(l11);
        }
        return super.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    public final net.time4j.engine.w<T> r() {
        throw new UnsupportedOperationException("Parsed values do not have any chronology.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (net.time4j.engine.p<?> pVar : t()) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(pVar.name());
            sb2.append('=');
            sb2.append(l(pVar));
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        Object B = B();
        if (B != null) {
            sb2.append(">>>result=");
            sb2.append(B);
        }
        return sb2.toString();
    }

    @Override // net.time4j.engine.q
    public <V> boolean w(net.time4j.engine.p<V> pVar, V v11) {
        Objects.requireNonNull(pVar, "Missing chronological element.");
        return true;
    }
}