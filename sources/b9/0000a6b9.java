package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.List;
import java.util.UUID;
import org.webrtc.Logging;

/* loaded from: classes4.dex */
public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* renamed from: ns  reason: collision with root package name */
    private NoiseSuppressor f43958ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    private WebRtcAudioEffects() {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.d(TAG, "ctor" + threadInfo);
    }

    private static void assertTrue(boolean z11) {
        if (!z11) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z11 = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseAcousticEchoCanceler: " + z11);
        return z11;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z11 = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseNoiseSuppressor: " + z11);
        return z11;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            Logging.w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        AudioEffect.Descriptor[] availableEffects;
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            Logging.w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        AudioEffect.Descriptor[] availableEffects;
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i11) {
        Logging.d(TAG, "enable(audioSession=" + i11 + ")");
        boolean z11 = true;
        assertTrue(this.aec == null);
        assertTrue(this.f43958ns == null);
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i11);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z12 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z12) != 0) {
                    Logging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                Logging.d(TAG, "AcousticEchoCanceler: was " + (enabled ? "enabled" : "disabled") + ", enable: " + z12 + ", is now: " + (this.aec.getEnabled() ? "enabled" : "disabled"));
            } else {
                Logging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i11);
            this.f43958ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (!this.shouldEnableNs || !canUseNoiseSuppressor()) {
                    z11 = false;
                }
                if (this.f43958ns.setEnabled(z11) != 0) {
                    Logging.e(TAG, "Failed to set the NoiseSuppressor state");
                }
                Logging.d(TAG, "NoiseSuppressor: was " + (enabled2 ? "enabled" : "disabled") + ", enable: " + z11 + ", is now: " + (this.f43958ns.getEnabled() ? "enabled" : "disabled"));
                return;
            }
            Logging.e(TAG, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f43958ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f43958ns = null;
        }
    }

    public boolean setAEC(boolean z11) {
        Logging.d(TAG, "setAEC(" + z11 + ")");
        if (!canUseAcousticEchoCanceler()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec != null && z11 != this.shouldEnableAec) {
            Logging.e(TAG, "Platform AEC state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableAec = z11;
            return true;
        }
    }

    public boolean setNS(boolean z11) {
        Logging.d(TAG, "setNS(" + z11 + ")");
        if (!canUseNoiseSuppressor()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.f43958ns != null && z11 != this.shouldEnableNs) {
            Logging.e(TAG, "Platform NS state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableNs = z11;
            return true;
        }
    }
}