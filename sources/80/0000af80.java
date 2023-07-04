package r00;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface d<M extends Member> {

    /* loaded from: classes5.dex */
    public static final class a {
        public static <M extends Member> void a(d<? extends M> dVar, Object[] args) {
            s.g(args, "args");
            if (f.a(dVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + f.a(dVar) + " arguments, but " + args.length + " were provided.");
        }
    }

    List<Type> a();

    M b();

    Object call(Object[] objArr);

    Type getReturnType();
}