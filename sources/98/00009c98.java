package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f43602a;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43603p;

    /* renamed from: q  reason: collision with root package name */
    private BigInteger f43604q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f43603p = bigInteger;
        this.f43604q = bigInteger2;
        this.f43602a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410Parameters) {
            GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
            return gOST3410Parameters.getP().equals(this.f43603p) && gOST3410Parameters.getQ().equals(this.f43604q) && gOST3410Parameters.getA().equals(this.f43602a);
        }
        return false;
    }

    public BigInteger getA() {
        return this.f43602a;
    }

    public BigInteger getP() {
        return this.f43603p;
    }

    public BigInteger getQ() {
        return this.f43604q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f43603p.hashCode() ^ this.f43604q.hashCode()) ^ this.f43602a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f43602a = bigInteger3;
        this.f43603p = bigInteger;
        this.f43604q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}