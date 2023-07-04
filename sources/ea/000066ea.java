package e20;

import k20.d0;

/* loaded from: classes5.dex */
public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.a f24544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, d0 d0Var, d dVar) {
        super(d0Var, dVar);
        if (aVar == null) {
            b(0);
        }
        if (d0Var == null) {
            b(1);
        }
        this.f24544c = aVar;
    }

    private static /* synthetic */ void b(int i11) {
        String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 2 ? 3 : 2];
        if (i11 == 1) {
            objArr[0] = "receiverType";
        } else if (i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i11 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i11 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i11 != 2) {
            if (i11 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i11 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f24544c + "}";
    }
}