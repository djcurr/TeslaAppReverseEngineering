package ezvcard.parameter;

import com.lwansbrough.RCTCamera.RCTCameraModule;

/* loaded from: classes5.dex */
public class InterestLevel extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<InterestLevel> f25396b = new d<>(InterestLevel.class);

    static {
        new InterestLevel(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW);
        new InterestLevel(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM);
        new InterestLevel(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH);
    }

    private InterestLevel(String str) {
        super(str);
    }

    public static InterestLevel d(String str) {
        return (InterestLevel) f25396b.e(str);
    }
}