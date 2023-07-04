package gv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import bu.b1;
import bu.b2;
import bu.c1;
import bu.d0;
import bu.d1;
import bu.e1;
import bu.f1;
import bu.g2;
import bu.i0;
import bu.j3;
import bu.k2;
import bu.n2;
import bu.n3;
import bu.o2;
import bu.p0;
import bu.p2;
import bu.w3;
import bu.y1;
import bu.y3;
import bu.z3;
import com.teslamotors.plugins.ble.Peripheral;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.lang.ref.WeakReference;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.json.JSONException;
import yu.z;
import zu.f0;
import zu.t;

/* loaded from: classes6.dex */
public class q {
    private static final Set<lv.d> A;
    private static final Set<lv.d> B;
    private static final Set<lv.d> C;
    private static final Set<lv.d> D;

    /* renamed from: a */
    private PublicKey f28181a;

    /* renamed from: b */
    private PrivateKey f28182b;

    /* renamed from: c */
    private PublicKey f28183c;

    /* renamed from: d */
    byte[] f28184d;

    /* renamed from: k */
    private String f28191k;

    /* renamed from: l */
    private k2 f28192l;

    /* renamed from: n */
    public int f28194n;

    /* renamed from: o */
    public int f28195o;

    /* renamed from: p */
    public int f28196p;

    /* renamed from: q */
    public int f28197q;

    /* renamed from: r */
    private int f28198r;

    /* renamed from: w */
    private final String f28203w;

    /* renamed from: x */
    private final WeakReference<com.teslamotors.plugins.ble.j> f28204x;

    /* renamed from: y */
    private final Context f28205y;

    /* renamed from: e */
    byte[] f28185e = null;

    /* renamed from: m */
    private AtomicLong f28193m = new AtomicLong();

    /* renamed from: s */
    private List<byte[]> f28199s = new CopyOnWriteArrayList();

    /* renamed from: z */
    private Runnable f28206z = new a();

    /* renamed from: g */
    private boolean f28187g = false;

    /* renamed from: h */
    private boolean f28188h = false;

    /* renamed from: i */
    private boolean f28189i = false;

    /* renamed from: j */
    private boolean f28190j = false;

    /* renamed from: u */
    private boolean f28201u = false;

    /* renamed from: f */
    private lv.d f28186f = lv.d.UNINITIALIZED;

    /* renamed from: t */
    Handler f28200t = new Handler(Looper.getMainLooper());

