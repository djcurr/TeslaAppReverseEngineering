package org.spongycastle.jce;

import java.io.IOException;
import java.security.Principal;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.X509Name;

/* loaded from: classes4.dex */
public class X509Principal extends X509Name implements Principal {
    public X509Principal(byte[] bArr) {
        super(readSequence(new ASN1InputStream(bArr)));
    }

    private static ASN1Sequence readSequence(ASN1InputStream aSN1InputStream) {
        try {
            return ASN1Sequence.getInstance(aSN1InputStream.readObject());
        } catch (IllegalArgumentException e11) {
            throw new IOException("not an ASN.1 Sequence: " + e11);
        }
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.util.Encodable
    public byte[] getEncoded() {
        try {
            return getEncoded(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new RuntimeException(e11.toString());
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }

    public X509Principal(X509Name x509Name) {
        super((ASN1Sequence) x509Name.toASN1Primitive());
    }

    public X509Principal(X500Name x500Name) {
        super((ASN1Sequence) x500Name.toASN1Primitive());
    }

    public X509Principal(Hashtable hashtable) {
        super(hashtable);
    }

    public X509Principal(Vector vector, Hashtable hashtable) {
        super(vector, hashtable);
    }

    public X509Principal(Vector vector, Vector vector2) {
        super(vector, vector2);
    }

    public X509Principal(String str) {
        super(str);
    }

    public X509Principal(boolean z11, String str) {
        super(z11, str);
    }

    public X509Principal(boolean z11, Hashtable hashtable, String str) {
        super(z11, hashtable, str);
    }
}