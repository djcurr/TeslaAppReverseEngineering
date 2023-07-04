package fq;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final f f26762b = new f("EC", com.nimbusds.jose.d.RECOMMENDED);

    /* renamed from: c  reason: collision with root package name */
    public static final f f26763c = new f("RSA", com.nimbusds.jose.d.REQUIRED);

    /* renamed from: d  reason: collision with root package name */
    public static final f f26764d;

    /* renamed from: e  reason: collision with root package name */
    public static final f f26765e;

    /* renamed from: a  reason: collision with root package name */
    private final String f26766a;

    static {
        com.nimbusds.jose.d dVar = com.nimbusds.jose.d.OPTIONAL;
        f26764d = new f("oct", dVar);
        f26765e = new f("OKP", dVar);
    }

    public f(String str, com.nimbusds.jose.d dVar) {
        if (str != null) {
            this.f26766a = str;
            return;
        }
        throw new IllegalArgumentException("The key type value must not be null");
    }

    public static f b(String str) {
        if (str != null) {
            f fVar = f26762b;
            if (str.equals(fVar.a())) {
                return fVar;
            }
            f fVar2 = f26763c;
            if (str.equals(fVar2.a())) {
                return fVar2;
            }
            f fVar3 = f26764d;
            if (str.equals(fVar3.a())) {
                return fVar3;
            }
            f fVar4 = f26765e;
            return str.equals(fVar4.a()) ? fVar4 : new f(str, null);
        }
        throw new IllegalArgumentException("The key type to parse must not be null");
    }

    public String a() {
        return this.f26766a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f26766a.hashCode();
    }

    public String toString() {
        return this.f26766a;
    }
}