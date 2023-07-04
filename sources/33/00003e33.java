package com.henninghall.date_picker;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import rp.l;
import rp.m;
import rp.n;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a */
    private Calendar f17483a = null;

    /* renamed from: b */
    private final rp.a f17484b = new rp.a();

    /* renamed from: c */
    private final rp.j f17485c = new rp.j();

    /* renamed from: d */
    private final rp.f f17486d = new rp.f();

    /* renamed from: e */
    private final rp.c f17487e = new rp.c();

    /* renamed from: f */
    private final l f17488f = new l();

    /* renamed from: g */
    private final rp.i f17489g = new rp.i();

    /* renamed from: h */
    private final rp.h f17490h = new rp.h();

    /* renamed from: i */
    private final rp.g f17491i = new rp.g();

    /* renamed from: j */
    private final m f17492j = new m();

    /* renamed from: k */
    private final rp.d f17493k = new rp.d();

    /* renamed from: l */
    private final n f17494l = new n();

    /* renamed from: m */
    private final rp.b f17495m = new rp.b();

    /* renamed from: n */
    private final rp.e f17496n = new rp.e();

    /* renamed from: o */
    private final HashMap f17497o = new a();

    /* renamed from: p */
    public b f17498p = new b(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends HashMap<String, rp.k> {
        a() {
            j.this = r3;
            put("date", r3.f17484b);
            put("mode", r3.f17485c);
            put("locale", r3.f17486d);
            put("fadeToColor", r3.f17487e);
            put("textColor", r3.f17488f);
            put("minuteInterval", r3.f17489g);
            put("minimumDate", r3.f17490h);
            put("maximumDate", r3.f17491i);
            put("timezoneOffsetInMinutes", r3.f17492j);
            put(Snapshot.HEIGHT, r3.f17493k);
            put("androidVariant", r3.f17494l);
            put("dividerHeight", r3.f17495m);
            put("is24hourSource", r3.f17496n);
        }
    }

    private rp.k B(String str) {
        return (rp.k) this.f17497o.get(str);
    }

    private Calendar n() {
        return k.h(s(), D());
    }

    public Calendar A() {
        Calendar n11 = n();
        int y11 = y();
        if (y11 <= 1) {
            return n11;
        }
        n11.add(12, -(Integer.parseInt(new SimpleDateFormat("mm", u()).format(n11.getTime())) % y11));
        return (Calendar) n11.clone();
    }

    public String C() {
        return this.f17488f.a();
    }

    public TimeZone D() {
        Integer a11 = this.f17492j.a();
        if (a11 == null) {
            return TimeZone.getDefault();
        }
        int abs = Math.abs(a11.intValue());
        char c11 = a11.intValue() < 0 ? CoreConstants.DASH_CHAR : '+';
        int floor = (int) Math.floor(abs / 60.0f);
        return DesugarTimeZone.getTimeZone("GMT" + c11 + floor + ":" + k.l(abs - (floor * 60)));
    }

    public qp.c E() {
        return this.f17494l.a();
    }

    public void F(Calendar calendar) {
        this.f17483a = calendar;
    }

    public void G(String str, Dynamic dynamic) {
        B(str).b(dynamic);
    }

    public int o() {
        return this.f17495m.a().intValue();
    }

    public String p() {
        return this.f17487e.a();
    }

    public Integer q() {
        return this.f17493k.a();
    }

    public qp.a r() {
        return this.f17496n.a();
    }

    public String s() {
        return this.f17484b.a();
    }

    public Calendar t() {
        return this.f17483a;
    }

    public Locale u() {
        return this.f17486d.a();
    }

    public String v() {
        return this.f17486d.f();
    }

    public Calendar w() {
        return k.h(this.f17491i.a(), D());
    }

    public Calendar x() {
        return k.h(this.f17490h.a(), D());
    }

    public int y() {
        return this.f17489g.a().intValue();
    }

    public qp.b z() {
        return this.f17485c.a();
    }
}