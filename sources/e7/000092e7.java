package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.crypto.n;
import org.bouncycastle.crypto.o;
import q40.c;
import r40.b;
import r70.f;
import r70.m;
import t40.a;
import u50.a1;

/* loaded from: classes5.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, k> defaultOids;
    private static final Hashtable des;
    private static final Map<String, Integer> keySizes;
    private static final Map<String, String> nameTable;
    private static final Hashtable oids;
    protected final String kaAlgorithm;
    protected final n kdf;
    protected byte[] ukmParameters;

    static {
        HashMap hashMap = new HashMap();
        defaultOids = hashMap;
        HashMap hashMap2 = new HashMap();
        keySizes = hashMap2;
        HashMap hashMap3 = new HashMap();
        nameTable = hashMap3;
        Hashtable hashtable = new Hashtable();
        oids = hashtable;
        Hashtable hashtable2 = new Hashtable();
        des = hashtable2;
        Integer d11 = f.d(64);
        Integer d12 = f.d(128);
        Integer d13 = f.d(192);
        Integer d14 = f.d(256);
        hashMap2.put("DES", d11);
        hashMap2.put("DESEDE", d13);
        hashMap2.put("BLOWFISH", d12);
        hashMap2.put("AES", d14);
        hashMap2.put(b.f49164t.t(), d12);
        hashMap2.put(b.B.t(), d13);
        hashMap2.put(b.J.t(), d14);
        hashMap2.put(b.f49165u.t(), d12);
        hashMap2.put(b.C.t(), d13);
        k kVar = b.K;
        hashMap2.put(kVar.t(), d14);
        hashMap2.put(b.f49167w.t(), d12);
        hashMap2.put(b.E.t(), d13);
        hashMap2.put(b.M.t(), d14);
        hashMap2.put(b.f49166v.t(), d12);
        hashMap2.put(b.D.t(), d13);
        hashMap2.put(b.L.t(), d14);
        k kVar2 = b.f49168x;
        hashMap2.put(kVar2.t(), d12);
        hashMap2.put(b.F.t(), d13);
        hashMap2.put(b.N.t(), d14);
        k kVar3 = b.f49170z;
        hashMap2.put(kVar3.t(), d12);
        hashMap2.put(b.H.t(), d13);
        hashMap2.put(b.P.t(), d14);
        hashMap2.put(b.f49169y.t(), d12);
        hashMap2.put(b.G.t(), d13);
        hashMap2.put(b.O.t(), d14);
        k kVar4 = a.f51631d;
        hashMap2.put(kVar4.t(), d12);
        k kVar5 = a.f51632e;
        hashMap2.put(kVar5.t(), d13);
        k kVar6 = a.f51633f;
        hashMap2.put(kVar6.t(), d14);
        k kVar7 = p40.a.f46198c;
        hashMap2.put(kVar7.t(), d12);
        k kVar8 = w40.n.f55526b3;
        hashMap2.put(kVar8.t(), d13);
        k kVar9 = w40.n.S1;
        hashMap2.put(kVar9.t(), d13);
        k kVar10 = v40.b.f54047b;
        hashMap2.put(kVar10.t(), d11);
        k kVar11 = i40.a.f29843f;
        hashMap2.put(kVar11.t(), d14);
        hashMap2.put(i40.a.f29841d.t(), d14);
        hashMap2.put(i40.a.f29842e.t(), d14);
        k kVar12 = w40.n.f55524a2;
        hashMap2.put(kVar12.t(), f.d(160));
        k kVar13 = w40.n.f55529d2;
        hashMap2.put(kVar13.t(), d14);
        k kVar14 = w40.n.f55531e2;
        hashMap2.put(kVar14.t(), f.d(384));
        k kVar15 = w40.n.f55533f2;
        hashMap2.put(kVar15.t(), f.d(512));
        hashMap.put("DESEDE", kVar9);
        hashMap.put("AES", kVar);
        k kVar16 = a.f51630c;
        hashMap.put("CAMELLIA", kVar16);
        k kVar17 = p40.a.f46196a;
        hashMap.put("SEED", kVar17);
        hashMap.put("DES", kVar10);
        hashMap3.put(c.f47462h.t(), "CAST5");
        hashMap3.put(c.f47463i.t(), "IDEA");
        hashMap3.put(c.f47466l.t(), "Blowfish");
        hashMap3.put(c.f47467m.t(), "Blowfish");
        hashMap3.put(c.f47468n.t(), "Blowfish");
        hashMap3.put(c.f47469o.t(), "Blowfish");
        hashMap3.put(v40.b.f54046a.t(), "DES");
        hashMap3.put(kVar10.t(), "DES");
        hashMap3.put(v40.b.f54049d.t(), "DES");
        hashMap3.put(v40.b.f54048c.t(), "DES");
        hashMap3.put(v40.b.f54050e.t(), "DESede");
        hashMap3.put(kVar9.t(), "DESede");
        hashMap3.put(kVar8.t(), "DESede");
        hashMap3.put(w40.n.f55528c3.t(), "RC2");
        hashMap3.put(kVar12.t(), "HmacSHA1");
        hashMap3.put(w40.n.f55527c2.t(), "HmacSHA224");
        hashMap3.put(kVar13.t(), "HmacSHA256");
        hashMap3.put(kVar14.t(), "HmacSHA384");
        hashMap3.put(kVar15.t(), "HmacSHA512");
        hashMap3.put(a.f51628a.t(), "Camellia");
        hashMap3.put(a.f51629b.t(), "Camellia");
        hashMap3.put(kVar16.t(), "Camellia");
        hashMap3.put(kVar4.t(), "Camellia");
        hashMap3.put(kVar5.t(), "Camellia");
        hashMap3.put(kVar6.t(), "Camellia");
        hashMap3.put(kVar7.t(), "SEED");
        hashMap3.put(kVar17.t(), "SEED");
        hashMap3.put(p40.a.f46197b.t(), "SEED");
        hashMap3.put(kVar11.t(), "GOST28147");
        hashMap3.put(kVar2.t(), "AES");
        hashMap3.put(kVar3.t(), "AES");
        hashMap3.put(kVar3.t(), "AES");
        hashtable.put("DESEDE", kVar9);
        hashtable.put("AES", kVar);
        hashtable.put("DES", kVar10);
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(kVar10.t(), "DES");
        hashtable2.put(kVar9.t(), "DES");
        hashtable2.put(kVar8.t(), "DES");
    }

    public BaseAgreementSpi(String str, n nVar) {
        this.kaAlgorithm = str;
        this.kdf = nVar;
    }

    protected static String getAlgorithm(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(b.f49163s.t())) {
            return "AES";
        }
        if (str.startsWith(l40.a.f36577b.t())) {
            return "Serpent";
        }
        String str2 = nameTable.get(m.k(str));
        return str2 != null ? str2 : str;
    }

    protected static int getKeySize(String str) {
        if (str.indexOf(91) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String k11 = m.k(str);
        Map<String, Integer> map = keySizes;
        if (map.containsKey(k11)) {
            return map.get(k11).intValue();
        }
        return -1;
    }

    private byte[] getSharedSecretBytes(byte[] bArr, String str, int i11) {
        o a1Var;
        n nVar = this.kdf;
        if (nVar == null) {
            if (i11 > 0) {
                int i12 = i11 / 8;
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, 0, bArr2, 0, i12);
                org.bouncycastle.util.a.g(bArr);
                return bArr2;
            }
            return bArr;
        } else if (i11 < 0) {
            throw new NoSuchAlgorithmException("unknown algorithm encountered: " + str);
        } else {
            int i13 = i11 / 8;
            byte[] bArr3 = new byte[i13];
            if (!(nVar instanceof h50.c)) {
                a1Var = new a1(bArr, this.ukmParameters);
            } else if (str == null) {
                throw new NoSuchAlgorithmException("algorithm OID is null");
            } else {
                try {
                    a1Var = new h50.b(new k(str), i11, bArr, this.ukmParameters);
                } catch (IllegalArgumentException unused) {
                    throw new NoSuchAlgorithmException("no OID for algorithm: " + str);
                }
            }
            this.kdf.init(a1Var);
            this.kdf.generateBytes(bArr3, 0, i13);
            org.bouncycastle.util.a.g(bArr);
            return bArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] trimZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i11 = 0;
        while (i11 < bArr.length && bArr[i11] == 0) {
            i11++;
        }
        int length = bArr.length - i11;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i11, bArr2, 0, length);
        return bArr2;
    }

    protected abstract byte[] calcSecret();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i11) {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i11 >= engineGenerateSecret.length) {
            System.arraycopy(engineGenerateSecret, 0, bArr, i11, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        throw new ShortBufferException(this.kaAlgorithm + " key agreement: need " + engineGenerateSecret.length + " bytes");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        String k11 = m.k(str);
        Hashtable hashtable = oids;
        String t11 = hashtable.containsKey(k11) ? ((k) hashtable.get(k11)).t() : str;
        byte[] sharedSecretBytes = getSharedSecretBytes(calcSecret(), t11, getKeySize(t11));
        String algorithm = getAlgorithm(str);
        if (des.containsKey(algorithm)) {
            u50.c.c(sharedSecretBytes);
        }
        return new SecretKeySpec(sharedSecretBytes, algorithm);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        if (this.kdf != null) {
            byte[] calcSecret = calcSecret();
            try {
                return getSharedSecretBytes(calcSecret, null, calcSecret.length * 8);
            } catch (NoSuchAlgorithmException e11) {
                throw new IllegalStateException(e11.getMessage());
            }
        }
        return calcSecret();
    }
}