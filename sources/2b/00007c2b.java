package js;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class l extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    private final String f33965a;

    public l() {
        this(null, 1, null);
    }

    public /* synthetic */ l(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && s.c(getMessage(), ((l) obj).getMessage());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f33965a;
    }

    public int hashCode() {
        if (getMessage() == null) {
            return 0;
        }
        return getMessage().hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return "UnauthorizedTokenRefreshException(message=" + message + ")";
    }

    public l(String str) {
        super(str);
        this.f33965a = str;
    }
}