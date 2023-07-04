package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class p0 extends com.squareup.wire.f {
    public static final ProtoAdapter<p0> R;
    @com.squareup.wire.q(adapter = "com.tesla.generated.signatures.SessionInfo#ADAPTER", tag = 40)
    private final xt.h A;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ToRCI#ADAPTER", tag = 41)
    private final i3 B;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.RCI_control_E#ADAPTER", tag = 42)
    private final f2 C;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEConfigCommand#ADAPTER", declaredName = "BLEConfigCommand", tag = 43)
    private final s E;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppDeviceInfoRequest_E#ADAPTER", tag = 44)
    private final h F;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Alert#ADAPTER", tag = 45)
    private final e G;
    @com.squareup.wire.q(adapter = "com.tesla.generated.errors.NominalError#ADAPTER", tag = 46)
    private final pt.b H;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.MISessionRequest#ADAPTER", declaredName = "MISessionRequest", tag = 47)
    private final m1 K;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.MISessionStop#ADAPTER", declaredName = "MISessionStop", tag = 48)
    private final o1 L;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPMSAlarms#ADAPTER", tag = 49)
    private final a3 O;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CertificateRead#ADAPTER", tag = 50)
    private final y P;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ChallengeCommand#ADAPTER", tag = 51)
    private final b0 Q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.VehicleStatus#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final w3 f8154a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SessionInfo#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final k2 f8155b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationRequest#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final m f8156c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CommandStatus#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final i0 f8157d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PersonalizationInformation#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final a2 f8158e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistInfo#ADAPTER", tag = 16)

    /* renamed from: f  reason: collision with root package name */
    private final z3 f8159f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistEntryInfo#ADAPTER", tag = 17)

    /* renamed from: g  reason: collision with root package name */
    private final y3 f8160g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.VehicleInfo#ADAPTER", tag = 18)

    /* renamed from: h  reason: collision with root package name */
    private final t3 f8161h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Capabilities#ADAPTER", tag = 19)

    /* renamed from: i  reason: collision with root package name */
    private final v f8162i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyStatusInfo#ADAPTER", tag = 21)

    /* renamed from: j  reason: collision with root package name */
    private final h1 f8163j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ActiveKey#ADAPTER", tag = 22)

    /* renamed from: k  reason: collision with root package name */
    private final c f8164k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UnknownKeyInfo#ADAPTER", tag = 23)

    /* renamed from: l  reason: collision with root package name */
    private final l3 f8165l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UpdaterCommand#ADAPTER", tag = 30)

    /* renamed from: m  reason: collision with root package name */
    private final o3 f8166m;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GenealogyRequest_E#ADAPTER", tag = 31)

    /* renamed from: n  reason: collision with root package name */
    private final r0 f8167n;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SleepManagerRequest#ADAPTER", tag = 32)

    /* renamed from: o  reason: collision with root package name */
    private final s2 f8168o;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.IMURequest_E#ADAPTER", tag = 33)

    /* renamed from: p  reason: collision with root package name */
    private final z0 f8169p;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NFCSERequest_E#ADAPTER", tag = 34)

    /* renamed from: q  reason: collision with root package name */
    private final u1 f8170q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPDataRequest_E#ADAPTER", tag = 35)

    /* renamed from: t  reason: collision with root package name */
    private final x2 f8171t;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ResetTrackerCommand_E#ADAPTER", tag = 36)

    /* renamed from: w  reason: collision with root package name */
    private final i2 f8172w;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPNotifyTrackerCommand_E#ADAPTER", tag = 37)

    /* renamed from: x  reason: collision with root package name */
    private final e3 f8173x;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SetTPConfigration#ADAPTER", tag = 38)

    /* renamed from: y  reason: collision with root package name */
    private final l2 f8174y;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UnsecureNotification#ADAPTER", tag = 39)

    /* renamed from: z  reason: collision with root package name */
    private final m3 f8175z;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<p0> {
        a(com.squareup.wire.b bVar, n00.d<p0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.FromVCSECMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public p0 mo28decode(com.squareup.wire.k reader) {
            long j11;
            w3 w3Var;
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            w3 w3Var2 = null;
            k2 k2Var = null;
            m mVar = null;
            i0 i0Var = null;
            a2 a2Var = null;
            z3 z3Var = null;
            y3 y3Var = null;
            t3 t3Var = null;
            v vVar = null;
            h1 h1Var = null;
            c cVar = null;
            o3 o3Var = null;
            r0 r0Var = null;
            s2 s2Var = null;
            z0 z0Var = null;
            u1 u1Var = null;
            x2 x2Var = null;
            i2 i2Var = null;
            e3 e3Var = null;
            l2 l2Var = null;
            m3 m3Var = null;
            xt.h hVar = null;
            i3 i3Var = null;
            f2 f2Var = null;
            s sVar = null;
            h hVar2 = null;
            e eVar = null;
            pt.b bVar = null;
            m1 m1Var = null;
            o1 o1Var = null;
            a3 a3Var = null;
            y yVar = null;
            b0 b0Var = null;
            l3 l3Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new p0(w3Var2, k2Var, mVar, i0Var, a2Var, z3Var, y3Var, t3Var, vVar, h1Var, cVar, l3Var, o3Var, r0Var, s2Var, z0Var, u1Var, x2Var, i2Var, e3Var, l2Var, m3Var, hVar, i3Var, f2Var, sVar, hVar2, eVar, bVar, m1Var, o1Var, a3Var, yVar, b0Var, reader.e(d11));
                }
                if (g11 == 1) {
                    j11 = d11;
                    w3 mo28decode = w3.f8240d.mo28decode(reader);
                    vz.b0 b0Var2 = vz.b0.f54756a;
                    w3Var2 = mo28decode;
                } else if (g11 == 2) {
                    j11 = d11;
                    k2 mo28decode2 = k2.f8079d.mo28decode(reader);
                    vz.b0 b0Var3 = vz.b0.f54756a;
                    k2Var = mo28decode2;
                } else if (g11 == 3) {
                    j11 = d11;
                    m mo28decode3 = m.f8093d.mo28decode(reader);
                    vz.b0 b0Var4 = vz.b0.f54756a;
                    mVar = mo28decode3;
                } else if (g11 == 4) {
                    j11 = d11;
                    i0 mo28decode4 = i0.f8045d.mo28decode(reader);
                    vz.b0 b0Var5 = vz.b0.f54756a;
                    i0Var = mo28decode4;
                } else if (g11 != 5) {
                    switch (g11) {
                        case 16:
                            j11 = d11;
                            z3 mo28decode5 = z3.f8300d.mo28decode(reader);
                            vz.b0 b0Var6 = vz.b0.f54756a;
                            z3Var = mo28decode5;
                            continue;
                        case 17:
                            j11 = d11;
                            y3 mo28decode6 = y3.f8284h.mo28decode(reader);
                            vz.b0 b0Var7 = vz.b0.f54756a;
                            y3Var = mo28decode6;
                            continue;
                        case 18:
                            j11 = d11;
                            t3 mo28decode7 = t3.f8210b.mo28decode(reader);
                            vz.b0 b0Var8 = vz.b0.f54756a;
                            t3Var = mo28decode7;
                            continue;
                        case 19:
                            j11 = d11;
                            v mo28decode8 = v.f8217c.mo28decode(reader);
                            vz.b0 b0Var9 = vz.b0.f54756a;
                            vVar = mo28decode8;
                            continue;
                        default:
                            switch (g11) {
                                case 21:
                                    j11 = d11;
                                    h1 mo28decode9 = h1.f8033b.mo28decode(reader);
                                    vz.b0 b0Var10 = vz.b0.f54756a;
                                    h1Var = mo28decode9;
                                    continue;
                                case 22:
                                    j11 = d11;
                                    c mo28decode10 = c.f7959b.mo28decode(reader);
                                    vz.b0 b0Var11 = vz.b0.f54756a;
                                    cVar = mo28decode10;
                                    continue;
                                case 23:
                                    j11 = d11;
                                    l3 mo28decode11 = l3.f8089d.mo28decode(reader);
                                    vz.b0 b0Var12 = vz.b0.f54756a;
                                    l3Var = mo28decode11;
                                    continue;
                                default:
                                    switch (g11) {
                                        case 30:
                                            j11 = d11;
                                            o3 mo28decode12 = o3.f8148f.mo28decode(reader);
                                            vz.b0 b0Var13 = vz.b0.f54756a;
                                            o3Var = mo28decode12;
                                            break;
                                        case 31:
                                            j11 = d11;
                                            w3Var = w3Var2;
                                            try {
                                                r0Var = r0.ADAPTER.mo28decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                                            }
                                            vz.b0 b0Var14 = vz.b0.f54756a;
                                            w3Var2 = w3Var;
                                            break;
                                        case 32:
                                            j11 = d11;
                                            s2 mo28decode13 = s2.f8203c.mo28decode(reader);
                                            vz.b0 b0Var15 = vz.b0.f54756a;
                                            s2Var = mo28decode13;
                                            break;
                                        case 33:
                                            j11 = d11;
                                            w3Var = w3Var2;
                                            try {
                                                z0Var = z0.ADAPTER.mo28decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                                            }
                                            vz.b0 b0Var16 = vz.b0.f54756a;
                                            w3Var2 = w3Var;
                                            break;
                                        case 34:
                                            j11 = d11;
                                            w3Var = w3Var2;
                                            try {
                                                u1Var = u1.ADAPTER.mo28decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                                            }
                                            vz.b0 b0Var17 = vz.b0.f54756a;
                                            w3Var2 = w3Var;
                                            break;
                                        case 35:
                                            j11 = d11;
                                            w3Var = w3Var2;
                                            try {
                                                x2Var = x2.ADAPTER.mo28decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e14.f20831a));
                                            }
                                            vz.b0 b0Var18 = vz.b0.f54756a;
                                            w3Var2 = w3Var;
                                            break;
                                        case 36:
                                            j11 = d11;
                                            w3Var = w3Var2;
                                            try {
                                                i2Var = i2.ADAPTER.mo28decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e15.f20831a));
                                            }
                                            vz.b0 b0Var19 = vz.b0.f54756a;
                                            w3Var2 = w3Var;
                                            break;
                                        case 37:
                                            j11 = d11;
                                            w3Var = w3Var2;
                                            try {
                                                e3Var = e3.ADAPTER.mo28decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e16.f20831a));
                                            }
                                            vz.b0 b0Var20 = vz.b0.f54756a;
                                            w3Var2 = w3Var;
                                            break;
                                        case 38:
                                            j11 = d11;
                                            l2 mo28decode14 = l2.f8086c.mo28decode(reader);
                                            vz.b0 b0Var21 = vz.b0.f54756a;
                                            l2Var = mo28decode14;
                                            break;
                                        case 39:
                                            j11 = d11;
                                            m3 mo28decode15 = m3.f8102c.mo28decode(reader);
                                            vz.b0 b0Var22 = vz.b0.f54756a;
                                            m3Var = mo28decode15;
                                            break;
                                        case 40:
                                            j11 = d11;
                                            xt.h mo28decode16 = xt.h.f57714f.mo28decode(reader);
                                            vz.b0 b0Var23 = vz.b0.f54756a;
                                            hVar = mo28decode16;
                                            break;
                                        case 41:
                                            j11 = d11;
                                            i3 mo28decode17 = i3.f8053d.mo28decode(reader);
                                            vz.b0 b0Var24 = vz.b0.f54756a;
                                            i3Var = mo28decode17;
                                            break;
                                        case 42:
                                            j11 = d11;
                                            w3Var = w3Var2;
                                            try {
                                                f2Var = f2.ADAPTER.mo28decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e17.f20831a));
                                            }
                                            vz.b0 b0Var25 = vz.b0.f54756a;
                                            w3Var2 = w3Var;
                                            break;
                                        case 43:
                                            j11 = d11;
                                            s mo28decode18 = s.f8197c.mo28decode(reader);
                                            vz.b0 b0Var26 = vz.b0.f54756a;
                                            sVar = mo28decode18;
                                            break;
                                        case 44:
                                            try {
                                                hVar2 = h.ADAPTER.mo28decode(reader);
                                                j11 = d11;
                                                w3Var = w3Var2;
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e18) {
                                                j11 = d11;
                                                w3Var = w3Var2;
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e18.f20831a));
                                            }
                                            vz.b0 b0Var27 = vz.b0.f54756a;
                                            w3Var2 = w3Var;
                                            break;
                                        case 45:
                                            e mo28decode19 = e.f7980b.mo28decode(reader);
                                            vz.b0 b0Var28 = vz.b0.f54756a;
                                            eVar = mo28decode19;
                                            j11 = d11;
                                            continue;
                                            continue;
                                        case 46:
                                            pt.b mo28decode20 = pt.b.f46915b.mo28decode(reader);
                                            vz.b0 b0Var29 = vz.b0.f54756a;
                                            bVar = mo28decode20;
                                            j11 = d11;
                                            continue;
                                            continue;
                                        case 47:
                                            m1 mo28decode21 = m1.f8097c.mo28decode(reader);
                                            vz.b0 b0Var30 = vz.b0.f54756a;
                                            m1Var = mo28decode21;
                                            j11 = d11;
                                            continue;
                                            continue;
                                        case 48:
                                            o1 mo28decode22 = o1.f8139b.mo28decode(reader);
                                            vz.b0 b0Var31 = vz.b0.f54756a;
                                            o1Var = mo28decode22;
                                            j11 = d11;
                                            continue;
                                            continue;
                                        case 49:
                                            a3 mo28decode23 = a3.f7924g.mo28decode(reader);
                                            vz.b0 b0Var32 = vz.b0.f54756a;
                                            a3Var = mo28decode23;
                                            j11 = d11;
                                            continue;
                                            continue;
                                        case 50:
                                            y mo28decode24 = y.f8274c.mo28decode(reader);
                                            vz.b0 b0Var33 = vz.b0.f54756a;
                                            yVar = mo28decode24;
                                            j11 = d11;
                                            continue;
                                            continue;
                                        case 51:
                                            b0 mo28decode25 = b0.f7934b.mo28decode(reader);
                                            vz.b0 b0Var34 = vz.b0.f54756a;
                                            b0Var = mo28decode25;
                                            j11 = d11;
                                            continue;
                                            continue;
                                        default:
                                            reader.m(g11);
                                            vz.b0 b0Var35 = vz.b0.f54756a;
                                            j11 = d11;
                                            continue;
                                            continue;
                                    }
                            }
                    }
                } else {
                    j11 = d11;
                    a2 mo28decode26 = a2.f7922b.mo28decode(reader);
                    vz.b0 b0Var36 = vz.b0.f54756a;
                    a2Var = mo28decode26;
                }
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, p0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            w3.f8240d.encodeWithTag(writer, 1, value.H());
            k2.f8079d.encodeWithTag(writer, 2, value.u());
            m.f8093d.encodeWithTag(writer, 3, value.f());
            i0.f8045d.encodeWithTag(writer, 4, value.k());
            a2.f7922b.encodeWithTag(writer, 5, value.r());
            z3.f8300d.encodeWithTag(writer, 16, value.J());
            y3.f8284h.encodeWithTag(writer, 17, value.I());
            t3.f8210b.encodeWithTag(writer, 18, value.G());
            v.f8217c.encodeWithTag(writer, 19, value.g());
            h1.f8033b.encodeWithTag(writer, 21, value.o());
            c.f7959b.encodeWithTag(writer, 22, value.c());
            l3.f8089d.encodeWithTag(writer, 23, value.A());
            o3.f8148f.encodeWithTag(writer, 30, value.C());
            r0.ADAPTER.encodeWithTag(writer, 31, value.m());
            s2.f8203c.encodeWithTag(writer, 32, value.w());
            z0.ADAPTER.encodeWithTag(writer, 33, value.n());
            u1.ADAPTER.encodeWithTag(writer, 34, value.p());
            x2.ADAPTER.encodeWithTag(writer, 35, value.x());
            i2.ADAPTER.encodeWithTag(writer, 36, value.t());
            e3.ADAPTER.encodeWithTag(writer, 37, value.y());
            l2.f8086c.encodeWithTag(writer, 38, value.v());
            m3.f8102c.encodeWithTag(writer, 39, value.B());
            xt.h.f57714f.encodeWithTag(writer, 40, value.l());
            i3.f8053d.encodeWithTag(writer, 41, value.z());
            f2.ADAPTER.encodeWithTag(writer, 42, value.s());
            s.f8197c.encodeWithTag(writer, 43, value.D());
            h.ADAPTER.encodeWithTag(writer, 44, value.e());
            e.f7980b.encodeWithTag(writer, 45, value.d());
            pt.b.f46915b.encodeWithTag(writer, 46, value.q());
            m1.f8097c.encodeWithTag(writer, 47, value.E());
            o1.f8139b.encodeWithTag(writer, 48, value.F());
            a3.f7924g.encodeWithTag(writer, 49, value.j());
            y.f8274c.encodeWithTag(writer, 50, value.h());
            b0.f7934b.encodeWithTag(writer, 51, value.i());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(p0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + w3.f8240d.encodedSizeWithTag(1, value.H()) + k2.f8079d.encodedSizeWithTag(2, value.u()) + m.f8093d.encodedSizeWithTag(3, value.f()) + i0.f8045d.encodedSizeWithTag(4, value.k()) + a2.f7922b.encodedSizeWithTag(5, value.r()) + z3.f8300d.encodedSizeWithTag(16, value.J()) + y3.f8284h.encodedSizeWithTag(17, value.I()) + t3.f8210b.encodedSizeWithTag(18, value.G()) + v.f8217c.encodedSizeWithTag(19, value.g()) + h1.f8033b.encodedSizeWithTag(21, value.o()) + c.f7959b.encodedSizeWithTag(22, value.c()) + l3.f8089d.encodedSizeWithTag(23, value.A()) + o3.f8148f.encodedSizeWithTag(30, value.C()) + r0.ADAPTER.encodedSizeWithTag(31, value.m()) + s2.f8203c.encodedSizeWithTag(32, value.w()) + z0.ADAPTER.encodedSizeWithTag(33, value.n()) + u1.ADAPTER.encodedSizeWithTag(34, value.p()) + x2.ADAPTER.encodedSizeWithTag(35, value.x()) + i2.ADAPTER.encodedSizeWithTag(36, value.t()) + e3.ADAPTER.encodedSizeWithTag(37, value.y()) + l2.f8086c.encodedSizeWithTag(38, value.v()) + m3.f8102c.encodedSizeWithTag(39, value.B()) + xt.h.f57714f.encodedSizeWithTag(40, value.l()) + i3.f8053d.encodedSizeWithTag(41, value.z()) + f2.ADAPTER.encodedSizeWithTag(42, value.s()) + s.f8197c.encodedSizeWithTag(43, value.D()) + h.ADAPTER.encodedSizeWithTag(44, value.e()) + e.f7980b.encodedSizeWithTag(45, value.d()) + pt.b.f46915b.encodedSizeWithTag(46, value.q()) + m1.f8097c.encodedSizeWithTag(47, value.E()) + o1.f8139b.encodedSizeWithTag(48, value.F()) + a3.f7924g.encodedSizeWithTag(49, value.j()) + y.f8274c.encodedSizeWithTag(50, value.h()) + b0.f7934b.encodedSizeWithTag(51, value.i());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public p0 redact(p0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            w3 H = value.H();
            w3 redact = H == null ? null : w3.f8240d.redact(H);
            k2 u11 = value.u();
            k2 redact2 = u11 == null ? null : k2.f8079d.redact(u11);
            m f11 = value.f();
            m redact3 = f11 == null ? null : m.f8093d.redact(f11);
            i0 k11 = value.k();
            i0 redact4 = k11 == null ? null : i0.f8045d.redact(k11);
            a2 r11 = value.r();
            a2 redact5 = r11 == null ? null : a2.f7922b.redact(r11);
            z3 J = value.J();
            z3 redact6 = J == null ? null : z3.f8300d.redact(J);
            y3 I = value.I();
            y3 redact7 = I == null ? null : y3.f8284h.redact(I);
            t3 G = value.G();
            t3 redact8 = G == null ? null : t3.f8210b.redact(G);
            v g11 = value.g();
            v redact9 = g11 == null ? null : v.f8217c.redact(g11);
            h1 o11 = value.o();
            h1 redact10 = o11 == null ? null : h1.f8033b.redact(o11);
            c c11 = value.c();
            c redact11 = c11 == null ? null : c.f7959b.redact(c11);
            l3 A = value.A();
            l3 redact12 = A == null ? null : l3.f8089d.redact(A);
            o3 C = value.C();
            o3 redact13 = C == null ? null : o3.f8148f.redact(C);
            s2 w11 = value.w();
            s2 redact14 = w11 == null ? null : s2.f8203c.redact(w11);
            l2 v11 = value.v();
            l2 redact15 = v11 == null ? null : l2.f8086c.redact(v11);
            m3 B = value.B();
            m3 redact16 = B == null ? null : m3.f8102c.redact(B);
            xt.h l11 = value.l();
            xt.h redact17 = l11 == null ? null : xt.h.f57714f.redact(l11);
            i3 z11 = value.z();
            i3 redact18 = z11 == null ? null : i3.f8053d.redact(z11);
            s D = value.D();
            s redact19 = D == null ? null : s.f8197c.redact(D);
            e d11 = value.d();
            e redact20 = d11 == null ? null : e.f7980b.redact(d11);
            pt.b q11 = value.q();
            pt.b redact21 = q11 == null ? null : pt.b.f46915b.redact(q11);
            m1 E = value.E();
            m1 redact22 = E == null ? null : m1.f8097c.redact(E);
            o1 F = value.F();
            o1 redact23 = F == null ? null : o1.f8139b.redact(F);
            a3 j11 = value.j();
            a3 redact24 = j11 == null ? null : a3.f7924g.redact(j11);
            y h11 = value.h();
            y redact25 = h11 == null ? null : y.f8274c.redact(h11);
            b0 i11 = value.i();
            return p0.b(value, redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, redact11, redact12, redact13, null, redact14, null, null, null, null, null, redact15, redact16, redact17, redact18, null, redact19, null, redact20, redact21, redact22, redact23, redact24, redact25, i11 == null ? null : b0.f7934b.redact(i11), okio.i.f42656d, 84910080, 0, null);
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
        R = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(p0.class), com.squareup.wire.o.PROTO_3);
    }

    public p0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    public /* synthetic */ p0(w3 w3Var, k2 k2Var, m mVar, i0 i0Var, a2 a2Var, z3 z3Var, y3 y3Var, t3 t3Var, v vVar, h1 h1Var, c cVar, l3 l3Var, o3 o3Var, r0 r0Var, s2 s2Var, z0 z0Var, u1 u1Var, x2 x2Var, i2 i2Var, e3 e3Var, l2 l2Var, m3 m3Var, xt.h hVar, i3 i3Var, f2 f2Var, s sVar, h hVar2, e eVar, pt.b bVar, m1 m1Var, o1 o1Var, a3 a3Var, y yVar, b0 b0Var, okio.i iVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : w3Var, (i11 & 2) != 0 ? null : k2Var, (i11 & 4) != 0 ? null : mVar, (i11 & 8) != 0 ? null : i0Var, (i11 & 16) != 0 ? null : a2Var, (i11 & 32) != 0 ? null : z3Var, (i11 & 64) != 0 ? null : y3Var, (i11 & 128) != 0 ? null : t3Var, (i11 & 256) != 0 ? null : vVar, (i11 & 512) != 0 ? null : h1Var, (i11 & 1024) != 0 ? null : cVar, (i11 & 2048) != 0 ? null : l3Var, (i11 & 4096) != 0 ? null : o3Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : r0Var, (i11 & 16384) != 0 ? null : s2Var, (i11 & 32768) != 0 ? null : z0Var, (i11 & 65536) != 0 ? null : u1Var, (i11 & 131072) != 0 ? null : x2Var, (i11 & 262144) != 0 ? null : i2Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : e3Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : l2Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : m3Var, (i11 & 4194304) != 0 ? null : hVar, (i11 & 8388608) != 0 ? null : i3Var, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : f2Var, (i11 & 33554432) != 0 ? null : sVar, (i11 & 67108864) != 0 ? null : hVar2, (i11 & 134217728) != 0 ? null : eVar, (i11 & 268435456) != 0 ? null : bVar, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? null : m1Var, (i11 & 1073741824) != 0 ? null : o1Var, (i11 & Integer.MIN_VALUE) != 0 ? null : a3Var, (i12 & 1) != 0 ? null : yVar, (i12 & 2) != 0 ? null : b0Var, (i12 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ p0 b(p0 p0Var, w3 w3Var, k2 k2Var, m mVar, i0 i0Var, a2 a2Var, z3 z3Var, y3 y3Var, t3 t3Var, v vVar, h1 h1Var, c cVar, l3 l3Var, o3 o3Var, r0 r0Var, s2 s2Var, z0 z0Var, u1 u1Var, x2 x2Var, i2 i2Var, e3 e3Var, l2 l2Var, m3 m3Var, xt.h hVar, i3 i3Var, f2 f2Var, s sVar, h hVar2, e eVar, pt.b bVar, m1 m1Var, o1 o1Var, a3 a3Var, y yVar, b0 b0Var, okio.i iVar, int i11, int i12, Object obj) {
        return p0Var.a((i11 & 1) != 0 ? p0Var.f8154a : w3Var, (i11 & 2) != 0 ? p0Var.f8155b : k2Var, (i11 & 4) != 0 ? p0Var.f8156c : mVar, (i11 & 8) != 0 ? p0Var.f8157d : i0Var, (i11 & 16) != 0 ? p0Var.f8158e : a2Var, (i11 & 32) != 0 ? p0Var.f8159f : z3Var, (i11 & 64) != 0 ? p0Var.f8160g : y3Var, (i11 & 128) != 0 ? p0Var.f8161h : t3Var, (i11 & 256) != 0 ? p0Var.f8162i : vVar, (i11 & 512) != 0 ? p0Var.f8163j : h1Var, (i11 & 1024) != 0 ? p0Var.f8164k : cVar, (i11 & 2048) != 0 ? p0Var.f8165l : l3Var, (i11 & 4096) != 0 ? p0Var.f8166m : o3Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? p0Var.f8167n : r0Var, (i11 & 16384) != 0 ? p0Var.f8168o : s2Var, (i11 & 32768) != 0 ? p0Var.f8169p : z0Var, (i11 & 65536) != 0 ? p0Var.f8170q : u1Var, (i11 & 131072) != 0 ? p0Var.f8171t : x2Var, (i11 & 262144) != 0 ? p0Var.f8172w : i2Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? p0Var.f8173x : e3Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? p0Var.f8174y : l2Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? p0Var.f8175z : m3Var, (i11 & 4194304) != 0 ? p0Var.A : hVar, (i11 & 8388608) != 0 ? p0Var.B : i3Var, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? p0Var.C : f2Var, (i11 & 33554432) != 0 ? p0Var.E : sVar, (i11 & 67108864) != 0 ? p0Var.F : hVar2, (i11 & 134217728) != 0 ? p0Var.G : eVar, (i11 & 268435456) != 0 ? p0Var.H : bVar, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? p0Var.K : m1Var, (i11 & 1073741824) != 0 ? p0Var.L : o1Var, (i11 & Integer.MIN_VALUE) != 0 ? p0Var.O : a3Var, (i12 & 1) != 0 ? p0Var.P : yVar, (i12 & 2) != 0 ? p0Var.Q : b0Var, (i12 & 4) != 0 ? p0Var.unknownFields() : iVar);
    }

    public final l3 A() {
        return this.f8165l;
    }

    public final m3 B() {
        return this.f8175z;
    }

    public final o3 C() {
        return this.f8166m;
    }

    public final s D() {
        return this.E;
    }

    public final m1 E() {
        return this.K;
    }

    public final o1 F() {
        return this.L;
    }

    public final t3 G() {
        return this.f8161h;
    }

    public final w3 H() {
        return this.f8154a;
    }

    public final y3 I() {
        return this.f8160g;
    }

    public final z3 J() {
        return this.f8159f;
    }

    public final p0 a(w3 w3Var, k2 k2Var, m mVar, i0 i0Var, a2 a2Var, z3 z3Var, y3 y3Var, t3 t3Var, v vVar, h1 h1Var, c cVar, l3 l3Var, o3 o3Var, r0 r0Var, s2 s2Var, z0 z0Var, u1 u1Var, x2 x2Var, i2 i2Var, e3 e3Var, l2 l2Var, m3 m3Var, xt.h hVar, i3 i3Var, f2 f2Var, s sVar, h hVar2, e eVar, pt.b bVar, m1 m1Var, o1 o1Var, a3 a3Var, y yVar, b0 b0Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new p0(w3Var, k2Var, mVar, i0Var, a2Var, z3Var, y3Var, t3Var, vVar, h1Var, cVar, l3Var, o3Var, r0Var, s2Var, z0Var, u1Var, x2Var, i2Var, e3Var, l2Var, m3Var, hVar, i3Var, f2Var, sVar, hVar2, eVar, bVar, m1Var, o1Var, a3Var, yVar, b0Var, unknownFields);
    }

    public final c c() {
        return this.f8164k;
    }

    public final e d() {
        return this.G;
    }

    public final h e() {
        return this.F;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), p0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8154a, p0Var.f8154a) && kotlin.jvm.internal.s.c(this.f8155b, p0Var.f8155b) && kotlin.jvm.internal.s.c(this.f8156c, p0Var.f8156c) && kotlin.jvm.internal.s.c(this.f8157d, p0Var.f8157d) && kotlin.jvm.internal.s.c(this.f8158e, p0Var.f8158e) && kotlin.jvm.internal.s.c(this.f8159f, p0Var.f8159f) && kotlin.jvm.internal.s.c(this.f8160g, p0Var.f8160g) && kotlin.jvm.internal.s.c(this.f8161h, p0Var.f8161h) && kotlin.jvm.internal.s.c(this.f8162i, p0Var.f8162i) && kotlin.jvm.internal.s.c(this.f8163j, p0Var.f8163j) && kotlin.jvm.internal.s.c(this.f8164k, p0Var.f8164k) && kotlin.jvm.internal.s.c(this.f8165l, p0Var.f8165l) && kotlin.jvm.internal.s.c(this.f8166m, p0Var.f8166m) && this.f8167n == p0Var.f8167n && kotlin.jvm.internal.s.c(this.f8168o, p0Var.f8168o) && this.f8169p == p0Var.f8169p && this.f8170q == p0Var.f8170q && this.f8171t == p0Var.f8171t && this.f8172w == p0Var.f8172w && this.f8173x == p0Var.f8173x && kotlin.jvm.internal.s.c(this.f8174y, p0Var.f8174y) && kotlin.jvm.internal.s.c(this.f8175z, p0Var.f8175z) && kotlin.jvm.internal.s.c(this.A, p0Var.A) && kotlin.jvm.internal.s.c(this.B, p0Var.B) && this.C == p0Var.C && kotlin.jvm.internal.s.c(this.E, p0Var.E) && this.F == p0Var.F && kotlin.jvm.internal.s.c(this.G, p0Var.G) && kotlin.jvm.internal.s.c(this.H, p0Var.H) && kotlin.jvm.internal.s.c(this.K, p0Var.K) && kotlin.jvm.internal.s.c(this.L, p0Var.L) && kotlin.jvm.internal.s.c(this.O, p0Var.O) && kotlin.jvm.internal.s.c(this.P, p0Var.P) && kotlin.jvm.internal.s.c(this.Q, p0Var.Q);
        }
        return false;
    }

    public final m f() {
        return this.f8156c;
    }

    public final v g() {
        return this.f8162i;
    }

    public final y h() {
        return this.P;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            w3 w3Var = this.f8154a;
            int hashCode2 = (hashCode + (w3Var != null ? w3Var.hashCode() : 0)) * 37;
            k2 k2Var = this.f8155b;
            int hashCode3 = (hashCode2 + (k2Var != null ? k2Var.hashCode() : 0)) * 37;
            m mVar = this.f8156c;
            int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 37;
            i0 i0Var = this.f8157d;
            int hashCode5 = (hashCode4 + (i0Var != null ? i0Var.hashCode() : 0)) * 37;
            a2 a2Var = this.f8158e;
            int hashCode6 = (hashCode5 + (a2Var != null ? a2Var.hashCode() : 0)) * 37;
            z3 z3Var = this.f8159f;
            int hashCode7 = (hashCode6 + (z3Var != null ? z3Var.hashCode() : 0)) * 37;
            y3 y3Var = this.f8160g;
            int hashCode8 = (hashCode7 + (y3Var != null ? y3Var.hashCode() : 0)) * 37;
            t3 t3Var = this.f8161h;
            int hashCode9 = (hashCode8 + (t3Var != null ? t3Var.hashCode() : 0)) * 37;
            v vVar = this.f8162i;
            int hashCode10 = (hashCode9 + (vVar != null ? vVar.hashCode() : 0)) * 37;
            h1 h1Var = this.f8163j;
            int hashCode11 = (hashCode10 + (h1Var != null ? h1Var.hashCode() : 0)) * 37;
            c cVar = this.f8164k;
            int hashCode12 = (hashCode11 + (cVar != null ? cVar.hashCode() : 0)) * 37;
            l3 l3Var = this.f8165l;
            int hashCode13 = (hashCode12 + (l3Var != null ? l3Var.hashCode() : 0)) * 37;
            o3 o3Var = this.f8166m;
            int hashCode14 = (hashCode13 + (o3Var != null ? o3Var.hashCode() : 0)) * 37;
            r0 r0Var = this.f8167n;
            int hashCode15 = (hashCode14 + (r0Var != null ? r0Var.hashCode() : 0)) * 37;
            s2 s2Var = this.f8168o;
            int hashCode16 = (hashCode15 + (s2Var != null ? s2Var.hashCode() : 0)) * 37;
            z0 z0Var = this.f8169p;
            int hashCode17 = (hashCode16 + (z0Var != null ? z0Var.hashCode() : 0)) * 37;
            u1 u1Var = this.f8170q;
            int hashCode18 = (hashCode17 + (u1Var != null ? u1Var.hashCode() : 0)) * 37;
            x2 x2Var = this.f8171t;
            int hashCode19 = (hashCode18 + (x2Var != null ? x2Var.hashCode() : 0)) * 37;
            i2 i2Var = this.f8172w;
            int hashCode20 = (hashCode19 + (i2Var != null ? i2Var.hashCode() : 0)) * 37;
            e3 e3Var = this.f8173x;
            int hashCode21 = (hashCode20 + (e3Var != null ? e3Var.hashCode() : 0)) * 37;
            l2 l2Var = this.f8174y;
            int hashCode22 = (hashCode21 + (l2Var != null ? l2Var.hashCode() : 0)) * 37;
            m3 m3Var = this.f8175z;
            int hashCode23 = (hashCode22 + (m3Var != null ? m3Var.hashCode() : 0)) * 37;
            xt.h hVar = this.A;
            int hashCode24 = (hashCode23 + (hVar != null ? hVar.hashCode() : 0)) * 37;
            i3 i3Var = this.B;
            int hashCode25 = (hashCode24 + (i3Var != null ? i3Var.hashCode() : 0)) * 37;
            f2 f2Var = this.C;
            int hashCode26 = (hashCode25 + (f2Var != null ? f2Var.hashCode() : 0)) * 37;
            s sVar = this.E;
            int hashCode27 = (hashCode26 + (sVar != null ? sVar.hashCode() : 0)) * 37;
            h hVar2 = this.F;
            int hashCode28 = (hashCode27 + (hVar2 != null ? hVar2.hashCode() : 0)) * 37;
            e eVar = this.G;
            int hashCode29 = (hashCode28 + (eVar != null ? eVar.hashCode() : 0)) * 37;
            pt.b bVar = this.H;
            int hashCode30 = (hashCode29 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            m1 m1Var = this.K;
            int hashCode31 = (hashCode30 + (m1Var != null ? m1Var.hashCode() : 0)) * 37;
            o1 o1Var = this.L;
            int hashCode32 = (hashCode31 + (o1Var != null ? o1Var.hashCode() : 0)) * 37;
            a3 a3Var = this.O;
            int hashCode33 = (hashCode32 + (a3Var != null ? a3Var.hashCode() : 0)) * 37;
            y yVar = this.P;
            int hashCode34 = (hashCode33 + (yVar != null ? yVar.hashCode() : 0)) * 37;
            b0 b0Var = this.Q;
            int hashCode35 = hashCode34 + (b0Var != null ? b0Var.hashCode() : 0);
            this.hashCode = hashCode35;
            return hashCode35;
        }
        return i11;
    }

    public final b0 i() {
        return this.Q;
    }

    public final a3 j() {
        return this.O;
    }

    public final i0 k() {
        return this.f8157d;
    }

    public final xt.h l() {
        return this.A;
    }

    public final r0 m() {
        return this.f8167n;
    }

    public final z0 n() {
        return this.f8169p;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m62newBuilder();
    }

    public final h1 o() {
        return this.f8163j;
    }

    public final u1 p() {
        return this.f8170q;
    }

    public final pt.b q() {
        return this.H;
    }

    public final a2 r() {
        return this.f8158e;
    }

    public final f2 s() {
        return this.C;
    }

    public final i2 t() {
        return this.f8172w;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        w3 w3Var = this.f8154a;
        if (w3Var != null) {
            arrayList.add("vehicleStatus=" + w3Var);
        }
        k2 k2Var = this.f8155b;
        if (k2Var != null) {
            arrayList.add("sessionInfo=" + k2Var);
        }
        m mVar = this.f8156c;
        if (mVar != null) {
            arrayList.add("authenticationRequest=" + mVar);
        }
        i0 i0Var = this.f8157d;
        if (i0Var != null) {
            arrayList.add("commandStatus=" + i0Var);
        }
        a2 a2Var = this.f8158e;
        if (a2Var != null) {
            arrayList.add("personalizationInformation=" + a2Var);
        }
        z3 z3Var = this.f8159f;
        if (z3Var != null) {
            arrayList.add("whitelistInfo=" + z3Var);
        }
        y3 y3Var = this.f8160g;
        if (y3Var != null) {
            arrayList.add("whitelistEntryInfo=" + y3Var);
        }
        t3 t3Var = this.f8161h;
        if (t3Var != null) {
            arrayList.add("vehicleInfo=" + t3Var);
        }
        v vVar = this.f8162i;
        if (vVar != null) {
            arrayList.add("capabilities=" + vVar);
        }
        h1 h1Var = this.f8163j;
        if (h1Var != null) {
            arrayList.add("keyStatusInfo=" + h1Var);
        }
        c cVar = this.f8164k;
        if (cVar != null) {
            arrayList.add("activeKey=" + cVar);
        }
        l3 l3Var = this.f8165l;
        if (l3Var != null) {
            arrayList.add("unknownKeyInfo=" + l3Var);
        }
        o3 o3Var = this.f8166m;
        if (o3Var != null) {
            arrayList.add("updaterCommand=" + o3Var);
        }
        r0 r0Var = this.f8167n;
        if (r0Var != null) {
            arrayList.add("genealogyRequest=" + r0Var);
        }
        s2 s2Var = this.f8168o;
        if (s2Var != null) {
            arrayList.add("sleepManagerRequest=" + s2Var);
        }
        z0 z0Var = this.f8169p;
        if (z0Var != null) {
            arrayList.add("imuRequest=" + z0Var);
        }
        u1 u1Var = this.f8170q;
        if (u1Var != null) {
            arrayList.add("nfcseRequest=" + u1Var);
        }
        x2 x2Var = this.f8171t;
        if (x2Var != null) {
            arrayList.add("TPDataRequest=" + x2Var);
        }
        i2 i2Var = this.f8172w;
        if (i2Var != null) {
            arrayList.add("resetTrackerCommand=" + i2Var);
        }
        e3 e3Var = this.f8173x;
        if (e3Var != null) {
            arrayList.add("TPNotifyTrackerCommand=" + e3Var);
        }
        l2 l2Var = this.f8174y;
        if (l2Var != null) {
            arrayList.add("setTPConfiguration=" + l2Var);
        }
        m3 m3Var = this.f8175z;
        if (m3Var != null) {
            arrayList.add("unsecureNotification=" + m3Var);
        }
        xt.h hVar = this.A;
        if (hVar != null) {
            arrayList.add("epochSessionInfo=" + hVar);
        }
        i3 i3Var = this.B;
        if (i3Var != null) {
            arrayList.add("toRCICommand=" + i3Var);
        }
        f2 f2Var = this.C;
        if (f2Var != null) {
            arrayList.add("rciControl=" + f2Var);
        }
        s sVar = this.E;
        if (sVar != null) {
            arrayList.add("VCSEC_BLEConfigCommand=" + sVar);
        }
        h hVar2 = this.F;
        if (hVar2 != null) {
            arrayList.add("appDeviceInfoRequest=" + hVar2);
        }
        e eVar = this.G;
        if (eVar != null) {
            arrayList.add("alert=" + eVar);
        }
        pt.b bVar = this.H;
        if (bVar != null) {
            arrayList.add("nominalError=" + bVar);
        }
        m1 m1Var = this.K;
        if (m1Var != null) {
            arrayList.add("VCSEC_MISessionRequest=" + m1Var);
        }
        o1 o1Var = this.L;
        if (o1Var != null) {
            arrayList.add("VCSEC_MISessionStop=" + o1Var);
        }
        a3 a3Var = this.O;
        if (a3Var != null) {
            arrayList.add("clearTPMSAlarms=" + a3Var);
        }
        y yVar = this.P;
        if (yVar != null) {
            arrayList.add("certificateRead=" + yVar);
        }
        b0 b0Var = this.Q;
        if (b0Var != null) {
            arrayList.add("challengeCommand=" + b0Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "FromVCSECMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final k2 u() {
        return this.f8155b;
    }

    public final l2 v() {
        return this.f8174y;
    }

    public final s2 w() {
        return this.f8168o;
    }

    public final x2 x() {
        return this.f8171t;
    }

    public final e3 y() {
        return this.f8173x;
    }

    public final i3 z() {
        return this.B;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m62newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(w3 w3Var, k2 k2Var, m mVar, i0 i0Var, a2 a2Var, z3 z3Var, y3 y3Var, t3 t3Var, v vVar, h1 h1Var, c cVar, l3 l3Var, o3 o3Var, r0 r0Var, s2 s2Var, z0 z0Var, u1 u1Var, x2 x2Var, i2 i2Var, e3 e3Var, l2 l2Var, m3 m3Var, xt.h hVar, i3 i3Var, f2 f2Var, s sVar, h hVar2, e eVar, pt.b bVar, m1 m1Var, o1 o1Var, a3 a3Var, y yVar, b0 b0Var, okio.i unknownFields) {
        super(R, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8154a = w3Var;
        this.f8155b = k2Var;
        this.f8156c = mVar;
        this.f8157d = i0Var;
        this.f8158e = a2Var;
        this.f8159f = z3Var;
        this.f8160g = y3Var;
        this.f8161h = t3Var;
        this.f8162i = vVar;
        this.f8163j = h1Var;
        this.f8164k = cVar;
        this.f8165l = l3Var;
        this.f8166m = o3Var;
        this.f8167n = r0Var;
        this.f8168o = s2Var;
        this.f8169p = z0Var;
        this.f8170q = u1Var;
        this.f8171t = x2Var;
        this.f8172w = i2Var;
        this.f8173x = e3Var;
        this.f8174y = l2Var;
        this.f8175z = m3Var;
        this.A = hVar;
        this.B = i3Var;
        this.C = f2Var;
        this.E = sVar;
        this.F = hVar2;
        this.G = eVar;
        this.H = bVar;
        this.K = m1Var;
        this.L = o1Var;
        this.O = a3Var;
        this.P = yVar;
        this.Q = b0Var;
        if (!(mr.d.e(w3Var, k2Var, mVar, i0Var, a2Var, z3Var, y3Var, t3Var, vVar, h1Var, cVar, l3Var, o3Var, r0Var, s2Var, z0Var, u1Var, x2Var, i2Var, e3Var, l2Var, m3Var, hVar, i3Var, f2Var, sVar, hVar2, eVar, bVar, m1Var, o1Var, a3Var, yVar, b0Var) <= 1)) {
            throw new IllegalArgumentException("At most one of vehicleStatus, sessionInfo, authenticationRequest, commandStatus, personalizationInformation, whitelistInfo, whitelistEntryInfo, vehicleInfo, capabilities, keyStatusInfo, activeKey, unknownKeyInfo, updaterCommand, genealogyRequest, sleepManagerRequest, imuRequest, nfcseRequest, TPDataRequest, resetTrackerCommand, TPNotifyTrackerCommand, setTPConfiguration, unsecureNotification, epochSessionInfo, toRCICommand, rciControl, VCSEC_BLEConfigCommand, appDeviceInfoRequest, alert, nominalError, VCSEC_MISessionRequest, VCSEC_MISessionStop, clearTPMSAlarms, certificateRead, challengeCommand may be non-null".toString());
        }
    }
}