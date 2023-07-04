package pn;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonSyntaxException;
import com.google.gson.u;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class d<T extends Date> extends u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f46700a;

    /* renamed from: b  reason: collision with root package name */
    private final List<DateFormat> f46701b;

    /* loaded from: classes2.dex */
    public static abstract class b<T extends Date> {

        /* renamed from: b  reason: collision with root package name */
        public static final b<Date> f46702b = new a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f46703a;

        /* loaded from: classes2.dex */
        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // pn.d.b
            protected Date d(Date date) {
                return date;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b(Class<T> cls) {
            this.f46703a = cls;
        }

        private final v c(d<T> dVar) {
            return n.b(this.f46703a, dVar);
        }

        public final v a(int i11, int i12) {
            return c(new d<>(this, i11, i12));
        }

        public final v b(String str) {
            return c(new d<>(this, str));
        }

        protected abstract T d(Date date);
    }

    private Date e(tn.a aVar) {
        String J0 = aVar.J0();
        synchronized (this.f46701b) {
            for (DateFormat dateFormat : this.f46701b) {
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
    public T b(tn.a aVar) {
        if (aVar.Q0() == com.google.gson.stream.a.NULL) {
            aVar.G0();
            return null;
        }
        return this.f46700a.d(e(aVar));
    }

    @Override // com.google.gson.u
    /* renamed from: g */
    public void d(com.google.gson.stream.b bVar, Date date) {
        String format;
        if (date == null) {
            bVar.n0();
            return;
        }
        DateFormat dateFormat = this.f46701b.get(0);
        synchronized (this.f46701b) {
            format = dateFormat.format(date);
        }
        bVar.S0(format);
    }

    public String toString() {
        DateFormat dateFormat = this.f46701b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private d(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f46701b = arrayList;
        this.f46700a = (b) on.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private d(b<T> bVar, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        this.f46701b = arrayList;
        this.f46700a = (b) on.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i11, i12, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i11, i12));
        }
        if (on.e.d()) {
            arrayList.add(on.j.c(i11, i12));
        }
    }
}