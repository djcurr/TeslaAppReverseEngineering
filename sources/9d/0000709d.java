package gs;

import android.app.PendingIntent;
import android.content.Context;
import bt.b;
import com.teslamotors.tesla.R;
import ct.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f28088a;

    /* renamed from: b  reason: collision with root package name */
    private final d f28089b;

    /* renamed from: gs.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0533a {
        private C0533a() {
        }

        public /* synthetic */ C0533a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0533a(null);
    }

    public a(Context context, d localNotification) {
        s.g(context, "context");
        s.g(localNotification, "localNotification");
        this.f28088a = context;
        this.f28089b = localNotification;
    }

    @Override // bt.b
    public void a() {
        PendingIntent activity = PendingIntent.getActivity(this.f28088a, 0, zu.a.a(this.f28088a), 201326592);
        s.f(activity, "getActivity(\n      conte…FLAG_UPDATE_CURRENT\n    )");
        d dVar = this.f28089b;
        Context context = this.f28088a;
        String string = context.getString(R.string.low_disk_storage_warning_title);
        s.f(string, "context.getString(R.stri…sk_storage_warning_title)");
        String string2 = this.f28088a.getString(R.string.low_disk_storage_warning_message);
        s.f(string2, "context.getString(R.stri…_storage_warning_message)");
        dVar.a(context, string, string2, activity, 457);
    }
}