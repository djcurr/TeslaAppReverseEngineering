package com.tesla.data.oapi;

import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.stripe.android.core.networking.NetworkConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import vz.m;

/* loaded from: classes6.dex */
public enum j {
    NO_NETWORK(-3),
    UNKNOWN(-2),
    TIMEOUT(-1),
    SUCCESS(200),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(DownloaderService.STATUS_FORBIDDEN),
    NOT_FOUND(WalletConstants.ERROR_CODE_INVALID_PARAMETERS),
    SERVER_ERROR(500),
    MOBILE_ACCESS_DISABLED(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR),
    PRODUCT_OFFLINE(408),
    BACKEND_DEPENDENCY_FAILURE_OR_MISSING_DATA(WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION),
    UNPROCESSABLE_ENTITY(422),
    ACCOUNT_LOCKED(423),
    UPSTREAM_DEPENDENCY_ERROR(424),
    TOO_MANY_REQUESTS(NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS),
    SERVER_SYSTEM_WIDE_ERROR(502),
    SERVER_MAINTENANCE(503),
    GATEWAY_TIMEOUT(504),
    VEHICLE_SPECIFIC_ERROR(540);
    
    public static final a Companion = new a(null);
    private final int code;
    private final vz.k isLocalError$delegate;
    private final vz.k isSuccess$delegate;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(int i11) {
            j jVar;
            j[] values = j.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    jVar = null;
                    break;
                }
                jVar = values[i12];
                if (jVar.getCode() == i11) {
                    break;
                }
                i12++;
            }
            return jVar == null ? j.UNKNOWN : jVar;
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends u implements h00.a<Boolean> {
        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.getCode() < 0);
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends u implements h00.a<Boolean> {
        c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.getCode() >= j.SUCCESS.getCode() && j.this.getCode() < j.BAD_REQUEST.getCode());
        }
    }

    j(int i11) {
        vz.k a11;
        vz.k a12;
        this.code = i11;
        a11 = m.a(new c());
        this.isSuccess$delegate = a11;
        a12 = m.a(new b());
        this.isLocalError$delegate = a12;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean isLocalError() {
        return ((Boolean) this.isLocalError$delegate.getValue()).booleanValue();
    }

    public final boolean isSuccess() {
        return ((Boolean) this.isSuccess$delegate.getValue()).booleanValue();
    }
}