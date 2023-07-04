package ezvcard.parameter;

import com.lwansbrough.RCTCamera.RCTCameraModule;

/* loaded from: classes5.dex */
public class HobbyLevel extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<HobbyLevel> f25393b = new d<>(HobbyLevel.class);

    static {
        new HobbyLevel(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW);
        new HobbyLevel(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM);
        new HobbyLevel(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH);
    }

    private HobbyLevel(String str) {
        super(str);
    }

    public static HobbyLevel d(String str) {
        return (HobbyLevel) f25393b.e(str);
    }
}