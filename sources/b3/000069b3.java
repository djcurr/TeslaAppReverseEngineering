package expo.modules.haptics;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ExportedModule;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.haptics.arguments.HapticsImpactType;
import expo.modules.haptics.arguments.HapticsInvalidArgumentException;
import expo.modules.haptics.arguments.HapticsNotificationType;
import expo.modules.haptics.arguments.HapticsSelectionTypeKt;
import expo.modules.haptics.arguments.HapticsVibrationType;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lexpo/modules/haptics/HapticsModule;", "Lexpo/modules/core/ExportedModule;", "Lexpo/modules/haptics/arguments/HapticsVibrationType;", "type", "Lvz/b0;", "vibrate", "", "getName", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "notificationAsync", "selectionAsync", "style", "impactAsync", "Landroid/os/Vibrator;", "mVibrator", "Landroid/os/Vibrator;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "expo-haptics_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class HapticsModule extends ExportedModule {
    private final Vibrator mVibrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HapticsModule(Context context) {
        super(context);
        s.g(context, "context");
        Object systemService = context.getSystemService("vibrator");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.mVibrator = (Vibrator) systemService;
    }

    private final void vibrate(HapticsVibrationType hapticsVibrationType) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mVibrator.vibrate(VibrationEffect.createWaveform(hapticsVibrationType.getTimings(), hapticsVibrationType.getAmplitudes(), -1));
        } else {
            this.mVibrator.vibrate(hapticsVibrationType.getOldSDKPattern(), -1);
        }
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoHaptics";
    }

    @ExpoMethod
    public final void impactAsync(String style, Promise promise) {
        s.g(style, "style");
        s.g(promise, "promise");
        try {
            vibrate(HapticsImpactType.INSTANCE.fromString(style));
            promise.resolve(null);
        } catch (HapticsInvalidArgumentException e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void notificationAsync(String type, Promise promise) {
        s.g(type, "type");
        s.g(promise, "promise");
        try {
            vibrate(HapticsNotificationType.INSTANCE.fromString(type));
            promise.resolve(null);
        } catch (HapticsInvalidArgumentException e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void selectionAsync(Promise promise) {
        s.g(promise, "promise");
        vibrate(HapticsSelectionTypeKt.getHapticsSelectionType());
        promise.resolve(null);
    }
}