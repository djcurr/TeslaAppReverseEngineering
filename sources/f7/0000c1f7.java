package y50;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.crypto.signers.ISOTrailers;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f59183a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("RIPEMD128", r70.f.d(13004));
        hashMap.put("RIPEMD160", r70.f.d(12748));
        hashMap.put(McElieceCCA2KeyGenParameterSpec.SHA1, r70.f.d(13260));
        hashMap.put(McElieceCCA2KeyGenParameterSpec.SHA224, r70.f.d(14540));
        hashMap.put(McElieceCCA2KeyGenParameterSpec.SHA256, r70.f.d(13516));
        hashMap.put(McElieceCCA2KeyGenParameterSpec.SHA384, r70.f.d(14028));
        hashMap.put(McElieceCCA2KeyGenParameterSpec.SHA512, r70.f.d(13772));
        hashMap.put("SHA-512/224", r70.f.d(ISOTrailers.TRAILER_SHA512_224));
        hashMap.put("SHA-512/256", r70.f.d(15052));
        hashMap.put("Whirlpool", r70.f.d(14284));
        f59183a = Collections.unmodifiableMap(hashMap);
    }

    public static Integer a(org.bouncycastle.crypto.p pVar) {
        return f59183a.get(pVar.getAlgorithmName());
    }
}