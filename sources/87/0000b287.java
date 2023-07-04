package sn;

import com.google.gson.JsonSyntaxException;
import com.google.gson.e;
import com.google.gson.u;
import com.google.gson.v;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
final class b extends u<Time> {

    /* renamed from: b  reason: collision with root package name */
    static final v f50468b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f50469a;

    /* loaded from: classes2.dex */
    class a implements v {
        a() {
        }

        @Override // com.google.gson.v
        public <T> u<T> a(e eVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new b(null);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.google.gson.u
    /* renamed from: e */
    public Time b(tn.a aVar) {
        Time time;
        if (aVar.Q0() == com.google.gson.stream.a.NULL) {
            aVar.G0();
            return null;
        }
        String J0 = aVar.J0();
        try {
            synchronized (this) {
                time = new Time(this.f50469a.parse(J0).getTime());
            }
            return time;
        } catch (ParseException e11) {
            throw new JsonSyntaxException("Failed parsing '" + J0 + "' as SQL Time; at path " + aVar.L(), e11);
        }
    }

    @Override // com.google.gson.u
    /* renamed from: f */
    public void d(com.google.gson.stream.b bVar, Time time) {
        String format;
        if (time == null) {
            bVar.n0();
            return;
        }
        synchronized (this) {
            format = this.f50469a.format((Date) time);
        }
        bVar.S0(format);
    }

    private b() {
        this.f50469a = new SimpleDateFormat("hh:mm:ss a");
    }
}