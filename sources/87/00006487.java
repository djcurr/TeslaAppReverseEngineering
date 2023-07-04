package cx;

import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23165a;

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
        new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, String serviceName) {
        s.g(context, "context");
        s.g(serviceName, "serviceName");
        this.f23165a = context;
    }

    public final Context a() {
        return this.f23165a;
    }
}