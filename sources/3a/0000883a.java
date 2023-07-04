package my;

import java.util.Objects;
import ky.d;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final d<Object, Object> f39649a = new a();

    /* loaded from: classes5.dex */
    static final class a implements d<Object, Object> {
        a() {
        }

        @Override // ky.d
        public boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public static <T> d<T, T> a() {
        return (d<T, T>) f39649a;
    }

    public static int b(int i11, String str) {
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i11);
    }
}