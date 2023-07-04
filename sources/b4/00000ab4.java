package atd.k0;

import android.content.Context;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f6892a;

    static {
        atd.s0.a.a(-791436582513216L);
    }

    private b(String str) {
        this.f6892a = str == null ? atd.s0.a.a(-791629856041536L) : str;
    }

    public static b a() {
        return a(atd.s0.a.a(-791513891924544L));
    }

    public static b a(String str) {
        return new b(str);
    }

    @Override // atd.k0.a
    public String a(Context context, String str) {
        return context.getSharedPreferences(this.f6892a, 0).getString(str, null);
    }

    @Override // atd.k0.a
    public void a(Context context, String str, String str2) {
        context.getSharedPreferences(this.f6892a, 0).edit().putString(str, str2).apply();
    }
}