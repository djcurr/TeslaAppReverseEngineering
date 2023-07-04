package xi;

import ak.u;
import com.google.common.base.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import wi.d;
import wi.g;

/* loaded from: classes3.dex */
public final class b extends g {
    private static wi.a c(u uVar) {
        uVar.r(12);
        int d11 = (uVar.d() + uVar.h(12)) - 4;
        uVar.r(44);
        uVar.s(uVar.h(12));
        uVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (uVar.d() >= d11) {
                break;
            }
            uVar.r(48);
            int h11 = uVar.h(8);
            uVar.r(4);
            int d12 = uVar.d() + uVar.h(12);
            String str2 = null;
            while (uVar.d() < d12) {
                int h12 = uVar.h(8);
                int h13 = uVar.h(8);
                int d13 = uVar.d() + h13;
                if (h12 == 2) {
                    int h14 = uVar.h(16);
                    uVar.r(8);
                    if (h14 != 3) {
                    }
                    while (uVar.d() < d13) {
                        str = uVar.l(uVar.h(8), f.f15918a);
                        int h15 = uVar.h(8);
                        for (int i11 = 0; i11 < h15; i11++) {
                            uVar.s(uVar.h(8));
                        }
                    }
                } else if (h12 == 21) {
                    str2 = uVar.l(h13, f.f15918a);
                }
                uVar.p(d13 * 8);
            }
            uVar.p(d12 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(h11, str2.length() != 0 ? str.concat(str2) : new String(str)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new wi.a(arrayList);
    }

    @Override // wi.g
    protected wi.a b(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new u(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}