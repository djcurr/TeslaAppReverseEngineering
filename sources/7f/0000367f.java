package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f15638e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f15639a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f15640b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f15641c;

    /* renamed from: d  reason: collision with root package name */
    private c f15642d;

    /* loaded from: classes3.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0279b {
        void a(int i11);

        void show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<InterfaceC0279b> f15644a;

        /* renamed from: b  reason: collision with root package name */
        int f15645b;

        /* renamed from: c  reason: collision with root package name */
        boolean f15646c;

        c(int i11, InterfaceC0279b interfaceC0279b) {
            this.f15644a = new WeakReference<>(interfaceC0279b);
            this.f15645b = i11;
        }

        boolean a(InterfaceC0279b interfaceC0279b) {
            return interfaceC0279b != null && this.f15644a.get() == interfaceC0279b;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i11) {
        InterfaceC0279b interfaceC0279b = cVar.f15644a.get();
        if (interfaceC0279b != null) {
            this.f15640b.removeCallbacksAndMessages(cVar);
            interfaceC0279b.a(i11);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b c() {
        if (f15638e == null) {
            f15638e = new b();
        }
        return f15638e;
    }

    private boolean f(InterfaceC0279b interfaceC0279b) {
        c cVar = this.f15641c;
        return cVar != null && cVar.a(interfaceC0279b);
    }

    private boolean g(InterfaceC0279b interfaceC0279b) {
        c cVar = this.f15642d;
        return cVar != null && cVar.a(interfaceC0279b);
    }

    private void l(c cVar) {
        int i11 = cVar.f15645b;
        if (i11 == -2) {
            return;
        }
        if (i11 <= 0) {
            i11 = i11 == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.f15640b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f15640b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i11);
    }

    private void n() {
        c cVar = this.f15642d;
        if (cVar != null) {
            this.f15641c = cVar;
            this.f15642d = null;
            InterfaceC0279b interfaceC0279b = cVar.f15644a.get();
            if (interfaceC0279b != null) {
                interfaceC0279b.show();
            } else {
                this.f15641c = null;
            }
        }
    }

    public void b(InterfaceC0279b interfaceC0279b, int i11) {
        synchronized (this.f15639a) {
            if (f(interfaceC0279b)) {
                a(this.f15641c, i11);
            } else if (g(interfaceC0279b)) {
                a(this.f15642d, i11);
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f15639a) {
            if (this.f15641c == cVar || this.f15642d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(InterfaceC0279b interfaceC0279b) {
        boolean z11;
        synchronized (this.f15639a) {
            z11 = f(interfaceC0279b) || g(interfaceC0279b);
        }
        return z11;
    }

    public void h(InterfaceC0279b interfaceC0279b) {
        synchronized (this.f15639a) {
            if (f(interfaceC0279b)) {
                this.f15641c = null;
                if (this.f15642d != null) {
                    n();
                }
            }
        }
    }

    public void i(InterfaceC0279b interfaceC0279b) {
        synchronized (this.f15639a) {
            if (f(interfaceC0279b)) {
                l(this.f15641c);
            }
        }
    }

    public void j(InterfaceC0279b interfaceC0279b) {
        synchronized (this.f15639a) {
            if (f(interfaceC0279b)) {
                c cVar = this.f15641c;
                if (!cVar.f15646c) {
                    cVar.f15646c = true;
                    this.f15640b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void k(InterfaceC0279b interfaceC0279b) {
        synchronized (this.f15639a) {
            if (f(interfaceC0279b)) {
                c cVar = this.f15641c;
                if (cVar.f15646c) {
                    cVar.f15646c = false;
                    l(cVar);
                }
            }
        }
    }

    public void m(int i11, InterfaceC0279b interfaceC0279b) {
        synchronized (this.f15639a) {
            if (f(interfaceC0279b)) {
                c cVar = this.f15641c;
                cVar.f15645b = i11;
                this.f15640b.removeCallbacksAndMessages(cVar);
                l(this.f15641c);
                return;
            }
            if (g(interfaceC0279b)) {
                this.f15642d.f15645b = i11;
            } else {
                this.f15642d = new c(i11, interfaceC0279b);
            }
            c cVar2 = this.f15641c;
            if (cVar2 == null || !a(cVar2, 4)) {
                this.f15641c = null;
                n();
            }
        }
    }
}