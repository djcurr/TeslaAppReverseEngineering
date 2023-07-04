package gu;

import android.content.Context;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.v;
import lt.w2;
import okio.i;
import yu.z;

/* loaded from: classes6.dex */
public final class k {

    /* renamed from: h  reason: collision with root package name */
    public static final a f28105h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f28106a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28107b;

    /* renamed from: c  reason: collision with root package name */
    private final String f28108c;

    /* renamed from: d  reason: collision with root package name */
    private final uu.h f28109d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f28110e;

    /* renamed from: f  reason: collision with root package name */
    private final int f28111f;

    /* renamed from: g  reason: collision with root package name */
    private final vu.c f28112g;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String connectionId, uu.h request, Context context, int i11, yu.e getVehicleData, vu.c cVar) {
            kotlin.jvm.internal.s.g(connectionId, "connectionId");
            kotlin.jvm.internal.s.g(request, "request");
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(getVehicleData, "getVehicleData");
            Context appContext = context.getApplicationContext();
            String h11 = z.p(appContext).h();
            if (h11 != null) {
                zs.c cVar2 = zs.c.f60699a;
                kotlin.jvm.internal.s.f(appContext, "appContext");
                byte[] a11 = cVar2.a(h11, appContext);
                String P = request.P();
                if (request.W()) {
                    String Q = request.Q();
                    k kVar = Q == null ? null : new k(Q, P, connectionId, request, a11, i11, cVar);
                    if (kVar != null) {
                        return kVar;
                    }
                    throw new r(null, null, null, ot.f.RESULT_MISSING_REQUEST_VIN, "Request#vin is null, failed to build proto request", null, 39, null);
                }
                try {
                    w2 a12 = getVehicleData.a(P);
                    if (a12 != null) {
                        if (et.a.p(a12) != null) {
                            if (et.a.f(a12) != null) {
                                String p11 = et.a.p(a12);
                                kotlin.jvm.internal.s.e(p11);
                                return new k(p11, P, connectionId, request, a11, i11, cVar);
                            }
                            throw new r(null, null, null, ot.f.RESULT_MISSING_VEHICLE_DATA_API_VERSION, "VehicleData#apiVersion is null, failed to build proto request.", null, 39, null);
                        }
                        throw new r(null, null, null, ot.f.RESULT_MISSING_VEHICLE_DATA_VIN, "VehicleData#vin is null, failed to build proto request.", null, 39, null);
                    }
                    throw new r(null, null, null, ot.f.RESULT_VEHICLE_DATA_LOOKUP_FAILURE, "GetVehicleData returned null, failed to build proto request.", null, 39, null);
                } catch (Exception e11) {
                    throw new r(null, null, null, ot.f.RESULT_VEHICLE_DATA_LOOKUP_FAILURE, "Error querying for VehicleData, failed to build proto request.", e11, 7, null);
                }
            }
            String m11 = request.m();
            ct.i i12 = ct.i.i();
            kotlin.jvm.internal.s.f(i12, "getDB()");
            boolean a13 = new yu.c(i12).a();
            throw new r(null, null, null, ot.f.RESULT_MISSING_EMAIL, "Null email, " + m11 + ", logged in? " + a13, null, 39, null);
        }
    }

    public k(String vin, String vehicleId, String connectionId, uu.h request, byte[] publicKey, int i11, vu.c cVar) {
        String B;
        kotlin.jvm.internal.s.g(vin, "vin");
        kotlin.jvm.internal.s.g(vehicleId, "vehicleId");
        kotlin.jvm.internal.s.g(connectionId, "connectionId");
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(publicKey, "publicKey");
        this.f28106a = vin;
        this.f28107b = vehicleId;
        this.f28108c = connectionId;
        this.f28109d = request;
        this.f28110e = publicKey;
        this.f28111f = i11;
        this.f28112g = cVar;
        i.a aVar = okio.i.f42657e;
        B = v.B(connectionId, "-", "", false);
        i.a.h(aVar, zu.j.f(B), 0, 0, 3, null);
    }

    public final int a() {
        return this.f28111f;
    }

    public final byte[] b() {
        return this.f28110e;
    }

    public final uu.h c() {
        return this.f28109d;
    }

    public final String d() {
        return this.f28107b;
    }

    public final vu.c e() {
        return this.f28112g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (kotlin.jvm.internal.s.c(k.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.tesla.messagebuilder.ProtoRequestBuildParams");
            k kVar = (k) obj;
            return kotlin.jvm.internal.s.c(this.f28106a, kVar.f28106a) && kotlin.jvm.internal.s.c(this.f28107b, kVar.f28107b) && kotlin.jvm.internal.s.c(this.f28108c, kVar.f28108c) && kotlin.jvm.internal.s.c(this.f28109d, kVar.f28109d) && Arrays.equals(this.f28110e, kVar.f28110e) && kotlin.jvm.internal.s.c(this.f28112g, kVar.f28112g);
        }
        return false;
    }

    public final String f() {
        return this.f28106a;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f28106a.hashCode() * 31) + this.f28107b.hashCode()) * 31) + this.f28108c.hashCode()) * 31) + this.f28109d.hashCode()) * 31) + Arrays.hashCode(this.f28110e)) * 31;
        vu.c cVar = this.f28112g;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        String str = this.f28106a;
        String str2 = this.f28107b;
        String str3 = this.f28108c;
        uu.h hVar = this.f28109d;
        String arrays = Arrays.toString(this.f28110e);
        int i11 = this.f28111f;
        vu.c cVar = this.f28112g;
        return "ProtoRequestBuildParams(vin=" + str + ", vehicleId=" + str2 + ", connectionId=" + str3 + ", request=" + hVar + ", publicKey=" + arrays + ", expiresInSeconds=" + i11 + ", vehicleSessionInfo=" + cVar + ")";
    }
}