package org.webrtc;

/* loaded from: classes4.dex */
public class DtmfSender {
    private long nativeDtmfSender;

    public DtmfSender(long j11) {
        this.nativeDtmfSender = j11;
    }

    private void checkDtmfSenderExists() {
        if (this.nativeDtmfSender == 0) {
            throw new IllegalStateException("DtmfSender has been disposed.");
        }
    }

    private static native boolean nativeCanInsertDtmf(long j11);

    private static native int nativeDuration(long j11);

    private static native boolean nativeInsertDtmf(long j11, String str, int i11, int i12);

    private static native int nativeInterToneGap(long j11);

    private static native String nativeTones(long j11);

    public boolean canInsertDtmf() {
        checkDtmfSenderExists();
        return nativeCanInsertDtmf(this.nativeDtmfSender);
    }

    public void dispose() {
        checkDtmfSenderExists();
        JniCommon.nativeReleaseRef(this.nativeDtmfSender);
        this.nativeDtmfSender = 0L;
    }

    public int duration() {
        checkDtmfSenderExists();
        return nativeDuration(this.nativeDtmfSender);
    }

    public boolean insertDtmf(String str, int i11, int i12) {
        checkDtmfSenderExists();
        return nativeInsertDtmf(this.nativeDtmfSender, str, i11, i12);
    }

    public int interToneGap() {
        checkDtmfSenderExists();
        return nativeInterToneGap(this.nativeDtmfSender);
    }

    public String tones() {
        checkDtmfSenderExists();
        return nativeTones(this.nativeDtmfSender);
    }
}