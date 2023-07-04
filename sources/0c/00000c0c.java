package b50;

import ch.qos.logback.core.joran.action.ActionConst;
import e40.b;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.d0;
import org.bouncycastle.asn1.d1;
import org.bouncycastle.asn1.e;
import org.bouncycastle.asn1.e1;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.f0;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.i0;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.o0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.p0;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.v0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.x;
import org.bouncycastle.asn1.x0;
import org.bouncycastle.asn1.y0;
import org.spongycastle.asn1.ASN1Encoding;
import r70.m;

/* loaded from: classes5.dex */
public class a {
    static void a(String str, boolean z11, n nVar, StringBuffer stringBuffer) {
        StringBuilder sb2;
        BigInteger s11;
        String str2;
        String f11;
        String v11;
        StringBuilder sb3;
        int length;
        String d11 = m.d();
        if (nVar instanceof p) {
            Enumeration s12 = ((p) nVar).s();
            String str3 = str + "    ";
            stringBuffer.append(str);
            stringBuffer.append(nVar instanceof b0 ? "BER Sequence" : nVar instanceof w0 ? "DER Sequence" : "Sequence");
            while (true) {
                stringBuffer.append(d11);
                while (s12.hasMoreElements()) {
                    Object nextElement = s12.nextElement();
                    if (nextElement == null || nextElement.equals(q0.f43085a)) {
                        stringBuffer.append(str3);
                        stringBuffer.append(ActionConst.NULL);
                    } else {
                        a(str3, z11, nextElement instanceof n ? (n) nextElement : ((b) nextElement).toASN1Primitive(), stringBuffer);
                    }
                }
                return;
            }
        } else if (nVar instanceof s) {
            String str4 = str + "    ";
            stringBuffer.append(str);
            stringBuffer.append(nVar instanceof f0 ? "BER Tagged [" : "Tagged [");
            s sVar = (s) nVar;
            stringBuffer.append(Integer.toString(sVar.s()));
            stringBuffer.append(']');
            if (!sVar.t()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(d11);
            a(str4, z11, sVar.r(), stringBuffer);
        } else if (!(nVar instanceof q)) {
            if (nVar instanceof l) {
                l lVar = (l) nVar;
                if (nVar instanceof x) {
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("BER Constructed Octet String[");
                    length = lVar.r().length;
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append("DER Octet String[");
                    length = lVar.r().length;
                }
                sb3.append(length);
                sb3.append("] ");
                stringBuffer.append(sb3.toString());
                if (z11) {
                    f11 = e(str, lVar.r());
                    stringBuffer.append(f11);
                }
                stringBuffer.append(d11);
                return;
            }
            if (nVar instanceof k) {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("ObjectIdentifier(");
                sb2.append(((k) nVar).t());
            } else if (nVar instanceof c) {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("Boolean(");
                sb2.append(((c) nVar).t());
            } else {
                if (!(nVar instanceof i)) {
                    if (nVar instanceof j0) {
                        j0 j0Var = (j0) nVar;
                        stringBuffer.append(str + "DER Bit String[" + j0Var.q().length + ", " + j0Var.s() + "] ");
                        if (z11) {
                            f11 = e(str, j0Var.q());
                        }
                        stringBuffer.append(d11);
                        return;
                    }
                    if (nVar instanceof p0) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("IA5String(");
                        v11 = ((p0) nVar).getString();
                    } else if (nVar instanceof a1) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("UTF8String(");
                        v11 = ((a1) nVar).getString();
                    } else if (nVar instanceof v0) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("PrintableString(");
                        v11 = ((v0) nVar).getString();
                    } else if (nVar instanceof d1) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("VisibleString(");
                        v11 = ((d1) nVar).getString();
                    } else if (nVar instanceof i0) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("BMPString(");
                        v11 = ((i0) nVar).getString();
                    } else if (nVar instanceof y0) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("T61String(");
                        v11 = ((y0) nVar).getString();
                    } else if (nVar instanceof o0) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("GraphicString(");
                        v11 = ((o0) nVar).getString();
                    } else if (nVar instanceof c1) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("VideotexString(");
                        v11 = ((c1) nVar).getString();
                    } else if (nVar instanceof t) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("UTCTime(");
                        v11 = ((t) nVar).r();
                    } else if (nVar instanceof g) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("GeneralizedTime(");
                        v11 = ((g) nVar).v();
                    } else {
                        if (nVar instanceof u) {
                            str2 = ASN1Encoding.BER;
                        } else if (nVar instanceof e1) {
                            str2 = "";
                        } else if (nVar instanceof e) {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append("DER Enumerated(");
                            s11 = ((e) nVar).s();
                        } else if (nVar instanceof f) {
                            f fVar = (f) nVar;
                            stringBuffer.append(str + "External " + d11);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str);
                            sb4.append("    ");
                            String sb5 = sb4.toString();
                            if (fVar.q() != null) {
                                stringBuffer.append(sb5 + "Direct Reference: " + fVar.q().t() + d11);
                            }
                            if (fVar.t() != null) {
                                stringBuffer.append(sb5 + "Indirect Reference: " + fVar.t().toString() + d11);
                            }
                            if (fVar.p() != null) {
                                a(sb5, z11, fVar.p(), stringBuffer);
                            }
                            stringBuffer.append(sb5 + "Encoding: " + fVar.r() + d11);
                            a(sb5, z11, fVar.s(), stringBuffer);
                            return;
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(nVar.toString());
                            sb2.append(d11);
                            f11 = sb2.toString();
                        }
                        f11 = f(str2, str, z11, nVar, d11);
                    }
                    sb2.append(v11);
                    sb2.append(") ");
                    sb2.append(d11);
                    f11 = sb2.toString();
                    stringBuffer.append(f11);
                }
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("Integer(");
                s11 = ((i) nVar).s();
                sb2.append(s11);
            }
            sb2.append(")");
            sb2.append(d11);
            f11 = sb2.toString();
            stringBuffer.append(f11);
        } else {
            Enumeration t11 = ((q) nVar).t();
            String str5 = str + "    ";
            stringBuffer.append(str);
            stringBuffer.append(nVar instanceof d0 ? "BER Set" : nVar instanceof x0 ? "DER Set" : "Set");
            while (true) {
                stringBuffer.append(d11);
                while (t11.hasMoreElements()) {
                    Object nextElement2 = t11.nextElement();
                    if (nextElement2 == null) {
                        break;
                    }
                    a(str5, z11, nextElement2 instanceof n ? (n) nextElement2 : ((b) nextElement2).toASN1Primitive(), stringBuffer);
                }
                return;
                stringBuffer.append(str5);
                stringBuffer.append(ActionConst.NULL);
            }
        }
    }

    private static String b(byte[] bArr, int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i13 = i11; i13 != i11 + i12; i13++) {
            if (bArr[i13] >= 32 && bArr[i13] <= 126) {
                stringBuffer.append((char) bArr[i13]);
            }
        }
        return stringBuffer.toString();
    }

    public static String c(Object obj) {
        return d(obj, false);
    }

    public static String d(Object obj, boolean z11) {
        n aSN1Primitive;
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof n) {
            aSN1Primitive = (n) obj;
        } else if (!(obj instanceof b)) {
            return "unknown object type " + obj.toString();
        } else {
            aSN1Primitive = ((b) obj).toASN1Primitive();
        }
        a("", z11, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }

    private static String e(String str, byte[] bArr) {
        String b11;
        String d11 = m.d();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + "    ";
        stringBuffer.append(d11);
        for (int i11 = 0; i11 < bArr.length; i11 += 32) {
            int length = bArr.length - i11;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(m.b(org.bouncycastle.util.encoders.b.e(bArr, i11, 32)));
                stringBuffer.append("    ");
                b11 = b(bArr, i11, 32);
            } else {
                stringBuffer.append(m.b(org.bouncycastle.util.encoders.b.e(bArr, i11, bArr.length - i11)));
                for (int length2 = bArr.length - i11; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                b11 = b(bArr, i11, bArr.length - i11);
            }
            stringBuffer.append(b11);
            stringBuffer.append(d11);
        }
        return stringBuffer.toString();
    }

    private static String f(String str, String str2, boolean z11, n nVar, String str3) {
        org.bouncycastle.asn1.a r11 = org.bouncycastle.asn1.a.r(nVar);
        StringBuffer stringBuffer = new StringBuffer();
        if (!r11.m()) {
            return str2 + str + " ApplicationSpecific[" + r11.p() + "] (" + m.b(org.bouncycastle.util.encoders.b.d(r11.q())) + ")" + str3;
        }
        try {
            p p11 = p.p(r11.s(16));
            stringBuffer.append(str2 + str + " ApplicationSpecific[" + r11.p() + "]" + str3);
            Enumeration s11 = p11.s();
            while (s11.hasMoreElements()) {
                a(str2 + "    ", z11, (n) s11.nextElement(), stringBuffer);
            }
        } catch (IOException e11) {
            stringBuffer.append(e11);
        }
        return stringBuffer.toString();
    }
}