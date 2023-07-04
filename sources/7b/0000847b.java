package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class t0 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<t0> f37615d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37616a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "manualOverride", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37617b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSetPreconditioningMaxAction$ManualOverrideMode_E#ADAPTER", jsonName = "manualOverrideMode", label = q.a.REPEATED, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final List<c> f37618c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<t0> {
        a(com.squareup.wire.b bVar, n00.d<t0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacSetPreconditioningMaxAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public t0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new t0(z11, z12, arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 == 2) {
                    z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        arrayList.add(c.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        vz.b0 b0Var = vz.b0.f54756a;
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, t0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.e()));
            }
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.c()));
            }
            c.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(t0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.e()));
            }
            if (value.c()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.c()));
            }
            return z11 + c.ADAPTER.asRepeated().encodedSizeWithTag(3, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public t0 redact(t0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return t0.b(value, false, false, null, okio.i.f42656d, 7, null);
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
    public enum c implements com.squareup.wire.p {
        DogMode(0),
        Soc(1),
        Doors(2);
        
        public static final ProtoAdapter<c> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<c> {
            a(n00.d<c> dVar, com.squareup.wire.o oVar, c cVar) {
                super(dVar, oVar, cVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public c d(int i11) {
                return c.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return c.Doors;
                    }
                    return c.Soc;
                }
                return c.DogMode;
            }
        }

        static {
            c cVar;
            ADAPTER = new a(kotlin.jvm.internal.m0.b(c.class), com.squareup.wire.o.PROTO_3, cVar);
        }

        c(int i11) {
            this.value = i11;
        }

        public static final c fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    static {
        new b(null);
        f37615d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(t0.class), com.squareup.wire.o.PROTO_3);
    }

    public t0() {
        this(false, false, null, null, 15, null);
    }

    public /* synthetic */ t0(boolean z11, boolean z12, List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? wz.w.i() : list, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t0 b(t0 t0Var, boolean z11, boolean z12, List list, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = t0Var.f37616a;
        }
        if ((i11 & 2) != 0) {
            z12 = t0Var.f37617b;
        }
        if ((i11 & 4) != 0) {
            list = t0Var.f37618c;
        }
        if ((i11 & 8) != 0) {
            iVar = t0Var.unknownFields();
        }
        return t0Var.a(z11, z12, list, iVar);
    }

    public final t0 a(boolean z11, boolean z12, List<? extends c> manual_override_mode, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(manual_override_mode, "manual_override_mode");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new t0(z11, z12, manual_override_mode, unknownFields);
    }

    public final boolean c() {
        return this.f37617b;
    }

    public final List<c> d() {
        return this.f37618c;
    }

    public final boolean e() {
        return this.f37616a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), t0Var.unknownFields()) && this.f37616a == t0Var.f37616a && this.f37617b == t0Var.f37617b && kotlin.jvm.internal.s.c(this.f37618c, t0Var.f37618c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37616a)) * 37) + Boolean.hashCode(this.f37617b)) * 37) + this.f37618c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m733newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f37616a;
        arrayList.add("on=" + z11);
        boolean z12 = this.f37617b;
        arrayList.add("manual_override=" + z12);
        if (!this.f37618c.isEmpty()) {
            List<c> list = this.f37618c;
            arrayList.add("manual_override_mode=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "HvacSetPreconditioningMaxAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m733newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(boolean z11, boolean z12, List<? extends c> manual_override_mode, okio.i unknownFields) {
        super(f37615d, unknownFields);
        kotlin.jvm.internal.s.g(manual_override_mode, "manual_override_mode");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37616a = z11;
        this.f37617b = z12;
        this.f37618c = mr.d.g("manual_override_mode", manual_override_mode);
    }
}