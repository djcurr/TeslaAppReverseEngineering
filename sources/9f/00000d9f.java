package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class l0 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<l0> f8083c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Device_Motion_Confidence#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a  reason: collision with root package name */
    private final m0 f8084a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Device_Motion_State#ADAPTER", label = q.a.REPEATED, tag = 1)

    /* renamed from: b  reason: collision with root package name */
    private final List<n0> f8085b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<l0> {
        a(com.squareup.wire.b bVar, n00.d<l0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.DeviceMotion", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public l0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            m0 m0Var = m0.DEVICE_MOTION_CONFIDENCE_UNKNOWN;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new l0(arrayList, m0Var, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        arrayList.add(n0.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        vz.b0 b0Var = vz.b0.f54756a;
                    }
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    try {
                        m0Var = m0.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, l0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            n0.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.d());
            if (value.c() != m0.DEVICE_MOTION_CONFIDENCE_UNKNOWN) {
                m0.ADAPTER.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(l0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z() + n0.ADAPTER.asRepeated().encodedSizeWithTag(1, value.d());
            return value.c() != m0.DEVICE_MOTION_CONFIDENCE_UNKNOWN ? z11 + m0.ADAPTER.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public l0 redact(l0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return l0.b(value, null, null, okio.i.f42656d, 3, null);
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
        f8083c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(l0.class), com.squareup.wire.o.PROTO_3);
    }

    public l0() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ l0(List list, m0 m0Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? m0.DEVICE_MOTION_CONFIDENCE_UNKNOWN : m0Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l0 b(l0 l0Var, List list, m0 m0Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = l0Var.f8085b;
        }
        if ((i11 & 2) != 0) {
            m0Var = l0Var.f8084a;
        }
        if ((i11 & 4) != 0) {
            iVar = l0Var.unknownFields();
        }
        return l0Var.a(list, m0Var, iVar);
    }

    public final l0 a(List<? extends n0> states, m0 confidence, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(states, "states");
        kotlin.jvm.internal.s.g(confidence, "confidence");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new l0(states, confidence, unknownFields);
    }

    public final m0 c() {
        return this.f8084a;
    }

    public final List<n0> d() {
        return this.f8085b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), l0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8085b, l0Var.f8085b) && this.f8084a == l0Var.f8084a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f8085b.hashCode()) * 37) + this.f8084a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m47newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f8085b.isEmpty()) {
            List<n0> list = this.f8085b;
            arrayList.add("states=" + list);
        }
        m0 m0Var = this.f8084a;
        arrayList.add("confidence=" + m0Var);
        l02 = wz.e0.l0(arrayList, ", ", "DeviceMotion{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m47newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(List<? extends n0> states, m0 confidence, okio.i unknownFields) {
        super(f8083c, unknownFields);
        kotlin.jvm.internal.s.g(states, "states");
        kotlin.jvm.internal.s.g(confidence, "confidence");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8084a = confidence;
        this.f8085b = mr.d.g("states", states);
    }
}