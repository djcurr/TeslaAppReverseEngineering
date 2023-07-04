package nj;

import ak.k0;
import ak.o;
import ak.r;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ci.n;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class l extends ci.a implements Handler.Callback {
    private j A;
    private j B;
    private int C;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f41730l;

    /* renamed from: m  reason: collision with root package name */
    private final k f41731m;

    /* renamed from: n  reason: collision with root package name */
    private final h f41732n;

    /* renamed from: o  reason: collision with root package name */
    private final ci.j f41733o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f41734p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f41735q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f41736t;

    /* renamed from: w  reason: collision with root package name */
    private int f41737w;

    /* renamed from: x  reason: collision with root package name */
    private ci.i f41738x;

    /* renamed from: y  reason: collision with root package name */
    private g f41739y;

    /* renamed from: z  reason: collision with root package name */
    private i f41740z;

    public l(k kVar, Looper looper) {
        this(kVar, looper, h.f41726a);
    }

    private void Q() {
        Y(Collections.emptyList());
    }

    private long R() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        ak.a.e(this.A);
        if (this.C >= this.A.d()) {
            return Long.MAX_VALUE;
        }
        return this.A.c(this.C);
    }

    private void S(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.f41738x);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(valueOf);
        o.d("TextRenderer", sb2.toString(), subtitleDecoderException);
        Q();
        X();
    }

    private void T() {
        this.f41736t = true;
        this.f41739y = this.f41732n.b((ci.i) ak.a.e(this.f41738x));
    }

    private void U(List<b> list) {
        this.f41731m.w(list);
    }

    private void V() {
        this.f41740z = null;
        this.C = -1;
        j jVar = this.A;
        if (jVar != null) {
            jVar.q();
            this.A = null;
        }
        j jVar2 = this.B;
        if (jVar2 != null) {
            jVar2.q();
            this.B = null;
        }
    }

    private void W() {
        V();
        ((g) ak.a.e(this.f41739y)).release();
        this.f41739y = null;
        this.f41737w = 0;
    }

    private void X() {
        W();
        T();
    }

    private void Y(List<b> list) {
        Handler handler = this.f41730l;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            U(list);
        }
    }

    @Override // ci.a
    protected void H() {
        this.f41738x = null;
        Q();
        W();
    }

    @Override // ci.a
    protected void J(long j11, boolean z11) {
        Q();
        this.f41734p = false;
        this.f41735q = false;
        if (this.f41737w != 0) {
            X();
            return;
        }
        V();
        ((g) ak.a.e(this.f41739y)).flush();
    }

    @Override // ci.a
    protected void N(ci.i[] iVarArr, long j11, long j12) {
        this.f41738x = iVarArr[0];
        if (this.f41739y != null) {
            this.f41737w = 1;
        } else {
            T();
        }
    }

    @Override // ci.n
    public int a(ci.i iVar) {
        if (this.f41732n.a(iVar)) {
            return n.l(iVar.L == null ? 4 : 2);
        } else if (r.r(iVar.f9205l)) {
            return n.l(1);
        } else {
            return n.l(0);
        }
    }

    @Override // com.google.android.exoplayer2.v0
    public boolean c() {
        return this.f41735q;
    }

    @Override // com.google.android.exoplayer2.v0, ci.n
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            U((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.v0
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.v0
    public void v(long j11, long j12) {
        boolean z11;
        if (this.f41735q) {
            return;
        }
        if (this.B == null) {
            ((g) ak.a.e(this.f41739y)).a(j11);
            try {
                this.B = ((g) ak.a.e(this.f41739y)).b();
            } catch (SubtitleDecoderException e11) {
                S(e11);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.A != null) {
            long R = R();
            z11 = false;
            while (R <= j11) {
                this.C++;
                R = R();
                z11 = true;
            }
        } else {
            z11 = false;
        }
        j jVar = this.B;
        if (jVar != null) {
            if (jVar.l()) {
                if (!z11 && R() == Long.MAX_VALUE) {
                    if (this.f41737w == 2) {
                        X();
                    } else {
                        V();
                        this.f41735q = true;
                    }
                }
            } else if (jVar.f26274b <= j11) {
                j jVar2 = this.A;
                if (jVar2 != null) {
                    jVar2.q();
                }
                this.C = jVar.a(j11);
                this.A = jVar;
                this.B = null;
                z11 = true;
            }
        }
        if (z11) {
            ak.a.e(this.A);
            Y(this.A.b(j11));
        }
        if (this.f41737w == 2) {
            return;
        }
        while (!this.f41734p) {
            try {
                i iVar = this.f41740z;
                if (iVar == null) {
                    iVar = ((g) ak.a.e(this.f41739y)).d();
                    if (iVar == null) {
                        return;
                    }
                    this.f41740z = iVar;
                }
                if (this.f41737w == 1) {
                    iVar.o(4);
                    ((g) ak.a.e(this.f41739y)).c(iVar);
                    this.f41740z = null;
                    this.f41737w = 2;
                    return;
                }
                int O = O(this.f41733o, iVar, false);
                if (O == -4) {
                    if (iVar.l()) {
                        this.f41734p = true;
                        this.f41736t = false;
                    } else {
                        ci.i iVar2 = this.f41733o.f9243b;
                        if (iVar2 == null) {
                            return;
                        }
                        iVar.f41727i = iVar2.f9209p;
                        iVar.s();
                        this.f41736t &= !iVar.n();
                    }
                    if (!this.f41736t) {
                        ((g) ak.a.e(this.f41739y)).c(iVar);
                        this.f41740z = null;
                    }
                } else if (O == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e12) {
                S(e12);
                return;
            }
        }
    }

    public l(k kVar, Looper looper, h hVar) {
        super(3);
        this.f41731m = (k) ak.a.e(kVar);
        this.f41730l = looper == null ? null : k0.w(looper, this);
        this.f41732n = hVar;
        this.f41733o = new ci.j();
    }
}