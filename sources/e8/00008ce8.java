package ns;

import android.content.Context;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41862a = new a();

    private a() {
    }

    public final boolean a(Context context) {
        s.g(context, "context");
        return androidx.core.content.b.checkSelfPermission(context.getApplicationContext(), "android.permission.READ_CALENDAR") == 0;
    }
}