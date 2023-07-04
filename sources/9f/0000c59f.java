package zv;

import android.content.Context;
import com.withpersona.sdk.inquiry.internal.InquiryActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f60889a;

    /* renamed from: b  reason: collision with root package name */
    private String f60890b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public f(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        this.f60889a = context;
    }

    public final String a() {
        String str = this.f60890b;
        return str == null ? this.f60889a.getSharedPreferences(kotlin.jvm.internal.m0.b(InquiryActivity.class).n(), 0).getString("persona-device-id", null) : str;
    }

    public final void b(String str) {
        if ((kotlin.jvm.internal.s.c(str, this.f60890b) ^ true ? str : null) == null) {
            return;
        }
        this.f60890b = str;
        this.f60889a.getSharedPreferences(kotlin.jvm.internal.m0.b(InquiryActivity.class).n(), 0).edit().putString("persona-device-id", str).apply();
    }
}