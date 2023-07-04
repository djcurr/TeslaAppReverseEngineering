package net.time4j.i18n;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import net.time4j.format.m;
import net.time4j.format.u;
import net.time4j.format.v;

/* loaded from: classes5.dex */
public final class c implements u, k30.c {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f41431a;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<Locale> f41432b;

    static {
        String[] split = e.h("calendar/names/iso8601/iso8601", Locale.ROOT).f("languages").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        f41431a = unmodifiableSet;
        HashSet hashSet2 = new HashSet();
        for (String str : unmodifiableSet) {
            hashSet2.add(new Locale(str));
        }
        for (d dVar : d.values()) {
            hashSet2.add(new Locale(dVar.name()));
        }
        f41432b = Collections.unmodifiableSet(hashSet2);
    }

    private static String[] l(Locale locale, v vVar) {
        v vVar2;
        e m11 = m(locale);
        String[] strArr = null;
        if (m11 != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            strArr = o(m11, 5, n(m11, "ERA"), vVar, vVar == v.NARROW ? v.ABBREVIATED : null, m.FORMAT, 0);
            if (strArr == null && vVar != (vVar2 = v.ABBREVIATED)) {
                strArr = l(locale, vVar2);
            }
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for era and locale: " + locale, c.class.getName(), locale.toString());
    }

    private static e m(Locale locale) {
        return e.h("calendar/names/iso8601/iso8601", locale);
    }

    private static String n(e eVar, String str) {
        return (eVar.b("useShortKeys") && "true".equals(eVar.f("useShortKeys"))) ? str.substring(0, 1) : str;
    }

    private static String[] o(e eVar, int i11, String str, v vVar, v vVar2, m mVar, int i12) {
        String[] o11;
        String[] strArr = new String[i11];
        boolean z11 = str.length() == 1;
        for (int i13 = 0; i13 < i11; i13++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            if (z11) {
                char charAt = vVar.name().charAt(0);
                if (mVar != m.STANDALONE) {
                    charAt = Character.toLowerCase(charAt);
                }
                sb2.append(charAt);
            } else {
                sb2.append(vVar.name());
                if (mVar == m.STANDALONE) {
                    sb2.append('|');
                    sb2.append(mVar.name());
                }
            }
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            sb2.append('_');
            sb2.append(i13 + i12);
            String sb3 = sb2.toString();
            if (eVar.b(sb3)) {
                strArr[i13] = eVar.f(sb3);
            } else if (vVar2 == null || (o11 = o(eVar, i11, str, vVar2, null, mVar, i12)) == null) {
                return null;
            } else {
                strArr[i13] = o11[i13];
            }
        }
        return strArr;
    }

    private static String p(String str, v vVar, m mVar) {
        char charAt = vVar.name().charAt(0);
        if (mVar == m.FORMAT) {
            charAt = Character.toLowerCase(charAt);
        }
        return "P(" + String.valueOf(charAt) + ")_" + str;
    }

    private static String[] q(Locale locale, v vVar, m mVar) {
        e m11 = m(locale);
        if (m11 != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            String p11 = p("am", vVar, mVar);
            String p12 = p("pm", vVar, mVar);
            if (m11.b(p11) && m11.b(p12)) {
                return new String[]{m11.f(p11), m11.f(p12)};
            }
            if (mVar == m.STANDALONE) {
                v vVar2 = v.ABBREVIATED;
                if (vVar == vVar2) {
                    return q(locale, vVar, m.FORMAT);
                }
                return q(locale, vVar2, mVar);
            }
            v vVar3 = v.ABBREVIATED;
            if (vVar != vVar3) {
                return q(locale, vVar3, mVar);
            }
        }
        throw new MissingResourceException("Cannot find ISO-8601-resource for am/pm and locale: " + locale, c.class.getName(), locale.toString());
    }

    private static String[] r(Locale locale, v vVar, m mVar) {
        String[] strArr;
        e m11 = m(locale);
        if (m11 != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            strArr = o(m11, 12, n(m11, "MONTH_OF_YEAR"), vVar, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar != v.NARROW) {
                        strArr = r(locale, vVar, m.FORMAT);
                    }
                } else if (vVar == v.ABBREVIATED) {
                    strArr = r(locale, v.WIDE, m.FORMAT);
                } else if (vVar == v.NARROW) {
                    strArr = r(locale, vVar, mVar2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-month for locale: " + locale, c.class.getName(), locale.toString());
    }

    private static String[] s(Locale locale, v vVar, m mVar) {
        String[] strArr;
        e m11 = m(locale);
        if (m11 != null) {
            if (vVar == v.SHORT) {
                vVar = v.ABBREVIATED;
            }
            strArr = o(m11, 4, n(m11, "QUARTER_OF_YEAR"), vVar, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar != v.NARROW) {
                        strArr = s(locale, vVar, m.FORMAT);
                    }
                } else if (vVar == v.ABBREVIATED) {
                    strArr = s(locale, v.WIDE, m.FORMAT);
                } else if (vVar == v.NARROW) {
                    strArr = s(locale, vVar, mVar2);
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-quarter-of-year for locale: " + locale, c.class.getName(), locale.toString());
    }

    private static char t(net.time4j.format.e eVar) {
        return Character.toLowerCase(eVar.name().charAt(0));
    }

    private static String[] u(Locale locale, v vVar, m mVar) {
        String[] strArr;
        e m11 = m(locale);
        if (m11 != null) {
            strArr = o(m11, 7, n(m11, "DAY_OF_WEEK"), vVar, null, mVar, 1);
            if (strArr == null) {
                m mVar2 = m.STANDALONE;
                if (mVar == mVar2) {
                    if (vVar != v.NARROW) {
                        strArr = u(locale, vVar, m.FORMAT);
                    }
                } else {
                    v vVar2 = v.ABBREVIATED;
                    if (vVar == vVar2) {
                        strArr = u(locale, v.WIDE, m.FORMAT);
                    } else if (vVar == v.SHORT) {
                        strArr = u(locale, vVar2, m.FORMAT);
                    } else if (vVar == v.NARROW) {
                        strArr = u(locale, vVar, mVar2);
                    }
                }
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        throw new MissingResourceException("Cannot find ISO-8601-day-of-week for locale: " + locale, c.class.getName(), locale.toString());
    }

    @Override // net.time4j.format.f
    public String a(net.time4j.format.e eVar, Locale locale) {
        return i(eVar, locale, false);
    }

    @Override // net.time4j.format.u
    public boolean b(Locale locale) {
        return f41431a.contains(d.getAlias(locale));
    }

    @Override // net.time4j.format.u
    public String[] c(String str, Locale locale, v vVar, m mVar) {
        return s(locale, vVar, mVar);
    }

    @Override // net.time4j.format.u
    public String[] d(String str, Locale locale, v vVar, m mVar, boolean z11) {
        return r(locale, vVar, mVar);
    }

    @Override // net.time4j.format.f
    public String e(net.time4j.format.e eVar, Locale locale) {
        return m(locale).f("F(" + t(eVar) + ")_d");
    }

    @Override // net.time4j.format.u
    public String[] f(String str, Locale locale, v vVar) {
        return l(locale, vVar);
    }

    @Override // net.time4j.format.u
    public String[] g(String str, Locale locale, v vVar, m mVar) {
        return u(locale, vVar, mVar);
    }

    @Override // net.time4j.format.u
    public String[] h(String str, Locale locale, v vVar, m mVar) {
        return q(locale, vVar, mVar);
    }

    @Override // k30.c
    public String i(net.time4j.format.e eVar, Locale locale, boolean z11) {
        String str;
        if (z11 && eVar == net.time4j.format.e.FULL) {
            str = "F(alt)";
        } else {
            str = "F(" + t(eVar) + ")_t";
        }
        return m(locale).f(str);
    }

    @Override // net.time4j.format.u
    public boolean j(String str) {
        return "iso8601".equals(str);
    }

    @Override // net.time4j.format.f
    public String k(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
        if (eVar.compareTo(eVar2) < 0) {
            eVar = eVar2;
        }
        return m(locale).f("F(" + t(eVar) + ")_dt");
    }

    public String toString() {
        return "IsoTextProviderSPI";
    }
}