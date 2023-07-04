package com.stripe.android.stripe3ds2.views;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.w;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public enum Brand {
    Visa("visa", R.drawable.stripe_3ds2_ic_visa, Integer.valueOf(R.string.stripe_3ds2_brand_visa), false, 8, null),
    Mastercard("mastercard", R.drawable.stripe_3ds2_ic_mastercard, Integer.valueOf(R.string.stripe_3ds2_brand_mastercard), false, 8, null),
    Amex("american_express", R.drawable.stripe_3ds2_ic_amex, Integer.valueOf(R.string.stripe_3ds2_brand_amex), false, 8, null),
    Discover("discover", R.drawable.stripe_3ds2_ic_discover, Integer.valueOf(R.string.stripe_3ds2_brand_discover), false, 8, null),
    CartesBancaires("cartes_bancaires", R.drawable.stripe_3ds2_ic_cartesbancaires, Integer.valueOf(R.string.stripe_3ds2_brand_cartesbancaires), true),
    UnionPay("unionpay", R.drawable.stripe_3ds2_ic_unionpay, Integer.valueOf(R.string.stripe_3ds2_brand_unionpay), false, 8, null),
    Unknown("unknown", R.drawable.stripe_3ds2_ic_unknown, null, false, 8, null);
    
    public static final Companion Companion = new Companion(null);
    private final String directoryServerName;
    private final int drawableResId;
    private final Integer nameResId;
    private final boolean shouldStretch;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Brand lookup$3ds2sdk_release(String directoryServerName, ErrorReporter errorReporter) {
            Brand brand;
            Brand b11;
            CharSequence d12;
            boolean u11;
            s.g(directoryServerName, "directoryServerName");
            s.g(errorReporter, "errorReporter");
            Brand[] values = Brand.values();
            int length = values.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    brand = null;
                    break;
                }
                brand = values[i12];
                i12++;
                String directoryServerName$3ds2sdk_release = brand.getDirectoryServerName$3ds2sdk_release();
                d12 = w.d1(directoryServerName);
                u11 = v.u(directoryServerName$3ds2sdk_release, d12.toString(), true);
                if (u11) {
                    break;
                }
            }
            if (brand != null) {
                q.a aVar = q.f54772b;
                b11 = q.b(brand);
            } else {
                Brand[] values2 = Brand.values();
                ArrayList arrayList = new ArrayList(values2.length);
                int length2 = values2.length;
                while (i11 < length2) {
                    Brand brand2 = values2[i11];
                    i11++;
                    arrayList.add(brand2.getDirectoryServerName$3ds2sdk_release());
                }
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(new SDKRuntimeException("Directory server name '" + directoryServerName + "' is not supported. Must be one of " + arrayList + CoreConstants.DOT, null, 2, null)));
            }
            Throwable e11 = q.e(b11);
            if (e11 != null) {
                errorReporter.reportError(e11);
            }
            Brand brand3 = Brand.Unknown;
            if (q.g(b11)) {
                b11 = brand3;
            }
            return (Brand) b11;
        }
    }

    Brand(String str, int i11, Integer num, boolean z11) {
        this.directoryServerName = str;
        this.drawableResId = i11;
        this.nameResId = num;
        this.shouldStretch = z11;
    }

    public final String getDirectoryServerName$3ds2sdk_release() {
        return this.directoryServerName;
    }

    public final int getDrawableResId$3ds2sdk_release() {
        return this.drawableResId;
    }

    public final Integer getNameResId$3ds2sdk_release() {
        return this.nameResId;
    }

    public final boolean getShouldStretch$3ds2sdk_release() {
        return this.shouldStretch;
    }

    /* synthetic */ Brand(String str, int i11, Integer num, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, num, (i12 & 8) != 0 ? false : z11);
    }
}