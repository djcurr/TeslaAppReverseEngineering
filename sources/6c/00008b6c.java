package net.time4j.format.expert;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.expert.c;
import net.time4j.h0;
import net.time4j.z0;

/* loaded from: classes5.dex */
public enum w {
    CLDR,
    SIMPLE_DATE_FORMAT,
    CLDR_24,
    CLDR_DATE,
    DYNAMIC;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41244a;

        static {
            int[] iArr = new int[w.values().length];
            f41244a = iArr;
            try {
                iArr[w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41244a[w.SIMPLE_DATE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41244a[w.CLDR_24.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41244a[w.CLDR_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41244a[w.DYNAMIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addEnumElementAsInteger(c.d<?> dVar, net.time4j.engine.p<? extends Enum> pVar, int i11) {
        dVar.u(pVar, i11, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addEnumElementAsText(c.d<?> dVar, net.time4j.engine.p<? extends Enum> pVar) {
        dVar.z(pVar);
    }

    private static void addMonth(c.d<?> dVar, int i11) {
        if (i11 == 1) {
            dVar.j(net.time4j.g0.f41298x, 1, 2);
        } else if (i11 == 2) {
            dVar.g(net.time4j.g0.f41298x, 2);
        } else if (i11 == 3) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.ABBREVIATED);
            dVar.z(net.time4j.g0.f41297w);
            dVar.L();
        } else if (i11 == 4) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE);
            dVar.z(net.time4j.g0.f41297w);
            dVar.L();
        } else if (i11 == 5) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.NARROW);
            dVar.z(net.time4j.g0.f41297w);
            dVar.L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for month: " + i11);
        }
    }

    private static void addNumber(net.time4j.engine.p<Integer> pVar, char c11, c.d<?> dVar, int i11, boolean z11) {
        if (i11 == 1) {
            dVar.j(pVar, 1, 2);
        } else if (i11 != 2 && !z11) {
            throw new IllegalArgumentException("Too many pattern letters (" + c11 + "): " + i11);
        } else {
            dVar.g(pVar, i11);
        }
    }

    private static void addOffset(c.d<?> dVar, char c11, int i11, boolean z11) {
        if (i11 == 1) {
            dVar.C(net.time4j.format.e.SHORT, false, Collections.singletonList(z11 ? "Z" : "+00"));
        } else if (i11 == 2) {
            dVar.C(net.time4j.format.e.MEDIUM, false, Collections.singletonList(z11 ? "Z" : "+0000"));
        } else if (i11 == 3) {
            dVar.C(net.time4j.format.e.MEDIUM, true, Collections.singletonList(z11 ? "Z" : "+00:00"));
        } else if (i11 == 4) {
            dVar.C(net.time4j.format.e.LONG, false, Collections.singletonList(z11 ? "Z" : "+0000"));
        } else if (i11 == 5) {
            dVar.C(net.time4j.format.e.LONG, true, Collections.singletonList(z11 ? "Z" : "+00:00"));
        } else {
            throw new IllegalArgumentException("Too many pattern letters (" + c11 + "): " + i11);
        }
    }

    private static void addQuarterOfYear(c.d<?> dVar, int i11) {
        if (i11 == 1 || i11 == 2) {
            dVar.h(net.time4j.g0.f41296t, i11);
        } else if (i11 == 3) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.ABBREVIATED);
            dVar.z(net.time4j.g0.f41296t);
            dVar.L();
        } else if (i11 == 4) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE);
            dVar.z(net.time4j.g0.f41296t);
            dVar.L();
        } else if (i11 == 5) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.NARROW);
            dVar.z(net.time4j.g0.f41296t);
            dVar.L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for quarter-of-year: " + i11);
        }
    }

    private static int capitalized(int i11) {
        return (i11 < 65 || i11 > 90) ? (i11 + 65) - 97 : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T cast(Object obj) {
        return obj;
    }

    private Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> cldr(c.d<?> dVar, Locale locale, char c11, int i11) {
        net.time4j.engine.w<?> effectiveChronology = getEffectiveChronology(dVar);
        if (isGeneralSymbol(c11) && !isISO(effectiveChronology)) {
            return general(dVar, effectiveChronology, c11, i11, locale);
        }
        if (c11 == 'h' && getCalendarType(effectiveChronology).equals("ethiopic")) {
            net.time4j.engine.p<Integer> findEthiopianHour = findEthiopianHour(effectiveChronology);
            if (findEthiopianHour != null) {
                addNumber(findEthiopianHour, c11, dVar, i11, false);
                return Collections.emptyMap();
            }
            throw new IllegalArgumentException("Ethiopian time not available.");
        }
        return cldrISO(dVar, effectiveChronology, locale, c11, i11, false);
    }

    private Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> cldr24(c.d<?> dVar, Locale locale, char c11, int i11) {
        if (c11 == 'H') {
            addNumber(h0.f41336z, c11, dVar, i11, false);
            return Collections.emptyMap();
        }
        return cldr(dVar, locale, c11, i11);
    }

    private Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> cldrISO(c.d<?> dVar, net.time4j.engine.w<?> wVar, Locale locale, char c11, int i11, boolean z11) {
        net.time4j.format.v vVar;
        net.time4j.format.v vVar2;
        switch (c11) {
            case 'A':
                dVar.j(h0.K, i11, 8);
                break;
            case 'B':
                dVar.b0(net.time4j.format.a.f40999g, getPeriodWidth(i11));
                dVar.e();
                dVar.L();
                break;
            case 'C':
            case 'I':
            case 'J':
            case 'N':
            case 'P':
            case 'R':
            case 'T':
            case 'U':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'f':
            case 'i':
            case 'j':
            case 'l':
            case 'n':
            case 'o':
            case 'p':
            case 't':
            case 'v':
            default:
                throw new IllegalArgumentException("Unsupported pattern symbol: " + c11);
            case 'D':
                if (i11 < 3) {
                    dVar.j(net.time4j.g0.A, i11, 3);
                    break;
                } else if (i11 != 3 && !z11) {
                    throw new IllegalArgumentException("Too many pattern letters (D): " + i11);
                } else {
                    dVar.g(net.time4j.g0.A, i11);
                    break;
                }
            case 'E':
                if (i11 <= 3) {
                    vVar = net.time4j.format.v.ABBREVIATED;
                } else if (i11 == 4 || z11) {
                    vVar = net.time4j.format.v.WIDE;
                } else if (i11 == 5) {
                    vVar = net.time4j.format.v.NARROW;
                } else if (i11 == 6) {
                    vVar = net.time4j.format.v.SHORT;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (E): " + i11);
                }
                dVar.b0(net.time4j.format.a.f40999g, vVar);
                dVar.z(net.time4j.g0.f41300z);
                dVar.L();
                break;
            case 'F':
                if (i11 != 1 && !z11) {
                    throw new IllegalArgumentException("Too many pattern letters (F): " + i11);
                }
                dVar.g(net.time4j.g0.C, i11);
                break;
            case 'G':
                if (i11 <= 3) {
                    vVar2 = net.time4j.format.v.ABBREVIATED;
                } else if (i11 == 4 || z11) {
                    vVar2 = net.time4j.format.v.WIDE;
                } else if (i11 == 5) {
                    vVar2 = net.time4j.format.v.NARROW;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (G): " + i11);
                }
                dVar.b0(net.time4j.format.a.f40999g, vVar2);
                net.time4j.history.d D = net.time4j.history.d.D(locale);
                dVar.A((net.time4j.format.t) net.time4j.format.t.class.cast(D.j()));
                dVar.L();
                HashMap hashMap = new HashMap();
                hashMap.put(net.time4j.g0.f41294p, D.M());
                hashMap.put(net.time4j.g0.f41297w, D.C());
                hashMap.put(net.time4j.g0.f41298x, D.C());
                hashMap.put(net.time4j.g0.f41299y, D.g());
                hashMap.put(net.time4j.g0.A, D.h());
                return hashMap;
            case 'H':
                addNumber(h0.f41335y, c11, dVar, i11, z11);
                break;
            case 'K':
                addNumber(h0.f41333x, c11, dVar, i11, z11);
                break;
            case 'L':
                dVar.b0(net.time4j.format.a.f41000h, net.time4j.format.m.STANDALONE);
                addMonth(dVar, Math.min(i11, z11 ? 4 : i11));
                dVar.L();
                break;
            case 'M':
                addMonth(dVar, Math.min(i11, z11 ? 4 : i11));
                break;
            case 'O':
                if (i11 == 1) {
                    dVar.x();
                    break;
                } else if (i11 == 4) {
                    dVar.p();
                    break;
                } else {
                    throw new IllegalArgumentException("Count of pattern letters is not 1 or 4: " + i11);
                }
            case 'Q':
                addQuarterOfYear(dVar, i11);
                break;
            case 'S':
                dVar.i(h0.H, i11, i11, false);
                break;
            case 'V':
                if (i11 == 2) {
                    try {
                        dVar.B();
                        break;
                    } catch (IllegalStateException e11) {
                        throw new IllegalArgumentException(e11.getMessage());
                    }
                } else {
                    throw new IllegalArgumentException("Count of pattern letters is not 2: " + i11);
                }
            case 'W':
                if (i11 == 1) {
                    dVar.g(z0.j(locale).m(), 1);
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (W): " + i11);
                }
            case 'X':
                addOffset(dVar, c11, i11, true);
                break;
            case 'Y':
                if (i11 == 2) {
                    dVar.D(net.time4j.g0.f41295q);
                    break;
                } else {
                    dVar.E(net.time4j.g0.f41295q, i11, false);
                    break;
                }
            case 'Z':
                if (i11 < 4) {
                    dVar.C(net.time4j.format.e.LONG, false, Collections.singletonList("+0000"));
                    break;
                } else if (i11 == 4) {
                    dVar.p();
                    break;
                } else if (i11 == 5) {
                    dVar.C(net.time4j.format.e.LONG, true, Collections.singletonList("Z"));
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (Z): " + i11);
                }
            case 'a':
                dVar.b0(net.time4j.format.a.f40999g, z11 ? net.time4j.format.v.ABBREVIATED : getPeriodWidth(i11));
                dVar.z(h0.f41330q);
                dVar.L();
                if (getCalendarType(wVar).equals("ethiopic")) {
                    net.time4j.engine.p<Integer> findEthiopianHour = findEthiopianHour(wVar);
                    if (findEthiopianHour != null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(findEthiopianHour, h0.f41331t);
                        return hashMap2;
                    }
                    throw new IllegalArgumentException("Ethiopian time not available.");
                }
                break;
            case 'b':
                dVar.b0(net.time4j.format.a.f40999g, getPeriodWidth(i11));
                dVar.f();
                dVar.L();
                break;
            case 'c':
                if (i11 != 2) {
                    dVar.b0(net.time4j.format.a.f41000h, net.time4j.format.m.STANDALONE);
                    if (i11 == 1) {
                        dVar.h(z0.j(locale).i(), 1);
                    } else {
                        cldrISO(dVar, wVar, locale, 'E', i11, z11);
                    }
                    dVar.L();
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid pattern count of 2 for symbol 'c'.");
                }
            case 'd':
                addNumber(net.time4j.g0.f41299y, c11, dVar, i11, z11);
                break;
            case 'e':
                if (i11 <= 2) {
                    dVar.h(z0.j(locale).i(), i11);
                    break;
                } else {
                    cldrISO(dVar, wVar, locale, 'E', i11, z11);
                    break;
                }
            case 'g':
                dVar.q(net.time4j.engine.z.MODIFIED_JULIAN_DATE, i11, 18, x.SHOW_WHEN_NEGATIVE);
                break;
            case 'h':
                addNumber(h0.f41331t, c11, dVar, i11, z11);
                break;
            case 'k':
                addNumber(h0.f41332w, c11, dVar, i11, z11);
                break;
            case 'm':
                addNumber(h0.A, c11, dVar, i11, z11);
                break;
            case 'q':
                dVar.b0(net.time4j.format.a.f41000h, net.time4j.format.m.STANDALONE);
                addQuarterOfYear(dVar, i11);
                dVar.L();
                break;
            case 'r':
                dVar.b0(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC);
                dVar.Z(net.time4j.format.a.f41005m, '0');
                dVar.E(net.time4j.g0.f41294p, i11, true);
                dVar.L();
                dVar.L();
                break;
            case 's':
                addNumber(h0.C, c11, dVar, i11, z11);
                break;
            case 'u':
                dVar.E(net.time4j.g0.f41294p, i11, true);
                break;
            case 'w':
                if (i11 <= 2) {
                    net.time4j.c<Integer, net.time4j.g0> n11 = z0.j(locale).n();
                    Iterator<net.time4j.engine.p<?>> it2 = wVar.t().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            net.time4j.engine.p<?> next = it2.next();
                            if (next.getSymbol() == c11) {
                                z0 z0Var = z0.f41616l;
                                if (next.equals(z0Var.n())) {
                                    n11 = z0Var.n();
                                }
                            }
                        }
                    }
                    addNumber(n11, c11, dVar, i11, z11);
                    break;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (w): " + i11);
                }
            case 'x':
                addOffset(dVar, c11, i11, false);
                break;
            case 'y':
                if (i11 == 2) {
                    dVar.D(net.time4j.g0.f41294p);
                    break;
                } else {
                    dVar.E(net.time4j.g0.f41294p, i11, false);
                    break;
                }
            case 'z':
                try {
                    if (i11 < 4) {
                        dVar.y();
                        break;
                    } else {
                        if (i11 != 4 && !z11) {
                            throw new IllegalArgumentException("Too many pattern letters (z): " + i11);
                        }
                        dVar.r();
                    }
                } catch (IllegalStateException e12) {
                    throw new IllegalArgumentException(e12.getMessage());
                }
        }
        return Collections.emptyMap();
    }

    private Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> dynamic(c.d<?> dVar, char c11, int i11, Locale locale) {
        boolean z11;
        boolean z12 = c11 >= 'A' && c11 <= 'Z';
        net.time4j.engine.p<?> findDynamicElement = findDynamicElement(getEffectiveChronology(dVar), locale, c11);
        if (findDynamicElement != null) {
            if (z12 && (((z11 = findDynamicElement instanceof net.time4j.format.t)) || Enum.class.isAssignableFrom(findDynamicElement.getType()))) {
                if (i11 == 1) {
                    dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.NARROW);
                } else if (i11 == 2) {
                    dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.SHORT);
                } else if (i11 == 3) {
                    dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.ABBREVIATED);
                } else if (i11 == 4) {
                    dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE);
                } else {
                    throw new IllegalArgumentException("Illegal count of symbols: " + c11);
                }
                if (z11) {
                    dVar.A((net.time4j.format.t) cast(findDynamicElement));
                } else {
                    addEnumElementAsText(dVar, (net.time4j.engine.p) cast(findDynamicElement));
                }
                dVar.L();
            } else if (findDynamicElement.getType() != Integer.class) {
                if (Enum.class.isAssignableFrom(findDynamicElement.getType())) {
                    addEnumElementAsInteger(dVar, (net.time4j.engine.p) cast(findDynamicElement), i11);
                } else {
                    throw new IllegalArgumentException("Can only handle enum or integer elements in a numerical way: " + findDynamicElement);
                }
            } else {
                dVar.j((net.time4j.engine.p) cast(findDynamicElement), i11, 9);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("Cannot resolve symbol: " + c11);
    }

    private static net.time4j.engine.p<?> find(Set<net.time4j.engine.p<?>> set, char c11, String str) {
        char c12 = c11 == 'L' ? 'M' : c11 == 'c' ? 'e' : c11;
        for (net.time4j.engine.p<?> pVar : set) {
            if (pVar.isDateElement() && pVar.getSymbol() == c12 && (c12 != 'M' || !pVar.name().equals("MONTH_AS_NUMBER"))) {
                return pVar;
            }
        }
        if (c11 == 'y' && str.equals("net.time4j.PlainDate")) {
            return net.time4j.g0.f41294p;
        }
        throw new IllegalArgumentException("Cannot find any chronological date element for symbol " + c11 + " in \"" + str + "\".");
    }

    private static net.time4j.engine.p<?> findDynamicElement(net.time4j.engine.w<?> wVar, Locale locale, int i11) {
        net.time4j.engine.p<?> findDynamicElement = findDynamicElement(wVar, locale, i11, false);
        return findDynamicElement == null ? findDynamicElement(wVar, locale, i11, true) : findDynamicElement;
    }

    private static net.time4j.engine.p<Integer> findEthiopianHour(net.time4j.engine.w<?> wVar) {
        for (net.time4j.engine.r rVar : wVar.r()) {
            for (net.time4j.engine.p<?> pVar : rVar.b(Locale.ROOT, net.time4j.format.a.f())) {
                if (pVar.name().equals("ETHIOPIAN_HOUR")) {
                    return (net.time4j.engine.p) cast(pVar);
                }
            }
        }
        return null;
    }

    private Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> general(c.d<?> dVar, net.time4j.engine.w<?> wVar, char c11, int i11, Locale locale) {
        net.time4j.format.t<?> tVar;
        net.time4j.engine.p<Integer> pVar;
        net.time4j.format.v vVar;
        net.time4j.format.v vVar2;
        net.time4j.format.v vVar3;
        if (c11 == 'g') {
            dVar.q(net.time4j.engine.z.MODIFIED_JULIAN_DATE, i11, 18, x.SHOW_WHEN_NEGATIVE);
            return Collections.emptyMap();
        } else if (c11 == 'G' && wVar == net.time4j.g0.r0()) {
            return cldrISO(dVar, wVar, locale, c11, i11, false);
        } else {
            Set<net.time4j.engine.p<?>> elements = getElements(wVar, c11, locale);
            String name = dVar.P().p().getName();
            net.time4j.engine.p<?> find = find(elements, c11, name);
            if (Integer.class.isAssignableFrom(find.getType())) {
                tVar = find instanceof k30.a ? (net.time4j.format.t) cast(find) : null;
                pVar = (net.time4j.engine.p) cast(find);
            } else if (find instanceof net.time4j.format.t) {
                tVar = (net.time4j.format.t) cast(find);
                pVar = null;
            } else {
                throw new IllegalStateException("Implementation error: " + find + " in \"" + name + "\"");
            }
            if (c11 == 'L') {
                dVar.b0(net.time4j.format.a.f41000h, net.time4j.format.m.STANDALONE);
                addMonth(dVar, i11, tVar);
                dVar.L();
            } else if (c11 == 'M') {
                addMonth(dVar, i11, tVar);
            } else if (c11 != 'U') {
                boolean z11 = true;
                if (c11 != 'W') {
                    if (c11 == 'r') {
                        dVar.b0(net.time4j.format.a.f41004l, net.time4j.format.j.ARABIC);
                        dVar.Z(net.time4j.format.a.f41005m, '0');
                        dVar.E(pVar, i11, true);
                        dVar.L();
                        dVar.L();
                    } else if (c11 == 'w') {
                        addNumber(pVar, c11, dVar, i11, false);
                    } else if (c11 != 'y') {
                        switch (c11) {
                            case 'D':
                                if (i11 < 3) {
                                    dVar.j(pVar, i11, 3);
                                    break;
                                } else if (i11 == 3) {
                                    dVar.g(pVar, i11);
                                    break;
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters (D): " + i11);
                                }
                            case 'E':
                                if (i11 <= 3) {
                                    vVar2 = net.time4j.format.v.ABBREVIATED;
                                } else if (i11 == 4) {
                                    vVar2 = net.time4j.format.v.WIDE;
                                } else if (i11 == 5) {
                                    vVar2 = net.time4j.format.v.NARROW;
                                } else if (i11 == 6) {
                                    vVar2 = net.time4j.format.v.SHORT;
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters (E): " + i11);
                                }
                                dVar.b0(net.time4j.format.a.f40999g, vVar2);
                                dVar.A(tVar);
                                dVar.L();
                                break;
                            case 'F':
                                if (i11 == 1) {
                                    dVar.g(pVar, i11);
                                    break;
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters (F): " + i11);
                                }
                            case 'G':
                                if (i11 <= 3) {
                                    vVar3 = net.time4j.format.v.ABBREVIATED;
                                } else if (i11 == 4) {
                                    vVar3 = net.time4j.format.v.WIDE;
                                } else if (i11 == 5) {
                                    vVar3 = net.time4j.format.v.NARROW;
                                } else {
                                    throw new IllegalArgumentException("Too many pattern letters (G): " + i11);
                                }
                                dVar.b0(net.time4j.format.a.f40999g, vVar3);
                                dVar.A(tVar);
                                dVar.L();
                                break;
                            default:
                                switch (c11) {
                                    case 'c':
                                        if (i11 != 2) {
                                            dVar.b0(net.time4j.format.a.f41000h, net.time4j.format.m.STANDALONE);
                                            if (i11 == 1) {
                                                dVar.h((net.time4j.engine.p) cast(find), 1);
                                            } else {
                                                general(dVar, wVar, 'E', i11, locale);
                                            }
                                            dVar.L();
                                            break;
                                        } else {
                                            throw new IllegalArgumentException("Invalid pattern count of 2 for symbol 'c'.");
                                        }
                                    case 'd':
                                        if (pVar != null) {
                                            addNumber(pVar, c11, dVar, i11, false);
                                            break;
                                        } else if (i11 <= 2) {
                                            dVar.a0(k30.a.f34354c1, i11);
                                            dVar.A(tVar);
                                            dVar.L();
                                            break;
                                        } else {
                                            throw new IllegalArgumentException("Too many pattern letters for day-of-month: " + i11);
                                        }
                                    case 'e':
                                        if (i11 <= 2) {
                                            dVar.h((net.time4j.engine.p) cast(find), i11);
                                            break;
                                        } else {
                                            general(dVar, wVar, 'E', i11, locale);
                                            break;
                                        }
                                    default:
                                        throw new IllegalArgumentException("Unsupported pattern symbol: " + c11);
                                }
                        }
                    } else {
                        if (locale.getLanguage().equals("am") && getCalendarType(wVar).equals("ethiopic")) {
                            dVar.b0(net.time4j.format.a.f41004l, net.time4j.format.j.ETHIOPIC);
                        } else {
                            z11 = false;
                        }
                        if (i11 == 2) {
                            dVar.D(pVar);
                        } else {
                            dVar.E(pVar, i11, false);
                        }
                        if (z11) {
                            dVar.L();
                        }
                    }
                } else if (i11 == 1) {
                    dVar.g(pVar, 1);
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (W): " + i11);
                }
            } else if (tVar != null) {
                if (i11 <= 3) {
                    vVar = net.time4j.format.v.ABBREVIATED;
                } else if (i11 == 4) {
                    vVar = net.time4j.format.v.WIDE;
                } else if (i11 == 5) {
                    vVar = net.time4j.format.v.NARROW;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters (U): " + i11);
                }
                dVar.b0(net.time4j.format.a.f40999g, vVar);
                dVar.A(tVar);
                dVar.L();
            } else {
                throw new IllegalStateException("Implementation error: " + find + " in \"" + name + "\"");
            }
            return Collections.emptyMap();
        }
    }

    private static String getCalendarType(net.time4j.engine.w<?> wVar) {
        net.time4j.format.c cVar = (net.time4j.format.c) wVar.p().getAnnotation(net.time4j.format.c.class);
        return cVar == null ? "iso8601" : cVar.value();
    }

    private static net.time4j.engine.w<?> getEffectiveChronology(c.d<?> dVar) {
        return dVar.P();
    }

    private static Set<net.time4j.engine.p<?>> getElements(net.time4j.engine.w<?> wVar, char c11, Locale locale) {
        if (c11 != 'w' && c11 != 'W' && c11 != 'e' && c11 != 'c') {
            return wVar.t();
        }
        for (net.time4j.engine.r rVar : wVar.r()) {
            for (net.time4j.engine.p<?> pVar : rVar.b(locale, net.time4j.format.a.f())) {
                if (((c11 == 'e' || c11 == 'c') && pVar.name().equals("LOCAL_DAY_OF_WEEK")) || ((c11 == 'w' && pVar.name().equals("WEEK_OF_YEAR")) || (c11 == 'W' && pVar.name().equals("WEEK_OF_MONTH")))) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(pVar);
                    return hashSet;
                }
            }
        }
        return Collections.emptySet();
    }

    private static net.time4j.format.v getPeriodWidth(int i11) {
        if (i11 <= 3) {
            return net.time4j.format.v.ABBREVIATED;
        }
        if (i11 == 4) {
            return net.time4j.format.v.WIDE;
        }
        if (i11 == 5) {
            return net.time4j.format.v.NARROW;
        }
        throw new IllegalArgumentException("Too many pattern letters: " + i11);
    }

    private static boolean isGeneralSymbol(char c11) {
        if (c11 == 'L' || c11 == 'M' || c11 == 'U' || c11 == 'W' || c11 == 'g' || c11 == 'r' || c11 == 'w' || c11 == 'y') {
            return true;
        }
        switch (c11) {
            case 'D':
            case 'E':
            case 'F':
            case 'G':
                return true;
            default:
                switch (c11) {
                    case 'c':
                    case 'd':
                    case 'e':
                        return true;
                    default:
                        return false;
                }
        }
    }

    private static boolean isISO(net.time4j.engine.w<?> wVar) {
        return getCalendarType(wVar).equals("iso8601");
    }

    private Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> sdf(c.d<?> dVar, net.time4j.engine.w<?> wVar, Locale locale, char c11, int i11) {
        if (c11 != 'B' && c11 != 'O' && c11 != 'Q') {
            if (c11 == 'S') {
                dVar.g(h0.F, i11);
            } else if (c11 == 'Z') {
                addOffset(dVar, c11, 2, false);
            } else if (c11 != 'e' && c11 != 'g') {
                if (c11 == 'u') {
                    dVar.h(net.time4j.g0.f41300z, i11);
                } else if (c11 != 'x' && c11 != 'b' && c11 != 'c' && c11 != 'q' && c11 != 'r') {
                    switch (c11) {
                        case 'U':
                        case 'V':
                            break;
                        case 'W':
                            dVar.g(z0.j(locale).a(), i11);
                            break;
                        case 'X':
                            if (i11 < 4) {
                                return cldrISO(dVar, wVar, locale, 'X', i11, true);
                            }
                            throw new IllegalArgumentException("Too many pattern letters (X): " + i11);
                        default:
                            return cldrISO(dVar, wVar, locale, c11, i11, true);
                    }
                }
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException("CLDR pattern symbol not supported in SimpleDateFormat-style: " + c11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<net.time4j.engine.p<?>, net.time4j.engine.p<?>> registerSymbol(c.d<?> dVar, Locale locale, char c11, int i11) {
        net.time4j.engine.w<?> effectiveChronology = getEffectiveChronology(dVar);
        int i12 = a.f41244a[ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 == 5) {
                            return dynamic(dVar, c11, i11, locale);
                        }
                        throw new UnsupportedOperationException(name());
                    }
                    Class<?> p11 = effectiveChronology.p();
                    if (!net.time4j.engine.m.class.isAssignableFrom(p11) && !net.time4j.engine.l.class.isAssignableFrom(p11)) {
                        throw new IllegalArgumentException("No calendar chronology.");
                    }
                    return general(dVar, effectiveChronology, c11, i11, locale);
                }
                return cldr24(dVar, locale, c11, i11);
            }
            return sdf(dVar, effectiveChronology, locale, c11, i11);
        }
        return cldr(dVar, locale, c11, i11);
    }

    private static net.time4j.engine.p<?> findDynamicElement(net.time4j.engine.w<?> wVar, Locale locale, int i11, boolean z11) {
        if (z11) {
            i11 = capitalized(i11);
        }
        for (net.time4j.engine.p<?> pVar : wVar.t()) {
            int symbol = pVar.getSymbol();
            if (z11) {
                symbol = capitalized(symbol);
                continue;
            }
            if (symbol == i11) {
                return pVar;
            }
        }
        for (net.time4j.engine.r rVar : wVar.r()) {
            for (net.time4j.engine.p<?> pVar2 : rVar.b(locale, net.time4j.format.a.f())) {
                int symbol2 = pVar2.getSymbol();
                if (z11) {
                    symbol2 = capitalized(symbol2);
                    continue;
                }
                if (symbol2 == i11) {
                    return pVar2;
                }
            }
        }
        return null;
    }

    private static <V extends Enum<V>> void addMonth(c.d<?> dVar, int i11, net.time4j.format.t<?> tVar) {
        if (i11 == 1 || i11 == 2) {
            if (Enum.class.isAssignableFrom(tVar.getType())) {
                net.time4j.engine.p<V> pVar = (net.time4j.engine.p) cast(tVar);
                if (i11 == 1) {
                    dVar.u(pVar, 1, 2);
                    return;
                } else if (i11 == 2) {
                    dVar.h(pVar, 2);
                    return;
                } else {
                    return;
                }
            }
            dVar.a0(k30.a.f34354c1, i11);
            dVar.A(tVar);
            dVar.L();
        } else if (i11 == 3) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.ABBREVIATED);
            dVar.A(tVar);
            dVar.L();
        } else if (i11 == 4) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.WIDE);
            dVar.A(tVar);
            dVar.L();
        } else if (i11 == 5) {
            dVar.b0(net.time4j.format.a.f40999g, net.time4j.format.v.NARROW);
            dVar.A(tVar);
            dVar.L();
        } else {
            throw new IllegalArgumentException("Too many pattern letters for month: " + i11);
        }
    }
}