package zp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class c implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final c f60574b = new c("DEF");

    /* renamed from: a  reason: collision with root package name */
    private final String f60575a;

    public c(String str) {
        if (str != null) {
            this.f60575a = str;
            return;
        }
        throw new IllegalArgumentException("The compression algorithm name must not be null");
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f60575a.hashCode();
    }

    public String toString() {
        return this.f60575a;
    }
}