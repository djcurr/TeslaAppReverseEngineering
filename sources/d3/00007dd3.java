package kc;

import bc.m;
import com.drew.metadata.MetadataException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kc.f;
import org.spongycastle.crypto.tls.AlertDescription;

/* loaded from: classes.dex */
public class k {
    private static byte[] b(m mVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[257];
        while (true) {
            byte b11 = mVar.b();
            if (b11 == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            int i11 = b11 & 255;
            bArr[0] = b11;
            mVar.c(bArr, 1, i11);
            byteArrayOutputStream.write(bArr, 0, i11 + 1);
        }
    }

    private static byte[] c(m mVar, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i11 > 0) {
            byteArrayOutputStream.write(mVar.d(i11), 0, i11);
            i11 = mVar.b() & 255;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void d(m mVar, int i11, cc.e eVar) {
        if (i11 != 11) {
            eVar.a(new cc.c(String.format("Invalid GIF application extension block size. Expected 11, got %d.", Integer.valueOf(i11))));
            return;
        }
        String n11 = mVar.n(i11, bc.e.f7596a);
        if (n11.equals("XMP DataXMP")) {
            byte[] b11 = b(mVar);
            new ed.c().e(b11, 0, b11.length - 257, eVar, null);
        } else if (n11.equals("ICCRGBG1012")) {
            byte[] c11 = c(mVar, mVar.b() & 255);
            if (c11.length != 0) {
                new lc.c().c(new bc.a(c11), eVar);
            }
        } else if (n11.equals("NETSCAPE2.0")) {
            mVar.t(2L);
            int p11 = mVar.p();
            mVar.t(1L);
            b bVar = new b();
            bVar.J(1, p11);
            eVar.a(bVar);
        } else {
            k(mVar);
        }
    }

    private static d e(m mVar, int i11) {
        return new d(new cc.f(c(mVar, i11), bc.e.f7598c));
    }

    private static f f(m mVar, int i11) {
        f fVar = new f();
        short r11 = mVar.r();
        fVar.M(2, f.b.typeOf((r11 >> 2) & 7));
        fVar.B(3, ((r11 & 2) >> 1) == 1);
        fVar.B(4, (r11 & 1) == 1);
        fVar.J(1, mVar.p());
        fVar.J(5, mVar.r());
        mVar.t(1L);
        return fVar;
    }

    private static void g(m mVar, cc.e eVar) {
        byte h11 = mVar.h();
        short r11 = mVar.r();
        long l11 = mVar.l();
        if (h11 == -7) {
            eVar.a(f(mVar, r11));
        } else if (h11 == 1) {
            cc.b j11 = j(mVar, r11);
            if (j11 != null) {
                eVar.a(j11);
            }
        } else if (h11 == -2) {
            eVar.a(e(mVar, r11));
        } else if (h11 != -1) {
            eVar.a(new cc.c(String.format("Unsupported GIF extension block with type 0x%02X.", Byte.valueOf(h11))));
        } else {
            d(mVar, r11, eVar);
        }
        long l12 = (l11 + r11) - mVar.l();
        if (l12 > 0) {
            mVar.t(l12);
        }
    }

    private static h h(m mVar) {
        h hVar = new h();
        if (!mVar.m(3).equals("GIF")) {
            hVar.a("Invalid GIF file signature");
            return hVar;
        }
        String m11 = mVar.m(3);
        if (!m11.equals("87a") && !m11.equals("89a")) {
            hVar.a("Unexpected GIF version");
            return hVar;
        }
        hVar.R(1, m11);
        hVar.J(2, mVar.p());
        hVar.J(3, mVar.p());
        short r11 = mVar.r();
        int i11 = 1 << ((r11 & 7) + 1);
        int i12 = ((r11 & AlertDescription.unrecognized_name) >> 4) + 1;
        boolean z11 = (r11 >> 7) != 0;
        hVar.J(4, i11);
        if (m11.equals("89a")) {
            hVar.B(5, (r11 & 8) != 0);
        }
        hVar.J(6, i12);
        hVar.B(7, z11);
        hVar.J(8, mVar.r());
        short r12 = mVar.r();
        if (r12 != 0) {
            hVar.H(9, (float) ((r12 + 15.0d) / 64.0d));
        }
        return hVar;
    }

    private static j i(m mVar) {
        j jVar = new j();
        jVar.J(1, mVar.p());
        jVar.J(2, mVar.p());
        jVar.J(3, mVar.p());
        jVar.J(4, mVar.p());
        byte b11 = mVar.b();
        boolean z11 = (b11 >> 7) != 0;
        boolean z12 = (b11 & 64) != 0;
        jVar.B(5, z11);
        jVar.B(6, z12);
        if (z11) {
            jVar.B(7, (b11 & 32) != 0);
            int i11 = b11 & 7;
            jVar.J(8, i11 + 1);
            mVar.t((2 << i11) * 3);
        }
        mVar.b();
        return jVar;
    }

    private static cc.b j(m mVar, int i11) {
        if (i11 != 12) {
            return new cc.c(String.format("Invalid GIF plain text block size. Expected 12, got %d.", Integer.valueOf(i11)));
        }
        mVar.t(12L);
        k(mVar);
        return null;
    }

    private static void k(m mVar) {
        while (true) {
            short r11 = mVar.r();
            if (r11 == 0) {
                return;
            }
            mVar.t(r11);
        }
    }

    public void a(m mVar, cc.e eVar) {
        byte h11;
        mVar.s(false);
        try {
            h h12 = h(mVar);
            eVar.a(h12);
            if (h12.y()) {
                return;
            }
            Integer num = null;
            try {
                try {
                    if (h12.c(7)) {
                        num = h12.l(4);
                    }
                } catch (MetadataException unused) {
                    eVar.a(new cc.c("GIF did not had hasGlobalColorTable bit."));
                }
                if (num != null) {
                    mVar.t(num.intValue() * 3);
                }
                while (true) {
                    try {
                        h11 = mVar.h();
                        if (h11 == 33) {
                            g(mVar, eVar);
                        } else if (h11 != 44) {
                            break;
                        } else {
                            eVar.a(i(mVar));
                            k(mVar);
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                }
                if (h11 != 59) {
                    eVar.a(new cc.c("Unknown gif block marker found."));
                }
            } catch (IOException unused3) {
                eVar.a(new cc.c("IOException processing GIF data"));
            }
        } catch (IOException unused4) {
            eVar.a(new cc.c("IOException processing GIF data"));
        }
    }
}