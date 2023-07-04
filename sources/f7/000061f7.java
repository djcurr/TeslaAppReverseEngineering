package com.teslamotors.plugins.ble.authengine;

import bu.j;
import bu.o;
import hv.b;
import io.realm.internal.Keep;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0013\u0010\n\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/teslamotors/plugins/ble/authengine/AuthorizationResult;", "", "Lbu/j;", "level", "Lbu/o;", "shouldAuthorizeIncludingIMUState", "shouldAuthorize", "", "getAnalyticsName", "()Ljava/lang/String;", "analyticsName", "<init>", "(Ljava/lang/String;I)V", "PASSIVE_AUTH_DISABLED", "DEVICE_MOTION_UNAVAILABLE", "IS_MOVING", "IS_STATIONARY", "NO_FRESH_DATA", "tesla-ble_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
@Keep
/* loaded from: classes6.dex */
public enum AuthorizationResult {
    PASSIVE_AUTH_DISABLED,
    DEVICE_MOTION_UNAVAILABLE,
    IS_MOVING,
    IS_STATIONARY,
    NO_FRESH_DATA;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22151a;

        static {
            int[] iArr = new int[AuthorizationResult.values().length];
            iArr[AuthorizationResult.DEVICE_MOTION_UNAVAILABLE.ordinal()] = 1;
            iArr[AuthorizationResult.IS_MOVING.ordinal()] = 2;
            iArr[AuthorizationResult.NO_FRESH_DATA.ordinal()] = 3;
            iArr[AuthorizationResult.PASSIVE_AUTH_DISABLED.ordinal()] = 4;
            iArr[AuthorizationResult.IS_STATIONARY.ordinal()] = 5;
            f22151a = iArr;
        }
    }

    public final String getAnalyticsName() {
        String name = name();
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        s.f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final o shouldAuthorize(j level) {
        s.g(level, "level");
        int i11 = a.f22151a[ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 == 4) {
                return b.b();
            }
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new o(level, 0, null, null, 14, null);
    }

    public final o shouldAuthorizeIncludingIMUState(j level) {
        s.g(level, "level");
        int i11 = a.f22151a[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return new o(level, 0, null, null, 14, null);
        }
        if (i11 != 4) {
            if (i11 == 5) {
                return b.a();
            }
            throw new NoWhenBranchMatchedException();
        }
        return b.b();
    }
}