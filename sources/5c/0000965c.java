package org.bouncycastle.jce.provider;

import h60.b;
import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import l60.e;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import u50.i;
import u50.r;

/* loaded from: classes5.dex */
class BouncyCastleProviderConfiguration implements ProviderConfiguration {
    private volatile Object dhDefaultParams;
    private volatile e ecImplicitCaParams;
    private static Permission BC_EC_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalEcImplicitlyCa");
    private static Permission BC_EC_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "ecImplicitlyCa");
    private static Permission BC_DH_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalDhDefaultParams");
    private static Permission BC_DH_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "DhDefaultParams");
    private static Permission BC_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "acceptableEcCurves");
    private static Permission BC_ADDITIONAL_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "additionalEcParameters");
    private ThreadLocal ecThreadSpec = new ThreadLocal();
    private ThreadLocal dhThreadSpec = new ThreadLocal();
    private volatile Set acceptableNamedCurves = new HashSet();
    private volatile Map additionalECParameters = new HashMap();

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public Set getAcceptableNamedCurves() {
        return Collections.unmodifiableSet(this.acceptableNamedCurves);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public Map getAdditionalECParameters() {
        return Collections.unmodifiableMap(this.additionalECParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public DHParameterSpec getDHDefaultParameters(int i11) {
        Object obj = this.dhThreadSpec.get();
        if (obj == null) {
            obj = this.dhDefaultParams;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i11) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i12 = 0; i12 != dHParameterSpecArr.length; i12++) {
                if (dHParameterSpecArr[i12].getP().bitLength() == i11) {
                    return dHParameterSpecArr[i12];
                }
            }
        }
        i iVar = (i) k.d(k.a.f43149c, i11);
        if (iVar != null) {
            return new b(iVar);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public DSAParameterSpec getDSADefaultParameters(int i11) {
        r rVar = (r) k.d(k.a.f43150d, i11);
        if (rVar != null) {
            return new DSAParameterSpec(rVar.b(), rVar.c(), rVar.a());
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public e getEcImplicitlyCa() {
        e eVar = (e) this.ecThreadSpec.get();
        return eVar != null ? eVar : this.ecImplicitCaParams;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setParameter(String str, Object obj) {
        ThreadLocal threadLocal;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals("threadLocalEcImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_LOCAL_PERMISSION);
            }
            e convertSpec = ((obj instanceof e) || obj == null) ? (e) obj : EC5Util.convertSpec((ECParameterSpec) obj);
            if (convertSpec != null) {
                this.ecThreadSpec.set(convertSpec);
                return;
            }
            threadLocal = this.ecThreadSpec;
        } else if (str.equals("ecImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_PERMISSION);
            }
            if ((obj instanceof e) || obj == null) {
                this.ecImplicitCaParams = (e) obj;
                return;
            } else {
                this.ecImplicitCaParams = EC5Util.convertSpec((ECParameterSpec) obj);
                return;
            }
        } else if (!str.equals("threadLocalDhDefaultParams")) {
            if (str.equals("DhDefaultParams")) {
                if (securityManager != null) {
                    securityManager.checkPermission(BC_DH_PERMISSION);
                }
                if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                    throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
                }
                this.dhDefaultParams = obj;
                return;
            } else if (str.equals("acceptableEcCurves")) {
                if (securityManager != null) {
                    securityManager.checkPermission(BC_EC_CURVE_PERMISSION);
                }
                this.acceptableNamedCurves = (Set) obj;
                return;
            } else if (str.equals("additionalEcParameters")) {
                if (securityManager != null) {
                    securityManager.checkPermission(BC_ADDITIONAL_EC_CURVE_PERMISSION);
                }
                this.additionalECParameters = (Map) obj;
                return;
            } else {
                return;
            }
        } else {
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_LOCAL_PERMISSION);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            threadLocal = this.dhThreadSpec;
            if (obj != null) {
                threadLocal.set(obj);
                return;
            }
        }
        threadLocal.remove();
    }
}