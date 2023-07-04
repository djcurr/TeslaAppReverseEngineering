package x;

import android.hardware.camera2.CaptureRequest;
import s.a;
import w.i;

/* loaded from: classes.dex */
public class d {
    public void a(int i11, a.C1090a c1090a) {
        if (((i) w.f.a(i.class)) == null) {
            return;
        }
        if (i11 == 0) {
            c1090a.d(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else if (i11 != 1) {
        } else {
            c1090a.d(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}