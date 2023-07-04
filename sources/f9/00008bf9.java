package net.time4j;

import java.lang.Comparable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
class j0<U extends Comparable<U>> implements net.time4j.engine.p<U> {

    /* renamed from: d  reason: collision with root package name */
    static final net.time4j.engine.p<h> f41459d = new j0(h.class, h.HOURS, h.NANOS);

    /* renamed from: e  reason: collision with root package name */
    static final net.time4j.engine.p<TimeUnit> f41460e = new j0(TimeUnit.class, TimeUnit.DAYS, TimeUnit.NANOSECONDS);

    /* renamed from: a  reason: collision with root package name */
    private final Class<U> f41461a;

    /* renamed from: b  reason: collision with root package name */
    private final transient U f41462b;

    /* renamed from: c  reason: collision with root package name */
    private final transient U f41463c;

    private j0(Class<U> cls, U u11, U u12) {
        this.f41461a = cls;
        this.f41462b = u11;
        this.f41463c = u12;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        Comparable comparable = (Comparable) oVar.l(this);
        Comparable comparable2 = (Comparable) oVar2.l(this);
        if (this.f41461a == h.class) {
            return comparable.compareTo(comparable2);
        }
        return comparable2.compareTo(comparable);
    }

    @Override // net.time4j.engine.p
    /* renamed from: b */
    public U getDefaultMaximum() {
        return this.f41463c;
    }

    @Override // net.time4j.engine.p
    /* renamed from: c */
    public U getDefaultMinimum() {
        return this.f41462b;
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<U> getType() {
        return this.f41461a;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public String name() {
        return "PRECISION";
    }
}