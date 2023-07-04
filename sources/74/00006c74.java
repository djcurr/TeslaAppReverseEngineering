package ezvcard.util;

import java.util.BitSet;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final BitSet f25449a = new BitSet(128);

    /* renamed from: b  reason: collision with root package name */
    private final String f25450b;

    public b(String str) {
        this.f25450b = str;
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if ((i11 < str.length() + (-2) ? str.charAt(i11 + 1) : (char) 0) == '-') {
                i11 += 2;
                char charAt2 = str.charAt(i11);
                if (charAt > charAt2) {
                    charAt2 = charAt;
                    charAt = charAt2;
                }
                this.f25449a.set(charAt, charAt2 + 1);
            } else {
                this.f25449a.set(charAt);
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return this.f25449a.equals(((b) obj).f25449a);
        }
        return false;
    }

    public int hashCode() {
        return this.f25449a.hashCode();
    }

    public String toString() {
        return this.f25450b;
    }
}