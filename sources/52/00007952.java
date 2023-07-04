package io.sentry;

import com.google.android.gms.common.Scopes;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public enum e3 implements x0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile(Scopes.PROFILE),
    ClientReport("client_report"),
    Unknown("__unknown__");
    
    private final String itemType;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements n0<e3> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public e3 a(t0 t0Var, d0 d0Var) {
            return e3.valueOfLabel(t0Var.D0().toLowerCase(Locale.ROOT));
        }
    }

    e3(String str) {
        this.itemType = str;
    }

    public static e3 resolve(Object obj) {
        if (obj instanceof b3) {
            return Event;
        }
        if (obj instanceof io.sentry.protocol.v) {
            return Transaction;
        }
        if (obj instanceof q3) {
            return Session;
        }
        if (obj instanceof mz.b) {
            return ClientReport;
        }
        return Attachment;
    }

    public static e3 valueOfLabel(String str) {
        e3[] values;
        for (e3 e3Var : values()) {
            if (e3Var.itemType.equals(str)) {
                return e3Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.G0(this.itemType);
    }
}