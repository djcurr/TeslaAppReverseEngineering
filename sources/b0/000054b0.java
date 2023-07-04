package com.stripe.android.paymentsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g0;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsAdapter;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.databinding.FragmentPaymentsheetPaymentMethodsListBinding;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.PaymentsThemeDefaults;
import com.stripe.android.ui.core.PaymentsThemeKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.r;

/* loaded from: classes6.dex */
public abstract class BasePaymentMethodsListFragment extends Fragment {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String IS_EDITING = "is_editing";
    private PaymentOptionsAdapter adapter;
    private final boolean canClickSelectedItem;
    protected FragmentConfig config;
    private MenuItem editMenuItem;
    private boolean isEditing;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BasePaymentMethodsListFragment(boolean z11) {
        super(R.layout.fragment_paymentsheet_payment_methods_list);
        this.canClickSelectedItem = z11;
    }

    public static /* synthetic */ void a(BasePaymentMethodsListFragment basePaymentMethodsListFragment, BasePaymentMethodsListFragment$setupRecyclerView$layoutManager$1 basePaymentMethodsListFragment$setupRecyclerView$layoutManager$1, Boolean bool) {
        m291setupRecyclerView$lambda3(basePaymentMethodsListFragment, basePaymentMethodsListFragment$setupRecyclerView$layoutManager$1, bool);
    }

    public final void deletePaymentMethod(PaymentOptionsAdapter.Item.SavedPaymentMethod savedPaymentMethod) {
        PaymentOptionsAdapter paymentOptionsAdapter = this.adapter;
        if (paymentOptionsAdapter == null) {
            kotlin.jvm.internal.s.x("adapter");
            paymentOptionsAdapter = null;
        }
        paymentOptionsAdapter.removeItem(savedPaymentMethod);
        getSheetViewModel().removePaymentMethod(savedPaymentMethod.getPaymentMethod());
    }

    public static /* synthetic */ void isEditing$paymentsheet_release$annotations() {
    }

    private final void setEditMenuText() {
        MenuItem menuItem;
        Context context = getContext();
        if (context == null) {
            return;
        }
        PaymentSheet.Configuration config$paymentsheet_release = getSheetViewModel().getConfig$paymentsheet_release();
        PaymentSheet.Appearance appearance = config$paymentsheet_release == null ? null : config$paymentsheet_release.getAppearance();
        if (appearance == null || (menuItem = this.editMenuItem) == null) {
            return;
        }
        menuItem.setTitle(PaymentsThemeKt.m395createTextSpanFromTextStyleqhTmNto(getString(isEditing$paymentsheet_release() ? R.string.done : R.string.edit), context, x2.g.f(appearance.getTypography().getSizeScaleFactor() * r.h(PaymentsThemeDefaults.INSTANCE.getTypography().m407getSmallFontSizeXSAIIZE())), t1.c0.b(appearance.getColors(PaymentsThemeKt.isSystemDarkTheme(context)).getAppBarIcon()), appearance.getTypography().getFontResId()));
    }

    private final void setupRecyclerView(FragmentPaymentsheetPaymentMethodsListBinding fragmentPaymentsheetPaymentMethodsListBinding) {
        final BasePaymentMethodsListFragment$setupRecyclerView$layoutManager$1 basePaymentMethodsListFragment$setupRecyclerView$layoutManager$1 = new BasePaymentMethodsListFragment$setupRecyclerView$layoutManager$1(getActivity());
        fragmentPaymentsheetPaymentMethodsListBinding.recycler.setLayoutManager(basePaymentMethodsListFragment$setupRecyclerView$layoutManager$1);
        PaymentOptionsAdapter paymentOptionsAdapter = new PaymentOptionsAdapter(getSheetViewModel().getResourceRepository().getLpmRepository(), this.canClickSelectedItem, new BasePaymentMethodsListFragment$setupRecyclerView$1(this), new BasePaymentMethodsListFragment$setupRecyclerView$2(this), new BasePaymentMethodsListFragment$setupRecyclerView$3(this), new BasePaymentMethodsListFragment$setupRecyclerView$4(getSheetViewModel()));
        fragmentPaymentsheetPaymentMethodsListBinding.recycler.setAdapter(paymentOptionsAdapter);
        this.adapter = paymentOptionsAdapter;
        FragmentConfig config = getConfig();
        List<PaymentMethod> value = getSheetViewModel().getPaymentMethods$paymentsheet_release().getValue();
        if (value == null) {
            value = wz.w.i();
        }
        paymentOptionsAdapter.setItems(config, value, getSheetViewModel() instanceof PaymentOptionsViewModel, (getSheetViewModel() instanceof PaymentOptionsViewModel) && kotlin.jvm.internal.s.c(getSheetViewModel().isLinkEnabled$paymentsheet_release().getValue(), Boolean.TRUE), getSheetViewModel().getSelection$paymentsheet_release().getValue());
        getSheetViewModel().getProcessing().observe(getViewLifecycleOwner(), new g0() { // from class: com.stripe.android.paymentsheet.b
            {
                BasePaymentMethodsListFragment.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BasePaymentMethodsListFragment.a(BasePaymentMethodsListFragment.this, basePaymentMethodsListFragment$setupRecyclerView$layoutManager$1, (Boolean) obj);
            }
        });
    }

