package t;

import a0.e;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* loaded from: classes.dex */
public class c implements androidx.camera.core.impl.m {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.camera.core.impl.l1 f50928a;

    /* renamed from: b  reason: collision with root package name */
    private final CaptureResult f50929b;

    public c(androidx.camera.core.impl.l1 l1Var, CaptureResult captureResult) {
        this.f50928a = l1Var;
        this.f50929b = captureResult;
    }

    @Override // androidx.camera.core.impl.m
    public androidx.camera.core.impl.l1 a() {
        return this.f50928a;
    }

    @Override // androidx.camera.core.impl.m
    public void b(e.b bVar) {
        Integer num;
        super.b(bVar);
        Rect rect = (Rect) this.f50929b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.j(rect.width()).i(rect.height());
        }
        Integer num2 = (Integer) this.f50929b.get(CaptureResult.JPEG_ORIENTATION);
        if (num2 != null) {
            bVar.m(num2.intValue());
        }
        Long l11 = (Long) this.f50929b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l11 != null) {
            bVar.f(l11.longValue());
        }
        Float f11 = (Float) this.f50929b.get(CaptureResult.LENS_APERTURE);
        if (f11 != null) {
            bVar.l(f11.floatValue());
        }
        Integer num3 = (Integer) this.f50929b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f50929b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            bVar.k(num3.intValue());
        }
        Float f12 = (Float) this.f50929b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f12 != null) {
            bVar.h(f12.floatValue());
        }
        Integer num4 = (Integer) this.f50929b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            e.c cVar = e.c.AUTO;
            if (num4.intValue() == 0) {
                cVar = e.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // androidx.camera.core.impl.m
    public androidx.camera.core.impl.l c() {
        Integer num = (Integer) this.f50929b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return androidx.camera.core.impl.l.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return androidx.camera.core.impl.l.NONE;
        }
        if (intValue != 2) {
            if (intValue != 3 && intValue != 4) {
                androidx.camera.core.n0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
                return androidx.camera.core.impl.l.UNKNOWN;
            }
            return androidx.camera.core.impl.l.FIRED;
        }
        return androidx.camera.core.impl.l.READY;
    }

    @Override // androidx.camera.core.impl.m
    public androidx.camera.core.impl.j d() {
        Integer num = (Integer) this.f50929b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return androidx.camera.core.impl.j.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return androidx.camera.core.impl.j.INACTIVE;
            case 1:
            case 3:
                return androidx.camera.core.impl.j.SCANNING;
            case 2:
                return androidx.camera.core.impl.j.PASSIVE_FOCUSED;
            case 4:
                return androidx.camera.core.impl.j.LOCKED_FOCUSED;
            case 5:
                return androidx.camera.core.impl.j.LOCKED_NOT_FOCUSED;
            case 6:
                return androidx.camera.core.impl.j.PASSIVE_NOT_FOCUSED;
            default:
                androidx.camera.core.n0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return androidx.camera.core.impl.j.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.m
    public androidx.camera.core.impl.k e() {
        Integer num = (Integer) this.f50929b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return androidx.camera.core.impl.k.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        androidx.camera.core.n0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
                        return androidx.camera.core.impl.k.UNKNOWN;
                    }
                    return androidx.camera.core.impl.k.LOCKED;
                }
                return androidx.camera.core.impl.k.CONVERGED;
            }
            return androidx.camera.core.impl.k.METERING;
        }
        return androidx.camera.core.impl.k.INACTIVE;
    }

    @Override // androidx.camera.core.impl.m
    public androidx.camera.core.impl.i f() {
        Integer num = (Integer) this.f50929b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return androidx.camera.core.impl.i.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return androidx.camera.core.impl.i.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return androidx.camera.core.impl.i.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                androidx.camera.core.n0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return androidx.camera.core.impl.i.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.i.OFF;
    }

    @Override // androidx.camera.core.impl.m
    public androidx.camera.core.impl.h g() {
        Integer num = (Integer) this.f50929b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return androidx.camera.core.impl.h.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return androidx.camera.core.impl.h.CONVERGED;
                }
                if (intValue == 3) {
                    return androidx.camera.core.impl.h.LOCKED;
                }
                if (intValue == 4) {
                    return androidx.camera.core.impl.h.FLASH_REQUIRED;
                }
                if (intValue != 5) {
                    androidx.camera.core.n0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                    return androidx.camera.core.impl.h.UNKNOWN;
                }
            }
            return androidx.camera.core.impl.h.SEARCHING;
        }
        return androidx.camera.core.impl.h.INACTIVE;
    }

    @Override // androidx.camera.core.impl.m
    public long getTimestamp() {
        Long l11 = (Long) this.f50929b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l11 == null) {
            return -1L;
        }
        return l11.longValue();
    }
}