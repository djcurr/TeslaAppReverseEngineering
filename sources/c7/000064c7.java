package d10;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class e implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f23290c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final e f23291d = new e(-1, -1);

    /* renamed from: a  reason: collision with root package name */
    private final int f23292a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23293b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f23291d;
        }
    }

    public e(int i11, int i12) {
        this.f23292a = i11;
        this.f23293b = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f23292a == eVar.f23292a && this.f23293b == eVar.f23293b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f23292a * 31) + this.f23293b;
    }

    public String toString() {
        return "Position(line=" + this.f23292a + ", column=" + this.f23293b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}