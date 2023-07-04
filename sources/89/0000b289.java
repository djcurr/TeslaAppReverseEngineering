package sn;

import com.google.gson.e;
import com.google.gson.u;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
class c extends u<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    static final v f50470b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final u<Date> f50471a;

    /* loaded from: classes2.dex */
    class a implements v {
        a() {
        }

        @Override // com.google.gson.v
        public <T> u<T> a(e eVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new c(eVar.l(Date.class), null);
            }
            return null;
        }
    }

    /* synthetic */ c(u uVar, a aVar) {
        this(uVar);
    }

    @Override // com.google.gson.u
    /* renamed from: e */
    public Timestamp b(tn.a aVar) {
        Date b11 = this.f50471a.b(aVar);
        if (b11 != null) {
            return new Timestamp(b11.getTime());
        }
        return null;
    }

    @Override // com.google.gson.u
    /* renamed from: f */
    public void d(com.google.gson.stream.b bVar, Timestamp timestamp) {
        this.f50471a.d(bVar, timestamp);
    }

    private c(u<Date> uVar) {
        this.f50471a = uVar;
    }
}