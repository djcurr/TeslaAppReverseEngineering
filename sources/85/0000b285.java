package sn;

import com.google.gson.JsonSyntaxException;
import com.google.gson.e;
import com.google.gson.u;
import com.google.gson.v;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
final class a extends u<Date> {

    /* renamed from: b  reason: collision with root package name */
    static final v f50466b = new C1120a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f50467a;

    /* renamed from: sn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C1120a implements v {
        C1120a() {
        }

        @Override // com.google.gson.v
        public <T> u<T> a(e eVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new a(null);
            }
            return null;
        }
    }

    /* synthetic */ a(C1120a c1120a) {
        this();
    }

    @Override // com.google.gson.u
    /* renamed from: e */
    public Date b(tn.a aVar) {
        java.util.Date parse;
        if (aVar.Q0() == com.google.gson.stream.a.NULL) {
            aVar.G0();
            return null;
        }
        String J0 = aVar.J0();
        try {
            synchronized (this) {
                parse = this.f50467a.parse(J0);
            }
            return new Date(parse.getTime());
        } catch (ParseException e11) {
            throw new JsonSyntaxException("Failed parsing '" + J0 + "' as SQL Date; at path " + aVar.L(), e11);
        }
    }

    @Override // com.google.gson.u
    /* renamed from: f */
    public void d(com.google.gson.stream.b bVar, Date date) {
        String format;
        if (date == null) {
            bVar.n0();
            return;
        }
        synchronized (this) {
            format = this.f50467a.format((java.util.Date) date);
        }
        bVar.S0(format);
    }

    private a() {
        this.f50467a = new SimpleDateFormat("MMM d, yyyy");
    }
}