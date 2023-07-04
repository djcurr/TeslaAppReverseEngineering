package zc;

import bc.l;
import bc.m;
import com.drew.imaging.ImageProcessingException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public class f implements qb.c {
    @Override // qb.c
    public void a(Iterable<byte[]> iterable, cc.e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 14 && "Photoshop 3.0".equals(new String(bArr, 0, 13))) {
                c(new l(bArr, 14), (bArr.length - 13) - 1, eVar);
            }
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.APPD);
    }

    public void c(m mVar, int i11, cc.e eVar) {
        int i12;
        e eVar2 = new e();
        eVar.a(eVar2);
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            try {
                String m11 = mVar.m(4);
                int p11 = mVar.p();
                short r11 = mVar.r();
                int i15 = i13 + 4 + 2 + 1;
                if (r11 >= 0 && (i12 = r11 + i15) <= i11) {
                    StringBuilder sb2 = new StringBuilder();
                    short s11 = (short) i12;
                    while (i15 < s11) {
                        sb2.append((char) mVar.r());
                        i15++;
                    }
                    if (i15 % 2 != 0) {
                        mVar.t(1L);
                        i15++;
                    }
                    int f11 = mVar.f();
                    byte[] d11 = mVar.d(f11);
                    int i16 = i15 + 4 + f11;
                    if (i16 % 2 != 0) {
                        mVar.t(1L);
                        i16++;
                    }
                    int i17 = i16;
                    if (m11.equals("8BIM")) {
                        if (p11 == 1028) {
                            new nc.c().d(new l(d11), eVar, d11.length, eVar2);
                        } else if (p11 == 1039) {
                            new lc.c().d(new bc.a(d11), eVar, eVar2);
                        } else {
                            if (p11 != 1058 && p11 != 1059) {
                                if (p11 == 1060) {
                                    new ed.c().g(d11, eVar, eVar2);
                                } else if (p11 >= 2000 && p11 <= 2998) {
                                    i14++;
                                    byte[] copyOf = Arrays.copyOf(d11, d11.length + sb2.length() + 1);
                                    for (int length = (copyOf.length - sb2.length()) - 1; length < copyOf.length; length++) {
                                        if (length % (((copyOf.length - sb2.length()) - 1) + sb2.length()) == 0) {
                                            copyOf[length] = (byte) sb2.length();
                                        } else {
                                            copyOf[length] = (byte) sb2.charAt(length - ((copyOf.length - sb2.length()) - 1));
                                        }
                                    }
                                    int i18 = i14 + 1999;
                                    e.f60404e.put(Integer.valueOf(i18), "Path Info " + i14);
                                    eVar2.C(i18, copyOf);
                                } else {
                                    eVar2.C(p11, d11);
                                }
                            }
                            new hc.i().e(new bc.a(d11), eVar, 0, eVar2);
                        }
                        if (p11 >= 4000 && p11 <= 4999) {
                            e.f60404e.put(Integer.valueOf(p11), String.format("Plug-in %d Data", Integer.valueOf((p11 - 4000) + 1)));
                        }
                    }
                    i13 = i17;
                } else {
                    throw new ImageProcessingException("Invalid string length");
                }
            } catch (Exception e11) {
                eVar2.a(e11.getMessage());
                return;
            }
        }
    }
}