package jg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import t3.g;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f33677a;

    private a() {
    }

    public static a d() {
        if (f33677a == null) {
            f33677a = new a();
        }
        return f33677a;
    }

    private boolean e() {
        return g.b(Locale.getDefault()) == 1;
    }

    private boolean f(Context context, String str, boolean z11) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z11);
    }

    private boolean h(Context context) {
        return f(context, "RCTI18nUtil_allowRTL", true);
    }

    private boolean i(Context context) {
        return f(context, "RCTI18nUtil_forceRTL", false);
    }

    private void j(Context context, String str, boolean z11) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z11);
        edit.apply();
    }

    public void a(Context context, boolean z11) {
        j(context, "RCTI18nUtil_allowRTL", z11);
    }

    public boolean b(Context context) {
        return f(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public void c(Context context, boolean z11) {
        j(context, "RCTI18nUtil_forceRTL", z11);
    }

    public boolean g(Context context) {
        if (i(context)) {
            return true;
        }
        return h(context) && e();
    }

    public void k(Context context, boolean z11) {
        j(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z11);
    }
}