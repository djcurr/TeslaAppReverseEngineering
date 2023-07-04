package org.bouncycastle.jcajce.provider.asymmetric.util;

import e50.b;
import e50.m0;
import org.spongycastle.asn1.ASN1Encoding;
import w40.p;

/* loaded from: classes5.dex */
public class KeyUtil {
    public static byte[] getEncodedPrivateKeyInfo(b bVar, e40.b bVar2) {
        try {
            return getEncodedPrivateKeyInfo(new p(bVar, bVar2.toASN1Primitive()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(p pVar) {
        try {
            return pVar.d(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(b bVar, e40.b bVar2) {
        try {
            return getEncodedSubjectPublicKeyInfo(new m0(bVar, bVar2));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(b bVar, byte[] bArr) {
        try {
            return getEncodedSubjectPublicKeyInfo(new m0(bVar, bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(m0 m0Var) {
        try {
            return m0Var.d(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }
}