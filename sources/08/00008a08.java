package n70;

import e50.b;
import e50.m0;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class a {
    public static byte[] a(b bVar, e40.b bVar2) {
        try {
            return b(new m0(bVar, bVar2));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(m0 m0Var) {
        try {
            return m0Var.d(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }
}