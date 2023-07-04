package org.bouncycastle.jcajce.provider.symmetric.util;

import h60.a;
import h60.s;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.v;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p50.g;
import u50.b1;
import u50.f1;
import u50.j1;
import u50.p1;

/* loaded from: classes5.dex */
public class BaseMac extends MacSpi implements PBE {
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseMac.class, "javax.crypto.spec.GCMParameterSpec");
    private int keySize;
    private v macEngine;
    private int pbeHash;
    private int scheme;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseMac(v vVar) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = 160;
        this.macEngine = vVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseMac(v vVar, int i11, int i12, int i13) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = 160;
        this.macEngine = vVar;
        this.scheme = i11;
        this.pbeHash = i12;
        this.keySize = i13;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        i makePBEMacParameters;
        if (key == null) {
            throw new InvalidKeyException("key is null");
        }
        if (key instanceof e60.i) {
            try {
                SecretKey secretKey = (SecretKey) key;
                try {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                        PBEKey pBEKey = (PBEKey) secretKey;
                        pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                    }
                    int i11 = 1;
                    int i12 = 256;
                    if (this.macEngine.getAlgorithmName().startsWith("GOST")) {
                        i11 = 6;
                    } else {
                        v vVar = this.macEngine;
                        if ((vVar instanceof g) && !vVar.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA1)) {
                            if (this.macEngine.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA224)) {
                                i11 = 7;
                                i12 = 224;
                            } else if (this.macEngine.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA256)) {
                                i11 = 4;
                            } else if (this.macEngine.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA384)) {
                                i11 = 8;
                                i12 = 384;
                            } else if (this.macEngine.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA512)) {
                                i11 = 9;
                                i12 = 512;
                            } else if (!this.macEngine.getAlgorithmName().startsWith("RIPEMD160")) {
                                throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.macEngine.getAlgorithmName());
                            } else {
                                i11 = 2;
                            }
                        }
                        i12 = 160;
                    }
                    makePBEMacParameters = PBE.Util.makePBEMacParameters(secretKey, 2, i11, i12, pBEParameterSpec);
                } catch (Exception unused) {
                    throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                }
            } catch (Exception unused2) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getParam() != null) {
                makePBEMacParameters = bCPBEKey.getParam();
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            } else {
                makePBEMacParameters = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
            }
        } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
            throw new InvalidAlgorithmParameterException("inappropriate parameter type: " + algorithmParameterSpec.getClass().getName());
        } else {
            makePBEMacParameters = new b1(key.getEncoded());
        }
        b1 b1Var = makePBEMacParameters instanceof f1 ? (b1) makePBEMacParameters.b() : makePBEMacParameters;
        if (algorithmParameterSpec instanceof a) {
            a aVar = (a) algorithmParameterSpec;
            makePBEMacParameters = new u50.a(b1Var, aVar.b(), aVar.c(), aVar.a());
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            makePBEMacParameters = new f1(b1Var, ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            makePBEMacParameters = new f1(new j1(b1Var.a(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
        } else if (algorithmParameterSpec instanceof s) {
            makePBEMacParameters = new p1.b(copyMap(((s) algorithmParameterSpec).a())).c(b1Var.a()).a();
        } else if (algorithmParameterSpec == null) {
            makePBEMacParameters = new b1(key.getEncoded());
        } else {
            Class cls = gcmSpecClass;
            if (cls != null && cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                makePBEMacParameters = GcmSpecUtil.extractAeadParameters(b1Var, algorithmParameterSpec);
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
            }
        }
        try {
            this.macEngine.init(makePBEMacParameters);
        } catch (Exception e11) {
            throw new InvalidAlgorithmParameterException("cannot initialize MAC: " + e11.getMessage());
        }
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        this.macEngine.reset();
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b11) {
        this.macEngine.update(b11);
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i11, int i12) {
        this.macEngine.update(bArr, i11, i12);
    }
}