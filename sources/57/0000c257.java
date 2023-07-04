package yc;

import bc.m;
import cc.e;
import com.drew.imaging.ImageProcessingException;

/* loaded from: classes.dex */
public class c {
    public void a(m mVar, e eVar) {
        mVar.s(false);
        b bVar = new b();
        eVar.a(bVar);
        try {
            if (mVar.h() == 10) {
                bVar.J(1, mVar.h());
                if (mVar.h() == 1) {
                    bVar.J(2, mVar.r());
                    bVar.J(3, mVar.p());
                    bVar.J(4, mVar.p());
                    bVar.J(5, mVar.p());
                    bVar.J(6, mVar.p());
                    bVar.J(7, mVar.p());
                    bVar.J(8, mVar.p());
                    bVar.C(9, mVar.d(48));
                    mVar.t(1L);
                    bVar.J(10, mVar.r());
                    bVar.J(11, mVar.p());
                    int p11 = mVar.p();
                    if (p11 != 0) {
                        bVar.J(12, p11);
                    }
                    int p12 = mVar.p();
                    if (p12 != 0) {
                        bVar.J(13, p12);
                    }
                    int p13 = mVar.p();
                    if (p13 != 0) {
                        bVar.J(14, p13);
                        return;
                    }
                    return;
                }
                throw new ImageProcessingException("Invalid PCX encoding byte");
            }
            throw new ImageProcessingException("Invalid PCX identifier byte");
        } catch (Exception e11) {
            bVar.a("Exception reading PCX file metadata: " + e11.getMessage());
        }
    }
}