package l5;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.q;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f36601a = q.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z11) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z11 ? 1 : 2, 1);
            q c11 = q.c();
            String str = f36601a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z11 ? "enabled" : "disabled";
            c11.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e11) {
            q c12 = q.c();
            String str2 = f36601a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z11 ? "enabled" : "disabled";
            c12.a(str2, String.format("%s could not be %s", objArr2), e11);
        }
    }
}