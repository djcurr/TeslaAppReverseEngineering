package org.bouncycastle.asn1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes5.dex */
public class t extends n {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f43103a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f43103a = bArr;
        if (!s(0) || !s(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    private boolean s(int i11) {
        byte[] bArr = this.f43103a;
        return bArr.length > i11 && bArr[i11] >= 48 && bArr[i11] <= 57;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof t) {
            return org.bouncycastle.util.a.c(this.f43103a, ((t) nVar).f43103a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 23, this.f43103a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int length = this.f43103a.length;
        return v1.a(length) + 1 + length;
    }

    @Override // e40.c
    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f43103a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    public Date p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return p1.a(simpleDateFormat.parse(q()));
    }

    public String q() {
        StringBuilder sb2;
        String str;
        String r11 = r();
        if (r11.charAt(0) < '5') {
            sb2 = new StringBuilder();
            str = "20";
        } else {
            sb2 = new StringBuilder();
            str = "19";
        }
        sb2.append(str);
        sb2.append(r11);
        return sb2.toString();
    }

    public String r() {
        StringBuilder sb2;
        String substring;
        String b11 = r70.m.b(this.f43103a);
        if (b11.indexOf(45) >= 0 || b11.indexOf(43) >= 0) {
            int indexOf = b11.indexOf(45);
            if (indexOf < 0) {
                indexOf = b11.indexOf(43);
            }
            if (indexOf == b11.length() - 3) {
                b11 = b11 + "00";
            }
            if (indexOf == 10) {
                sb2 = new StringBuilder();
                sb2.append(b11.substring(0, 10));
                sb2.append("00GMT");
                sb2.append(b11.substring(10, 13));
                sb2.append(":");
                substring = b11.substring(13, 15);
            } else {
                sb2 = new StringBuilder();
                sb2.append(b11.substring(0, 12));
                sb2.append("GMT");
                sb2.append(b11.substring(12, 15));
                sb2.append(":");
                substring = b11.substring(15, 17);
            }
        } else if (b11.length() == 11) {
            sb2 = new StringBuilder();
            sb2.append(b11.substring(0, 10));
            substring = "00GMT+00:00";
        } else {
            sb2 = new StringBuilder();
            sb2.append(b11.substring(0, 12));
            substring = "GMT+00:00";
        }
        sb2.append(substring);
        return sb2.toString();
    }

    public String toString() {
        return r70.m.b(this.f43103a);
    }
}