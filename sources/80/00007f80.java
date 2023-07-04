package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s;
import v20.a2;
import v20.h0;
import v20.r0;

/* loaded from: classes5.dex */
public final class JobCancellationException extends CancellationException implements h0<JobCancellationException> {

    /* renamed from: a  reason: collision with root package name */
    public final a2 f35227a;

    public JobCancellationException(String str, Throwable th2, a2 a2Var) {
        super(str);
        this.f35227a = a2Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // v20.h0
    /* renamed from: b */
    public JobCancellationException a() {
        if (r0.c()) {
            String message = getMessage();
            s.e(message);
            return new JobCancellationException(message, this, this.f35227a);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!s.c(jobCancellationException.getMessage(), getMessage()) || !s.c(jobCancellationException.f35227a, this.f35227a) || !s.c(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (r0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        s.e(message);
        int hashCode = ((message.hashCode() * 31) + this.f35227a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f35227a;
    }
}