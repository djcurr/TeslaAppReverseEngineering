package k20;

/* loaded from: classes5.dex */
public class a1 extends z0 {

    /* renamed from: a  reason: collision with root package name */
    private final k1 f34217a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f34218b;

    public a1(k1 k1Var, d0 d0Var) {
        if (k1Var == null) {
            c(0);
        }
        if (d0Var == null) {
            c(1);
        }
        this.f34217a = k1Var;
        this.f34218b = d0Var;
    }

    private static /* synthetic */ void c(int i11) {
        String str = (i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5) ? 2 : 3];
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i11 == 3) {
            objArr[2] = "replaceType";
        } else if (i11 != 4 && i11 != 5) {
            if (i11 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // k20.y0
    public boolean a() {
        return false;
    }

    @Override // k20.y0
    public k1 b() {
        k1 k1Var = this.f34217a;
        if (k1Var == null) {
            c(4);
        }
        return k1Var;
    }

    @Override // k20.y0
    public d0 getType() {
        d0 d0Var = this.f34218b;
        if (d0Var == null) {
            c(5);
        }
        return d0Var;
    }

    @Override // k20.y0
    public y0 m(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (hVar == null) {
            c(6);
        }
        return new a1(this.f34217a, hVar.g(this.f34218b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(d0 d0Var) {
        this(k1.INVARIANT, d0Var);
        if (d0Var == null) {
            c(2);
        }
    }
}