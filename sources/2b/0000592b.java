package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeProgressViewLayoutBinding;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeProgressFragment extends Fragment {
    private final Integer accentColor;
    private final String directoryServerName;
    private final SdkTransactionId sdkTransactionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressFragment(String directoryServerName, SdkTransactionId sdkTransactionId, Integer num) {
        super(R.layout.stripe_progress_view_layout);
        s.g(directoryServerName, "directoryServerName");
        s.g(sdkTransactionId, "sdkTransactionId");
        this.directoryServerName = directoryServerName;
        this.sdkTransactionId = sdkTransactionId;
        this.accentColor = num;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        s.g(view, "view");
        super.onViewCreated(view, bundle);
        StripeProgressViewLayoutBinding bind = StripeProgressViewLayoutBinding.bind(view);
        s.f(bind, "bind(view)");
        Context requireContext = requireContext();
        s.f(requireContext, "requireContext()");
        Brand lookup$3ds2sdk_release = Brand.Companion.lookup$3ds2sdk_release(this.directoryServerName, new DefaultErrorReporter(requireContext, new Stripe3ds2ErrorReporterConfig(this.sdkTransactionId), null, null, null, null, null, 0, 252, null));
        ImageView brandLogo = bind.brandLogo;
        androidx.fragment.app.h activity = getActivity();
        brandLogo.setImageDrawable(activity == null ? null : androidx.core.content.b.getDrawable(activity, lookup$3ds2sdk_release.getDrawableResId$3ds2sdk_release()));
        Integer nameResId$3ds2sdk_release = lookup$3ds2sdk_release.getNameResId$3ds2sdk_release();
        brandLogo.setContentDescription(nameResId$3ds2sdk_release != null ? getString(nameResId$3ds2sdk_release.intValue()) : null);
        if (lookup$3ds2sdk_release.getShouldStretch$3ds2sdk_release()) {
            s.f(brandLogo, "brandLogo");
            ViewGroup.LayoutParams layoutParams = brandLogo.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.width = -2;
            layoutParams.height = -2;
            brandLogo.setLayoutParams(layoutParams);
        }
        s.f(brandLogo, "brandLogo");
        brandLogo.setVisibility(0);
        Integer num = this.accentColor;
        if (num == null) {
            return;
        }
        bind.progressBar.setIndicatorColor(num.intValue());
    }
}