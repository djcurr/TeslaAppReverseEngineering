package g30;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* loaded from: classes5.dex */
public final class f1 {
    public static final void a(int i11, int i12, e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i13 = (~i11) & i12;
        for (int i14 = 0; i14 < 32; i14++) {
            if ((i13 & 1) != 0) {
                arrayList.add(descriptor.e(i14));
            }
            i13 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.h());
    }
}