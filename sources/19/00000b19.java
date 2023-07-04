package atd.t;

import android.content.Context;
import android.provider.Settings;
import atd.q.a;

/* loaded from: classes.dex */
public final class b extends atd.q.a {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6954a;

        static {
            int[] iArr = new int[a.EnumC0126a.values().length];
            f6954a = iArr;
            try {
                iArr[a.EnumC0126a.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6954a[a.EnumC0126a.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6954a[a.EnumC0126a.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6954a[a.EnumC0126a.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(String str, String str2) {
        super(str, str2);
    }

    @Override // atd.q.a
    protected Object b(Context context) {
        try {
            int i11 = a.f6954a[f().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return Settings.System.getString(context.getContentResolver(), e());
                    }
                    return Long.valueOf(Settings.System.getLong(context.getContentResolver(), e()));
                }
                return Float.valueOf(Settings.System.getFloat(context.getContentResolver(), e()));
            }
            return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), e()));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }
}