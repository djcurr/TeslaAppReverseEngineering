package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class p0 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<p0> f37561c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacClimateKeeperAction$ClimateKeeperAction_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final a f37562a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "manualOverride", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37563b;

    /* loaded from: classes6.dex */
    public enum a implements com.squareup.wire.p {
        ClimateKeeperAction_Off(0),
        ClimateKeeperAction_On(1),
        ClimateKeeperAction_Dog(2),
        ClimateKeeperAction_Camp(3);
        
        public static final ProtoAdapter<a> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* renamed from: lt.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0714a extends com.squareup.wire.a<a> {
            C0714a(n00.d<a> dVar, com.squareup.wire.o oVar, a aVar) {
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
                            if (i11 != 3) {
                                return null;
                            }
                            return a.ClimateKeeperAction_Camp;
                        }
                        return a.ClimateKeeperAction_Dog;
                    }
                    return a.ClimateKeeperAction_On;
                }
                return a.ClimateKeeperAction_Off;
            }
        }

        static {
            a aVar;
            ADAPTER = new C0714a(kotlin.jvm.internal.m0.b(a.class), com.squareup.wire.o.PROTO_3, aVar);
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
    public static final class b extends ProtoAdapter<p0> {
        b(com.squareup.wire.b bVar, n00.d<p0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacClimateKeeperAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public p0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            a aVar = a.ClimateKeeperAction_Off;
            long d11 = reader.d();
            boolean z11 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new p0(aVar, z11, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        aVar = a.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, p0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != a.ClimateKeeperAction_Off) {
                a.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(p0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != a.ClimateKeeperAction_Off) {
                z11 += a.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            return value.d() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public p0 redact(p0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return p0.b(value, null, false, okio.i.f42656d, 3, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new c(null);
        f37561c = new b(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(p0.class), com.squareup.wire.o.PROTO_3);
    }

    public p0() {
        this(null, false, null, 7, null);
    }

    public /* synthetic */ p0(a aVar, boolean z11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? a.ClimateKeeperAction_Off : aVar, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ p0 b(p0 p0Var, a aVar, boolean z11, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = p0Var.f37562a;
        }
        if ((i11 & 2) != 0) {
            z11 = p0Var.f37563b;
        }
        if ((i11 & 4) != 0) {
            iVar = p0Var.unknownFields();
        }
        return p0Var.a(aVar, z11, iVar);
    }

    public final p0 a(a ClimateKeeperAction, boolean z11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(ClimateKeeperAction, "ClimateKeeperAction");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new p0(ClimateKeeperAction, z11, unknownFields);
    }

    public final a c() {
        return this.f37562a;
    }

    public final boolean d() {
        return this.f37563b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), p0Var.unknownFields()) && this.f37562a == p0Var.f37562a && this.f37563b == p0Var.f37563b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f37562a.hashCode()) * 37) + Boolean.hashCode(this.f37563b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m716newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        a aVar = this.f37562a;
        arrayList.add("ClimateKeeperAction=" + aVar);
        boolean z11 = this.f37563b;
        arrayList.add("manual_override=" + z11);
        l02 = wz.e0.l0(arrayList, ", ", "HvacClimateKeeperAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m716newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(a ClimateKeeperAction, boolean z11, okio.i unknownFields) {
        super(f37561c, unknownFields);
        kotlin.jvm.internal.s.g(ClimateKeeperAction, "ClimateKeeperAction");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37562a = ClimateKeeperAction;
        this.f37563b = z11;
    }
}