package freemarker.core;

import freemarker.core.a;
import freemarker.template.utility.NullArgumentException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public class Configurable {

    /* renamed from: a  reason: collision with root package name */
    private Configurable f26822a;

    /* renamed from: b  reason: collision with root package name */
    private Properties f26823b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f26824c;

    /* renamed from: d  reason: collision with root package name */
    private Locale f26825d;

    /* renamed from: e  reason: collision with root package name */
    private String f26826e;

    /* renamed from: f  reason: collision with root package name */
    private String f26827f;

    /* renamed from: g  reason: collision with root package name */
    private String f26828g;

    /* renamed from: h  reason: collision with root package name */
    private String f26829h;

    /* renamed from: i  reason: collision with root package name */
    private TimeZone f26830i;

    /* renamed from: j  reason: collision with root package name */
    private TimeZone f26831j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f26832k;

    /* renamed from: l  reason: collision with root package name */
    private ix.o f26833l;

    /* renamed from: m  reason: collision with root package name */
    private a f26834m;

    /* renamed from: n  reason: collision with root package name */
    private ix.g f26835n;

    /* renamed from: o  reason: collision with root package name */
    private Boolean f26836o;

    /* renamed from: p  reason: collision with root package name */
    private j f26837p;

    /* renamed from: q  reason: collision with root package name */
    private Boolean f26838q;

    /* renamed from: t  reason: collision with root package name */
    private Boolean f26839t;

    /* renamed from: w  reason: collision with root package name */
    private Boolean f26840w;

    /* loaded from: classes5.dex */
    public static class SettingValueAssignmentException extends _MiscTemplateException {
    }

    /* loaded from: classes5.dex */
    public static class UnknownSettingException extends _MiscTemplateException {
    }

    public Configurable() {
        this(ix.a.E);
    }

    public void a(String str) {
        NullArgumentException.a("booleanFormat", str);
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            this.f26823b.setProperty("boolean_format", str);
            if (str.equals("true,false")) {
                return;
            }
            str.substring(0, indexOf);
            str.substring(indexOf + 1);
            return;
        }
        throw new IllegalArgumentException("Setting value must be string that contains two comma-separated values for true and false, respectively.");
    }

    protected Object clone() {
        Configurable configurable = (Configurable) super.clone();
        configurable.f26823b = new Properties(this.f26823b);
        configurable.f26824c = (HashMap) this.f26824c.clone();
        return configurable;
    }

    protected Configurable(ix.p pVar) {
        ix.q.a(pVar);
        this.f26822a = null;
        this.f26823b = new Properties();
        Locale locale = Locale.getDefault();
        this.f26825d = locale;
        this.f26823b.setProperty("locale", locale.toString());
        TimeZone timeZone = TimeZone.getDefault();
        this.f26830i = timeZone;
        this.f26823b.setProperty("time_zone", timeZone.getID());
        this.f26831j = null;
        this.f26823b.setProperty("sql_date_and_time_time_zone", String.valueOf((Object) null));
        this.f26826e = "number";
        this.f26823b.setProperty("number_format", "number");
        this.f26827f = "";
        this.f26823b.setProperty("time_format", "");
        this.f26828g = "";
        this.f26823b.setProperty("date_format", "");
        this.f26829h = "";
        this.f26823b.setProperty("datetime_format", "");
        Integer num = new Integer(0);
        this.f26832k = num;
        this.f26823b.setProperty("classic_compatible", num.toString());
        ix.o c11 = ix.q.c(pVar);
        this.f26833l = c11;
        this.f26823b.setProperty("template_exception_handler", c11.getClass().getName());
        a.C0520a c0520a = a.f26864a;
        this.f26834m = c0520a;
        this.f26823b.setProperty("arithmetic_engine", c0520a.getClass().getName());
        this.f26835n = ix.a.d(pVar);
        Boolean bool = Boolean.TRUE;
        this.f26836o = bool;
        this.f26823b.setProperty("auto_flush", bool.toString());
        j jVar = j.f26882a;
        this.f26837p = jVar;
        this.f26823b.setProperty("new_builtin_class_resolver", jVar.getClass().getName());
        this.f26838q = bool;
        this.f26823b.setProperty("show_error_tips", bool.toString());
        Boolean bool2 = Boolean.FALSE;
        this.f26839t = bool2;
        this.f26823b.setProperty("api_builtin_enabled", bool2.toString());
        Boolean valueOf = Boolean.valueOf(ix.q.b(pVar));
        this.f26840w = valueOf;
        this.f26823b.setProperty("log_template_exceptions", valueOf.toString());
        a("true,false");
        this.f26824c = new HashMap();
    }
}