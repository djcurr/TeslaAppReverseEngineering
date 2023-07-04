package zc;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d extends cc.h<e> {
    public d(e eVar) {
        super(eVar);
    }

    private String E(int i11) {
        byte[] e11 = ((e) this.f9060a).e(i11);
        if (e11 == null) {
            return null;
        }
        return new String(e11);
    }

    private String v(int i11) {
        byte[] e11 = ((e) this.f9060a).e(i11);
        if (e11 == null) {
            return null;
        }
        try {
            return String.format("%d", Integer.valueOf(new bc.a(e11).h(0)));
        } catch (IOException unused) {
            return null;
        }
    }

    private String w(int i11) {
        byte[] e11 = ((e) this.f9060a).e(i11);
        if (e11 == null) {
            return null;
        }
        return String.format("%d bytes binary data", Integer.valueOf(e11.length));
    }

    private String x(int i11) {
        byte[] e11 = ((e) this.f9060a).e(i11);
        if (e11 == null || e11.length == 0) {
            return null;
        }
        return e11[0] == 0 ? "No" : "Yes";
    }

    public String A(int i11) {
        String str;
        String str2;
        int i12;
        int i13;
        bc.a aVar;
        k kVar;
        short s11;
        c cVar;
        bc.a aVar2;
        bc.a aVar3;
        k kVar2;
        c cVar2;
        String str3 = ")";
        String str4 = ",";
        try {
            byte[] e11 = ((e) this.f9060a).e(i11);
            if (e11 == null) {
                return null;
            }
            bc.a aVar4 = new bc.a(e11);
            short s12 = 1;
            int k11 = ((int) ((aVar4.k() - aVar4.b(((int) aVar4.k()) - 1)) - 1)) / 26;
            k kVar3 = new k();
            k kVar4 = new k();
            ArrayList arrayList = new ArrayList();
            String str5 = null;
            int i14 = 0;
            while (i14 < k11) {
                int i15 = i14 * 26;
                try {
                    short f11 = aVar4.f(i15);
                    if (f11 != 0) {
                        i13 = i14;
                        if (f11 == s12) {
                            str = str3;
                            str2 = str4;
                            i12 = k11;
                            aVar = aVar4;
                            kVar = kVar3;
                            s11 = s12;
                        } else if (f11 != 2) {
                            if (f11 != 3) {
                                short s13 = 4;
                                if (f11 != 4) {
                                    if (f11 != 5) {
                                        if (f11 == 8) {
                                            str5 = aVar4.f(i15 + 2) == 1 ? "with all pixels" : "without all pixels";
                                        }
                                        str = str3;
                                        str2 = str4;
                                        i12 = k11;
                                    } else {
                                        s13 = 4;
                                    }
                                }
                                if (f11 == s13) {
                                    cVar2 = new c("Linked");
                                } else {
                                    cVar2 = new c("Unlinked");
                                }
                                int i16 = 0;
                                while (i16 < 6) {
                                    int i17 = i16 * 4;
                                    cVar2.c(i16, aVar4.j(i17 + 2 + i15) + (aVar4.g((i17 + 3) + i15) / Math.pow(2.0d, 24.0d)));
                                    i16++;
                                    k11 = k11;
                                    str3 = str3;
                                    str4 = str4;
                                    aVar4 = aVar4;
                                    kVar3 = kVar3;
                                }
                                str = str3;
                                str2 = str4;
                                i12 = k11;
                                aVar3 = aVar4;
                                kVar2 = kVar3;
                                kVar4.a(cVar2);
                            } else {
                                str = str3;
                                str2 = str4;
                                i12 = k11;
                                aVar3 = aVar4;
                                kVar2 = kVar3;
                                if (kVar4.d() != 0) {
                                    arrayList.add(kVar4);
                                }
                                kVar4 = new k("Open Subpath");
                            }
                            aVar4 = aVar3;
                            kVar3 = kVar2;
                        } else {
                            str = str3;
                            str2 = str4;
                            i12 = k11;
                            aVar = aVar4;
                            kVar = kVar3;
                            s11 = 1;
                        }
                        if (f11 == s11) {
                            cVar = new c("Linked");
                        } else {
                            cVar = new c("Unlinked");
                        }
                        int i18 = 0;
                        while (i18 < 6) {
                            int i19 = i18 * 4;
                            cVar.c(i18, aVar2.j(i19 + 2 + i15) + (aVar2.g((i19 + 3) + i15) / Math.pow(2.0d, 24.0d)));
                            i18++;
                            i15 = i15;
                            aVar = aVar;
                        }
                        aVar4 = aVar;
                        kVar3 = kVar;
                        kVar3.a(cVar);
                    } else {
                        str = str3;
                        str2 = str4;
                        i12 = k11;
                        i13 = i14;
                        if (kVar3.d() != 0) {
                            arrayList.add(kVar3);
                        }
                        kVar3 = new k("Closed Subpath");
                    }
                    i14 = i13 + 1;
                    k11 = i12;
                    str3 = str;
                    str4 = str2;
                    s12 = 1;
                } catch (Exception unused) {
                    return null;
                }
            }
            String str6 = str3;
            String str7 = str4;
            if (kVar3.d() != 0) {
                arrayList.add(kVar3);
            }
            if (kVar4.d() != 0) {
                arrayList.add(kVar4);
            }
            byte b11 = aVar4.b(((int) aVar4.k()) - 1);
            String q11 = aVar4.q((((int) aVar4.k()) - b11) - 1, b11, bc.e.f7598c);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            sb2.append(q11);
            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            sb2.append(" having ");
            if (str5 != null) {
                sb2.append("initial fill rule \"");
                sb2.append(str5);
                sb2.append("\" and ");
            }
            sb2.append(arrayList.size());
            sb2.append(arrayList.size() == 1 ? " subpath:" : " subpaths:");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                k kVar5 = (k) it2.next();
                sb2.append("\n- ");
                sb2.append(kVar5.c());
                sb2.append(" with ");
                sb2.append(arrayList.size());
                sb2.append(arrayList.size() == 1 ? " knot:" : " knots:");
                for (c cVar3 : kVar5.b()) {
                    sb2.append("\n  - ");
                    sb2.append(cVar3.b());
                    sb2.append(" (");
                    sb2.append(cVar3.a(0));
                    String str8 = str7;
                    sb2.append(str8);
                    sb2.append(cVar3.a(1));
                    String str9 = str6;
                    sb2.append(str9);
                    sb2.append(" (");
                    sb2.append(cVar3.a(2));
                    sb2.append(str8);
                    sb2.append(cVar3.a(3));
                    sb2.append(str9);
                    sb2.append(" (");
                    sb2.append(cVar3.a(4));
                    sb2.append(str8);
                    sb2.append(cVar3.a(5));
                    sb2.append(str9);
                    str7 = str8;
                    str6 = str9;
                }
            }
            return sb2.toString();
        } catch (Exception unused2) {
            return null;
        }
    }

    public String B() {
        try {
            byte[] e11 = ((e) this.f9060a).e(1064);
            if (e11 == null) {
                return null;
            }
            return Double.toString(new bc.a(e11).d(4));
        } catch (Exception unused) {
            return null;
        }
    }

    public String C() {
        try {
            byte[] e11 = ((e) this.f9060a).e(1062);
            if (e11 == null) {
                return null;
            }
            bc.a aVar = new bc.a(e11);
            int h11 = aVar.h(0);
            float e12 = aVar.e(2);
            float e13 = aVar.e(6);
            float e14 = aVar.e(10);
            if (h11 != 0) {
                return h11 != 1 ? h11 != 2 ? String.format("Unknown %04X, X:%s Y:%s, Scale:%s", Integer.valueOf(h11), Float.valueOf(e12), Float.valueOf(e13), Float.valueOf(e14)) : String.format("User defined, X:%s Y:%s, Scale:%s", Float.valueOf(e12), Float.valueOf(e13), Float.valueOf(e14)) : "Size to fit";
            }
            return "Centered, Scale " + e14;
        } catch (Exception unused) {
            return null;
        }
    }

    public String D() {
        try {
            byte[] e11 = ((e) this.f9060a).e(1005);
            if (e11 == null) {
                return null;
            }
            bc.a aVar = new bc.a(e11);
            float o11 = aVar.o(0);
            float o12 = aVar.o(8);
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            return decimalFormat.format(o11) + "x" + decimalFormat.format(o12) + " DPI";
        } catch (Exception unused) {
            return null;
        }
    }

    public String F() {
        try {
            byte[] e11 = ((e) this.f9060a).e(1050);
            if (e11 == null) {
                return null;
            }
            bc.a aVar = new bc.a(e11);
            int h11 = aVar.h(20) * 2;
            return String.format("%s (%d,%d,%d,%d) %d Slices", aVar.p(24, h11, "UTF-16"), Integer.valueOf(aVar.h(4)), Integer.valueOf(aVar.h(8)), Integer.valueOf(aVar.h(12)), Integer.valueOf(aVar.h(16)), Integer.valueOf(aVar.h(h11 + 24)));
        } catch (IOException unused) {
            return null;
        }
    }

    public String G(int i11) {
        try {
            byte[] e11 = ((e) this.f9060a).e(i11);
            if (e11 == null) {
                return null;
            }
            bc.a aVar = new bc.a(e11);
            int h11 = aVar.h(0);
            int h12 = aVar.h(4);
            int h13 = aVar.h(8);
            int h14 = aVar.h(16);
            int h15 = aVar.h(20);
            int h16 = aVar.h(24);
            Object[] objArr = new Object[6];
            objArr[0] = h11 == 1 ? "JpegRGB" : "RawRGB";
            objArr[1] = Integer.valueOf(h12);
            objArr[2] = Integer.valueOf(h13);
            objArr[3] = Integer.valueOf(h14);
            objArr[4] = Integer.valueOf(h16);
            objArr[5] = Integer.valueOf(h15);
            return String.format("%s, %dx%d, Decomp %d bytes, %d bpp, %d bytes", objArr);
        } catch (IOException unused) {
            return null;
        }
    }

    public String H() {
        try {
            byte[] e11 = ((e) this.f9060a).e(1057);
            if (e11 == null) {
                return null;
            }
            bc.a aVar = new bc.a(e11);
            int h11 = aVar.h(0);
            int h12 = aVar.h(5) * 2;
            String p11 = aVar.p(9, h12, "UTF-16");
            int i11 = 9 + h12;
            int h13 = aVar.h(i11);
            int i12 = i11 + 4;
            int i13 = h13 * 2;
            return String.format("%d (%s, %s) %d", Integer.valueOf(h11), p11, aVar.p(i12, i13, "UTF-16"), Integer.valueOf(aVar.h(i12 + i13)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1002) {
            if (i11 != 1005) {
                if (i11 != 1028) {
                    if (i11 != 1030) {
                        if (i11 != 1044 && i11 != 1054) {
                            if (i11 == 1057) {
                                return H();
                            }
                            if (i11 == 1062) {
                                return C();
                            }
                            if (i11 == 1064) {
                                return B();
                            }
                            if (i11 == 2999) {
                                return y(i11);
                            }
                            if (i11 != 1049) {
                                if (i11 != 1050) {
                                    switch (i11) {
                                        case 1033:
                                        case 1036:
                                            return G(i11);
                                        case 1034:
                                            return x(i11);
                                        case 1035:
                                            break;
                                        case 1037:
                                            break;
                                        default:
                                            if (i11 >= 2000 && i11 <= 2998) {
                                                return A(i11);
                                            }
                                            return super.f(i11);
                                    }
                                } else {
                                    return F();
                                }
                            }
                        }
                        return v(i11);
                    }
                    return z();
                }
                return w(i11);
            }
            return D();
        }
        return E(i11);
    }

    public String y(int i11) {
        try {
            byte[] e11 = ((e) this.f9060a).e(i11);
            if (e11 == null) {
                return null;
            }
            bc.a aVar = new bc.a(e11);
            return new String(aVar.c(1, aVar.b(0)), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String z() {
        /*
            r11 = this;
            T extends cc.b r0 = r11.f9060a     // Catch: java.io.IOException -> Lab
            zc.e r0 = (zc.e) r0     // Catch: java.io.IOException -> Lab
            r1 = 1030(0x406, float:1.443E-42)
            byte[] r0 = r0.e(r1)     // Catch: java.io.IOException -> Lab
            if (r0 != 0) goto L15
            T extends cc.b r0 = r11.f9060a     // Catch: java.io.IOException -> Lab
            zc.e r0 = (zc.e) r0     // Catch: java.io.IOException -> Lab
            java.lang.String r0 = r0.r(r1)     // Catch: java.io.IOException -> Lab
            return r0
        L15:
            bc.a r1 = new bc.a     // Catch: java.io.IOException -> Lab
            r1.<init>(r0)     // Catch: java.io.IOException -> Lab
            r0 = 0
            int r2 = r1.s(r0)     // Catch: java.io.IOException -> Lab
            r3 = 2
            int r4 = r1.s(r3)     // Catch: java.io.IOException -> Lab
            r5 = 4
            int r1 = r1.s(r5)     // Catch: java.io.IOException -> Lab
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r2 > r6) goto L39
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r2 < r6) goto L39
            r6 = 65532(0xfffc, float:9.183E-41)
            int r6 = r2 - r6
            goto L41
        L39:
            r6 = 8
            if (r2 > r6) goto L40
            int r6 = r2 + 4
            goto L41
        L40:
            r6 = r2
        L41:
            switch(r2) {
                case 0: goto L53;
                case 1: goto L50;
                case 2: goto L50;
                case 3: goto L50;
                case 4: goto L4d;
                case 5: goto L4d;
                case 6: goto L4a;
                case 7: goto L4a;
                case 8: goto L4a;
                default: goto L44;
            }     // Catch: java.io.IOException -> Lab
        L44:
            switch(r2) {
                case 65533: goto L53;
                case 65534: goto L53;
                case 65535: goto L53;
                default: goto L47;
            }     // Catch: java.io.IOException -> Lab
        L47:
            java.lang.String r2 = "Unknown"
            goto L55
        L4a:
            java.lang.String r2 = "Maximum"
            goto L55
        L4d:
            java.lang.String r2 = "High"
            goto L55
        L50:
            java.lang.String r2 = "Medium"
            goto L55
        L53:
            java.lang.String r2 = "Low"
        L55:
            java.lang.String r7 = "Unknown 0x%04X"
            r8 = 1
            if (r4 == 0) goto L73
            if (r4 == r8) goto L70
            r9 = 257(0x101, float:3.6E-43)
            if (r4 == r9) goto L6d
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.io.IOException -> Lab
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.io.IOException -> Lab
            r9[r0] = r4     // Catch: java.io.IOException -> Lab
            java.lang.String r4 = java.lang.String.format(r7, r9)     // Catch: java.io.IOException -> Lab
            goto L75
        L6d:
            java.lang.String r4 = "Progressive"
            goto L75
        L70:
            java.lang.String r4 = "Optimised"
            goto L75
        L73:
            java.lang.String r4 = "Standard"
        L75:
            r9 = 3
            if (r1 < r8) goto L8a
            if (r1 > r9) goto L8a
            java.lang.String r7 = "%d"
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch: java.io.IOException -> Lab
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> Lab
            r10[r0] = r1     // Catch: java.io.IOException -> Lab
            java.lang.String r1 = java.lang.String.format(r7, r10)     // Catch: java.io.IOException -> Lab
            goto L96
        L8a:
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch: java.io.IOException -> Lab
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> Lab
            r10[r0] = r1     // Catch: java.io.IOException -> Lab
            java.lang.String r1 = java.lang.String.format(r7, r10)     // Catch: java.io.IOException -> Lab
        L96:
            java.lang.String r7 = "%d (%s), %s format, %s scans"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.io.IOException -> Lab
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.io.IOException -> Lab
            r5[r0] = r6     // Catch: java.io.IOException -> Lab
            r5[r8] = r2     // Catch: java.io.IOException -> Lab
            r5[r3] = r4     // Catch: java.io.IOException -> Lab
            r5[r9] = r1     // Catch: java.io.IOException -> Lab
            java.lang.String r0 = java.lang.String.format(r7, r5)     // Catch: java.io.IOException -> Lab
            return r0
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d.z():java.lang.String");
    }
}