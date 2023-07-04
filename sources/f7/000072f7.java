package hc;

import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.lang.BufferBoundsException;
import ic.b0;
import ic.b1;
import ic.d0;
import ic.d1;
import ic.f0;
import ic.f1;
import ic.h0;
import ic.j0;
import ic.l0;
import ic.n0;
import ic.p0;
import ic.r0;
import ic.t0;
import ic.v0;
import ic.x0;
import ic.z0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public class n extends bd.a {
    public n(cc.e eVar, cc.b bVar) {
        super(eVar, bVar);
    }

    private static String A(bc.i iVar, int i11, int i12) {
        try {
            return iVar.q(i11, i12, bc.e.f7596a);
        } catch (BufferBoundsException unused) {
            return "";
        }
    }

    private static boolean B(cc.b bVar, int i11) {
        if (i11 == 50341) {
            return true;
        }
        if (i11 == 3584) {
            return (bVar instanceof ic.h) || (bVar instanceof ic.n) || (bVar instanceof ic.v) || (bVar instanceof f0) || (bVar instanceof n0) || (bVar instanceof p0) || (bVar instanceof v0) || (bVar instanceof z0) || (bVar instanceof d1);
        }
        return false;
    }

    private static void C(cc.b bVar, int i11, bc.i iVar, int i12, Boolean bool, int i13) {
        int i14 = 0;
        while (i14 < i12) {
            if (bVar.z(i14)) {
                if (i14 < i12 - 1 && bVar.z(i14 + 1)) {
                    if (bool.booleanValue()) {
                        bVar.M(i14, Short.valueOf(iVar.f((i14 * 2) + i11)));
                    } else {
                        bVar.M(i14, Integer.valueOf(iVar.s((i14 * 2) + i11)));
                    }
                } else {
                    if (bool.booleanValue()) {
                        short[] sArr = new short[i13];
                        for (int i15 = 0; i15 < i13; i15++) {
                            sArr[i15] = iVar.f(((i14 + i15) * 2) + i11);
                        }
                        bVar.N(i14, sArr);
                    } else {
                        int[] iArr = new int[i13];
                        for (int i16 = 0; i16 < i13; i16++) {
                            iArr[i16] = iVar.s(((i14 + i16) * 2) + i11);
                        }
                        bVar.N(i14, iArr);
                    }
                    i14 += i13 - 1;
                }
            }
            i14++;
        }
    }

    private static void D(ic.l lVar, int i11, bc.i iVar) {
        int i12 = i11 + 8;
        try {
            lVar.T(0, iVar.r(i12, 8, bc.e.f7596a));
            lVar.J(9, iVar.u(i12 + 9));
            lVar.J(10, iVar.u(i12 + 10));
            lVar.J(12, iVar.s(i12 + 12));
            lVar.J(14, iVar.s(i12 + 14));
            lVar.J(16, iVar.s(i12 + 16));
            lVar.C(18, iVar.c(i12 + 18, 2));
            lVar.C(20, iVar.c(i12 + 20, 4));
            lVar.J(24, iVar.s(i12 + 24));
            lVar.J(27, iVar.u(i12 + 27));
            lVar.J(28, iVar.u(i12 + 28));
            lVar.J(29, iVar.u(i12 + 29));
            lVar.J(30, iVar.s(i12 + 30));
            lVar.L(32, iVar.t(i12 + 32));
            lVar.J(36, iVar.f(i12 + 36));
            lVar.J(56, iVar.u(i12 + 56));
            lVar.J(64, iVar.u(i12 + 64));
            lVar.J(92, iVar.u(i12 + 92));
            lVar.J(93, iVar.u(i12 + 93));
            lVar.J(94, iVar.s(i12 + 94));
            lVar.J(96, iVar.s(i12 + 96));
            lVar.J(98, iVar.s(i12 + 98));
            lVar.J(100, iVar.s(i12 + 100));
            lVar.J(102, iVar.s(i12 + 102));
            lVar.J(104, iVar.s(i12 + 104));
            lVar.J(107, iVar.j(i12 + 107));
        } catch (IOException e11) {
            lVar.a("Error processing Kodak makernote data: " + e11.getMessage());
        }
    }

    private boolean E(int i11, Set<Integer> set, int i12, bc.i iVar) {
        cc.b e11 = this.f7623d.e(d.class);
        String r11 = e11 == null ? null : e11.r(271);
        String A = A(iVar, i11, 2);
        String A2 = A(iVar, i11, 3);
        String A3 = A(iVar, i11, 4);
        String A4 = A(iVar, i11, 5);
        String A5 = A(iVar, i11, 6);
        String A6 = A(iVar, i11, 7);
        String A7 = A(iVar, i11, 8);
        String A8 = A(iVar, i11, 9);
        String A9 = A(iVar, i11, 10);
        String A10 = A(iVar, i11, 12);
        boolean v11 = iVar.v();
        if (!"OLYMP\u0000".equals(A5) && !"EPSON".equals(A4) && !"AGFA".equals(A3)) {
            if ("OLYMPUS\u0000II".equals(A9)) {
                z(f0.class);
                yb.d.b(this, iVar, set, i11 + 12, i11);
            } else if (r11 != null && r11.toUpperCase().startsWith("MINOLTA")) {
                z(f0.class);
                yb.d.b(this, iVar, set, i11, i12);
            } else if (r11 != null && r11.trim().toUpperCase().startsWith("NIKON")) {
                if ("Nikon".equals(A4)) {
                    short u11 = iVar.u(i11 + 6);
                    if (u11 == 1) {
                        z(ic.t.class);
                        yb.d.b(this, iVar, set, i11 + 8, i12);
                    } else if (u11 != 2) {
                        this.f7622c.a("Unsupported Nikon makernote data ignored.");
                    } else {
                        z(ic.v.class);
                        yb.d.b(this, iVar, set, i11 + 18, i11 + 10);
                    }
                } else {
                    z(ic.v.class);
                    yb.d.b(this, iVar, set, i11, i12);
                }
            } else if (!"SONY CAM".equals(A7) && !"SONY DSC".equals(A7)) {
                if (r11 != null && r11.startsWith("SONY") && !Arrays.equals(iVar.c(i11, 2), new byte[]{1, 0})) {
                    z(d1.class);
                    yb.d.b(this, iVar, set, i11, i12);
                } else if ("SEMC MS\u0000\u0000\u0000\u0000\u0000".equals(A10)) {
                    iVar.w(true);
                    z(f1.class);
                    yb.d.b(this, iVar, set, i11 + 20, i12);
                } else if (!"SIGMA\u0000\u0000\u0000".equals(A7) && !"FOVEON\u0000\u0000".equals(A7)) {
                    if ("KDK".equals(A2)) {
                        iVar.w(A6.equals("KDK INFO"));
                        ic.l lVar = new ic.l();
                        this.f7623d.a(lVar);
                        D(lVar, i11, iVar);
                    } else if ("Canon".equalsIgnoreCase(r11)) {
                        z(ic.d.class);
                        yb.d.b(this, iVar, set, i11, i12);
                    } else if (r11 != null && r11.toUpperCase().startsWith("CASIO")) {
                        if ("QVC\u0000\u0000\u0000".equals(A5)) {
                            z(ic.h.class);
                            yb.d.b(this, iVar, set, i11 + 6, i12);
                        } else {
                            z(ic.f.class);
                            yb.d.b(this, iVar, set, i11, i12);
                        }
                    } else if (!"FUJIFILM".equals(A7) && !"Fujifilm".equalsIgnoreCase(r11)) {
                        if ("KYOCERA".equals(A6)) {
                            z(ic.n.class);
                            yb.d.b(this, iVar, set, i11 + 22, i12);
                        } else if ("LEICA".equals(A4)) {
                            iVar.w(false);
                            if (!"LEICA\u0000\u0001\u0000".equals(A7) && !"LEICA\u0000\u0004\u0000".equals(A7) && !"LEICA\u0000\u0005\u0000".equals(A7) && !"LEICA\u0000\u0006\u0000".equals(A7) && !"LEICA\u0000\u0007\u0000".equals(A7)) {
                                if ("Leica Camera AG".equals(r11)) {
                                    z(ic.p.class);
                                    yb.d.b(this, iVar, set, i11 + 8, i12);
                                } else if (!"LEICA".equals(r11)) {
                                    return false;
                                } else {
                                    z(n0.class);
                                    yb.d.b(this, iVar, set, i11 + 8, i12);
                                }
                            } else {
                                z(ic.r.class);
                                yb.d.b(this, iVar, set, i11 + 8, i11);
                            }
                        } else if ("Panasonic\u0000\u0000\u0000".equals(A10)) {
                            z(n0.class);
                            yb.d.b(this, iVar, set, i11 + 12, i12);
                        } else if ("AOC\u0000".equals(A3)) {
                            z(ic.h.class);
                            yb.d.b(this, iVar, set, i11 + 6, i11);
                        } else if (r11 != null && (r11.toUpperCase().startsWith("PENTAX") || r11.toUpperCase().startsWith("ASAHI"))) {
                            z(p0.class);
                            yb.d.b(this, iVar, set, i11, i11);
                        } else if ("SANYO\u0000\u0001\u0000".equals(A7)) {
                            z(z0.class);
                            yb.d.b(this, iVar, set, i11 + 8, i11);
                        } else if (r11 != null && r11.toLowerCase().startsWith("ricoh")) {
                            if (A.equals("Rv") || A2.equals("Rev")) {
                                return false;
                            }
                            if (A4.equalsIgnoreCase("Ricoh")) {
                                iVar.w(true);
                                z(v0.class);
                                yb.d.b(this, iVar, set, i11 + 8, i11);
                            }
                        } else if (A9.equals("Apple iOS\u0000")) {
                            boolean v12 = iVar.v();
                            iVar.w(true);
                            z(ic.b.class);
                            yb.d.b(this, iVar, set, i11 + 14, i11);
                            iVar.w(v12);
                        } else if (iVar.s(i11) == 61697) {
                            r0 r0Var = new r0();
                            this.f7623d.a(r0Var);
                            G(r0Var, i11, iVar);
                        } else if (A8.equalsIgnoreCase("RECONYXUF")) {
                            t0 t0Var = new t0();
                            this.f7623d.a(t0Var);
                            H(t0Var, i11, iVar);
                        } else if (!"SAMSUNG".equals(r11)) {
                            return false;
                        } else {
                            z(x0.class);
                            yb.d.b(this, iVar, set, i11, i12);
                        }
                    } else {
                        iVar.w(false);
                        z(ic.j.class);
                        yb.d.b(this, iVar, set, iVar.h(i11 + 8) + i11, i11);
                    }
                } else {
                    z(b1.class);
                    yb.d.b(this, iVar, set, i11 + 10, i12);
                }
            } else {
                z(d1.class);
                yb.d.b(this, iVar, set, i11 + 12, i12);
            }
        } else {
            z(f0.class);
            yb.d.b(this, iVar, set, i11 + 8, i12);
        }
        iVar.w(v11);
        return true;
    }

    private static void F(z zVar, int i11, bc.i iVar, int i12) {
        int i13;
        Boolean bool;
        if (i12 == 0) {
            zVar.a("Empty PrintIM data");
        } else if (i12 <= 15) {
            zVar.a("Bad PrintIM data");
        } else {
            String q11 = iVar.q(i11, 12, bc.e.f7596a);
            if (!q11.startsWith("PrintIM")) {
                zVar.a("Invalid PrintIM header");
                return;
            }
            int i14 = i11 + 14;
            int s11 = iVar.s(i14);
            if (i12 < (s11 * 6) + 16) {
                bool = Boolean.valueOf(iVar.v());
                iVar.w(!iVar.v());
                i13 = iVar.s(i14);
                if (i12 < (i13 * 6) + 16) {
                    zVar.a("Bad PrintIM size");
                    return;
                }
            } else {
                i13 = s11;
                bool = null;
            }
            String substring = q11.substring(8, 12);
            zVar.M(0, substring);
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = i11 + 16 + (i15 * 6);
                zVar.M(iVar.s(i16), Long.valueOf(iVar.t(i16 + 2)));
            }
            if (bool != null) {
                iVar.w(bool.booleanValue());
            }
        }
    }

    private static void G(r0 r0Var, int i11, bc.i iVar) {
        Integer num;
        r0Var.M(0, Integer.valueOf(iVar.s(i11)));
        int i12 = i11 + 2;
        int s11 = iVar.s(i12);
        int s12 = iVar.s(i12 + 2);
        int s13 = iVar.s(i12 + 4);
        String str = String.format("%04X", Integer.valueOf(iVar.s(i12 + 6))) + String.format("%04X", Integer.valueOf(iVar.s(i12 + 8)));
        try {
            num = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            num = null;
        }
        if (num != null) {
            r0Var.R(2, String.format("%d.%d.%d.%s", Integer.valueOf(s11), Integer.valueOf(s12), Integer.valueOf(s13), num));
        } else {
            r0Var.R(2, String.format("%d.%d.%d", Integer.valueOf(s11), Integer.valueOf(s12), Integer.valueOf(s13)));
            r0Var.a("Error processing Reconyx HyperFire makernote data: build '" + str + "' is not in the expected format and will be omitted from Firmware Version.");
        }
        r0Var.R(12, String.valueOf((char) iVar.s(i11 + 12)));
        int i13 = i11 + 14;
        r0Var.K(14, new int[]{iVar.s(i13), iVar.s(i13 + 2)});
        int i14 = i11 + 18;
        r0Var.J(18, (iVar.s(i14) << 16) + iVar.s(i14 + 2));
        int i15 = i11 + 22;
        int s14 = iVar.s(i15);
        int s15 = iVar.s(i15 + 2);
        int s16 = iVar.s(i15 + 4);
        int s17 = iVar.s(i15 + 6);
        int s18 = iVar.s(i15 + 8);
        int s19 = iVar.s(i15 + 10);
        if (s14 < 0 || s14 >= 60 || s15 < 0 || s15 >= 60 || s16 < 0 || s16 >= 24 || s17 < 1 || s17 >= 13 || s18 < 1 || s18 >= 32 || s19 < 1 || s19 > 9999) {
            r0Var.a("Error processing Reconyx HyperFire makernote data: Date/Time Original " + s19 + "-" + s17 + "-" + s18 + " " + s16 + ":" + s15 + ":" + s14 + " is not a valid date/time.");
        } else {
            r0Var.R(22, String.format("%4d:%2d:%2d %2d:%2d:%2d", Integer.valueOf(s19), Integer.valueOf(s17), Integer.valueOf(s18), Integer.valueOf(s16), Integer.valueOf(s15), Integer.valueOf(s14)));
        }
        r0Var.J(36, iVar.s(i11 + 36));
        r0Var.J(38, iVar.f(i11 + 38));
        r0Var.J(40, iVar.f(i11 + 40));
        r0Var.T(42, new cc.f(iVar.c(i11 + 42, 28), bc.e.f7600e));
        r0Var.J(72, iVar.s(i11 + 72));
        r0Var.J(74, iVar.s(i11 + 74));
        r0Var.J(76, iVar.s(i11 + 76));
        r0Var.J(78, iVar.s(i11 + 78));
        r0Var.J(80, iVar.s(i11 + 80));
        r0Var.J(82, iVar.s(i11 + 82));
        r0Var.F(84, iVar.s(i11 + 84) / 1000.0d);
        r0Var.R(86, iVar.m(i11 + 86, 44, bc.e.f7596a));
    }

    private static void H(t0 t0Var, int i11, bc.i iVar) {
        Charset charset = bc.e.f7596a;
        t0Var.R(0, iVar.q(i11, 9, charset));
        t0Var.R(52, iVar.q(i11 + 52, 1, charset));
        int i12 = i11 + 53;
        t0Var.K(53, new int[]{iVar.b(i12), iVar.b(i12 + 1)});
        int i13 = i11 + 59;
        iVar.b(i13);
        iVar.b(i13 + 1);
        iVar.b(i13 + 2);
        iVar.b(i13 + 3);
        iVar.b(i13 + 4);
        t0Var.J(67, iVar.b(i11 + 67));
        t0Var.J(72, iVar.b(i11 + 72));
        t0Var.T(75, new cc.f(iVar.c(i11 + 75, 14), charset));
        t0Var.R(80, iVar.m(i11 + 80, 20, charset));
    }

    @Override // yb.b
    public boolean a() {
        cc.b bVar = this.f7622c;
        if (!(bVar instanceof d) && !(bVar instanceof f)) {
            return bVar instanceof m;
        }
        if (bVar.b(297)) {
            z(f.class);
        } else {
            z(m.class);
        }
        return true;
    }

    @Override // yb.b
    public Long b(int i11, int i12, long j11) {
        if (i12 == 13) {
            return Long.valueOf(j11 * 4);
        }
        return i12 == 0 ? 0L : null;
    }

    @Override // yb.b
    public boolean i(int i11) {
        if (i11 == 330) {
            z(k.class);
            return true;
        }
        cc.b bVar = this.f7622c;
        if ((bVar instanceof d) || (bVar instanceof t)) {
            if (i11 == 34665) {
                z(k.class);
                return true;
            } else if (i11 == 34853) {
                z(p.class);
                return true;
            }
        }
        if ((bVar instanceof k) && i11 == 40965) {
            z(h.class);
            return true;
        } else if (bVar instanceof f0) {
            if (i11 == 8208) {
                z(ic.z.class);
                return true;
            } else if (i11 == 8224) {
                z(ic.x.class);
                return true;
            } else if (i11 == 8256) {
                z(d0.class);
                return true;
            } else if (i11 == 8272) {
                z(b0.class);
                return true;
            } else if (i11 == 12288) {
                z(l0.class);
                return true;
            } else if (i11 == 16384) {
                z(f0.class);
                return true;
            } else if (i11 == 8240) {
                z(j0.class);
                return true;
            } else if (i11 != 8241) {
                return false;
            } else {
                z(h0.class);
                return true;
            }
        } else {
            return false;
        }
    }

    @Override // yb.b
    public boolean l(int i11, Set<Integer> set, int i12, bc.i iVar, int i13, int i14) {
        if (i13 == 0) {
            if (this.f7622c.b(i13)) {
                return false;
            }
            if (i14 == 0) {
                return true;
            }
        }
        if (i13 == 37500 && (this.f7622c instanceof k)) {
            return E(i11, set, i12, iVar);
        }
        if (i13 == 33723 && (this.f7622c instanceof d)) {
            if (iVar.j(i11) == 28) {
                byte[] c11 = iVar.c(i11, i14);
                new nc.c().d(new bc.l(c11), this.f7623d, c11.length, this.f7622c);
                return true;
            }
            return false;
        } else if (i13 == 700 && (this.f7622c instanceof d)) {
            new ed.c().g(iVar.l(i11, i14), this.f7623d, this.f7622c);
            return true;
        } else if (B(this.f7622c, i13)) {
            z zVar = new z();
            zVar.O(this.f7622c);
            this.f7623d.a(zVar);
            F(zVar, i11, iVar, i14);
            return true;
        } else {
            cc.b bVar = this.f7622c;
            if (bVar instanceof f0) {
                if (i13 == 8208) {
                    z(ic.z.class);
                    yb.d.b(this, iVar, set, i11, i12);
                    return true;
                } else if (i13 == 8224) {
                    z(ic.x.class);
                    yb.d.b(this, iVar, set, i11, i12);
                    return true;
                } else if (i13 == 8256) {
                    z(d0.class);
                    yb.d.b(this, iVar, set, i11, i12);
                    return true;
                } else if (i13 == 8272) {
                    z(b0.class);
                    yb.d.b(this, iVar, set, i11, i12);
                    return true;
                } else if (i13 == 12288) {
                    z(l0.class);
                    yb.d.b(this, iVar, set, i11, i12);
                    return true;
                } else if (i13 == 16384) {
                    z(f0.class);
                    yb.d.b(this, iVar, set, i11, i12);
                    return true;
                } else if (i13 == 8240) {
                    z(j0.class);
                    yb.d.b(this, iVar, set, i11, i12);
                    return true;
                } else if (i13 == 8241) {
                    z(h0.class);
                    yb.d.b(this, iVar, set, i11, i12);
                    return true;
                }
            }
            if (bVar instanceof t) {
                if (i13 == 19) {
                    x xVar = new x();
                    xVar.O(this.f7622c);
                    this.f7623d.a(xVar);
                    C(xVar, i11, iVar, i14, Boolean.FALSE, 2);
                    return true;
                } else if (i13 == 39) {
                    v vVar = new v();
                    vVar.O(this.f7622c);
                    this.f7623d.a(vVar);
                    C(vVar, i11, iVar, i14, Boolean.FALSE, 3);
                    return true;
                } else if (i13 == 281) {
                    r rVar = new r();
                    rVar.O(this.f7622c);
                    this.f7623d.a(rVar);
                    C(rVar, i11, iVar, i14, Boolean.TRUE, 1);
                    return true;
                }
            }
            if (i13 == 46 && (bVar instanceof t)) {
                try {
                    for (cc.b bVar2 : qb.a.c(new ByteArrayInputStream(iVar.c(i11, i14))).b()) {
                        bVar2.O(this.f7622c);
                        this.f7623d.a(bVar2);
                    }
                    return true;
                } catch (JpegProcessingException e11) {
                    cc.b bVar3 = this.f7622c;
                    bVar3.a("Error processing JpgFromRaw: " + e11.getMessage());
                } catch (IOException e12) {
                    cc.b bVar4 = this.f7622c;
                    bVar4.a("Error reading JpgFromRaw: " + e12.getMessage());
                }
            }
            return false;
        }
    }

    @Override // yb.b
    public void n(int i11) {
        if (i11 != 42) {
            if (i11 == 85) {
                z(t.class);
                return;
            } else if (i11 != 20306 && i11 != 21330) {
                throw new TiffProcessingException(String.format("Unexpected TIFF marker: 0x%X", Integer.valueOf(i11)));
            }
        }
        z(d.class);
    }
}