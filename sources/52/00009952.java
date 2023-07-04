package org.spongycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1ParsingException;
import org.spongycastle.asn1.DERUTF8String;
import org.spongycastle.asn1.x500.AttributeTypeAndValue;
import org.spongycastle.asn1.x500.RDN;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x500.X500NameStyle;

/* loaded from: classes5.dex */
public abstract class AbstractX500NameStyle implements X500NameStyle {
    private int calcHashCode(ASN1Encodable aSN1Encodable) {
        return IETFUtils.canonicalize(IETFUtils.valueToString(aSN1Encodable)).hashCode();
    }

    public static Hashtable copyHashTable(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private boolean foundMatch(boolean z11, RDN rdn, RDN[] rdnArr) {
        if (z11) {
            for (int length = rdnArr.length - 1; length >= 0; length--) {
                if (rdnArr[length] != null && rdnAreEqual(rdn, rdnArr[length])) {
                    rdnArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i11 = 0; i11 != rdnArr.length; i11++) {
                if (rdnArr[i11] != null && rdnAreEqual(rdn, rdnArr[i11])) {
                    rdnArr[i11] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.spongycastle.asn1.x500.X500NameStyle
    public boolean areEqual(X500Name x500Name, X500Name x500Name2) {
        RDN[] rDNs = x500Name.getRDNs();
        RDN[] rDNs2 = x500Name2.getRDNs();
        if (rDNs.length != rDNs2.length) {
            return false;
        }
        boolean z11 = (rDNs[0].getFirst() == null || rDNs2[0].getFirst() == null) ? false : !rDNs[0].getFirst().getType().equals(rDNs2[0].getFirst().getType());
        for (int i11 = 0; i11 != rDNs.length; i11++) {
            if (!foundMatch(z11, rDNs[i11], rDNs2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.x500.X500NameStyle
    public int calculateHashCode(X500Name x500Name) {
        RDN[] rDNs = x500Name.getRDNs();
        int i11 = 0;
        for (int i12 = 0; i12 != rDNs.length; i12++) {
            if (rDNs[i12].isMultiValued()) {
                AttributeTypeAndValue[] typesAndValues = rDNs[i12].getTypesAndValues();
                for (int i13 = 0; i13 != typesAndValues.length; i13++) {
                    i11 = (i11 ^ typesAndValues[i13].getType().hashCode()) ^ calcHashCode(typesAndValues[i13].getValue());
                }
            } else {
                i11 = (i11 ^ rDNs[i12].getFirst().getType().hashCode()) ^ calcHashCode(rDNs[i12].getFirst().getValue());
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return new DERUTF8String(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean rdnAreEqual(RDN rdn, RDN rdn2) {
        return IETFUtils.rDNAreEqual(rdn, rdn2);
    }

    @Override // org.spongycastle.asn1.x500.X500NameStyle
    public ASN1Encodable stringToValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (str.length() != 0 && str.charAt(0) == '#') {
            try {
                return IETFUtils.valueFromHexString(str, 1);
            } catch (IOException unused) {
                throw new ASN1ParsingException("can't recode value for oid " + aSN1ObjectIdentifier.getId());
            }
        }
        if (str.length() != 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        return encodeStringValue(aSN1ObjectIdentifier, str);
    }
}