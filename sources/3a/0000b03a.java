package r6;

import com.adyen.threeds2.CompletionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C1075a f49254b = new C1075a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f49255a;

    /* renamed from: r6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1075a {
        private C1075a() {
        }

        public /* synthetic */ C1075a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a b(C1075a c1075a, CompletionEvent completionEvent, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            return c1075a.a(completionEvent, str);
        }

        public final a a(CompletionEvent completionEvent, String str) {
            s.g(completionEvent, "completionEvent");
            String transactionStatus = completionEvent.getTransactionStatus();
            boolean c11 = s.c("Y", transactionStatus);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transStatus", transactionStatus);
            jSONObject.putOpt("authorisationToken", str);
            String c12 = g7.a.c(jSONObject.toString());
            s.f(c12, "encode(jsonObject.toString())");
            return new a(c11, c12, null);
        }
    }

    private a(boolean z11, String str) {
        this.f49255a = str;
    }

    public /* synthetic */ a(boolean z11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str);
    }

    public final String a() {
        return this.f49255a;
    }
}