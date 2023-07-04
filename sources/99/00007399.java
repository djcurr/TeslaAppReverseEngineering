package hp;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final uo.b f29359a;

    /* renamed from: b  reason: collision with root package name */
    private final l f29360b;

    /* renamed from: c  reason: collision with root package name */
    private final l f29361c;

    /* renamed from: d  reason: collision with root package name */
    private final l f29362d;

    /* renamed from: e  reason: collision with root package name */
    private final l f29363e;

    /* renamed from: f  reason: collision with root package name */
    private final int f29364f;

    /* renamed from: g  reason: collision with root package name */
    private final int f29365g;

    /* renamed from: h  reason: collision with root package name */
    private final int f29366h;

    /* renamed from: i  reason: collision with root package name */
    private final int f29367i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(uo.b bVar, l lVar, l lVar2, l lVar3, l lVar4) {
        boolean z11 = false;
        boolean z12 = lVar == null || lVar2 == null;
        z11 = (lVar3 == null || lVar4 == null) ? true : z11;
        if (z12 && z11) {
            throw NotFoundException.a();
        }
        if (z12) {
            lVar = new l(BitmapDescriptorFactory.HUE_RED, lVar3.d());
            lVar2 = new l(BitmapDescriptorFactory.HUE_RED, lVar4.d());
        } else if (z11) {
            lVar3 = new l(bVar.j() - 1, lVar.d());
            lVar4 = new l(bVar.j() - 1, lVar2.d());
        }
        this.f29359a = bVar;
        this.f29360b = lVar;
        this.f29361c = lVar2;
        this.f29362d = lVar3;
        this.f29363e = lVar4;
        this.f29364f = (int) Math.min(lVar.c(), lVar2.c());
        this.f29365g = (int) Math.max(lVar3.c(), lVar4.c());
        this.f29366h = (int) Math.min(lVar.d(), lVar3.d());
        this.f29367i = (int) Math.max(lVar2.d(), lVar4.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c j(c cVar, c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f29359a, cVar.f29360b, cVar.f29361c, cVar2.f29362d, cVar2.f29363e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hp.c a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            com.google.zxing.l r0 = r12.f29360b
            com.google.zxing.l r1 = r12.f29361c
            com.google.zxing.l r2 = r12.f29362d
            com.google.zxing.l r3 = r12.f29363e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.google.zxing.l r13 = new com.google.zxing.l
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            com.google.zxing.l r13 = r12.f29361c
            goto L34
        L32:
            com.google.zxing.l r13 = r12.f29363e
        L34:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            uo.b r14 = r12.f29359a
            int r14 = r14.g()
            if (r0 < r14) goto L4a
            uo.b r14 = r12.f29359a
            int r14 = r14.g()
            int r0 = r14 + (-1)
        L4a:
            com.google.zxing.l r14 = new com.google.zxing.l
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            hp.c r13 = new hp.c
            uo.b r7 = r12.f29359a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.c.a(int, int, boolean):hp.c");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l b() {
        return this.f29361c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l c() {
        return this.f29363e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f29365g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f29367i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f29364f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f29366h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l h() {
        return this.f29360b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l i() {
        return this.f29362d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(c cVar) {
        this.f29359a = cVar.f29359a;
        this.f29360b = cVar.h();
        this.f29361c = cVar.b();
        this.f29362d = cVar.i();
        this.f29363e = cVar.c();
        this.f29364f = cVar.f();
        this.f29365g = cVar.d();
        this.f29366h = cVar.g();
        this.f29367i = cVar.e();
    }
}