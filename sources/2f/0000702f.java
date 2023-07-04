package g70;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* loaded from: classes5.dex */
public class a extends Provider implements ConfigurableProvider {

    /* renamed from: a  reason: collision with root package name */
    private static String f27815a = "BouncyCastle Post-Quantum Security Provider v1.69";

    /* renamed from: b  reason: collision with root package name */
    public static String f27816b = "BCPQC";

    /* renamed from: c  reason: collision with root package name */
    public static final ProviderConfiguration f27817c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f27818d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f27819e = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    /* renamed from: g70.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0526a implements PrivilegedAction {
        C0526a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            a.this.e();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27821a;

        b(String str) {
            this.f27821a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f27821a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public a() {
        super(f27816b, 1.67d, f27815a);
        AccessController.doPrivileged(new C0526a());
    }

    private void b(String str, String[] strArr) {
        for (int i11 = 0; i11 != strArr.length; i11++) {
            Class c11 = c(a.class, str + strArr[i11] + "$Mappings");
            if (c11 != null) {
                try {
                    ((AlgorithmProvider) c11.newInstance()).configure(this);
                } catch (Exception e11) {
                    throw new InternalError("cannot create instance of " + str + strArr[i11] + "$Mappings : " + e11);
                }
            }
        }
    }

    static Class c(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b("org.bouncycastle.pqc.jcajce.provider.", f27819e);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, k kVar, String str2) {
        if (!containsKey(str + "." + str2)) {
            throw new IllegalStateException("primary key (" + str + "." + str2 + ") not found");
        }
        addAlgorithm(str + "." + kVar, str2);
        addAlgorithm(str + ".OID." + kVar, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (containsKey(str3)) {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
            put(str3, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(k kVar, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = f27818d;
        synchronized (map) {
            map.put(kVar, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public AsymmetricKeyInfoConverter getKeyInfoConverter(k kVar) {
        return (AsymmetricKeyInfoConverter) f27818d.get(kVar);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        synchronized (f27817c) {
        }
    }
}