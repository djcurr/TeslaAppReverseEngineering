package ys;

import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.OwnerApiEndpoint;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.v;
import wz.r0;
import yu.f;
import yu.y;

/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a */
    private final com.tesla.data.oapi.h f59745a;

    /* renamed from: b */
    private final y f59746b;

    /* renamed from: c */
    private final com.tesla.logging.g f59747c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public m(com.tesla.data.oapi.h endpoints, y sendOwnerRequest) {
        s.g(endpoints, "endpoints");
        s.g(sendOwnerRequest, "sendOwnerRequest");
        this.f59745a = endpoints;
        this.f59746b = sendOwnerRequest;
        this.f59747c = com.tesla.logging.g.f21878b.a("WakeVehicle");
    }

    public static /* synthetic */ void a(h00.a aVar, int i11, m mVar, String str, h00.l lVar, com.tesla.data.oapi.k kVar) {
        f(aVar, i11, mVar, str, lVar, kVar);
    }

    public static /* synthetic */ void b(m mVar, int i11, String str, h00.a aVar, h00.l lVar, Throwable th2) {
        g(mVar, i11, str, aVar, lVar, th2);
    }

    private final void d(final String str, final h00.a<b0> aVar, final h00.l<? super Integer, b0> lVar, final int i11) {
        Map f11;
        OwnerApiEndpoint c11 = this.f59745a.c("WAKE_UP");
        if (c11 == null) {
            return;
        }
        HttpMethodType component1 = c11.component1();
        String component2 = c11.component2();
        boolean component3 = c11.component3();
        com.tesla.logging.g gVar = this.f59747c;
        gVar.i("waking " + str);
        y yVar = this.f59746b;
        f11 = r0.f(v.a("vehicle_id", str));
        f.a.d(yVar, component1, component2, f11, null, null, null, 10, component3, false, 304, null).u(new ky.f() { // from class: ys.k
            @Override // ky.f
            public final void accept(Object obj) {
                m.a(h00.a.this, i11, this, str, lVar, (com.tesla.data.oapi.k) obj);
            }
        }, new ky.f() { // from class: ys.l
            {
                m.this = this;
            }

            @Override // ky.f
            public final void accept(Object obj) {
                m.b(m.this, i11, str, aVar, lVar, (Throwable) obj);
            }
        });
    }

    static /* synthetic */ void e(m mVar, String str, h00.a aVar, h00.l lVar, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        mVar.d(str, aVar, lVar, i11);
    }

    public static final void f(h00.a onSuccess, int i11, m this$0, String vehicleId, h00.l onFailure, com.tesla.data.oapi.k kVar) {
        s.g(onSuccess, "$onSuccess");
        s.g(this$0, "this$0");
        s.g(vehicleId, "$vehicleId");
        s.g(onFailure, "$onFailure");
        if (kVar.i()) {
            onSuccess.invoke();
        } else {
            h(i11, this$0, vehicleId, onSuccess, onFailure, kVar.g().getCode());
        }
    }

    public static final void g(m this$0, int i11, String vehicleId, h00.a onSuccess, h00.l onFailure, Throwable th2) {
        s.g(this$0, "this$0");
        s.g(vehicleId, "$vehicleId");
        s.g(onSuccess, "$onSuccess");
        s.g(onFailure, "$onFailure");
        this$0.f59747c.d("wake vehicle failure", th2);
        i(i11, this$0, vehicleId, onSuccess, onFailure, 0, 32, null);
    }

    private static final void h(int i11, m mVar, String str, h00.a<b0> aVar, h00.l<? super Integer, b0> lVar, int i12) {
        if (i11 < 3) {
            com.tesla.logging.g gVar = mVar.f59747c;
            gVar.i("retrying wake for " + str + " status code was " + i12);
            mVar.d(str, aVar, lVar, i11 + 1);
            return;
        }
        lVar.invoke(Integer.valueOf(i12));
    }

    static /* synthetic */ void i(int i11, m mVar, String str, h00.a aVar, h00.l lVar, int i12, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            i12 = -1;
        }
        h(i11, mVar, str, aVar, lVar, i12);
    }

    public final void c(String vehicleId, h00.a<b0> onSuccess, h00.l<? super Integer, b0> onFailure) {
        s.g(vehicleId, "vehicleId");
        s.g(onSuccess, "onSuccess");
        s.g(onFailure, "onFailure");
        e(this, vehicleId, onSuccess, onFailure, 0, 8, null);
    }
}