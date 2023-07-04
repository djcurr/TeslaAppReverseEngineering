package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final c f53767a;

    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final List<v.b> f53770a;

        /* renamed from: b  reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f53771b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f53772c;

        /* renamed from: d  reason: collision with root package name */
        private int f53773d;

        /* renamed from: e  reason: collision with root package name */
        private v.a f53774e = null;

        b(int i11, List<v.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f53773d = i11;
            this.f53770a = Collections.unmodifiableList(new ArrayList(list));
            this.f53771b = stateCallback;
            this.f53772c = executor;
        }

        @Override // v.g.c
        public Executor a() {
            return this.f53772c;
        }

        @Override // v.g.c
        public v.a b() {
            return this.f53774e;
        }

        @Override // v.g.c
        public CameraCaptureSession.StateCallback c() {
            return this.f53771b;
        }

        @Override // v.g.c
        public List<v.b> d() {
            return this.f53770a;
        }

        @Override // v.g.c
        public Object e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f53774e, bVar.f53774e) && this.f53773d == bVar.f53773d && this.f53770a.size() == bVar.f53770a.size()) {
                    for (int i11 = 0; i11 < this.f53770a.size(); i11++) {
                        if (!this.f53770a.get(i11).equals(bVar.f53770a.get(i11))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // v.g.c
        public int f() {
            return this.f53773d;
        }

        @Override // v.g.c
        public void g(CaptureRequest captureRequest) {
        }

        public int hashCode() {
            int hashCode = this.f53770a.hashCode() ^ 31;
            int i11 = (hashCode << 5) - hashCode;
            v.a aVar = this.f53774e;
            int hashCode2 = (aVar == null ? 0 : aVar.hashCode()) ^ i11;
            return this.f53773d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* loaded from: classes.dex */
    private interface c {
        Executor a();

        v.a b();

        CameraCaptureSession.StateCallback c();

        List<v.b> d();

        Object e();

        int f();

        void g(CaptureRequest captureRequest);
    }

    public g(int i11, List<v.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f53767a = new b(i11, list, executor, stateCallback);
        } else {
            this.f53767a = new a(i11, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> g(List<v.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (v.b bVar : list) {
            arrayList.add((OutputConfiguration) bVar.c());
        }
        return arrayList;
    }

    static List<v.b> h(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration outputConfiguration : list) {
            arrayList.add(v.b.d(outputConfiguration));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f53767a.a();
    }

    public v.a b() {
        return this.f53767a.b();
    }

    public List<v.b> c() {
        return this.f53767a.d();
    }

    public int d() {
        return this.f53767a.f();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f53767a.c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f53767a.equals(((g) obj).f53767a);
        }
        return false;
    }

    public void f(CaptureRequest captureRequest) {
        this.f53767a.g(captureRequest);
    }

    public int hashCode() {
        return this.f53767a.hashCode();
    }

    public Object i() {
        return this.f53767a.e();
    }

    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final SessionConfiguration f53768a;

        /* renamed from: b  reason: collision with root package name */
        private final List<v.b> f53769b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f53768a = sessionConfiguration;
            this.f53769b = Collections.unmodifiableList(g.h(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // v.g.c
        public Executor a() {
            return this.f53768a.getExecutor();
        }

        @Override // v.g.c
        public v.a b() {
            return v.a.b(this.f53768a.getInputConfiguration());
        }

        @Override // v.g.c
        public CameraCaptureSession.StateCallback c() {
            return this.f53768a.getStateCallback();
        }

        @Override // v.g.c
        public List<v.b> d() {
            return this.f53769b;
        }

        @Override // v.g.c
        public Object e() {
            return this.f53768a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f53768a, ((a) obj).f53768a);
            }
            return false;
        }

        @Override // v.g.c
        public int f() {
            return this.f53768a.getSessionType();
        }

        @Override // v.g.c
        public void g(CaptureRequest captureRequest) {
            this.f53768a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f53768a.hashCode();
        }

        a(int i11, List<v.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i11, g.g(list), executor, stateCallback));
        }
    }
}