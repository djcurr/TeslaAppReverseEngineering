package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import v20.a2;
import v20.h0;

/* loaded from: classes5.dex */
public final class TimeoutCancellationException extends CancellationException implements h0<TimeoutCancellationException> {

    /* renamed from: a  reason: collision with root package name */
    public final a2 f35228a;

    public TimeoutCancellationException(String str, a2 a2Var) {
        super(str);
        this.f35228a = a2Var;
    }

    @Override // v20.h0
    /* renamed from: b */
    public TimeoutCancellationException a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f35228a);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}