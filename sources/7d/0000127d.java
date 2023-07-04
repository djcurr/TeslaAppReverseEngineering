package com.adyen.checkout.adyen3ds2.exception;

import com.adyen.checkout.core.exception.ComponentException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/exception/Authentication3DS2Exception;", "Lcom/adyen/checkout/core/exception/ComponentException;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "a", "3ds2_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Authentication3DS2Exception extends ComponentException {

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Authentication3DS2Exception(String errorMessage) {
        super(errorMessage);
        s.g(errorMessage, "errorMessage");
    }
}