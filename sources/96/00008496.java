package lt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class v0 extends com.squareup.wire.f {

    /* renamed from: h  reason: collision with root package name */
    public static final ProtoAdapter<v0> f37653h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "deltaCelsius", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final float f37654a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "deltaPercent", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f37655b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "absoluteCelsius", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final float f37656c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacTemperatureAdjustmentAction$Temperature#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: d  reason: collision with root package name */
    private final d f37657d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "driverTempCelsius", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: e  reason: collision with root package name */
    private final float f37658e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "passengerTempCelsius", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: f  reason: collision with root package name */
    private final float f37659f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacTemperatureAdjustmentAction$HvacTemperatureZone#ADAPTER", jsonName = "hvacTemperatureZone", label = q.a.REPEATED, tag = 4)

    /* renamed from: g  reason: collision with root package name */
    private final List<c> f37660g;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<v0> {
        a(com.squareup.wire.b bVar, n00.d<v0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacTemperatureAdjustmentAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public v0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            float f11 = BitmapDescriptorFactory.HUE_RED;
            int i11 = 0;
            float f12 = 0.0f;
            float f13 = 0.0f;
            d dVar = null;
            float f14 = 0.0f;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new v0(f11, i11, f14, dVar, arrayList, f12, f13, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 2:
                        i11 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 3:
                        f14 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 4:
                        arrayList.add(c.f37661e.decode(reader));
                        break;
                    case 5:
                        dVar = d.f37666d.decode(reader);
                        break;
                    case 6:
                        f12 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 7:
                        f13 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, v0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!(value.d() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.d()));
            }
            if (value.e() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 2, Integer.valueOf(value.e()));
            }
            if (!(value.c() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.c()));
            }
            if (value.h() != null) {
                d.f37666d.encodeWithTag(writer, 5, value.h());
            }
            c.f37661e.asRepeated().encodeWithTag(writer, 4, value.g());
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.f()));
            }
            if (!(value.i() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 7, Float.valueOf(value.i()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(v0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!(value.d() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.d()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(2, Integer.valueOf(value.e()));
            }
            if (!(value.c() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.c()));
            }
            if (value.h() != null) {
                z11 += d.f37666d.encodedSizeWithTag(5, value.h());
            }
            int encodedSizeWithTag = z11 + c.f37661e.asRepeated().encodedSizeWithTag(4, value.g());
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                encodedSizeWithTag += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.f()));
            }
            return !(value.i() == BitmapDescriptorFactory.HUE_RED) ? encodedSizeWithTag + ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.i())) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public v0 redact(v0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            d h11 = value.h();
            return v0.b(value, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, h11 == null ? null : d.f37666d.redact(h11), mr.d.a(value.g(), c.f37661e), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, okio.i.f42656d, 103, null);
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

        /* renamed from: e  reason: collision with root package name */
        public static final ProtoAdapter<c> f37661e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPZONEUNKNOWN", tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final kt.u f37662a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPZONEFRONTLEFT", tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final kt.u f37663b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPZONEFRONTRIGHT", tag = 3)

        /* renamed from: c  reason: collision with root package name */
        private final kt.u f37664c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPZONEREAR", tag = 4)

        /* renamed from: d  reason: collision with root package name */
        private final kt.u f37665d;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.HvacTemperatureAdjustmentAction.HvacTemperatureZone", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public c decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                kt.u uVar4 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new c(uVar, uVar2, uVar3, uVar4, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 == 2) {
                        uVar2 = kt.u.f35845a.decode(reader);
                    } else if (g11 == 3) {
                        uVar3 = kt.u.f35845a.decode(reader);
                    } else if (g11 != 4) {
                        reader.m(g11);
                    } else {
                        uVar4 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, c value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.e());
                protoAdapter.encodeWithTag(writer, 2, value.b());
                protoAdapter.encodeWithTag(writer, 3, value.c());
                protoAdapter.encodeWithTag(writer, 4, value.d());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.e()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(3, value.c()) + protoAdapter.encodedSizeWithTag(4, value.d());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u e11 = value.e();
                kt.u redact = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u b11 = value.b();
                kt.u redact2 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                kt.u redact3 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u d11 = value.d();
                return value.a(redact, redact2, redact3, d11 != null ? kt.u.f35845a.redact(d11) : null, okio.i.f42656d);
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
            f37661e = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(c.class), com.squareup.wire.o.PROTO_3);
        }

        public c() {
            this(null, null, null, null, null, 31, null);
        }

        public /* synthetic */ c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) == 0 ? uVar4 : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
        }

        public final c a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new c(uVar, uVar2, uVar3, uVar4, unknownFields);
        }

        public final kt.u b() {
            return this.f37663b;
        }

        public final kt.u c() {
            return this.f37664c;
        }

        public final kt.u d() {
            return this.f37665d;
        }

        public final kt.u e() {
            return this.f37662a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37662a, cVar.f37662a) && kotlin.jvm.internal.s.c(this.f37663b, cVar.f37663b) && kotlin.jvm.internal.s.c(this.f37664c, cVar.f37664c) && kotlin.jvm.internal.s.c(this.f37665d, cVar.f37665d);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f37662a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f37663b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f37664c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f37665d;
                int hashCode5 = hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m742newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f37662a;
            if (uVar != null) {
                arrayList.add("TEMP_ZONE_UNKNOWN=" + uVar);
            }
            kt.u uVar2 = this.f37663b;
            if (uVar2 != null) {
                arrayList.add("TEMP_ZONE_FRONT_LEFT=" + uVar2);
            }
            kt.u uVar3 = this.f37664c;
            if (uVar3 != null) {
                arrayList.add("TEMP_ZONE_FRONT_RIGHT=" + uVar3);
            }
            kt.u uVar4 = this.f37665d;
            if (uVar4 != null) {
                arrayList.add("TEMP_ZONE_REAR=" + uVar4);
            }
            l02 = wz.e0.l0(arrayList, ", ", "HvacTemperatureZone{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m742newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i unknownFields) {
            super(f37661e, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f37662a = uVar;
            this.f37663b = uVar2;
            this.f37664c = uVar3;
            this.f37665d = uVar4;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, new Object[0]) <= 1)) {
                throw new IllegalArgumentException("At most one of TEMP_ZONE_UNKNOWN, TEMP_ZONE_FRONT_LEFT, TEMP_ZONE_FRONT_RIGHT, TEMP_ZONE_REAR may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends com.squareup.wire.f {

        /* renamed from: d  reason: collision with root package name */
        public static final ProtoAdapter<d> f37666d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPUNKNOWN", tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final kt.u f37667a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPMIN", tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final kt.u f37668b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPMAX", tag = 3)

        /* renamed from: c  reason: collision with root package name */
        private final kt.u f37669c;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, n00.d<d> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.HvacTemperatureAdjustmentAction.Temperature", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public d decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new d(uVar, uVar2, uVar3, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 == 2) {
                        uVar2 = kt.u.f35845a.decode(reader);
                    } else if (g11 != 3) {
                        reader.m(g11);
                    } else {
                        uVar3 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, d value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.d());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                protoAdapter.encodeWithTag(writer, 3, value.b());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(d value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.d()) + protoAdapter.encodedSizeWithTag(2, value.c()) + protoAdapter.encodedSizeWithTag(3, value.b());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public d redact(d value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u d11 = value.d();
                kt.u redact = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u c11 = value.c();
                kt.u redact2 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u b11 = value.b();
                return value.a(redact, redact2, b11 != null ? kt.u.f35845a.redact(b11) : null, okio.i.f42656d);
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
            f37666d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(d.class), com.squareup.wire.o.PROTO_3);
        }

        public d() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ d(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
        }

        public final d a(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new d(uVar, uVar2, uVar3, unknownFields);
        }

        public final kt.u b() {
            return this.f37669c;
        }

        public final kt.u c() {
            return this.f37668b;
        }

        public final kt.u d() {
            return this.f37667a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), dVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37667a, dVar.f37667a) && kotlin.jvm.internal.s.c(this.f37668b, dVar.f37668b) && kotlin.jvm.internal.s.c(this.f37669c, dVar.f37669c);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f37667a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f37668b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f37669c;
                int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m743newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f37667a;
            if (uVar != null) {
                arrayList.add("TEMP_UNKNOWN=" + uVar);
            }
            kt.u uVar2 = this.f37668b;
            if (uVar2 != null) {
                arrayList.add("TEMP_MIN=" + uVar2);
            }
            kt.u uVar3 = this.f37669c;
            if (uVar3 != null) {
                arrayList.add("TEMP_MAX=" + uVar3);
            }
            l02 = wz.e0.l0(arrayList, ", ", "Temperature{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m743newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
            super(f37666d, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f37667a = uVar;
            this.f37668b = uVar2;
            this.f37669c = uVar3;
            if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
                throw new IllegalArgumentException("At most one of TEMP_UNKNOWN, TEMP_MIN, TEMP_MAX may be non-null".toString());
            }
        }
    }

    static {
        new b(null);
        f37653h = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(v0.class), com.squareup.wire.o.PROTO_3);
    }

    public v0() {
        this(BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 255, null);
    }

    public /* synthetic */ v0(float f11, int i11, float f12, d dVar, List list, float f13, float f14, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? 0.0f : f12, (i12 & 8) != 0 ? null : dVar, (i12 & 16) != 0 ? wz.w.i() : list, (i12 & 32) != 0 ? 0.0f : f13, (i12 & 64) == 0 ? f14 : BitmapDescriptorFactory.HUE_RED, (i12 & 128) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v0 b(v0 v0Var, float f11, int i11, float f12, d dVar, List list, float f13, float f14, okio.i iVar, int i12, Object obj) {
        return v0Var.a((i12 & 1) != 0 ? v0Var.f37654a : f11, (i12 & 2) != 0 ? v0Var.f37655b : i11, (i12 & 4) != 0 ? v0Var.f37656c : f12, (i12 & 8) != 0 ? v0Var.f37657d : dVar, (i12 & 16) != 0 ? v0Var.f37660g : list, (i12 & 32) != 0 ? v0Var.f37658e : f13, (i12 & 64) != 0 ? v0Var.f37659f : f14, (i12 & 128) != 0 ? v0Var.unknownFields() : iVar);
    }

    public final v0 a(float f11, int i11, float f12, d dVar, List<c> hvac_temperature_zone, float f13, float f14, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(hvac_temperature_zone, "hvac_temperature_zone");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new v0(f11, i11, f12, dVar, hvac_temperature_zone, f13, f14, unknownFields);
    }

    public final float c() {
        return this.f37656c;
    }

    public final float d() {
        return this.f37654a;
    }

    public final int e() {
        return this.f37655b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), v0Var.unknownFields())) {
                if ((this.f37654a == v0Var.f37654a) && this.f37655b == v0Var.f37655b) {
                    if ((this.f37656c == v0Var.f37656c) && kotlin.jvm.internal.s.c(this.f37657d, v0Var.f37657d) && kotlin.jvm.internal.s.c(this.f37660g, v0Var.f37660g)) {
                        if (this.f37658e == v0Var.f37658e) {
                            return (this.f37659f > v0Var.f37659f ? 1 : (this.f37659f == v0Var.f37659f ? 0 : -1)) == 0;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f37658e;
    }

    public final List<c> g() {
        return this.f37660g;
    }

    public final d h() {
        return this.f37657d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((unknownFields().hashCode() * 37) + Float.hashCode(this.f37654a)) * 37) + Integer.hashCode(this.f37655b)) * 37) + Float.hashCode(this.f37656c)) * 37;
            d dVar = this.f37657d;
            int hashCode2 = ((((((hashCode + (dVar != null ? dVar.hashCode() : 0)) * 37) + this.f37660g.hashCode()) * 37) + Float.hashCode(this.f37658e)) * 37) + Float.hashCode(this.f37659f);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    public final float i() {
        return this.f37659f;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m741newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        float f11 = this.f37654a;
        arrayList.add("delta_celsius=" + f11);
        int i11 = this.f37655b;
        arrayList.add("delta_percent=" + i11);
        float f12 = this.f37656c;
        arrayList.add("absolute_celsius=" + f12);
        d dVar = this.f37657d;
        if (dVar != null) {
            arrayList.add("level=" + dVar);
        }
        if (!this.f37660g.isEmpty()) {
            List<c> list = this.f37660g;
            arrayList.add("hvac_temperature_zone=" + list);
        }
        float f13 = this.f37658e;
        arrayList.add("driver_temp_celsius=" + f13);
        float f14 = this.f37659f;
        arrayList.add("passenger_temp_celsius=" + f14);
        l02 = wz.e0.l0(arrayList, ", ", "HvacTemperatureAdjustmentAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m741newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(float f11, int i11, float f12, d dVar, List<c> hvac_temperature_zone, float f13, float f14, okio.i unknownFields) {
        super(f37653h, unknownFields);
        kotlin.jvm.internal.s.g(hvac_temperature_zone, "hvac_temperature_zone");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37654a = f11;
        this.f37655b = i11;
        this.f37656c = f12;
        this.f37657d = dVar;
        this.f37658e = f13;
        this.f37659f = f14;
        this.f37660g = mr.d.g("hvac_temperature_zone", hvac_temperature_zone);
    }
}