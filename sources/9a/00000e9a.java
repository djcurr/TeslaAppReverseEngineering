package by;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import ezvcard.property.Kind;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f8334c;

    /* renamed from: a  reason: collision with root package name */
    private Context f8335a;

    /* renamed from: b  reason: collision with root package name */
    private LocationManager f8336b;

    private a(Context context) {
        this.f8335a = context;
        this.f8336b = (LocationManager) context.getSystemService(Kind.LOCATION);
    }

    public static a e(Context context) {
        if (f8334c == null) {
            f8334c = new a(context.getApplicationContext());
        }
        return f8334c;
    }

    public boolean a() {
        return this.f8336b.isProviderEnabled("gps");
    }

    public boolean b() {
        return this.f8336b.isProviderEnabled("network");
    }

    public boolean c() {
        return this.f8336b.isProviderEnabled("passive");
    }

    public boolean d() {
        int i11;
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                i11 = Settings.Secure.getInt(this.f8335a.getContentResolver(), "location_mode");
            } catch (Settings.SettingNotFoundException unused) {
                i11 = 0;
            }
            return i11 != 0;
        }
        return !TextUtils.isEmpty(Settings.Secure.getString(this.f8335a.getContentResolver(), "location_providers_allowed"));
    }
}