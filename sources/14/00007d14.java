package k20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import w00.q0;

/* loaded from: classes5.dex */
public class j extends b {

    /* renamed from: d  reason: collision with root package name */
    private final w00.c f34292d;

    /* renamed from: e  reason: collision with root package name */
    private final List<w00.s0> f34293e;

    /* renamed from: f  reason: collision with root package name */
    private final Collection<d0> f34294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w00.c cVar, List<? extends w00.s0> list, Collection<d0> collection, j20.n nVar) {
        super(nVar);
        if (cVar == null) {
            t(0);
        }
        if (list == null) {
            t(1);
        }
        if (collection == null) {
            t(2);
        }
        if (nVar == null) {
            t(3);
        }
        this.f34292d = cVar;
        this.f34293e = Collections.unmodifiableList(new ArrayList(list));
        this.f34294f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void t(int i11) {
        String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getParameters";
        } else if (i11 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i11 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i11 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // k20.h
    protected Collection<d0> g() {
        Collection<d0> collection = this.f34294f;
        if (collection == null) {
            t(6);
        }
        return collection;
    }

    @Override // k20.w0
    public List<w00.s0> getParameters() {
        List<w00.s0> list = this.f34293e;
        if (list == null) {
            t(4);
        }
        return list;
    }

    @Override // k20.h
    protected w00.q0 k() {
        q0.a aVar = q0.a.f55322a;
        if (aVar == null) {
            t(7);
        }
        return aVar;
    }

    @Override // k20.w0
    public boolean o() {
        return true;
    }

    public String toString() {
        return w10.d.m(this.f34292d).b();
    }

    @Override // k20.k, k20.w0
    /* renamed from: u */
    public w00.c n() {
        w00.c cVar = this.f34292d;
        if (cVar == null) {
            t(5);
        }
        return cVar;
    }
}