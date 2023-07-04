package org.spongycastle.asn1.dvcs;

import ch.qos.logback.classic.spi.CallerData;
import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Enumerated;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;

/* loaded from: classes6.dex */
public class ServiceType extends ASN1Object {
    private ASN1Enumerated value;
    public static final ServiceType CPD = new ServiceType(1);
    public static final ServiceType VSD = new ServiceType(2);
    public static final ServiceType VPKC = new ServiceType(3);
    public static final ServiceType CCPD = new ServiceType(4);

    public ServiceType(int i11) {
        this.value = new ASN1Enumerated(i11);
    }

    public static ServiceType getInstance(Object obj) {
        if (obj instanceof ServiceType) {
            return (ServiceType) obj;
        }
        if (obj != null) {
            return new ServiceType(ASN1Enumerated.getInstance(obj));
        }
        return null;
    }

    public BigInteger getValue() {
        return this.value.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.value;
    }

    public String toString() {
        String str;
        int intValue = this.value.getValue().intValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(intValue);
        if (intValue == CPD.getValue().intValue()) {
            str = "(CPD)";
        } else if (intValue == VSD.getValue().intValue()) {
            str = "(VSD)";
        } else if (intValue == VPKC.getValue().intValue()) {
            str = "(VPKC)";
        } else {
            str = intValue == CCPD.getValue().intValue() ? "(CCPD)" : CallerData.NA;
        }
        sb2.append(str);
        return sb2.toString();
    }

    private ServiceType(ASN1Enumerated aSN1Enumerated) {
        this.value = aSN1Enumerated;
    }

    public static ServiceType getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Enumerated.getInstance(aSN1TaggedObject, z11));
    }
}