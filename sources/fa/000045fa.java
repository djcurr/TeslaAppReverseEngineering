package com.plaid.internal.workflow.panes.userselection;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.bc;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelection$UserSelectionPane;
import com.plaid.internal.ic;
import com.plaid.internal.k1;
import com.plaid.internal.q9;
import com.plaid.internal.z6;
import com.plaid.link.R;
import h00.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import vz.k;
import vz.m;
import vz.p;
import wz.e0;
import wz.w0;
import wz.x;
import wz.x0;

/* loaded from: classes2.dex */
public final class SelectionView extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f19702f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final k f19703a;

    /* renamed from: b  reason: collision with root package name */
    public final List<p<String, q9>> f19704b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f19705c;

    /* renamed from: d  reason: collision with root package name */
    public k1 f19706d;

    /* renamed from: e  reason: collision with root package name */
    public l<? super List<String>, b0> f19707e;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19708a;

        static {
            int[] iArr = new int[k1.values().length];
            iArr[k1.SELECTION_LIST_BEHAVIOR_SINGLE_SELECT.ordinal()] = 1;
            iArr[k1.SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE.ordinal()] = 2;
            iArr[k1.SELECTION_LIST_BEHAVIOR_MULTI_SELECT.ordinal()] = 3;
            iArr[k1.SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED.ordinal()] = 4;
            f19708a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends u implements h00.a<b0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Common$SelectionListItem f19710b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Common$SelectionListItem common$SelectionListItem) {
            super(0);
            this.f19710b = common$SelectionListItem;
        }

        @Override // h00.a
        public b0 invoke() {
            Set<String> S0;
            SelectionView selectionView = SelectionView.this;
            String id2 = this.f19710b.getId();
            s.f(id2, "selection.id");
            int i11 = SelectionView.f19702f;
            selectionView.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(selectionView.f19705c);
            linkedHashSet.remove(id2);
            S0 = e0.S0(linkedHashSet);
            selectionView.f19705c = S0;
            return b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends u implements h00.a<b0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Common$SelectionListItem f19712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Common$SelectionListItem common$SelectionListItem) {
            super(0);
            this.f19712b = common$SelectionListItem;
        }

        @Override // h00.a
        public b0 invoke() {
            SelectionView selectionView = SelectionView.this;
            String id2 = this.f19712b.getId();
            s.f(id2, "selection.id");
            int i11 = SelectionView.f19702f;
            selectionView.a(id2);
            SelectionView.this.a();
            return b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends u implements h00.a<LinearLayout> {
        public d() {
            super(0);
        }

        @Override // h00.a
        public LinearLayout invoke() {
            return (LinearLayout) SelectionView.this.findViewById(R.id.selectionViewSelections);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectionView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ SelectionView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final LinearLayout getSelectionsLayout() {
        Object value = this.f19703a.getValue();
        s.f(value, "<get-selectionsLayout>(...)");
        return (LinearLayout) value;
    }

    public final void a(UserSelection$UserSelectionPane.Rendering.Selection selection, bc showModal, List<String> list, l<? super Common$LocalAction, b0> spanClickedListener) {
        Set<String> d11;
        Common$LocalizedString prompt;
        s.g(selection, "selection");
        s.g(showModal, "showModal");
        s.g(spanClickedListener, "spanClickedListener");
        this.f19704b.clear();
        getSelectionsLayout().removeAllViews();
        d11 = x0.d();
        this.f19705c = d11;
        if (selection.hasAttributedPrompt()) {
            Common$AttributedLocalizedString attributedPrompt = selection.getAttributedPrompt();
            if (attributedPrompt != null) {
                TextView b11 = b();
                ic.a(b11, attributedPrompt, spanClickedListener);
                getSelectionsLayout().addView(b11);
            }
        } else if (selection.hasPrompt() && (prompt = selection.getPrompt()) != null) {
            Resources resources = getContext().getResources();
            s.f(resources, "context.resources");
            String a11 = z6.a(prompt, resources, null, 0, 6);
            LinearLayout selectionsLayout = getSelectionsLayout();
            TextView b12 = b();
            b12.setText(a11);
            selectionsLayout.addView(b12);
        }
        k1 behavior = selection.getBehavior();
        s.f(behavior, "selection.behavior");
        this.f19706d = behavior;
        for (Common$SelectionListItem selectionItem : selection.getResponsesList()) {
            if (selectionItem.getPreselected()) {
                String id2 = selectionItem.getId();
                s.f(id2, "selectionItem.id");
                a(id2);
            }
            s.f(selectionItem, "selectionItem");
            k1 behavior2 = selection.getBehavior();
            s.f(behavior2, "selection.behavior");
            a(selectionItem, showModal, list, behavior2);
        }
    }

    public final TextView b() {
        TextView textView = new TextView(getContext(), null, 0, R.style.PlaidText_H5_Regular);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setEnabled(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setClickable(true);
        textView.setFocusable(true);
        return textView;
    }

    public final l<List<String>, b0> getOnSubmitListener$link_sdk_release() {
        l lVar = this.f19707e;
        if (lVar != null) {
            return lVar;
        }
        s.x("onSubmitListener");
        return null;
    }

    public final List<String> getResponses$link_sdk_release() {
        int t11;
        List<p<String, q9>> list = this.f19704b;
        ArrayList<p> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q9) ((p) obj).d()).getPlaidCompoundButton().isChecked()) {
                arrayList.add(obj);
            }
        }
        t11 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (p pVar : arrayList) {
            arrayList2.add((String) pVar.c());
        }
        return arrayList2;
    }

    public final void setOnSubmitListener$link_sdk_release(l<? super List<String>, b0> lVar) {
        s.g(lVar, "<set-?>");
        this.f19707e = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        k a11;
        Set<String> d11;
        s.g(context, "context");
        a11 = m.a(new d());
        this.f19703a = a11;
        this.f19704b = new ArrayList();
        d11 = x0.d();
        this.f19705c = d11;
        LayoutInflater.from(context).inflate(R.layout.plaid_selection_view, (ViewGroup) this, true);
        setOrientation(1);
    }

    public static final void a(SelectionView this$0, Common$SelectionListItem selection, bc showModal, CompoundButton compoundButton, boolean z11) {
        Set<String> c11;
        Set<String> c12;
        s.g(this$0, "this$0");
        s.g(selection, "$selection");
        s.g(showModal, "$showModal");
        if (this$0.f19705c.contains(selection.getId()) && selection.getPreselected() && !z11) {
            showModal.a(new b(selection), new c(selection));
            return;
        }
        k1 k1Var = this$0.f19706d;
        if (k1Var == null) {
            s.x("selectionListBehavior");
            k1Var = null;
        }
        int i11 = a.f19708a[k1Var.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (z11) {
                    String id2 = selection.getId();
                    s.f(id2, "selection.id");
                    c12 = w0.c(id2);
                    this$0.f19705c = c12;
                    this$0.a();
                }
                this$0.getOnSubmitListener$link_sdk_release().invoke(this$0.getResponses$link_sdk_release());
            } else if (i11 == 3) {
                this$0.a(selection, z11);
            } else if (i11 == 4) {
                this$0.a(selection, z11);
            }
        } else if (z11) {
            String id3 = selection.getId();
            s.f(id3, "selection.id");
            c11 = w0.c(id3);
            this$0.f19705c = c11;
            this$0.a();
        }
        this$0.a();
    }

    public final void a(Common$SelectionListItem common$SelectionListItem, boolean z11) {
        Set<String> S0;
        if (z11) {
            String id2 = common$SelectionListItem.getId();
            s.f(id2, "selection.id");
            a(id2);
            return;
        }
        String id3 = common$SelectionListItem.getId();
        s.f(id3, "selection.id");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f19705c);
        linkedHashSet.remove(id3);
        S0 = e0.S0(linkedHashSet);
        this.f19705c = S0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r0 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem r10, final com.plaid.internal.bc r11, java.util.List<java.lang.String> r12, com.plaid.internal.k1 r13) {
        /*
            r9 = this;
            com.plaid.internal.k1 r0 = com.plaid.internal.k1.SELECTION_LIST_BEHAVIOR_MULTI_SELECT
            r1 = 1
            r2 = 0
            if (r13 == r0) goto Ld
            com.plaid.internal.k1 r0 = com.plaid.internal.k1.SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED
            if (r13 != r0) goto Lb
            goto Ld
        Lb:
            r13 = r2
            goto Le
        Ld:
            r13 = r1
        Le:
            java.lang.String r0 = "context"
            r3 = 0
            if (r13 == 0) goto L20
            com.plaid.internal.o9 r13 = new com.plaid.internal.o9
            android.content.Context r4 = r9.getContext()
            kotlin.jvm.internal.s.f(r4, r0)
            r13.<init>(r4, r3, r2)
            goto L2c
        L20:
            com.plaid.internal.p9 r13 = new com.plaid.internal.p9
            android.content.Context r4 = r9.getContext()
            kotlin.jvm.internal.s.f(r4, r0)
            r13.<init>(r4, r3, r2)
        L2c:
            boolean r0 = r10.getPreselected()
            r13.setChecked(r0)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString r0 = r10.getTitle()
            r4 = 4
            java.lang.String r5 = ""
            java.lang.String r6 = "resources"
            if (r0 != 0) goto L3f
            goto L58
        L3f:
            android.content.res.Resources r7 = r13.getResources()
            kotlin.jvm.internal.s.f(r7, r6)
            android.content.Context r8 = r13.getContext()
            if (r8 != 0) goto L4e
            r8 = r3
            goto L52
        L4e:
            java.lang.String r8 = r8.getPackageName()
        L52:
            java.lang.String r0 = com.plaid.internal.z6.a(r0, r7, r8, r2, r4)
            if (r0 != 0) goto L59
        L58:
            r0 = r5
        L59:
            r13.setValue(r0)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString r0 = r10.getSubtitle()
            if (r0 != 0) goto L63
            goto L7c
        L63:
            android.content.res.Resources r7 = r13.getResources()
            kotlin.jvm.internal.s.f(r7, r6)
            android.content.Context r8 = r13.getContext()
            if (r8 != 0) goto L72
            r8 = r3
            goto L76
        L72:
            java.lang.String r8 = r8.getPackageName()
        L76:
            java.lang.String r0 = com.plaid.internal.z6.a(r0, r7, r8, r2, r4)
            if (r0 != 0) goto L7d
        L7c:
            r0 = r5
        L7d:
            r13.setDescriptor(r0)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString r0 = r10.getDetail()
            if (r0 != 0) goto L87
            goto La1
        L87:
            android.content.res.Resources r7 = r13.getResources()
            kotlin.jvm.internal.s.f(r7, r6)
            android.content.Context r6 = r13.getContext()
            if (r6 != 0) goto L95
            goto L99
        L95:
            java.lang.String r3 = r6.getPackageName()
        L99:
            java.lang.String r0 = com.plaid.internal.z6.a(r0, r7, r3, r2, r4)
            if (r0 != 0) goto La0
            goto La1
        La0:
            r5 = r0
        La1:
            r13.setMeta(r5)
            if (r12 != 0) goto La7
            goto Lb2
        La7:
            java.lang.String r0 = r10.getId()
            boolean r12 = r12.contains(r0)
            if (r12 != r1) goto Lb2
            r2 = r1
        Lb2:
            if (r2 == 0) goto Lc3
            java.lang.String r12 = r10.getId()
            java.lang.String r0 = "selection.id"
            kotlin.jvm.internal.s.f(r12, r0)
            r9.a(r12)
            r13.setChecked(r1)
        Lc3:
            sq.a r12 = new sq.a
            r12.<init>()
            r13.setOnCheckedChangeListener(r12)
            java.util.List<vz.p<java.lang.String, com.plaid.internal.q9>> r11 = r9.f19704b
            vz.p r12 = new vz.p
            java.lang.String r10 = r10.getId()
            r12.<init>(r10, r13)
            r11.add(r12)
            android.widget.LinearLayout r10 = r9.getSelectionsLayout()
            r10.addView(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.workflow.panes.userselection.SelectionView.a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem, com.plaid.internal.bc, java.util.List, com.plaid.internal.k1):void");
    }

    public final void a() {
        Iterator<T> it2 = this.f19704b.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            ((q9) pVar.d()).setChecked(this.f19705c.contains(pVar.c()));
        }
    }

    public final void a(String str) {
        Set<String> S0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f19705c);
        linkedHashSet.add(str);
        S0 = e0.S0(linkedHashSet);
        this.f19705c = S0;
    }
}