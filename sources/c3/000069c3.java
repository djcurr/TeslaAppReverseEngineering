package expo.modules.haptics.arguments;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.spongycastle.crypto.tls.CipherSuite;
import vz.v;
import wz.s0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lexpo/modules/haptics/arguments/HapticsImpactType;", "", "", "style", "Lexpo/modules/haptics/arguments/HapticsVibrationType;", "fromString", "", "types", "Ljava/util/Map;", "<init>", "()V", "expo-haptics_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class HapticsImpactType {
    public static final HapticsImpactType INSTANCE = new HapticsImpactType();
    private static final Map<String, HapticsVibrationType> types;

    static {
        Map<String, HapticsVibrationType> l11;
        l11 = s0.l(v.a("light", new HapticsVibrationType(new long[]{0, 50}, new int[]{0, 110}, new long[]{0, 20})), v.a(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM, new HapticsVibrationType(new long[]{0, 43}, new int[]{0, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256}, new long[]{0, 43})), v.a("heavy", new HapticsVibrationType(new long[]{0, 60}, new int[]{0, 255}, new long[]{0, 61})));
        types = l11;
    }

    private HapticsImpactType() {
    }

    public final HapticsVibrationType fromString(String style) {
        s.g(style, "style");
        HapticsVibrationType hapticsVibrationType = types.get(style);
        if (hapticsVibrationType != null) {
            return hapticsVibrationType;
        }
        throw new HapticsInvalidArgumentException("'style' must be one of ['light', 'medium', 'heavy']. Obtained " + style + "'.");
    }
}