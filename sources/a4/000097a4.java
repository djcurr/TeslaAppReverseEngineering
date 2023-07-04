package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes6.dex */
public class BERConstructedOctetString extends BEROctetString {
    private static final int MAX_LENGTH = 1000;
    private Vector octs;

    public BERConstructedOctetString(byte[] bArr) {
        super(bArr);
    }

    public static BEROctetString fromSequence(ASN1Sequence aSN1Sequence) {
        Vector vector = new Vector();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            vector.addElement(objects.nextElement());
        }
        return new BERConstructedOctetString(vector);
    }

    private Vector generateOcts() {
        Vector vector = new Vector();
        int i11 = 0;
        while (true) {
            byte[] bArr = this.string;
            if (i11 >= bArr.length) {
                return vector;
            }
            int i12 = i11 + 1000;
            int length = (i12 > bArr.length ? bArr.length : i12) - i11;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i11, bArr2, 0, length);
            vector.addElement(new DEROctetString(bArr2));
            i11 = i12;
        }
    }

    private static byte[] toByteArray(ASN1Primitive aSN1Primitive) {
        try {
            return aSN1Primitive.getEncoded();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Unable to encode object");
        }
    }

    private static byte[] toBytes(Vector vector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != vector.size(); i11++) {
            try {
                byteArrayOutputStream.write(((DEROctetString) vector.elementAt(i11)).getOctets());
            } catch (IOException e11) {
                throw new IllegalArgumentException("exception converting octets " + e11.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(vector.elementAt(i11).getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.spongycastle.asn1.BEROctetString
    public Enumeration getObjects() {
        Vector vector = this.octs;
        if (vector == null) {
            return generateOcts().elements();
        }
        return vector.elements();
    }

    @Override // org.spongycastle.asn1.BEROctetString, org.spongycastle.asn1.ASN1OctetString
    public byte[] getOctets() {
        return this.string;
    }

    public BERConstructedOctetString(Vector vector) {
        super(toBytes(vector));
        this.octs = vector;
    }

    public BERConstructedOctetString(ASN1Primitive aSN1Primitive) {
        super(toByteArray(aSN1Primitive));
    }

    public BERConstructedOctetString(ASN1Encodable aSN1Encodable) {
        this(aSN1Encodable.toASN1Primitive());
    }
}