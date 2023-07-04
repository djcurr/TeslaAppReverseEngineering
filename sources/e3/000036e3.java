package com.google.android.vending.expansion.downloader.impl;

import al.f;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Messenger;
import androidx.core.app.j;
import org.godotengine.godot.R;

/* loaded from: classes3.dex */
public class c implements f {

    /* renamed from: m  reason: collision with root package name */
    static final int f15854m = -908767821;

    /* renamed from: a  reason: collision with root package name */
    private int f15855a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final Context f15856b;

    /* renamed from: c  reason: collision with root package name */
    private final NotificationManager f15857c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f15858d;

    /* renamed from: e  reason: collision with root package name */
    private f f15859e;

    /* renamed from: f  reason: collision with root package name */
    private j.e f15860f;

    /* renamed from: g  reason: collision with root package name */
    private j.e f15861g;

    /* renamed from: h  reason: collision with root package name */
    private j.e f15862h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f15863i;

    /* renamed from: j  reason: collision with root package name */
    private String f15864j;

    /* renamed from: k  reason: collision with root package name */
    private al.b f15865k;

    /* renamed from: l  reason: collision with root package name */
    private PendingIntent f15866l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, CharSequence charSequence) {
        this.f15856b = context;
        this.f15863i = charSequence;
        this.f15857c = (NotificationManager) context.getSystemService("notification");
        this.f15860f = new j.e(context);
        this.f15861g = new j.e(context);
        this.f15860f.x(-1);
        this.f15860f.g("progress");
        this.f15861g.x(-1);
        this.f15861g.g("progress");
        this.f15862h = this.f15861g;
    }

    public void a() {
        f fVar = this.f15859e;
        if (fVar != null) {
            fVar.onDownloadStateChanged(this.f15855a);
        }
    }

    public void b(PendingIntent pendingIntent) {
        this.f15861g.k(pendingIntent);
        this.f15860f.k(pendingIntent);
        this.f15866l = pendingIntent;
    }

    public void c(Messenger messenger) {
        f a11 = al.c.a(messenger);
        this.f15859e = a11;
        al.b bVar = this.f15865k;
        if (bVar != null) {
            a11.onDownloadProgress(bVar);
        }
        int i11 = this.f15855a;
        if (i11 != -1) {
            this.f15859e.onDownloadStateChanged(i11);
        }
    }

    @Override // al.f
    public void onDownloadProgress(al.b bVar) {
        this.f15865k = bVar;
        f fVar = this.f15859e;
        if (fVar != null) {
            fVar.onDownloadProgress(bVar);
        }
        long j11 = bVar.f553a;
        if (j11 <= 0) {
            this.f15861g.D(this.f15858d);
            this.f15861g.A(17301633);
            this.f15861g.m(this.f15858d);
            this.f15861g.l(this.f15864j);
            this.f15862h = this.f15861g;
        } else {
            this.f15860f.y((int) j11, (int) bVar.f554b, false);
            this.f15860f.l(al.e.d(bVar.f554b, bVar.f553a));
            this.f15860f.A(17301633);
            j.e eVar = this.f15860f;
            eVar.D(((Object) this.f15863i) + ": " + this.f15864j);
            this.f15860f.m(this.f15863i);
            this.f15860f.j(this.f15856b.getString(R.string.time_remaining_notification, al.e.i(bVar.f555c)));
            this.f15862h = this.f15860f;
        }
        this.f15857c.notify(f15854m, this.f15862h.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    @Override // al.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDownloadStateChanged(int r7) {
        /*
            r6 = this;
            al.f r0 = r6.f15859e
            if (r0 == 0) goto L7
            r0.onDownloadStateChanged(r7)
        L7:
            int r0 = r6.f15855a
            if (r7 == r0) goto Laf
            r6.f15855a = r7
            r0 = 1
            if (r7 == r0) goto Laf
            android.app.PendingIntent r1 = r6.f15866l
            if (r1 != 0) goto L16
            goto Laf
        L16:
            r1 = 17301634(0x1080082, float:2.497962E-38)
            r2 = 17301642(0x108008a, float:2.4979642E-38)
            r3 = 0
            if (r7 == 0) goto L4f
            r4 = 7
            if (r7 == r4) goto L4a
            r4 = 2
            if (r7 == r4) goto L45
            r4 = 3
            if (r7 == r4) goto L45
            r4 = 4
            if (r7 == r4) goto L3d
            r4 = 5
            if (r7 == r4) goto L4a
            switch(r7) {
                case 15: goto L38;
                case 16: goto L38;
                case 17: goto L38;
                case 18: goto L38;
                case 19: goto L38;
                default: goto L31;
            }
        L31:
            int r7 = al.e.e(r7)
            r1 = r2
        L36:
            r2 = r0
            goto L53
        L38:
            int r7 = al.e.e(r7)
            goto L51
        L3d:
            r1 = 17301633(0x1080081, float:2.4979616E-38)
            int r7 = al.e.e(r7)
            goto L36
        L45:
            int r7 = al.e.e(r7)
            goto L36
        L4a:
            int r7 = al.e.e(r7)
            goto L52
        L4f:
            int r7 = org.godotengine.godot.R.string.state_unknown
        L51:
            r1 = r2
        L52:
            r2 = r3
        L53:
            android.content.Context r4 = r6.f15856b
            java.lang.String r7 = r4.getString(r7)
            r6.f15864j = r7
            java.lang.CharSequence r7 = r6.f15863i
            r6.f15858d = r7
            androidx.core.app.j$e r7 = r6.f15862h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.CharSequence r5 = r6.f15863i
            r4.append(r5)
            java.lang.String r5 = ": "
            r4.append(r5)
            java.lang.String r5 = r6.f15864j
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r7.D(r4)
            androidx.core.app.j$e r7 = r6.f15862h
            r7.A(r1)
            androidx.core.app.j$e r7 = r6.f15862h
            java.lang.CharSequence r1 = r6.f15858d
            r7.m(r1)
            androidx.core.app.j$e r7 = r6.f15862h
            java.lang.String r1 = r6.f15864j
            r7.l(r1)
            if (r2 == 0) goto L97
            androidx.core.app.j$e r7 = r6.f15862h
            r7.v(r0)
            goto La1
        L97:
            androidx.core.app.j$e r7 = r6.f15862h
            r7.v(r3)
            androidx.core.app.j$e r7 = r6.f15862h
            r7.f(r0)
        La1:
            android.app.NotificationManager r7 = r6.f15857c
            int r0 = com.google.android.vending.expansion.downloader.impl.c.f15854m
            androidx.core.app.j$e r1 = r6.f15862h
            android.app.Notification r1 = r1.b()
            r7.notify(r0, r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.c.onDownloadStateChanged(int):void");
    }

    @Override // al.f
    public void onServiceConnected(Messenger messenger) {
    }
}