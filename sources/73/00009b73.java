package org.spongycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes4.dex */
public class SRP6Server {
    protected BigInteger A;
    protected BigInteger B;
    protected BigInteger Key;
    protected BigInteger M1;
    protected BigInteger M2;
    protected BigInteger N;
    protected BigInteger S;

    /* renamed from: b  reason: collision with root package name */
    protected BigInteger f43451b;
    protected Digest digest;

    /* renamed from: g  reason: collision with root package name */
    protected BigInteger f43452g;
    protected SecureRandom random;

    /* renamed from: u  reason: collision with root package name */
    protected BigInteger f43453u;

    /* renamed from: v  reason: collision with root package name */
    protected BigInteger f43454v;

    private BigInteger calculateS() {
        return this.f43454v.modPow(this.f43453u, this.N).multiply(this.A).mod(this.N).modPow(this.f43451b, this.N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.N, bigInteger);
        this.A = validatePublicValue;
        this.f43453u = SRP6Util.calculateU(this.digest, this.N, validatePublicValue, this.B);
        BigInteger calculateS = calculateS();
        this.S = calculateS;
        return calculateS;
    }

    public BigInteger calculateServerEvidenceMessage() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.A;
        if (bigInteger3 != null && (bigInteger = this.M1) != null && (bigInteger2 = this.S) != null) {
            BigInteger calculateM2 = SRP6Util.calculateM2(this.digest, this.N, bigInteger3, bigInteger, bigInteger2);
            this.M2 = calculateM2;
            return calculateM2;
        }
        throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
    }

    public BigInteger calculateSessionKey() {
        BigInteger bigInteger = this.S;
        if (bigInteger != null && this.M1 != null && this.M2 != null) {
            BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.N, bigInteger);
            this.Key = calculateKey;
            return calculateKey;
        }
        throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
    }

    public BigInteger generateServerCredentials() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.N, this.f43452g);
        this.f43451b = selectPrivateValue();
        BigInteger mod = calculateK.multiply(this.f43454v).mod(this.N).add(this.f43452g.modPow(this.f43451b, this.N)).mod(this.N);
        this.B = mod;
        return mod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.N = bigInteger;
        this.f43452g = bigInteger2;
        this.f43454v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    protected BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.N, this.f43452g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.A;
        if (bigInteger4 != null && (bigInteger2 = this.B) != null && (bigInteger3 = this.S) != null) {
            if (SRP6Util.calculateM1(this.digest, this.N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
                this.M1 = bigInteger;
                return true;
            }
            return false;
        }
        throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }
}