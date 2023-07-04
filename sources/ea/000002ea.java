package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {

    /* renamed from: b  reason: collision with root package name */
    static final Set<Integer> f2079b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: c  reason: collision with root package name */
    static final Set<Integer> f2080c = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: a  reason: collision with root package name */
    private final int f2081a;

    public CameraAccessExceptionCompat(int i11, Throwable th2) {
        super(a(i11), th2);
        this.f2081a = i11;
        if (f2079b.contains(Integer.valueOf(i11))) {
            new CameraAccessException(i11, null, th2);
        }
    }

    private static String a(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 != 10001) {
                                if (i11 != 10002) {
                                    return null;
                                }
                                return "Failed to create CameraCharacteristics.";
                            }
                            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
                        }
                        return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
                    }
                    return "The camera device is in use already";
                }
                return "The camera device is currently in the error state; no further calls to it will succeed.";
            }
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        return "The camera is disabled due to a device policy, and cannot be opened.";
    }

    public static CameraAccessExceptionCompat c(CameraAccessException cameraAccessException) {
        Objects.requireNonNull(cameraAccessException, "cameraAccessException should not be null");
        return new CameraAccessExceptionCompat(cameraAccessException);
    }

    public final int b() {
        return this.f2081a;
    }

    private CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f2081a = cameraAccessException.getReason();
    }
}