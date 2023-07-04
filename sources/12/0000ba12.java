package vh;

/* loaded from: classes3.dex */
public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i11, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult apply;
        if (i11 < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i11--;
        } while (i11 >= 1);
        return apply;
    }
}