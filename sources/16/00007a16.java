package io.sentry;

import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.util.Locale;

/* loaded from: classes5.dex */
public enum x3 implements x0 {
    OK(200, 299),
    CANCELLED(DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(WalletConstants.ERROR_CODE_INVALID_PARAMETERS),
    ALREADY_EXISTS(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR),
    PERMISSION_DENIED(DownloaderService.STATUS_FORBIDDEN),
    RESOURCE_EXHAUSTED(NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS),
    FAILED_PRECONDITION(400),
    ABORTED(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);
    
    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    /* loaded from: classes5.dex */
    public static final class a implements n0<x3> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public x3 a(t0 t0Var, d0 d0Var) {
            return x3.valueOf(t0Var.D0().toUpperCase(Locale.ROOT));
        }
    }

    x3(int i11) {
        this.minHttpStatusCode = i11;
        this.maxHttpStatusCode = i11;
    }

    public static x3 fromHttpStatusCode(int i11) {
        x3[] values;
        for (x3 x3Var : values()) {
            if (x3Var.matches(i11)) {
                return x3Var;
            }
        }
        return null;
    }

    private boolean matches(int i11) {
        return i11 >= this.minHttpStatusCode && i11 <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.G0(name().toLowerCase(Locale.ROOT));
    }

    public static x3 fromHttpStatusCode(Integer num, x3 x3Var) {
        x3 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : x3Var;
        return fromHttpStatusCode != null ? fromHttpStatusCode : x3Var;
    }

    x3(int i11, int i12) {
        this.minHttpStatusCode = i11;
        this.maxHttpStatusCode = i12;
    }
}