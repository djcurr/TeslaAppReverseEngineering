package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.f;
import v20.r0;

/* loaded from: classes5.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    private final f<?> f35281a;

    public AbortFlowException(f<?> fVar) {
        super("Flow was aborted, no more elements needed");
        this.f35281a = fVar;
    }

    public final f<?> a() {
        return this.f35281a;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (r0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}