package e20;

import k20.d0;

/* loaded from: classes5.dex */
public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final d0 f24542a;

    /* renamed from: b  reason: collision with root package name */
    private final d f24543b;

    public a(d0 d0Var, d dVar) {
        if (d0Var == null) {
            b(0);
        }
        this.f24542a = d0Var;
        this.f24543b = dVar == null ? this : dVar;
    }

    private static /* synthetic */ void b(int i11) {
        String str = (i11 == 1 || i11 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2) ? 2 : 3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i11 == 1) {
            objArr[1] = "getType";
        } else if (i11 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i11 != 1 && i11 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // e20.d
    public d0 getType() {
        d0 d0Var = this.f24542a;
        if (d0Var == null) {
            b(1);
        }
        return d0Var;
    }
}