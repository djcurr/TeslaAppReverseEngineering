package net.time4j.history;

import java.util.Locale;
import net.time4j.format.v;

/* loaded from: classes5.dex */
public enum j implements net.time4j.engine.i {
    BC,
    AD,
    HISPANIC,
    BYZANTINE,
    AB_URBE_CONDITA;

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41404a;

        static {
            int[] iArr = new int[j.values().length];
            f41404a = iArr;
            try {
                iArr[j.BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41404a[j.AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41404a[j.HISPANIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41404a[j.BYZANTINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41404a[j.AB_URBE_CONDITA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int annoDomini(int i11) {
        try {
            int i12 = a.f41404a[ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                return net.time4j.base.c.l(i11, 753);
                            }
                            throw new UnsupportedOperationException(name());
                        }
                        return net.time4j.base.c.l(i11, 5508);
                    }
                    return net.time4j.base.c.l(i11, 38);
                }
                return i11;
            }
            return net.time4j.base.c.l(1, i11);
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i11);
        }
    }

    public String getAlternativeName(Locale locale, v vVar) {
        net.time4j.format.b d11 = net.time4j.format.b.d(locale);
        net.time4j.engine.p<j> j11 = d.E().j();
        String[] strArr = new String[2];
        strArr[0] = vVar == v.WIDE ? "w" : "a";
        strArr[1] = "alt";
        return d11.o(j11, strArr).g(this);
    }

    public String getDisplayName(Locale locale, v vVar) {
        return net.time4j.format.b.d(locale).b(vVar).g(this);
    }

    public int yearOfEra(j jVar, int i11) {
        int annoDomini = jVar.annoDomini(i11);
        try {
            int i12 = a.f41404a[ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                return net.time4j.base.c.e(annoDomini, 753);
                            }
                            throw new UnsupportedOperationException(name());
                        }
                        return net.time4j.base.c.e(annoDomini, 5508);
                    }
                    return net.time4j.base.c.e(annoDomini, 38);
                }
                return annoDomini;
            }
            return net.time4j.base.c.l(1, annoDomini);
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i11);
        }
    }
}