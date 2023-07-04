package h60;

import java.security.spec.ECParameterSpec;
import u50.y;

/* loaded from: classes5.dex */
public class f extends ECParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f28933a;

    /* renamed from: b  reason: collision with root package name */
    private final y f28934b;

    public byte[] a() {
        return org.bouncycastle.util.a.h(this.f28933a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f28934b.equals(((f) obj).f28934b);
        }
        return false;
    }

    public int hashCode() {
        return this.f28934b.hashCode();
    }
}