    /* renamed from: setupRecyclerView$lambda-3 */
    public static final void m291setupRecyclerView$lambda3(BasePaymentMethodsListFragment this$0, BasePaymentMethodsListFragment$setupRecyclerView$layoutManager$1 layoutManager, Boolean bool) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(layoutManager, "$layoutManager");
        PaymentOptionsAdapter paymentOptionsAdapter = this$0.adapter;
        if (paymentOptionsAdapter == null) {
            kotlin.jvm.internal.s.x("adapter");
            paymentOptionsAdapter = null;
        }
        paymentOptionsAdapter.setEnabled$paymentsheet_release(!bool.booleanValue());
        layoutManager.setCanScroll(!bool.booleanValue());
    }

    public final FragmentConfig getConfig() {
        FragmentConfig fragmentConfig = this.config;
        if (fragmentConfig != null) {
            return fragmentConfig;
        }
        kotlin.jvm.internal.s.x("config");
        return null;
    }

    public abstract BaseSheetViewModel<?> getSheetViewModel();

    public final boolean isEditing$paymentsheet_release() {
        return this.isEditing;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        FragmentConfig fragmentConfig = arguments == null ? null : (FragmentConfig) arguments.getParcelable("com.stripe.android.paymentsheet.extra_fragment_config");
        if (fragmentConfig == null) {
            getSheetViewModel().onFatal(new IllegalArgumentException("Failed to start existing payment options fragment."));
            return;
        }
        setConfig(fragmentConfig);
        List<PaymentMethod> value = getSheetViewModel().getPaymentMethods$paymentsheet_release().getValue();
        setHasOptionsMenu(!(value == null || value.isEmpty()));
        getSheetViewModel().getEventReporter$paymentsheet_release().onShowExistingPaymentOptions();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.s.g(menu, "menu");
        kotlin.jvm.internal.s.g(inflater, "inflater");
        inflater.inflate(R.menu.paymentsheet_payment_methods_list, menu);
        this.editMenuItem = menu.findItem(R.id.edit);
        setEditMenuText();
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.s.g(item, "item");
        if (item.getItemId() == R.id.edit) {
            setEditing$paymentsheet_release(!this.isEditing);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onPaymentOptionSelected(PaymentSelection paymentSelection, boolean z11) {
        kotlin.jvm.internal.s.g(paymentSelection, "paymentSelection");
        getSheetViewModel().updateSelection(paymentSelection);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getSheetViewModel().getHeaderText$paymentsheet_release().setValue(getString(R.string.stripe_paymentsheet_select_payment_method));
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.s.g(outState, "outState");
        outState.putBoolean(IS_EDITING, this.isEditing);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        FragmentPaymentsheetPaymentMethodsListBinding bind = FragmentPaymentsheetPaymentMethodsListBinding.bind(view);
        kotlin.jvm.internal.s.f(bind, "bind(view)");
        setupRecyclerView(bind);
        setEditing$paymentsheet_release(bundle == null ? false : bundle.getBoolean(IS_EDITING));
    }

    protected final void setConfig(FragmentConfig fragmentConfig) {
        kotlin.jvm.internal.s.g(fragmentConfig, "<set-?>");
        this.config = fragmentConfig;
    }

    public final void setEditing$paymentsheet_release(boolean z11) {
        this.isEditing = z11;
        PaymentOptionsAdapter paymentOptionsAdapter = this.adapter;
        if (paymentOptionsAdapter == null) {
            kotlin.jvm.internal.s.x("adapter");
            paymentOptionsAdapter = null;
        }
        paymentOptionsAdapter.setEditing(z11);
        setEditMenuText();
        getSheetViewModel().setEditing(z11);
    }

    public abstract void transitionToAddPaymentMethod();
}