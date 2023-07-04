package org.spongycastle.asn1;

import ch.qos.logback.core.joran.action.ActionConst;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class ASN1Null extends ASN1Primitive {
    public static ASN1Null getInstance(Object obj) {
        if (obj instanceof ASN1Null) {
            return (ASN1Null) obj;
        }
        if (obj != null) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e11) {
                throw new IllegalArgumentException("failed to construct NULL from byte[]: " + e11.getMessage());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("unknown object in getInstance(): " + obj.getClass().getName());
            }
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public abstract void encode(ASN1OutputStream aSN1OutputStream);

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return ActionConst.NULL;
    }
}