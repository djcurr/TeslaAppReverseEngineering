package lt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class i1 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<i1> f37434c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37435a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NavigationRouteResponse$TrafficDetail#ADAPTER", jsonName = "trafficDetail", label = q.a.REPEATED, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f37436b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i1> {
        a(com.squareup.wire.b bVar, n00.d<i1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationRouteResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i1(str, arrayList, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    arrayList.add(c.f37437c.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, i1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            c.f37437c.asRepeated().encodeWithTag(writer, 2, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.c());
            }
            return z11 + c.f37437c.asRepeated().encodedSizeWithTag(2, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i1 redact(i1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return i1.b(value, null, mr.d.a(value.d(), c.f37437c), okio.i.f42656d, 1, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends com.squareup.wire.f {

        /* renamed from: c  reason: collision with root package name */
        public static final ProtoAdapter<c> f37437c;
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "offsetToDest", label = q.a.OMIT_IDENTITY, tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final float f37438a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NavigationRouteResponse$TrafficStatus#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final d f37439b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.NavigationRouteResponse.TrafficDetail", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public c decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                d dVar = d.TS_NO_DATA;
                long d11 = reader.d();
                float f11 = BitmapDescriptorFactory.HUE_RED;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new c(f11, dVar, reader.e(d11));
                    } else if (g11 == 1) {
                        f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (g11 != 2) {
                        reader.m(g11);
                    } else {
                        try {
                            dVar = d.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, c value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                if (!(value.c() == BitmapDescriptorFactory.HUE_RED)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.c()));
                }
                if (value.d() != d.TS_NO_DATA) {
                    d.ADAPTER.encodeWithTag(writer, 2, value.d());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                if (!(value.c() == BitmapDescriptorFactory.HUE_RED)) {
                    z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.c()));
                }
                return value.d() != d.TS_NO_DATA ? z11 + d.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                return c.b(value, BitmapDescriptorFactory.HUE_RED, null, okio.i.f42656d, 3, null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new b(null);
            f37437c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(c.class), com.squareup.wire.o.PROTO_3);
        }

        public c() {
            this(BitmapDescriptorFactory.HUE_RED, null, null, 7, null);
        }

        public /* synthetic */ c(float f11, d dVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i11 & 2) != 0 ? d.TS_NO_DATA : dVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public static /* synthetic */ c b(c cVar, float f11, d dVar, okio.i iVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = cVar.f37438a;
            }
            if ((i11 & 2) != 0) {
                dVar = cVar.f37439b;
            }
            if ((i11 & 4) != 0) {
                iVar = cVar.unknownFields();
            }
            return cVar.a(f11, dVar, iVar);
        }

        public final c a(float f11, d status, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(status, "status");
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new c(f11, status, unknownFields);
        }

        public final float c() {
            return this.f37438a;
        }

        public final d d() {
            return this.f37439b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields())) {
                    return ((this.f37438a > cVar.f37438a ? 1 : (this.f37438a == cVar.f37438a ? 0 : -1)) == 0) && this.f37439b == cVar.f37439b;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = (((unknownFields().hashCode() * 37) + Float.hashCode(this.f37438a)) * 37) + this.f37439b.hashCode();
                this.hashCode = hashCode;
                return hashCode;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m690newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            float f11 = this.f37438a;
            arrayList.add("offset_to_dest=" + f11);
            d dVar = this.f37439b;
            arrayList.add("status=" + dVar);
            l02 = wz.e0.l0(arrayList, ", ", "TrafficDetail{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m690newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f11, d status, okio.i unknownFields) {
            super(f37437c, unknownFields);
            kotlin.jvm.internal.s.g(status, "status");
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f37438a = f11;
            this.f37439b = status;
        }
    }

    /* loaded from: classes6.dex */
    public enum d implements com.squareup.wire.p {
        TS_NO_DATA(0),
        TS_LIGHT(1),
        TS_MODERATE(2),
        TS_CONGESTION(3),
        TS_SEVERE_CONGESTION(4);
        
        public static final ProtoAdapter<d> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<d> {
            a(n00.d<d> dVar, com.squareup.wire.o oVar, d dVar2) {
                super(dVar, oVar, dVar2);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public d d(int i11) {
                return d.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    return null;
                                }
                                return d.TS_SEVERE_CONGESTION;
                            }
                            return d.TS_CONGESTION;
                        }
                        return d.TS_MODERATE;
                    }
                    return d.TS_LIGHT;
                }
                return d.TS_NO_DATA;
            }
        }

        static {
            d dVar;
            ADAPTER = new a(kotlin.jvm.internal.m0.b(d.class), com.squareup.wire.o.PROTO_3, dVar);
        }

        d(int i11) {
            this.value = i11;
        }

        public static final d fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    static {
        new b(null);
        f37434c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(i1.class), com.squareup.wire.o.PROTO_3);
    }

    public i1() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ i1(String str, List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? wz.w.i() : list, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i1 b(i1 i1Var, String str, List list, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = i1Var.f37435a;
        }
        if ((i11 & 2) != 0) {
            list = i1Var.f37436b;
        }
        if ((i11 & 4) != 0) {
            iVar = i1Var.unknownFields();
        }
        return i1Var.a(str, list, iVar);
    }

    public final i1 a(String route, List<c> traffic_detail, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(route, "route");
        kotlin.jvm.internal.s.g(traffic_detail, "traffic_detail");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new i1(route, traffic_detail, unknownFields);
    }

    public final String c() {
        return this.f37435a;
    }

    public final List<c> d() {
        return this.f37436b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), i1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37435a, i1Var.f37435a) && kotlin.jvm.internal.s.c(this.f37436b, i1Var.f37436b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f37435a.hashCode()) * 37) + this.f37436b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m689newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37435a);
        arrayList.add("route=" + i11);
        if (!this.f37436b.isEmpty()) {
            List<c> list = this.f37436b;
            arrayList.add("traffic_detail=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "NavigationRouteResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m689newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(String route, List<c> traffic_detail, okio.i unknownFields) {
        super(f37434c, unknownFields);
        kotlin.jvm.internal.s.g(route, "route");
        kotlin.jvm.internal.s.g(traffic_detail, "traffic_detail");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37435a = route;
        this.f37436b = mr.d.g("traffic_detail", traffic_detail);
    }
}