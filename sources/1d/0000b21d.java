package s6;

import com.adyen.checkout.components.model.payments.response.RedirectAction;
import com.adyen.checkout.components.model.payments.response.Threeds2Action;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f50296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject details) {
            super(null);
            s.g(details, "details");
            this.f50296a = details;
        }

        public final JSONObject a() {
            return this.f50296a;
        }
    }

    /* renamed from: s6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1115b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final RedirectAction f50297a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1115b(RedirectAction action) {
            super(null);
            s.g(action, "action");
            this.f50297a = action;
        }

        public final RedirectAction a() {
            return this.f50297a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final Threeds2Action f50298a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Threeds2Action action) {
            super(null);
            s.g(action, "action");
            this.f50298a = action;
        }

        public final Threeds2Action a() {
            return this.f50298a;
        }
    }

    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}