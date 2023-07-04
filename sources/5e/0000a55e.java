package org.webrtc;

/* loaded from: classes4.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i11) {
        double d11 = this.targetFramerateFps;
        if (d11 == 0.0d) {
            return;
        }
        int i12 = this.targetBitrateBps;
        double d12 = this.deviationBytes + (i11 - ((i12 / BITS_PER_BYTE) / d11));
        this.deviationBytes = d12;
        this.timeSinceLastAdjustmentMs += 1000.0d / d11;
        double d13 = i12 / BITS_PER_BYTE;
        double d14 = BITRATE_ADJUSTMENT_SEC * d13;
        double min = Math.min(d12, d14);
        this.deviationBytes = min;
        double max = Math.max(min, -d14);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d13) {
            int i13 = this.bitrateAdjustmentScaleExp - ((int) ((max / d13) + 0.5d));
            this.bitrateAdjustmentScaleExp = i13;
            this.bitrateAdjustmentScaleExp = Math.max(i13, -20);
            this.deviationBytes = d13;
        } else {
            double d15 = -d13;
            if (max < d15) {
                int i14 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d13) + 0.5d));
                this.bitrateAdjustmentScaleExp = i14;
                this.bitrateAdjustmentScaleExp = Math.min(i14, 20);
                this.deviationBytes = d15;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i11, double d11) {
        int i12 = this.targetBitrateBps;
        if (i12 > 0 && i11 < i12) {
            this.deviationBytes = (this.deviationBytes * i11) / i12;
        }
        super.setTargets(i11, d11);
    }
}