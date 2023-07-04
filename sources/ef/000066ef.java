package e20;

import k20.d0;

/* loaded from: classes5.dex */
public class g extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(d0 d0Var) {
        this(d0Var, null);
        if (d0Var == null) {
            b(0);
        }
    }

    private static /* synthetic */ void b(int i11) {
        Object[] objArr = new Object[3];
        if (i11 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i11 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private g(d0 d0Var, d dVar) {
        super(d0Var, dVar);
        if (d0Var == null) {
            b(1);
        }
    }
}