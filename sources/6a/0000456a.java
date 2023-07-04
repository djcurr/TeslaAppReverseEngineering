package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.ui_components.PlaidListItemInstitution;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.sb;
import com.plaid.link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class sb extends androidx.recyclerview.widget.q<Common$ListItem, RecyclerView.e0> {

    /* renamed from: e  reason: collision with root package name */
    public static final h.f<Common$ListItem> f19444e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<Common$ListItem> f19445a;

    /* renamed from: b  reason: collision with root package name */
    public d f19446b;

    /* renamed from: c  reason: collision with root package name */
    public vz.p<Common$LocalizedString, Common$ButtonContent> f19447c;

    /* renamed from: d  reason: collision with root package name */
    public vz.p<Common$AttributedLocalizedString, Common$ButtonContent> f19448d;

    /* loaded from: classes2.dex */
    public static final class a extends h.f<Common$ListItem> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(Common$ListItem common$ListItem, Common$ListItem common$ListItem2) {
            boolean c11;
            Common$ListItem oldItem = common$ListItem;
            Common$ListItem newItem = common$ListItem2;
            kotlin.jvm.internal.s.g(oldItem, "oldItem");
            kotlin.jvm.internal.s.g(newItem, "newItem");
            if (oldItem.getImage() == null && newItem.getImage() == null) {
                c11 = kotlin.jvm.internal.s.c(oldItem.getImageMissingColor(), newItem.getImageMissingColor());
            } else {
                c11 = kotlin.jvm.internal.s.c(oldItem.getImage(), newItem.getImage());
            }
            return c11 && kotlin.jvm.internal.s.c(oldItem.getSubtitle(), newItem.getSubtitle()) && kotlin.jvm.internal.s.c(oldItem.getTitle(), newItem.getTitle());
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(Common$ListItem common$ListItem, Common$ListItem common$ListItem2) {
            Common$ListItem oldItem = common$ListItem;
            Common$ListItem newItem = common$ListItem2;
            kotlin.jvm.internal.s.g(oldItem, "oldItem");
            kotlin.jvm.internal.s.g(newItem, "newItem");
            return kotlin.jvm.internal.s.c(oldItem.getId(), newItem.getId());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final l9 f19449a;

        /* renamed from: b  reason: collision with root package name */
        public final d f19450b;

        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, vz.b0> {
            public a() {
                super(1);
            }

            @Override // h00.l
            public vz.b0 invoke(Common$LocalAction common$LocalAction) {
                Common$LocalAction it2 = common$LocalAction;
                kotlin.jvm.internal.s.g(it2, "it");
                d dVar = b.this.f19450b;
                if (dVar != null) {
                    dVar.a(it2);
                }
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l9 binding, d dVar) {
            super(binding.a());
            kotlin.jvm.internal.s.g(binding, "binding");
            this.f19449a = binding;
            this.f19450b = dVar;
            binding.f18979b.setOnClickListener(new View.OnClickListener() { // from class: qq.f0
                {
                    sb.b.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sb.b.a(sb.b.this, view);
                }
            });
        }

        public static final void a(b this$0, View view) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            d dVar = this$0.f19450b;
            if (dVar == null) {
                return;
            }
            dVar.b(null);
        }

        public static final void b(b this$0, vz.p pVar, View view) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            d dVar = this$0.f19450b;
            if (dVar == null) {
                return;
            }
            dVar.a((Common$ButtonContent) pVar.d());
        }

        public final void a(boolean z11, vz.p<Common$LocalizedString, Common$ButtonContent> pVar, final vz.p<Common$AttributedLocalizedString, Common$ButtonContent> pVar2) {
            Common$LocalizedString title;
            Resources resources = this.f19449a.f18978a.getResources();
            if (z11) {
                a(pVar);
            } else if (pVar2 == null) {
                l9 l9Var = this.f19449a;
                TextView noResultsText = l9Var.f18980c;
                kotlin.jvm.internal.s.f(noResultsText, "noResultsText");
                jc.a(noResultsText, resources.getString(R.string.plaid_dont_see_your_bank));
                PlaidSecondaryButton noResultsButton = l9Var.f18979b;
                kotlin.jvm.internal.s.f(noResultsButton, "noResultsButton");
                jc.a(noResultsButton, resources.getString(R.string.plaid_exit));
            } else {
                this.f19449a.f18979b.setOnClickListener(new View.OnClickListener() { // from class: qq.h0
                    {
                        sb.b.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sb.b.b(sb.b.this, pVar2, view);
                    }
                });
                TextView textView = this.f19449a.f18980c;
                kotlin.jvm.internal.s.f(textView, "binding.noResultsText");
                ic.a(textView, pVar2.c(), new a());
                PlaidSecondaryButton plaidSecondaryButton = this.f19449a.f18979b;
                kotlin.jvm.internal.s.f(plaidSecondaryButton, "binding.noResultsButton");
                Common$ButtonContent d11 = pVar2.d();
                if (d11 != null && (title = d11.getTitle()) != null) {
                    kotlin.jvm.internal.s.f(resources, "resources");
                    Context context = this.f19449a.f18978a.getContext();
                    r6 = z6.a(title, resources, context != null ? context.getPackageName() : null, 0, 4);
                }
                jc.a(plaidSecondaryButton, r6);
            }
        }

        public final void a(final vz.p<Common$LocalizedString, Common$ButtonContent> pVar) {
            String str;
            Common$ButtonContent d11;
            Common$LocalizedString title;
            Common$LocalizedString c11;
            Resources resources = this.f19449a.f18978a.getResources();
            if (pVar == null || (c11 = pVar.c()) == null) {
                str = null;
            } else {
                kotlin.jvm.internal.s.f(resources, "resources");
                str = z6.a(c11, resources, resources.getString(R.string.plaid_dont_see_your_bank), 0, 4);
            }
            this.f19449a.f18980c.setText(str);
            PlaidSecondaryButton plaidSecondaryButton = this.f19449a.f18979b;
            kotlin.jvm.internal.s.f(plaidSecondaryButton, "binding.noResultsButton");
            if (pVar != null && (d11 = pVar.d()) != null && (title = d11.getTitle()) != null) {
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = this.f19449a.f18978a.getContext();
                r4 = z6.a(title, resources, context != null ? context.getPackageName() : null, 0, 4);
            }
            jc.a(plaidSecondaryButton, r4);
            this.f19449a.f18979b.setOnClickListener(new View.OnClickListener() { // from class: qq.g0
                {
                    sb.b.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sb.b.a(sb.b.this, pVar, view);
                }
            });
        }

        public static final void a(b this$0, vz.p pVar, View view) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            d dVar = this$0.f19450b;
            if (dVar == null) {
                return;
            }
            dVar.b(pVar == null ? null : (Common$ButtonContent) pVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final m9 f19452a;

        /* renamed from: b  reason: collision with root package name */
        public final ShapeDrawable f19453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m9 binding) {
            super(binding.a());
            kotlin.jvm.internal.s.g(binding, "binding");
            this.f19452a = binding;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            int dimension = (int) a().a().getResources().getDimension(R.dimen.plaid_space_2x);
            shapeDrawable.setIntrinsicHeight(dimension);
            shapeDrawable.setIntrinsicWidth(dimension);
            this.f19453b = shapeDrawable;
        }

        public final m9 a() {
            return this.f19452a;
        }

        public final void a(final Common$ListItem listItem, final d dVar) {
            String a11;
            kotlin.jvm.internal.s.g(listItem, "listItem");
            String str = null;
            final Common$LocalAction actionOverride = listItem.hasActionOverride() ? listItem.getActionOverride() : null;
            this.f19452a.f19045b.setOnClickListener(new View.OnClickListener() { // from class: qq.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sb.c.a(sb.d.this, listItem, actionOverride, view);
                }
            });
            PlaidListItemInstitution plaidListItemInstitution = this.f19452a.f19045b;
            Common$LocalizedString title = listItem.getTitle();
            if (title == null) {
                a11 = null;
            } else {
                Resources resources = this.f19452a.f19044a.getResources();
                kotlin.jvm.internal.s.f(resources, "binding.root.resources");
                a11 = z6.a(title, resources, this.f19452a.f19044a.getContext().getPackageName(), 0, 4);
            }
            plaidListItemInstitution.setTitle(a11);
            PlaidListItemInstitution plaidListItemInstitution2 = this.f19452a.f19045b;
            Common$LocalizedString subtitle = listItem.getSubtitle();
            if (subtitle != null) {
                Resources resources2 = this.f19452a.f19044a.getResources();
                kotlin.jvm.internal.s.f(resources2, "binding.root.resources");
                str = z6.a(subtitle, resources2, this.f19452a.f19044a.getContext().getPackageName(), 0, 4);
            }
            plaidListItemInstitution2.setSubtitle(str);
            PlaidListItemInstitution plaidListItemInstitution3 = this.f19452a.f19045b;
            kotlin.jvm.internal.s.f(plaidListItemInstitution3, "binding.institution");
            Common$RenderedAssetAppearance icon = listItem.getIcon();
            kotlin.jvm.internal.s.g(plaidListItemInstitution3, "<this>");
            ImageView plaidListItemCta = plaidListItemInstitution3.getPlaidListItemCta();
            kotlin.jvm.internal.s.f(plaidListItemCta, "plaidListItemCta");
            a4.a(plaidListItemCta, icon);
            String imageMissingColor = listItem.getImageMissingColor();
            kotlin.jvm.internal.s.f(imageMissingColor, "listItem.imageMissingColor");
            if (imageMissingColor.length() > 0) {
                this.f19453b.getPaint().setColor(Color.parseColor(listItem.getImageMissingColor()));
                this.f19452a.f19045b.setImage(this.f19453b);
            }
            if (listItem.hasImage()) {
                PlaidListItemInstitution plaidListItemInstitution4 = this.f19452a.f19045b;
                kotlin.jvm.internal.s.f(plaidListItemInstitution4, "binding.institution");
                Common$RenderedAssetAppearance image = listItem.getImage();
                kotlin.jvm.internal.s.g(plaidListItemInstitution4, "<this>");
                ImageView plaidListItemImage = plaidListItemInstitution4.getPlaidListItemImage();
                kotlin.jvm.internal.s.f(plaidListItemImage, "plaidListItemImage");
                a4.a(plaidListItemImage, image);
            }
        }

        public static final void a(d dVar, Common$ListItem listItem, Common$LocalAction common$LocalAction, View view) {
            kotlin.jvm.internal.s.g(listItem, "$listItem");
            if (dVar == null) {
                return;
            }
            String id2 = listItem.getId();
            kotlin.jvm.internal.s.f(id2, "listItem.id");
            dVar.a(id2, common$LocalAction);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(Common$ButtonContent common$ButtonContent);

        void a(Common$LocalAction common$LocalAction);

        void a(String str, Common$LocalAction common$LocalAction);

        void b(Common$ButtonContent common$ButtonContent);
    }

    public sb() {
        super(f19444e);
        this.f19445a = new ArrayList();
    }

    public final void a(List<Common$ListItem> initialItems) {
        kotlin.jvm.internal.s.g(initialItems, "initialItems");
        this.f19445a.clear();
        this.f19445a.addAll(initialItems);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f19445a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i11) {
        return i11 == this.f19445a.size() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 holder, int i11) {
        kotlin.jvm.internal.s.g(holder, "holder");
        if (holder instanceof c) {
            Common$ListItem common$ListItem = this.f19445a.get(i11);
            if (common$ListItem == null) {
                return;
            }
            ((c) holder).a(common$ListItem, this.f19446b);
        } else if (holder instanceof b) {
            ((b) holder).a(getItemCount() == 1, this.f19447c, this.f19448d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        if (i11 == 0) {
            View inflate = zc.a(parent).inflate(R.layout.plaid_item_search_select_institution, parent, false);
            Objects.requireNonNull(inflate, "rootView");
            PlaidListItemInstitution plaidListItemInstitution = (PlaidListItemInstitution) inflate;
            m9 m9Var = new m9(plaidListItemInstitution, plaidListItemInstitution);
            kotlin.jvm.internal.s.f(m9Var, "inflate(parent.layoutInflater, parent, false)");
            return new c(m9Var);
        } else if (i11 == 1) {
            View inflate2 = zc.a(parent).inflate(R.layout.plaid_item_search_select_exit, parent, false);
            int i12 = R.id.no_results_button;
            PlaidSecondaryButton plaidSecondaryButton = (PlaidSecondaryButton) b5.b.a(inflate2, i12);
            if (plaidSecondaryButton != null) {
                i12 = R.id.no_results_text;
                TextView textView = (TextView) b5.b.a(inflate2, i12);
                if (textView != null) {
                    l9 l9Var = new l9((LinearLayout) inflate2, plaidSecondaryButton, textView);
                    kotlin.jvm.internal.s.f(l9Var, "inflate(parent.layoutInflater, parent, false)");
                    return new b(l9Var, this.f19446b);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
        } else {
            throw new t5(kotlin.jvm.internal.s.p("View type is not supported: ", Integer.valueOf(i11)), null, null);
        }
    }

    public final void a(d listener) {
        kotlin.jvm.internal.s.g(listener, "listener");
        this.f19446b = listener;
    }
}