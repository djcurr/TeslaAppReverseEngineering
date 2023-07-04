package ee;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import de.i;
import java.io.Closeable;
import md.k;
import md.n;
import nf.h;
import xe.b;

/* loaded from: classes.dex */
public class a extends xe.a<h> implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final td.b f25063a;

    /* renamed from: b  reason: collision with root package name */
    private final i f25064b;

    /* renamed from: c  reason: collision with root package name */
    private final de.h f25065c;

    /* renamed from: d  reason: collision with root package name */
    private final n<Boolean> f25066d;

    /* renamed from: e  reason: collision with root package name */
    private final n<Boolean> f25067e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f25068f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ee.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class HandlerC0483a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final de.h f25069a;

        public HandlerC0483a(Looper looper, de.h hVar) {
            super(looper);
            this.f25069a = hVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            i iVar = (i) k.g(message.obj);
            int i11 = message.what;
            if (i11 == 1) {
                this.f25069a.b(iVar, message.arg1);
            } else if (i11 != 2) {
            } else {
                this.f25069a.a(iVar, message.arg1);
            }
        }
    }

    public a(td.b bVar, i iVar, de.h hVar, n<Boolean> nVar, n<Boolean> nVar2) {
        this.f25063a = bVar;
        this.f25064b = iVar;
        this.f25065c = hVar;
        this.f25066d = nVar;
        this.f25067e = nVar2;
    }

    private synchronized void C() {
        if (this.f25068f != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
        handlerThread.start();
        this.f25068f = new HandlerC0483a((Looper) k.g(handlerThread.getLooper()), this.f25065c);
    }

    private i D() {
        return this.f25067e.get().booleanValue() ? new i() : this.f25064b;
    }

    private void R(i iVar, long j11) {
        iVar.A(false);
        iVar.t(j11);
        t0(iVar, 2);
    }

    private boolean n0() {
        boolean booleanValue = this.f25066d.get().booleanValue();
        if (booleanValue && this.f25068f == null) {
            C();
        }
        return booleanValue;
    }

    private void p0(i iVar, int i11) {
        if (n0()) {
            Message obtainMessage = ((Handler) k.g(this.f25068f)).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i11;
            obtainMessage.obj = iVar;
            this.f25068f.sendMessage(obtainMessage);
            return;
        }
        this.f25065c.b(iVar, i11);
    }

    private void t0(i iVar, int i11) {
        if (n0()) {
            Message obtainMessage = ((Handler) k.g(this.f25068f)).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = i11;
            obtainMessage.obj = iVar;
            this.f25068f.sendMessage(obtainMessage);
            return;
        }
        this.f25065c.a(iVar, i11);
    }

    @Override // xe.a, xe.b
    /* renamed from: J */
    public void m(String str, h hVar, b.a aVar) {
        long now = this.f25063a.now();
        i D = D();
        D.m(aVar);
        D.g(now);
        D.r(now);
        D.h(str);
        D.n(hVar);
        p0(D, 3);
    }

    @Override // xe.a, xe.b
    /* renamed from: L */
    public void a(String str, h hVar) {
        long now = this.f25063a.now();
        i D = D();
        D.j(now);
        D.h(str);
        D.n(hVar);
        p0(D, 2);
    }

    public void a0(i iVar, long j11) {
        iVar.A(true);
        iVar.z(j11);
        t0(iVar, 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0();
    }

    public void e0() {
        D().b();
    }

    @Override // xe.a, xe.b
    public void g(String str, Object obj, b.a aVar) {
        long now = this.f25063a.now();
        i D = D();
        D.c();
        D.k(now);
        D.h(str);
        D.d(obj);
        D.m(aVar);
        p0(D, 0);
        a0(D, now);
    }

    @Override // xe.a, xe.b
    public void j(String str, Throwable th2, b.a aVar) {
        long now = this.f25063a.now();
        i D = D();
        D.m(aVar);
        D.f(now);
        D.h(str);
        D.l(th2);
        p0(D, 5);
        R(D, now);
    }

    @Override // xe.a, xe.b
    public void l(String str, b.a aVar) {
        long now = this.f25063a.now();
        i D = D();
        D.m(aVar);
        D.h(str);
        int a11 = D.a();
        if (a11 != 3 && a11 != 5 && a11 != 6) {
            D.e(now);
            p0(D, 4);
        }
        R(D, now);
    }
}