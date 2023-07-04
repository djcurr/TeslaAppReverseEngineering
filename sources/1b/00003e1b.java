package com.google.zxing.qrcode.decoder;

import com.google.zxing.l;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f17450a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(boolean z11) {
        this.f17450a = z11;
    }

    public void a(l[] lVarArr) {
        if (!this.f17450a || lVarArr == null || lVarArr.length < 3) {
            return;
        }
        l lVar = lVarArr[0];
        lVarArr[0] = lVarArr[2];
        lVarArr[2] = lVar;
    }
}