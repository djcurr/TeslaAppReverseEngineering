package defpackage;

import androidx.compose.ui.window.n;
import c1.i;
import c1.o0;
import com.stripe.android.ui.core.elements.menu.MenuKt;
import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l0.n0;
import o1.f;
import q0.g;
import t1.h1;
import vz.b0;
import x2.m;

/* renamed from: a  reason: default package */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0000a extends u implements p<i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0<Boolean> f30a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0<h1> f31b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f32c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f33d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l<g, b0> f34e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f35f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0000a(n0<Boolean> n0Var, o0<h1> o0Var, int i11, f fVar, l<? super g, b0> lVar, int i12) {
            super(2);
            this.f30a = n0Var;
            this.f31b = o0Var;
            this.f32c = i11;
            this.f33d = fVar;
            this.f34e = lVar;
            this.f35f = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            n0<Boolean> n0Var = this.f30a;
            o0<h1> o0Var = this.f31b;
            int i12 = this.f32c;
            f fVar = this.f33d;
            l<g, b0> lVar = this.f34e;
            int i13 = this.f35f;
            MenuKt.DropdownMenuContent(n0Var, o0Var, i12, fVar, lVar, iVar, n0.f36218d | 48 | ((i13 << 3) & 896) | (i13 & 7168) | ((i13 >> 6) & 57344), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a$b */
    /* loaded from: classes.dex */
    public static final class b extends u implements p<i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f36a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.a<b0> f38c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f39d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f40e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n f41f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l<g, b0> f42g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f43h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f44i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, int i11, h00.a<b0> aVar, f fVar, long j11, n nVar, l<? super g, b0> lVar, int i12, int i13) {
            super(2);
            this.f36a = z11;
            this.f37b = i11;
            this.f38c = aVar;
            this.f39d = fVar;
            this.f40e = j11;
            this.f41f = nVar;
            this.f42g = lVar;
            this.f43h = i12;
            this.f44i = i13;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            a.a(this.f36a, this.f37b, this.f38c, this.f39d, this.f40e, this.f41f, this.f42g, iVar, this.f43h | 1, this.f44i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a$c */
    /* loaded from: classes3.dex */
    public static final class c extends u implements p<m, m, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0<h1> f47a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0<h1> o0Var) {
            super(2);
            this.f47a = o0Var;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(m mVar, m mVar2) {
            invoke2(mVar, mVar2);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m parentBounds, m menuBounds) {
            s.g(parentBounds, "parentBounds");
            s.g(menuBounds, "menuBounds");
            this.f47a.setValue(h1.b(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r25, int r26, h00.a<vz.b0> r27, o1.f r28, long r29, androidx.compose.ui.window.n r31, h00.l<? super q0.g, vz.b0> r32, c1.i r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.a(boolean, int, h00.a, o1.f, long, androidx.compose.ui.window.n, h00.l, c1.i, int, int):void");
    }
}