package com.plaid.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem;
import com.plaid.internal.p3;
import com.plaid.internal.wa;
import com.plaid.link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class p3 extends RecyclerView.h<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Common$GridSelectionImageItem> f19206a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f19207b;

    /* renamed from: c  reason: collision with root package name */
    public f1 f19208c;

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19212a;

        static {
            int[] iArr = new int[f1.values().length];
            iArr[f1.GRID_SELECTION_BEHAVIOR_SINGLE_SELECT.ordinal()] = 1;
            iArr[f1.GRID_SELECTION_BEHAVIOR_UNKNOWN.ordinal()] = 2;
            iArr[f1.UNRECOGNIZED.ordinal()] = 3;
            f19212a = iArr;
        }
    }

    public p3() {
        Set<String> d11;
        d11 = wz.x0.d();
        this.f19207b = d11;
        this.f19208c = f1.GRID_SELECTION_BEHAVIOR_SINGLE_SELECT;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f19206a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(a aVar, int i11) {
        a holder = aVar;
        kotlin.jvm.internal.s.g(holder, "holder");
        Common$GridSelectionImageItem common$GridSelectionImageItem = this.f19206a.get(i11);
        holder.a(common$GridSelectionImageItem, this.f19207b.contains(common$GridSelectionImageItem.getId()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public a onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        View inflate = zc.a(parent).inflate(R.layout.plaid_grid_selection_item, parent, false);
        kotlin.jvm.internal.s.f(inflate, "parent.layoutInflater.in…tion_item, parent, false)");
        return new a(this, inflate);
    }

    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final View f19209a;

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f19210b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p3 f19211c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p3 this$0, View view) {
            super(view);
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(view, "view");
            this.f19211c = this$0;
            this.f19209a = view.findViewById(R.id.plaid_item_root);
            this.f19210b = (ImageView) view.findViewById(R.id.plaid_image);
        }

        public final void a(final Common$GridSelectionImageItem item, boolean z11) {
            kotlin.jvm.internal.s.g(item, "item");
            ImageView imageView = this.f19210b;
            kotlin.jvm.internal.s.f(imageView, "imageView");
            a4.a(imageView, item.getImage());
            this.f19210b.setTag(item.getId());
            if (z11) {
                this.f19209a.setBackgroundResource(R.drawable.plaid_selection_border);
            } else {
                this.f19209a.setBackground(null);
            }
            View view = this.f19209a;
            final p3 p3Var = this.f19211c;
            view.setOnClickListener(new View.OnClickListener() { // from class: qq.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    p3.a.a(p3.this, item, view2);
                }
            });
        }

        public static final void a(p3 this$0, Common$GridSelectionImageItem item, View view) {
            Set<String> c11;
            Set<String> c12;
            Set<String> c13;
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(item, "$item");
            String id2 = item.getId();
            kotlin.jvm.internal.s.f(id2, "item.id");
            int i11 = b.f19212a[this$0.f19208c.ordinal()];
            if (i11 == 1) {
                c11 = wz.w0.c(id2);
                this$0.f19207b = c11;
            } else if (i11 == 2) {
                wa.a aVar = wa.f19678a;
                StringBuilder a11 = g4.a("Got unexpected gridSelectionBehavior: ");
                a11.append(this$0.f19208c);
                a11.append(", defaulting to single-select");
                wa.a.c(aVar, a11.toString(), false, 2);
                c12 = wz.w0.c(id2);
                this$0.f19207b = c12;
            } else if (i11 == 3) {
                wa.a aVar2 = wa.f19678a;
                StringBuilder a12 = g4.a("Got unexpected gridSelectionBehavior: ");
                a12.append(this$0.f19208c);
                a12.append(", defaulting to single-select");
                wa.a.c(aVar2, a12.toString(), false, 2);
                c13 = wz.w0.c(id2);
                this$0.f19207b = c13;
            } else {
                throw new r5(kotlin.jvm.internal.s.p("Received unexpected gridSelectionBehavior ", this$0.f19208c));
            }
            this$0.notifyDataSetChanged();
        }
    }
}