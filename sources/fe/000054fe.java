package com.stripe.android.paymentsheet;

import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.v1;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.reflect.KProperty;
import wz.e0;

/* loaded from: classes6.dex */
public final class PaymentOptionsAdapter extends RecyclerView.h<PaymentOptionViewHolder> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {m0.f(new kotlin.jvm.internal.z(PaymentOptionsAdapter.class, "isEnabled", "isEnabled$paymentsheet_release()Z", 0))};
    public static final Companion Companion = new Companion(null);
    public static final float PM_OPTIONS_DEFAULT_PADDING = 6.0f;
    private final h00.a<vz.b0> addCardClickListener;
    private final boolean canClickSelectedItem;
    private boolean isEditing;
    private final kotlin.properties.c isEnabled$delegate;
    private List<? extends Item> items;
    private final h00.a<vz.b0> linkClickListener;
    private final LpmRepository lpmRepository;
    private final h00.l<Item.SavedPaymentMethod, vz.b0> paymentMethodDeleteListener;
    private final h00.p<PaymentSelection, Boolean, vz.b0> paymentOptionSelectedListener;
    private SavedSelection savedSelection;
    private int selectedItemPosition;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: calculateViewWidth-u2uoSUM  reason: not valid java name */
        public final float m309calculateViewWidthu2uoSUM(ViewGroup viewGroup) {
            float f11;
            int measuredWidth = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
            float f12 = measuredWidth * 2;
            return x2.g.f((measuredWidth / (((int) (f12 / ((100 * f11) + 12.0f))) / 2.0f)) / viewGroup.getContext().getResources().getDisplayMetrics().density);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class Item {

        /* loaded from: classes6.dex */
        public static final class AddCard extends Item {
            public static final int $stable = 0;
            public static final AddCard INSTANCE = new AddCard();
            private static final ViewType viewType = ViewType.AddCard;

            private AddCard() {
                super(null);
            }

            @Override // com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item
            public ViewType getViewType() {
                return viewType;
            }
        }

        /* loaded from: classes6.dex */
        public static final class GooglePay extends Item {
            public static final int $stable = 0;
            public static final GooglePay INSTANCE = new GooglePay();
            private static final ViewType viewType = ViewType.GooglePay;

            private GooglePay() {
                super(null);
            }

            @Override // com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item
            public ViewType getViewType() {
                return viewType;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Link extends Item {
            public static final int $stable = 0;
            public static final Link INSTANCE = new Link();
            private static final ViewType viewType = ViewType.Link;

            private Link() {
                super(null);
            }

            @Override // com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item
            public ViewType getViewType() {
                return viewType;
            }
        }

        /* loaded from: classes6.dex */
        public static final class SavedPaymentMethod extends Item {
            public static final int $stable = PaymentMethod.$stable;
            private final PaymentMethod paymentMethod;
            private final ViewType viewType;

            /* loaded from: classes6.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PaymentMethod.Type.values().length];
                    iArr[PaymentMethod.Type.Card.ordinal()] = 1;
                    iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 2;
                    iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SavedPaymentMethod(PaymentMethod paymentMethod) {
                super(null);
                kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
                this.viewType = ViewType.SavedPaymentMethod;
            }

            public static /* synthetic */ SavedPaymentMethod copy$default(SavedPaymentMethod savedPaymentMethod, PaymentMethod paymentMethod, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paymentMethod = savedPaymentMethod.paymentMethod;
                }
                return savedPaymentMethod.copy(paymentMethod);
            }

            public final PaymentMethod component1() {
                return this.paymentMethod;
            }

            public final SavedPaymentMethod copy(PaymentMethod paymentMethod) {
                kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
                return new SavedPaymentMethod(paymentMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavedPaymentMethod) && kotlin.jvm.internal.s.c(this.paymentMethod, ((SavedPaymentMethod) obj).paymentMethod);
            }

            public final String getDescription(Resources resources) {
                String string;
                kotlin.jvm.internal.s.g(resources, "resources");
                PaymentMethod.Type type = this.paymentMethod.type;
                int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i11 == 1) {
                    int i12 = R.string.card_ending_in;
                    Object[] objArr = new Object[2];
                    PaymentMethod.Card card = this.paymentMethod.card;
                    objArr[0] = card == null ? null : card.brand;
                    objArr[1] = card != null ? card.last4 : null;
                    string = resources.getString(i12, objArr);
                } else if (i11 == 2) {
                    int i13 = R.string.bank_account_ending_in;
                    Object[] objArr2 = new Object[1];
                    PaymentMethod.SepaDebit sepaDebit = this.paymentMethod.sepaDebit;
                    objArr2[0] = sepaDebit != null ? sepaDebit.last4 : null;
                    string = resources.getString(i13, objArr2);
                } else if (i11 != 3) {
                    string = "";
                } else {
                    int i14 = R.string.bank_account_ending_in;
                    Object[] objArr3 = new Object[1];
                    PaymentMethod.USBankAccount uSBankAccount = this.paymentMethod.usBankAccount;
                    objArr3[0] = uSBankAccount != null ? uSBankAccount.last4 : null;
                    string = resources.getString(i14, objArr3);
                }
                kotlin.jvm.internal.s.f(string, "when (paymentMethod.type… else -> \"\"\n            }");
                return string;
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public final String getRemoveDescription(Resources resources) {
                kotlin.jvm.internal.s.g(resources, "resources");
                String string = resources.getString(R.string.stripe_paymentsheet_remove_pm, getDescription(resources));
                kotlin.jvm.internal.s.f(string, "resources.getString(\n   …(resources)\n            )");
                return string;
            }

            @Override // com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item
            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "SavedPaymentMethod(paymentMethod=" + this.paymentMethod + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private Item() {
        }

        public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract ViewType getViewType();
    }

    /* loaded from: classes6.dex */
    public static abstract class PaymentOptionViewHolder extends RecyclerView.e0 {
        private final ComposeView composeView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentOptionViewHolder(ComposeView composeView) {
            super(composeView);
            kotlin.jvm.internal.s.g(composeView, "composeView");
            this.composeView = composeView;
            composeView.setViewCompositionStrategy(v1.b.f3127a);
        }

        public abstract void bind(boolean z11, boolean z12, boolean z13, Item item, int i11);

        public final void onViewRecycled() {
            this.composeView.disposeComposition();
        }
    }

    /* loaded from: classes6.dex */
    public enum ViewType {
        SavedPaymentMethod,
        AddCard,
        GooglePay,
        Link
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            iArr[ViewType.AddCard.ordinal()] = 1;
            iArr[ViewType.GooglePay.ordinal()] = 2;
            iArr[ViewType.Link.ordinal()] = 3;
            iArr[ViewType.SavedPaymentMethod.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsAdapter(LpmRepository lpmRepository, boolean z11, h00.p<? super PaymentSelection, ? super Boolean, vz.b0> paymentOptionSelectedListener, h00.l<? super Item.SavedPaymentMethod, vz.b0> paymentMethodDeleteListener, h00.a<vz.b0> addCardClickListener, h00.a<vz.b0> linkClickListener) {
        List<? extends Item> i11;
        kotlin.jvm.internal.s.g(lpmRepository, "lpmRepository");
        kotlin.jvm.internal.s.g(paymentOptionSelectedListener, "paymentOptionSelectedListener");
        kotlin.jvm.internal.s.g(paymentMethodDeleteListener, "paymentMethodDeleteListener");
        kotlin.jvm.internal.s.g(addCardClickListener, "addCardClickListener");
        kotlin.jvm.internal.s.g(linkClickListener, "linkClickListener");
        this.lpmRepository = lpmRepository;
        this.canClickSelectedItem = z11;
        this.paymentOptionSelectedListener = paymentOptionSelectedListener;
        this.paymentMethodDeleteListener = paymentMethodDeleteListener;
        this.addCardClickListener = addCardClickListener;
        this.linkClickListener = linkClickListener;
        i11 = wz.w.i();
        this.items = i11;
        this.selectedItemPosition = -1;
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.isEnabled$delegate = new kotlin.properties.b<Boolean>(Boolean.TRUE) { // from class: com.stripe.android.paymentsheet.PaymentOptionsAdapter$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool, Boolean bool2) {
                kotlin.jvm.internal.s.g(property, "property");
                if (bool.booleanValue() != bool2.booleanValue()) {
                    this.notifyDataSetChanged();
                }
            }
        };
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int findInitialSelectedPosition(SavedSelection savedSelection) {
        List n11;
        boolean z11;
        Integer[] numArr = new Integer[4];
        Iterator<? extends Item> it2 = this.items.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            }
            Item next = it2.next();
            if (kotlin.jvm.internal.s.c(savedSelection, SavedSelection.GooglePay.INSTANCE)) {
                z11 = next instanceof Item.GooglePay;
            } else {
                if (savedSelection instanceof SavedSelection.PaymentMethod) {
                    if (next instanceof Item.SavedPaymentMethod) {
                        z11 = kotlin.jvm.internal.s.c(((SavedSelection.PaymentMethod) savedSelection).getId(), ((Item.SavedPaymentMethod) next).getPaymentMethod().f20932id);
                    }
                } else {
                    kotlin.jvm.internal.s.c(savedSelection, SavedSelection.None.INSTANCE);
                }
                z11 = false;
            }
            if (z11) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        numArr[0] = valueOf;
        Iterator<? extends Item> it3 = this.items.iterator();
        int i12 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i12 = -1;
                break;
            } else if (it3.next() instanceof Item.GooglePay) {
                break;
            } else {
                i12++;
            }
        }
        Integer valueOf2 = Integer.valueOf(i12);
        if (!(valueOf2.intValue() != -1)) {
            valueOf2 = null;
        }
        numArr[1] = valueOf2;
        Iterator<? extends Item> it4 = this.items.iterator();
        int i13 = 0;
        while (true) {
            if (!it4.hasNext()) {
                i13 = -1;
                break;
            } else if (it4.next() instanceof Item.Link) {
                break;
            } else {
                i13++;
            }
        }
        Integer valueOf3 = Integer.valueOf(i13);
        if (!(valueOf3.intValue() != -1)) {
            valueOf3 = null;
        }
        numArr[2] = valueOf3;
        Iterator<? extends Item> it5 = this.items.iterator();
        int i14 = 0;
        while (true) {
            if (!it5.hasNext()) {
                i14 = -1;
                break;
            } else if (it5.next() instanceof Item.SavedPaymentMethod) {
                break;
            } else {
                i14++;
            }
        }
        Integer valueOf4 = Integer.valueOf(i14);
        numArr[3] = valueOf4.intValue() != -1 ? valueOf4 : null;
        n11 = wz.w.n(numArr);
        Integer num = (Integer) wz.u.d0(n11);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private final int findSelectedPosition(PaymentSelection paymentSelection) {
        boolean c11;
        int i11 = 0;
        for (Item item : this.items) {
            if (kotlin.jvm.internal.s.c(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
                c11 = item instanceof Item.GooglePay;
            } else {
                c11 = ((paymentSelection instanceof PaymentSelection.Saved) && (item instanceof Item.SavedPaymentMethod)) ? kotlin.jvm.internal.s.c(((PaymentSelection.Saved) paymentSelection).getPaymentMethod().f20932id, ((Item.SavedPaymentMethod) item).getPaymentMethod().f20932id) : false;
            }
            if (c11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static /* synthetic */ void getItems$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void onItemSelected$paymentsheet_release$default(PaymentOptionsAdapter paymentOptionsAdapter, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        paymentOptionsAdapter.onItemSelected$paymentsheet_release(i11, z11, z12);
    }

    public static /* synthetic */ void setItems$default(PaymentOptionsAdapter paymentOptionsAdapter, FragmentConfig fragmentConfig, List list, boolean z11, boolean z12, PaymentSelection paymentSelection, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            paymentSelection = null;
        }
        paymentOptionsAdapter.setItems(fragmentConfig, list, z11, z12, paymentSelection);
    }

    private final List<PaymentMethod> sortedPaymentMethods(List<PaymentMethod> list, SavedSelection savedSelection) {
        int i11;
        List<PaymentMethod> Q0;
        if (savedSelection instanceof SavedSelection.PaymentMethod) {
            i11 = 0;
            for (PaymentMethod paymentMethod : list) {
                if (kotlin.jvm.internal.s.c(paymentMethod.f20932id, ((SavedSelection.PaymentMethod) savedSelection).getId())) {
                    break;
                }
                i11++;
            }
        }
        i11 = -1;
        if (i11 != -1) {
            Q0 = e0.Q0(list);
            Q0.add(0, Q0.remove(i11));
            return Q0;
        }
        return list;
    }

    public final h00.a<vz.b0> getAddCardClickListener() {
        return this.addCardClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i11) {
        return this.items.get(i11).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i11) {
        return this.items.get(i11).getViewType().ordinal();
    }

    public final List<Item> getItems$paymentsheet_release() {
        return this.items;
    }

    public final h00.a<vz.b0> getLinkClickListener() {
        return this.linkClickListener;
    }

    public final LpmRepository getLpmRepository() {
        return this.lpmRepository;
    }

    public final h00.l<Item.SavedPaymentMethod, vz.b0> getPaymentMethodDeleteListener() {
        return this.paymentMethodDeleteListener;
    }

    public final h00.p<PaymentSelection, Boolean, vz.b0> getPaymentOptionSelectedListener() {
        return this.paymentOptionSelectedListener;
    }

    public final Item getSelectedItem$paymentsheet_release() {
        return (Item) wz.u.e0(this.items, this.selectedItemPosition);
    }

    public final boolean isEnabled$paymentsheet_release() {
        return ((Boolean) this.isEnabled$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void onItemSelected$paymentsheet_release(int i11, boolean z11, boolean z12) {
        PaymentSelection saved;
        if (!z12) {
            if (i11 == -1) {
                return;
            }
            if ((!this.canClickSelectedItem && i11 == this.selectedItemPosition) || this.isEditing) {
                return;
            }
        }
        int i12 = this.selectedItemPosition;
        this.selectedItemPosition = i11;
        notifyItemChanged(i12);
        notifyItemChanged(i11);
        Item item = this.items.get(i11);
        if (kotlin.jvm.internal.s.c(item, Item.AddCard.INSTANCE) ? true : kotlin.jvm.internal.s.c(item, Item.Link.INSTANCE)) {
            saved = null;
        } else if (kotlin.jvm.internal.s.c(item, Item.GooglePay.INSTANCE)) {
            saved = PaymentSelection.GooglePay.INSTANCE;
        } else if (!(item instanceof Item.SavedPaymentMethod)) {
            throw new NoWhenBranchMatchedException();
        } else {
            saved = new PaymentSelection.Saved(((Item.SavedPaymentMethod) item).getPaymentMethod());
        }
        if (saved == null) {
            return;
        }
        getPaymentOptionSelectedListener().invoke(saved, Boolean.valueOf(z11));
    }

    public final void removeItem(Item item) {
        List<? extends Item> Q0;
        kotlin.jvm.internal.s.g(item, "item");
        int indexOf = this.items.indexOf(item);
        Q0 = e0.Q0(this.items);
        Q0.remove(indexOf);
        this.items = Q0;
        notifyItemRemoved(indexOf);
    }

    public final void setEditing(boolean z11) {
        if (z11 != this.isEditing) {
            this.isEditing = z11;
            notifyDataSetChanged();
        }
    }

    public final void setEnabled$paymentsheet_release(boolean z11) {
        this.isEnabled$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    public final void setItems(FragmentConfig config, List<PaymentMethod> paymentMethods, boolean z11, boolean z12, PaymentSelection paymentSelection) {
        List n11;
        int t11;
        List<? extends Item> y02;
        int intValue;
        kotlin.jvm.internal.s.g(config, "config");
        kotlin.jvm.internal.s.g(paymentMethods, "paymentMethods");
        this.savedSelection = config.getSavedSelection();
        Item[] itemArr = new Item[3];
        boolean z13 = false;
        itemArr[0] = Item.AddCard.INSTANCE;
        Item.GooglePay googlePay = Item.GooglePay.INSTANCE;
        if (!(config.isGooglePayReady() && z11)) {
            googlePay = null;
        }
        itemArr[1] = googlePay;
        Item.Link link = Item.Link.INSTANCE;
        if (!z12) {
            link = null;
        }
        itemArr[2] = link;
        n11 = wz.w.n(itemArr);
        List<PaymentMethod> sortedPaymentMethods = sortedPaymentMethods(paymentMethods, config.getSavedSelection());
        t11 = wz.x.t(sortedPaymentMethods, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (PaymentMethod paymentMethod : sortedPaymentMethods) {
            arrayList.add(new Item.SavedPaymentMethod(paymentMethod));
        }
        y02 = e0.y0(n11, arrayList);
        this.items = y02;
        Integer valueOf = paymentSelection == null ? null : Integer.valueOf(findSelectedPosition(paymentSelection));
        Integer num = (valueOf == null || valueOf.intValue() != -1) ? true : true ? valueOf : null;
        if (num == null) {
            intValue = findInitialSelectedPosition(config.getSavedSelection());
        } else {
            intValue = num.intValue();
        }
        onItemSelected$paymentsheet_release$default(this, intValue, false, false, 4, null);
        notifyDataSetChanged();
    }

    public final void setItems$paymentsheet_release(List<? extends Item> list) {
        kotlin.jvm.internal.s.g(list, "<set-?>");
        this.items = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(PaymentOptionViewHolder holder, int i11) {
        boolean z11;
        kotlin.jvm.internal.s.g(holder, "holder");
        if (holder instanceof SavedPaymentMethodViewHolder) {
            z11 = isEnabled$paymentsheet_release();
        } else {
            z11 = isEnabled$paymentsheet_release() && !this.isEditing;
        }
        holder.bind(i11 == this.selectedItemPosition && !this.isEditing, z11, this.isEditing, this.items.get(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public PaymentOptionViewHolder onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        float m309calculateViewWidthu2uoSUM = Companion.m309calculateViewWidthu2uoSUM(parent);
        int i12 = WhenMappings.$EnumSwitchMapping$0[ViewType.values()[i11].ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        return new SavedPaymentMethodViewHolder(parent, m309calculateViewWidthu2uoSUM, this.lpmRepository, new PaymentOptionsAdapter$onCreateViewHolder$2(this), new PaymentOptionsAdapter$onCreateViewHolder$3(this), (DefaultConstructorMarker) null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new LinkViewHolder(parent, m309calculateViewWidthu2uoSUM, this.linkClickListener, (DefaultConstructorMarker) null);
            }
            return new GooglePayViewHolder(parent, m309calculateViewWidthu2uoSUM, new PaymentOptionsAdapter$onCreateViewHolder$1(this), (DefaultConstructorMarker) null);
        }
        return new AddNewPaymentMethodViewHolder(parent, m309calculateViewWidthu2uoSUM, this.addCardClickListener, (DefaultConstructorMarker) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(PaymentOptionViewHolder holder) {
        kotlin.jvm.internal.s.g(holder, "holder");
        holder.onViewRecycled();
        super.onViewRecycled((PaymentOptionsAdapter) holder);
    }

    /* loaded from: classes6.dex */
    public static final class AddNewPaymentMethodViewHolder extends PaymentOptionViewHolder {
        private final ComposeView composeView;
        private final h00.a<vz.b0> onItemSelectedListener;
        private final float width;

        public /* synthetic */ AddNewPaymentMethodViewHolder(ViewGroup viewGroup, float f11, h00.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewGroup, f11, aVar);
        }

        private AddNewPaymentMethodViewHolder(ComposeView composeView, float f11, h00.a<vz.b0> aVar) {
            super(composeView);
            this.composeView = composeView;
            this.width = f11;
            this.onItemSelectedListener = aVar;
        }

        public /* synthetic */ AddNewPaymentMethodViewHolder(ComposeView composeView, float f11, h00.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(composeView, f11, (h00.a<vz.b0>) aVar);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder
        public void bind(boolean z11, boolean z12, boolean z13, Item item, int i11) {
            kotlin.jvm.internal.s.g(item, "item");
            this.composeView.setContent(j1.c.c(-985544551, true, new PaymentOptionsAdapter$AddNewPaymentMethodViewHolder$bind$1(this, z12)));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private AddNewPaymentMethodViewHolder(android.view.ViewGroup r8, float r9, h00.a<vz.b0> r10) {
            /*
                r7 = this;
                androidx.compose.ui.platform.ComposeView r6 = new androidx.compose.ui.platform.ComposeView
                android.content.Context r1 = r8.getContext()
                java.lang.String r8 = "parent.context"
                kotlin.jvm.internal.s.f(r1, r8)
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 0
                r7.<init>(r6, r9, r10, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.AddNewPaymentMethodViewHolder.<init>(android.view.ViewGroup, float, h00.a):void");
        }
    }

    /* loaded from: classes6.dex */
    public static final class GooglePayViewHolder extends PaymentOptionViewHolder {
        private final ComposeView composeView;
        private final h00.p<Integer, Boolean, vz.b0> onItemSelectedListener;
        private final float width;

        public /* synthetic */ GooglePayViewHolder(ViewGroup viewGroup, float f11, h00.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewGroup, f11, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private GooglePayViewHolder(ComposeView composeView, float f11, h00.p<? super Integer, ? super Boolean, vz.b0> pVar) {
            super(composeView);
            this.composeView = composeView;
            this.width = f11;
            this.onItemSelectedListener = pVar;
        }

        public /* synthetic */ GooglePayViewHolder(ComposeView composeView, float f11, h00.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(composeView, f11, (h00.p<? super Integer, ? super Boolean, vz.b0>) pVar);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder
        public void bind(boolean z11, boolean z12, boolean z13, Item item, int i11) {
            kotlin.jvm.internal.s.g(item, "item");
            this.composeView.setContent(j1.c.c(-985550735, true, new PaymentOptionsAdapter$GooglePayViewHolder$bind$1(this, z11, z12, i11)));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private GooglePayViewHolder(android.view.ViewGroup r8, float r9, h00.p<? super java.lang.Integer, ? super java.lang.Boolean, vz.b0> r10) {
            /*
                r7 = this;
                androidx.compose.ui.platform.ComposeView r6 = new androidx.compose.ui.platform.ComposeView
                android.content.Context r1 = r8.getContext()
                java.lang.String r8 = "parent.context"
                kotlin.jvm.internal.s.f(r1, r8)
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 0
                r7.<init>(r6, r9, r10, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.GooglePayViewHolder.<init>(android.view.ViewGroup, float, h00.p):void");
        }
    }

    /* loaded from: classes6.dex */
    public static final class LinkViewHolder extends PaymentOptionViewHolder {
        private final ComposeView composeView;
        private final h00.a<vz.b0> onItemSelectedListener;
        private final float width;

        public /* synthetic */ LinkViewHolder(ViewGroup viewGroup, float f11, h00.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewGroup, f11, aVar);
        }

        private LinkViewHolder(ComposeView composeView, float f11, h00.a<vz.b0> aVar) {
            super(composeView);
            this.composeView = composeView;
            this.width = f11;
            this.onItemSelectedListener = aVar;
        }

        public /* synthetic */ LinkViewHolder(ComposeView composeView, float f11, h00.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(composeView, f11, (h00.a<vz.b0>) aVar);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder
        public void bind(boolean z11, boolean z12, boolean z13, Item item, int i11) {
            kotlin.jvm.internal.s.g(item, "item");
            this.composeView.setContent(j1.c.c(-985548844, true, new PaymentOptionsAdapter$LinkViewHolder$bind$1(this, z11, z12)));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private LinkViewHolder(android.view.ViewGroup r8, float r9, h00.a<vz.b0> r10) {
            /*
                r7 = this;
                androidx.compose.ui.platform.ComposeView r6 = new androidx.compose.ui.platform.ComposeView
                android.content.Context r1 = r8.getContext()
                java.lang.String r8 = "parent.context"
                kotlin.jvm.internal.s.f(r1, r8)
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 0
                r7.<init>(r6, r9, r10, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.LinkViewHolder.<init>(android.view.ViewGroup, float, h00.a):void");
        }
    }

    /* loaded from: classes6.dex */
    public static final class SavedPaymentMethodViewHolder extends PaymentOptionViewHolder {
        private final ComposeView composeView;
        private final LpmRepository lpmRepository;
        private final h00.p<Integer, Boolean, vz.b0> onItemSelectedListener;
        private final h00.l<Integer, vz.b0> onRemoveListener;
        private final float width;

        public /* synthetic */ SavedPaymentMethodViewHolder(ViewGroup viewGroup, float f11, LpmRepository lpmRepository, h00.p pVar, h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewGroup, f11, lpmRepository, pVar, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SavedPaymentMethodViewHolder(ComposeView composeView, float f11, LpmRepository lpmRepository, h00.l<? super Integer, vz.b0> lVar, h00.p<? super Integer, ? super Boolean, vz.b0> pVar) {
            super(composeView);
            this.composeView = composeView;
            this.width = f11;
            this.lpmRepository = lpmRepository;
            this.onRemoveListener = lVar;
            this.onItemSelectedListener = pVar;
        }

        public /* synthetic */ SavedPaymentMethodViewHolder(ComposeView composeView, float f11, LpmRepository lpmRepository, h00.l lVar, h00.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(composeView, f11, lpmRepository, lVar, pVar);
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder
        public void bind(boolean z11, boolean z12, boolean z13, Item item, int i11) {
            kotlin.jvm.internal.s.g(item, "item");
            Item.SavedPaymentMethod savedPaymentMethod = (Item.SavedPaymentMethod) item;
            Integer labelIcon = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod());
            PaymentMethod paymentMethod = savedPaymentMethod.getPaymentMethod();
            Resources resources = this.itemView.getResources();
            kotlin.jvm.internal.s.f(resources, "itemView.resources");
            String label = PaymentMethodsUiExtensionKt.getLabel(paymentMethod, resources);
            if (label == null) {
                return;
            }
            Resources resources2 = this.itemView.getResources();
            int i12 = R.string.stripe_paymentsheet_remove_pm;
            Object[] objArr = new Object[1];
            LpmRepository lpmRepository = this.lpmRepository;
            PaymentMethod.Type type = savedPaymentMethod.getPaymentMethod().type;
            LpmRepository.SupportedPaymentMethod fromCode = lpmRepository.fromCode(type == null ? null : type.code);
            objArr[0] = fromCode != null ? this.itemView.getResources().getString(fromCode.getDisplayNameResource()) : null;
            String string = resources2.getString(i12, objArr);
            kotlin.jvm.internal.s.f(string, "itemView.resources.getSt…          }\n            )");
            this.composeView.setContent(j1.c.c(-985546132, true, new PaymentOptionsAdapter$SavedPaymentMethodViewHolder$bind$1(this, savedPaymentMethod, item, z11, z13, z12, labelIcon, label, string, i11)));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private SavedPaymentMethodViewHolder(android.view.ViewGroup r8, float r9, com.stripe.android.ui.core.forms.resources.LpmRepository r10, h00.p<? super java.lang.Integer, ? super java.lang.Boolean, vz.b0> r11, h00.l<? super java.lang.Integer, vz.b0> r12) {
            /*
                r7 = this;
                androidx.compose.ui.platform.ComposeView r6 = new androidx.compose.ui.platform.ComposeView
                android.content.Context r1 = r8.getContext()
                java.lang.String r8 = "parent.context"
                kotlin.jvm.internal.s.f(r1, r8)
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 0
                r0 = r7
                r1 = r6
                r2 = r9
                r3 = r10
                r4 = r12
                r5 = r11
                r6 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.SavedPaymentMethodViewHolder.<init>(android.view.ViewGroup, float, com.stripe.android.ui.core.forms.resources.LpmRepository, h00.p, h00.l):void");
        }
    }
}