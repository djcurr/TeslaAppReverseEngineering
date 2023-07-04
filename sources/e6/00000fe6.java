package c9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import c9.a;
import ch.qos.logback.classic.spi.CallerData;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import t9.c;
import t9.e;
import t9.m;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f9022a;

    /* renamed from: b  reason: collision with root package name */
    public String f9023b;

    /* renamed from: c  reason: collision with root package name */
    public String f9024c;

    /* renamed from: d  reason: collision with root package name */
    public String f9025d;

    /* renamed from: e  reason: collision with root package name */
    public String f9026e;

    /* renamed from: f  reason: collision with root package name */
    public String f9027f;

    /* renamed from: g  reason: collision with root package name */
    public String f9028g = "";

    /* renamed from: h  reason: collision with root package name */
    public String f9029h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f9030i;

    public b(Context context, boolean z11) {
        context = context != null ? context.getApplicationContext() : context;
        this.f9022a = k();
        this.f9023b = c(context);
        this.f9024c = b(z11 ? 0L : a.e.a(context));
        this.f9025d = a();
        this.f9026e = l(context);
        this.f9027f = "-";
        this.f9030i = "-";
    }

    public static String a() {
        return String.format("%s,%s,-,-,-", p(s9.a.a(r9.b.e().c()).g()), p(r9.b.e().d()));
    }

    public static String b(long j11) {
        String p11 = p("15.8.14");
        String p12 = p("h.a.3.8.14");
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", p11, p12, "~" + j11);
    }

    public static String c(Context context) {
        String packageName;
        String str = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str = packageInfo.versionName + "|" + d(packageInfo);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            return String.format("%s,%s,-,-,-", p(packageName), p(str));
        }
        packageName = "-";
        return String.format("%s,%s,-,-,-", p(packageName), p(str));
    }

    public static String d(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String str;
        String m11;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    m11 = m.m(null, signature.toByteArray());
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(m11)) {
                    str = CallerData.NA;
                    sb2.append("-");
                    sb2.append(str);
                } else {
                    str = m.X(m11).substring(0, 8);
                    sb2.append("-");
                    sb2.append(str);
                }
            }
            return sb2.toString();
        } catch (Throwable unused2) {
            return CallerData.NA;
        }
    }

    public static String f(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th2.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th2.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace != null) {
                int i11 = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i11++;
                    if (i11 > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public static String k() {
        return String.format("%s,%s", t(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    public static String l(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", p(c.d(context)), "android", p(Build.VERSION.RELEASE), p(Build.MODEL), "-", "0", p(c.f(context).b()), "gw", p(u9.b.c(null, context)));
    }

    public static String m(String str) {
        String str2;
        String str3;
        if (str == null) {
            str = "";
        }
        String[] split = str.split("&");
        String str4 = null;
        if (split != null) {
            str2 = null;
            str3 = null;
            for (String str5 : split) {
                String[] split2 = str5.split("=");
                if (split2 != null && split2.length == 2) {
                    if (split2[0].equalsIgnoreCase("partner")) {
                        str4 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase("out_trade_no")) {
                        str2 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase("trade_no")) {
                        str3 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase("biz_content")) {
                        try {
                            JSONObject jSONObject = new JSONObject(m.R(r9.a.w(), split2[1]));
                            if (TextUtils.isEmpty(str2)) {
                                str2 = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (split2[0].equalsIgnoreCase(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID) && TextUtils.isEmpty(str4)) {
                        str4 = split2[1];
                    }
                }
            }
        } else {
            str2 = null;
            str3 = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", p(str3), p(str2), p(str4));
    }

    public static String o() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public static String p(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("^", "~").replace("#", "＃");
    }

    private synchronized void q(String str, String str2, String str3) {
        e.h("mspl", String.format("event %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.f9028g)) {
            str4 = "^";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = TextUtils.isEmpty(str) ? "-" : p(str);
        objArr[1] = p(str2);
        objArr[2] = p(str3);
        objArr[3] = p(o());
        sb2.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArr));
        this.f9028g += sb2.toString();
    }

    public static String r(String str) {
        return TextUtils.isEmpty(str) ? "-" : str;
    }

    private synchronized void s(String str, String str2, String str3) {
        e.g("mspl", String.format("err %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.f9029h)) {
            str4 = "^";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = TextUtils.isEmpty(str3) ? "-" : p(str3);
        objArr[3] = p(o());
        sb2.append(String.format("%s,%s,%s,%s", objArr));
        this.f9029h += sb2.toString();
    }

    public static String t() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public String e(String str) {
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.f9022a, m(str), this.f9023b, this.f9024c, this.f9025d, this.f9026e, this.f9027f, r(this.f9028g), r(this.f9029h), this.f9030i);
    }

    public void g(String str, String str2) {
        q("", str, str2);
    }

    public void h(String str, String str2, String str3) {
        q("", str, str2 + "|" + str3);
    }

    public void i(String str, String str2, Throwable th2) {
        s(str, str2, f(th2));
    }

    public void j(String str, String str2, Throwable th2, String str3) {
        String f11 = f(th2);
        s(str, str2, str3 + ": " + f11);
    }

    public void n(String str, String str2, String str3) {
        s(str, str2, str3);
    }
}