package fq;

import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import zp.n;

/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f26716c = new a("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* renamed from: d  reason: collision with root package name */
    public static final a f26717d = new a("secp256k1", "secp256k1", "1.3.132.0.10");
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final a f26718e = new a("P-256K", "secp256k1", "1.3.132.0.10");

    /* renamed from: f  reason: collision with root package name */
    public static final a f26719f = new a("P-384", "secp384r1", "1.3.132.0.34");

    /* renamed from: g  reason: collision with root package name */
    public static final a f26720g = new a("P-521", "secp521r1", "1.3.132.0.35");

    /* renamed from: h  reason: collision with root package name */
    public static final a f26721h = new a("Ed25519", "Ed25519", null);

    /* renamed from: i  reason: collision with root package name */
    public static final a f26722i = new a("Ed448", "Ed448", null);

    /* renamed from: j  reason: collision with root package name */
    public static final a f26723j = new a("X25519", "X25519", null);

    /* renamed from: k  reason: collision with root package name */
    public static final a f26724k = new a("X448", "X448", null);

    /* renamed from: a  reason: collision with root package name */
    private final String f26725a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26726b;

    public a(String str) {
        this(str, null, null);
    }

    public static a a(ECParameterSpec eCParameterSpec) {
        return c.a(eCParameterSpec);
    }

    public static Set<a> b(n nVar) {
        if (n.f60658i.equals(nVar)) {
            return Collections.singleton(f26716c);
        }
        if (n.f60659j.equals(nVar)) {
            return Collections.singleton(f26717d);
        }
        if (n.f60660k.equals(nVar)) {
            return Collections.singleton(f26719f);
        }
        if (n.f60661l.equals(nVar)) {
            return Collections.singleton(f26720g);
        }
        if (n.f60665p.equals(nVar)) {
            return Collections.unmodifiableSet(new HashSet(Arrays.asList(f26721h, f26722i)));
        }
        return null;
    }

    public static a d(String str) {
        if (str != null && !str.trim().isEmpty()) {
            a aVar = f26716c;
            if (str.equals(aVar.getName())) {
                return aVar;
            }
            a aVar2 = f26718e;
            if (str.equals(aVar2.getName())) {
                return aVar2;
            }
            a aVar3 = f26717d;
            if (str.equals(aVar3.getName())) {
                return aVar3;
            }
            a aVar4 = f26719f;
            if (str.equals(aVar4.getName())) {
                return aVar4;
            }
            a aVar5 = f26720g;
            if (str.equals(aVar5.getName())) {
                return aVar5;
            }
            a aVar6 = f26721h;
            if (str.equals(aVar6.getName())) {
                return aVar6;
            }
            a aVar7 = f26722i;
            if (str.equals(aVar7.getName())) {
                return aVar7;
            }
            a aVar8 = f26723j;
            if (str.equals(aVar8.getName())) {
                return aVar8;
            }
            a aVar9 = f26724k;
            return str.equals(aVar9.getName()) ? aVar9 : new a(str);
        }
        throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
    }

    public String c() {
        return this.f26726b;
    }

    public ECParameterSpec e() {
        return c.b(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && toString().equals(obj.toString());
    }

    public String getName() {
        return this.f26725a;
    }

    public int hashCode() {
        return Objects.hash(getName());
    }

    public String toString() {
        return getName();
    }

    public a(String str, String str2, String str3) {
        if (str != null) {
            this.f26725a = str;
            this.f26726b = str2;
            return;
        }
        throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
    }
}