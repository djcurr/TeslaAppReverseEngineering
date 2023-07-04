package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public class o extends f implements n, n00.h {
    private final int arity;
    private final int flags;

    public o(int i11) {
        this(i11, f.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.f
    protected n00.c computeReflected() {
        return m0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && this.flags == oVar.flags && this.arity == oVar.arity && s.c(getBoundReceiver(), oVar.getBoundReceiver()) && s.c(getOwner(), oVar.getOwner());
        } else if (obj instanceof n00.h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // n00.h
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // n00.h
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // n00.h
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // n00.h
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.f, n00.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        n00.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public o(int i11, Object obj) {
        this(i11, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.f
    public n00.h getReflected() {
        return (n00.h) super.getReflected();
    }

    public o(int i11, Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, (i12 & 1) == 1);
        this.arity = i11;
        this.flags = i12 >> 1;
    }
}