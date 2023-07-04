package n4;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class c<D> {

    /* renamed from: a  reason: collision with root package name */
    int f40465a;

    /* renamed from: b  reason: collision with root package name */
    InterfaceC0792c<D> f40466b;

    /* renamed from: c  reason: collision with root package name */
    b<D> f40467c;

    /* renamed from: d  reason: collision with root package name */
    Context f40468d;

    /* renamed from: e  reason: collision with root package name */
    boolean f40469e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f40470f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f40471g = true;

    /* renamed from: h  reason: collision with root package name */
    boolean f40472h = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f40473i = false;

    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            c.this.o();
        }
    }

    /* loaded from: classes.dex */
    public interface b<D> {
        void a(c<D> cVar);
    }

    /* renamed from: n4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0792c<D> {
        void a(c<D> cVar, D d11);
    }

    public c(Context context) {
        this.f40468d = context.getApplicationContext();
    }

    public void a() {
        this.f40470f = true;
        m();
    }

    public boolean b() {
        return n();
    }

    public void c() {
        this.f40473i = false;
    }

    public String d(D d11) {
        StringBuilder sb2 = new StringBuilder(64);
        v3.b.a(d11, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    public void e() {
        b<D> bVar = this.f40467c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void f(D d11) {
        InterfaceC0792c<D> interfaceC0792c = this.f40466b;
        if (interfaceC0792c != null) {
            interfaceC0792c.a(this, d11);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f40465a);
        printWriter.print(" mListener=");
        printWriter.println(this.f40466b);
        if (this.f40469e || this.f40472h || this.f40473i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f40469e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f40472h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f40473i);
        }
        if (this.f40470f || this.f40471g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f40470f);
            printWriter.print(" mReset=");
            printWriter.println(this.f40471g);
        }
    }

    public void h() {
        p();
    }

    public Context i() {
        return this.f40468d;
    }

    public boolean j() {
        return this.f40470f;
    }

    public boolean k() {
        return this.f40471g;
    }

    public boolean l() {
        return this.f40469e;
    }

    protected void m() {
    }

    protected boolean n() {
        throw null;
    }

    public void o() {
        if (this.f40469e) {
            h();
        } else {
            this.f40472h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
    }

    protected void r() {
        throw null;
    }

    protected void s() {
        throw null;
    }

    public void t() {
        q();
        this.f40471g = true;
        this.f40469e = false;
        this.f40470f = false;
        this.f40472h = false;
        this.f40473i = false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        v3.b.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f40465a);
        sb2.append("}");
        return sb2.toString();
    }

    public void u() {
        if (this.f40473i) {
            o();
        }
    }

    public final void v() {
        this.f40469e = true;
        this.f40471g = false;
        this.f40470f = false;
        r();
    }

    public void w() {
        this.f40469e = false;
        s();
    }

    public boolean x() {
        boolean z11 = this.f40472h;
        this.f40472h = false;
        this.f40473i |= z11;
        return z11;
    }

    public void y(InterfaceC0792c<D> interfaceC0792c) {
        InterfaceC0792c<D> interfaceC0792c2 = this.f40466b;
        if (interfaceC0792c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0792c2 == interfaceC0792c) {
            this.f40466b = null;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
}