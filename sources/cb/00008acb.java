package net.time4j.calendar;

import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class h implements Comparable<h>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final net.time4j.engine.c<Character> f40896a = net.time4j.format.a.e("LEAP_MONTH_INDICATOR", Character.class);

    /* renamed from: b  reason: collision with root package name */
    public static final net.time4j.engine.c<Boolean> f40897b = net.time4j.format.a.e("LEAP_MONTH_IS_TRAILING", Boolean.class);

    /* renamed from: c  reason: collision with root package name */
    private static final h[] f40898c;
    private static final long serialVersionUID = 7544059597266533279L;
    private final int index;
    private final boolean leap;

    static {
        h[] hVarArr = new h[24];
        for (int i11 = 0; i11 < 12; i11++) {
            hVarArr[i11] = new h(i11, false);
            hVarArr[i11 + 12] = new h(i11, true);
        }
        f40898c = hVarArr;
    }

    private h(int i11, boolean z11) {
        this.index = i11;
        this.leap = z11;
    }

    public static h d(int i11) {
        if (i11 >= 1 && i11 <= 12) {
            return f40898c[i11 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i11);
    }

    private Object readResolve() {
        try {
            return f40898c[this.index + (this.leap ? 12 : 0)];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new StreamCorruptedException();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(h hVar) {
        int i11 = this.index;
        int i12 = hVar.index;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        return this.leap ? !hVar.leap ? 1 : 0 : hVar.leap ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b(Locale locale, net.time4j.format.j jVar, net.time4j.engine.d dVar) {
        StringBuilder sb2;
        Map<String, String> m11 = net.time4j.format.b.c("generic", locale).m();
        String a11 = k30.b.a(jVar, ((Character) dVar.b(net.time4j.format.a.f41005m, Character.valueOf(jVar.getDigits().charAt(0)))).charValue(), getNumber());
        if (this.leap) {
            boolean booleanValue = ((Boolean) dVar.b(f40897b, Boolean.valueOf("R".equals(m11.get("leap-alignment"))))).booleanValue();
            char charValue = ((Character) dVar.b(f40896a, Character.valueOf(m11.get("leap-indicator").charAt(0)))).charValue();
            if (booleanValue) {
                sb2 = new StringBuilder();
                sb2.append(a11);
                sb2.append(charValue);
            } else {
                sb2 = new StringBuilder();
                sb2.append(charValue);
                sb2.append(a11);
            }
            return sb2.toString();
        }
        return a11;
    }

    public boolean c() {
        return this.leap;
    }

    public h e() {
        return f40898c[this.index + 12];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.index == hVar.index && this.leap == hVar.leap;
        }
        return false;
    }

    public int getNumber() {
        return this.index + 1;
    }

    public int hashCode() {
        return this.index + (this.leap ? 12 : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.index + 1);
        if (this.leap) {
            return Marker.ANY_MARKER + valueOf;
        }
        return valueOf;
    }
}