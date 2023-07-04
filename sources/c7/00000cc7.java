package bl;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public int f7875a;

    /* renamed from: b  reason: collision with root package name */
    public int f7876b;

    /* renamed from: c  reason: collision with root package name */
    public String f7877c;

    /* renamed from: d  reason: collision with root package name */
    public String f7878d;

    /* renamed from: e  reason: collision with root package name */
    public String f7879e;

    /* renamed from: f  reason: collision with root package name */
    public long f7880f;

    /* renamed from: g  reason: collision with root package name */
    public String f7881g;

    public static k a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        str2 = "";
        if (-1 != indexOf) {
            String substring = str.substring(0, indexOf);
            str2 = indexOf < str.length() ? str.substring(indexOf + 1) : "";
            str = substring;
        }
        String[] split = TextUtils.split(str, Pattern.quote("|"));
        if (split.length >= 6) {
            k kVar = new k();
            kVar.f7881g = str2;
            kVar.f7875a = Integer.parseInt(split[0]);
            kVar.f7876b = Integer.parseInt(split[1]);
            kVar.f7877c = split[2];
            kVar.f7878d = split[3];
            kVar.f7879e = split[4];
            kVar.f7880f = Long.parseLong(split[5]);
            return kVar;
        }
        throw new IllegalArgumentException("Wrong number of fields.");
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f7875a), Integer.valueOf(this.f7876b), this.f7877c, this.f7878d, this.f7879e, Long.valueOf(this.f7880f)});
    }
}