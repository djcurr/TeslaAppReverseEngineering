package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public abstract class g0 extends f implements n00.m {
    public g0() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return getOwner().equals(g0Var.getOwner()) && getName().equals(g0Var.getName()) && getSignature().equals(g0Var.getSignature()) && s.c(getBoundReceiver(), g0Var.getBoundReceiver());
        } else if (obj instanceof n00.m) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // n00.m
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // n00.m
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        n00.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public g0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.f
    public n00.m getReflected() {
        return (n00.m) super.getReflected();
    }

    public g0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
    }
}