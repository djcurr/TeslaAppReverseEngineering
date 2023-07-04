package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class m implements h<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final char f41178a;

    /* renamed from: b  reason: collision with root package name */
    private final char f41179b;

    /* renamed from: c  reason: collision with root package name */
    private final String f41180c;

    /* renamed from: d  reason: collision with root package name */
    private final net.time4j.engine.c<Character> f41181d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f41182e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f41183f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f41184g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str) {
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            this.f41178a = charAt;
            this.f41179b = charAt;
            this.f41181d = null;
            this.f41180c = str;
            if (charAt >= ' ') {
                boolean z11 = true;
                this.f41182e = true;
                this.f41183f = (str.length() == 1 && d(charAt)) ? z11 : false;
                this.f41184g = false;
                return;
            }
            throw new IllegalArgumentException("Literal must not start with non-printable char.");
        }
        throw new IllegalArgumentException("Missing literal.");
    }

    private static boolean a(char c11, char c12) {
        return c11 == c12 || Character.toUpperCase(c11) == Character.toUpperCase(c12) || Character.toLowerCase(c11) == Character.toLowerCase(c12);
    }

    private static boolean c(char c11) {
        return c11 == 8206 || c11 == 8207 || c11 == 1564;
    }

    private static boolean d(char c11) {
        return (Character.isLetter(c11) || Character.isDigit(c11) || c(c11)) ? false : true;
    }

    private void e(CharSequence charSequence, s sVar) {
        int f11 = sVar.f();
        sVar.k(f11, "Cannot parse: \"" + charSequence + "\" (expected: [" + this.f41180c + "], found: [" + charSequence.subSequence(f11, Math.min(this.f41180c.length() + f11, charSequence.length())) + "])");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (a(r2, r5) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(java.lang.CharSequence r9, net.time4j.format.expert.s r10, net.time4j.engine.d r11, boolean r12) {
        /*
            r8 = this;
            int r0 = r10.f()
            char r1 = r8.f41178a
            net.time4j.engine.c<java.lang.Character> r2 = r8.f41181d
            r3 = 0
            if (r2 == 0) goto L19
            java.lang.Character r1 = java.lang.Character.valueOf(r3)
            java.lang.Object r1 = r11.b(r2, r1)
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
        L19:
            int r2 = r9.length()
            r4 = 1
            if (r0 >= r2) goto L8d
            if (r1 == 0) goto L8d
            boolean r2 = java.lang.Character.isDigit(r1)
            if (r2 == 0) goto L2a
            goto L8d
        L2a:
            char r2 = r9.charAt(r0)
            char r5 = r8.f41179b
            net.time4j.engine.c<java.lang.Character> r6 = r8.f41181d
            if (r6 == 0) goto L60
            net.time4j.engine.c<java.lang.Character> r6 = net.time4j.format.a.f41007o
            java.lang.String r6 = r6.name()
            net.time4j.engine.c<java.lang.Character> r7 = r8.f41181d
            java.lang.String r7 = r7.name()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L60
            java.util.Locale r6 = java.util.Locale.ROOT
            net.time4j.engine.c<java.util.Locale> r7 = net.time4j.format.a.f40995c
            java.lang.Object r7 = r11.b(r7, r6)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L60
            r5 = 46
            r6 = 44
            if (r1 != r6) goto L5b
            goto L60
        L5b:
            if (r1 != r5) goto L5f
            r5 = r6
            goto L60
        L5f:
            r5 = r1
        L60:
            if (r2 == r1) goto L66
            if (r2 == r5) goto L66
            r6 = r4
            goto L67
        L66:
            r6 = r3
        L67:
            if (r6 == 0) goto L8b
            if (r12 == 0) goto L6e
            boolean r11 = r8.f41182e
            goto L7c
        L6e:
            net.time4j.engine.c<java.lang.Boolean> r12 = net.time4j.format.a.f41001i
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Object r11 = r11.b(r12, r7)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
        L7c:
            if (r11 == 0) goto L8b
            boolean r11 = a(r2, r1)
            if (r11 != 0) goto L8f
            boolean r11 = a(r2, r5)
            if (r11 == 0) goto L8b
            goto L8f
        L8b:
            r3 = r6
            goto L8f
        L8d:
            r2 = r3
            r3 = r4
        L8f:
            if (r3 == 0) goto Lba
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Cannot parse: \""
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "\" (expected: ["
            r11.append(r9)
            r11.append(r1)
            java.lang.String r9 = "], found: ["
            r11.append(r9)
            if (r2 == 0) goto Lad
            r11.append(r2)
        Lad:
            java.lang.String r9 = "])"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.k(r0, r9)
            goto Lbe
        Lba:
            int r0 = r0 + r4
            r10.l(r0)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.m.f(java.lang.CharSequence, net.time4j.format.expert.s, net.time4j.engine.d, boolean):void");
    }

    private void g(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, boolean z11) {
        boolean booleanValue;
        boolean q11;
        int f11 = sVar.f();
        if (z11) {
            booleanValue = this.f41182e;
        } else {
            booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue();
        }
        if (z11) {
            q11 = this.f41184g;
        } else {
            q11 = net.time4j.format.b.q((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT));
        }
        int h11 = h(charSequence, f11, this.f41180c, booleanValue, q11);
        if (h11 == -1) {
            e(charSequence, sVar);
        } else {
            sVar.l(f11 + h11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(CharSequence charSequence, int i11, CharSequence charSequence2, boolean z11, boolean z12) {
        char charAt;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length2; i13++) {
            char charAt2 = charSequence2.charAt(i13);
            if (!c(charAt2)) {
                if (z12) {
                    charAt = 0;
                    while (true) {
                        int i14 = i12 + i11;
                        if (i14 >= length) {
                            break;
                        }
                        charAt = charSequence.charAt(i14);
                        if (!c(charAt)) {
                            break;
                        }
                        i12++;
                    }
                } else {
                    int i15 = i12 + i11;
                    charAt = i15 < length ? charSequence.charAt(i15) : (char) 0;
                }
                if (i12 + i11 >= length) {
                    return -1;
                }
                i12++;
                if (z11) {
                    if (!a(charAt, charAt2)) {
                        return -1;
                    }
                } else if (charAt != charAt2) {
                    return -1;
                }
            }
        }
        if (z12) {
            while (true) {
                int i16 = i12 + i11;
                if (i16 >= length || !c(charSequence.charAt(i16))) {
                    break;
                }
                i12++;
            }
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        String str = this.f41180c;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length && Character.isDigit(this.f41180c.charAt(i12)); i12++) {
            i11++;
        }
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            net.time4j.engine.c<Character> cVar = this.f41181d;
            if (cVar != null) {
                return cVar.equals(mVar.f41181d);
            }
            String str = this.f41180c;
            return str == null ? mVar.f41180c == null && this.f41178a == mVar.f41178a && this.f41179b == mVar.f41179b : str.equals(mVar.f41180c) && this.f41183f == mVar.f41183f;
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<Void> getElement() {
        return null;
    }

    public int hashCode() {
        String name;
        net.time4j.engine.c<Character> cVar = this.f41181d;
        if (cVar == null) {
            name = this.f41180c;
            if (name == null) {
                name = "";
            }
        } else {
            name = cVar.name();
        }
        return name.hashCode() ^ this.f41178a;
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return this.f41180c != null && b() == this.f41180c.length();
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        if (z11 && this.f41183f) {
            int f11 = sVar.f();
            if (f11 < charSequence.length() && charSequence.charAt(f11) == this.f41178a) {
                sVar.l(f11 + 1);
            } else if (this.f41178a == '.' && ((Boolean) dVar.b(net.time4j.format.a.f41003k, Boolean.TRUE)).booleanValue()) {
            } else {
                e(charSequence, sVar);
            }
        } else if (this.f41180c == null) {
            f(charSequence, sVar, dVar, z11);
        } else {
            g(charSequence, sVar, dVar, z11);
        }
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) {
        net.time4j.engine.c<Character> cVar = this.f41181d;
        if (cVar != null) {
            appendable.append(((Character) dVar.b(cVar, null)).charValue());
            return 1;
        }
        String str = this.f41180c;
        if (str == null) {
            appendable.append(this.f41178a);
            return 1;
        }
        appendable.append(str);
        return this.f41180c.length();
    }

    @Override // net.time4j.format.expert.h
    public h<Void> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        boolean q11 = net.time4j.format.b.q((Locale) dVar.b(net.time4j.format.a.f40995c, Locale.ROOT));
        return new m(this.f41178a, this.f41179b, this.f41180c, this.f41181d, ((Boolean) dVar.b(net.time4j.format.a.f41001i, Boolean.TRUE)).booleanValue(), this.f41183f && !q11, q11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.class.getName());
        sb2.append("[literal=");
        if (this.f41181d != null) {
            sb2.append(CoreConstants.CURLY_LEFT);
            sb2.append(this.f41181d);
            sb2.append(CoreConstants.CURLY_RIGHT);
        } else {
            String str = this.f41180c;
            if (str == null) {
                sb2.append(this.f41178a);
                if (this.f41179b != this.f41178a) {
                    sb2.append(", alternative=");
                    sb2.append(this.f41179b);
                }
            } else {
                sb2.append(str);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<Void> withElement(net.time4j.engine.p<Void> pVar) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(char c11, char c12) {
        this.f41178a = c11;
        this.f41179b = c12;
        this.f41181d = null;
        this.f41180c = null;
        if (c11 >= ' ' && c12 >= ' ') {
            if (!Character.isDigit(c11) && !Character.isDigit(c12)) {
                this.f41182e = true;
                this.f41183f = false;
                this.f41184g = false;
                return;
            }
            throw new IllegalArgumentException("Literal must not be a decimal digit.");
        }
        throw new IllegalArgumentException("Literal must not start with non-printable char.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(net.time4j.engine.c<Character> cVar) {
        Objects.requireNonNull(cVar, "Missing format attribute.");
        this.f41178a = (char) 0;
        this.f41179b = (char) 0;
        this.f41181d = cVar;
        this.f41180c = null;
        this.f41182e = true;
        this.f41183f = false;
        this.f41184g = false;
    }

    private m(char c11, char c12, String str, net.time4j.engine.c<Character> cVar, boolean z11, boolean z12, boolean z13) {
        this.f41178a = c11;
        this.f41179b = c12;
        this.f41180c = str;
        this.f41181d = cVar;
        this.f41182e = z11;
        this.f41183f = z12;
        this.f41184g = z13;
    }
}