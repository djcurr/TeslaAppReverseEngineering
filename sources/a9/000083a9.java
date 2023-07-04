package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class e extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<e> f37371b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.AutoSeatClimateAction$CarSeat#ADAPTER", label = q.a.REPEATED, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f37372a;

    /* loaded from: classes6.dex */
    public enum a implements com.squareup.wire.p {
        AutoSeatPosition_Unknown(0),
        AutoSeatPosition_FrontLeft(1),
        AutoSeatPosition_FrontRight(2);
        
        public static final ProtoAdapter<a> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* renamed from: lt.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0712a extends com.squareup.wire.a<a> {
            C0712a(n00.d<a> dVar, com.squareup.wire.o oVar, a aVar) {
                super(dVar, oVar, aVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public a d(int i11) {
                return a.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return a.AutoSeatPosition_FrontRight;
                    }
                    return a.AutoSeatPosition_FrontLeft;
                }
                return a.AutoSeatPosition_Unknown;
            }
        }

        static {
            a aVar;
            ADAPTER = new C0712a(kotlin.jvm.internal.m0.b(a.class), com.squareup.wire.o.PROTO_3, aVar);
        }

        a(int i11) {
            this.value = i11;
        }

        public static final a fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends com.squareup.wire.f {

        /* renamed from: c  reason: collision with root package name */
        public static final ProtoAdapter<b> f37373c;
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final boolean f37374a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.AutoSeatClimateAction$AutoSeatPosition_E#ADAPTER", jsonName = "seatPosition", label = q.a.OMIT_IDENTITY, tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final a f37375b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<b> {
            a(com.squareup.wire.b bVar, n00.d<b> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.AutoSeatClimateAction.CarSeat", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public b decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                a aVar = a.AutoSeatPosition_Unknown;
                long d11 = reader.d();
                boolean z11 = false;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new b(z11, aVar, reader.e(d11));
                    } else if (g11 == 1) {
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (g11 != 2) {
                        reader.m(g11);
                    } else {
                        try {
                            aVar = a.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, b value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                if (value.c()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.c()));
                }
                if (value.d() != a.AutoSeatPosition_Unknown) {
                    a.ADAPTER.encodeWithTag(writer, 2, value.d());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(b value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                if (value.c()) {
                    z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.c()));
                }
                return value.d() != a.AutoSeatPosition_Unknown ? z11 + a.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public b redact(b value) {
                kotlin.jvm.internal.s.g(value, "value");
                return b.b(value, false, null, okio.i.f42656d, 3, null);
            }
        }

        /* renamed from: lt.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0713b {
            private C0713b() {
            }

            public /* synthetic */ C0713b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0713b(null);
            f37373c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b.class), com.squareup.wire.o.PROTO_3);
        }

        public b() {
            this(false, null, null, 7, null);
        }

        public /* synthetic */ b(boolean z11, a aVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? a.AutoSeatPosition_Unknown : aVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public static /* synthetic */ b b(b bVar, boolean z11, a aVar, okio.i iVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = bVar.f37374a;
            }
            if ((i11 & 2) != 0) {
                aVar = bVar.f37375b;
            }
            if ((i11 & 4) != 0) {
                iVar = bVar.unknownFields();
            }
            return bVar.a(z11, aVar, iVar);
        }

        public final b a(boolean z11, a seat_position, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(seat_position, "seat_position");
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new b(z11, seat_position, unknownFields);
        }

        public final boolean c() {
            return this.f37374a;
        }

        public final a d() {
            return this.f37375b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), bVar.unknownFields()) && this.f37374a == bVar.f37374a && this.f37375b == bVar.f37375b;
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = (((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37374a)) * 37) + this.f37375b.hashCode();
                this.hashCode = hashCode;
                return hashCode;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m671newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            boolean z11 = this.f37374a;
            arrayList.add("on=" + z11);
            a aVar = this.f37375b;
            arrayList.add("seat_position=" + aVar);
            l02 = wz.e0.l0(arrayList, ", ", "CarSeat{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m671newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z11, a seat_position, okio.i unknownFields) {
            super(f37373c, unknownFields);
            kotlin.jvm.internal.s.g(seat_position, "seat_position");
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f37374a = z11;
            this.f37375b = seat_position;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends ProtoAdapter<e> {
        c(com.squareup.wire.b bVar, n00.d<e> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.AutoSeatClimateAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e(arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    arrayList.add(b.f37373c.decode(reader));
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, e value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            b.f37373c.asRepeated().encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + b.f37373c.asRepeated().encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e redact(e value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.a(mr.d.a(value.b(), b.f37373c), okio.i.f42656d);
        }
    }

    /* loaded from: classes6.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new d(null);
        f37371b = new c(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(e.class), com.squareup.wire.o.PROTO_3);
    }

    public e() {
        this(null, null, 3, null);
    }

    public /* synthetic */ e(List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final e a(List<b> carseat, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(carseat, "carseat");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new e(carseat, unknownFields);
    }

    public final List<b> b() {
        return this.f37372a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), eVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37372a, eVar.f37372a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37372a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m670newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f37372a.isEmpty()) {
            List<b> list = this.f37372a;
            arrayList.add("carseat=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "AutoSeatClimateAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m670newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<b> carseat, okio.i unknownFields) {
        super(f37371b, unknownFields);
        kotlin.jvm.internal.s.g(carseat, "carseat");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37372a = mr.d.g("carseat", carseat);
    }
}