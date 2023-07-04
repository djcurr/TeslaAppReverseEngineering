package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class u extends wz.c<i> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final a f42682d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final i[] f42683b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f42684c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        private final void a(long j11, f fVar, int i11, List<? extends i> list, int i12, int i13, List<Integer> list2) {
            int i14;
            int i15;
            int i16;
            int i17;
            f fVar2;
            int i18 = i11;
            if (i12 < i13) {
                for (int i19 = i12; i19 < i13; i19++) {
                    if (!(list.get(i19).z() >= i18)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                i iVar = list.get(i12);
                i iVar2 = list.get(i13 - 1);
                int i21 = -1;
                if (i18 == iVar.z()) {
                    int i22 = i12 + 1;
                    i14 = i22;
                    i15 = list2.get(i12).intValue();
                    iVar = list.get(i22);
                } else {
                    i14 = i12;
                    i15 = -1;
                }
                if (iVar.g(i18) != iVar2.g(i18)) {
                    int i23 = 1;
                    for (int i24 = i14 + 1; i24 < i13; i24++) {
                        if (list.get(i24 - 1).g(i18) != list.get(i24).g(i18)) {
                            i23++;
                        }
                    }
                    long c11 = j11 + c(fVar) + 2 + (i23 * 2);
                    fVar.x(i23);
                    fVar.x(i15);
                    for (int i25 = i14; i25 < i13; i25++) {
                        byte g11 = list.get(i25).g(i18);
                        if (i25 == i14 || g11 != list.get(i25 - 1).g(i18)) {
                            fVar.x(g11 & 255);
                        }
                    }
                    f fVar3 = new f();
                    while (i14 < i13) {
                        byte g12 = list.get(i14).g(i18);
                        int i26 = i14 + 1;
                        int i27 = i26;
                        while (true) {
                            if (i27 >= i13) {
                                i16 = i13;
                                break;
                            } else if (g12 != list.get(i27).g(i18)) {
                                i16 = i27;
                                break;
                            } else {
                                i27++;
                            }
                        }
                        if (i26 == i16 && i18 + 1 == list.get(i14).z()) {
                            fVar.x(list2.get(i14).intValue());
                            i17 = i16;
                            fVar2 = fVar3;
                        } else {
                            fVar.x(((int) (c11 + c(fVar3))) * i21);
                            i17 = i16;
                            fVar2 = fVar3;
                            a(c11, fVar3, i18 + 1, list, i14, i16, list2);
                        }
                        fVar3 = fVar2;
                        i14 = i17;
                        i21 = -1;
                    }
                    fVar.b0(fVar3);
                    return;
                }
                int min = Math.min(iVar.z(), iVar2.z());
                int i28 = 0;
                for (int i29 = i18; i29 < min && iVar.g(i29) == iVar2.g(i29); i29++) {
                    i28++;
                }
                long c12 = j11 + c(fVar) + 2 + i28 + 1;
                fVar.x(-i28);
                fVar.x(i15);
                int i31 = i18 + i28;
                while (i18 < i31) {
                    fVar.x(iVar.g(i18) & 255);
                    i18++;
                }
                if (i14 + 1 == i13) {
                    if (i31 == list.get(i14).z()) {
                        fVar.x(list2.get(i14).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                f fVar4 = new f();
                fVar.x(((int) (c(fVar4) + c12)) * (-1));
                a(c12, fVar4, i31, list, i14, i13, list2);
                fVar.b0(fVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j11, f fVar, int i11, List list, int i12, int i13, List list2, int i14, Object obj) {
            aVar.a((i14 & 1) != 0 ? 0L : j11, fVar, (i14 & 4) != 0 ? 0 : i11, list, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? list.size() : i13, list2);
        }

        private final long c(f fVar) {
            return fVar.P0() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.u d(okio.i... r17) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.u.a.d(okio.i[]):okio.u");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ u(i[] iVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVarArr, iArr);
    }

    public static final u k(i... iVarArr) {
        return f42682d.d(iVarArr);
    }

    @Override // wz.a
    public int b() {
        return this.f42683b.length;
    }

    public /* bridge */ boolean c(i iVar) {
        return super.contains(iVar);
    }

    @Override // wz.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return c((i) obj);
        }
        return false;
    }

    @Override // wz.c, java.util.List
    /* renamed from: e */
    public i get(int i11) {
        return this.f42683b[i11];
    }

    public final i[] f() {
        return this.f42683b;
    }

    public final int[] h() {
        return this.f42684c;
    }

    public /* bridge */ int i(i iVar) {
        return super.indexOf(iVar);
    }

    @Override // wz.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return i((i) obj);
        }
        return -1;
    }

    public /* bridge */ int j(i iVar) {
        return super.lastIndexOf(iVar);
    }

    @Override // wz.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return j((i) obj);
        }
        return -1;
    }

    private u(i[] iVarArr, int[] iArr) {
        this.f42683b = iVarArr;
        this.f42684c = iArr;
    }
}