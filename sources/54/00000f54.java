package c1;

/* loaded from: classes.dex */
public abstract class w0<T> extends q<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(h00.a<? extends T> defaultFactory) {
        super(defaultFactory, null);
        kotlin.jvm.internal.s.g(defaultFactory, "defaultFactory");
    }

    public final x0<T> c(T t11) {
        return new x0<>(this, t11, true);
    }
}