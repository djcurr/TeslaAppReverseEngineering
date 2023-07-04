package pn;

import com.google.gson.JsonSyntaxException;
import com.google.gson.u;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class c extends u<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final v f46698b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<DateFormat> f46699a;

    /* loaded from: classes2.dex */
    class a implements v {
        a() {
        }

        @Override // com.google.gson.v
        public <T> u<T> a(com.google.gson.e eVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f46699a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (on.e.d()) {
            arrayList.add(on.j.c(2, 2));
        }
    }

    private Date e(tn.a aVar) {
        String J0 = aVar.J0();
        synchronized (this.f46699a) {
            for (DateFormat dateFormat : this.f46699a) {
                try {
                    return dateFormat.parse(J0);
                } catch (ParseException unused) {
                }
            }
            try {
                return qn.a.c(J0, new ParsePosition(0));
            } catch (ParseException e11) {
                throw new JsonSyntaxException("Failed parsing '" + J0 + "' as Date; at path " + aVar.L(), e11);
            }
        }
    }

    @Override // com.google.gson.u
    /* renamed from: f */
    public Date b(tn.a aVar) {
        if (aVar.Q0() == com.google.gson.stream.a.NULL) {
            aVar.G0();
            return null;
        }
        return e(aVar);
    }

    @Override // com.google.gson.u
    /* renamed from: g */
    public void d(com.google.gson.stream.b bVar, Date date) {
        String format;
        if (date == null) {
            bVar.n0();
            return;
        }
        DateFormat dateFormat = this.f46699a.get(0);
        synchronized (this.f46699a) {
            format = dateFormat.format(date);
        }
        bVar.S0(format);
    }
}