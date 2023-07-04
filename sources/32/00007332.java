package hf;

import java.util.concurrent.TimeUnit;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class l implements md.n<t> {

    /* renamed from: a  reason: collision with root package name */
    private static final long f29179a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return PKIFailureInfo.badCertTemplate;
        }
        if (min < 33554432) {
            return PKIFailureInfo.badSenderNonce;
        }
        return 4194304;
    }

    @Override // md.n
    /* renamed from: a */
    public t get() {
        int b11 = b();
        return new t(b11, Integer.MAX_VALUE, b11, Integer.MAX_VALUE, b11 / 8, f29179a);
    }
}