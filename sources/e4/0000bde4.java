package x;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.core.impl.e1;
import s.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Range<Integer> f56502a;

    public a(e1 e1Var) {
        w.a aVar = (w.a) e1Var.b(w.a.class);
        if (aVar == null) {
            this.f56502a = null;
        } else {
            this.f56502a = aVar.b();
        }
    }

    public void a(a.C1090a c1090a) {
        Range<Integer> range = this.f56502a;
        if (range != null) {
            c1090a.d(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}