    /* renamed from: v */
    private final zs.a f28202v = zs.a.l();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        a() {
            q.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.teslamotors.plugins.ble.j jVar = (com.teslamotors.plugins.ble.j) q.this.f28204x.get();
            if (jVar == null) {
                return;
            }
            if (q.C.contains(q.this.f28186f) && jVar.v() != lv.e.CONNECTED) {
                if (!jVar.h0()) {
                    q qVar = q.this;
                    qVar.b0(String.format("Timed out in state %s but no other candidates. Cancelling retries", qVar.f28186f.name()));
                    q.this.B(lv.d.IDLE);
                    return;
                }
                q qVar2 = q.this;
                qVar2.b0(String.format("Timed out in state %s. Trying a different command peripheral", qVar2.f28186f.name()));
                q.this.B(lv.d.CONNECT_TO_COMMAND_PERIPHERAL);
                return;
            }
            q qVar3 = q.this;
            if (qVar3.f28194n > 10 && !qVar3.f28188h) {
                q.this.b0("Timed out getting public key");
                q.this.B(lv.d.IDLE);
                jVar.B0("public key timeout");
                return;
            }
            q qVar4 = q.this;
            if (qVar4.f28195o > 10 && !qVar4.f28190j) {
                q.this.b0("Timed out getting whitelist");
                q.this.B(lv.d.IDLE);
                jVar.B0("whitelist timeout");
                return;
            }
            q qVar5 = q.this;
            if (qVar5.f28197q == 10) {
                qVar5.a0("Timed out getting status", new Exception("[TMBLE Logic] Failed to get vehicle status after 10 attempts; resetting command peripheral."));
                q.this.B(lv.d.IDLE);
                jVar.B0("status timeout");
            } else if (qVar5.f28196p > 10) {
                qVar5.b0("Timed out getting IV");
                q.this.B(lv.d.ALL_CRYPTO_COMPLETE);
            } else if (qVar5.f28186f == lv.d.WAITING_FOR_PUB_KEY) {
                q qVar6 = q.this;
                qVar6.f28194n++;
                qVar6.b0("Restarting timer for request pub key");
                q.this.B(lv.d.REQUEST_PUB_KEY);
            } else if (q.this.f28186f == lv.d.WAITING_FOR_WHITELIST) {
                q qVar7 = q.this;
                qVar7.f28195o++;
                qVar7.b0("Restarting timer for whitelist");
                q.this.B(lv.d.CHECK_WHITELIST);
            } else if (q.this.f28186f == lv.d.WAITING_FOR_STATUS) {
                q qVar8 = q.this;
                qVar8.f28197q++;
                qVar8.b0("Restarting timer for status");
                q.this.B(lv.d.GET_STATUS);
            } else if (q.this.f28186f == lv.d.WAITING_FOR_CRYPTO_COUNTER) {
                q qVar9 = q.this;
                qVar9.f28196p++;
                qVar9.b0("Restarting timer for syncing crypto counter");
                q.this.B(lv.d.SYNC_CRYPTO_COUNTER);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b implements Runnable {
        b() {
            q.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            q qVar = q.this;
            qVar.b0("start: " + q.this.f28186f);
            if (q.this.f28186f != lv.d.UNINITIALIZED || q.this.f28191k == null || q.this.f28191k.isEmpty()) {
                return;
            }
            q.this.B(lv.d.LOAD_KEY_PAIR);
        }
    }

    /* loaded from: classes6.dex */
    public class c implements Runnable {
        c() {
            q.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            q qVar = q.this;
            qVar.b0("connectionEstablished - in state " + q.this.f28186f);
            q qVar2 = q.this;
            qVar2.f28194n = 0;
            qVar2.f28195o = 0;
            qVar2.f28197q = 0;
            qVar2.f28196p = 0;
            qVar2.f28201u = true;
            q.this.B(lv.d.CONNECTION_ESTABLISHED);
        }
    }

    /* loaded from: classes6.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f28210a;

        d(boolean z11) {
            q.this = r1;
            this.f28210a = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            q qVar = q.this;
            qVar.b0("connectionLost - in state " + q.this.f28186f);
            if (!this.f28210a) {
                q.this.b0("connectionLost non-command peripheral");
                return;
            }
            q.this.f28201u = false;
            q qVar2 = q.this;
            qVar2.f28200t.removeCallbacks(qVar2.f28206z);
            q.this.B(lv.d.CONNECT_TO_COMMAND_PERIPHERAL);
        }
    }

    /* loaded from: classes6.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Peripheral f28212a;

        e(Peripheral peripheral) {
            q.this = r1;
            this.f28212a = peripheral;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.teslamotors.plugins.ble.j jVar = (com.teslamotors.plugins.ble.j) q.this.f28204x.get();
            if (jVar == null) {
                return;
            }
            q qVar = q.this;
            qVar.b0(String.format("%s Found peripheral - in state %s", this.f28212a, qVar.f28186f));
            if (!jVar.g0() && q.this.f28186f != lv.d.WAITING_FOR_COMMAND_PERIPHERAL) {
                lv.d dVar = q.this.f28186f;
                lv.d dVar2 = lv.d.CONNECT_TO_COMMAND_PERIPHERAL;
                if (dVar != dVar2) {
                    q.this.b0("mVehicleController does not have command peripheral... Connecting");
                    q.this.B(dVar2);
                    return;
                }
            }
            jVar.U();
        }
    }

    /* loaded from: classes6.dex */
    public class f implements Runnable {
        f() {
            q.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.f28188h = false;
            q.this.f28189i = false;
            q.this.f28190j = false;
            q.this.f28198r = 0;
            q.this.f28199s.clear();
            z.p(q.this.f28205y).V(q.this.f28203w, q.this.f28191k, 0L);
            z.p(q.this.f28205y).W(q.this.f28203w, q.this.f28191k, Collections.emptySet());
            q qVar = q.this;
            qVar.f28194n = 0;
            qVar.f28196p = 0;
            qVar.f28195o = 0;
            qVar.f28197q = 0;
            qVar.f28184d = null;
            qVar.b0("Forgetting remote ephemeral and derived secret");
            q.this.B(lv.d.IDLE);
        }
    }

    /* loaded from: classes6.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ p0 f28215a;

        /* renamed from: b */
        final /* synthetic */ Peripheral f28216b;

        /* loaded from: classes6.dex */
        class a implements Runnable {
            a() {
                g.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.teslamotors.plugins.ble.j jVar = (com.teslamotors.plugins.ble.j) q.this.f28204x.get();
                if (jVar != null) {
                    jVar.V();
                }
            }
        }

        g(p0 p0Var, Peripheral peripheral) {
            q.this = r1;
            this.f28215a = p0Var;
            this.f28216b = peripheral;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map a11;
            com.teslamotors.plugins.ble.j jVar = (com.teslamotors.plugins.ble.j) q.this.f28204x.get();
            if (jVar == null) {
                return;
            }
            k2 u11 = this.f28215a.u();
            if (u11 != null && u11.d() != okio.i.f42656d) {
                q.this.b0(String.format("Received session info with public key: %s", "REDACTED"));
                if (q.this.f28186f == lv.d.WAITING_FOR_PUB_KEY) {
                    q.this.f28192l = u11;
                    q.this.B(lv.d.PARSE_PUB_KEY);
                }
            }
            int c11 = u11 == null ? 0 : u11.c();
            if (c11 != 0 || q.this.f28186f == lv.d.WAITING_FOR_CRYPTO_COUNTER) {
                q qVar = q.this;
                qVar.f28196p = 0;
                long j11 = qVar.f28193m.get();
                q.this.b0(String.format("Received session info with counter. VCSEC: %d Phone: %d", Integer.valueOf(c11), Long.valueOf(j11)));
                long j12 = c11;
                if (j12 > j11) {
                    q.this.f28193m.set(j12);
                    z.p(q.this.f28205y).J(q.this.f28193m.get(), q.this.f28203w, q.this.f28191k);
                    if (!jVar.M0()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("vcsec_iv", Integer.valueOf(c11));
                        hashMap.put("phone_iv", Long.valueOf(j11));
                        hashMap.put("delta", Long.valueOf(j12 - j11));
                        String str = "[TMBLE Logic] IV inconsistent outside of pairing..." + hashMap.toString();
                        q.this.a0(str, new Throwable(str));
                        q.this.b0(String.format("WARNING! VCSEC and phone IV were inconsistent outside of pairing. VCSEC: %d Phone: %d", Integer.valueOf(c11), Long.valueOf(j11)));
                    }
                }
                if (q.this.f28186f == lv.d.WAITING_FOR_CRYPTO_COUNTER) {
                    q.this.B(lv.d.ALL_CRYPTO_COMPLETE);
                }
            }
            xt.h l11 = this.f28215a.l();
            if (l11 != null) {
                a11 = s.a(new Map.Entry[]{new AbstractMap.SimpleEntry("counter", Integer.valueOf(l11.d())), new AbstractMap.SimpleEntry("public_key", f0.b(l11.f().E())), new AbstractMap.SimpleEntry("epoch", f0.b(l11.e().E())), new AbstractMap.SimpleEntry("clock_time", Integer.valueOf(l11.c())), new AbstractMap.SimpleEntry(PermissionsResponse.STATUS_KEY, Integer.valueOf(l11.g().getValue()))});
                try {
                    jVar.m0(true, t.e(a11).toString(), lv.c.GET_EPOCH_SESSION_INFO.name());
                } catch (JSONException e11) {
                    q.this.a0("[TMBLE Logic] failed to serialize session info)", e11);
                }
            }
            w3 H = this.f28215a.H();
            if (H != null) {
                q qVar2 = q.this;
                qVar2.f28197q = 0;
                qVar2.b0(String.format("Received vehicle status: %s", lv.f.i(H)));
                if (q.this.f28186f == lv.d.WAITING_FOR_STATUS) {
                    q.this.B(lv.d.CONNECTED_IDLE);
                }
            }
            i0 k11 = this.f28215a.k();
            if (k11 != null) {
                if (k11.d() != null) {
                    p2 d11 = k11.d().d();
                    int c12 = k11.d().c();
                    jVar.o0(c12, lv.b.fromOperationStatus(k11.c()), lv.b.fromMessageInformation(d11), this.f28216b);
                    q.this.b0(String.format("Command Status: %s, Counter: %s, Message Information: %s", k11.c().name(), Integer.valueOf(c12), d11.name()));
                    if (k11.c() == y1.OPERATIONSTATUS_ERROR) {
                        if (d11 == p2.SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST) {
                            if (q.this.f28190j) {
                                q.this.b0("app got error about not being whitelist when it thought it was; refreshing");
                                q.this.g0(c1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO);
                            }
                        } else if (d11 == p2.SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH) {
                            if (!jVar.M0()) {
                                StringBuilder sb2 = new StringBuilder();
                                String str2 = "[TMBLE Logic] AES Decrypt auth fault outside of pairing. " + sb2.toString();
                                q.this.a0(str2, new Throwable(str2));
                                q.this.b0("Got AES Fault - re-fetching public key / deriving keys");
                                q.this.f28188h = false;
                                q.this.f28189i = false;
                                q.this.B(lv.d.REQUEST_PUB_KEY);
                            }
                        } else {
                            q.this.g0(c1.INFORMATION_REQUEST_TYPE_GET_COUNTER);
                        }
                    }
                } else {
                    q.this.b0(String.format("Command Status: %s", k11.c().name()));
                }
            }
            z3 J = this.f28215a.J();
            if (J != null && q.this.f28188h && q.this.f28189i) {
                boolean z11 = q.this.f28190j;
                q.this.f28190j = false;
                q.this.f28198r = Math.min(J.c(), J.e().size());
                q qVar3 = q.this;
                qVar3.f28195o = 0;
                qVar3.f28199s.clear();
                q qVar4 = q.this;
                qVar4.b0(String.format("Received whitelist message with %s entries", Integer.valueOf(qVar4.f28198r)));
                for (int i11 = 0; i11 < q.this.f28198r; i11++) {
                    e1 e1Var = J.e().get(i11);
                    if (e1Var.c() != okio.i.f42656d) {
                        byte[] E = e1Var.c().E();
                        q.this.f28199s.add(E);
                        if (Arrays.equals(E, q.this.f28185e)) {
                            q.this.f28190j = true;
                        }
                        q.this.b0(String.format("Whitelist Entry %s", f0.b(Arrays.copyOf(E, 4))));
                    }
                }
                if (!z11 || !q.this.f28190j) {
                    if (q.this.f28190j) {
                        q qVar5 = q.this;
                        qVar5.b0(String.format("Found [%s] in whitelist! -> SYNC_CRYPTO_COUNTER", f0.b(qVar5.f28185e)));
                        q.this.B(lv.d.SYNC_CRYPTO_COUNTER);
                    } else {
                        q qVar6 = q.this;
                        qVar6.b0(String.format("Did NOT find key [%s] in whitelist -> IDLE", f0.b(qVar6.f28185e)));
                        q.this.B(lv.d.IDLE);
                        if (jVar.M0()) {
                            q.this.b0("Staying connected while unauthorized");
                        } else {
                            q.this.f28200t.post(new a());
                        }
                    }
                }
                z.p(q.this.f28205y).W(q.this.f28203w, q.this.f28191k, q.this.N());
                q.this.n0();
            }
            y3 I = this.f28215a.I();
            if (I == null || I.c() == null) {
                return;
            }
            q.this.b0(String.format("Whitelist Entry Information found for key [%s]", f0.b(Arrays.copyOf(I.c().c().E(), 4))));
        }
    }

    /* loaded from: classes6.dex */
    public static /* synthetic */ class h {

        /* renamed from: a */
        static final /* synthetic */ int[] f28219a;

        static {
            int[] iArr = new int[lv.d.values().length];
            f28219a = iArr;
            try {
                iArr[lv.d.LOAD_KEY_PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28219a[lv.d.CONNECT_TO_COMMAND_PERIPHERAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28219a[lv.d.CONNECTION_ESTABLISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28219a[lv.d.REQUEST_PUB_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28219a[lv.d.PARSE_PUB_KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28219a[lv.d.DERIVE_SHARED_KEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28219a[lv.d.CHECK_WHITELIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28219a[lv.d.GET_STATUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28219a[lv.d.SYNC_CRYPTO_COUNTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28219a[lv.d.ALL_CRYPTO_COMPLETE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28219a[lv.d.CONNECTED_IDLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28219a[lv.d.UNINITIALIZED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28219a[lv.d.IDLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28219a[lv.d.WAITING_FOR_COMMAND_PERIPHERAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28219a[lv.d.WAITING_FOR_CRYPTO_COUNTER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28219a[lv.d.WAITING_FOR_PUB_KEY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28219a[lv.d.WAITING_FOR_STATUS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28219a[lv.d.WAITING_FOR_WHITELIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static {
        lv.d dVar = lv.d.WAITING_FOR_STATUS;
        lv.d dVar2 = lv.d.GET_STATUS;
        lv.d dVar3 = lv.d.ALL_CRYPTO_COMPLETE;
        lv.d dVar4 = lv.d.CONNECTED_IDLE;
        A = new HashSet(Arrays.asList(dVar, dVar2, dVar3, dVar4));
        lv.d dVar5 = lv.d.IDLE;
        lv.d dVar6 = lv.d.WAITING_FOR_CRYPTO_COUNTER;
        B = new HashSet(Arrays.asList(dVar, dVar2, dVar3, dVar4, dVar5, dVar6));
        lv.d dVar7 = lv.d.WAITING_FOR_PUB_KEY;
        lv.d dVar8 = lv.d.WAITING_FOR_WHITELIST;
        lv.d dVar9 = lv.d.WAITING_FOR_COMMAND_PERIPHERAL;
        C = new HashSet(Arrays.asList(dVar, dVar7, dVar6, dVar8, dVar9));
        D = new HashSet(Arrays.asList(lv.d.UNINITIALIZED, dVar5, dVar7, dVar8, dVar9, dVar6, dVar, dVar4));
    }

    public q(com.teslamotors.plugins.ble.j jVar, String str, String str2, Context context) {
        this.f28204x = new WeakReference<>(jVar);
        this.f28203w = str;
        this.f28191k = str2;
        this.f28205y = context;
        this.f28193m.set(z.p(context).o(str, str2));
    }

    public void B(lv.d dVar) {
        b0(String.format("State Change: %s -> %s", this.f28186f, dVar));
        boolean z11 = this.f28186f != dVar;
        this.f28186f = dVar;
        if (z11 || !D.contains(dVar)) {
            j0();
        }
    }

    private lv.a F(n3 n3Var, byte[] bArr) {
        long P = P();
        byte[] bArr2 = {(byte) ((P >> 24) & 255), (byte) ((P >> 16) & 255), (byte) ((P >> 8) & 255), (byte) (255 & P)};
        if (this.f28184d == null) {
            b0("Shared secret is null! Cannot encrypt unsigned message.");
            return null;
        }
        byte[] h11 = zs.a.h(n3Var.encode(), this.f28184d, bArr2, bArr);
        if (h11 == null) {
            b0("Encrypted command is null!");
            return null;
        }
        b0(String.format("Signed message - (%s) %s %s", Integer.valueOf(h11.length - 16), f0.b(this.f28185e), Long.valueOf(P)));
        n2 n2Var = n2.SIGNATURE_TYPE_AES_GCM;
        if (bArr != null) {
            n2Var = n2.SIGNATURE_TYPE_AES_GCM_TOKEN;
        }
        return new lv.a(P, m0(i.b(n2Var, Arrays.copyOf(h11, h11.length - 16), Arrays.copyOfRange(h11, h11.length - 16, h11.length), P, this.f28185e)));
    }

    private synchronized long P() {
        return z.p(this.f28205y).J(this.f28193m.incrementAndGet(), this.f28203w, this.f28191k);
    }

    private o2 V(boolean z11, byte[] bArr) {
        if (!B.contains(this.f28186f)) {
            b0(String.format("Rejected whitelist operation due to wrong state %s", this.f28186f));
            return null;
        } else if (this.f28187g && bArr != null) {
            return i.b(n2.SIGNATURE_TYPE_PRESENT_KEY, i.l(i.o(new b2(okio.i.s(bArr), okio.i.f42656d), z11)).encode(), null, P(), this.f28185e);
        } else {
            b0("Rejected whitelist operation due to keys not generated");
            return null;
        }
    }

    public static /* synthetic */ String a(byte[] bArr) {
        return f0.b(bArr);
    }

    public void a0(String str, Throwable th2) {
        com.teslamotors.plugins.ble.j jVar = this.f28204x.get();
        if (jVar != null) {
            jVar.c(String.format("[Logic Error] %s", str), th2);
        }
    }

    public void b0(String str) {
        com.teslamotors.plugins.ble.j jVar = this.f28204x.get();
        if (jVar != null) {
            jVar.z(String.format("[Logic] %s", str));
        }
    }

    private PublicKey d0() {
        b0(String.format("Parsing certificate to retrieve public key: %s", "REDACTED"));
        PublicKey p11 = this.f28202v.p(this.f28192l.d().E());
        this.f28183c = p11;
        return p11;
    }

    public void g0(c1 c1Var) {
        com.teslamotors.plugins.ble.j jVar = this.f28204x.get();
        boolean z11 = jVar != null && jVar.c0();
        yt.f M = M(c1Var);
        j3 K = K(c1Var);
        if ((z11 && M == null) || (!z11 && K == null)) {
            String str = "requestInformation(InformationRequestType requestType) failed to build request. requestType=" + c1Var;
            a0(str, new Exception(str));
        } else if (jVar != null) {
            if (z11) {
                jVar.J0(M.encode(), c1Var.name());
            } else {
                jVar.I0(K, c1Var.name());
            }
        }
    }

    private void i0() {
        this.f28200t.removeCallbacks(this.f28206z);
        this.f28200t.postDelayed(this.f28206z, 2000L);
    }

    private void j0() {
        com.teslamotors.plugins.ble.j jVar = this.f28204x.get();
        b0(String.format("State: %s", this.f28186f));
        switch (h.f28219a[this.f28186f.ordinal()]) {
            case 1:
                if (!this.f28187g) {
                    try {
                        KeyPair n11 = this.f28202v.n(this.f28191k, this.f28205y);
                        if (n11 != null) {
                            b0("Found key pair");
                            this.f28187g = true;
                            this.f28182b = n11.getPrivate();
                            PublicKey publicKey = n11.getPublic();
                            this.f28181a = publicKey;
                            byte[] q11 = zs.a.q(publicKey, 4);
                            this.f28185e = q11;
                            b0(String.format("Local pub key ID    : %s", f0.b(q11)));
                            int E = (int) z.p(this.f28205y).E(this.f28203w, this.f28191k);
                            this.f28198r = E;
                            b0(String.format("Found %d keys on whitelist via legacy method", Integer.valueOf(E)));
                            Set<String> F = z.p(this.f28205y).F(this.f28203w, this.f28191k);
                            k0(F);
                            if (F != null) {
                                b0(String.format("whitelistKeys: [%s]", this.f28199s.stream().map(new Function() { // from class: gv.p
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return q.a((byte[]) obj);
                                    }
                                }).collect(Collectors.joining(", "))));
                                this.f28190j = false;
                                Iterator<byte[]> it2 = this.f28199s.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (Arrays.equals(it2.next(), this.f28185e)) {
                                            this.f28190j = true;
                                        }
                                    }
                                }
                            } else {
                                boolean z11 = this.f28198r > 0;
                                this.f28190j = z11;
                                if (z11) {
                                    this.f28199s = new CopyOnWriteArrayList();
                                    b0("injecting whitelist keys with app's key for upgrade scenario; was previously paired");
                                    for (int i11 = 0; i11 < this.f28198r; i11++) {
                                        this.f28199s.add(this.f28185e);
                                    }
                                }
                            }
                        } else {
                            b0("Failed to load local key pair");
                        }
                        n0();
                    } catch (Exception e11) {
                        a0("Unrecoverable failure trying to get local key pair", e11);
                        return;
                    }
                }
                if (this.f28187g) {
                    B(lv.d.IDLE);
                    return;
                } else {
                    B(lv.d.UNINITIALIZED);
                    return;
                }
            case 2:
                if (jVar == null) {
                    return;
                }
                if (jVar.g0()) {
                    a0("trying to connect to new command peripheral when one already exists", new Throwable("trying to connect to new command peripheral when one already exists"));
                    B(lv.d.CONNECTION_ESTABLISHED);
                    return;
                } else if (jVar.h0()) {
                    b0("connect to command peripheral with candidate peripherals but no command peripheral");
                    i0();
                    B(lv.d.WAITING_FOR_COMMAND_PERIPHERAL);
                    jVar.Y();
                    return;
                } else {
                    b0("connect to command peripheral with no peripherals; going back to idle");
                    B(lv.d.IDLE);
                    return;
                }
            case 3:
                if (!this.f28188h) {
                    B(lv.d.REQUEST_PUB_KEY);
                    return;
                } else if (!this.f28187g) {
                    B(lv.d.LOAD_KEY_PAIR);
                    return;
                } else if (!this.f28189i) {
                    B(lv.d.DERIVE_SHARED_KEY);
                    return;
                } else if (!this.f28190j) {
                    B(lv.d.CHECK_WHITELIST);
                    return;
                } else {
                    n0();
                    B(lv.d.ALL_CRYPTO_COMPLETE);
                    return;
                }
            case 4:
                if (this.f28201u) {
                    i0();
                    B(lv.d.WAITING_FOR_PUB_KEY);
                    g0(c1.INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY);
                    return;
                }
                return;
            case 5:
                PublicKey d02 = d0();
                this.f28183c = d02;
                this.f28194n = 0;
                if (d02 != null) {
                    this.f28188h = true;
                    z.p(this.f28205y).T(this.f28203w, f0.b(zs.a.t(this.f28183c)));
                    B(lv.d.DERIVE_SHARED_KEY);
                    n0();
                    return;
                }
                a0("[TMBLE Logic] Could not parse public key", new Throwable("[TMBLE Logic] Could not parse public key"));
                B(lv.d.REQUEST_PUB_KEY);
                return;
            case 6:
                boolean z12 = this.f28189i;
                if (!z12 && this.f28188h && this.f28187g) {
                    b0("Performing ECDH Key Exchange");
                    byte[] f11 = zs.a.f(this.f28183c, this.f28182b);
                    this.f28184d = f11;
                    if (f11 != null) {
                        this.f28189i = true;
                        b0("Performed ECDH Key Exchange - shared secret:");
                        if (!this.f28190j) {
                            B(lv.d.CHECK_WHITELIST);
                            return;
                        } else {
                            B(lv.d.ALL_CRYPTO_COMPLETE);
                            return;
                        }
                    }
                    a0("Could not perform key exchange", new Throwable("Could not perform key exchange"));
                    this.f28188h = false;
                    B(lv.d.REQUEST_PUB_KEY);
                    return;
                } else if (z12 && this.f28188h && this.f28187g) {
                    return;
                } else {
                    String format = String.format("Could not derive shared keys. Derived keys %s. Remote key %s. Local key %s", Boolean.valueOf(z12), Boolean.valueOf(this.f28188h), Boolean.valueOf(this.f28187g));
                    a0(format, new Throwable(format));
                    return;
                }
            case 7:
                if (this.f28201u) {
                    i0();
                    B(lv.d.WAITING_FOR_WHITELIST);
                    g0(c1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO);
                    return;
                }
                return;
            case 8:
                if (this.f28201u) {
                    i0();
                    B(lv.d.WAITING_FOR_STATUS);
                    g0(c1.INFORMATION_REQUEST_TYPE_GET_STATUS);
                    return;
                }
                return;
            case 9:
                if (this.f28201u) {
                    i0();
                    B(lv.d.WAITING_FOR_CRYPTO_COUNTER);
                    g0(c1.INFORMATION_REQUEST_TYPE_GET_COUNTER);
                    return;
                }
                return;
            case 10:
                B(lv.d.GET_STATUS);
                return;
            case 11:
                if (jVar != null) {
                    jVar.U();
                    return;
                }
                return;
            default:
                return;
        }
    }

    private j3 m0(o2 o2Var) {
        if (o2Var == null) {
            return null;
        }
        return i.c(o2Var);
    }

    public void n0() {
        com.teslamotors.plugins.ble.j jVar = this.f28204x.get();
        if (jVar != null) {
            jVar.u(true);
        }
    }

    public j3 A() {
        return i.d(i.k(g2.RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE));
    }

    public void C() {
        this.f28200t.post(new c());
    }

    public void D(Peripheral peripheral, boolean z11) {
        this.f28200t.post(new d(z11));
    }

    public lv.a E(bu.m mVar, bu.o oVar) {
        n3 f11 = i.f(oVar);
        if (!B.contains(this.f28186f)) {
            b0(String.format("Skipped authentication response with token due to wrong state: %s", this.f28186f.name()));
            return null;
        }
        bu.n e11 = mVar.e();
        b0(String.format("Auth Response message built %s %s", oVar.c(), oVar.d()));
        if (e11 != null) {
            return F(f11, e11.c().E());
        }
        return F(f11, null);
    }

    public byte[] G(byte[] bArr, byte[] bArr2) {
        k2 k2Var;
        boolean z11 = this.f28188h && (k2Var = this.f28192l) != null && Arrays.equals(k2Var.d().E(), bArr2);
        if (this.f28189i && z11) {
            return zs.a.i(this.f28184d, bArr);
        }
        if (this.f28187g) {
            this.f28202v.p(bArr2);
            byte[] f11 = zs.a.f(this.f28202v.p(bArr2), this.f28182b);
            if (f11 != null) {
                return zs.a.i(f11, bArr);
            }
            return null;
        }
        return null;
    }

    public lv.a H(d0 d0Var) {
        n3 g11 = i.g(d0Var);
        if (A.contains(this.f28186f)) {
            return F(g11, null);
        }
        b0(String.format("Rejected command due to wrong state: %s", this.f28186f.name()));
        return null;
    }

    public lv.a I(g2 g2Var) {
        n3 k11 = i.k(g2Var);
        if (A.contains(this.f28186f)) {
            return F(k11, null);
        }
        b0(String.format("Rejected command due to wrong state: %s", this.f28186f.name()));
        return null;
    }

    public j3 J(String str) {
        okio.i s11 = okio.i.s(f0.a(str));
        okio.i iVar = okio.i.f42656d;
        return i.d(i.n(new xt.b(new xt.e(null, s11, iVar), iVar)));
    }

    public j3 K(c1 c1Var) {
        return L(c1Var, this.f28185e);
    }

    public j3 L(c1 c1Var, byte[] bArr) {
        if (bArr == null) {
            a0("keyIDInput is null, can't build ToVCSECMessage request message", new Exception("keyIDInput is null, can't build ToVCSECMessage request message"));
            return null;
        } else if (bArr.length == 0) {
            a0("keyIDInput length zero, can't build ToVCSECMessage request message", new Exception("keyIDInput length zero, can't build ToVCSECMessage request message"));
            return null;
        } else {
            okio.i s11 = okio.i.s(bArr);
            okio.i iVar = okio.i.f42656d;
            e1 e1Var = new e1(s11, iVar);
            b1 b1Var = new b1(c1Var, e1Var, null, null, iVar);
            if (this.f28185e != null && (c1Var == c1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO || c1Var == c1.INFORMATION_REQUEST_TYPE_GET_TOKEN || c1Var == c1.INFORMATION_REQUEST_TYPE_GET_COUNTER || c1Var == c1.INFORMATION_REQUEST_TYPE_GET_SESSION_DATA)) {
                b1Var = new b1(c1Var, e1Var, null, null, iVar);
            }
            return i.d(i.i(b1Var));
        }
    }

    public yt.f M(c1 c1Var) {
        j3 L = L(c1Var, this.f28185e);
        if (L == null || L.c() == null) {
            return null;
        }
        return i.a(yt.b.DOMAIN_VEHICLE_SECURITY, L.c().encode());
    }

    public Set<String> N() {
        HashSet hashSet = new HashSet();
        for (byte[] bArr : this.f28199s) {
            hashSet.add(f0.b(bArr));
        }
        return hashSet;
    }

    public lv.a O() {
        n3 j11 = i.j(new f1(d1.KEY_FORM_FACTOR_ANDROID_DEVICE, okio.i.f42656d));
        if (A.contains(this.f28186f)) {
            return F(j11, null);
        }
        b0(String.format("Skipped key metadata response due to wrong state: %s", this.f28186f.name()));
        return null;
    }

    public lv.a Q() {
        return R(bu.l.AUTHENTICATIONREJECTION_NONE);
    }

    public lv.a R(bu.l lVar) {
        n3 f11 = i.f(iv.b.a(lVar));
        if (A.contains(this.f28186f) || B.contains(this.f28186f)) {
            return F(f11, null);
        }
        b0(String.format("Skipped authentication response due to wrong state: %s", this.f28186f.name()));
        return null;
    }

    public byte[] S() {
        PublicKey publicKey = this.f28181a;
        if (publicKey == null) {
            return null;
        }
        return zs.a.t(publicKey);
    }

    public String T() {
        byte[] bArr = this.f28185e;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return f0.b(bArr);
    }

    public long U() {
        return this.f28193m.get();
    }

    public boolean W() {
        return this.f28188h;
    }

    public boolean X() {
        return this.f28184d != null;
    }

    public boolean Y() {
        return this.f28190j;
    }

    public void c0(p0 p0Var, Peripheral peripheral) {
        this.f28200t.post(new g(p0Var, peripheral));
    }

    public void e0(Peripheral peripheral) {
        this.f28200t.post(new e(peripheral));
    }

    public j3 f0() {
        return m0(V(false, zs.a.t(this.f28181a)));
    }

    public void h0() {
        this.f28200t.post(new f());
    }

    public void k0(Set<String> set) {
        this.f28199s = new CopyOnWriteArrayList();
        if (set == null) {
            return;
        }
        for (String str : set) {
            this.f28199s.add(f0.a(str));
        }
    }

    public void l0() {
        this.f28200t.post(new b());
    }

    public j3 z() {
        return m0(V(true, zs.a.t(this.f28181a)));
    }
}