package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class r0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<r0> f37579b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSeatCoolerActions$HvacSeatCoolerAction#ADAPTER", label = q.a.REPEATED, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f37580a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<r0> {
        a(com.squareup.wire.b bVar, n00.d<r0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacSeatCoolerActions", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public r0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new r0(arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    arrayList.add(c.f37581c.decode(reader));
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, r0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            c.f37581c.asRepeated().encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(r0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + c.f37581c.asRepeated().encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public r0 redact(r0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.a(mr.d.a(value.b(), c.f37581c), okio.i.f42656d);
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
        public static final ProtoAdapter<c> f37581c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSeatCoolerActions$HvacSeatCoolerLevel_E#ADAPTER", jsonName = "seatCoolerLevel", label = q.a.OMIT_IDENTITY, tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final d f37582a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSeatCoolerActions$HvacSeatCoolerPosition_E#ADAPTER", jsonName = "seatPosition", label = q.a.OMIT_IDENTITY, tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final e f37583b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.HvacSeatCoolerActions.HvacSeatCoolerAction", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public c decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                d dVar = d.HvacSeatCoolerLevel_Unknown;
                e eVar = e.HvacSeatCoolerPosition_Unknown;
                long d11 = reader.d();
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new c(dVar, eVar, reader.e(d11));
                    } else if (g11 == 1) {
                        try {
                            dVar = d.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        }
                    } else if (g11 != 2) {
                        reader.m(g11);
                    } else {
                        try {
                            eVar = e.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, c value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                if (value.c() != d.HvacSeatCoolerLevel_Unknown) {
                    d.ADAPTER.encodeWithTag(writer, 1, value.c());
                }
                if (value.d() != e.HvacSeatCoolerPosition_Unknown) {
                    e.ADAPTER.encodeWithTag(writer, 2, value.d());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                if (value.c() != d.HvacSeatCoolerLevel_Unknown) {
                    z11 += d.ADAPTER.encodedSizeWithTag(1, value.c());
                }
                return value.d() != e.HvacSeatCoolerPosition_Unknown ? z11 + e.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                return c.b(value, null, null, okio.i.f42656d, 3, null);
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
            f37581c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(c.class), com.squareup.wire.o.PROTO_3);
        }

        public c() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ c(d dVar, e eVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? d.HvacSeatCoolerLevel_Unknown : dVar, (i11 & 2) != 0 ? e.HvacSeatCoolerPosition_Unknown : eVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public static /* synthetic */ c b(c cVar, d dVar, e eVar, okio.i iVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dVar = cVar.f37582a;
            }
            if ((i11 & 2) != 0) {
                eVar = cVar.f37583b;
            }
            if ((i11 & 4) != 0) {
                iVar = cVar.unknownFields();
            }
            return cVar.a(dVar, eVar, iVar);
        }

        public final c a(d seat_cooler_level, e seat_position, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(seat_cooler_level, "seat_cooler_level");
            kotlin.jvm.internal.s.g(seat_position, "seat_position");
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new c(seat_cooler_level, seat_position, unknownFields);
        }

        public final d c() {
            return this.f37582a;
        }

        public final e d() {
            return this.f37583b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && this.f37582a == cVar.f37582a && this.f37583b == cVar.f37583b;
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = (((unknownFields().hashCode() * 37) + this.f37582a.hashCode()) * 37) + this.f37583b.hashCode();
                this.hashCode = hashCode;
                return hashCode;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m725newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            d dVar = this.f37582a;
            arrayList.add("seat_cooler_level=" + dVar);
            e eVar = this.f37583b;
            arrayList.add("seat_position=" + eVar);
            l02 = wz.e0.l0(arrayList, ", ", "HvacSeatCoolerAction{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m725newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d seat_cooler_level, e seat_position, okio.i unknownFields) {
            super(f37581c, unknownFields);
            kotlin.jvm.internal.s.g(seat_cooler_level, "seat_cooler_level");
            kotlin.jvm.internal.s.g(seat_position, "seat_position");
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f37582a = seat_cooler_level;
            this.f37583b = seat_position;
        }
    }

    /* loaded from: classes6.dex */
    public enum d implements com.squareup.wire.p {
        HvacSeatCoolerLevel_Unknown(0),
        HvacSeatCoolerLevel_Off(1),
        HvacSeatCoolerLevel_Low(2),
        HvacSeatCoolerLevel_Med(3),
        HvacSeatCoolerLevel_High(4);
        
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
                                return d.HvacSeatCoolerLevel_High;
                            }
                            return d.HvacSeatCoolerLevel_Med;
                        }
                        return d.HvacSeatCoolerLevel_Low;
                    }
                    return d.HvacSeatCoolerLevel_Off;
                }
                return d.HvacSeatCoolerLevel_Unknown;
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

    /* loaded from: classes6.dex */
    public enum e implements com.squareup.wire.p {
        HvacSeatCoolerPosition_Unknown(0),
        HvacSeatCoolerPosition_FrontLeft(1),
        HvacSeatCoolerPosition_FrontRight(2);
        
        public static final ProtoAdapter<e> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<e> {
            a(n00.d<e> dVar, com.squareup.wire.o oVar, e eVar) {
                super(dVar, oVar, eVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public e d(int i11) {
                return e.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return e.HvacSeatCoolerPosition_FrontRight;
                    }
                    return e.HvacSeatCoolerPosition_FrontLeft;
                }
                return e.HvacSeatCoolerPosition_Unknown;
            }
        }

        static {
            e eVar;
            ADAPTER = new a(kotlin.jvm.internal.m0.b(e.class), com.squareup.wire.o.PROTO_3, eVar);
        }

        e(int i11) {
            this.value = i11;
        }

        public static final e fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    static {
        new b(null);
        f37579b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(r0.class), com.squareup.wire.o.PROTO_3);
    }

    public r0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ r0(List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final r0 a(List<c> hvacSeatCoolerAction, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(hvacSeatCoolerAction, "hvacSeatCoolerAction");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new r0(hvacSeatCoolerAction, unknownFields);
    }

    public final List<c> b() {
        return this.f37580a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), r0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37580a, r0Var.f37580a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37580a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m724newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f37580a.isEmpty()) {
            List<c> list = this.f37580a;
            arrayList.add("hvacSeatCoolerAction=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "HvacSeatCoolerActions{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m724newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(List<c> hvacSeatCoolerAction, okio.i unknownFields) {
        super(f37579b, unknownFields);
        kotlin.jvm.internal.s.g(hvacSeatCoolerAction, "hvacSeatCoolerAction");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37580a = mr.d.g("hvacSeatCoolerAction", hvacSeatCoolerAction);
    }
}