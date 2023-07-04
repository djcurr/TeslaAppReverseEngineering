package p8;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f46388a;

    /* renamed from: b  reason: collision with root package name */
    public String f46389b;

    /* renamed from: c  reason: collision with root package name */
    public String f46390c;

    /* renamed from: d  reason: collision with root package name */
    public String f46391d;

    /* renamed from: e  reason: collision with root package name */
    public String f46392e;

    /* renamed from: f  reason: collision with root package name */
    public String f46393f;

    /* renamed from: g  reason: collision with root package name */
    public String f46394g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f46388a = str;
        this.f46389b = str2;
        this.f46390c = str3;
        this.f46391d = str4;
        this.f46392e = str5;
        this.f46393f = str6;
        this.f46394g = str7;
    }

    public final String toString() {
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        String str2;
        StringBuilder sb4;
        String str3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f46388a);
        stringBuffer.append("," + this.f46389b);
        stringBuffer.append("," + this.f46390c);
        stringBuffer.append("," + this.f46391d);
        if (x9.a.c(this.f46392e) || this.f46392e.length() < 20) {
            sb2 = new StringBuilder(",");
            str = this.f46392e;
        } else {
            sb2 = new StringBuilder(",");
            str = this.f46392e.substring(0, 20);
        }
        sb2.append(str);
        stringBuffer.append(sb2.toString());
        if (x9.a.c(this.f46393f) || this.f46393f.length() < 20) {
            sb3 = new StringBuilder(",");
            str2 = this.f46393f;
        } else {
            sb3 = new StringBuilder(",");
            str2 = this.f46393f.substring(0, 20);
        }
        sb3.append(str2);
        stringBuffer.append(sb3.toString());
        if (x9.a.c(this.f46394g) || this.f46394g.length() < 20) {
            sb4 = new StringBuilder(",");
            str3 = this.f46394g;
        } else {
            sb4 = new StringBuilder(",");
            str3 = this.f46394g.substring(0, 20);
        }
        sb4.append(str3);
        stringBuffer.append(sb4.toString());
        return stringBuffer.toString();
    }
}