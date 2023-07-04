package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class x0 extends com.squareup.wire.f {
    public static final ProtoAdapter<x0> E;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 23)
    private final boolean A;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 24)
    private final boolean B;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 25)
    private final boolean C;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8248a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationLevel_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final j f8249b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8250c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final int f8251d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final int f8252e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final int f8253f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final int f8254g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final int f8255h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final int f8256i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final int f8257j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: k  reason: collision with root package name */
    private final int f8258k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: l  reason: collision with root package name */
    private final int f8259l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 13)

    /* renamed from: m  reason: collision with root package name */
    private final boolean f8260m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 14)

    /* renamed from: n  reason: collision with root package name */
    private final boolean f8261n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 15)

    /* renamed from: o  reason: collision with root package name */
    private final boolean f8262o;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 16)

    /* renamed from: p  reason: collision with root package name */
    private final boolean f8263p;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 17)

    /* renamed from: q  reason: collision with root package name */
    private final boolean f8264q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 18)

    /* renamed from: t  reason: collision with root package name */
    private final boolean f8265t;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 19)

    /* renamed from: w  reason: collision with root package name */
    private final boolean f8266w;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 20)

    /* renamed from: x  reason: collision with root package name */
    private final boolean f8267x;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 21)

    /* renamed from: y  reason: collision with root package name */
    private final boolean f8268y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 22)

    /* renamed from: z  reason: collision with root package name */
    private final boolean f8269z;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<x0> {
        a(com.squareup.wire.b bVar, n00.d<x0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.HandlePulledWithoutAuthDeviceSpecificPayload", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public x0 decode(com.squareup.wire.k reader) {
            long j11;
            kotlin.jvm.internal.s.g(reader, "reader");
            j jVar = j.AUTHENTICATION_LEVEL_NONE;
            long d11 = reader.d();
            int i11 = 0;
            boolean z11 = false;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            j jVar2 = jVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new x0(i11, jVar2, z11, i12, i13, i14, i15, i16, i17, i18, i19, i21, z12, z13, z14, z15, z16, z17, z18, z19, z21, z22, z23, z24, z25, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        j11 = d11;
                        i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        continue;
                        d11 = j11;
                    case 2:
                        try {
                            jVar2 = j.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            j11 = d11;
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 3:
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 4:
                        i12 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 5:
                        i13 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 6:
                        i14 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 7:
                        i15 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 8:
                        i16 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 9:
                        i17 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 10:
                        i18 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 11:
                        i19 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 12:
                        i21 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 13:
                        z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 14:
                        z13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 15:
                        z14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 16:
                        z15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 17:
                        z16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 18:
                        z17 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 19:
                        z18 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 20:
                        z19 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 21:
                        z21 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 22:
                        z22 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 23:
                        z23 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 24:
                        z24 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 25:
                        z25 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    default:
                        j11 = d11;
                        reader.m(g11);
                        continue;
                        d11 = j11;
                }
                j11 = d11;
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, x0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.m() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.m()));
            }
            if (value.c() != j.AUTHENTICATION_LEVEL_NONE) {
                j.ADAPTER.encodeWithTag(writer, 2, value.c());
            }
            if (value.n()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.n()));
            }
            if (value.q() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 4, Integer.valueOf(value.q()));
            }
            if (value.v() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 5, Integer.valueOf(value.v()));
            }
            if (value.s() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 6, Integer.valueOf(value.s()));
            }
            if (value.o() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 7, Integer.valueOf(value.o()));
            }
            if (value.p() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 8, Integer.valueOf(value.p()));
            }
            if (value.w() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 9, Integer.valueOf(value.w()));
            }
            if (value.r() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 10, Integer.valueOf(value.r()));
            }
            if (value.t() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 11, Integer.valueOf(value.t()));
            }
            if (value.u() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 12, Integer.valueOf(value.u()));
            }
            if (value.f()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.f()));
            }
            if (value.k()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 14, Boolean.valueOf(value.k()));
            }
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 15, Boolean.valueOf(value.d()));
            }
            if (value.e()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 16, Boolean.valueOf(value.e()));
            }
            if (value.i()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 17, Boolean.valueOf(value.i()));
            }
            if (value.h()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 18, Boolean.valueOf(value.h()));
            }
            if (value.j()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 19, Boolean.valueOf(value.j()));
            }
            if (value.l()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 20, Boolean.valueOf(value.l()));
            }
            if (value.g()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 21, Boolean.valueOf(value.g()));
            }
            if (value.z()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 22, Boolean.valueOf(value.z()));
            }
            if (value.A()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 23, Boolean.valueOf(value.A()));
            }
            if (value.x()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 24, Boolean.valueOf(value.x()));
            }
            if (value.y()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 25, Boolean.valueOf(value.y()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(x0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.m() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.m()));
            }
            if (value.c() != j.AUTHENTICATION_LEVEL_NONE) {
                z11 += j.ADAPTER.encodedSizeWithTag(2, value.c());
            }
            if (value.n()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.n()));
            }
            if (value.q() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(4, Integer.valueOf(value.q()));
            }
            if (value.v() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(5, Integer.valueOf(value.v()));
            }
            if (value.s() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(6, Integer.valueOf(value.s()));
            }
            if (value.o() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(7, Integer.valueOf(value.o()));
            }
            if (value.p() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(8, Integer.valueOf(value.p()));
            }
            if (value.w() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(9, Integer.valueOf(value.w()));
            }
            if (value.r() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(10, Integer.valueOf(value.r()));
            }
            if (value.t() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(11, Integer.valueOf(value.t()));
            }
            if (value.u() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(12, Integer.valueOf(value.u()));
            }
            if (value.f()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.f()));
            }
            if (value.k()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(14, Boolean.valueOf(value.k()));
            }
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(15, Boolean.valueOf(value.d()));
            }
            if (value.e()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.e()));
            }
            if (value.i()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.i()));
            }
            if (value.h()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.h()));
            }
            if (value.j()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(19, Boolean.valueOf(value.j()));
            }
            if (value.l()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(20, Boolean.valueOf(value.l()));
            }
            if (value.g()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(21, Boolean.valueOf(value.g()));
            }
            if (value.z()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.z()));
            }
            if (value.A()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(23, Boolean.valueOf(value.A()));
            }
            if (value.x()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(24, Boolean.valueOf(value.x()));
            }
            return value.y() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.y())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public x0 redact(x0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return x0.b(value, 0, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, okio.i.f42656d, 33554431, null);
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
        E = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(x0.class), com.squareup.wire.o.PROTO_3);
    }

    public x0() {
        this(0, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 67108863, null);
    }

    public /* synthetic */ x0(int i11, j jVar, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, okio.i iVar, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? 0 : i11, (i22 & 2) != 0 ? j.AUTHENTICATION_LEVEL_NONE : jVar, (i22 & 4) != 0 ? false : z11, (i22 & 8) != 0 ? 0 : i12, (i22 & 16) != 0 ? 0 : i13, (i22 & 32) != 0 ? 0 : i14, (i22 & 64) != 0 ? 0 : i15, (i22 & 128) != 0 ? 0 : i16, (i22 & 256) != 0 ? 0 : i17, (i22 & 512) != 0 ? 0 : i18, (i22 & 1024) != 0 ? 0 : i19, (i22 & 2048) != 0 ? 0 : i21, (i22 & 4096) != 0 ? false : z12, (i22 & PKIFailureInfo.certRevoked) != 0 ? false : z13, (i22 & 16384) != 0 ? false : z14, (i22 & 32768) != 0 ? false : z15, (i22 & 65536) != 0 ? false : z16, (i22 & 131072) != 0 ? false : z17, (i22 & 262144) != 0 ? false : z18, (i22 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z19, (i22 & PKIFailureInfo.badCertTemplate) != 0 ? false : z21, (i22 & PKIFailureInfo.badSenderNonce) != 0 ? false : z22, (i22 & 4194304) != 0 ? false : z23, (i22 & 8388608) != 0 ? false : z24, (i22 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z25, (i22 & 33554432) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ x0 b(x0 x0Var, int i11, j jVar, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, okio.i iVar, int i22, Object obj) {
        return x0Var.a((i22 & 1) != 0 ? x0Var.f8248a : i11, (i22 & 2) != 0 ? x0Var.f8249b : jVar, (i22 & 4) != 0 ? x0Var.f8250c : z11, (i22 & 8) != 0 ? x0Var.f8251d : i12, (i22 & 16) != 0 ? x0Var.f8252e : i13, (i22 & 32) != 0 ? x0Var.f8253f : i14, (i22 & 64) != 0 ? x0Var.f8254g : i15, (i22 & 128) != 0 ? x0Var.f8255h : i16, (i22 & 256) != 0 ? x0Var.f8256i : i17, (i22 & 512) != 0 ? x0Var.f8257j : i18, (i22 & 1024) != 0 ? x0Var.f8258k : i19, (i22 & 2048) != 0 ? x0Var.f8259l : i21, (i22 & 4096) != 0 ? x0Var.f8260m : z12, (i22 & PKIFailureInfo.certRevoked) != 0 ? x0Var.f8261n : z13, (i22 & 16384) != 0 ? x0Var.f8262o : z14, (i22 & 32768) != 0 ? x0Var.f8263p : z15, (i22 & 65536) != 0 ? x0Var.f8264q : z16, (i22 & 131072) != 0 ? x0Var.f8265t : z17, (i22 & 262144) != 0 ? x0Var.f8266w : z18, (i22 & PKIFailureInfo.signerNotTrusted) != 0 ? x0Var.f8267x : z19, (i22 & PKIFailureInfo.badCertTemplate) != 0 ? x0Var.f8268y : z21, (i22 & PKIFailureInfo.badSenderNonce) != 0 ? x0Var.f8269z : z22, (i22 & 4194304) != 0 ? x0Var.A : z23, (i22 & 8388608) != 0 ? x0Var.B : z24, (i22 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? x0Var.C : z25, (i22 & 33554432) != 0 ? x0Var.unknownFields() : iVar);
    }

    public final boolean A() {
        return this.A;
    }

    public final x0 a(int i11, j authenticationLevel, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(authenticationLevel, "authenticationLevel");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new x0(i11, authenticationLevel, z11, i12, i13, i14, i15, i16, i17, i18, i19, i21, z12, z13, z14, z15, z16, z17, z18, z19, z21, z22, z23, z24, z25, unknownFields);
    }

    public final j c() {
        return this.f8249b;
    }

    public final boolean d() {
        return this.f8262o;
    }

    public final boolean e() {
        return this.f8263p;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), x0Var.unknownFields()) && this.f8248a == x0Var.f8248a && this.f8249b == x0Var.f8249b && this.f8250c == x0Var.f8250c && this.f8251d == x0Var.f8251d && this.f8252e == x0Var.f8252e && this.f8253f == x0Var.f8253f && this.f8254g == x0Var.f8254g && this.f8255h == x0Var.f8255h && this.f8256i == x0Var.f8256i && this.f8257j == x0Var.f8257j && this.f8258k == x0Var.f8258k && this.f8259l == x0Var.f8259l && this.f8260m == x0Var.f8260m && this.f8261n == x0Var.f8261n && this.f8262o == x0Var.f8262o && this.f8263p == x0Var.f8263p && this.f8264q == x0Var.f8264q && this.f8265t == x0Var.f8265t && this.f8266w == x0Var.f8266w && this.f8267x == x0Var.f8267x && this.f8268y == x0Var.f8268y && this.f8269z == x0Var.f8269z && this.A == x0Var.A && this.B == x0Var.B && this.C == x0Var.C;
        }
        return false;
    }

    public final boolean f() {
        return this.f8260m;
    }

    public final boolean g() {
        return this.f8268y;
    }

    public final boolean h() {
        return this.f8265t;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8248a)) * 37) + this.f8249b.hashCode()) * 37) + Boolean.hashCode(this.f8250c)) * 37) + Integer.hashCode(this.f8251d)) * 37) + Integer.hashCode(this.f8252e)) * 37) + Integer.hashCode(this.f8253f)) * 37) + Integer.hashCode(this.f8254g)) * 37) + Integer.hashCode(this.f8255h)) * 37) + Integer.hashCode(this.f8256i)) * 37) + Integer.hashCode(this.f8257j)) * 37) + Integer.hashCode(this.f8258k)) * 37) + Integer.hashCode(this.f8259l)) * 37) + Boolean.hashCode(this.f8260m)) * 37) + Boolean.hashCode(this.f8261n)) * 37) + Boolean.hashCode(this.f8262o)) * 37) + Boolean.hashCode(this.f8263p)) * 37) + Boolean.hashCode(this.f8264q)) * 37) + Boolean.hashCode(this.f8265t)) * 37) + Boolean.hashCode(this.f8266w)) * 37) + Boolean.hashCode(this.f8267x)) * 37) + Boolean.hashCode(this.f8268y)) * 37) + Boolean.hashCode(this.f8269z)) * 37) + Boolean.hashCode(this.A)) * 37) + Boolean.hashCode(this.B)) * 37) + Boolean.hashCode(this.C);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final boolean i() {
        return this.f8264q;
    }

    public final boolean j() {
        return this.f8266w;
    }

    public final boolean k() {
        return this.f8261n;
    }

    public final boolean l() {
        return this.f8267x;
    }

    public final int m() {
        return this.f8248a;
    }

    public final boolean n() {
        return this.f8250c;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m85newBuilder();
    }

    public final int o() {
        return this.f8254g;
    }

    public final int p() {
        return this.f8255h;
    }

    public final int q() {
        return this.f8251d;
    }

    public final int r() {
        return this.f8257j;
    }

    public final int s() {
        return this.f8253f;
    }

    public final int t() {
        return this.f8258k;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8248a;
        arrayList.add("keyChannel=" + i11);
        j jVar = this.f8249b;
        arrayList.add("authenticationLevel=" + jVar);
        boolean z11 = this.f8250c;
        arrayList.add("present=" + z11);
        int i12 = this.f8251d;
        arrayList.add("RSSILeft=" + i12);
        int i13 = this.f8252e;
        arrayList.add("RSSIRight=" + i13);
        int i14 = this.f8253f;
        arrayList.add("RSSIRear=" + i14);
        int i15 = this.f8254g;
        arrayList.add("RSSICenter=" + i15);
        int i16 = this.f8255h;
        arrayList.add("RSSIFront=" + i16);
        int i17 = this.f8256i;
        arrayList.add("RSSISecondary=" + i17);
        int i18 = this.f8257j;
        arrayList.add("RSSINFCCradle=" + i18);
        int i19 = this.f8258k;
        arrayList.add("RSSIRearLeft=" + i19);
        int i21 = this.f8259l;
        arrayList.add("RSSIRearRight=" + i21);
        boolean z12 = this.f8260m;
        arrayList.add("highThreshLeftPresent=" + z12);
        boolean z13 = this.f8261n;
        arrayList.add("highThreshRightPresent=" + z13);
        boolean z14 = this.f8262o;
        arrayList.add("highThreshCenterPresent=" + z14);
        boolean z15 = this.f8263p;
        arrayList.add("highThreshFrontPresent=" + z15);
        boolean z16 = this.f8264q;
        arrayList.add("highThreshRearPresent=" + z16);
        boolean z17 = this.f8265t;
        arrayList.add("highThreshRearLeftPresent=" + z17);
        boolean z18 = this.f8266w;
        arrayList.add("highThreshRearRightPresent=" + z18);
        boolean z19 = this.f8267x;
        arrayList.add("highThreshSecondaryPresent=" + z19);
        boolean z21 = this.f8268y;
        arrayList.add("highThreshNFCPresent=" + z21);
        boolean z22 = this.f8269z;
        arrayList.add("sortedDeltaBayesLeftPresent=" + z22);
        boolean z23 = this.A;
        arrayList.add("sortedDeltaBayesRightPresent=" + z23);
        boolean z24 = this.B;
        arrayList.add("rawDeltaBayesLeftPresent=" + z24);
        boolean z25 = this.C;
        arrayList.add("rawDeltaBayesRightPresent=" + z25);
        l02 = wz.e0.l0(arrayList, ", ", "HandlePulledWithoutAuthDeviceSpecificPayload{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final int u() {
        return this.f8259l;
    }

    public final int v() {
        return this.f8252e;
    }

    public final int w() {
        return this.f8256i;
    }

    public final boolean x() {
        return this.B;
    }

    public final boolean y() {
        return this.C;
    }

    public final boolean z() {
        return this.f8269z;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m85newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(int i11, j authenticationLevel, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, okio.i unknownFields) {
        super(E, unknownFields);
        kotlin.jvm.internal.s.g(authenticationLevel, "authenticationLevel");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8248a = i11;
        this.f8249b = authenticationLevel;
        this.f8250c = z11;
        this.f8251d = i12;
        this.f8252e = i13;
        this.f8253f = i14;
        this.f8254g = i15;
        this.f8255h = i16;
        this.f8256i = i17;
        this.f8257j = i18;
        this.f8258k = i19;
        this.f8259l = i21;
        this.f8260m = z12;
        this.f8261n = z13;
        this.f8262o = z14;
        this.f8263p = z15;
        this.f8264q = z16;
        this.f8265t = z17;
        this.f8266w = z18;
        this.f8267x = z19;
        this.f8268y = z21;
        this.f8269z = z22;
        this.A = z23;
        this.B = z24;
        this.C = z25;
    }
}