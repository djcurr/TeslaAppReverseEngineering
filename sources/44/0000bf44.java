package xb;

import bc.m;
import com.drew.imaging.riff.RiffProcessingException;

/* loaded from: classes.dex */
public class b {
    public void a(m mVar, int i11, a aVar) {
        while (mVar.l() < i11) {
            String str = new String(mVar.d(4));
            int f11 = mVar.f();
            if (!str.equals("LIST") && !str.equals("RIFF")) {
                if (aVar.c(str)) {
                    aVar.a(str, mVar.d(f11));
                } else {
                    mVar.t(f11);
                }
                if (f11 % 2 == 1) {
                    mVar.t(1L);
                }
            } else if (aVar.b(new String(mVar.d(4)))) {
                a(mVar, f11 - 4, aVar);
            } else {
                mVar.t(f11 - 4);
            }
        }
    }

    public void b(m mVar, a aVar) {
        mVar.s(false);
        String m11 = mVar.m(4);
        if (m11.equals("RIFF")) {
            int f11 = mVar.f() - 4;
            if (aVar.d(mVar.m(4))) {
                a(mVar, f11, aVar);
                return;
            }
            return;
        }
        throw new RiffProcessingException("Invalid RIFF header: " + m11);
    }
}