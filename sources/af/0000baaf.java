package w;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class k implements f0.e {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f54794a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    /* renamed from: b  reason: collision with root package name */
    private static final Set<Integer> f54795b;

    static {
        HashSet hashSet = new HashSet();
        f54795b = hashSet;
        hashSet.add(1);
        if (Build.VERSION.SDK_INT >= 24) {
            hashSet.add(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(u.d dVar) {
        return f54794a.contains(Build.DEVICE.toLowerCase(Locale.US)) && f54795b.contains(Integer.valueOf(((Integer) v3.h.f((Integer) dVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL))).intValue()));
    }
}