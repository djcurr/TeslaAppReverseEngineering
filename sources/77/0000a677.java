package org.webrtc.audio;

import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

/* loaded from: classes4.dex */
class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    /* loaded from: classes4.dex */
    private class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        LogVolumeTask(int i11, int i12) {
            this.maxRingVolume = i11;
            this.maxVoiceCallVolume = i12;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                int streamVolume = VolumeLogger.this.audioManager.getStreamVolume(2);
                int i11 = this.maxRingVolume;
                Logging.d(VolumeLogger.TAG, "STREAM_RING stream volume: " + streamVolume + " (max=" + i11 + ")");
            } else if (mode == 3) {
                int streamVolume2 = VolumeLogger.this.audioManager.getStreamVolume(0);
                int i12 = this.maxVoiceCallVolume;
                Logging.d(VolumeLogger.TAG, "VOICE_CALL stream volume: " + streamVolume2 + " (max=" + i12 + ")");
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.d(TAG, "start" + threadInfo);
        if (this.timer != null) {
            return;
        }
        String modeToString = WebRtcAudioUtils.modeToString(this.audioManager.getMode());
        Logging.d(TAG, "audio mode is: " + modeToString);
        Timer timer = new Timer(THREAD_NAME);
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    public void stop() {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.d(TAG, "stop" + threadInfo);
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}