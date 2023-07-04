package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class w1 extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<w1> f8231f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NFCSEDevicePubKeyState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final s1 f8232a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NFCSEVehiclePubKeyState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final x1 f8233b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NFCSESharedSecretState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final v1 f8234c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NFCSEInsecureCommandState_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final t1 f8235d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final b2 f8236e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<w1> {
        a(com.squareup.wire.b bVar, n00.d<w1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.NFCSEState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public w1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            s1 s1Var = s1.NFCSEC_DEVICEPUBKEY_STATE_NONE;
            x1 x1Var = x1.NFCSEC_VEHICLEPUBKEY_STATE_NONE;
            v1 v1Var = v1.NFCSEC_SHAREDSECRET_STATE_NONE;
            t1 t1Var = t1.NFCSEC_INSECURE_COMMAND_STATE_NONE;
            long d11 = reader.d();
            b2 b2Var = null;
            t1 t1Var2 = t1Var;
            v1 v1Var2 = v1Var;
            x1 x1Var2 = x1Var;
            while (true) {
                s1 s1Var2 = s1Var;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new w1(s1Var2, x1Var2, v1Var2, t1Var2, b2Var, reader.e(d11));
                    } else if (g11 == 1) {
                        try {
                            s1Var = s1.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        }
                    } else if (g11 == 2) {
                        try {
                            x1Var2 = x1.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                        }
                    } else if (g11 == 3) {
                        try {
                            v1Var2 = v1.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                        }
                    } else if (g11 == 4) {
                        try {
                            t1Var2 = t1.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e14.f20831a));
                        }
                    } else if (g11 != 5) {
                        reader.m(g11);
                    } else {
                        b2Var = b2.f7941b.decode(reader);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, w1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != s1.NFCSEC_DEVICEPUBKEY_STATE_NONE) {
                s1.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            if (value.g() != x1.NFCSEC_VEHICLEPUBKEY_STATE_NONE) {
                x1.ADAPTER.encodeWithTag(writer, 2, value.g());
            }
            if (value.e() != v1.NFCSEC_SHAREDSECRET_STATE_NONE) {
                v1.ADAPTER.encodeWithTag(writer, 3, value.e());
            }
            if (value.d() != t1.NFCSEC_INSECURE_COMMAND_STATE_NONE) {
                t1.ADAPTER.encodeWithTag(writer, 4, value.d());
            }
            if (value.f() != null) {
                b2.f7941b.encodeWithTag(writer, 5, value.f());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(w1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != s1.NFCSEC_DEVICEPUBKEY_STATE_NONE) {
                z11 += s1.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            if (value.g() != x1.NFCSEC_VEHICLEPUBKEY_STATE_NONE) {
                z11 += x1.ADAPTER.encodedSizeWithTag(2, value.g());
            }
            if (value.e() != v1.NFCSEC_SHAREDSECRET_STATE_NONE) {
                z11 += v1.ADAPTER.encodedSizeWithTag(3, value.e());
            }
            if (value.d() != t1.NFCSEC_INSECURE_COMMAND_STATE_NONE) {
                z11 += t1.ADAPTER.encodedSizeWithTag(4, value.d());
            }
            return value.f() != null ? z11 + b2.f7941b.encodedSizeWithTag(5, value.f()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public w1 redact(w1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            b2 f11 = value.f();
            return w1.b(value, null, null, null, null, f11 == null ? null : b2.f7941b.redact(f11), okio.i.f42656d, 15, null);
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
        f8231f = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(w1.class), com.squareup.wire.o.PROTO_3);
    }

    public w1() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ w1(s1 s1Var, x1 x1Var, v1 v1Var, t1 t1Var, b2 b2Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s1.NFCSEC_DEVICEPUBKEY_STATE_NONE : s1Var, (i11 & 2) != 0 ? x1.NFCSEC_VEHICLEPUBKEY_STATE_NONE : x1Var, (i11 & 4) != 0 ? v1.NFCSEC_SHAREDSECRET_STATE_NONE : v1Var, (i11 & 8) != 0 ? t1.NFCSEC_INSECURE_COMMAND_STATE_NONE : t1Var, (i11 & 16) != 0 ? null : b2Var, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ w1 b(w1 w1Var, s1 s1Var, x1 x1Var, v1 v1Var, t1 t1Var, b2 b2Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s1Var = w1Var.f8232a;
        }
        if ((i11 & 2) != 0) {
            x1Var = w1Var.f8233b;
        }
        x1 x1Var2 = x1Var;
        if ((i11 & 4) != 0) {
            v1Var = w1Var.f8234c;
        }
        v1 v1Var2 = v1Var;
        if ((i11 & 8) != 0) {
            t1Var = w1Var.f8235d;
        }
        t1 t1Var2 = t1Var;
        if ((i11 & 16) != 0) {
            b2Var = w1Var.f8236e;
        }
        b2 b2Var2 = b2Var;
        if ((i11 & 32) != 0) {
            iVar = w1Var.unknownFields();
        }
        return w1Var.a(s1Var, x1Var2, v1Var2, t1Var2, b2Var2, iVar);
    }

    public final w1 a(s1 devicePubKeyState, x1 vehiclePubKeyState, v1 sharedSecretState, t1 insecureCommandState, b2 b2Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(devicePubKeyState, "devicePubKeyState");
        kotlin.jvm.internal.s.g(vehiclePubKeyState, "vehiclePubKeyState");
        kotlin.jvm.internal.s.g(sharedSecretState, "sharedSecretState");
        kotlin.jvm.internal.s.g(insecureCommandState, "insecureCommandState");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new w1(devicePubKeyState, vehiclePubKeyState, sharedSecretState, insecureCommandState, b2Var, unknownFields);
    }

    public final s1 c() {
        return this.f8232a;
    }

    public final t1 d() {
        return this.f8235d;
    }

    public final v1 e() {
        return this.f8234c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), w1Var.unknownFields()) && this.f8232a == w1Var.f8232a && this.f8233b == w1Var.f8233b && this.f8234c == w1Var.f8234c && this.f8235d == w1Var.f8235d && kotlin.jvm.internal.s.c(this.f8236e, w1Var.f8236e);
        }
        return false;
    }

    public final b2 f() {
        return this.f8236e;
    }

    public final x1 g() {
        return this.f8233b;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((unknownFields().hashCode() * 37) + this.f8232a.hashCode()) * 37) + this.f8233b.hashCode()) * 37) + this.f8234c.hashCode()) * 37) + this.f8235d.hashCode()) * 37;
            b2 b2Var = this.f8236e;
            int hashCode2 = hashCode + (b2Var != null ? b2Var.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m81newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        s1 s1Var = this.f8232a;
        arrayList.add("devicePubKeyState=" + s1Var);
        x1 x1Var = this.f8233b;
        arrayList.add("vehiclePubKeyState=" + x1Var);
        v1 v1Var = this.f8234c;
        arrayList.add("sharedSecretState=" + v1Var);
        t1 t1Var = this.f8235d;
        arrayList.add("insecureCommandState=" + t1Var);
        b2 b2Var = this.f8236e;
        if (b2Var != null) {
            arrayList.add("vehiclePubKey=" + b2Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "NFCSEState{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m81newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(s1 devicePubKeyState, x1 vehiclePubKeyState, v1 sharedSecretState, t1 insecureCommandState, b2 b2Var, okio.i unknownFields) {
        super(f8231f, unknownFields);
        kotlin.jvm.internal.s.g(devicePubKeyState, "devicePubKeyState");
        kotlin.jvm.internal.s.g(vehiclePubKeyState, "vehiclePubKeyState");
        kotlin.jvm.internal.s.g(sharedSecretState, "sharedSecretState");
        kotlin.jvm.internal.s.g(insecureCommandState, "insecureCommandState");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8232a = devicePubKeyState;
        this.f8233b = vehiclePubKeyState;
        this.f8234c = sharedSecretState;
        this.f8235d = insecureCommandState;
        this.f8236e = b2Var;
    }
}