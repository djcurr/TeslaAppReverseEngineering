package f70;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
final class l implements w {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, l> f25970c;

    /* renamed from: a  reason: collision with root package name */
    private final int f25971a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25972b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b(McElieceCCA2KeyGenParameterSpec.SHA256, 32, 16, 67), new l(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(b(McElieceCCA2KeyGenParameterSpec.SHA512, 64, 16, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE), new l(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(b("SHAKE128", 32, 16, 67), new l(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(b("SHAKE256", 64, 16, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE), new l(67108868, "WOTSP_SHAKE256_W16"));
        f25970c = Collections.unmodifiableMap(hashMap);
    }

    private l(int i11, String str) {
        this.f25971a = i11;
        this.f25972b = str;
    }

    private static String b(String str, int i11, int i12, int i13) {
        Objects.requireNonNull(str, "algorithmName == null");
        return str + "-" + i11 + "-" + i12 + "-" + i13;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static l c(String str, int i11, int i12, int i13) {
        Objects.requireNonNull(str, "algorithmName == null");
        return f25970c.get(b(str, i11, i12, i13));
    }

    @Override // f70.w
    public int a() {
        return this.f25971a;
    }

    public String toString() {
        return this.f25972b;
    }
}