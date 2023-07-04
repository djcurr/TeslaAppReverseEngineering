package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.h;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import n4.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f5234c = false;

    /* renamed from: a  reason: collision with root package name */
    private final v f5235a;

    /* renamed from: b  reason: collision with root package name */
    private final C0089b f5236b;

    /* loaded from: classes.dex */
    public static class a<D> extends f0<D> implements c.InterfaceC0792c<D> {

        /* renamed from: a  reason: collision with root package name */
        private final int f5237a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f5238b;

        /* renamed from: c  reason: collision with root package name */
        private final c<D> f5239c;

        /* renamed from: d  reason: collision with root package name */
        private v f5240d;

        /* renamed from: e  reason: collision with root package name */
        private c<D> f5241e;

        @Override // n4.c.InterfaceC0792c
        public void a(c<D> cVar, D d11) {
            if (b.f5234c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d11);
                return;
            }
            if (b.f5234c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d11);
        }

        c<D> b(boolean z11) {
            if (b.f5234c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f5239c.b();
            this.f5239c.a();
            this.f5239c.y(this);
            if (z11) {
                this.f5239c.t();
                return this.f5241e;
            }
            return this.f5239c;
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f5237a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f5238b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f5239c);
            c<D> cVar = this.f5239c;
            cVar.g(str + "  ", fileDescriptor, printWriter, strArr);
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(d().d(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        c<D> d() {
            return this.f5239c;
        }

        void e() {
        }

        @Override // androidx.lifecycle.LiveData
        protected void onActive() {
            if (b.f5234c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f5239c.v();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (b.f5234c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f5239c.w();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(g0<? super D> g0Var) {
            super.removeObserver(g0Var);
            this.f5240d = null;
        }

        @Override // androidx.lifecycle.f0, androidx.lifecycle.LiveData
        public void setValue(D d11) {
            super.setValue(d11);
            c<D> cVar = this.f5241e;
            if (cVar != null) {
                cVar.t();
                this.f5241e = null;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f5237a);
            sb2.append(" : ");
            v3.b.a(this.f5239c, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0089b extends p0 {

        /* renamed from: b  reason: collision with root package name */
        private static final s0.b f5242b = new a();

        /* renamed from: a  reason: collision with root package name */
        private h<a> f5243a = new h<>();

        /* renamed from: androidx.loader.app.b$b$a */
        /* loaded from: classes.dex */
        static class a implements s0.b {
            a() {
            }

            @Override // androidx.lifecycle.s0.b
            public <T extends p0> T create(Class<T> cls) {
                return new C0089b();
            }
        }

        C0089b() {
        }

        static C0089b g(t0 t0Var) {
            return (C0089b) new s0(t0Var, f5242b).a(C0089b.class);
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f5243a.p() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i11 = 0; i11 < this.f5243a.p(); i11++) {
                    a q11 = this.f5243a.q(i11);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f5243a.k(i11));
                    printWriter.print(": ");
                    printWriter.println(q11.toString());
                    q11.c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void h() {
            int p11 = this.f5243a.p();
            for (int i11 = 0; i11 < p11; i11++) {
                this.f5243a.q(i11).e();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.p0
        public void onCleared() {
            super.onCleared();
            int p11 = this.f5243a.p();
            for (int i11 = 0; i11 < p11; i11++) {
                this.f5243a.q(i11).b(true);
            }
            this.f5243a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(v vVar, t0 t0Var) {
        this.f5235a = vVar;
        this.f5236b = C0089b.g(t0Var);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f5236b.c(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f5236b.h();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        v3.b.a(this.f5235a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}