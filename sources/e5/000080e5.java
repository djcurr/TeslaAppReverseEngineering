package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;
import wz.e0;

/* loaded from: classes6.dex */
public final class v extends com.squareup.wire.f {

    /* renamed from: i3  reason: collision with root package name */
    public static final ProtoAdapter<v> f35846i3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 19)
    private final u A;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 23)
    private final u B;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 24)
    private final u C;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 25)
    private final u E;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 26)
    private final u F;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 27)
    private final u G;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 28)
    private final u H;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 29)
    private final u K;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 30)
    private final u L;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 31)
    private final u O;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 32)
    private final u P;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 33)
    private final u Q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 42)
    private final u Q1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 49)
    private final u Q2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 34)
    private final u R;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 35)
    private final u T;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 43)
    private final u V1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 36)
    private final u Y;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: a  reason: collision with root package name */
    private final u f35847a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: b  reason: collision with root package name */
    private final u f35848b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 37)

    /* renamed from: b1  reason: collision with root package name */
    private final u f35849b1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 44)

    /* renamed from: b2  reason: collision with root package name */
    private final u f35850b2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

    /* renamed from: c  reason: collision with root package name */
    private final u f35851c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

    /* renamed from: d  reason: collision with root package name */
    private final u f35852d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

    /* renamed from: e  reason: collision with root package name */
    private final u f35853e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)

    /* renamed from: f  reason: collision with root package name */
    private final u f35854f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)

    /* renamed from: g  reason: collision with root package name */
    private final u f35855g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 38)

    /* renamed from: g1  reason: collision with root package name */
    private final u f35856g1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 45)

    /* renamed from: g2  reason: collision with root package name */
    private final u f35857g2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)

    /* renamed from: h  reason: collision with root package name */
    private final u f35858h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 11)

    /* renamed from: i  reason: collision with root package name */
    private final u f35859i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 12)

    /* renamed from: j  reason: collision with root package name */
    private final u f35860j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 13)

    /* renamed from: k  reason: collision with root package name */
    private final u f35861k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 14)

    /* renamed from: l  reason: collision with root package name */
    private final u f35862l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 15)

    /* renamed from: m  reason: collision with root package name */
    private final u f35863m;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 16)

    /* renamed from: n  reason: collision with root package name */
    private final u f35864n;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 17)

    /* renamed from: o  reason: collision with root package name */
    private final u f35865o;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 50)

    /* renamed from: p  reason: collision with root package name */
    private final u f35866p;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 39)

    /* renamed from: p1  reason: collision with root package name */
    private final u f35867p1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 46)

    /* renamed from: p2  reason: collision with root package name */
    private final u f35868p2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 51)

    /* renamed from: q  reason: collision with root package name */
    private final u f35869q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 52)

    /* renamed from: t  reason: collision with root package name */
    private final u f35870t;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 18)

    /* renamed from: w  reason: collision with root package name */
    private final u f35871w;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 20)

    /* renamed from: x  reason: collision with root package name */
    private final u f35872x;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 40)

    /* renamed from: x1  reason: collision with root package name */
    private final u f35873x1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 47)

    /* renamed from: x2  reason: collision with root package name */
    private final u f35874x2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 21)

    /* renamed from: y  reason: collision with root package name */
    private final u f35875y;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 41)

    /* renamed from: y1  reason: collision with root package name */
    private final u f35876y1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 48)

    /* renamed from: y2  reason: collision with root package name */
    private final u f35877y2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 22)

    /* renamed from: z  reason: collision with root package name */
    private final u f35878z;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<v> {
        a(com.squareup.wire.b bVar, n00.d<v> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.WheelType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public v decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            u uVar4 = null;
            u uVar5 = null;
            u uVar6 = null;
            u uVar7 = null;
            u uVar8 = null;
            u uVar9 = null;
            u uVar10 = null;
            u uVar11 = null;
            u uVar12 = null;
            u uVar13 = null;
            u uVar14 = null;
            u uVar15 = null;
            u uVar16 = null;
            u uVar17 = null;
            u uVar18 = null;
            u uVar19 = null;
            u uVar20 = null;
            u uVar21 = null;
            u uVar22 = null;
            u uVar23 = null;
            u uVar24 = null;
            u uVar25 = null;
            u uVar26 = null;
            u uVar27 = null;
            u uVar28 = null;
            u uVar29 = null;
            u uVar30 = null;
            u uVar31 = null;
            u uVar32 = null;
            u uVar33 = null;
            u uVar34 = null;
            u uVar35 = null;
            u uVar36 = null;
            u uVar37 = null;
            u uVar38 = null;
            u uVar39 = null;
            u uVar40 = null;
            u uVar41 = null;
            u uVar42 = null;
            u uVar43 = null;
            u uVar44 = null;
            u uVar45 = null;
            u uVar46 = null;
            u uVar47 = null;
            u uVar48 = null;
            u uVar49 = null;
            u uVar50 = null;
            while (true) {
                int g11 = reader.g();
                u uVar51 = uVar12;
                if (g11 == -1) {
                    return new v(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar51, uVar50, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35, uVar36, uVar37, uVar38, uVar39, uVar40, uVar41, uVar42, uVar43, uVar44, uVar45, uVar46, uVar47, uVar48, uVar49, reader.e(d11));
                }
                switch (g11) {
                    case 3:
                        uVar = u.f35845a.decode(reader);
                        b0 b0Var = b0.f54756a;
                        break;
                    case 4:
                        uVar2 = u.f35845a.decode(reader);
                        b0 b0Var2 = b0.f54756a;
                        break;
                    case 5:
                        uVar3 = u.f35845a.decode(reader);
                        b0 b0Var3 = b0.f54756a;
                        break;
                    case 6:
                        uVar4 = u.f35845a.decode(reader);
                        b0 b0Var4 = b0.f54756a;
                        break;
                    case 7:
                        uVar5 = u.f35845a.decode(reader);
                        b0 b0Var5 = b0.f54756a;
                        break;
                    case 8:
                        uVar6 = u.f35845a.decode(reader);
                        b0 b0Var6 = b0.f54756a;
                        break;
                    case 9:
                        uVar7 = u.f35845a.decode(reader);
                        b0 b0Var7 = b0.f54756a;
                        break;
                    case 10:
                        uVar8 = u.f35845a.decode(reader);
                        b0 b0Var8 = b0.f54756a;
                        break;
                    case 11:
                        uVar9 = u.f35845a.decode(reader);
                        b0 b0Var9 = b0.f54756a;
                        break;
                    case 12:
                        uVar10 = u.f35845a.decode(reader);
                        b0 b0Var10 = b0.f54756a;
                        break;
                    case 13:
                        uVar11 = u.f35845a.decode(reader);
                        b0 b0Var11 = b0.f54756a;
                        break;
                    case 14:
                        uVar12 = u.f35845a.decode(reader);
                        b0 b0Var12 = b0.f54756a;
                        continue;
                    case 15:
                        u decode = u.f35845a.decode(reader);
                        b0 b0Var13 = b0.f54756a;
                        uVar50 = decode;
                        break;
                    case 16:
                        u decode2 = u.f35845a.decode(reader);
                        b0 b0Var14 = b0.f54756a;
                        uVar13 = decode2;
                        break;
                    case 17:
                        u decode3 = u.f35845a.decode(reader);
                        b0 b0Var15 = b0.f54756a;
                        uVar14 = decode3;
                        break;
                    case 18:
                        u decode4 = u.f35845a.decode(reader);
                        b0 b0Var16 = b0.f54756a;
                        uVar18 = decode4;
                        break;
                    case 19:
                        u decode5 = u.f35845a.decode(reader);
                        b0 b0Var17 = b0.f54756a;
                        uVar22 = decode5;
                        break;
                    case 20:
                        u decode6 = u.f35845a.decode(reader);
                        b0 b0Var18 = b0.f54756a;
                        uVar19 = decode6;
                        break;
                    case 21:
                        u decode7 = u.f35845a.decode(reader);
                        b0 b0Var19 = b0.f54756a;
                        uVar20 = decode7;
                        break;
                    case 22:
                        u decode8 = u.f35845a.decode(reader);
                        b0 b0Var20 = b0.f54756a;
                        uVar21 = decode8;
                        break;
                    case 23:
                        u decode9 = u.f35845a.decode(reader);
                        b0 b0Var21 = b0.f54756a;
                        uVar23 = decode9;
                        break;
                    case 24:
                        u decode10 = u.f35845a.decode(reader);
                        b0 b0Var22 = b0.f54756a;
                        uVar24 = decode10;
                        break;
                    case 25:
                        u decode11 = u.f35845a.decode(reader);
                        b0 b0Var23 = b0.f54756a;
                        uVar25 = decode11;
                        break;
                    case 26:
                        u decode12 = u.f35845a.decode(reader);
                        b0 b0Var24 = b0.f54756a;
                        uVar26 = decode12;
                        break;
                    case 27:
                        u decode13 = u.f35845a.decode(reader);
                        b0 b0Var25 = b0.f54756a;
                        uVar27 = decode13;
                        break;
                    case 28:
                        u decode14 = u.f35845a.decode(reader);
                        b0 b0Var26 = b0.f54756a;
                        uVar28 = decode14;
                        break;
                    case 29:
                        u decode15 = u.f35845a.decode(reader);
                        b0 b0Var27 = b0.f54756a;
                        uVar29 = decode15;
                        break;
                    case 30:
                        u decode16 = u.f35845a.decode(reader);
                        b0 b0Var28 = b0.f54756a;
                        uVar30 = decode16;
                        break;
                    case 31:
                        u decode17 = u.f35845a.decode(reader);
                        b0 b0Var29 = b0.f54756a;
                        uVar31 = decode17;
                        break;
                    case 32:
                        u decode18 = u.f35845a.decode(reader);
                        b0 b0Var30 = b0.f54756a;
                        uVar32 = decode18;
                        break;
                    case 33:
                        u decode19 = u.f35845a.decode(reader);
                        b0 b0Var31 = b0.f54756a;
                        uVar33 = decode19;
                        break;
                    case 34:
                        u decode20 = u.f35845a.decode(reader);
                        b0 b0Var32 = b0.f54756a;
                        uVar34 = decode20;
                        break;
                    case 35:
                        u decode21 = u.f35845a.decode(reader);
                        b0 b0Var33 = b0.f54756a;
                        uVar35 = decode21;
                        break;
                    case 36:
                        u decode22 = u.f35845a.decode(reader);
                        b0 b0Var34 = b0.f54756a;
                        uVar36 = decode22;
                        break;
                    case 37:
                        u decode23 = u.f35845a.decode(reader);
                        b0 b0Var35 = b0.f54756a;
                        uVar37 = decode23;
                        break;
                    case 38:
                        u decode24 = u.f35845a.decode(reader);
                        b0 b0Var36 = b0.f54756a;
                        uVar38 = decode24;
                        break;
                    case 39:
                        u decode25 = u.f35845a.decode(reader);
                        b0 b0Var37 = b0.f54756a;
                        uVar39 = decode25;
                        break;
                    case 40:
                        u decode26 = u.f35845a.decode(reader);
                        b0 b0Var38 = b0.f54756a;
                        uVar40 = decode26;
                        break;
                    case 41:
                        u decode27 = u.f35845a.decode(reader);
                        b0 b0Var39 = b0.f54756a;
                        uVar41 = decode27;
                        break;
                    case 42:
                        u decode28 = u.f35845a.decode(reader);
                        b0 b0Var40 = b0.f54756a;
                        uVar42 = decode28;
                        break;
                    case 43:
                        u decode29 = u.f35845a.decode(reader);
                        b0 b0Var41 = b0.f54756a;
                        uVar43 = decode29;
                        break;
                    case 44:
                        u decode30 = u.f35845a.decode(reader);
                        b0 b0Var42 = b0.f54756a;
                        uVar44 = decode30;
                        break;
                    case 45:
                        u decode31 = u.f35845a.decode(reader);
                        b0 b0Var43 = b0.f54756a;
                        uVar45 = decode31;
                        break;
                    case 46:
                        u decode32 = u.f35845a.decode(reader);
                        b0 b0Var44 = b0.f54756a;
                        uVar46 = decode32;
                        break;
                    case 47:
                        u decode33 = u.f35845a.decode(reader);
                        b0 b0Var45 = b0.f54756a;
                        uVar47 = decode33;
                        break;
                    case 48:
                        u decode34 = u.f35845a.decode(reader);
                        b0 b0Var46 = b0.f54756a;
                        uVar48 = decode34;
                        break;
                    case 49:
                        u decode35 = u.f35845a.decode(reader);
                        b0 b0Var47 = b0.f54756a;
                        uVar49 = decode35;
                        break;
                    case 50:
                        u decode36 = u.f35845a.decode(reader);
                        b0 b0Var48 = b0.f54756a;
                        uVar15 = decode36;
                        break;
                    case 51:
                        u decode37 = u.f35845a.decode(reader);
                        b0 b0Var49 = b0.f54756a;
                        uVar16 = decode37;
                        break;
                    case 52:
                        u decode38 = u.f35845a.decode(reader);
                        b0 b0Var50 = b0.f54756a;
                        uVar17 = decode38;
                        break;
                    default:
                        reader.m(g11);
                        b0 b0Var51 = b0.f54756a;
                        break;
                }
                uVar12 = uVar51;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, v value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 3, value.W());
            protoAdapter.encodeWithTag(writer, 4, value.Y());
            protoAdapter.encodeWithTag(writer, 5, value.y());
            protoAdapter.encodeWithTag(writer, 6, value.z());
            protoAdapter.encodeWithTag(writer, 7, value.G());
            protoAdapter.encodeWithTag(writer, 8, value.H());
            protoAdapter.encodeWithTag(writer, 9, value.J());
            protoAdapter.encodeWithTag(writer, 10, value.I());
            protoAdapter.encodeWithTag(writer, 11, value.t());
            protoAdapter.encodeWithTag(writer, 12, value.u());
            protoAdapter.encodeWithTag(writer, 13, value.w());
            protoAdapter.encodeWithTag(writer, 14, value.V());
            protoAdapter.encodeWithTag(writer, 15, value.g());
            protoAdapter.encodeWithTag(writer, 16, value.h());
            protoAdapter.encodeWithTag(writer, 17, value.X());
            protoAdapter.encodeWithTag(writer, 50, value.A());
            protoAdapter.encodeWithTag(writer, 51, value.K());
            protoAdapter.encodeWithTag(writer, 52, value.U());
            protoAdapter.encodeWithTag(writer, 18, value.n());
            protoAdapter.encodeWithTag(writer, 20, value.x());
            protoAdapter.encodeWithTag(writer, 21, value.q());
            protoAdapter.encodeWithTag(writer, 22, value.i());
            protoAdapter.encodeWithTag(writer, 19, value.s());
            protoAdapter.encodeWithTag(writer, 23, value.m());
            protoAdapter.encodeWithTag(writer, 24, value.B());
            protoAdapter.encodeWithTag(writer, 25, value.o());
            protoAdapter.encodeWithTag(writer, 26, value.C());
            protoAdapter.encodeWithTag(writer, 27, value.b());
            protoAdapter.encodeWithTag(writer, 28, value.p());
            protoAdapter.encodeWithTag(writer, 29, value.L());
            protoAdapter.encodeWithTag(writer, 30, value.M());
            protoAdapter.encodeWithTag(writer, 31, value.O());
            protoAdapter.encodeWithTag(writer, 32, value.P());
            protoAdapter.encodeWithTag(writer, 33, value.c());
            protoAdapter.encodeWithTag(writer, 34, value.d());
            protoAdapter.encodeWithTag(writer, 35, value.v());
            protoAdapter.encodeWithTag(writer, 36, value.e());
            protoAdapter.encodeWithTag(writer, 37, value.Q());
            protoAdapter.encodeWithTag(writer, 38, value.r());
            protoAdapter.encodeWithTag(writer, 39, value.f());
            protoAdapter.encodeWithTag(writer, 40, value.R());
            protoAdapter.encodeWithTag(writer, 41, value.l());
            protoAdapter.encodeWithTag(writer, 42, value.j());
            protoAdapter.encodeWithTag(writer, 43, value.k());
            protoAdapter.encodeWithTag(writer, 44, value.E());
            protoAdapter.encodeWithTag(writer, 45, value.F());
            protoAdapter.encodeWithTag(writer, 46, value.D());
            protoAdapter.encodeWithTag(writer, 47, value.T());
            protoAdapter.encodeWithTag(writer, 48, value.S());
            protoAdapter.encodeWithTag(writer, 49, value.N());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(v value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(3, value.W()) + protoAdapter.encodedSizeWithTag(4, value.Y()) + protoAdapter.encodedSizeWithTag(5, value.y()) + protoAdapter.encodedSizeWithTag(6, value.z()) + protoAdapter.encodedSizeWithTag(7, value.G()) + protoAdapter.encodedSizeWithTag(8, value.H()) + protoAdapter.encodedSizeWithTag(9, value.J()) + protoAdapter.encodedSizeWithTag(10, value.I()) + protoAdapter.encodedSizeWithTag(11, value.t()) + protoAdapter.encodedSizeWithTag(12, value.u()) + protoAdapter.encodedSizeWithTag(13, value.w()) + protoAdapter.encodedSizeWithTag(14, value.V()) + protoAdapter.encodedSizeWithTag(15, value.g()) + protoAdapter.encodedSizeWithTag(16, value.h()) + protoAdapter.encodedSizeWithTag(17, value.X()) + protoAdapter.encodedSizeWithTag(50, value.A()) + protoAdapter.encodedSizeWithTag(51, value.K()) + protoAdapter.encodedSizeWithTag(52, value.U()) + protoAdapter.encodedSizeWithTag(18, value.n()) + protoAdapter.encodedSizeWithTag(20, value.x()) + protoAdapter.encodedSizeWithTag(21, value.q()) + protoAdapter.encodedSizeWithTag(22, value.i()) + protoAdapter.encodedSizeWithTag(19, value.s()) + protoAdapter.encodedSizeWithTag(23, value.m()) + protoAdapter.encodedSizeWithTag(24, value.B()) + protoAdapter.encodedSizeWithTag(25, value.o()) + protoAdapter.encodedSizeWithTag(26, value.C()) + protoAdapter.encodedSizeWithTag(27, value.b()) + protoAdapter.encodedSizeWithTag(28, value.p()) + protoAdapter.encodedSizeWithTag(29, value.L()) + protoAdapter.encodedSizeWithTag(30, value.M()) + protoAdapter.encodedSizeWithTag(31, value.O()) + protoAdapter.encodedSizeWithTag(32, value.P()) + protoAdapter.encodedSizeWithTag(33, value.c()) + protoAdapter.encodedSizeWithTag(34, value.d()) + protoAdapter.encodedSizeWithTag(35, value.v()) + protoAdapter.encodedSizeWithTag(36, value.e()) + protoAdapter.encodedSizeWithTag(37, value.Q()) + protoAdapter.encodedSizeWithTag(38, value.r()) + protoAdapter.encodedSizeWithTag(39, value.f()) + protoAdapter.encodedSizeWithTag(40, value.R()) + protoAdapter.encodedSizeWithTag(41, value.l()) + protoAdapter.encodedSizeWithTag(42, value.j()) + protoAdapter.encodedSizeWithTag(43, value.k()) + protoAdapter.encodedSizeWithTag(44, value.E()) + protoAdapter.encodedSizeWithTag(45, value.F()) + protoAdapter.encodedSizeWithTag(46, value.D()) + protoAdapter.encodedSizeWithTag(47, value.T()) + protoAdapter.encodedSizeWithTag(48, value.S()) + protoAdapter.encodedSizeWithTag(49, value.N());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public v redact(v value) {
            kotlin.jvm.internal.s.g(value, "value");
            u W = value.W();
            u redact = W == null ? null : u.f35845a.redact(W);
            u Y = value.Y();
            u redact2 = Y == null ? null : u.f35845a.redact(Y);
            u y11 = value.y();
            u redact3 = y11 == null ? null : u.f35845a.redact(y11);
            u z11 = value.z();
            u redact4 = z11 == null ? null : u.f35845a.redact(z11);
            u G = value.G();
            u redact5 = G == null ? null : u.f35845a.redact(G);
            u H = value.H();
            u redact6 = H == null ? null : u.f35845a.redact(H);
            u J = value.J();
            u redact7 = J == null ? null : u.f35845a.redact(J);
            u I = value.I();
            u redact8 = I == null ? null : u.f35845a.redact(I);
            u t11 = value.t();
            u redact9 = t11 == null ? null : u.f35845a.redact(t11);
            u u11 = value.u();
            u redact10 = u11 == null ? null : u.f35845a.redact(u11);
            u w11 = value.w();
            u redact11 = w11 == null ? null : u.f35845a.redact(w11);
            u V = value.V();
            u redact12 = V == null ? null : u.f35845a.redact(V);
            u g11 = value.g();
            u redact13 = g11 == null ? null : u.f35845a.redact(g11);
            u h11 = value.h();
            u redact14 = h11 == null ? null : u.f35845a.redact(h11);
            u X = value.X();
            u redact15 = X == null ? null : u.f35845a.redact(X);
            u A = value.A();
            u redact16 = A == null ? null : u.f35845a.redact(A);
            u K = value.K();
            u redact17 = K == null ? null : u.f35845a.redact(K);
            u U = value.U();
            u redact18 = U == null ? null : u.f35845a.redact(U);
            u n11 = value.n();
            u redact19 = n11 == null ? null : u.f35845a.redact(n11);
            u x11 = value.x();
            u redact20 = x11 == null ? null : u.f35845a.redact(x11);
            u q11 = value.q();
            u redact21 = q11 == null ? null : u.f35845a.redact(q11);
            u i11 = value.i();
            u redact22 = i11 == null ? null : u.f35845a.redact(i11);
            u s11 = value.s();
            u redact23 = s11 == null ? null : u.f35845a.redact(s11);
            u m11 = value.m();
            u redact24 = m11 == null ? null : u.f35845a.redact(m11);
            u B = value.B();
            u redact25 = B == null ? null : u.f35845a.redact(B);
            u o11 = value.o();
            u redact26 = o11 == null ? null : u.f35845a.redact(o11);
            u C = value.C();
            u redact27 = C == null ? null : u.f35845a.redact(C);
            u b11 = value.b();
            u redact28 = b11 == null ? null : u.f35845a.redact(b11);
            u p11 = value.p();
            u redact29 = p11 == null ? null : u.f35845a.redact(p11);
            u L = value.L();
            u redact30 = L == null ? null : u.f35845a.redact(L);
            u M = value.M();
            u redact31 = M == null ? null : u.f35845a.redact(M);
            u O = value.O();
            u redact32 = O == null ? null : u.f35845a.redact(O);
            u P = value.P();
            u redact33 = P == null ? null : u.f35845a.redact(P);
            u c11 = value.c();
            u redact34 = c11 == null ? null : u.f35845a.redact(c11);
            u d11 = value.d();
            u redact35 = d11 == null ? null : u.f35845a.redact(d11);
            u v11 = value.v();
            u redact36 = v11 == null ? null : u.f35845a.redact(v11);
            u e11 = value.e();
            u redact37 = e11 == null ? null : u.f35845a.redact(e11);
            u Q = value.Q();
            u redact38 = Q == null ? null : u.f35845a.redact(Q);
            u r11 = value.r();
            u redact39 = r11 == null ? null : u.f35845a.redact(r11);
            u f11 = value.f();
            u redact40 = f11 == null ? null : u.f35845a.redact(f11);
            u R = value.R();
            u redact41 = R == null ? null : u.f35845a.redact(R);
            u l11 = value.l();
            u redact42 = l11 == null ? null : u.f35845a.redact(l11);
            u j11 = value.j();
            u redact43 = j11 == null ? null : u.f35845a.redact(j11);
            u k11 = value.k();
            u redact44 = k11 == null ? null : u.f35845a.redact(k11);
            u E = value.E();
            u redact45 = E == null ? null : u.f35845a.redact(E);
            u F = value.F();
            u redact46 = F == null ? null : u.f35845a.redact(F);
            u D = value.D();
            u redact47 = D == null ? null : u.f35845a.redact(D);
            u T = value.T();
            u redact48 = T == null ? null : u.f35845a.redact(T);
            u S = value.S();
            u redact49 = S == null ? null : u.f35845a.redact(S);
            u N = value.N();
            return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, redact11, redact12, redact13, redact14, redact15, redact16, redact17, redact18, redact19, redact20, redact21, redact22, redact23, redact24, redact25, redact26, redact27, redact28, redact29, redact30, redact31, redact32, redact33, redact34, redact35, redact36, redact37, redact38, redact39, redact40, redact41, redact42, redact43, redact44, redact45, redact46, redact47, redact48, redact49, N == null ? null : u.f35845a.redact(N), okio.i.f42656d);
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
        f35846i3 = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(v.class), com.squareup.wire.o.PROTO_3);
    }

    public v() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524287, null);
    }

    public /* synthetic */ v(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, u uVar11, u uVar12, u uVar13, u uVar14, u uVar15, u uVar16, u uVar17, u uVar18, u uVar19, u uVar20, u uVar21, u uVar22, u uVar23, u uVar24, u uVar25, u uVar26, u uVar27, u uVar28, u uVar29, u uVar30, u uVar31, u uVar32, u uVar33, u uVar34, u uVar35, u uVar36, u uVar37, u uVar38, u uVar39, u uVar40, u uVar41, u uVar42, u uVar43, u uVar44, u uVar45, u uVar46, u uVar47, u uVar48, u uVar49, u uVar50, okio.i iVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) != 0 ? null : uVar8, (i11 & 256) != 0 ? null : uVar9, (i11 & 512) != 0 ? null : uVar10, (i11 & 1024) != 0 ? null : uVar11, (i11 & 2048) != 0 ? null : uVar12, (i11 & 4096) != 0 ? null : uVar13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : uVar14, (i11 & 16384) != 0 ? null : uVar15, (i11 & 32768) != 0 ? null : uVar16, (i11 & 65536) != 0 ? null : uVar17, (i11 & 131072) != 0 ? null : uVar18, (i11 & 262144) != 0 ? null : uVar19, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : uVar20, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : uVar21, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : uVar22, (i11 & 4194304) != 0 ? null : uVar23, (i11 & 8388608) != 0 ? null : uVar24, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : uVar25, (i11 & 33554432) != 0 ? null : uVar26, (i11 & 67108864) != 0 ? null : uVar27, (i11 & 134217728) != 0 ? null : uVar28, (i11 & 268435456) != 0 ? null : uVar29, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? null : uVar30, (i11 & 1073741824) != 0 ? null : uVar31, (i11 & Integer.MIN_VALUE) != 0 ? null : uVar32, (i12 & 1) != 0 ? null : uVar33, (i12 & 2) != 0 ? null : uVar34, (i12 & 4) != 0 ? null : uVar35, (i12 & 8) != 0 ? null : uVar36, (i12 & 16) != 0 ? null : uVar37, (i12 & 32) != 0 ? null : uVar38, (i12 & 64) != 0 ? null : uVar39, (i12 & 128) != 0 ? null : uVar40, (i12 & 256) != 0 ? null : uVar41, (i12 & 512) != 0 ? null : uVar42, (i12 & 1024) != 0 ? null : uVar43, (i12 & 2048) != 0 ? null : uVar44, (i12 & 4096) != 0 ? null : uVar45, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : uVar46, (i12 & 16384) != 0 ? null : uVar47, (i12 & 32768) != 0 ? null : uVar48, (i12 & 65536) != 0 ? null : uVar49, (i12 & 131072) != 0 ? null : uVar50, (i12 & 262144) != 0 ? okio.i.f42656d : iVar);
    }

    public final u A() {
        return this.f35866p;
    }

    public final u B() {
        return this.C;
    }

    public final u C() {
        return this.F;
    }

    public final u D() {
        return this.f35868p2;
    }

    public final u E() {
        return this.f35850b2;
    }

    public final u F() {
        return this.f35857g2;
    }

    public final u G() {
        return this.f35853e;
    }

    public final u H() {
        return this.f35854f;
    }

    public final u I() {
        return this.f35858h;
    }

    public final u J() {
        return this.f35855g;
    }

    public final u K() {
        return this.f35869q;
    }

    public final u L() {
        return this.K;
    }

    public final u M() {
        return this.L;
    }

    public final u N() {
        return this.Q2;
    }

    public final u O() {
        return this.O;
    }

    public final u P() {
        return this.P;
    }

    public final u Q() {
        return this.f35849b1;
    }

    public final u R() {
        return this.f35873x1;
    }

    public final u S() {
        return this.f35877y2;
    }

    public final u T() {
        return this.f35874x2;
    }

    public final u U() {
        return this.f35870t;
    }

    public final u V() {
        return this.f35862l;
    }

    public final u W() {
        return this.f35847a;
    }

    public final u X() {
        return this.f35865o;
    }

    public final u Y() {
        return this.f35848b;
    }

    public final v a(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, u uVar11, u uVar12, u uVar13, u uVar14, u uVar15, u uVar16, u uVar17, u uVar18, u uVar19, u uVar20, u uVar21, u uVar22, u uVar23, u uVar24, u uVar25, u uVar26, u uVar27, u uVar28, u uVar29, u uVar30, u uVar31, u uVar32, u uVar33, u uVar34, u uVar35, u uVar36, u uVar37, u uVar38, u uVar39, u uVar40, u uVar41, u uVar42, u uVar43, u uVar44, u uVar45, u uVar46, u uVar47, u uVar48, u uVar49, u uVar50, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new v(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35, uVar36, uVar37, uVar38, uVar39, uVar40, uVar41, uVar42, uVar43, uVar44, uVar45, uVar46, uVar47, uVar48, uVar49, uVar50, unknownFields);
    }

    public final u b() {
        return this.G;
    }

    public final u c() {
        return this.Q;
    }

    public final u d() {
        return this.R;
    }

    public final u e() {
        return this.Y;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), vVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35847a, vVar.f35847a) && kotlin.jvm.internal.s.c(this.f35848b, vVar.f35848b) && kotlin.jvm.internal.s.c(this.f35851c, vVar.f35851c) && kotlin.jvm.internal.s.c(this.f35852d, vVar.f35852d) && kotlin.jvm.internal.s.c(this.f35853e, vVar.f35853e) && kotlin.jvm.internal.s.c(this.f35854f, vVar.f35854f) && kotlin.jvm.internal.s.c(this.f35855g, vVar.f35855g) && kotlin.jvm.internal.s.c(this.f35858h, vVar.f35858h) && kotlin.jvm.internal.s.c(this.f35859i, vVar.f35859i) && kotlin.jvm.internal.s.c(this.f35860j, vVar.f35860j) && kotlin.jvm.internal.s.c(this.f35861k, vVar.f35861k) && kotlin.jvm.internal.s.c(this.f35862l, vVar.f35862l) && kotlin.jvm.internal.s.c(this.f35863m, vVar.f35863m) && kotlin.jvm.internal.s.c(this.f35864n, vVar.f35864n) && kotlin.jvm.internal.s.c(this.f35865o, vVar.f35865o) && kotlin.jvm.internal.s.c(this.f35866p, vVar.f35866p) && kotlin.jvm.internal.s.c(this.f35869q, vVar.f35869q) && kotlin.jvm.internal.s.c(this.f35870t, vVar.f35870t) && kotlin.jvm.internal.s.c(this.f35871w, vVar.f35871w) && kotlin.jvm.internal.s.c(this.f35872x, vVar.f35872x) && kotlin.jvm.internal.s.c(this.f35875y, vVar.f35875y) && kotlin.jvm.internal.s.c(this.f35878z, vVar.f35878z) && kotlin.jvm.internal.s.c(this.A, vVar.A) && kotlin.jvm.internal.s.c(this.B, vVar.B) && kotlin.jvm.internal.s.c(this.C, vVar.C) && kotlin.jvm.internal.s.c(this.E, vVar.E) && kotlin.jvm.internal.s.c(this.F, vVar.F) && kotlin.jvm.internal.s.c(this.G, vVar.G) && kotlin.jvm.internal.s.c(this.H, vVar.H) && kotlin.jvm.internal.s.c(this.K, vVar.K) && kotlin.jvm.internal.s.c(this.L, vVar.L) && kotlin.jvm.internal.s.c(this.O, vVar.O) && kotlin.jvm.internal.s.c(this.P, vVar.P) && kotlin.jvm.internal.s.c(this.Q, vVar.Q) && kotlin.jvm.internal.s.c(this.R, vVar.R) && kotlin.jvm.internal.s.c(this.T, vVar.T) && kotlin.jvm.internal.s.c(this.Y, vVar.Y) && kotlin.jvm.internal.s.c(this.f35849b1, vVar.f35849b1) && kotlin.jvm.internal.s.c(this.f35856g1, vVar.f35856g1) && kotlin.jvm.internal.s.c(this.f35867p1, vVar.f35867p1) && kotlin.jvm.internal.s.c(this.f35873x1, vVar.f35873x1) && kotlin.jvm.internal.s.c(this.f35876y1, vVar.f35876y1) && kotlin.jvm.internal.s.c(this.Q1, vVar.Q1) && kotlin.jvm.internal.s.c(this.V1, vVar.V1) && kotlin.jvm.internal.s.c(this.f35850b2, vVar.f35850b2) && kotlin.jvm.internal.s.c(this.f35857g2, vVar.f35857g2) && kotlin.jvm.internal.s.c(this.f35868p2, vVar.f35868p2) && kotlin.jvm.internal.s.c(this.f35874x2, vVar.f35874x2) && kotlin.jvm.internal.s.c(this.f35877y2, vVar.f35877y2) && kotlin.jvm.internal.s.c(this.Q2, vVar.Q2);
        }
        return false;
    }

    public final u f() {
        return this.f35867p1;
    }

    public final u g() {
        return this.f35863m;
    }

    public final u h() {
        return this.f35864n;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35847a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35848b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35851c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35852d;
            int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
            u uVar5 = this.f35853e;
            int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
            u uVar6 = this.f35854f;
            int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
            u uVar7 = this.f35855g;
            int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
            u uVar8 = this.f35858h;
            int hashCode9 = (hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0)) * 37;
            u uVar9 = this.f35859i;
            int hashCode10 = (hashCode9 + (uVar9 != null ? uVar9.hashCode() : 0)) * 37;
            u uVar10 = this.f35860j;
            int hashCode11 = (hashCode10 + (uVar10 != null ? uVar10.hashCode() : 0)) * 37;
            u uVar11 = this.f35861k;
            int hashCode12 = (hashCode11 + (uVar11 != null ? uVar11.hashCode() : 0)) * 37;
            u uVar12 = this.f35862l;
            int hashCode13 = (hashCode12 + (uVar12 != null ? uVar12.hashCode() : 0)) * 37;
            u uVar13 = this.f35863m;
            int hashCode14 = (hashCode13 + (uVar13 != null ? uVar13.hashCode() : 0)) * 37;
            u uVar14 = this.f35864n;
            int hashCode15 = (hashCode14 + (uVar14 != null ? uVar14.hashCode() : 0)) * 37;
            u uVar15 = this.f35865o;
            int hashCode16 = (hashCode15 + (uVar15 != null ? uVar15.hashCode() : 0)) * 37;
            u uVar16 = this.f35866p;
            int hashCode17 = (hashCode16 + (uVar16 != null ? uVar16.hashCode() : 0)) * 37;
            u uVar17 = this.f35869q;
            int hashCode18 = (hashCode17 + (uVar17 != null ? uVar17.hashCode() : 0)) * 37;
            u uVar18 = this.f35870t;
            int hashCode19 = (hashCode18 + (uVar18 != null ? uVar18.hashCode() : 0)) * 37;
            u uVar19 = this.f35871w;
            int hashCode20 = (hashCode19 + (uVar19 != null ? uVar19.hashCode() : 0)) * 37;
            u uVar20 = this.f35872x;
            int hashCode21 = (hashCode20 + (uVar20 != null ? uVar20.hashCode() : 0)) * 37;
            u uVar21 = this.f35875y;
            int hashCode22 = (hashCode21 + (uVar21 != null ? uVar21.hashCode() : 0)) * 37;
            u uVar22 = this.f35878z;
            int hashCode23 = (hashCode22 + (uVar22 != null ? uVar22.hashCode() : 0)) * 37;
            u uVar23 = this.A;
            int hashCode24 = (hashCode23 + (uVar23 != null ? uVar23.hashCode() : 0)) * 37;
            u uVar24 = this.B;
            int hashCode25 = (hashCode24 + (uVar24 != null ? uVar24.hashCode() : 0)) * 37;
            u uVar25 = this.C;
            int hashCode26 = (hashCode25 + (uVar25 != null ? uVar25.hashCode() : 0)) * 37;
            u uVar26 = this.E;
            int hashCode27 = (hashCode26 + (uVar26 != null ? uVar26.hashCode() : 0)) * 37;
            u uVar27 = this.F;
            int hashCode28 = (hashCode27 + (uVar27 != null ? uVar27.hashCode() : 0)) * 37;
            u uVar28 = this.G;
            int hashCode29 = (hashCode28 + (uVar28 != null ? uVar28.hashCode() : 0)) * 37;
            u uVar29 = this.H;
            int hashCode30 = (hashCode29 + (uVar29 != null ? uVar29.hashCode() : 0)) * 37;
            u uVar30 = this.K;
            int hashCode31 = (hashCode30 + (uVar30 != null ? uVar30.hashCode() : 0)) * 37;
            u uVar31 = this.L;
            int hashCode32 = (hashCode31 + (uVar31 != null ? uVar31.hashCode() : 0)) * 37;
            u uVar32 = this.O;
            int hashCode33 = (hashCode32 + (uVar32 != null ? uVar32.hashCode() : 0)) * 37;
            u uVar33 = this.P;
            int hashCode34 = (hashCode33 + (uVar33 != null ? uVar33.hashCode() : 0)) * 37;
            u uVar34 = this.Q;
            int hashCode35 = (hashCode34 + (uVar34 != null ? uVar34.hashCode() : 0)) * 37;
            u uVar35 = this.R;
            int hashCode36 = (hashCode35 + (uVar35 != null ? uVar35.hashCode() : 0)) * 37;
            u uVar36 = this.T;
            int hashCode37 = (hashCode36 + (uVar36 != null ? uVar36.hashCode() : 0)) * 37;
            u uVar37 = this.Y;
            int hashCode38 = (hashCode37 + (uVar37 != null ? uVar37.hashCode() : 0)) * 37;
            u uVar38 = this.f35849b1;
            int hashCode39 = (hashCode38 + (uVar38 != null ? uVar38.hashCode() : 0)) * 37;
            u uVar39 = this.f35856g1;
            int hashCode40 = (hashCode39 + (uVar39 != null ? uVar39.hashCode() : 0)) * 37;
            u uVar40 = this.f35867p1;
            int hashCode41 = (hashCode40 + (uVar40 != null ? uVar40.hashCode() : 0)) * 37;
            u uVar41 = this.f35873x1;
            int hashCode42 = (hashCode41 + (uVar41 != null ? uVar41.hashCode() : 0)) * 37;
            u uVar42 = this.f35876y1;
            int hashCode43 = (hashCode42 + (uVar42 != null ? uVar42.hashCode() : 0)) * 37;
            u uVar43 = this.Q1;
            int hashCode44 = (hashCode43 + (uVar43 != null ? uVar43.hashCode() : 0)) * 37;
            u uVar44 = this.V1;
            int hashCode45 = (hashCode44 + (uVar44 != null ? uVar44.hashCode() : 0)) * 37;
            u uVar45 = this.f35850b2;
            int hashCode46 = (hashCode45 + (uVar45 != null ? uVar45.hashCode() : 0)) * 37;
            u uVar46 = this.f35857g2;
            int hashCode47 = (hashCode46 + (uVar46 != null ? uVar46.hashCode() : 0)) * 37;
            u uVar47 = this.f35868p2;
            int hashCode48 = (hashCode47 + (uVar47 != null ? uVar47.hashCode() : 0)) * 37;
            u uVar48 = this.f35874x2;
            int hashCode49 = (hashCode48 + (uVar48 != null ? uVar48.hashCode() : 0)) * 37;
            u uVar49 = this.f35877y2;
            int hashCode50 = (hashCode49 + (uVar49 != null ? uVar49.hashCode() : 0)) * 37;
            u uVar50 = this.Q2;
            int hashCode51 = hashCode50 + (uVar50 != null ? uVar50.hashCode() : 0);
            this.hashCode = hashCode51;
            return hashCode51;
        }
        return i11;
    }

    public final u i() {
        return this.f35878z;
    }

    public final u j() {
        return this.Q1;
    }

    public final u k() {
        return this.V1;
    }

    public final u l() {
        return this.f35876y1;
    }

    public final u m() {
        return this.B;
    }

    public final u n() {
        return this.f35871w;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m649newBuilder();
    }

    public final u o() {
        return this.E;
    }

    public final u p() {
        return this.H;
    }

    public final u q() {
        return this.f35875y;
    }

    public final u r() {
        return this.f35856g1;
    }

    public final u s() {
        return this.A;
    }

    public final u t() {
        return this.f35859i;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35847a;
        if (uVar != null) {
            arrayList.add("Unknown=" + uVar);
        }
        u uVar2 = this.f35848b;
        if (uVar2 != null) {
            arrayList.add("ZeroG20Gunpowder=" + uVar2);
        }
        u uVar3 = this.f35851c;
        if (uVar3 != null) {
            arrayList.add("Pinwheel18=" + uVar3);
        }
        u uVar4 = this.f35852d;
        if (uVar4 != null) {
            arrayList.add("Pinwheel18CapKit=" + uVar4);
        }
        u uVar5 = this.f35853e;
        if (uVar5 != null) {
            arrayList.add("Stiletto19=" + uVar5);
        }
        u uVar6 = this.f35854f;
        if (uVar6 != null) {
            arrayList.add("Stiletto20=" + uVar6);
        }
        u uVar7 = this.f35855g;
        if (uVar7 != null) {
            arrayList.add("Stiletto20DarkStaggered=" + uVar7);
        }
        u uVar8 = this.f35858h;
        if (uVar8 != null) {
            arrayList.add("Stiletto20DarkSquare=" + uVar8);
        }
        u uVar9 = this.f35859i;
        if (uVar9 != null) {
            arrayList.add("Gemini19Square=" + uVar9);
        }
        u uVar10 = this.f35860j;
        if (uVar10 != null) {
            arrayList.add("Gemini19Staggered=" + uVar10);
        }
        u uVar11 = this.f35861k;
        if (uVar11 != null) {
            arrayList.add("Induction20Black=" + uVar11);
        }
        u uVar12 = this.f35862l;
        if (uVar12 != null) {
            arrayList.add("UberTurbine21Black=" + uVar12);
        }
        u uVar13 = this.f35863m;
        if (uVar13 != null) {
            arrayList.add("Apollo19=" + uVar13);
        }
        u uVar14 = this.f35864n;
        if (uVar14 != null) {
            arrayList.add("Apollo19CapKit=" + uVar14);
        }
        u uVar15 = this.f35865o;
        if (uVar15 != null) {
            arrayList.add("ZeroG19Gunpowder=" + uVar15);
        }
        u uVar16 = this.f35866p;
        if (uVar16 != null) {
            arrayList.add("PinwheelRefresh18=" + uVar16);
        }
        u uVar17 = this.f35869q;
        if (uVar17 != null) {
            arrayList.add("StilettoRefresh19=" + uVar17);
        }
        u uVar18 = this.f35870t;
        if (uVar18 != null) {
            arrayList.add("UberTurbine20Gunpowder=" + uVar18);
        }
        u uVar19 = this.f35871w;
        if (uVar19 != null) {
            arrayList.add("Cardenio19=" + uVar19);
        }
        u uVar20 = this.f35872x;
        if (uVar20 != null) {
            arrayList.add("NewTurbine22Black=" + uVar20);
        }
        u uVar21 = this.f35875y;
        if (uVar21 != null) {
            arrayList.add("Cyberstream=" + uVar21);
        }
        u uVar22 = this.f35878z;
        if (uVar22 != null) {
            arrayList.add("Arachnid21=" + uVar22);
        }
        u uVar23 = this.A;
        if (uVar23 != null) {
            arrayList.add("Default=" + uVar23);
        }
        u uVar24 = this.B;
        if (uVar24 != null) {
            arrayList.add("Base19=" + uVar24);
        }
        u uVar25 = this.C;
        if (uVar25 != null) {
            arrayList.add("Silver21=" + uVar25);
        }
        u uVar26 = this.E;
        if (uVar26 != null) {
            arrayList.add("Charcoal21=" + uVar26);
        }
        u uVar27 = this.F;
        if (uVar27 != null) {
            arrayList.add("Silver21Euro=" + uVar27);
        }
        u uVar28 = this.G;
        if (uVar28 != null) {
            arrayList.add("Aero19=" + uVar28);
        }
        u uVar29 = this.H;
        if (uVar29 != null) {
            arrayList.add("Charcoal21Euro=" + uVar29);
        }
        u uVar30 = this.K;
        if (uVar30 != null) {
            arrayList.add("Super21Gray=" + uVar30);
        }
        u uVar31 = this.L;
        if (uVar31 != null) {
            arrayList.add("Super21Silver=" + uVar31);
        }
        u uVar32 = this.O;
        if (uVar32 != null) {
            arrayList.add("Turbine19=" + uVar32);
        }
        u uVar33 = this.P;
        if (uVar33 != null) {
            arrayList.add("Turbine19Dark=" + uVar33);
        }
        u uVar34 = this.Q;
        if (uVar34 != null) {
            arrayList.add("AeroTurbine19=" + uVar34);
        }
        u uVar35 = this.R;
        if (uVar35 != null) {
            arrayList.add("AeroTurbine19Black=" + uVar35);
        }
        u uVar36 = this.T;
        if (uVar36 != null) {
            arrayList.add("Helix20=" + uVar36);
        }
        u uVar37 = this.Y;
        if (uVar37 != null) {
            arrayList.add("AeroTurbine20=" + uVar37);
        }
        u uVar38 = this.f35849b1;
        if (uVar38 != null) {
            arrayList.add("Turbine22=" + uVar38);
        }
        u uVar39 = this.f35856g1;
        if (uVar39 != null) {
            arrayList.add("Cyclone19Dark=" + uVar39);
        }
        u uVar40 = this.f35867p1;
        if (uVar40 != null) {
            arrayList.add("AeroTurbine20Dark=" + uVar40);
        }
        u uVar41 = this.f35873x1;
        if (uVar41 != null) {
            arrayList.add("Turbine22Dark=" + uVar41);
        }
        u uVar42 = this.f35876y1;
        if (uVar42 != null) {
            arrayList.add("Arachnid21Silver=" + uVar42);
        }
        u uVar43 = this.Q1;
        if (uVar43 != null) {
            arrayList.add("Arachnid21Black=" + uVar43);
        }
        u uVar44 = this.V1;
        if (uVar44 != null) {
            arrayList.add("Arachnid21Grey=" + uVar44);
        }
        u uVar45 = this.f35850b2;
        if (uVar45 != null) {
            arrayList.add("Slipstream20Carbon=" + uVar45);
        }
        u uVar46 = this.f35857g2;
        if (uVar46 != null) {
            arrayList.add("Slipstream20Dark=" + uVar46);
        }
        u uVar47 = this.f35868p2;
        if (uVar47 != null) {
            arrayList.add("Slipstream19Carbon=" + uVar47);
        }
        u uVar48 = this.f35874x2;
        if (uVar48 != null) {
            arrayList.add("TwinTurbine21Silver=" + uVar48);
        }
        u uVar49 = this.f35877y2;
        if (uVar49 != null) {
            arrayList.add("TwinTurbine21Carbon=" + uVar49);
        }
        u uVar50 = this.Q2;
        if (uVar50 != null) {
            arrayList.add("Tempest19SonicSilver=" + uVar50);
        }
        l02 = e0.l0(arrayList, ", ", "WheelType{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final u u() {
        return this.f35860j;
    }

    public final u v() {
        return this.T;
    }

    public final u w() {
        return this.f35861k;
    }

    public final u x() {
        return this.f35872x;
    }

    public final u y() {
        return this.f35851c;
    }

    public final u z() {
        return this.f35852d;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m649newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, u uVar11, u uVar12, u uVar13, u uVar14, u uVar15, u uVar16, u uVar17, u uVar18, u uVar19, u uVar20, u uVar21, u uVar22, u uVar23, u uVar24, u uVar25, u uVar26, u uVar27, u uVar28, u uVar29, u uVar30, u uVar31, u uVar32, u uVar33, u uVar34, u uVar35, u uVar36, u uVar37, u uVar38, u uVar39, u uVar40, u uVar41, u uVar42, u uVar43, u uVar44, u uVar45, u uVar46, u uVar47, u uVar48, u uVar49, u uVar50, okio.i unknownFields) {
        super(f35846i3, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35847a = uVar;
        this.f35848b = uVar2;
        this.f35851c = uVar3;
        this.f35852d = uVar4;
        this.f35853e = uVar5;
        this.f35854f = uVar6;
        this.f35855g = uVar7;
        this.f35858h = uVar8;
        this.f35859i = uVar9;
        this.f35860j = uVar10;
        this.f35861k = uVar11;
        this.f35862l = uVar12;
        this.f35863m = uVar13;
        this.f35864n = uVar14;
        this.f35865o = uVar15;
        this.f35866p = uVar16;
        this.f35869q = uVar17;
        this.f35870t = uVar18;
        this.f35871w = uVar19;
        this.f35872x = uVar20;
        this.f35875y = uVar21;
        this.f35878z = uVar22;
        this.A = uVar23;
        this.B = uVar24;
        this.C = uVar25;
        this.E = uVar26;
        this.F = uVar27;
        this.G = uVar28;
        this.H = uVar29;
        this.K = uVar30;
        this.L = uVar31;
        this.O = uVar32;
        this.P = uVar33;
        this.Q = uVar34;
        this.R = uVar35;
        this.T = uVar36;
        this.Y = uVar37;
        this.f35849b1 = uVar38;
        this.f35856g1 = uVar39;
        this.f35867p1 = uVar40;
        this.f35873x1 = uVar41;
        this.f35876y1 = uVar42;
        this.Q1 = uVar43;
        this.V1 = uVar44;
        this.f35850b2 = uVar45;
        this.f35857g2 = uVar46;
        this.f35868p2 = uVar47;
        this.f35874x2 = uVar48;
        this.f35877y2 = uVar49;
        this.Q2 = uVar50;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35, uVar36, uVar37, uVar38, uVar39, uVar40, uVar41, uVar42, uVar43, uVar44, uVar45, uVar46, uVar47, uVar48, uVar49, uVar50) <= 1)) {
            throw new IllegalArgumentException("At most one of Unknown, ZeroG20Gunpowder, Pinwheel18, Pinwheel18CapKit, Stiletto19, Stiletto20, Stiletto20DarkStaggered, Stiletto20DarkSquare, Gemini19Square, Gemini19Staggered, Induction20Black, UberTurbine21Black, Apollo19, Apollo19CapKit, ZeroG19Gunpowder, PinwheelRefresh18, StilettoRefresh19, UberTurbine20Gunpowder, Cardenio19, NewTurbine22Black, Cyberstream, Arachnid21, Default, Base19, Silver21, Charcoal21, Silver21Euro, Aero19, Charcoal21Euro, Super21Gray, Super21Silver, Turbine19, Turbine19Dark, AeroTurbine19, AeroTurbine19Black, Helix20, AeroTurbine20, Turbine22, Cyclone19Dark, AeroTurbine20Dark, Turbine22Dark, Arachnid21Silver, Arachnid21Black, Arachnid21Grey, Slipstream20Carbon, Slipstream20Dark, Slipstream19Carbon, TwinTurbine21Silver, TwinTurbine21Carbon, Tempest19SonicSilver may be non-null".toString());
        }
    }
}