package expo.modules.haptics.arguments;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0019\u0010\u0001\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lexpo/modules/haptics/arguments/HapticsVibrationType;", "HapticsSelectionType", "Lexpo/modules/haptics/arguments/HapticsVibrationType;", "getHapticsSelectionType", "()Lexpo/modules/haptics/arguments/HapticsVibrationType;", "expo-haptics_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class HapticsSelectionTypeKt {
    private static final HapticsVibrationType HapticsSelectionType = new HapticsVibrationType(new long[]{0, 100}, new int[]{0, 100}, new long[]{0, 70});

    public static final HapticsVibrationType getHapticsSelectionType() {
        return HapticsSelectionType;
    }
}