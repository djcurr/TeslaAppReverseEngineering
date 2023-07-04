package fe;

import android.os.Handler;
import android.os.Looper;
import fe.a;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends fe.a {

    /* renamed from: b  reason: collision with root package name */
    private final Object f26205b = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f26209f = new a();

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<a.InterfaceC0515a> f26207d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<a.InterfaceC0515a> f26208e = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f26206c = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f26205b) {
                ArrayList arrayList = b.this.f26208e;
                b bVar = b.this;
                bVar.f26208e = bVar.f26207d;
                b.this.f26207d = arrayList;
            }
            int size = b.this.f26208e.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((a.InterfaceC0515a) b.this.f26208e.get(i11)).release();
            }
            b.this.f26208e.clear();
        }
    }

    @Override // fe.a
    public void a(a.InterfaceC0515a interfaceC0515a) {
        synchronized (this.f26205b) {
            this.f26207d.remove(interfaceC0515a);
        }
    }

    @Override // fe.a
    public void d(a.InterfaceC0515a interfaceC0515a) {
        if (!fe.a.c()) {
            interfaceC0515a.release();
            return;
        }
        synchronized (this.f26205b) {
            if (this.f26207d.contains(interfaceC0515a)) {
                return;
            }
            this.f26207d.add(interfaceC0515a);
            boolean z11 = true;
            if (this.f26207d.size() != 1) {
                z11 = false;
            }
            if (z11) {
                this.f26206c.post(this.f26209f);
            }
        }
    }
}