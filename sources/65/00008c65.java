package nh;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f41662a;

    private b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f41662a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f41662a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f41662a.equals(((b) obj).f41662a);
        }
        return false;
    }

    public int hashCode() {
        return this.f41662a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f41662a + "\"}";
    }
}