package m00;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends m00.a implements f<Character> {

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        new c((char) 1, (char) 0);
    }

    public c(char c11, char c12) {
        super(c11, c12, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (c() != cVar.c() || e() != cVar.e()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean h(char c11) {
        return s.i(c(), c11) <= 0 && s.i(c11, e()) <= 0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + e();
    }

    public boolean isEmpty() {
        return s.i(c(), e()) > 0;
    }

    public String toString() {
        return c() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + e();
    }
}