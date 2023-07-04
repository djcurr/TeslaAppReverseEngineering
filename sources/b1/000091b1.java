package org.bouncycastle.jcajce.provider.asymmetric.ec;

import e50.b;
import e50.m0;
import f50.k;
import f50.n;
import f50.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import k60.c;
import l60.e;
import l60.g;
import n60.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import r70.j;
import u50.e0;
import u50.y;

/* loaded from: classes5.dex */
public class BCECPublicKey implements ECPublicKey, c {
    static final long serialVersionUID = 2422789860422731812L;
    private String algorithm;
    private transient ProviderConfiguration configuration;
    private transient e0 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCECPublicKey(String str, m0 m0Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPubKeyInfo(m0Var);
    }

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new e0(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, g gVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.algorithm = str;
        if (gVar.a() != null) {
            EllipticCurve convertCurve = EC5Util.convertCurve(gVar.a().a(), gVar.a().e());
            this.ecPublicKey = new e0(gVar.b(), ECUtil.getDomainParameters(providerConfiguration, gVar.a()));
            this.ecSpec = EC5Util.convertSpec(convertCurve, gVar.a());
        } else {
            this.ecPublicKey = new e0(providerConfiguration.getEcImplicitlyCa().a().g(gVar.b().f().t(), gVar.b().g().t()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
        }
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = "EC";
        this.algorithm = str;
        this.ecPublicKey = bCECPublicKey.ecPublicKey;
        this.ecSpec = bCECPublicKey.ecSpec;
        this.withCompression = bCECPublicKey.withCompression;
        this.configuration = bCECPublicKey.configuration;
    }

    public BCECPublicKey(String str, e0 e0Var, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        y b11 = e0Var.b();
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b11.a(), b11.f()), b11);
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, e0 e0Var, e eVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        y b11 = e0Var.b();
        this.algorithm = str;
        this.ecSpec = eVar == null ? createSpec(EC5Util.convertCurve(b11.a(), b11.f()), b11) : EC5Util.convertSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), eVar);
        this.ecPublicKey = e0Var;
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, e0 e0Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        this.ecSpec = null;
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new e0(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKey.getParams()));
        this.configuration = providerConfiguration;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, y yVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(yVar.b()), yVar.e(), yVar.c().intValue());
    }

    private void populateFromPubKeyInfo(m0 m0Var) {
        f50.g e11 = f50.g.e(m0Var.e().i());
        n60.e curve = EC5Util.getCurve(this.configuration, e11);
        this.ecSpec = EC5Util.convertToSpec(e11, curve);
        byte[] q11 = m0Var.i().q();
        l s0Var = new s0(q11);
        if (q11[0] == 4 && q11[1] == q11.length - 2 && ((q11[2] == 2 || q11[2] == 3) && new n().a(curve) >= q11.length - 3)) {
            try {
                s0Var = (l) org.bouncycastle.asn1.n.k(q11);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.ecPublicKey = new e0(new k(curve, s0Var).e(), ECUtil.getDomainParameters(this.configuration, e11));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPubKeyInfo(m0.h(org.bouncycastle.asn1.n.k((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCECPublicKey) {
            BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
            return this.ecPublicKey.c().e(bCECPublicKey.ecPublicKey.c()) && engineGetSpec().equals(bCECPublicKey.engineGetSpec());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        boolean z11 = this.withCompression || j.c("org.bouncycastle.ec.enable_pc");
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new b(o.f25891h0, ECUtils.getDomainParametersFromName(this.ecSpec, z11)), this.ecPublicKey.c().l(z11));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // k60.a
    public e getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // k60.c
    public i getQ() {
        i c11 = this.ecPublicKey.c();
        return this.ecSpec == null ? c11.k() : c11;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.c());
    }

    public int hashCode() {
        return this.ecPublicKey.c().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString("EC", this.ecPublicKey.c(), engineGetSpec());
    }
}