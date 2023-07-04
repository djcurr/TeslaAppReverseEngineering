package rp;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import java.util.Locale;

/* loaded from: classes2.dex */
public class f extends k<Locale> {

    /* renamed from: b  reason: collision with root package name */
    private String f49634b;

    public f() {
        super(e());
        this.f49634b = d();
    }

    private static String d() {
        return Build.VERSION.SDK_INT >= 21 ? Locale.getDefault().toLanguageTag().replace(CoreConstants.DASH_CHAR, '_') : "en";
    }

    private static Locale e() {
        return com.henninghall.date_picker.f.f(d());
    }

    public String f() {
        return this.f49634b;
    }

    @Override // rp.k
    /* renamed from: g */
    public Locale c(Dynamic dynamic) {
        String replace = dynamic.asString().replace(CoreConstants.DASH_CHAR, '_');
        this.f49634b = replace;
        return com.henninghall.date_picker.f.f(replace);
    }
}