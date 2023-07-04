package r3;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private i f49118a;

    static {
        a(new Locale[0]);
    }

    private g(i iVar) {
        this.f49118a = iVar;
    }

    public static g a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return h(new LocaleList(localeArr));
        }
        return new g(new h(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static g d() {
        return Build.VERSION.SDK_INT >= 24 ? h(LocaleList.getAdjustedDefault()) : a(Locale.getDefault());
    }

    public static g h(LocaleList localeList) {
        return new g(new j(localeList));
    }

    public Locale c(int i11) {
        return this.f49118a.get(i11);
    }

    public boolean e() {
        return this.f49118a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f49118a.equals(((g) obj).f49118a);
    }

    public int f() {
        return this.f49118a.size();
    }

    public String g() {
        return this.f49118a.a();
    }

    public int hashCode() {
        return this.f49118a.hashCode();
    }

    public String toString() {
        return this.f49118a.toString();
    }
}