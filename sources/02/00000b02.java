package atd.r;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import atd.i.c;
import atd.q.a;

/* loaded from: classes.dex */
public class a extends atd.q.a {

    /* renamed from: atd.r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0128a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6948a;

        static {
            int[] iArr = new int[a.EnumC0126a.values().length];
            f6948a = iArr;
            try {
                iArr[a.EnumC0126a.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6948a[a.EnumC0126a.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6948a[a.EnumC0126a.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6948a[a.EnumC0126a.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    @Override // atd.q.a
    protected Object b(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                int i11 = C0128a.f6948a[f().ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return Settings.Global.getString(context.getContentResolver(), e());
                        }
                        return Long.valueOf(Settings.Global.getLong(context.getContentResolver(), e()));
                    }
                    return Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), e()));
                }
                return Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), e()));
            } catch (Settings.SettingNotFoundException unused) {
                return null;
            }
        }
        throw new c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}