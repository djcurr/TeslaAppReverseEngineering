package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class n3 extends com.squareup.wire.f {
    public static final ProtoAdapter<n3> Y;
    @com.squareup.wire.q(adapter = "com.tesla.generated.signatures.GetSessionInfoRequest#ADAPTER", tag = 36)
    private final xt.b A;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FromRCI#ADAPTER", tag = 37)
    private final o0 B;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEConfigAll#ADAPTER", declaredName = "BLEConfigAll", tag = 38)
    private final r C;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.DeviceMotion#ADAPTER", tag = 39)
    private final l0 E;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppDeviceInfo#ADAPTER", tag = 40)
    private final g F;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GetReaderKey#ADAPTER", tag = 41)
    private final v0 G;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.MISessionResponse#ADAPTER", declaredName = "MISessionResponse", tag = 42)
    private final n1 H;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.MISessionStopped#ADAPTER", declaredName = "MISessionStopped", tag = 43)
    private final p1 K;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AccelData#ADAPTER", tag = 44)
    private final bu.b L;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPMSAlarms#ADAPTER", declaredName = "TPMSAlarms", tag = 45)
    private final a3 O;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CertificateResponse#ADAPTER", tag = 46)
    private final z P;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ChallengeResponse#ADAPTER", tag = 47)
    private final c0 Q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKeyResponse#ADAPTER", tag = 48)
    private final c2 R;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ASICSPIRead#ADAPTER", declaredName = "ASICSPIRead", tag = 49)
    private final bu.a T;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PersonalizationInformation#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 25)

    /* renamed from: a  reason: collision with root package name */
    private final a2 f8111a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.InformationRequest#ADAPTER", declaredName = "InformationRequest", tag = 1)

    /* renamed from: b  reason: collision with root package name */
    private final b1 f8112b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.RKEAction_E#ADAPTER", tag = 2)

    /* renamed from: c  reason: collision with root package name */
    private final g2 f8113c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationResponse#ADAPTER", tag = 3)

    /* renamed from: d  reason: collision with root package name */
    private final o f8114d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveRequest#ADAPTER", tag = 4)

    /* renamed from: e  reason: collision with root package name */
    private final d0 f8115e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPAdv#ADAPTER", declaredName = "TPAdv", tag = 5)

    /* renamed from: f  reason: collision with root package name */
    private final v2 f8116f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation#ADAPTER", declaredName = "WhitelistOperation", tag = 16)

    /* renamed from: g  reason: collision with root package name */
    private final b4 f8117g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UpdaterResponse#ADAPTER", tag = 20)

    /* renamed from: h  reason: collision with root package name */
    private final q3 f8118h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GenealogyResponse#ADAPTER", tag = 21)

    /* renamed from: i  reason: collision with root package name */
    private final s0 f8119i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyMetadata#ADAPTER", tag = 22)

    /* renamed from: j  reason: collision with root package name */
    private final f1 f8120j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyfobInfo#ADAPTER", tag = 23)

    /* renamed from: k  reason: collision with root package name */
    private final i1 f8121k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.IMUState_E#ADAPTER", tag = 24)

    /* renamed from: l  reason: collision with root package name */
    private final a1 f8122l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NFCSEState#ADAPTER", tag = 26)

    /* renamed from: m  reason: collision with root package name */
    private final w1 f8123m;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SleepManagerStats#ADAPTER", tag = 27)

    /* renamed from: n  reason: collision with root package name */
    private final t2 f8124n;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPData#ADAPTER", declaredName = "TPData", tag = 28)

    /* renamed from: o  reason: collision with root package name */
    private final w2 f8125o;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPWheelUnitInfo#ADAPTER", declaredName = "TPWheelUnitInfo", tag = 29)

    /* renamed from: p  reason: collision with root package name */
    private final h3 f8126p;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ResetTrackerStats#ADAPTER", tag = 30)

    /* renamed from: q  reason: collision with root package name */
    private final j2 f8127q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPNotifyTrackerStats#ADAPTER", declaredName = "TPNotifyTrackerStats", tag = 31)

    /* renamed from: t  reason: collision with root package name */
    private final f3 f8128t;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPNewSensorData#ADAPTER", declaredName = "TPNewSensorData", tag = 32)

    /* renamed from: w  reason: collision with root package name */
    private final c3 f8129w;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPLRDetection#ADAPTER", declaredName = "TPLRDetection", tag = 33)

    /* renamed from: x  reason: collision with root package name */
    private final y2 f8130x;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ConnectionMetrics#ADAPTER", tag = 34)

    /* renamed from: y  reason: collision with root package name */
    private final j0 f8131y;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Activity_E#ADAPTER", tag = 35)

    /* renamed from: z  reason: collision with root package name */
    private final d f8132z;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<n3> {
        a(com.squareup.wire.b bVar, n00.d<n3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.UnsignedMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public n3 mo28decode(com.squareup.wire.k reader) {
            long j11;
            a2 a2Var;
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            a2 a2Var2 = null;
            b1 b1Var = null;
            g2 g2Var = null;
            o oVar = null;
            d0 d0Var = null;
            v2 v2Var = null;
            b4 b4Var = null;
            q3 q3Var = null;
            s0 s0Var = null;
            f1 f1Var = null;
            i1 i1Var = null;
            w1 w1Var = null;
            t2 t2Var = null;
            w2 w2Var = null;
            h3 h3Var = null;
            j2 j2Var = null;
            f3 f3Var = null;
            c3 c3Var = null;
            y2 y2Var = null;
            j0 j0Var = null;
            d dVar = null;
            xt.b bVar = null;
            o0 o0Var = null;
            r rVar = null;
            l0 l0Var = null;
            g gVar = null;
            v0 v0Var = null;
            n1 n1Var = null;
            p1 p1Var = null;
            bu.b bVar2 = null;
            a3 a3Var = null;
            z zVar = null;
            c0 c0Var = null;
            c2 c2Var = null;
            bu.a aVar = null;
            a1 a1Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new n3(a2Var2, b1Var, g2Var, oVar, d0Var, v2Var, b4Var, q3Var, s0Var, f1Var, i1Var, a1Var, w1Var, t2Var, w2Var, h3Var, j2Var, f3Var, c3Var, y2Var, j0Var, dVar, bVar, o0Var, rVar, l0Var, gVar, v0Var, n1Var, p1Var, bVar2, a3Var, zVar, c0Var, c2Var, aVar, reader.e(d11));
                }
                if (g11 != 1) {
                    if (g11 == 2) {
                        j11 = d11;
                        a2Var = a2Var2;
                        try {
                            g2Var = g2.ADAPTER.mo28decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                        }
                    } else if (g11 == 3) {
                        j11 = d11;
                        oVar = o.f8133d.mo28decode(reader);
                    } else if (g11 == 4) {
                        j11 = d11;
                        d0Var = d0.f7968h.mo28decode(reader);
                    } else if (g11 == 5) {
                        j11 = d11;
                        v2Var = v2.f8222g.mo28decode(reader);
                    } else if (g11 != 16) {
                        switch (g11) {
                            case 20:
                                j11 = d11;
                                q3Var = q3.f8187c.mo28decode(reader);
                                break;
                            case 21:
                                j11 = d11;
                                s0Var = s0.f8200c.mo28decode(reader);
                                break;
                            case 22:
                                j11 = d11;
                                f1Var = f1.f7994b.mo28decode(reader);
                                break;
                            case 23:
                                j11 = d11;
                                i1Var = i1.f8049d.mo28decode(reader);
                                break;
                            case 24:
                                j11 = d11;
                                a2Var = a2Var2;
                                try {
                                    a1Var = a1.ADAPTER.mo28decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                    reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                                    break;
                                }
                            case 25:
                                j11 = d11;
                                a2Var2 = a2.f7922b.mo28decode(reader);
                                break;
                            case 26:
                                j11 = d11;
                                w1Var = w1.f8231f.mo28decode(reader);
                                break;
                            case 27:
                                j11 = d11;
                                t2Var = t2.f8206d.mo28decode(reader);
                                break;
                            case 28:
                                j11 = d11;
                                w2Var = w2.f8237c.mo28decode(reader);
                                break;
                            case 29:
                                j11 = d11;
                                h3Var = h3.f8041d.mo28decode(reader);
                                break;
                            case 30:
                                j11 = d11;
                                j2Var = j2.f8061k.mo28decode(reader);
                                break;
                            case 31:
                                j11 = d11;
                                f3Var = f3.f7996h.mo28decode(reader);
                                break;
                            case 32:
                                j11 = d11;
                                c3Var = c3.f7966b.mo28decode(reader);
                                break;
                            case 33:
                                j11 = d11;
                                y2Var = y2.f8277g.mo28decode(reader);
                                break;
                            case 34:
                                j11 = d11;
                                j0Var = j0.f8057d.mo28decode(reader);
                                break;
                            case 35:
                                try {
                                    dVar = d.ADAPTER.mo28decode(reader);
                                    j11 = d11;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                    j11 = d11;
                                    a2Var = a2Var2;
                                    reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                                    break;
                                }
                            case 36:
                                bVar = xt.b.f57697b.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 37:
                                o0Var = o0.f8137b.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 38:
                                rVar = r.f8190c.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 39:
                                l0Var = l0.f8083c.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 40:
                                gVar = g.f8004d.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 41:
                                v0Var = v0.f8220b.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 42:
                                n1Var = n1.f8107d.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 43:
                                p1Var = p1.f8176b.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 44:
                                bVar2 = bu.b.f7931c.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 45:
                                a3Var = a3.f7924g.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 46:
                                zVar = z.f8292c.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 47:
                                c0Var = c0.f7961b.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 48:
                                c2Var = c2.f7963c.mo28decode(reader);
                                j11 = d11;
                                break;
                            case 49:
                                aVar = bu.a.f7918d.mo28decode(reader);
                                j11 = d11;
                                break;
                            default:
                                reader.m(g11);
                                j11 = d11;
                                a2Var = a2Var2;
                                break;
                        }
                    } else {
                        j11 = d11;
                        b4Var = b4.f7947l.mo28decode(reader);
                    }
                    a2Var2 = a2Var;
                } else {
                    j11 = d11;
                    b1Var = b1.f7936e.mo28decode(reader);
                }
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, n3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.t() != null) {
                a2.f7922b.encodeWithTag(writer, 25, value.t());
            }
            b1.f7936e.encodeWithTag(writer, 1, value.B());
            g2.ADAPTER.encodeWithTag(writer, 2, value.v());
            o.f8133d.encodeWithTag(writer, 3, value.e());
            d0.f7968h.encodeWithTag(writer, 4, value.h());
            v2.f8222g.encodeWithTag(writer, 5, value.E());
            b4.f7947l.encodeWithTag(writer, 16, value.L());
            q3.f8187c.encodeWithTag(writer, 20, value.y());
            s0.f8200c.encodeWithTag(writer, 21, value.m());
            f1.f7994b.encodeWithTag(writer, 22, value.x());
            i1.f8049d.encodeWithTag(writer, 23, value.q());
            a1.ADAPTER.encodeWithTag(writer, 24, value.p());
            w1.f8231f.encodeWithTag(writer, 26, value.s());
            t2.f8206d.encodeWithTag(writer, 27, value.r());
            w2.f8237c.encodeWithTag(writer, 28, value.F());
            h3.f8041d.encodeWithTag(writer, 29, value.K());
            j2.f8061k.encodeWithTag(writer, 30, value.w());
            f3.f7996h.encodeWithTag(writer, 31, value.J());
            c3.f7966b.encodeWithTag(writer, 32, value.I());
            y2.f8277g.encodeWithTag(writer, 33, value.G());
            j0.f8057d.encodeWithTag(writer, 34, value.i());
            d.ADAPTER.encodeWithTag(writer, 35, value.j());
            xt.b.f57697b.encodeWithTag(writer, 36, value.n());
            o0.f8137b.encodeWithTag(writer, 37, value.l());
            r.f8190c.encodeWithTag(writer, 38, value.A());
            l0.f8083c.encodeWithTag(writer, 39, value.k());
            g.f8004d.encodeWithTag(writer, 40, value.d());
            v0.f8220b.encodeWithTag(writer, 41, value.o());
            n1.f8107d.encodeWithTag(writer, 42, value.C());
            p1.f8176b.encodeWithTag(writer, 43, value.D());
            bu.b.f7931c.encodeWithTag(writer, 44, value.c());
            a3.f7924g.encodeWithTag(writer, 45, value.H());
            z.f8292c.encodeWithTag(writer, 46, value.f());
            c0.f7961b.encodeWithTag(writer, 47, value.g());
            c2.f7963c.encodeWithTag(writer, 48, value.u());
            bu.a.f7918d.encodeWithTag(writer, 49, value.z());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(n3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.t() != null) {
                z11 += a2.f7922b.encodedSizeWithTag(25, value.t());
            }
            return z11 + b1.f7936e.encodedSizeWithTag(1, value.B()) + g2.ADAPTER.encodedSizeWithTag(2, value.v()) + o.f8133d.encodedSizeWithTag(3, value.e()) + d0.f7968h.encodedSizeWithTag(4, value.h()) + v2.f8222g.encodedSizeWithTag(5, value.E()) + b4.f7947l.encodedSizeWithTag(16, value.L()) + q3.f8187c.encodedSizeWithTag(20, value.y()) + s0.f8200c.encodedSizeWithTag(21, value.m()) + f1.f7994b.encodedSizeWithTag(22, value.x()) + i1.f8049d.encodedSizeWithTag(23, value.q()) + a1.ADAPTER.encodedSizeWithTag(24, value.p()) + w1.f8231f.encodedSizeWithTag(26, value.s()) + t2.f8206d.encodedSizeWithTag(27, value.r()) + w2.f8237c.encodedSizeWithTag(28, value.F()) + h3.f8041d.encodedSizeWithTag(29, value.K()) + j2.f8061k.encodedSizeWithTag(30, value.w()) + f3.f7996h.encodedSizeWithTag(31, value.J()) + c3.f7966b.encodedSizeWithTag(32, value.I()) + y2.f8277g.encodedSizeWithTag(33, value.G()) + j0.f8057d.encodedSizeWithTag(34, value.i()) + d.ADAPTER.encodedSizeWithTag(35, value.j()) + xt.b.f57697b.encodedSizeWithTag(36, value.n()) + o0.f8137b.encodedSizeWithTag(37, value.l()) + r.f8190c.encodedSizeWithTag(38, value.A()) + l0.f8083c.encodedSizeWithTag(39, value.k()) + g.f8004d.encodedSizeWithTag(40, value.d()) + v0.f8220b.encodedSizeWithTag(41, value.o()) + n1.f8107d.encodedSizeWithTag(42, value.C()) + p1.f8176b.encodedSizeWithTag(43, value.D()) + bu.b.f7931c.encodedSizeWithTag(44, value.c()) + a3.f7924g.encodedSizeWithTag(45, value.H()) + z.f8292c.encodedSizeWithTag(46, value.f()) + c0.f7961b.encodedSizeWithTag(47, value.g()) + c2.f7963c.encodedSizeWithTag(48, value.u()) + bu.a.f7918d.encodedSizeWithTag(49, value.z());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public n3 redact(n3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            a2 t11 = value.t();
            a2 redact = t11 == null ? null : a2.f7922b.redact(t11);
            b1 B = value.B();
            b1 redact2 = B == null ? null : b1.f7936e.redact(B);
            o e11 = value.e();
            o redact3 = e11 == null ? null : o.f8133d.redact(e11);
            d0 h11 = value.h();
            d0 redact4 = h11 == null ? null : d0.f7968h.redact(h11);
            v2 E = value.E();
            v2 redact5 = E == null ? null : v2.f8222g.redact(E);
            b4 L = value.L();
            b4 redact6 = L == null ? null : b4.f7947l.redact(L);
            q3 y11 = value.y();
            q3 redact7 = y11 == null ? null : q3.f8187c.redact(y11);
            s0 m11 = value.m();
            s0 redact8 = m11 == null ? null : s0.f8200c.redact(m11);
            f1 x11 = value.x();
            f1 redact9 = x11 == null ? null : f1.f7994b.redact(x11);
            i1 q11 = value.q();
            i1 redact10 = q11 == null ? null : i1.f8049d.redact(q11);
            w1 s11 = value.s();
            w1 redact11 = s11 == null ? null : w1.f8231f.redact(s11);
            t2 r11 = value.r();
            t2 redact12 = r11 == null ? null : t2.f8206d.redact(r11);
            w2 F = value.F();
            w2 redact13 = F == null ? null : w2.f8237c.redact(F);
            h3 K = value.K();
            h3 redact14 = K == null ? null : h3.f8041d.redact(K);
            j2 w11 = value.w();
            j2 redact15 = w11 == null ? null : j2.f8061k.redact(w11);
            f3 J = value.J();
            f3 redact16 = J == null ? null : f3.f7996h.redact(J);
            c3 I = value.I();
            c3 redact17 = I == null ? null : c3.f7966b.redact(I);
            y2 G = value.G();
            y2 redact18 = G == null ? null : y2.f8277g.redact(G);
            j0 i11 = value.i();
            j0 redact19 = i11 == null ? null : j0.f8057d.redact(i11);
            xt.b n11 = value.n();
            xt.b redact20 = n11 == null ? null : xt.b.f57697b.redact(n11);
            o0 l11 = value.l();
            o0 redact21 = l11 == null ? null : o0.f8137b.redact(l11);
            r A = value.A();
            r redact22 = A == null ? null : r.f8190c.redact(A);
            l0 k11 = value.k();
            l0 redact23 = k11 == null ? null : l0.f8083c.redact(k11);
            g d11 = value.d();
            g redact24 = d11 == null ? null : g.f8004d.redact(d11);
            v0 o11 = value.o();
            v0 redact25 = o11 == null ? null : v0.f8220b.redact(o11);
            n1 C = value.C();
            n1 redact26 = C == null ? null : n1.f8107d.redact(C);
            p1 D = value.D();
            p1 redact27 = D == null ? null : p1.f8176b.redact(D);
            bu.b c11 = value.c();
            bu.b redact28 = c11 == null ? null : bu.b.f7931c.redact(c11);
            a3 H = value.H();
            a3 redact29 = H == null ? null : a3.f7924g.redact(H);
            z f11 = value.f();
            z redact30 = f11 == null ? null : z.f8292c.redact(f11);
            c0 g11 = value.g();
            c0 redact31 = g11 == null ? null : c0.f7961b.redact(g11);
            c2 u11 = value.u();
            c2 redact32 = u11 == null ? null : c2.f7963c.redact(u11);
            bu.a z11 = value.z();
            return n3.b(value, redact, redact2, null, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, null, redact11, redact12, redact13, redact14, redact15, redact16, redact17, redact18, redact19, null, redact20, redact21, redact22, redact23, redact24, redact25, redact26, redact27, redact28, redact29, redact30, redact31, redact32, z11 == null ? null : bu.a.f7918d.redact(z11), okio.i.f42656d, 2099204, 0, null);
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
        Y = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(n3.class), com.squareup.wire.o.PROTO_3);
    }

    public n3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, null);
    }

    public /* synthetic */ n3(a2 a2Var, b1 b1Var, g2 g2Var, o oVar, d0 d0Var, v2 v2Var, b4 b4Var, q3 q3Var, s0 s0Var, f1 f1Var, i1 i1Var, a1 a1Var, w1 w1Var, t2 t2Var, w2 w2Var, h3 h3Var, j2 j2Var, f3 f3Var, c3 c3Var, y2 y2Var, j0 j0Var, d dVar, xt.b bVar, o0 o0Var, r rVar, l0 l0Var, g gVar, v0 v0Var, n1 n1Var, p1 p1Var, bu.b bVar2, a3 a3Var, z zVar, c0 c0Var, c2 c2Var, bu.a aVar, okio.i iVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : a2Var, (i11 & 2) != 0 ? null : b1Var, (i11 & 4) != 0 ? null : g2Var, (i11 & 8) != 0 ? null : oVar, (i11 & 16) != 0 ? null : d0Var, (i11 & 32) != 0 ? null : v2Var, (i11 & 64) != 0 ? null : b4Var, (i11 & 128) != 0 ? null : q3Var, (i11 & 256) != 0 ? null : s0Var, (i11 & 512) != 0 ? null : f1Var, (i11 & 1024) != 0 ? null : i1Var, (i11 & 2048) != 0 ? null : a1Var, (i11 & 4096) != 0 ? null : w1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : t2Var, (i11 & 16384) != 0 ? null : w2Var, (i11 & 32768) != 0 ? null : h3Var, (i11 & 65536) != 0 ? null : j2Var, (i11 & 131072) != 0 ? null : f3Var, (i11 & 262144) != 0 ? null : c3Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : y2Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : j0Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : dVar, (i11 & 4194304) != 0 ? null : bVar, (i11 & 8388608) != 0 ? null : o0Var, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : rVar, (i11 & 33554432) != 0 ? null : l0Var, (i11 & 67108864) != 0 ? null : gVar, (i11 & 134217728) != 0 ? null : v0Var, (i11 & 268435456) != 0 ? null : n1Var, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? null : p1Var, (i11 & 1073741824) != 0 ? null : bVar2, (i11 & Integer.MIN_VALUE) != 0 ? null : a3Var, (i12 & 1) != 0 ? null : zVar, (i12 & 2) != 0 ? null : c0Var, (i12 & 4) != 0 ? null : c2Var, (i12 & 8) != 0 ? null : aVar, (i12 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ n3 b(n3 n3Var, a2 a2Var, b1 b1Var, g2 g2Var, o oVar, d0 d0Var, v2 v2Var, b4 b4Var, q3 q3Var, s0 s0Var, f1 f1Var, i1 i1Var, a1 a1Var, w1 w1Var, t2 t2Var, w2 w2Var, h3 h3Var, j2 j2Var, f3 f3Var, c3 c3Var, y2 y2Var, j0 j0Var, d dVar, xt.b bVar, o0 o0Var, r rVar, l0 l0Var, g gVar, v0 v0Var, n1 n1Var, p1 p1Var, bu.b bVar2, a3 a3Var, z zVar, c0 c0Var, c2 c2Var, bu.a aVar, okio.i iVar, int i11, int i12, Object obj) {
        return n3Var.a((i11 & 1) != 0 ? n3Var.f8111a : a2Var, (i11 & 2) != 0 ? n3Var.f8112b : b1Var, (i11 & 4) != 0 ? n3Var.f8113c : g2Var, (i11 & 8) != 0 ? n3Var.f8114d : oVar, (i11 & 16) != 0 ? n3Var.f8115e : d0Var, (i11 & 32) != 0 ? n3Var.f8116f : v2Var, (i11 & 64) != 0 ? n3Var.f8117g : b4Var, (i11 & 128) != 0 ? n3Var.f8118h : q3Var, (i11 & 256) != 0 ? n3Var.f8119i : s0Var, (i11 & 512) != 0 ? n3Var.f8120j : f1Var, (i11 & 1024) != 0 ? n3Var.f8121k : i1Var, (i11 & 2048) != 0 ? n3Var.f8122l : a1Var, (i11 & 4096) != 0 ? n3Var.f8123m : w1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? n3Var.f8124n : t2Var, (i11 & 16384) != 0 ? n3Var.f8125o : w2Var, (i11 & 32768) != 0 ? n3Var.f8126p : h3Var, (i11 & 65536) != 0 ? n3Var.f8127q : j2Var, (i11 & 131072) != 0 ? n3Var.f8128t : f3Var, (i11 & 262144) != 0 ? n3Var.f8129w : c3Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? n3Var.f8130x : y2Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? n3Var.f8131y : j0Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? n3Var.f8132z : dVar, (i11 & 4194304) != 0 ? n3Var.A : bVar, (i11 & 8388608) != 0 ? n3Var.B : o0Var, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? n3Var.C : rVar, (i11 & 33554432) != 0 ? n3Var.E : l0Var, (i11 & 67108864) != 0 ? n3Var.F : gVar, (i11 & 134217728) != 0 ? n3Var.G : v0Var, (i11 & 268435456) != 0 ? n3Var.H : n1Var, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? n3Var.K : p1Var, (i11 & 1073741824) != 0 ? n3Var.L : bVar2, (i11 & Integer.MIN_VALUE) != 0 ? n3Var.O : a3Var, (i12 & 1) != 0 ? n3Var.P : zVar, (i12 & 2) != 0 ? n3Var.Q : c0Var, (i12 & 4) != 0 ? n3Var.R : c2Var, (i12 & 8) != 0 ? n3Var.T : aVar, (i12 & 16) != 0 ? n3Var.unknownFields() : iVar);
    }

    public final r A() {
        return this.C;
    }

    public final b1 B() {
        return this.f8112b;
    }

    public final n1 C() {
        return this.H;
    }

    public final p1 D() {
        return this.K;
    }

    public final v2 E() {
        return this.f8116f;
    }

    public final w2 F() {
        return this.f8125o;
    }

    public final y2 G() {
        return this.f8130x;
    }

    public final a3 H() {
        return this.O;
    }

    public final c3 I() {
        return this.f8129w;
    }

    public final f3 J() {
        return this.f8128t;
    }

    public final h3 K() {
        return this.f8126p;
    }

    public final b4 L() {
        return this.f8117g;
    }

    public final n3 a(a2 a2Var, b1 b1Var, g2 g2Var, o oVar, d0 d0Var, v2 v2Var, b4 b4Var, q3 q3Var, s0 s0Var, f1 f1Var, i1 i1Var, a1 a1Var, w1 w1Var, t2 t2Var, w2 w2Var, h3 h3Var, j2 j2Var, f3 f3Var, c3 c3Var, y2 y2Var, j0 j0Var, d dVar, xt.b bVar, o0 o0Var, r rVar, l0 l0Var, g gVar, v0 v0Var, n1 n1Var, p1 p1Var, bu.b bVar2, a3 a3Var, z zVar, c0 c0Var, c2 c2Var, bu.a aVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new n3(a2Var, b1Var, g2Var, oVar, d0Var, v2Var, b4Var, q3Var, s0Var, f1Var, i1Var, a1Var, w1Var, t2Var, w2Var, h3Var, j2Var, f3Var, c3Var, y2Var, j0Var, dVar, bVar, o0Var, rVar, l0Var, gVar, v0Var, n1Var, p1Var, bVar2, a3Var, zVar, c0Var, c2Var, aVar, unknownFields);
    }

    public final bu.b c() {
        return this.L;
    }

    public final g d() {
        return this.F;
    }

    public final o e() {
        return this.f8114d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n3) {
            n3 n3Var = (n3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), n3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8111a, n3Var.f8111a) && kotlin.jvm.internal.s.c(this.f8112b, n3Var.f8112b) && this.f8113c == n3Var.f8113c && kotlin.jvm.internal.s.c(this.f8114d, n3Var.f8114d) && kotlin.jvm.internal.s.c(this.f8115e, n3Var.f8115e) && kotlin.jvm.internal.s.c(this.f8116f, n3Var.f8116f) && kotlin.jvm.internal.s.c(this.f8117g, n3Var.f8117g) && kotlin.jvm.internal.s.c(this.f8118h, n3Var.f8118h) && kotlin.jvm.internal.s.c(this.f8119i, n3Var.f8119i) && kotlin.jvm.internal.s.c(this.f8120j, n3Var.f8120j) && kotlin.jvm.internal.s.c(this.f8121k, n3Var.f8121k) && this.f8122l == n3Var.f8122l && kotlin.jvm.internal.s.c(this.f8123m, n3Var.f8123m) && kotlin.jvm.internal.s.c(this.f8124n, n3Var.f8124n) && kotlin.jvm.internal.s.c(this.f8125o, n3Var.f8125o) && kotlin.jvm.internal.s.c(this.f8126p, n3Var.f8126p) && kotlin.jvm.internal.s.c(this.f8127q, n3Var.f8127q) && kotlin.jvm.internal.s.c(this.f8128t, n3Var.f8128t) && kotlin.jvm.internal.s.c(this.f8129w, n3Var.f8129w) && kotlin.jvm.internal.s.c(this.f8130x, n3Var.f8130x) && kotlin.jvm.internal.s.c(this.f8131y, n3Var.f8131y) && this.f8132z == n3Var.f8132z && kotlin.jvm.internal.s.c(this.A, n3Var.A) && kotlin.jvm.internal.s.c(this.B, n3Var.B) && kotlin.jvm.internal.s.c(this.C, n3Var.C) && kotlin.jvm.internal.s.c(this.E, n3Var.E) && kotlin.jvm.internal.s.c(this.F, n3Var.F) && kotlin.jvm.internal.s.c(this.G, n3Var.G) && kotlin.jvm.internal.s.c(this.H, n3Var.H) && kotlin.jvm.internal.s.c(this.K, n3Var.K) && kotlin.jvm.internal.s.c(this.L, n3Var.L) && kotlin.jvm.internal.s.c(this.O, n3Var.O) && kotlin.jvm.internal.s.c(this.P, n3Var.P) && kotlin.jvm.internal.s.c(this.Q, n3Var.Q) && kotlin.jvm.internal.s.c(this.R, n3Var.R) && kotlin.jvm.internal.s.c(this.T, n3Var.T);
        }
        return false;
    }

    public final z f() {
        return this.P;
    }

    public final c0 g() {
        return this.Q;
    }

    public final d0 h() {
        return this.f8115e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            a2 a2Var = this.f8111a;
            int hashCode2 = (hashCode + (a2Var != null ? a2Var.hashCode() : 0)) * 37;
            b1 b1Var = this.f8112b;
            int hashCode3 = (hashCode2 + (b1Var != null ? b1Var.hashCode() : 0)) * 37;
            g2 g2Var = this.f8113c;
            int hashCode4 = (hashCode3 + (g2Var != null ? g2Var.hashCode() : 0)) * 37;
            o oVar = this.f8114d;
            int hashCode5 = (hashCode4 + (oVar != null ? oVar.hashCode() : 0)) * 37;
            d0 d0Var = this.f8115e;
            int hashCode6 = (hashCode5 + (d0Var != null ? d0Var.hashCode() : 0)) * 37;
            v2 v2Var = this.f8116f;
            int hashCode7 = (hashCode6 + (v2Var != null ? v2Var.hashCode() : 0)) * 37;
            b4 b4Var = this.f8117g;
            int hashCode8 = (hashCode7 + (b4Var != null ? b4Var.hashCode() : 0)) * 37;
            q3 q3Var = this.f8118h;
            int hashCode9 = (hashCode8 + (q3Var != null ? q3Var.hashCode() : 0)) * 37;
            s0 s0Var = this.f8119i;
            int hashCode10 = (hashCode9 + (s0Var != null ? s0Var.hashCode() : 0)) * 37;
            f1 f1Var = this.f8120j;
            int hashCode11 = (hashCode10 + (f1Var != null ? f1Var.hashCode() : 0)) * 37;
            i1 i1Var = this.f8121k;
            int hashCode12 = (hashCode11 + (i1Var != null ? i1Var.hashCode() : 0)) * 37;
            a1 a1Var = this.f8122l;
            int hashCode13 = (hashCode12 + (a1Var != null ? a1Var.hashCode() : 0)) * 37;
            w1 w1Var = this.f8123m;
            int hashCode14 = (hashCode13 + (w1Var != null ? w1Var.hashCode() : 0)) * 37;
            t2 t2Var = this.f8124n;
            int hashCode15 = (hashCode14 + (t2Var != null ? t2Var.hashCode() : 0)) * 37;
            w2 w2Var = this.f8125o;
            int hashCode16 = (hashCode15 + (w2Var != null ? w2Var.hashCode() : 0)) * 37;
            h3 h3Var = this.f8126p;
            int hashCode17 = (hashCode16 + (h3Var != null ? h3Var.hashCode() : 0)) * 37;
            j2 j2Var = this.f8127q;
            int hashCode18 = (hashCode17 + (j2Var != null ? j2Var.hashCode() : 0)) * 37;
            f3 f3Var = this.f8128t;
            int hashCode19 = (hashCode18 + (f3Var != null ? f3Var.hashCode() : 0)) * 37;
            c3 c3Var = this.f8129w;
            int hashCode20 = (hashCode19 + (c3Var != null ? c3Var.hashCode() : 0)) * 37;
            y2 y2Var = this.f8130x;
            int hashCode21 = (hashCode20 + (y2Var != null ? y2Var.hashCode() : 0)) * 37;
            j0 j0Var = this.f8131y;
            int hashCode22 = (hashCode21 + (j0Var != null ? j0Var.hashCode() : 0)) * 37;
            d dVar = this.f8132z;
            int hashCode23 = (hashCode22 + (dVar != null ? dVar.hashCode() : 0)) * 37;
            xt.b bVar = this.A;
            int hashCode24 = (hashCode23 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            o0 o0Var = this.B;
            int hashCode25 = (hashCode24 + (o0Var != null ? o0Var.hashCode() : 0)) * 37;
            r rVar = this.C;
            int hashCode26 = (hashCode25 + (rVar != null ? rVar.hashCode() : 0)) * 37;
            l0 l0Var = this.E;
            int hashCode27 = (hashCode26 + (l0Var != null ? l0Var.hashCode() : 0)) * 37;
            g gVar = this.F;
            int hashCode28 = (hashCode27 + (gVar != null ? gVar.hashCode() : 0)) * 37;
            v0 v0Var = this.G;
            int hashCode29 = (hashCode28 + (v0Var != null ? v0Var.hashCode() : 0)) * 37;
            n1 n1Var = this.H;
            int hashCode30 = (hashCode29 + (n1Var != null ? n1Var.hashCode() : 0)) * 37;
            p1 p1Var = this.K;
            int hashCode31 = (hashCode30 + (p1Var != null ? p1Var.hashCode() : 0)) * 37;
            bu.b bVar2 = this.L;
            int hashCode32 = (hashCode31 + (bVar2 != null ? bVar2.hashCode() : 0)) * 37;
            a3 a3Var = this.O;
            int hashCode33 = (hashCode32 + (a3Var != null ? a3Var.hashCode() : 0)) * 37;
            z zVar = this.P;
            int hashCode34 = (hashCode33 + (zVar != null ? zVar.hashCode() : 0)) * 37;
            c0 c0Var = this.Q;
            int hashCode35 = (hashCode34 + (c0Var != null ? c0Var.hashCode() : 0)) * 37;
            c2 c2Var = this.R;
            int hashCode36 = (hashCode35 + (c2Var != null ? c2Var.hashCode() : 0)) * 37;
            bu.a aVar = this.T;
            int hashCode37 = hashCode36 + (aVar != null ? aVar.hashCode() : 0);
            this.hashCode = hashCode37;
            return hashCode37;
        }
        return i11;
    }

    public final j0 i() {
        return this.f8131y;
    }

    public final d j() {
        return this.f8132z;
    }

    public final l0 k() {
        return this.E;
    }

    public final o0 l() {
        return this.B;
    }

    public final s0 m() {
        return this.f8119i;
    }

    public final xt.b n() {
        return this.A;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m56newBuilder();
    }

    public final v0 o() {
        return this.G;
    }

    public final a1 p() {
        return this.f8122l;
    }

    public final i1 q() {
        return this.f8121k;
    }

    public final t2 r() {
        return this.f8124n;
    }

    public final w1 s() {
        return this.f8123m;
    }

    public final a2 t() {
        return this.f8111a;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        a2 a2Var = this.f8111a;
        if (a2Var != null) {
            arrayList.add("personalizationInformation=" + a2Var);
        }
        b1 b1Var = this.f8112b;
        if (b1Var != null) {
            arrayList.add("VCSEC_InformationRequest=" + b1Var);
        }
        g2 g2Var = this.f8113c;
        if (g2Var != null) {
            arrayList.add("RKEAction=" + g2Var);
        }
        o oVar = this.f8114d;
        if (oVar != null) {
            arrayList.add("authenticationResponse=" + oVar);
        }
        d0 d0Var = this.f8115e;
        if (d0Var != null) {
            arrayList.add("closureMoveRequest=" + d0Var);
        }
        v2 v2Var = this.f8116f;
        if (v2Var != null) {
            arrayList.add("VCSEC_TPAdv=" + v2Var);
        }
        b4 b4Var = this.f8117g;
        if (b4Var != null) {
            arrayList.add("VCSEC_WhitelistOperation=" + b4Var);
        }
        q3 q3Var = this.f8118h;
        if (q3Var != null) {
            arrayList.add("updaterResponse=" + q3Var);
        }
        s0 s0Var = this.f8119i;
        if (s0Var != null) {
            arrayList.add("genealogyResponse=" + s0Var);
        }
        f1 f1Var = this.f8120j;
        if (f1Var != null) {
            arrayList.add("setMetaDataForKey=" + f1Var);
        }
        i1 i1Var = this.f8121k;
        if (i1Var != null) {
            arrayList.add("keyfobInfo=" + i1Var);
        }
        a1 a1Var = this.f8122l;
        if (a1Var != null) {
            arrayList.add("IMUState=" + a1Var);
        }
        w1 w1Var = this.f8123m;
        if (w1Var != null) {
            arrayList.add("nfcseState=" + w1Var);
        }
        t2 t2Var = this.f8124n;
        if (t2Var != null) {
            arrayList.add("lowPowerDeviceSleepManagerStats=" + t2Var);
        }
        w2 w2Var = this.f8125o;
        if (w2Var != null) {
            arrayList.add("VCSEC_TPData=" + w2Var);
        }
        h3 h3Var = this.f8126p;
        if (h3Var != null) {
            arrayList.add("VCSEC_TPWheelUnitInfo=" + h3Var);
        }
        j2 j2Var = this.f8127q;
        if (j2Var != null) {
            arrayList.add("resetTrackerStats=" + j2Var);
        }
        f3 f3Var = this.f8128t;
        if (f3Var != null) {
            arrayList.add("VCSEC_TPNotifyTrackerStats=" + f3Var);
        }
        c3 c3Var = this.f8129w;
        if (c3Var != null) {
            arrayList.add("VCSEC_TPNewSensorData=" + c3Var);
        }
        y2 y2Var = this.f8130x;
        if (y2Var != null) {
            arrayList.add("VCSEC_TPLRDetection=" + y2Var);
        }
        j0 j0Var = this.f8131y;
        if (j0Var != null) {
            arrayList.add("connectionMetrics=" + j0Var);
        }
        d dVar = this.f8132z;
        if (dVar != null) {
            arrayList.add("deviceActivity=" + dVar);
        }
        xt.b bVar = this.A;
        if (bVar != null) {
            arrayList.add("getEpochSessionInfo=" + bVar);
        }
        o0 o0Var = this.B;
        if (o0Var != null) {
            arrayList.add("fromRCIResponse=" + o0Var);
        }
        r rVar = this.C;
        if (rVar != null) {
            arrayList.add("VCSEC_BLEConfigAll=" + rVar);
        }
        l0 l0Var = this.E;
        if (l0Var != null) {
            arrayList.add("deviceMotion=" + l0Var);
        }
        g gVar = this.F;
        if (gVar != null) {
            arrayList.add("appDeviceInfo=" + gVar);
        }
        v0 v0Var = this.G;
        if (v0Var != null) {
            arrayList.add("getReaderKey=" + v0Var);
        }
        n1 n1Var = this.H;
        if (n1Var != null) {
            arrayList.add("VCSEC_MISessionResponse=" + n1Var);
        }
        p1 p1Var = this.K;
        if (p1Var != null) {
            arrayList.add("VCSEC_MISessionStopped=" + p1Var);
        }
        bu.b bVar2 = this.L;
        if (bVar2 != null) {
            arrayList.add("accelData=" + bVar2);
        }
        a3 a3Var = this.O;
        if (a3Var != null) {
            arrayList.add("VCSEC_TPMSAlarms=" + a3Var);
        }
        z zVar = this.P;
        if (zVar != null) {
            arrayList.add("certificateResponse=" + zVar);
        }
        c0 c0Var = this.Q;
        if (c0Var != null) {
            arrayList.add("challengeResponse=" + c0Var);
        }
        c2 c2Var = this.R;
        if (c2Var != null) {
            arrayList.add("publicKeyResponse=" + c2Var);
        }
        bu.a aVar = this.T;
        if (aVar != null) {
            arrayList.add("VCSEC_ASICSPIRead=" + aVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "UnsignedMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final c2 u() {
        return this.R;
    }

    public final g2 v() {
        return this.f8113c;
    }

    public final j2 w() {
        return this.f8127q;
    }

    public final f1 x() {
        return this.f8120j;
    }

    public final q3 y() {
        return this.f8118h;
    }

    public final bu.a z() {
        return this.T;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m56newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(a2 a2Var, b1 b1Var, g2 g2Var, o oVar, d0 d0Var, v2 v2Var, b4 b4Var, q3 q3Var, s0 s0Var, f1 f1Var, i1 i1Var, a1 a1Var, w1 w1Var, t2 t2Var, w2 w2Var, h3 h3Var, j2 j2Var, f3 f3Var, c3 c3Var, y2 y2Var, j0 j0Var, d dVar, xt.b bVar, o0 o0Var, r rVar, l0 l0Var, g gVar, v0 v0Var, n1 n1Var, p1 p1Var, bu.b bVar2, a3 a3Var, z zVar, c0 c0Var, c2 c2Var, bu.a aVar, okio.i unknownFields) {
        super(Y, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8111a = a2Var;
        this.f8112b = b1Var;
        this.f8113c = g2Var;
        this.f8114d = oVar;
        this.f8115e = d0Var;
        this.f8116f = v2Var;
        this.f8117g = b4Var;
        this.f8118h = q3Var;
        this.f8119i = s0Var;
        this.f8120j = f1Var;
        this.f8121k = i1Var;
        this.f8122l = a1Var;
        this.f8123m = w1Var;
        this.f8124n = t2Var;
        this.f8125o = w2Var;
        this.f8126p = h3Var;
        this.f8127q = j2Var;
        this.f8128t = f3Var;
        this.f8129w = c3Var;
        this.f8130x = y2Var;
        this.f8131y = j0Var;
        this.f8132z = dVar;
        this.A = bVar;
        this.B = o0Var;
        this.C = rVar;
        this.E = l0Var;
        this.F = gVar;
        this.G = v0Var;
        this.H = n1Var;
        this.K = p1Var;
        this.L = bVar2;
        this.O = a3Var;
        this.P = zVar;
        this.Q = c0Var;
        this.R = c2Var;
        this.T = aVar;
        if (!(mr.d.e(b1Var, g2Var, oVar, d0Var, v2Var, b4Var, q3Var, s0Var, f1Var, i1Var, a1Var, w1Var, t2Var, w2Var, h3Var, j2Var, f3Var, c3Var, y2Var, j0Var, dVar, bVar, o0Var, rVar, l0Var, gVar, v0Var, n1Var, p1Var, bVar2, a3Var, zVar, c0Var, c2Var, aVar) <= 1)) {
            throw new IllegalArgumentException("At most one of VCSEC_InformationRequest, RKEAction, authenticationResponse, closureMoveRequest, VCSEC_TPAdv, VCSEC_WhitelistOperation, updaterResponse, genealogyResponse, setMetaDataForKey, keyfobInfo, IMUState, nfcseState, lowPowerDeviceSleepManagerStats, VCSEC_TPData, VCSEC_TPWheelUnitInfo, resetTrackerStats, VCSEC_TPNotifyTrackerStats, VCSEC_TPNewSensorData, VCSEC_TPLRDetection, connectionMetrics, deviceActivity, getEpochSessionInfo, fromRCIResponse, VCSEC_BLEConfigAll, deviceMotion, appDeviceInfo, getReaderKey, VCSEC_MISessionResponse, VCSEC_MISessionStopped, accelData, VCSEC_TPMSAlarms, certificateResponse, challengeResponse, publicKeyResponse, VCSEC_ASICSPIRead may be non-null".toString());
        }
    }
}