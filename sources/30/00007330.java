package hf;

import android.app.ActivityManager;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class j implements md.n<t> {

    /* renamed from: b  reason: collision with root package name */
    private static final long f29176b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f29177a;

    public j(ActivityManager activityManager) {
        this.f29177a = activityManager;
    }

    private int b() {
        int min = Math.min(this.f29177a.getMemoryClass() * PKIFailureInfo.badCertTemplate, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    @Override // md.n
    /* renamed from: a */
    public t get() {
        return new t(b(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f29176b);
    }
}