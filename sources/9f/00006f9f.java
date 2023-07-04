package g30;

import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public interface b0<T> extends c30.b<T> {

    /* loaded from: classes5.dex */
    public static final class a {
        public static <T> KSerializer<?>[] a(b0<T> b0Var) {
            return i1.f27601a;
        }
    }

    KSerializer<?>[] childSerializers();

    KSerializer<?>[] typeParametersSerializers();
}