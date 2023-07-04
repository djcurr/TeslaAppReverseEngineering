package f70;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public final class e implements w {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, e> f25942c;

    /* renamed from: a  reason: collision with root package name */
    private final int f25943a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25944b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b(McElieceCCA2KeyGenParameterSpec.SHA256, 32, 16, 67, 10), new e(1, "XMSS_SHA2_10_256"));
        hashMap.put(b(McElieceCCA2KeyGenParameterSpec.SHA256, 32, 16, 67, 16), new e(2, "XMSS_SHA2_16_256"));
        hashMap.put(b(McElieceCCA2KeyGenParameterSpec.SHA256, 32, 16, 67, 20), new e(3, "XMSS_SHA2_20_256"));
        hashMap.put(b(McElieceCCA2KeyGenParameterSpec.SHA512, 64, 16, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 10), new e(4, "XMSS_SHA2_10_512"));
        hashMap.put(b(McElieceCCA2KeyGenParameterSpec.SHA512, 64, 16, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 16), new e(5, "XMSS_SHA2_16_512"));
        hashMap.put(b(McElieceCCA2KeyGenParameterSpec.SHA512, 64, 16, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 20), new e(6, "XMSS_SHA2_20_512"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 10), new e(7, "XMSS_SHAKE_10_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 16), new e(8, "XMSS_SHAKE_16_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20), new e(9, "XMSS_SHAKE_20_256"));
        hashMap.put(b("SHAKE256", 64, 16, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 10), new e(10, "XMSS_SHAKE_10_512"));
        hashMap.put(b("SHAKE256", 64, 16, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 16), new e(11, "XMSS_SHAKE_16_512"));
        hashMap.put(b("SHAKE256", 64, 16, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 20), new e(12, "XMSS_SHAKE_20_512"));
        f25942c = Collections.unmodifiableMap(hashMap);
    }

    private e(int i11, String str) {
        this.f25943a = i11;
        this.f25944b = str;
    }

    private static String b(String str, int i11, int i12, int i13, int i14) {
        Objects.requireNonNull(str, "algorithmName == null");
        return str + "-" + i11 + "-" + i12 + "-" + i13 + "-" + i14;
    }

    public static e c(String str, int i11, int i12, int i13, int i14) {
        Objects.requireNonNull(str, "algorithmName == null");
        return f25942c.get(b(str, i11, i12, i13, i14));
    }

    @Override // f70.w
    public int a() {
        return this.f25943a;
    }

    public String toString() {
        return this.f25944b;
    }
}