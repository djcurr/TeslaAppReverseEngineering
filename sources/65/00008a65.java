package nc;

import bc.l;
import bc.m;
import cc.e;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class c implements qb.c {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
        if (r6 != 582) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(bc.m r4, cc.b r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            int r6 = r6 << 8
            r6 = r6 | r7
            if (r8 != 0) goto Lb
            java.lang.String r4 = ""
            r5.R(r6, r4)
            return
        Lb:
            r7 = 256(0x100, float:3.59E-43)
            r0 = 346(0x15a, float:4.85E-43)
            r1 = 1
            if (r6 == r7) goto L49
            r7 = 278(0x116, float:3.9E-43)
            if (r6 == r7) goto L49
            if (r6 == r0) goto L36
            r7 = 378(0x17a, float:5.3E-43)
            if (r6 == r7) goto L49
            r7 = 512(0x200, float:7.175E-43)
            if (r6 == r7) goto L49
            r7 = 522(0x20a, float:7.31E-43)
            if (r6 == r7) goto L29
            r7 = 582(0x246, float:8.16E-43)
            if (r6 == r7) goto L49
            goto L59
        L29:
            short r7 = r4.r()
            r5.J(r6, r7)
            int r8 = r8 - r1
            long r5 = (long) r8
            r4.t(r5)
            return
        L36:
            byte[] r4 = r4.d(r8)
            java.lang.String r7 = nc.d.a(r4)
            if (r7 != 0) goto L45
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4)
        L45:
            r5.R(r6, r7)
            return
        L49:
            r7 = 2
            if (r8 < r7) goto L59
            int r0 = r4.p()
            int r8 = r8 - r7
            long r7 = (long) r8
            r4.t(r7)
            r5.J(r6, r0)
            return
        L59:
            java.lang.String r7 = r5.r(r0)
            r0 = 0
            if (r7 == 0) goto L65
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r7)     // Catch: java.lang.Throwable -> L65
            goto L66
        L65:
            r2 = r0
        L66:
            if (r7 == 0) goto L6d
            cc.f r4 = r4.o(r8, r2)
            goto L84
        L6d:
            byte[] r4 = r4.d(r8)
            java.nio.charset.Charset r7 = nc.d.b(r4)
            if (r7 == 0) goto L7e
            cc.f r8 = new cc.f
            r8.<init>(r4, r7)
            r4 = r8
            goto L84
        L7e:
            cc.f r7 = new cc.f
            r7.<init>(r4, r0)
            r4 = r7
        L84:
            boolean r7 = r5.b(r6)
            if (r7 == 0) goto La5
            cc.f[] r7 = r5.u(r6)
            if (r7 != 0) goto L93
            cc.f[] r7 = new cc.f[r1]
            goto L9d
        L93:
            int r8 = r7.length
            int r8 = r8 + r1
            cc.f[] r8 = new cc.f[r8]
            int r0 = r7.length
            r2 = 0
            java.lang.System.arraycopy(r7, r2, r8, r2, r0)
            r7 = r8
        L9d:
            int r8 = r7.length
            int r8 = r8 - r1
            r7[r8] = r4
            r5.U(r6, r7)
            goto La8
        La5:
            r5.T(r6, r4)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.c.e(bc.m, cc.b, int, int, int):void");
    }

    @Override // qb.c
    public void a(Iterable<byte[]> iterable, e eVar, com.drew.imaging.jpeg.a aVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length != 0 && bArr[0] == 28) {
                c(new l(bArr), eVar, bArr.length);
            }
        }
    }

    @Override // qb.c
    public Iterable<com.drew.imaging.jpeg.a> b() {
        return Collections.singletonList(com.drew.imaging.jpeg.a.APPD);
    }

    public void c(m mVar, e eVar, long j11) {
        d(mVar, eVar, j11, null);
    }

    public void d(m mVar, e eVar, long j11, cc.b bVar) {
        b bVar2 = new b();
        eVar.a(bVar2);
        if (bVar != null) {
            bVar2.O(bVar);
        }
        int i11 = 0;
        while (i11 < j11) {
            try {
                short r11 = mVar.r();
                int i12 = i11 + 1;
                if (r11 != 28) {
                    if (i12 != j11) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid IPTC tag marker at offset ");
                        sb2.append(i12 - 1);
                        sb2.append(". Expected '0x");
                        sb2.append(Integer.toHexString(28));
                        sb2.append("' but got '0x");
                        sb2.append(Integer.toHexString(r11));
                        sb2.append("'.");
                        bVar2.a(sb2.toString());
                        return;
                    }
                    return;
                } else if (i12 + 4 > j11) {
                    bVar2.a("Too few bytes remain for a valid IPTC tag");
                    return;
                } else {
                    try {
                        short r12 = mVar.r();
                        short r13 = mVar.r();
                        int p11 = mVar.p();
                        if (p11 > 32767) {
                            p11 = ((p11 & 32767) << 16) | mVar.p();
                            i12 += 2;
                        }
                        int i13 = p11;
                        i11 = i12 + 4 + i13;
                        if (i11 > j11) {
                            bVar2.a("Data for tag extends beyond end of IPTC segment");
                            return;
                        }
                        try {
                            e(mVar, bVar2, r12, r13, i13);
                        } catch (IOException unused) {
                            bVar2.a("Error processing IPTC tag");
                            return;
                        }
                    } catch (IOException unused2) {
                        bVar2.a("IPTC data segment ended mid-way through tag descriptor");
                        return;
                    }
                }
            } catch (IOException unused3) {
                bVar2.a("Unable to read starting byte of IPTC tag");
                return;
            }
        }
    }
}