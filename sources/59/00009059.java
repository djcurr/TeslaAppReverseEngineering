package on;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class g extends Number {

    /* renamed from: a  reason: collision with root package name */
    private final String f42810a;

    public g(String str) {
        this.f42810a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f42810a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            String str = this.f42810a;
            String str2 = ((g) obj).f42810a;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f42810a);
    }

    public int hashCode() {
        return this.f42810a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f42810a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f42810a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f42810a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f42810a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f42810a).longValue();
        }
    }

    public String toString() {
        return this.f42810a;
    }
}