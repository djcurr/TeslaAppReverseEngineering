package v20;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zz.g;

/* loaded from: classes5.dex */
public final class n0 extends zz.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f53978b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f53979a;

    /* loaded from: classes5.dex */
    public static final class a implements g.c<n0> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public n0(String str) {
        super(f53978b);
        this.f53979a = str;
    }

    public final String I0() {
        return this.f53979a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && kotlin.jvm.internal.s.c(this.f53979a, ((n0) obj).f53979a);
    }

    public int hashCode() {
        return this.f53979a.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f53979a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}