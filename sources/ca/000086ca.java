package mh;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
abstract class h {

    /* renamed from: e  reason: collision with root package name */
    static final SparseIntArray f38594e;

    /* renamed from: a  reason: collision with root package name */
    private final OrientationEventListener f38595a;

    /* renamed from: b  reason: collision with root package name */
    Display f38596b;

    /* renamed from: c  reason: collision with root package name */
    private int f38597c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f38598d = 0;

    /* loaded from: classes3.dex */
    class a extends OrientationEventListener {

        /* renamed from: a  reason: collision with root package name */
        private int f38599a;

        a(Context context) {
            super(context);
            this.f38599a = -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        @Override // android.view.OrientationEventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onOrientationChanged(int r6) {
            /*
                r5 = this;
                r0 = -1
                if (r6 == r0) goto L58
                mh.h r0 = mh.h.this
                android.view.Display r1 = r0.f38596b
                if (r1 != 0) goto La
                goto L58
            La:
                r1 = 315(0x13b, float:4.41E-43)
                r2 = 0
                if (r6 > r1) goto L2d
                r3 = 45
                if (r6 >= r3) goto L14
                goto L2d
            L14:
                r4 = 135(0x87, float:1.89E-43)
                if (r6 <= r3) goto L1d
                if (r6 >= r4) goto L1d
                r6 = 90
                goto L2e
            L1d:
                r3 = 225(0xe1, float:3.15E-43)
                if (r6 <= r4) goto L26
                if (r6 >= r3) goto L26
                r6 = 180(0xb4, float:2.52E-43)
                goto L2e
            L26:
                if (r6 <= r3) goto L2d
                if (r6 >= r1) goto L2d
                r6 = 270(0x10e, float:3.78E-43)
                goto L2e
            L2d:
                r6 = r2
            L2e:
                int r0 = mh.h.a(r0)
                r1 = 1
                if (r0 == r6) goto L3b
                mh.h r0 = mh.h.this
                mh.h.b(r0, r6)
                r2 = r1
            L3b:
                mh.h r6 = mh.h.this
                android.view.Display r6 = r6.f38596b
                int r6 = r6.getRotation()
                int r0 = r5.f38599a
                if (r0 == r6) goto L4a
                r5.f38599a = r6
                goto L4b
            L4a:
                r1 = r2
            L4b:
                if (r1 == 0) goto L58
                mh.h r0 = mh.h.this
                android.util.SparseIntArray r1 = mh.h.f38594e
                int r6 = r1.get(r6)
                r0.d(r6)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mh.h.a.onOrientationChanged(int):void");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38594e = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 90);
        sparseIntArray.put(2, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
        sparseIntArray.put(3, 270);
    }

    public h(Context context) {
        this.f38595a = new a(context);
    }

    public void c() {
        this.f38595a.disable();
        this.f38596b = null;
    }

    void d(int i11) {
        this.f38597c = i11;
        g(i11, this.f38598d);
    }

    public void e(Display display) {
        this.f38596b = display;
        this.f38595a.enable();
        d(f38594e.get(display.getRotation()));
    }

    public int f() {
        return this.f38597c;
    }

    public abstract void g(int i11, int i12);
}