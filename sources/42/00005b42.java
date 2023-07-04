package com.stripe.android.ui.core.elements;

import c1.i;
import c1.o0;
import h00.a;
import h00.p;
import h00.q;
import j1.c;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p0.c0;
import vz.b0;
import y0.b;
import y0.f;
import y0.o1;

/* loaded from: classes6.dex */
final class SimpleDialogElementUIKt$SimpleDialogElementUI$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $confirmText;
    final /* synthetic */ String $dismissText;
    final /* synthetic */ String $messageText;
    final /* synthetic */ a<b0> $onConfirmListener;
    final /* synthetic */ a<b0> $onDismissListener;
    final /* synthetic */ o0<Boolean> $openDialog;
    final /* synthetic */ String $titleText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements p<i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $confirmText;
        final /* synthetic */ a<b0> $onConfirmListener;
        final /* synthetic */ o0<Boolean> $openDialog;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03842 extends u implements q<c0, i, Integer, b0> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ String $confirmText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03842(String str, int i11) {
                super(3);
                this.$confirmText = str;
                this.$$dirty = i11;
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ b0 invoke(c0 c0Var, i iVar, Integer num) {
                invoke(c0Var, iVar, num.intValue());
                return b0.f54756a;
            }

            public final void invoke(c0 TextButton, i iVar, int i11) {
                s.g(TextButton, "$this$TextButton");
                if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    o1.b(this.$confirmText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, (this.$$dirty >> 9) & 14, 0, 65534);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(o0<Boolean> o0Var, a<b0> aVar, int i11, String str) {
            super(2);
            this.$openDialog = o0Var;
            this.$onConfirmListener = aVar;
            this.$$dirty = i11;
            this.$confirmText = str;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v0, types: [c1.i] */
        /* JADX WARN: Type inference failed for: r4v3 */
        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            o0<Boolean> o0Var = this.$openDialog;
            a<b0> aVar = this.$onConfirmListener;
            iVar.x(-3686552);
            boolean O = iVar.O(o0Var) | iVar.O(aVar);
            Object y11 = iVar.y();
            if (O || y11 == i.f8486a.a()) {
                y11 = new SimpleDialogElementUIKt$SimpleDialogElementUI$3$2$1$1(o0Var, aVar);
                iVar.p(y11);
            }
            iVar.N();
            f.c(y11, null, false, null, null, null, null, null, null, c.b(iVar, -819895681, true, new C03842(this.$confirmText, this.$$dirty)), iVar, 805306368, 510);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends u implements p<i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $dismissText;
        final /* synthetic */ a<b0> $onDismissListener;
        final /* synthetic */ o0<Boolean> $openDialog;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$3$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends u implements q<c0, i, Integer, b0> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ String $dismissText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, int i11) {
                super(3);
                this.$dismissText = str;
                this.$$dirty = i11;
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ b0 invoke(c0 c0Var, i iVar, Integer num) {
                invoke(c0Var, iVar, num.intValue());
                return b0.f54756a;
            }

            public final void invoke(c0 TextButton, i iVar, int i11) {
                s.g(TextButton, "$this$TextButton");
                if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    o1.b(this.$dismissText, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, (this.$$dirty >> 12) & 14, 0, 65534);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(o0<Boolean> o0Var, a<b0> aVar, int i11, String str) {
            super(2);
            this.$openDialog = o0Var;
            this.$onDismissListener = aVar;
            this.$$dirty = i11;
            this.$dismissText = str;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r17v0, types: [c1.i] */
        /* JADX WARN: Type inference failed for: r4v3 */
        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            o0<Boolean> o0Var = this.$openDialog;
            a<b0> aVar = this.$onDismissListener;
            iVar.x(-3686552);
            boolean O = iVar.O(o0Var) | iVar.O(aVar);
            Object y11 = iVar.y();
            if (O || y11 == i.f8486a.a()) {
                y11 = new SimpleDialogElementUIKt$SimpleDialogElementUI$3$3$1$1(o0Var, aVar);
                iVar.p(y11);
            }
            iVar.N();
            f.c(y11, null, false, null, null, null, null, null, null, c.b(iVar, -819896113, true, new AnonymousClass2(this.$dismissText, this.$$dirty)), iVar, 805306368, 510);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends u implements p<i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $titleText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str, int i11) {
            super(2);
            this.$titleText = str;
            this.$$dirty = i11;
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
            } else {
                H4TextKt.H4Text(this.$titleText, null, iVar, (this.$$dirty >> 3) & 14, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.SimpleDialogElementUIKt$SimpleDialogElementUI$3$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass5 extends u implements p<i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $messageText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str, int i11) {
            super(2);
            this.$messageText = str;
            this.$$dirty = i11;
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
            } else {
                H6TextKt.H6Text(this.$messageText, null, iVar, (this.$$dirty >> 6) & 14, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDialogElementUIKt$SimpleDialogElementUI$3(o0<Boolean> o0Var, int i11, a<b0> aVar, String str, a<b0> aVar2, String str2, String str3, String str4) {
        super(2);
        this.$openDialog = o0Var;
        this.$$dirty = i11;
        this.$onConfirmListener = aVar;
        this.$confirmText = str;
        this.$onDismissListener = aVar2;
        this.$dismissText = str2;
        this.$titleText = str3;
        this.$messageText = str4;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [c1.i] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        o0<Boolean> o0Var = this.$openDialog;
        iVar.x(-3686930);
        boolean O = iVar.O(o0Var);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            y11 = new SimpleDialogElementUIKt$SimpleDialogElementUI$3$1$1(o0Var);
            iVar.p(y11);
        }
        iVar.N();
        b.a(y11, c.b(iVar, -819895656, true, new AnonymousClass2(this.$openDialog, this.$onConfirmListener, this.$$dirty, this.$confirmText)), null, c.b(iVar, -819895320, true, new AnonymousClass3(this.$openDialog, this.$onDismissListener, this.$$dirty, this.$dismissText)), c.b(iVar, -819894825, true, new AnonymousClass4(this.$titleText, this.$$dirty)), c.b(iVar, -819894980, true, new AnonymousClass5(this.$messageText, this.$$dirty)), null, 0L, 0L, null, iVar, 224304, 964);
    }
}