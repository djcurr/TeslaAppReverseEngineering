package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public class g extends n {

    /* renamed from: a  reason: collision with root package name */
    protected byte[] f43042a;

    public g(String str) {
        this.f43042a = r70.m.f(str);
        try {
            s();
        } catch (ParseException e11) {
            throw new IllegalArgumentException("invalid date string: " + e11.getMessage());
        }
    }

    public g(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", p1.f43080c);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.f43042a = r70.m.f(simpleDateFormat.format(date));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f43042a = bArr;
        if (!z(0) || !z(1) || !z(2) || !z(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    private String A(String str) {
        String str2;
        StringBuilder sb2;
        char charAt;
        String substring = str.substring(14);
        int i11 = 1;
        while (i11 < substring.length() && '0' <= (charAt = substring.charAt(i11)) && charAt <= '9') {
            i11++;
        }
        int i12 = i11 - 1;
        if (i12 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i11);
            sb2 = new StringBuilder();
        } else if (i12 == 1) {
            str2 = substring.substring(0, i11) + "00" + substring.substring(i11);
            sb2 = new StringBuilder();
        } else if (i12 != 2) {
            return str;
        } else {
            str2 = substring.substring(0, i11) + "0" + substring.substring(i11);
            sb2 = new StringBuilder();
        }
        sb2.append(str.substring(0, 14));
        sb2.append(str2);
        return sb2.toString();
    }

    private SimpleDateFormat p() {
        SimpleDateFormat simpleDateFormat = w() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : y() ? new SimpleDateFormat("yyyyMMddHHmmssz") : x() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private String q(String str) {
        String str2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = Marker.ANY_NON_NULL_MARKER;
        }
        int i11 = rawOffset / 3600000;
        int i12 = (rawOffset - (((i11 * 60) * 60) * 1000)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (w()) {
                    str = A(str);
                }
                SimpleDateFormat p11 = p();
                if (timeZone.inDaylightTime(p11.parse(str + "GMT" + str2 + r(i11) + ":" + r(i12)))) {
                    i11 += str2.equals(Marker.ANY_NON_NULL_MARKER) ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + r(i11) + ":" + r(i12);
    }

    private String r(int i11) {
        if (i11 < 10) {
            return "0" + i11;
        }
        return Integer.toString(i11);
    }

    public static g t(Object obj) {
        if (obj == null || (obj instanceof g)) {
            return (g) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (g) n.k((byte[]) obj);
        } catch (Exception e11) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
        }
    }

    public static g u(s sVar, boolean z11) {
        n r11 = sVar.r();
        return (z11 || (r11 instanceof g)) ? t(r11) : new g(l.p(r11).r());
    }

    private boolean z(int i11) {
        byte[] bArr = this.f43042a;
        return bArr.length > i11 && bArr[i11] >= 48 && bArr[i11] <= 57;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof g) {
            return org.bouncycastle.util.a.c(this.f43042a, ((g) nVar).f43042a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 24, this.f43042a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int length = this.f43042a.length;
        return v1.a(length) + 1 + length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43042a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n n() {
        return new n0(this.f43042a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n o() {
        return new n0(this.f43042a);
    }

    public Date s() {
        SimpleDateFormat p11;
        String b11 = r70.m.b(this.f43042a);
        if (b11.endsWith("Z")) {
            p11 = w() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : y() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : x() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            p11.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (b11.indexOf(45) > 0 || b11.indexOf(43) > 0) {
            b11 = v();
            p11 = p();
        } else {
            p11 = w() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : y() ? new SimpleDateFormat("yyyyMMddHHmmss") : x() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            p11.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (w()) {
            b11 = A(b11);
        }
        return p1.a(p11.parse(b11));
    }

    public String v() {
        int length;
        String b11 = r70.m.b(this.f43042a);
        if (b11.charAt(b11.length() - 1) == 'Z') {
            return b11.substring(0, b11.length() - 1) + "GMT+00:00";
        }
        int length2 = b11.length() - 6;
        char charAt = b11.charAt(length2);
        if ((charAt == '-' || charAt == '+') && b11.indexOf("GMT") == length2 - 3) {
            return b11;
        }
        int length3 = b11.length() - 5;
        char charAt2 = b11.charAt(length3);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b11.substring(0, length3));
            sb2.append("GMT");
            int i11 = length3 + 3;
            sb2.append(b11.substring(length3, i11));
            sb2.append(":");
            sb2.append(b11.substring(i11));
            return sb2.toString();
        }
        char charAt3 = b11.charAt(b11.length() - 3);
        if (charAt3 != '-' && charAt3 != '+') {
            return b11 + q(b11);
        }
        return b11.substring(0, length) + "GMT" + b11.substring(length) + ":00";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean w() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f43042a;
            if (i11 == bArr.length) {
                return false;
            }
            if (bArr[i11] == 46 && i11 == 14) {
                return true;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x() {
        return z(10) && z(11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean y() {
        return z(12) && z(13);
    }
}