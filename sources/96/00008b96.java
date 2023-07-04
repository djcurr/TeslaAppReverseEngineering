package net.time4j.format;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import net.time4j.engine.j0;

/* loaded from: classes5.dex */
public abstract class w<U, S extends j0<U>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<b<U>> f41262a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class b<U> {
        b(int i11) {
        }

        abstract int a();

        abstract b<U> b(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c<U> extends b<U> {

        /* renamed from: a  reason: collision with root package name */
        private final int f41263a;

        /* renamed from: b  reason: collision with root package name */
        private final U f41264b;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f41263a;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new c(i11, this.f41263a, this.f41264b);
        }

        private c(int i11, int i12, U u11) {
            super(i11);
            if (i12 >= 1 && i12 <= 9) {
                this.f41263a = i12;
                this.f41264b = u11;
                return;
            }
            throw new IllegalArgumentException("Fraction width out of bounds: " + i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class e<U> extends b<U> {

        /* renamed from: a  reason: collision with root package name */
        private final int f41266a;

        /* renamed from: b  reason: collision with root package name */
        private final int f41267b;

        /* renamed from: c  reason: collision with root package name */
        private final U f41268c;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f41266a;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new e(i11, this.f41266a, this.f41267b, this.f41268c);
        }

        private e(int i11, int i12, int i13, U u11) {
            super(i11);
            if (i12 < 1 || i12 > 18) {
                throw new IllegalArgumentException("Min width out of bounds: " + i12);
            } else if (i13 < i12) {
                throw new IllegalArgumentException("Max width smaller than min width.");
            } else {
                if (i13 <= 18) {
                    Objects.requireNonNull(u11, "Missing unit.");
                    this.f41266a = i12;
                    this.f41267b = i13;
                    this.f41268c = u11;
                    return;
                }
                throw new IllegalArgumentException("Max width out of bounds: " + i13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class f<U> extends b<U> {

        /* renamed from: a  reason: collision with root package name */
        private final List<b<U>> f41269a;

        @Override // net.time4j.format.w.b
        int a() {
            return 0;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            ArrayList arrayList = new ArrayList(this.f41269a);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                arrayList.set(size, bVar.b(i11));
                i11 += bVar.a();
            }
            return new f(arrayList);
        }

        private f(List<b<U>> list) {
            super(0);
            if (!list.isEmpty()) {
                b<U> bVar = list.get(0);
                g gVar = g.f41270a;
                if (bVar != gVar && list.get(list.size() - 1) != gVar) {
                    this.f41269a = Collections.unmodifiableList(list);
                    return;
                }
                throw new IllegalArgumentException("Optional section must not start or end with an or-operator.");
            }
            throw new IllegalArgumentException("Optional section is empty.");
        }
    }

    /* loaded from: classes5.dex */
    private static class g<U> extends b<U> {

        /* renamed from: a  reason: collision with root package name */
        static final g f41270a = new g();

        private g() {
            super(0);
        }

        static <U> b<U> c() {
            return f41270a;
        }

        @Override // net.time4j.format.w.b
        int a() {
            return 0;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class h<U> extends b<U> {

        /* renamed from: a  reason: collision with root package name */
        private final e<U> f41271a;

        /* renamed from: b  reason: collision with root package name */
        private final b<U> f41272b;

        /* renamed from: c  reason: collision with root package name */
        private final p f41273c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<n, String> f41274d;

        /* renamed from: e  reason: collision with root package name */
        private final int f41275e;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f41275e;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new h(i11, this.f41271a, this.f41272b, this.f41273c, this.f41274d, this.f41275e);
        }

        private h(U u11, String str, p pVar, Map<n, String> map) {
            super(0);
            this.f41271a = new e<>(0, 1, 18, u11);
            this.f41272b = new d(str, true);
            this.f41273c = pVar;
            this.f41274d = map;
            int i11 = Integer.MAX_VALUE;
            for (String str2 : map.values()) {
                if (str2.length() < i11) {
                    i11 = str2.length();
                }
            }
            this.f41275e = i11;
        }

        private h(int i11, e<U> eVar, b<U> bVar, p pVar, Map<n, String> map, int i12) {
            super(i11);
            this.f41271a = eVar;
            this.f41272b = bVar;
            this.f41273c = pVar;
            this.f41274d = map;
            this.f41275e = i12;
        }
    }

    /* loaded from: classes5.dex */
    private static class i<U> extends b<U> {

        /* renamed from: a  reason: collision with root package name */
        private final char f41276a;

        /* renamed from: b  reason: collision with root package name */
        private final char f41277b;

        @Override // net.time4j.format.w.b
        int a() {
            return 1;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new i(i11, this.f41276a, this.f41277b);
        }

        private i(char c11, char c12) {
            this(0, c11, c12);
        }

        private i(int i11, char c11, char c12) {
            super(i11);
            this.f41276a = c11;
            this.f41277b = c12;
        }
    }

    /* loaded from: classes5.dex */
    private static class j<U> extends b<U> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f41278a;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f41278a ? 1 : 0;
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new j(i11, this.f41278a);
        }

        private j(boolean z11) {
            super(0);
            this.f41278a = z11;
        }

        private j(int i11, boolean z11) {
            super(i11);
            this.f41278a = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w(Class<U> cls, String str) {
        int i11;
        Objects.requireNonNull(cls, "Missing unit type.");
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ArrayList());
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            char charAt = str.charAt(i12);
            if (charAt == '#') {
                i13++;
            } else if (g(charAt)) {
                int i14 = i12 + 1;
                while (i14 < length && str.charAt(i14) == charAt) {
                    i14++;
                }
                d(charAt, i14 - i12, i13, arrayList);
                i12 = i14 - 1;
                i13 = 0;
            } else if (i13 > 0) {
                throw new IllegalArgumentException("Char # must be followed by unit symbol.");
            } else {
                if (charAt == '\'') {
                    int i15 = i12 + 1;
                    i11 = i15;
                    while (i11 < length) {
                        if (str.charAt(i11) == '\'') {
                            int i16 = i11 + 1;
                            if (i16 >= length || str.charAt(i16) != '\'') {
                                break;
                            }
                            i11 = i16;
                        }
                        i11++;
                    }
                    if (i11 >= length) {
                        throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                    } else if (i15 == i11) {
                        a(CoreConstants.SINGLE_QUOTE_CHAR, arrayList);
                    } else {
                        b(str.substring(i15, i11).replace("''", "'"), arrayList);
                    }
                } else if (charAt == '[') {
                    i(arrayList);
                } else if (charAt == ']') {
                    e(arrayList);
                } else if (charAt == '.') {
                    h(arrayList).add(new i((char) CoreConstants.DOT, (char) CoreConstants.COMMA_CHAR));
                } else if (charAt == ',') {
                    h(arrayList).add(new i((char) CoreConstants.COMMA_CHAR, (char) CoreConstants.DOT));
                } else if (charAt == '-') {
                    h(arrayList).add(new j(false));
                } else if (charAt == '+') {
                    h(arrayList).add(new j(true));
                } else if (charAt == '{') {
                    int i17 = i12 + 1;
                    i11 = i17;
                    while (i11 < length && str.charAt(i11) != '}') {
                        i11++;
                    }
                    c(str.substring(i17, i11), arrayList);
                } else if (charAt == '|') {
                    h(arrayList).add(g.c());
                } else {
                    a(charAt, arrayList);
                }
                i12 = i11;
            }
            i12++;
        }
        if (arrayList.size() <= 1) {
            if (!arrayList.isEmpty()) {
                List<b<U>> list = arrayList.get(0);
                if (!list.isEmpty()) {
                    b<U> bVar = list.get(0);
                    g gVar = g.f41270a;
                    if (bVar != gVar && list.get(list.size() - 1) != gVar) {
                        int size = list.size();
                        int a11 = list.get(size - 1).a();
                        for (int i18 = size - 2; i18 >= 0; i18--) {
                            b<U> bVar2 = list.get(i18);
                            if (bVar2 == g.f41270a) {
                                a11 = 0;
                            } else {
                                list.set(i18, bVar2.b(a11));
                                a11 += bVar2.a();
                            }
                        }
                        this.f41262a = Collections.unmodifiableList(list);
                        return;
                    }
                    throw new IllegalArgumentException("Pattern must not start or end with an or-operator.");
                }
                throw new IllegalArgumentException("Missing format pattern.");
            }
            throw new IllegalArgumentException("Empty or invalid pattern.");
        }
        throw new IllegalArgumentException("Open square bracket without closing one.");
    }

    private void a(char c11, List<List<b<U>>> list) {
        b(String.valueOf(c11), list);
    }

    private void b(String str, List<List<b<U>>> list) {
        h(list).add(new d(str));
    }

    private void c(String str, List<List<b<U>>> list) {
        Locale locale;
        String[] split = str.split(":");
        if (split.length <= 9 && split.length >= 4) {
            if (split[0].length() == 1) {
                U f11 = f(split[0].charAt(0));
                String[] split2 = split[2].split("-|_");
                String str2 = split2[0];
                if (split2.length > 1) {
                    String str3 = split2[1];
                    if (split2.length > 2) {
                        String str4 = split2[2];
                        if (split2.length <= 3) {
                            locale = new Locale(str2, str3, str4);
                        } else {
                            throw new IllegalArgumentException("Plural information has wrong locale: " + str);
                        }
                    } else {
                        locale = new Locale(str2, str3);
                    }
                } else {
                    locale = new Locale(str2);
                }
                EnumMap enumMap = new EnumMap(n.class);
                p f12 = p.f(locale, k.CARDINALS);
                for (int i11 = 3; i11 < split.length; i11++) {
                    String[] split3 = split[i11].split("=");
                    if (split3.length == 2) {
                        enumMap.put((EnumMap) n.valueOf(split3[0]), (n) split3[1]);
                    } else {
                        throw new IllegalArgumentException("Plural information has wrong format: " + str);
                    }
                }
                if (!enumMap.isEmpty()) {
                    if (enumMap.containsKey(n.OTHER)) {
                        h(list).add(new h(f11, split[1], f12, enumMap));
                        return;
                    }
                    throw new IllegalArgumentException("Missing plural category OTHER: " + str);
                }
                throw new IllegalArgumentException("Missing plural forms: " + str);
            }
            throw new IllegalArgumentException("Plural information has wrong symbol: " + str);
        }
        throw new IllegalArgumentException("Plural information has wrong format: " + str);
    }

    private void d(char c11, int i11, int i12, List<List<b<U>>> list) {
        U f11 = f(c11);
        List<b<U>> list2 = list.get(list.size() - 1);
        if (c11 != 'f') {
            list2.add(new e(0, i11, i11 + i12, f11));
        } else if (i12 <= 0) {
            list2.add(new c(0, i11, f(c11)));
        } else {
            throw new IllegalArgumentException("Combination of # and f-symbol not allowed.");
        }
    }

    private static <U> void e(List<List<b<U>>> list) {
        int size = list.size() - 1;
        if (size >= 1) {
            list.get(size - 1).add(new f(list.remove(size)));
            return;
        }
        throw new IllegalArgumentException("Closing square bracket without open one.");
    }

    private static boolean g(char c11) {
        return (c11 >= 'A' && c11 <= 'Z') || (c11 >= 'a' && c11 <= 'z');
    }

    private static <U> List<b<U>> h(List<List<b<U>>> list) {
        return list.get(list.size() - 1);
    }

    private static <U> void i(List<List<b<U>>> list) {
        list.add(new ArrayList());
    }

    protected abstract U f(char c11);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d<U> extends b<U> {

        /* renamed from: a  reason: collision with root package name */
        private final String f41265a;

        @Override // net.time4j.format.w.b
        int a() {
            return this.f41265a.length();
        }

        @Override // net.time4j.format.w.b
        b<U> b(int i11) {
            return new d(i11, this.f41265a);
        }

        private d(String str) {
            this(str, false);
        }

        private d(String str, boolean z11) {
            super(0);
            if (!z11 && str.isEmpty()) {
                throw new IllegalArgumentException("Literal is empty.");
            }
            this.f41265a = str;
        }

        private d(int i11, String str) {
            super(i11);
            this.f41265a = str;
        }
    }
}