package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.q;
import vz.r;

/* loaded from: classes5.dex */
public abstract class a implements zz.d<Object>, e, Serializable {
    private final zz.d<Object> completion;

    public a(zz.d<Object> dVar) {
        this.completion = dVar;
    }

    public zz.d<b0> create(zz.d<?> completion) {
        s.g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        zz.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final zz.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zz.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object d11;
        zz.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            zz.d dVar2 = aVar.completion;
            s.e(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                d11 = a00.d.d();
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                obj = q.b(r.a(th2));
            }
            if (invokeSuspend == d11) {
                return;
            }
            q.a aVar3 = q.f54772b;
            obj = q.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public zz.d<b0> create(Object obj, zz.d<?> completion) {
        s.g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}