package vh;

import java.lang.Throwable;

/* loaded from: classes3.dex */
public interface a<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput);
}