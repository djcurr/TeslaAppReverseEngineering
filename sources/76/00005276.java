package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class WeChatPayNextAction implements StripeModel {
    private final PaymentIntent paymentIntent;
    private final WeChat weChat;
    public static final Parcelable.Creator<WeChatPayNextAction> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<WeChatPayNextAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChatPayNextAction createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new WeChatPayNextAction(PaymentIntent.CREATOR.createFromParcel(parcel), WeChat.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChatPayNextAction[] newArray(int i11) {
            return new WeChatPayNextAction[i11];
        }
    }

    public WeChatPayNextAction(PaymentIntent paymentIntent, WeChat weChat) {
        s.g(paymentIntent, "paymentIntent");
        s.g(weChat, "weChat");
        this.paymentIntent = paymentIntent;
        this.weChat = weChat;
    }

    public static /* synthetic */ WeChatPayNextAction copy$default(WeChatPayNextAction weChatPayNextAction, PaymentIntent paymentIntent, WeChat weChat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentIntent = weChatPayNextAction.paymentIntent;
        }
        if ((i11 & 2) != 0) {
            weChat = weChatPayNextAction.weChat;
        }
        return weChatPayNextAction.copy(paymentIntent, weChat);
    }

    public final PaymentIntent component1() {
        return this.paymentIntent;
    }

    public final WeChat component2() {
        return this.weChat;
    }

    public final WeChatPayNextAction copy(PaymentIntent paymentIntent, WeChat weChat) {
        s.g(paymentIntent, "paymentIntent");
        s.g(weChat, "weChat");
        return new WeChatPayNextAction(paymentIntent, weChat);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WeChatPayNextAction) {
            WeChatPayNextAction weChatPayNextAction = (WeChatPayNextAction) obj;
            return s.c(this.paymentIntent, weChatPayNextAction.paymentIntent) && s.c(this.weChat, weChatPayNextAction.weChat);
        }
        return false;
    }

    public final PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    public final WeChat getWeChat() {
        return this.weChat;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.paymentIntent.hashCode() * 31) + this.weChat.hashCode();
    }

    public String toString() {
        return "WeChatPayNextAction(paymentIntent=" + this.paymentIntent + ", weChat=" + this.weChat + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        this.paymentIntent.writeToParcel(out, i11);
        this.weChat.writeToParcel(out, i11);
    }
}