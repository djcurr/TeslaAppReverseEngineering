package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: f */
    public static final /* synthetic */ int f32896f = 0;

    /* renamed from: a */
    private f f32897a;

    /* renamed from: b */
    private final f f32898b;

    /* renamed from: c */
    private final List f32899c;

    /* renamed from: d */
    private final boolean f32900d;

    /* renamed from: e */
    private int f32901e;

    /* loaded from: classes7.dex */
    public static final class a implements g {

        /* renamed from: a */
        private final g[] f32902a;

        /* renamed from: b */
        private final boolean f32903b;

        a(List list, boolean z11) {
            this.f32902a = (g[]) list.toArray(new g[list.size()]);
            this.f32903b = z11;
        }

        a(g[] gVarArr, boolean z11) {
            this.f32902a = gVarArr;
            this.f32903b = z11;
        }

        public a a(boolean z11) {
            return z11 == this.f32903b ? this : new a(this.f32902a, z11);
        }

        @Override // j$.time.format.g
        public boolean c(q qVar, StringBuilder sb2) {
            int length = sb2.length();
            if (this.f32903b) {
                qVar.g();
            }
            try {
                for (g gVar : this.f32902a) {
                    if (!gVar.c(qVar, sb2)) {
                        sb2.setLength(length);
                        return true;
                    }
                }
                if (this.f32903b) {
                    qVar.a();
                }
                return true;
            } finally {
                if (this.f32903b) {
                    qVar.a();
                }
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f32902a != null) {
                sb2.append(this.f32903b ? "[" : "(");
                for (g gVar : this.f32902a) {
                    sb2.append(gVar);
                }
                sb2.append(this.f32903b ? "]" : ")");
            }
            return sb2.toString();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.l lVar = j$.time.temporal.j.f32959a;
        hashMap.put('Q', lVar);
        hashMap.put('q', lVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
    }

    public f() {
        this.f32897a = this;
        this.f32899c = new ArrayList();
        this.f32901e = -1;
        this.f32898b = null;
        this.f32900d = false;
    }

    private f(f fVar, boolean z11) {
        this.f32897a = this;
        this.f32899c = new ArrayList();
        this.f32901e = -1;
        this.f32898b = fVar;
        this.f32900d = z11;
    }

    private int d(g gVar) {
        Objects.requireNonNull(gVar, "pp");
        f fVar = this.f32897a;
        Objects.requireNonNull(fVar);
        fVar.f32899c.add(gVar);
        f fVar2 = this.f32897a;
        fVar2.f32901e = -1;
        return fVar2.f32899c.size() - 1;
    }

    private f j(j jVar) {
        j b11;
        u uVar;
        f fVar = this.f32897a;
        int i11 = fVar.f32901e;
        if (i11 >= 0) {
            j jVar2 = (j) fVar.f32899c.get(i11);
            if (jVar.f32910b == jVar.f32911c) {
                uVar = jVar.f32912d;
                if (uVar == u.NOT_NEGATIVE) {
                    b11 = jVar2.d(jVar.f32911c);
                    d(jVar.b());
                    this.f32897a.f32901e = i11;
                    this.f32897a.f32899c.set(i11, b11);
                }
            }
            b11 = jVar2.b();
            this.f32897a.f32901e = d(jVar);
            this.f32897a.f32899c.set(i11, b11);
        } else {
            fVar.f32901e = d(jVar);
        }
        return this;
    }

    public f a(DateTimeFormatter dateTimeFormatter) {
        d(dateTimeFormatter.f(false));
        return this;
    }

    public f b(j$.time.temporal.l lVar, int i11, int i12, boolean z11) {
        d(new h(lVar, i11, i12, z11));
        return this;
    }

    public f c() {
        d(new i(-2));
        return this;
    }

    public f e(char c11) {
        d(new e(c11));
        return this;
    }

    public f f(String str) {
        if (str.length() > 0) {
            d(str.length() == 1 ? new e(str.charAt(0)) : new m(str));
        }
        return this;
    }

    public f g(String str, String str2) {
        d(new k(str, str2));
        return this;
    }

    public f h() {
        d(k.f32915d);
        return this;
    }

    public f i(j$.time.temporal.l lVar, Map map) {
        Objects.requireNonNull(lVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        v vVar = v.FULL;
        d(new n(lVar, vVar, new b(this, new r(Collections.singletonMap(vVar, linkedHashMap)))));
        return this;
    }

    public f k(j$.time.temporal.l lVar, int i11) {
        Objects.requireNonNull(lVar, "field");
        if (i11 >= 1 && i11 <= 19) {
            j(new j(lVar, i11, i11, u.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i11);
    }

    public f l(j$.time.temporal.l lVar, int i11, int i12, u uVar) {
        if (i11 == i12 && uVar == u.NOT_NEGATIVE) {
            k(lVar, i12);
            return this;
        }
        Objects.requireNonNull(lVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i11);
        } else if (i12 < 1 || i12 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i12);
        } else if (i12 >= i11) {
            j(new j(lVar, i11, i12, uVar));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i12 + " < " + i11);
        }
    }

    public f m() {
        d(new o(j$.time.format.a.f32890a, "ZoneRegionId()"));
        return this;
    }

    public f n() {
        f fVar = this.f32897a;
        if (fVar.f32898b != null) {
            if (fVar.f32899c.size() > 0) {
                f fVar2 = this.f32897a;
                a aVar = new a(fVar2.f32899c, fVar2.f32900d);
                this.f32897a = this.f32897a.f32898b;
                d(aVar);
            } else {
                this.f32897a = this.f32897a.f32898b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public f o() {
        f fVar = this.f32897a;
        fVar.f32901e = -1;
        this.f32897a = new f(fVar, true);
        return this;
    }

    public f p() {
        d(l.INSENSITIVE);
        return this;
    }

    public f q() {
        d(l.SENSITIVE);
        return this;
    }

    public f r() {
        d(l.LENIENT);
        return this;
    }

    public DateTimeFormatter s(int i11, j$.time.chrono.f fVar) {
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(locale, "locale");
        while (this.f32897a.f32898b != null) {
            n();
        }
        return new DateTimeFormatter(new a(this.f32899c, false), locale, s.f32932a, i11, null, fVar, null);
    }
}