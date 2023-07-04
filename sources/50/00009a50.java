package org.spongycastle.cert.ocsp;

import java.io.OutputStream;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.ocsp.ResponderID;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.operator.DigestCalculator;

/* loaded from: classes5.dex */
public class RespID {
    public static final AlgorithmIdentifier HASH_SHA1 = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);

    /* renamed from: id  reason: collision with root package name */
    ResponderID f43429id;

    public RespID(ResponderID responderID) {
        this.f43429id = responderID;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RespID) {
            return this.f43429id.equals(((RespID) obj).f43429id);
        }
        return false;
    }

    public int hashCode() {
        return this.f43429id.hashCode();
    }

    public ResponderID toASN1Primitive() {
        return this.f43429id;
    }

    public RespID(X500Name x500Name) {
        this.f43429id = new ResponderID(x500Name);
    }

    public RespID(SubjectPublicKeyInfo subjectPublicKeyInfo, DigestCalculator digestCalculator) {
        try {
            if (digestCalculator.getAlgorithmIdentifier().equals(HASH_SHA1)) {
                OutputStream outputStream = digestCalculator.getOutputStream();
                outputStream.write(subjectPublicKeyInfo.getPublicKeyData().getBytes());
                outputStream.close();
                this.f43429id = new ResponderID(new DEROctetString(digestCalculator.getDigest()));
                return;
            }
            throw new IllegalArgumentException("only SHA-1 can be used with RespID - found: " + digestCalculator.getAlgorithmIdentifier().getAlgorithm());
        } catch (Exception e11) {
            throw new OCSPException("problem creating ID: " + e11, e11);
        }
    }
}