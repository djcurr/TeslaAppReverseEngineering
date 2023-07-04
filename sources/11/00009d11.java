package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
class DTLSEpoch {
    private final TlsCipher cipher;
    private final int epoch;
    private final DTLSReplayWindow replayWindow = new DTLSReplayWindow();
    private long sequenceNumber = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTLSEpoch(int i11, TlsCipher tlsCipher) {
        if (i11 < 0) {
            throw new IllegalArgumentException("'epoch' must be >= 0");
        }
        if (tlsCipher != null) {
            this.epoch = i11;
            this.cipher = tlsCipher;
            return;
        }
        throw new IllegalArgumentException("'cipher' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long allocateSequenceNumber() {
        long j11 = this.sequenceNumber;
        this.sequenceNumber = 1 + j11;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsCipher getCipher() {
        return this.cipher;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEpoch() {
        return this.epoch;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTLSReplayWindow getReplayWindow() {
        return this.replayWindow;
    }

    long getSequenceNumber() {
        return this.sequenceNumber;
    }
}