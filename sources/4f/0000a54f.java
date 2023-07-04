package org.webrtc;

/* loaded from: classes4.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final IceCandidate local;
    public final String reason;
    public final IceCandidate remote;

    @CalledByNative
    CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i11, String str, int i12) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i11;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i12;
    }
}