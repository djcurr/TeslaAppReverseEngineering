package nq;

import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f41777a;

    public a(String str) {
        if (str != null) {
            this.f41777a = str;
            return;
        }
        throw new IllegalArgumentException("The Base64 value must not be null");
    }

    public byte[] a() {
        return b.c(this.f41777a);
    }

    public BigInteger b() {
        return new BigInteger(1, a());
    }

    public String c() {
        return new String(a(), l.f41779a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f41777a.hashCode();
    }

    public String toString() {
        return this.f41777a;
    }
}