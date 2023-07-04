package org.webrtc;

import org.webrtc.Logging;

/* loaded from: classes4.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i11, Logging.Severity severity) {
        if (str != null) {
            this.nativeSink = nativeAddSink(str, i11, severity.ordinal());
            return;
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    private static native long nativeAddSink(String str, int i11, int i12);

    private static native void nativeDeleteSink(long j11);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j11 = this.nativeSink;
        if (j11 != 0) {
            nativeDeleteSink(j11);
            this.nativeSink = 0L;
        }
    }
}