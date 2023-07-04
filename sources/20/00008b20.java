package net.time4j.engine;

import java.util.Locale;

/* loaded from: classes5.dex */
public enum z implements p<Long> {
    UTC(2441317),
    UNIX(2440587),
    MODIFIED_JULIAN_DATE(2400000),
    EXCEL(2415019),
    ANSI(2305812),
    RATA_DIE(1721424),
    JULIAN_DAY_NUMBER(-1),
    LILIAN_DAY_NUMBER(2299159);
    
    private final int offset;

    /* loaded from: classes5.dex */
    private static class a<D extends q<D>> implements y<D, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final z f40987a;

        /* renamed from: b  reason: collision with root package name */
        private final k<D> f40988b;

        a(z zVar, k<D> kVar) {
            this.f40987a = zVar;
            this.f40988b = kVar;
        }

        @Override // net.time4j.engine.y
        /* renamed from: c */
        public p<?> getChildAtCeiling(D d11) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: d */
        public p<?> getChildAtFloor(D d11) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* renamed from: e */
        public Long getMaximum(D d11) {
            return Long.valueOf(this.f40987a.transform(this.f40988b.a() + 730, z.UNIX));
        }

        @Override // net.time4j.engine.y
        /* renamed from: f */
        public Long getMinimum(D d11) {
            return Long.valueOf(this.f40987a.transform(this.f40988b.c() + 730, z.UNIX));
        }

        @Override // net.time4j.engine.y
        /* renamed from: g */
        public Long getValue(D d11) {
            return Long.valueOf(this.f40987a.transform(this.f40988b.transform(d11) + 730, z.UNIX));
        }

        @Override // net.time4j.engine.y
        /* renamed from: h */
        public boolean isValid(D d11, Long l11) {
            if (l11 == null) {
                return false;
            }
            try {
                long m11 = net.time4j.base.c.m(z.UNIX.transform(l11.longValue(), this.f40987a), 730L);
                if (m11 <= this.f40988b.a()) {
                    return m11 >= this.f40988b.c();
                }
                return false;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.y
        /* renamed from: i */
        public D withValue(D d11, Long l11, boolean z11) {
            if (l11 != null) {
                return this.f40988b.b(net.time4j.base.c.m(z.UNIX.transform(l11.longValue(), this.f40987a), 730L));
            }
            throw new IllegalArgumentException("Missing epoch day value.");
        }
    }

    z(int i11) {
        this.offset = (i11 - 2440587) - 730;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <D extends q<D>> y<D, Long> derive(k<D> kVar) {
        return new a(this, kVar);
    }

    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return this == MODIFIED_JULIAN_DATE ? 'g' : (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<Long> getType() {
        return Long.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    public long transform(long j11, z zVar) {
        try {
            return net.time4j.base.c.f(j11, zVar.offset - this.offset);
        } catch (ArithmeticException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // java.util.Comparator
    public int compare(o oVar, o oVar2) {
        return ((Long) oVar.l(this)).compareTo((Long) oVar2.l(this));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.p
    public Long getDefaultMaximum() {
        return Long.valueOf(365241779741L - this.offset);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.time4j.engine.p
    public Long getDefaultMinimum() {
        return Long.valueOf((-365243219892L) - this.offset);
    }
}