package com.stripe.android.ui.core.elements;

import c1.u0;
import com.stripe.android.ui.core.elements.TextFieldIcon;
import h00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.TextFieldUIKt$AnimatedIcons$target$2", f = "TextFieldUI.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class TextFieldUIKt$AnimatedIcons$target$2 extends l implements p<u0<TextFieldIcon.Trailing>, d<? super b0>, Object> {
    final /* synthetic */ List<TextFieldIcon.Trailing> $icons;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$AnimatedIcons$target$2(List<TextFieldIcon.Trailing> list, d<? super TextFieldUIKt$AnimatedIcons$target$2> dVar) {
        super(2, dVar);
        this.$icons = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        TextFieldUIKt$AnimatedIcons$target$2 textFieldUIKt$AnimatedIcons$target$2 = new TextFieldUIKt$AnimatedIcons$target$2(this.$icons, dVar);
        textFieldUIKt$AnimatedIcons$target$2.L$0 = obj;
        return textFieldUIKt$AnimatedIcons$target$2;
    }

    @Override // h00.p
    public final Object invoke(u0<TextFieldIcon.Trailing> u0Var, d<? super b0> dVar) {
        return ((TextFieldUIKt$AnimatedIcons$target$2) create(u0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:16:0x0055). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002e -> B:10:0x0034). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r8.L$2
            com.stripe.android.ui.core.elements.TextFieldIcon$Trailing r1 = (com.stripe.android.ui.core.elements.TextFieldIcon.Trailing) r1
            java.lang.Object r3 = r8.L$1
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r8.L$0
            c1.u0 r4 = (c1.u0) r4
            vz.r.b(r9)
            r9 = r4
            r4 = r3
            r3 = r8
            goto L55
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            vz.r.b(r9)
            java.lang.Object r9 = r8.L$0
            c1.u0 r9 = (c1.u0) r9
            r1 = r8
        L2e:
            java.util.List<com.stripe.android.ui.core.elements.TextFieldIcon$Trailing> r3 = r1.$icons
            java.util.Iterator r3 = r3.iterator()
        L34:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r3.next()
            com.stripe.android.ui.core.elements.TextFieldIcon$Trailing r4 = (com.stripe.android.ui.core.elements.TextFieldIcon.Trailing) r4
            r5 = 1000(0x3e8, double:4.94E-321)
            r1.L$0 = r9
            r1.L$1 = r3
            r1.L$2 = r4
            r1.label = r2
            java.lang.Object r5 = v20.y0.b(r5, r1)
            if (r5 != r0) goto L51
            return r0
        L51:
            r7 = r3
            r3 = r1
            r1 = r4
            r4 = r7
        L55:
            r9.setValue(r1)
            r1 = r3
            r3 = r4
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.TextFieldUIKt$AnimatedIcons$target$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}