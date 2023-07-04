package org.spongycastle.jce.provider;

import org.spongycastle.asn1.x509.ReasonFlags;

/* loaded from: classes4.dex */
class ReasonsMask {
    static final ReasonsMask allReasons = new ReasonsMask(33023);
    private int _reasons;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReasonsMask(ReasonFlags reasonFlags) {
        this._reasons = reasonFlags.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addReasons(ReasonsMask reasonsMask) {
        this._reasons = reasonsMask.getReasons() | this._reasons;
    }

    int getReasons() {
        return this._reasons;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasNewReasons(ReasonsMask reasonsMask) {
        return ((reasonsMask.getReasons() ^ this._reasons) | this._reasons) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReasonsMask intersect(ReasonsMask reasonsMask) {
        ReasonsMask reasonsMask2 = new ReasonsMask();
        reasonsMask2.addReasons(new ReasonsMask(reasonsMask.getReasons() & this._reasons));
        return reasonsMask2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isAllReasons() {
        return this._reasons == allReasons._reasons;
    }

    private ReasonsMask(int i11) {
        this._reasons = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReasonsMask() {
        this(0);
    }
}