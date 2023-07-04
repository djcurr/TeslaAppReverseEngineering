package pl;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import pl.n;

/* loaded from: classes3.dex */
public final class m<T_WRAPPER extends n<T_ENGINE>, T_ENGINE> {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f46672d = Logger.getLogger(m.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final List<Provider> f46673e;

    /* renamed from: f  reason: collision with root package name */
    public static final m<n.a, Cipher> f46674f;

    /* renamed from: g  reason: collision with root package name */
    public static final m<n.e, Mac> f46675g;

    /* renamed from: a  reason: collision with root package name */
    private T_WRAPPER f46676a;

    /* renamed from: b  reason: collision with root package name */
    private List<Provider> f46677b = f46673e;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46678c = true;

    static {
        if (v.b()) {
            f46673e = b(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
        } else {
            f46673e = new ArrayList();
        }
        f46674f = new m<>(new n.a());
        f46675g = new m<>(new n.e());
        new m(new n.g());
        new m(new n.f());
        new m(new n.b());
        new m(new n.d());
        new m(new n.c());
    }

    public m(T_WRAPPER t_wrapper) {
        this.f46676a = t_wrapper;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f46672d.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public T_ENGINE a(String str) {
        Exception exc = null;
        for (Provider provider : this.f46677b) {
            try {
                return (T_ENGINE) this.f46676a.a(str, provider);
            } catch (Exception e11) {
                if (exc == null) {
                    exc = e11;
                }
            }
        }
        if (this.f46678c) {
            return (T_ENGINE) this.f46676a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}