package w;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.impl.d1;

/* loaded from: classes.dex */
public class a implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final Range<Integer> f54791a;

    public a(u.d dVar) {
        this.f54791a = d((Range[]) dVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range<Integer> a(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(u.d dVar) {
        Integer num = (Integer) dVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range<Integer> d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> a11 = a(range2);
                if (a11.getUpper().intValue() == 30 && (range == null || a11.getLower().intValue() < range.getLower().intValue())) {
                    range = a11;
                }
            }
        }
        return range;
    }

    public Range<Integer> b() {
        return this.f54791a;
    }
}