package kotlinx.serialization.json;

import h30.h0;
import kotlin.jvm.internal.m0;

/* loaded from: classes5.dex */
public final class n extends JsonPrimitive {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35659a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35660b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Object body, boolean z11) {
        super(null);
        kotlin.jvm.internal.s.g(body, "body");
        this.f35659a = z11;
        this.f35660b = body.toString();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String b() {
        return this.f35660b;
    }

    public boolean c() {
        return this.f35659a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(m0.b(n.class), m0.b(obj.getClass()))) {
            return false;
        }
        n nVar = (n) obj;
        return c() == nVar.c() && kotlin.jvm.internal.s.c(b(), nVar.b());
    }

    public int hashCode() {
        return (Boolean.valueOf(c()).hashCode() * 31) + b().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (c()) {
            StringBuilder sb2 = new StringBuilder();
            h0.c(sb2, b());
            String sb3 = sb2.toString();
            kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        return b();
    }
}