package net.time4j.calendar;

import java.util.Collections;
import java.util.Map;
import net.time4j.engine.q;
import net.time4j.engine.y;
import net.time4j.engine.z;

/* loaded from: classes5.dex */
final class m<T extends net.time4j.engine.q<T>> implements y<T, Integer> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ? extends net.time4j.engine.k<T>> f40902a;

    /* renamed from: b  reason: collision with root package name */
    private final net.time4j.engine.p<Integer> f40903b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(net.time4j.engine.k<T> kVar, net.time4j.engine.p<Integer> pVar) {
        this.f40902a = Collections.singletonMap("calendrical", kVar);
        this.f40903b = pVar;
    }

    private net.time4j.engine.k<T> c(T t11) {
        if (t11 instanceof net.time4j.engine.l) {
            return this.f40902a.get(((net.time4j.engine.l) net.time4j.engine.l.class.cast(t11)).i());
        }
        return this.f40902a.get("calendrical");
    }

    private static Integer j(long j11) {
        long j12;
        long f11 = net.time4j.base.c.f(z.MODIFIED_JULIAN_DATE.transform(j11, z.UTC), 678881L);
        long b11 = net.time4j.base.c.b(f11, 146097);
        int d11 = net.time4j.base.c.d(f11, 146097);
        if (d11 == 146096) {
            j12 = (b11 + 1) * 400;
        } else {
            int i11 = d11 / 36524;
            int i12 = d11 % 36524;
            int i13 = i12 / 1461;
            int i14 = i12 % 1461;
            if (i14 == 1460) {
                j12 = (b11 * 400) + (i11 * 100) + ((i13 + 1) * 4);
            } else {
                j12 = (b11 * 400) + (i11 * 100) + (i13 * 4) + (i14 / 365);
                if (((((i14 % 365) + 31) * 5) / 153) + 2 > 12) {
                    j12++;
                }
            }
        }
        return Integer.valueOf(net.time4j.base.c.g(j12));
    }

    @Override // net.time4j.engine.y
    /* renamed from: d */
    public net.time4j.engine.p<?> getChildAtCeiling(T t11) {
        return null;
    }

    @Override // net.time4j.engine.y
    /* renamed from: e */
    public net.time4j.engine.p<?> getChildAtFloor(T t11) {
        return null;
    }

    @Override // net.time4j.engine.y
    /* renamed from: f */
    public Integer getMaximum(T t11) {
        net.time4j.engine.k<T> c11 = c(t11);
        return j(c11.transform((T) c11.b(c11.a()).x(this.f40903b, 1)));
    }

    @Override // net.time4j.engine.y
    /* renamed from: g */
    public Integer getMinimum(T t11) {
        net.time4j.engine.k<T> c11 = c(t11);
        return j(c11.transform((T) c11.b(c11.c()).x(this.f40903b, 1)));
    }

    @Override // net.time4j.engine.y
    /* renamed from: h */
    public Integer getValue(T t11) {
        return j(c(t11).transform((T) t11.x(this.f40903b, 1)));
    }

    @Override // net.time4j.engine.y
    /* renamed from: i */
    public boolean isValid(T t11, Integer num) {
        return getValue(t11).equals(num);
    }

    @Override // net.time4j.engine.y
    /* renamed from: k */
    public T withValue(T t11, Integer num, boolean z11) {
        if (isValid(t11, num)) {
            return t11;
        }
        throw new IllegalArgumentException("The related gregorian year is read-only.");
    }
}