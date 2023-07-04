package qb;

import bc.m;
import com.drew.imaging.jpeg.JpegProcessingException;
import java.util.HashSet;

/* loaded from: classes.dex */
public class d {
    public static b a(m mVar, Iterable<com.drew.imaging.jpeg.a> iterable) {
        int p11;
        if (mVar.p() == 65496) {
            HashSet hashSet = null;
            if (iterable != null) {
                hashSet = new HashSet();
                for (com.drew.imaging.jpeg.a aVar : iterable) {
                    hashSet.add(Byte.valueOf(aVar.byteValue));
                }
            }
            HashSet hashSet2 = hashSet;
            b bVar = new b();
            while (true) {
                byte h11 = mVar.h();
                byte h12 = mVar.h();
                while (true) {
                    if (h11 == -1 && h12 != -1 && h12 != 0) {
                        break;
                    }
                    byte b11 = h12;
                    h12 = mVar.h();
                    h11 = b11;
                }
                if (h12 == -38 || h12 == -39) {
                    return bVar;
                }
                int p12 = mVar.p() - 2;
                if (p12 >= 0) {
                    if (hashSet2 != null && !hashSet2.contains(Byte.valueOf(h12))) {
                        if (!mVar.u(p12)) {
                            return bVar;
                        }
                    } else {
                        bVar.a(h12, mVar.d(p12));
                    }
                } else {
                    throw new JpegProcessingException("JPEG segment size would be less than zero");
                }
            }
        } else {
            throw new JpegProcessingException("JPEG data is expected to begin with 0xFFD8 (ÿØ) not 0x" + Integer.toHexString(p11));
        }
    }
}