package com.facebook.hermes.intl;

import com.facebook.hermes.intl.LocaleIdTokenizer;
import com.facebook.hermes.intl.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class e {
    private static void a(String str, j.a aVar) {
        ArrayList<String> arrayList = aVar.f11231d;
        if (arrayList != null) {
            int binarySearch = Collections.binarySearch(arrayList, str);
            if (binarySearch < 0) {
                aVar.f11231d.add((binarySearch * (-1)) - 1, str);
                return;
            }
            throw new JSRangeErrorException("Duplicate variant");
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        aVar.f11231d = arrayList2;
        arrayList2.add(str);
    }

    public static String b(String str) {
        return ye.e.b(str).g();
    }

    static boolean c(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, LocaleIdTokenizer.a aVar, boolean z11, j jVar) {
        if (z11 && aVar.d()) {
            j(charSequence, localeIdTokenizer, aVar, jVar);
            return true;
        } else if (aVar.a()) {
            if (!z11) {
                d(charSequence, aVar, localeIdTokenizer, jVar);
                return true;
            }
            throw new JSRangeErrorException(String.format("Extension singletons in transformed extension language tag: %s", charSequence));
        } else {
            return false;
        }
    }

    static void d(CharSequence charSequence, LocaleIdTokenizer.a aVar, LocaleIdTokenizer localeIdTokenizer, j jVar) {
        if (localeIdTokenizer.a()) {
            char charAt = aVar.toString().charAt(0);
            if (charAt == 'u') {
                l(charSequence, localeIdTokenizer, jVar);
                return;
            } else if (charAt == 't') {
                k(charSequence, localeIdTokenizer, jVar);
                return;
            } else if (charAt == 'x') {
                i(charSequence, localeIdTokenizer, jVar);
                return;
            } else {
                h(charSequence, localeIdTokenizer, jVar, charAt);
                return;
            }
        }
        throw new JSRangeErrorException("Extension sequence expected.");
    }

    static void e(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, LocaleIdTokenizer.a aVar, boolean z11, j jVar) {
        j.a aVar2 = new j.a();
        if (z11) {
            jVar.f11224d = aVar2;
        } else {
            jVar.f11221a = aVar2;
        }
        try {
            if (aVar.i()) {
                aVar2.f11228a = aVar.m();
                if (localeIdTokenizer.a()) {
                    LocaleIdTokenizer.a c11 = localeIdTokenizer.c();
                    if (c(charSequence, localeIdTokenizer, c11, z11, jVar)) {
                        return;
                    }
                    if (c11.k()) {
                        aVar2.f11229b = c11.n();
                        if (!localeIdTokenizer.a()) {
                            return;
                        }
                        c11 = localeIdTokenizer.c();
                    }
                    if (c11.j()) {
                        aVar2.f11230c = c11.o();
                        if (!localeIdTokenizer.a()) {
                            return;
                        }
                        c11 = localeIdTokenizer.c();
                    }
                    while (!c(charSequence, localeIdTokenizer, c11, z11, jVar)) {
                        if (c11.l()) {
                            a(c11.toString(), aVar2);
                            if (!localeIdTokenizer.a()) {
                                return;
                            }
                            c11 = localeIdTokenizer.c();
                        } else {
                            throw new JSRangeErrorException(String.format("Unknown token [%s] found in locale id: %s", c11.toString(), charSequence));
                        }
                    }
                    return;
                }
                return;
            }
            throw new JSRangeErrorException(String.format("Language subtag expected at %s: %s", aVar.toString(), charSequence));
        } catch (LocaleIdTokenizer.LocaleIdSubtagIterationFailed unused) {
            throw new JSRangeErrorException(String.format("Locale Identifier subtag iteration failed: %s", charSequence));
        }
    }

    public static j f(String str) {
        int binarySearch;
        String[] strArr = d.f11198a;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str.toString())) >= 0) {
            str = d.f11199b[binarySearch];
        }
        String lowerCase = str.toLowerCase();
        return g(lowerCase, new LocaleIdTokenizer(lowerCase));
    }

    static j g(String str, LocaleIdTokenizer localeIdTokenizer) {
        j jVar = new j();
        try {
            if (localeIdTokenizer.a()) {
                e(str, localeIdTokenizer, localeIdTokenizer.c(), false, jVar);
                return jVar;
            }
            throw new JSRangeErrorException(String.format("Language subtag not found: %s", str));
        } catch (LocaleIdTokenizer.LocaleIdSubtagIterationFailed unused) {
            throw new JSRangeErrorException(String.format("Locale Identifier subtag iteration failed: %s", str));
        }
    }

    static void h(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, j jVar, char c11) {
        if (localeIdTokenizer.a()) {
            LocaleIdTokenizer.a c12 = localeIdTokenizer.c();
            if (jVar.f11226f == null) {
                jVar.f11226f = new TreeMap<>();
            }
            ArrayList<String> arrayList = new ArrayList<>();
            jVar.f11226f.put(new Character(c11), arrayList);
            while (c12.b()) {
                arrayList.add(c12.toString());
                if (!localeIdTokenizer.a()) {
                    return;
                }
                c12 = localeIdTokenizer.c();
            }
            if (c12.a()) {
                d(charSequence, c12, localeIdTokenizer, jVar);
                return;
            }
            throw new JSRangeErrorException("Malformed sequence expected.");
        }
        throw new JSRangeErrorException("Extension sequence expected.");
    }

    static void i(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, j jVar) {
        if (localeIdTokenizer.a()) {
            LocaleIdTokenizer.a c11 = localeIdTokenizer.c();
            if (jVar.f11227g == null) {
                jVar.f11227g = new ArrayList<>();
            }
            while (c11.c()) {
                jVar.f11227g.add(c11.toString());
                if (!localeIdTokenizer.a()) {
                    return;
                }
                c11 = localeIdTokenizer.c();
            }
            throw new JSRangeErrorException("Tokens are not expected after pu extension.");
        }
        throw new JSRangeErrorException("Extension sequence expected.");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void j(java.lang.CharSequence r4, com.facebook.hermes.intl.LocaleIdTokenizer r5, com.facebook.hermes.intl.LocaleIdTokenizer.a r6, com.facebook.hermes.intl.j r7) {
        /*
            boolean r0 = r6.d()
            if (r0 == 0) goto L6d
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r0 = r7.f11225e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5d
            if (r0 != 0) goto L15
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r7.f11225e = r0
        L15:
            java.lang.String r6 = r6.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r3 = r7.f11225e
            r3.put(r6, r0)
            boolean r6 = r5.a()
            if (r6 == 0) goto L4d
            com.facebook.hermes.intl.LocaleIdTokenizer$a r6 = r5.c()
        L2d:
            boolean r3 = r6.e()
            if (r3 == 0) goto L46
            java.lang.String r6 = r6.toString()
            r0.add(r6)
            boolean r6 = r5.a()
            if (r6 != 0) goto L41
            return
        L41:
            com.facebook.hermes.intl.LocaleIdTokenizer$a r6 = r5.c()
            goto L2d
        L46:
            boolean r0 = r6.d()
            if (r0 != 0) goto L15
            goto L6d
        L4d:
            com.facebook.hermes.intl.JSRangeErrorException r5 = new com.facebook.hermes.intl.JSRangeErrorException
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            java.lang.String r4 = "Malformated transformed key in : %s"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r5.<init>(r4)
            throw r5
        L5d:
            com.facebook.hermes.intl.JSRangeErrorException r5 = new com.facebook.hermes.intl.JSRangeErrorException
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            java.lang.String r4 = "Duplicate transformed extension sequence in [%s]"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            r5.<init>(r4)
            throw r5
        L6d:
            boolean r0 = r6.a()
            if (r0 == 0) goto L77
            d(r4, r6, r5, r7)
            return
        L77:
            com.facebook.hermes.intl.JSRangeErrorException r4 = new com.facebook.hermes.intl.JSRangeErrorException
            java.lang.String r5 = "Malformed extension sequence."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.e.j(java.lang.CharSequence, com.facebook.hermes.intl.LocaleIdTokenizer, com.facebook.hermes.intl.LocaleIdTokenizer$a, com.facebook.hermes.intl.j):void");
    }

    static void k(CharSequence charSequence, LocaleIdTokenizer localeIdTokenizer, j jVar) {
        if (localeIdTokenizer.a()) {
            LocaleIdTokenizer.a c11 = localeIdTokenizer.c();
            if (c11.i()) {
                e(charSequence, localeIdTokenizer, c11, true, jVar);
                return;
            } else if (c11.d()) {
                j(charSequence, localeIdTokenizer, c11, jVar);
                return;
            } else {
                throw new JSRangeErrorException(String.format("Unexpected token [%s] in transformed extension sequence [%s]", c11.toString(), charSequence));
            }
        }
        throw new JSRangeErrorException("Extension sequence expected.");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void l(java.lang.CharSequence r3, com.facebook.hermes.intl.LocaleIdTokenizer r4, com.facebook.hermes.intl.j r5) {
        /*
            boolean r0 = r4.a()
            if (r0 == 0) goto La5
            com.facebook.hermes.intl.LocaleIdTokenizer$a r0 = r4.c()
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f11222b
            if (r1 != 0) goto L93
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r5.f11223c
            if (r1 != 0) goto L93
        L12:
            boolean r1 = r0.f()
            if (r1 == 0) goto L38
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f11222b
            if (r1 != 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f11222b = r1
        L23:
            java.util.ArrayList<java.lang.CharSequence> r1 = r5.f11222b
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            boolean r0 = r4.a()
            if (r0 != 0) goto L33
            return
        L33:
            com.facebook.hermes.intl.LocaleIdTokenizer$a r0 = r4.c()
            goto L12
        L38:
            boolean r1 = r0.g()
            if (r1 == 0) goto L81
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r1 = r5.f11223c
            if (r1 != 0) goto L49
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r5.f11223c = r1
        L49:
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.TreeMap<java.lang.String, java.util.ArrayList<java.lang.String>> r2 = r5.f11223c
            r2.put(r0, r1)
            boolean r0 = r4.a()
            if (r0 != 0) goto L5e
            return
        L5e:
            com.facebook.hermes.intl.LocaleIdTokenizer$a r0 = r4.c()
        L62:
            boolean r2 = r0.h()
            if (r2 == 0) goto L7b
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            boolean r0 = r4.a()
            if (r0 != 0) goto L76
            return
        L76:
            com.facebook.hermes.intl.LocaleIdTokenizer$a r0 = r4.c()
            goto L62
        L7b:
            boolean r1 = r0.g()
            if (r1 != 0) goto L49
        L81:
            boolean r1 = r0.a()
            if (r1 == 0) goto L8b
            d(r3, r0, r4, r5)
            return
        L8b:
            com.facebook.hermes.intl.JSRangeErrorException r3 = new com.facebook.hermes.intl.JSRangeErrorException
            java.lang.String r4 = "Malformed sequence expected."
            r3.<init>(r4)
            throw r3
        L93:
            com.facebook.hermes.intl.JSRangeErrorException r4 = new com.facebook.hermes.intl.JSRangeErrorException
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            r5[r0] = r3
            java.lang.String r3 = "Duplicate unicode extension sequence in [%s]"
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r4.<init>(r3)
            throw r4
        La5:
            com.facebook.hermes.intl.JSRangeErrorException r3 = new com.facebook.hermes.intl.JSRangeErrorException
            java.lang.String r4 = "Extension sequence expected."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.e.l(java.lang.CharSequence, com.facebook.hermes.intl.LocaleIdTokenizer, com.facebook.hermes.intl.j):void");
    }

    public static void m(StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        if (d.f11200c == null) {
            return;
        }
        if (stringBuffer.length() == 2) {
            strArr = d.f11200c;
            strArr2 = d.f11201d;
            strArr3 = d.f11204g;
            strArr4 = d.f11205h;
            strArr5 = d.f11206i;
            strArr6 = d.f11207j;
        } else {
            strArr = d.f11202e;
            strArr2 = d.f11203f;
            strArr3 = d.f11208k;
            strArr4 = d.f11209l;
            strArr5 = d.f11210m;
            strArr6 = d.f11211n;
        }
        int binarySearch = Arrays.binarySearch(strArr, stringBuffer.toString());
        if (binarySearch >= 0) {
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(strArr2[binarySearch]);
            return;
        }
        int binarySearch2 = Arrays.binarySearch(strArr3, stringBuffer.toString());
        if (binarySearch2 >= 0) {
            String str = strArr4[binarySearch2];
            String str2 = strArr5[binarySearch2];
            String str3 = strArr6[binarySearch2];
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append(str);
            if (stringBuffer2.length() == 0 && str2 != null) {
                stringBuffer2.append(str2);
            }
            if (stringBuffer3.length() != 0 || str3 == null) {
                return;
            }
            stringBuffer3.append(str3);
        }
    }

    public static String n(StringBuffer stringBuffer) {
        if (d.f11212o == null) {
            return stringBuffer.toString();
        }
        if (stringBuffer.length() == 2) {
            int binarySearch = Arrays.binarySearch(d.f11212o, stringBuffer.toString());
            if (binarySearch >= 0) {
                return d.f11213p[binarySearch];
            }
            return stringBuffer.toString();
        }
        int binarySearch2 = Arrays.binarySearch(d.f11214q, stringBuffer.toString());
        if (binarySearch2 >= 0) {
            return d.f11215r[binarySearch2];
        }
        return stringBuffer.toString();
    }
}