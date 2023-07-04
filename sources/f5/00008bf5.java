package net.time4j.i18n;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.MissingResourceException;
import net.time4j.format.n;
import net.time4j.format.r;
import net.time4j.format.v;
import net.time4j.x0;
import org.slf4j.Marker;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public final class h implements r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41452a;

        static {
            int[] iArr = new int[v.values().length];
            f41452a = iArr;
            try {
                iArr[v.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41452a[v.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41452a[v.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41452a[v.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static String F(char c11, v vVar, n nVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c11);
        int i11 = a.f41452a[vVar.ordinal()];
        if (i11 == 1) {
            sb2.append('w');
        } else if (i11 == 2 || i11 == 3) {
            sb2.append('s');
        } else if (i11 == 4) {
            sb2.append('n');
        } else {
            throw new UnsupportedOperationException(vVar.name());
        }
        sb2.append(nVar.ordinal());
        return sb2.toString();
    }

    private static String G(char c11, boolean z11, n nVar) {
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c11);
        sb2.append(z11 ? '+' : CoreConstants.DASH_CHAR);
        sb2.append(nVar.ordinal());
        return sb2.toString();
    }

    private static String H(v vVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Matrix.MATRIX_TYPE_RANDOM_LT);
        int i11 = a.f41452a[vVar.ordinal()];
        if (i11 == 1) {
            sb2.append('w');
        } else if (i11 == 2 || i11 == 3) {
            sb2.append('s');
        } else if (i11 == 4) {
            sb2.append('n');
        } else {
            throw new UnsupportedOperationException(vVar.name());
        }
        sb2.append(CoreConstants.DASH_CHAR);
        sb2.append(str);
        return sb2.toString();
    }

    private String I(Locale locale, String str) {
        boolean z11 = true;
        e eVar = null;
        for (Locale locale2 : e.c(locale)) {
            e h11 = (!z11 || eVar == null) ? e.h("i18n/reltime/relpattern", locale2) : eVar;
            if (z11) {
                if (locale2.equals(h11.e())) {
                    z11 = false;
                } else {
                    eVar = h11;
                }
            }
            if (h11.d().contains(str)) {
                return h11.f(str);
            }
        }
        return "";
    }

    private String J(Locale locale, String str, String str2, String str3, n nVar) {
        boolean z11 = true;
        e eVar = null;
        for (Locale locale2 : e.c(locale)) {
            e h11 = (!z11 || eVar == null) ? e.h("i18n/" + str, locale2) : eVar;
            if (z11) {
                if (locale2.equals(h11.e())) {
                    z11 = false;
                } else {
                    eVar = h11;
                }
            }
            if (h11.d().contains(str2)) {
                return h11.f(str2);
            }
            if (nVar != n.OTHER && h11.d().contains(str3)) {
                return h11.f(str3);
            }
        }
        throw new MissingResourceException("Can't find resource for bundle " + str + ".properties, key " + str2, str + ".properties", str2);
    }

    private String K(Locale locale, char c11, boolean z11, n nVar) {
        return J(locale, "reltime/relpattern", G(c11, z11, nVar), G(c11, z11, n.OTHER), nVar);
    }

    private String L(Locale locale, char c11, v vVar, n nVar) {
        return J(locale, "units/upattern", F(c11, vVar, nVar), F(c11, vVar, n.OTHER), nVar);
    }

    private static String M(String str, char c11, int i11) {
        int length = str.length() - 2;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) == '{') {
                int i13 = i12 + 1;
                if (str.charAt(i13) == c11) {
                    int i14 = i12 + 2;
                    if (str.charAt(i14) == '}') {
                        StringBuilder sb2 = new StringBuilder(length + 10);
                        sb2.append(str);
                        sb2.replace(i13, i14, String.valueOf(i11));
                        return sb2.toString();
                    }
                } else {
                    continue;
                }
            }
        }
        return str;
    }

    @Override // net.time4j.format.r
    public String A(x0 x0Var, Locale locale) {
        return I(locale, x0Var.name().substring(0, 3).toLowerCase() + Marker.ANY_NON_NULL_MARKER);
    }

    @Override // net.time4j.format.x
    public String B(Locale locale, v vVar, n nVar) {
        return L(locale, '6', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String C(Locale locale, boolean z11, n nVar) {
        return K(locale, 'N', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String D(Locale locale, boolean z11, n nVar) {
        return K(locale, 'm', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String E(Locale locale, boolean z11, n nVar) {
        return K(locale, 'n', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String a(Locale locale, boolean z11, n nVar) {
        return K(locale, 'h', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String b(Locale locale) {
        return J(locale, "reltime/relpattern", "yesterday", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String c(Locale locale) {
        return J(locale, "reltime/relpattern", "now", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String d(Locale locale, boolean z11, n nVar) {
        return K(locale, 'S', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String e(Locale locale, v vVar, n nVar) {
        return L(locale, 'N', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String f(Locale locale, boolean z11, n nVar) {
        return K(locale, 'M', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String g(Locale locale, v vVar, n nVar) {
        return L(locale, 'H', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String h(Locale locale) {
        return J(locale, "reltime/relpattern", "tomorrow", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String i(Locale locale, boolean z11, n nVar) {
        return K(locale, 'W', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String j(x0 x0Var, Locale locale) {
        return I(locale, x0Var.name().substring(0, 3).toLowerCase() + "-");
    }

    @Override // net.time4j.format.x
    public String k(Locale locale, v vVar, n nVar) {
        return L(locale, 'Y', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String l(Locale locale, v vVar, n nVar) {
        return L(locale, 'S', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String m(Locale locale, v vVar, n nVar) {
        return L(locale, 'M', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String n(Locale locale, v vVar, n nVar) {
        return L(locale, '9', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String o(Locale locale) {
        return J(locale, "reltime/relpattern", "today", null, n.OTHER);
    }

    @Override // net.time4j.format.x
    public String p(Locale locale, v vVar, n nVar) {
        return L(locale, '3', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String q(Locale locale, boolean z11, n nVar) {
        return K(locale, 'y', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String r(Locale locale, boolean z11, n nVar) {
        return K(locale, 'H', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String s(Locale locale, v vVar, n nVar) {
        return L(locale, 'D', vVar, nVar);
    }

    @Override // net.time4j.format.x
    public String t(Locale locale, v vVar, int i11) {
        int i12;
        if (i11 >= 2) {
            e h11 = e.h("i18n/units/upattern", locale);
            String H = H(vVar, String.valueOf(i11));
            if (h11.b(H)) {
                return h11.f(H);
            }
            String f11 = h11.f(H(vVar, "end"));
            if (i11 == 2) {
                return f11;
            }
            String f12 = h11.f(H(vVar, "start"));
            String f13 = h11.f(H(vVar, "middle"));
            String M = M(M(f11, '1', i11 - 1), '0', i11 - 2);
            int i13 = i11 - 3;
            String str = M;
            while (i13 >= 0) {
                String str2 = i13 == 0 ? f12 : f13;
                int length = str2.length();
                int i14 = length - 1;
                while (true) {
                    if (i14 < 0) {
                        i12 = -1;
                        break;
                    }
                    if (i14 >= 2 && str2.charAt(i14) == '}' && str2.charAt(i14 - 1) == '1') {
                        i12 = i14 - 2;
                        if (str2.charAt(i12) == '{') {
                            break;
                        }
                    }
                    i14--;
                }
                if (i12 > -1) {
                    M = str2.substring(0, i12) + str;
                    if (i12 < length - 3) {
                        M = M + str2.substring(i12 + 3);
                    }
                }
                if (i13 > 0) {
                    str = M(M, '0', i13);
                }
                i13--;
            }
            return M;
        }
        throw new IllegalArgumentException("Size must be greater than 1.");
    }

    @Override // net.time4j.format.x
    public String u(Locale locale, boolean z11, n nVar) {
        return K(locale, 'D', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String v(Locale locale, v vVar, n nVar) {
        return L(locale, 'W', vVar, nVar);
    }

    @Override // net.time4j.format.r
    public String w(Locale locale, boolean z11, n nVar) {
        return K(locale, 'd', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String x(Locale locale, boolean z11, n nVar) {
        return K(locale, 'w', z11, nVar);
    }

    @Override // net.time4j.format.r
    public String y(Locale locale, boolean z11, n nVar) {
        return K(locale, 's', z11, nVar);
    }

    @Override // net.time4j.format.x
    public String z(Locale locale, boolean z11, n nVar) {
        return K(locale, 'Y', z11, nVar);
    }
}