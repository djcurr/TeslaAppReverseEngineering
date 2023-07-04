package f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f extends f.a<Intent, androidx.activity.result.a> {

    /* loaded from: classes.dex */
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

    @Override // f.a
    /* renamed from: a */
    public Intent createIntent(Context context, Intent input) {
        s.g(context, "context");
        s.g(input, "input");
        return input;
    }

    @Override // f.a
    /* renamed from: b */
    public androidx.activity.result.a parseResult(int i11, Intent intent) {
        return new androidx.activity.result.a(i11, intent);
    }
}