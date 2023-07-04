package lo;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes2.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final GmsLogger f37247c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList f37248a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private long f37249b = -1;

    @KeepForSdk
    public void a(ko.a aVar) {
        if (aVar.f() != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f37248a.add(Long.valueOf(elapsedRealtime));
        if (this.f37248a.size() > 5) {
            this.f37248a.removeFirst();
        }
        if (this.f37248a.size() != 5 || elapsedRealtime - ((Long) Preconditions.checkNotNull((Long) this.f37248a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j11 = this.f37249b;
        if (j11 == -1 || elapsedRealtime - j11 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f37249b = elapsedRealtime;
            f37247c.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}