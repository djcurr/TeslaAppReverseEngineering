package fq;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final g f26767b = new g("sig");

    /* renamed from: c  reason: collision with root package name */
    public static final g f26768c = new g("enc");

    /* renamed from: a  reason: collision with root package name */
    private final String f26769a;

    public g(String str) {
        if (str != null) {
            this.f26769a = str;
            return;
        }
        throw new IllegalArgumentException("The key use identifier must not be null");
    }

    public static g b(String str) {
        if (str == null) {
            return null;
        }
        g gVar = f26767b;
        if (str.equals(gVar.a())) {
            return gVar;
        }
        g gVar2 = f26768c;
        if (str.equals(gVar2.a())) {
            return gVar2;
        }
        if (!str.trim().isEmpty()) {
            return new g(str);
        }
        throw new ParseException("JWK use value must not be empty or blank", 0);
    }

    public String a() {
        return this.f26769a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return Objects.equals(this.f26769a, ((g) obj).f26769a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f26769a);
    }

    public String toString() {
        return a();
    }
}