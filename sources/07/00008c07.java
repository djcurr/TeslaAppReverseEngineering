package net.time4j;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.time4j.engine.j0;
import net.time4j.x;

/* loaded from: classes5.dex */
public final class o<U extends x> extends net.time4j.engine.a<U> implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    private static final char f41481c;

    /* renamed from: d  reason: collision with root package name */
    private static final o f41482d;

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<j0.a<? extends net.time4j.engine.v>> f41483e;
    private static final long serialVersionUID = -6321211763598951499L;

    /* renamed from: a  reason: collision with root package name */
    private final transient List<j0.a<U>> f41484a;

    /* renamed from: b  reason: collision with root package name */
    private final transient boolean f41485b;

    /* loaded from: classes5.dex */
    public static final class a<U extends x> extends net.time4j.format.w<U, o<U>> {
        private a(Class<U> cls, String str) {
            super(cls, str);
        }

        public static <U extends x> a<U> k(Class<U> cls, String str) {
            return new a<>(cls, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // net.time4j.format.w
        /* renamed from: j */
        public U f(char c11) {
            if (c11 != 'I') {
                if (c11 != 'M') {
                    if (c11 != 'Q') {
                        if (c11 != 'W') {
                            if (c11 != 'Y') {
                                if (c11 != 'f') {
                                    if (c11 != 'h') {
                                        if (c11 != 'm') {
                                            if (c11 != 's') {
                                                switch (c11) {
                                                    case 'C':
                                                        return f.CENTURIES;
                                                    case 'D':
                                                        return f.DAYS;
                                                    case 'E':
                                                        return f.DECADES;
                                                    default:
                                                        throw new IllegalArgumentException("Unsupported pattern symbol: " + c11);
                                                }
                                            }
                                            return h.SECONDS;
                                        }
                                        return h.MINUTES;
                                    }
                                    return h.HOURS;
                                }
                                return h.NANOS;
                            }
                            return f.YEARS;
                        }
                        return f.WEEKS;
                    }
                    return f.QUARTERS;
                }
                return f.MONTHS;
            }
            return f.MILLENNIA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b<U extends x> extends net.time4j.engine.b<U, o<U>> {
        /* synthetic */ b(x[] xVarArr, n nVar) {
            this(xVarArr);
        }

        private b(U... uArr) {
            super(uArr.length > 1, uArr);
        }
    }

    static {
        f41481c = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? CoreConstants.DOT : CoreConstants.COMMA_CHAR;
        f41482d = new o();
        e(true, false);
        e(true, true);
        e(false, false);
        e(false, true);
        f(true);
        f(false);
        f41483e = o0.a();
        o0.i();
        o0.f();
        o0.g();
        f fVar = f.DAYS;
        g(f.YEARS, f.MONTHS, fVar);
        g(h.HOURS, h.MINUTES, h.SECONDS, h.NANOS);
        g(f.weekBasedYears(), f.WEEKS, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(List<j0.a<U>> list, boolean z11) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty) {
            this.f41484a = Collections.emptyList();
        } else {
            Collections.sort(list, f41483e);
            this.f41484a = Collections.unmodifiableList(list);
        }
        this.f41485b = !isEmpty && z11;
    }

    private int d() {
        return b().size();
    }

    private static a<f> e(boolean z11, boolean z12) {
        return a.k(f.class, z11 ? z12 ? "YYYY-DDD" : "YYYY-MM-DD" : z12 ? "YYYYDDD" : "YYYYMMDD");
    }

    private static a<h> f(boolean z11) {
        return a.k(h.class, z11 ? "hh[:mm[:ss[,fffffffff]]]" : "hh[mm[ss[,fffffffff]]]");
    }

    public static <U extends x> net.time4j.engine.h0<U, o<U>> g(U... uArr) {
        return new b(uArr, null);
    }

    private boolean h(x xVar) {
        char symbol = xVar.getSymbol();
        return symbol >= '1' && symbol <= '9';
    }

    public static <U extends x> o<U> i() {
        return f41482d;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String j(int r23) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.o.j(int):java.lang.String");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 6);
    }

    @Override // net.time4j.engine.j0
    public boolean a() {
        return this.f41485b;
    }

    @Override // net.time4j.engine.j0
    public List<j0.a<U>> b() {
        return this.f41484a;
    }

    public boolean c(x xVar) {
        if (xVar == null) {
            return false;
        }
        boolean h11 = h(xVar);
        int size = this.f41484a.size();
        for (int i11 = 0; i11 < size; i11++) {
            j0.a<U> aVar = this.f41484a.get(i11);
            U b11 = aVar.b();
            if (b11.equals(xVar) || (h11 && h(b11))) {
                return aVar.a() > 0;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) o.class.cast(obj);
            return this.f41485b == oVar.f41485b && b().equals(oVar.b());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = b().hashCode();
        return this.f41485b ? hashCode ^ hashCode : hashCode;
    }

    public String toString() {
        return j(0);
    }

    private o() {
        this.f41484a = Collections.emptyList();
        this.f41485b = false;
    }
}