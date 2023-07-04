package x20;

import java.util.ArrayList;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.f0;
import vz.b0;
import x20.c;

/* loaded from: classes5.dex */
public class o<E> extends a<E> {
    public o(h00.l<? super E, b0> lVar) {
        super(lVar);
    }

    @Override // x20.c
    protected Object B(E e11) {
        u<?> D;
        do {
            Object B = super.B(e11);
            f0 f0Var = b.f56989b;
            if (B == f0Var) {
                return f0Var;
            }
            if (B == b.f56990c) {
                D = D(e11);
                if (D == null) {
                    return f0Var;
                }
            } else if (B instanceof m) {
                return B;
            } else {
                throw new IllegalStateException(kotlin.jvm.internal.s.p("Invalid offerInternal result ", B).toString());
            }
        } while (!(D instanceof m));
        return D;
    }

    @Override // x20.a
    protected final boolean P() {
        return true;
    }

    @Override // x20.a
    protected final boolean Q() {
        return true;
    }

    @Override // x20.a
    protected void T(Object obj, m<?> mVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                w wVar = (w) obj;
                if (wVar instanceof c.a) {
                    h00.l<E, b0> lVar = this.f56995a;
                    if (lVar != null) {
                        undeliveredElementException = kotlinx.coroutines.internal.z.c(lVar, ((c.a) wVar).f56997d, null);
                    }
                } else {
                    wVar.X(mVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i11 = size - 1;
                        w wVar2 = (w) arrayList.get(size);
                        if (wVar2 instanceof c.a) {
                            h00.l<E, b0> lVar2 = this.f56995a;
                            undeliveredElementException2 = lVar2 == null ? null : kotlinx.coroutines.internal.z.c(lVar2, ((c.a) wVar2).f56997d, undeliveredElementException2);
                        } else {
                            wVar2.X(mVar);
                        }
                        if (i11 < 0) {
                            break;
                        }
                        size = i11;
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    @Override // x20.c
    protected final boolean y() {
        return false;
    }

    @Override // x20.c
    protected final boolean z() {
        return false;
    }
}