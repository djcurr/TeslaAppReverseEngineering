package expo.modules.haptics.arguments;

import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lexpo/modules/haptics/arguments/HapticsVibrationType;", "", "other", "", "equals", "", "hashCode", "", "component1", "", "component2", "component3", "timings", "amplitudes", "oldSDKPattern", "copy", "", "toString", "[J", "getTimings", "()[J", "[I", "getAmplitudes", "()[I", "getOldSDKPattern", "<init>", "([J[I[J)V", "expo-haptics_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class HapticsVibrationType {
    private final int[] amplitudes;
    private final long[] oldSDKPattern;
    private final long[] timings;

    public HapticsVibrationType(long[] timings, int[] amplitudes, long[] oldSDKPattern) {
        s.g(timings, "timings");
        s.g(amplitudes, "amplitudes");
        s.g(oldSDKPattern, "oldSDKPattern");
        this.timings = timings;
        this.amplitudes = amplitudes;
        this.oldSDKPattern = oldSDKPattern;
    }

    public static /* synthetic */ HapticsVibrationType copy$default(HapticsVibrationType hapticsVibrationType, long[] jArr, int[] iArr, long[] jArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jArr = hapticsVibrationType.timings;
        }
        if ((i11 & 2) != 0) {
            iArr = hapticsVibrationType.amplitudes;
        }
        if ((i11 & 4) != 0) {
            jArr2 = hapticsVibrationType.oldSDKPattern;
        }
        return hapticsVibrationType.copy(jArr, iArr, jArr2);
    }

    public final long[] component1() {
        return this.timings;
    }

    public final int[] component2() {
        return this.amplitudes;
    }

    public final long[] component3() {
        return this.oldSDKPattern;
    }

    public final HapticsVibrationType copy(long[] timings, int[] amplitudes, long[] oldSDKPattern) {
        s.g(timings, "timings");
        s.g(amplitudes, "amplitudes");
        s.g(oldSDKPattern, "oldSDKPattern");
        return new HapticsVibrationType(timings, amplitudes, oldSDKPattern);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (s.c(HapticsVibrationType.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type expo.modules.haptics.arguments.HapticsVibrationType");
            HapticsVibrationType hapticsVibrationType = (HapticsVibrationType) obj;
            return Arrays.equals(this.timings, hapticsVibrationType.timings) && Arrays.equals(this.amplitudes, hapticsVibrationType.amplitudes) && Arrays.equals(this.oldSDKPattern, hapticsVibrationType.oldSDKPattern);
        }
        return false;
    }

    public final int[] getAmplitudes() {
        return this.amplitudes;
    }

    public final long[] getOldSDKPattern() {
        return this.oldSDKPattern;
    }

    public final long[] getTimings() {
        return this.timings;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.timings) * 31) + Arrays.hashCode(this.amplitudes)) * 31) + Arrays.hashCode(this.oldSDKPattern);
    }

    public String toString() {
        String arrays = Arrays.toString(this.timings);
        String arrays2 = Arrays.toString(this.amplitudes);
        String arrays3 = Arrays.toString(this.oldSDKPattern);
        return "HapticsVibrationType(timings=" + arrays + ", amplitudes=" + arrays2 + ", oldSDKPattern=" + arrays3 + ")";
    }
}