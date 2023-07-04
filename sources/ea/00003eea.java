package com.lwansbrough.RCTCamera;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final OrientationEventListener f17884a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f17885b;

    /* renamed from: c  reason: collision with root package name */
    private d f17886c;

    /* renamed from: d  reason: collision with root package name */
    private int f17887d;

    /* renamed from: e  reason: collision with root package name */
    private int f17888e;

    /* renamed from: f  reason: collision with root package name */
    private int f17889f;

    /* renamed from: g  reason: collision with root package name */
    private int f17890g;

    /* renamed from: h  reason: collision with root package name */
    private int f17891h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17892i;

    /* loaded from: classes2.dex */
    class a extends OrientationEventListener {
        a(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i11) {
            c cVar = c.this;
            if (cVar.g(cVar.f17885b)) {
                c.this.e();
            }
        }
    }

    public c(Context context) {
        super(context);
        this.f17886c = null;
        this.f17887d = -1;
        this.f17888e = 1;
        this.f17889f = -1;
        this.f17890g = -1;
        this.f17891h = 0;
        this.f17892i = false;
        this.f17885b = context;
        com.lwansbrough.RCTCamera.a.d(d(context));
        a aVar = new a(context, 3);
        this.f17884a = aVar;
        if (aVar.canDetectOrientation()) {
            aVar.enable();
        } else {
            aVar.disable();
        }
    }

    private int d(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        f(getLeft(), getTop(), getRight(), getBottom());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r0 > r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 < r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r9 = (int) (r2 / r8);
        r8 = (int) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        r8 = (int) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            com.lwansbrough.RCTCamera.d r0 = r5.f17886c
            if (r0 != 0) goto L5
            return
        L5:
            int r8 = r8 - r6
            float r6 = (float) r8
            int r9 = r9 - r7
            float r7 = (float) r9
            int r8 = r5.f17888e
            if (r8 == 0) goto L1f
            r9 = 1
            if (r8 == r9) goto L13
            int r8 = (int) r6
        L11:
            int r9 = (int) r7
            goto L30
        L13:
            double r8 = r0.f()
            double r0 = (double) r7
            double r0 = r0 * r8
            double r2 = (double) r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2e
            goto L2a
        L1f:
            double r8 = r0.f()
            double r0 = (double) r7
            double r0 = r0 * r8
            double r2 = (double) r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2e
        L2a:
            double r2 = r2 / r8
            int r9 = (int) r2
            int r8 = (int) r6
            goto L30
        L2e:
            int r8 = (int) r0
            goto L11
        L30:
            float r0 = (float) r8
            float r0 = r6 - r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            float r2 = (float) r9
            float r2 = r7 - r2
            float r2 = r2 / r1
            int r1 = (int) r2
            com.lwansbrough.RCTCamera.a r2 = com.lwansbrough.RCTCamera.a.h()
            com.lwansbrough.RCTCamera.d r3 = r5.f17886c
            int r3 = r3.d()
            int r6 = (int) r6
            int r7 = (int) r7
            r2.A(r3, r6, r7)
            com.lwansbrough.RCTCamera.d r6 = r5.f17886c
            int r8 = r8 + r0
            int r9 = r9 + r1
            r6.layout(r0, r1, r8, r9)
            int r6 = r5.getLeft()
            int r7 = r5.getTop()
            int r8 = r5.getRight()
            int r9 = r5.getBottom()
            r5.postInvalidate(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.c.f(int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Context context) {
        int d11 = d(context);
        if (this.f17887d != d11) {
            this.f17887d = d11;
            com.lwansbrough.RCTCamera.a.h().r(this.f17887d);
            return true;
        }
        return false;
    }

    public void h() {
        d dVar = this.f17886c;
        if (dVar == null) {
            return;
        }
        dVar.s();
    }

    public void i() {
        d dVar = this.f17886c;
        if (dVar == null) {
            return;
        }
        dVar.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        f(i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        d dVar = this.f17886c;
        if (dVar == view) {
            return;
        }
        removeView(dVar);
        addView(this.f17886c, 0);
    }

    public void setAspect(int i11) {
        this.f17888e = i11;
        e();
    }

    public void setBarCodeTypes(List<String> list) {
        com.lwansbrough.RCTCamera.a.h().t(list);
    }

    public void setBarcodeScannerEnabled(boolean z11) {
        com.lwansbrough.RCTCamera.a.h().u(z11);
    }

    public void setCameraType(int i11) {
        d dVar = this.f17886c;
        if (dVar != null) {
            dVar.k(i11);
            com.lwansbrough.RCTCamera.a.h().c(i11);
            return;
        }
        d dVar2 = new d(this.f17885b, i11);
        this.f17886c = dVar2;
        int i12 = this.f17890g;
        if (-1 != i12) {
            dVar2.o(i12);
        }
        int i13 = this.f17889f;
        if (-1 != i13) {
            this.f17886c.p(i13);
        }
        int i14 = this.f17891h;
        if (i14 != 0) {
            this.f17886c.q(i14);
        }
        this.f17886c.n(this.f17892i);
        addView(this.f17886c);
    }

    public void setCaptureMode(int i11) {
        d dVar = this.f17886c;
        if (dVar != null) {
            dVar.l(i11);
        }
    }

    public void setCaptureQuality(String str) {
        d dVar = this.f17886c;
        if (dVar != null) {
            dVar.m(str);
        }
    }

    public void setClearWindowBackground(boolean z11) {
        this.f17892i = z11;
        d dVar = this.f17886c;
        if (dVar != null) {
            dVar.n(z11);
        }
    }

    public void setFlashMode(int i11) {
        this.f17890g = i11;
        d dVar = this.f17886c;
        if (dVar != null) {
            dVar.o(i11);
        }
    }

    public void setOrientation(int i11) {
        com.lwansbrough.RCTCamera.a.h().z(i11);
        if (this.f17886c != null) {
            e();
        }
    }

    public void setTorchMode(int i11) {
        this.f17889f = i11;
        d dVar = this.f17886c;
        if (dVar != null) {
            dVar.p(i11);
        }
    }

    public void setZoom(int i11) {
        this.f17891h = i11;
        d dVar = this.f17886c;
        if (dVar != null) {
            dVar.q(i11);
        }
    }
}