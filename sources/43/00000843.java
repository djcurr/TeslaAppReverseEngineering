package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    final a f5696a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        a.b a(int i11, int i12, int i13, Object obj);

        void b(a.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(a aVar) {
        this.f5696a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z11 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f5466a != 8) {
                z11 = true;
            } else if (z11) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i11, a.b bVar, int i12, a.b bVar2) {
        int i13 = bVar.f5469d;
        int i14 = bVar2.f5467b;
        int i15 = i13 < i14 ? -1 : 0;
        int i16 = bVar.f5467b;
        if (i16 < i14) {
            i15++;
        }
        if (i14 <= i16) {
            bVar.f5467b = i16 + bVar2.f5469d;
        }
        int i17 = bVar2.f5467b;
        if (i17 <= i13) {
            bVar.f5469d = i13 + bVar2.f5469d;
        }
        bVar2.f5467b = i17 + i15;
        list.set(i11, bVar2);
        list.set(i12, bVar);
    }

    private void d(List<a.b> list, int i11, int i12) {
        a.b bVar = list.get(i11);
        a.b bVar2 = list.get(i12);
        int i13 = bVar2.f5466a;
        if (i13 == 1) {
            c(list, i11, bVar, i12, bVar2);
        } else if (i13 == 2) {
            e(list, i11, bVar, i12, bVar2);
        } else if (i13 != 4) {
        } else {
            f(list, i11, bVar, i12, bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(List<a.b> list) {
        while (true) {
            int a11 = a(list);
            if (a11 == -1) {
                return;
            }
            d(list, a11, a11 + 1);
        }
    }

    void e(List<a.b> list, int i11, a.b bVar, int i12, a.b bVar2) {
        boolean z11;
        int i13 = bVar.f5467b;
        int i14 = bVar.f5469d;
        boolean z12 = false;
        if (i13 < i14) {
            if (bVar2.f5467b == i13 && bVar2.f5469d == i14 - i13) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
            }
        } else if (bVar2.f5467b == i14 + 1 && bVar2.f5469d == i13 - i14) {
            z11 = true;
            z12 = true;
        } else {
            z11 = true;
        }
        int i15 = bVar2.f5467b;
        if (i14 < i15) {
            bVar2.f5467b = i15 - 1;
        } else {
            int i16 = bVar2.f5469d;
            if (i14 < i15 + i16) {
                bVar2.f5469d = i16 - 1;
                bVar.f5466a = 2;
                bVar.f5469d = 1;
                if (bVar2.f5469d == 0) {
                    list.remove(i12);
                    this.f5696a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i17 = bVar.f5467b;
        int i18 = bVar2.f5467b;
        a.b bVar3 = null;
        if (i17 <= i18) {
            bVar2.f5467b = i18 + 1;
        } else {
            int i19 = bVar2.f5469d;
            if (i17 < i18 + i19) {
                bVar3 = this.f5696a.a(2, i17 + 1, (i18 + i19) - i17, null);
                bVar2.f5469d = bVar.f5467b - bVar2.f5467b;
            }
        }
        if (z12) {
            list.set(i11, bVar2);
            list.remove(i12);
            this.f5696a.b(bVar);
            return;
        }
        if (z11) {
            if (bVar3 != null) {
                int i21 = bVar.f5467b;
                if (i21 > bVar3.f5467b) {
                    bVar.f5467b = i21 - bVar3.f5469d;
                }
                int i22 = bVar.f5469d;
                if (i22 > bVar3.f5467b) {
                    bVar.f5469d = i22 - bVar3.f5469d;
                }
            }
            int i23 = bVar.f5467b;
            if (i23 > bVar2.f5467b) {
                bVar.f5467b = i23 - bVar2.f5469d;
            }
            int i24 = bVar.f5469d;
            if (i24 > bVar2.f5467b) {
                bVar.f5469d = i24 - bVar2.f5469d;
            }
        } else {
            if (bVar3 != null) {
                int i25 = bVar.f5467b;
                if (i25 >= bVar3.f5467b) {
                    bVar.f5467b = i25 - bVar3.f5469d;
                }
                int i26 = bVar.f5469d;
                if (i26 >= bVar3.f5467b) {
                    bVar.f5469d = i26 - bVar3.f5469d;
                }
            }
            int i27 = bVar.f5467b;
            if (i27 >= bVar2.f5467b) {
                bVar.f5467b = i27 - bVar2.f5469d;
            }
            int i28 = bVar.f5469d;
            if (i28 >= bVar2.f5467b) {
                bVar.f5469d = i28 - bVar2.f5469d;
            }
        }
        list.set(i11, bVar2);
        if (bVar.f5467b != bVar.f5469d) {
            list.set(i12, bVar);
        } else {
            list.remove(i12);
        }
        if (bVar3 != null) {
            list.add(i11, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f5469d
            int r1 = r13.f5467b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f5467b = r1
            goto L20
        Ld:
            int r5 = r13.f5469d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f5469d = r5
            androidx.recyclerview.widget.s$a r0 = r8.f5696a
            int r1 = r11.f5467b
            java.lang.Object r5 = r13.f5468c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f5467b
            int r5 = r13.f5467b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f5467b = r5
            goto L41
        L2b:
            int r6 = r13.f5469d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.s$a r3 = r8.f5696a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f5468c
            androidx.recyclerview.widget.a$b r3 = r3.a(r2, r1, r5, r4)
            int r1 = r13.f5469d
            int r1 = r1 - r5
            r13.f5469d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f5469d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.s$a r11 = r8.f5696a
            r11.b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.s.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}