package oc;

import cc.h;
import expo.modules.interfaces.permissions.PermissionsResponse;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 5) {
            if (i11 != 10) {
                if (i11 != 7) {
                    if (i11 != 8) {
                        return super.f(i11);
                    }
                    return w();
                }
                return v();
            }
            return x();
        }
        return y();
    }

    public String v() {
        Integer l11 = ((b) this.f9060a).l(7);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? "unit" : "centimetre" : "inch" : PermissionsResponse.SCOPE_NONE;
    }

    public String w() {
        Integer l11 = ((b) this.f9060a).l(8);
        if (l11 == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = l11;
        objArr[1] = l11.intValue() == 1 ? "" : "s";
        return String.format("%d dot%s", objArr);
    }

    public String x() {
        Integer l11 = ((b) this.f9060a).l(10);
        if (l11 == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = l11;
        objArr[1] = l11.intValue() == 1 ? "" : "s";
        return String.format("%d dot%s", objArr);
    }

    public String y() {
        Integer l11 = ((b) this.f9060a).l(5);
        if (l11 == null) {
            return null;
        }
        return String.format("%d.%d", Integer.valueOf((l11.intValue() & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8), Integer.valueOf(l11.intValue() & 255));
    }
}