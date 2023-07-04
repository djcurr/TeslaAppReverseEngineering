package os;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.e0;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f43972a = new a();

    private a() {
    }

    public final p<Integer, Notification> a(Context context, List<ot.b> commands) {
        String l02;
        s.g(context, "context");
        s.g(commands, "commands");
        ArrayList arrayList = new ArrayList();
        for (ot.b bVar : commands) {
            String a11 = qs.c.a(bVar, context);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        l02 = e0.l0(arrayList, ", ", null, null, 0, null, null, 62, null);
        j.e h11 = nu.j.e(context).h("phone_key_service_channel");
        String string = context.getString(c.f43976c);
        Notification b11 = h11.m(string + " " + l02).y(0, 0, true).x(2).b();
        s.f(b11, "getDefaultNotificationBu…TANCE_LOW)\n      .build()");
        return v.a(998328, b11);
    }
}