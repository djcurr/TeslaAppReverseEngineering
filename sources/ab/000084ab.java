package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class w1 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<w1> f37682c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37683a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargingTime", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f37684b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<w1> {
        a(com.squareup.wire.b bVar, n00.d<w1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ScheduledChargingAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public w1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new w1(z11, i11, reader.e(d11));
                }
                if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, w1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.d()));
            }
            if (value.c() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(w1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.d()));
            }
            return value.c() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public w1 redact(w1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return w1.b(value, false, 0, okio.i.f42656d, 3, null);
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
        f37682c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(w1.class), com.squareup.wire.o.PROTO_3);
    }

    public w1() {
        this(false, 0, null, 7, null);
    }

    public /* synthetic */ w1(boolean z11, int i11, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ w1 b(w1 w1Var, boolean z11, int i11, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = w1Var.f37683a;
        }
        if ((i12 & 2) != 0) {
            i11 = w1Var.f37684b;
        }
        if ((i12 & 4) != 0) {
            iVar = w1Var.unknownFields();
        }
        return w1Var.a(z11, i11, iVar);
    }

    public final w1 a(boolean z11, int i11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new w1(z11, i11, unknownFields);
    }

    public final int c() {
        return this.f37684b;
    }

    public final boolean d() {
        return this.f37683a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), w1Var.unknownFields()) && this.f37683a == w1Var.f37683a && this.f37684b == w1Var.f37684b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37683a)) * 37) + Integer.hashCode(this.f37684b);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m748newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f37683a;
        arrayList.add("enabled=" + z11);
        int i11 = this.f37684b;
        arrayList.add("charging_time=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "ScheduledChargingAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m748newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(boolean z11, int i11, okio.i unknownFields) {
        super(f37682c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37683a = z11;
        this.f37684b = i11;
    }
}