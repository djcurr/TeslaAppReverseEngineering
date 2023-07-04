package w10;

import java.util.Comparator;
import w00.i0;
import w00.r0;

/* loaded from: classes5.dex */
public class g implements Comparator<w00.i> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f55377a = new g();

    private g() {
    }

    private static Integer b(w00.i iVar, w00.i iVar2) {
        int c11 = c(iVar2) - c(iVar);
        if (c11 != 0) {
            return Integer.valueOf(c11);
        }
        if (d.B(iVar) && d.B(iVar2)) {
            return 0;
        }
        int compareTo = iVar.getName().compareTo(iVar2.getName());
        if (compareTo != 0) {
            return Integer.valueOf(compareTo);
        }
        return null;
    }

    private static int c(w00.i iVar) {
        if (d.B(iVar)) {
            return 8;
        }
        if (iVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return 7;
        }
        if (iVar instanceof i0) {
            return ((i0) iVar).N() == null ? 6 : 5;
        } else if (iVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) iVar).N() == null ? 4 : 3;
        } else if (iVar instanceof w00.c) {
            return 2;
        } else {
            return iVar instanceof r0 ? 1 : 0;
        }
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(w00.i iVar, w00.i iVar2) {
        Integer b11 = b(iVar, iVar2);
        if (b11 != null) {
            return b11.intValue();
        }
        return 0;
    }
}