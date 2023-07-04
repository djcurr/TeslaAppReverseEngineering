package org.spongycastle.asn1.x509.qualified;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;

/* loaded from: classes5.dex */
public class TypeOfBiometricData extends ASN1Object implements ASN1Choice {
    public static final int HANDWRITTEN_SIGNATURE = 1;
    public static final int PICTURE = 0;
    ASN1Encodable obj;

    public TypeOfBiometricData(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("unknow PredefinedBiometricType : " + i11);
        }
        this.obj = new ASN1Integer(i11);
    }

    public static TypeOfBiometricData getInstance(Object obj) {
        if (obj != null && !(obj instanceof TypeOfBiometricData)) {
            if (obj instanceof ASN1Integer) {
                return new TypeOfBiometricData(ASN1Integer.getInstance(obj).getValue().intValue());
            }
            if (obj instanceof ASN1ObjectIdentifier) {
                return new TypeOfBiometricData(ASN1ObjectIdentifier.getInstance(obj));
            }
            throw new IllegalArgumentException("unknown object in getInstance");
        }
        return (TypeOfBiometricData) obj;
    }

    public ASN1ObjectIdentifier getBiometricDataOid() {
        return (ASN1ObjectIdentifier) this.obj;
    }

    public int getPredefinedBiometricType() {
        return ((ASN1Integer) this.obj).getValue().intValue();
    }

    public boolean isPredefined() {
        return this.obj instanceof ASN1Integer;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.obj.toASN1Primitive();
    }

    public TypeOfBiometricData(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.obj = aSN1ObjectIdentifier;
    }
}