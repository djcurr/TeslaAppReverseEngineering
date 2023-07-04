package gc;

import bc.j;
import bc.l;
import bc.m;
import bc.n;
import cc.e;
import com.drew.imaging.tiff.TiffProcessingException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import yb.d;
import zc.f;
import zc.g;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private int f27902a;

    private void a(b bVar, String str, String str2) {
        Integer num = b.f27901f.get(str);
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue == 8) {
            f(bVar, str2);
        } else if (intValue != 36) {
            if (b.f27900e.containsKey(num) && !bVar.b(num.intValue())) {
                bVar.R(num.intValue(), str2);
                this.f27902a = num.intValue();
            } else {
                this.f27902a = 0;
            }
        } else {
            int i11 = this.f27902a;
            bVar.R(i11, bVar.r(this.f27902a) + " " + str2);
        }
        this.f27902a = num.intValue();
    }

    private static byte[] b(m mVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z11 = false;
        boolean z12 = false;
        byte b11 = 0;
        int i11 = 0;
        while (!z11) {
            b11 = mVar.b();
            if (z12) {
                if (!z12) {
                    if (z12) {
                        int j11 = j(b11);
                        if (j11 != -1) {
                            i11 = j11 * 16;
                            z12 = true;
                        } else if (b11 != 13 && b11 != 10) {
                            return null;
                        } else {
                            z12 = false;
                        }
                    } else if (z12) {
                        int j12 = j(b11);
                        if (j12 == -1) {
                            return null;
                        }
                        byteArrayOutputStream.write(j12 + i11);
                        z12 = true;
                    } else {
                        continue;
                    }
                } else if (b11 != 32) {
                    z11 = true;
                } else {
                    z12 = true;
                }
            } else if (b11 != 10 && b11 != 13 && b11 != 32) {
                if (b11 != 37) {
                    return null;
                }
                z12 = true;
            }
        }
        while (b11 != 10) {
            b11 = mVar.b();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void c(b bVar, e eVar, m mVar) {
        String trim;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            sb2.setLength(0);
            while (true) {
                char b11 = (char) mVar.b();
                if (b11 == '\r' || b11 == '\n') {
                    break;
                }
                sb2.append(b11);
            }
            if (sb2.length() != 0 && sb2.charAt(0) != '%') {
                return;
            }
            int indexOf = sb2.indexOf(":");
            if (indexOf != -1) {
                trim = sb2.substring(0, indexOf).trim();
                a(bVar, trim, sb2.substring(indexOf + 1).trim());
            } else {
                trim = sb2.toString().trim();
            }
            if (trim.equals("%BeginPhotoshop")) {
                g(eVar, mVar);
            } else if (trim.equals("%%BeginICCProfile")) {
                e(eVar, mVar);
            } else if (trim.equals("%begin_xml_packet")) {
                h(eVar, mVar);
            }
        }
    }

    private static void e(e eVar, m mVar) {
        byte[] b11 = b(mVar);
        if (b11 != null) {
            new lc.c().c(new bc.a(b11), eVar);
        }
    }

    private static void f(b bVar, String str) {
        bVar.R(8, str.trim());
        String[] split = str.split(" ");
        int i11 = 0;
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split[3]);
        if (!bVar.b(28)) {
            bVar.J(28, parseInt);
        }
        if (!bVar.b(29)) {
            bVar.J(29, parseInt2);
        }
        if (!bVar.b(30)) {
            bVar.J(30, parseInt3);
        }
        if (bVar.b(31)) {
            return;
        }
        if (parseInt3 == 1) {
            i11 = 1;
        } else if (parseInt3 == 2 || parseInt3 == 3 || parseInt3 == 4) {
            i11 = 3;
        }
        if (i11 != 0) {
            bVar.J(31, i11 * parseInt * parseInt2);
        }
    }

    private static void g(e eVar, m mVar) {
        byte[] b11 = b(mVar);
        if (b11 != null) {
            new f().c(new l(b11), b11.length, eVar);
        }
    }

    private static void h(e eVar, m mVar) {
        new ed.c().c(new String(i(mVar, "<?xpacket end=\"w\"?>".getBytes()), bc.e.f7596a), eVar);
    }

    private static byte[] i(m mVar, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i11 = 0;
        while (i11 != length) {
            byte b11 = mVar.b();
            i11 = b11 == bArr[i11] ? i11 + 1 : 0;
            byteArrayOutputStream.write(b11);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int j(byte b11) {
        if (b11 < 48 || b11 > 57) {
            byte b12 = 65;
            if (b11 < 65 || b11 > 70) {
                b12 = 97;
                if (b11 < 97 || b11 > 102) {
                    return -1;
                }
            }
            return (b11 - b12) + 10;
        }
        return b11 - 48;
    }

    public void d(InputStream inputStream, e eVar) {
        j jVar = new j(inputStream);
        b bVar = new b();
        eVar.a(bVar);
        int h11 = jVar.h(0);
        if (h11 != -976170042) {
            if (h11 != 622940243) {
                bVar.a("File type not supported.");
                return;
            }
            inputStream.reset();
            c(bVar, eVar, new n(inputStream));
            return;
        }
        jVar.w(false);
        int h12 = jVar.h(4);
        int h13 = jVar.h(8);
        int h14 = jVar.h(12);
        int h15 = jVar.h(16);
        int h16 = jVar.h(20);
        int h17 = jVar.h(24);
        if (h17 != 0) {
            bVar.J(32, h17);
            bVar.J(33, h16);
            try {
                new d().d(new bc.a(jVar.c(h16, h17)), new g(eVar, null), 0);
            } catch (TiffProcessingException e11) {
                bVar.a("Unable to process TIFF data: " + e11.getMessage());
            }
        } else if (h15 != 0) {
            bVar.J(34, h15);
            bVar.J(35, h14);
        }
        c(bVar, eVar, new l(jVar.c(h12, h13)));
    }
}