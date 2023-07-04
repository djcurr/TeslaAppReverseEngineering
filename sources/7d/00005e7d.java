package com.tencent.mm.opensdk.diffdev.a;

import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;

/* loaded from: classes6.dex */
public enum d {
    UUID_EXPIRED(WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE),
    UUID_CANCELED(DownloaderService.STATUS_FORBIDDEN),
    UUID_SCANED(WalletConstants.ERROR_CODE_INVALID_PARAMETERS),
    UUID_CONFIRM(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);
    

    /* renamed from: a  reason: collision with root package name */
    private int f21363a;

    d(int i11) {
        this.f21363a = i11;
    }

    public int a() {
        return this.f21363a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f21363a;
    }
}