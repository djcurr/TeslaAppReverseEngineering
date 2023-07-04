package com.stripe.android.view;

import com.stripe.android.view.CardInputWidget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Settings;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardInputWidgetPlacement {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int MIN_SEPARATION_IN_PX = 10;
    private int cardDateSeparation;
    private int cardTouchBufferLimit;
    private int cardWidth;
    private int cvcEndTouchBufferLimit;
    private int cvcPostalCodeSeparation;
    private int cvcStartPosition;
    private int cvcWidth;
    private int dateCvcSeparation;
    private int dateEndTouchBufferLimit;
    private int dateStartPosition;
    private int dateWidth;
    private int hiddenCardWidth;
    private int peekCardWidth;
    private int postalCodeStartPosition;
    private int postalCodeWidth;
    private int totalLengthInPixels;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CardInputWidgetPlacement() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public CardInputWidgetPlacement(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        this.totalLengthInPixels = i11;
        this.cardWidth = i12;
        this.hiddenCardWidth = i13;
        this.peekCardWidth = i14;
        this.cardDateSeparation = i15;
        this.dateWidth = i16;
        this.dateCvcSeparation = i17;
        this.cvcWidth = i18;
        this.cvcPostalCodeSeparation = i19;
        this.postalCodeWidth = i21;
        this.cardTouchBufferLimit = i22;
        this.dateStartPosition = i23;
        this.dateEndTouchBufferLimit = i24;
        this.cvcStartPosition = i25;
        this.cvcEndTouchBufferLimit = i26;
        this.postalCodeStartPosition = i27;
    }

    private final /* synthetic */ int getCardPeekCvcStartMargin() {
        return getCardPeekDateStartMargin() + this.dateWidth + this.dateCvcSeparation;
    }

    private final /* synthetic */ int getCardPeekDateStartMargin() {
        return this.peekCardWidth + this.cardDateSeparation;
    }

    private final /* synthetic */ int getCardPeekPostalCodeStartMargin() {
        return getCardPeekCvcStartMargin() + this.cvcWidth + this.cvcPostalCodeSeparation;
    }

    private final int toMinimalValueIfNegative(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        return 10;
    }

    public final int component1$payments_core_release() {
        return this.totalLengthInPixels;
    }

    public final int component10$payments_core_release() {
        return this.postalCodeWidth;
    }

    public final int component11$payments_core_release() {
        return this.cardTouchBufferLimit;
    }

    public final int component12$payments_core_release() {
        return this.dateStartPosition;
    }

    public final int component13$payments_core_release() {
        return this.dateEndTouchBufferLimit;
    }

    public final int component14$payments_core_release() {
        return this.cvcStartPosition;
    }

    public final int component15$payments_core_release() {
        return this.cvcEndTouchBufferLimit;
    }

    public final int component16$payments_core_release() {
        return this.postalCodeStartPosition;
    }

    public final int component2$payments_core_release() {
        return this.cardWidth;
    }

    public final int component3$payments_core_release() {
        return this.hiddenCardWidth;
    }

    public final int component4$payments_core_release() {
        return this.peekCardWidth;
    }

    public final int component5$payments_core_release() {
        return this.cardDateSeparation;
    }

    public final int component6$payments_core_release() {
        return this.dateWidth;
    }

    public final int component7$payments_core_release() {
        return this.dateCvcSeparation;
    }

    public final int component8$payments_core_release() {
        return this.cvcWidth;
    }

    public final int component9$payments_core_release() {
        return this.cvcPostalCodeSeparation;
    }

    public final CardInputWidgetPlacement copy(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        return new CardInputWidgetPlacement(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardInputWidgetPlacement) {
            CardInputWidgetPlacement cardInputWidgetPlacement = (CardInputWidgetPlacement) obj;
            return this.totalLengthInPixels == cardInputWidgetPlacement.totalLengthInPixels && this.cardWidth == cardInputWidgetPlacement.cardWidth && this.hiddenCardWidth == cardInputWidgetPlacement.hiddenCardWidth && this.peekCardWidth == cardInputWidgetPlacement.peekCardWidth && this.cardDateSeparation == cardInputWidgetPlacement.cardDateSeparation && this.dateWidth == cardInputWidgetPlacement.dateWidth && this.dateCvcSeparation == cardInputWidgetPlacement.dateCvcSeparation && this.cvcWidth == cardInputWidgetPlacement.cvcWidth && this.cvcPostalCodeSeparation == cardInputWidgetPlacement.cvcPostalCodeSeparation && this.postalCodeWidth == cardInputWidgetPlacement.postalCodeWidth && this.cardTouchBufferLimit == cardInputWidgetPlacement.cardTouchBufferLimit && this.dateStartPosition == cardInputWidgetPlacement.dateStartPosition && this.dateEndTouchBufferLimit == cardInputWidgetPlacement.dateEndTouchBufferLimit && this.cvcStartPosition == cardInputWidgetPlacement.cvcStartPosition && this.cvcEndTouchBufferLimit == cardInputWidgetPlacement.cvcEndTouchBufferLimit && this.postalCodeStartPosition == cardInputWidgetPlacement.postalCodeStartPosition;
        }
        return false;
    }

    public final int getCardDateSeparation$payments_core_release() {
        return this.cardDateSeparation;
    }

    public final int getCardTouchBufferLimit$payments_core_release() {
        return this.cardTouchBufferLimit;
    }

    public final int getCardWidth$payments_core_release() {
        return this.cardWidth;
    }

    public final int getCvcEndTouchBufferLimit$payments_core_release() {
        return this.cvcEndTouchBufferLimit;
    }

    public final int getCvcPostalCodeSeparation$payments_core_release() {
        return this.cvcPostalCodeSeparation;
    }

    public final /* synthetic */ int getCvcStartMargin$payments_core_release(boolean z11) {
        if (z11) {
            return this.totalLengthInPixels;
        }
        return getCardPeekCvcStartMargin();
    }

    public final int getCvcStartPosition$payments_core_release() {
        return this.cvcStartPosition;
    }

    public final int getCvcWidth$payments_core_release() {
        return this.cvcWidth;
    }

    public final int getDateCvcSeparation$payments_core_release() {
        return this.dateCvcSeparation;
    }

    public final int getDateEndTouchBufferLimit$payments_core_release() {
        return this.dateEndTouchBufferLimit;
    }

    public final /* synthetic */ int getDateStartMargin$payments_core_release(boolean z11) {
        if (z11) {
            return this.cardWidth + this.cardDateSeparation;
        }
        return getCardPeekDateStartMargin();
    }

    public final int getDateStartPosition$payments_core_release() {
        return this.dateStartPosition;
    }

    public final int getDateWidth$payments_core_release() {
        return this.dateWidth;
    }

    public final CardInputWidget.Field getFocusField$payments_core_release(int i11, int i12, boolean z11, boolean z12) {
        if (z11) {
            if (i11 < i12 + this.cardWidth) {
                return null;
            }
            if (i11 < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            if (i11 < this.dateStartPosition) {
                return CardInputWidget.Field.Expiry;
            }
            return null;
        } else if (z12) {
            if (i11 < i12 + this.peekCardWidth) {
                return null;
            }
            if (i11 < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            int i13 = this.dateStartPosition;
            if (i11 < i13) {
                return CardInputWidget.Field.Expiry;
            }
            if (i11 < i13 + this.dateWidth) {
                return null;
            }
            if (i11 < this.dateEndTouchBufferLimit) {
                return CardInputWidget.Field.Expiry;
            }
            int i14 = this.cvcStartPosition;
            if (i11 < i14) {
                return CardInputWidget.Field.Cvc;
            }
            if (i11 < i14 + this.cvcWidth) {
                return null;
            }
            if (i11 < this.cvcEndTouchBufferLimit) {
                return CardInputWidget.Field.Cvc;
            }
            if (i11 < this.postalCodeStartPosition) {
                return CardInputWidget.Field.PostalCode;
            }
            return null;
        } else if (i11 < i12 + this.peekCardWidth) {
            return null;
        } else {
            if (i11 < this.cardTouchBufferLimit) {
                return CardInputWidget.Field.Number;
            }
            int i15 = this.dateStartPosition;
            if (i11 < i15) {
                return CardInputWidget.Field.Expiry;
            }
            if (i11 < i15 + this.dateWidth) {
                return null;
            }
            if (i11 < this.dateEndTouchBufferLimit) {
                return CardInputWidget.Field.Expiry;
            }
            if (i11 < this.cvcStartPosition) {
                return CardInputWidget.Field.Cvc;
            }
            return null;
        }
    }

    public final int getHiddenCardWidth$payments_core_release() {
        return this.hiddenCardWidth;
    }

    public final int getPeekCardWidth$payments_core_release() {
        return this.peekCardWidth;
    }

    public final /* synthetic */ int getPostalCodeStartMargin$payments_core_release(boolean z11) {
        if (z11) {
            return this.totalLengthInPixels;
        }
        return getCardPeekPostalCodeStartMargin();
    }

    public final int getPostalCodeStartPosition$payments_core_release() {
        return this.postalCodeStartPosition;
    }

    public final int getPostalCodeWidth$payments_core_release() {
        return this.postalCodeWidth;
    }

    public final int getTotalLengthInPixels$payments_core_release() {
        return this.totalLengthInPixels;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.totalLengthInPixels) * 31) + Integer.hashCode(this.cardWidth)) * 31) + Integer.hashCode(this.hiddenCardWidth)) * 31) + Integer.hashCode(this.peekCardWidth)) * 31) + Integer.hashCode(this.cardDateSeparation)) * 31) + Integer.hashCode(this.dateWidth)) * 31) + Integer.hashCode(this.dateCvcSeparation)) * 31) + Integer.hashCode(this.cvcWidth)) * 31) + Integer.hashCode(this.cvcPostalCodeSeparation)) * 31) + Integer.hashCode(this.postalCodeWidth)) * 31) + Integer.hashCode(this.cardTouchBufferLimit)) * 31) + Integer.hashCode(this.dateStartPosition)) * 31) + Integer.hashCode(this.dateEndTouchBufferLimit)) * 31) + Integer.hashCode(this.cvcStartPosition)) * 31) + Integer.hashCode(this.cvcEndTouchBufferLimit)) * 31) + Integer.hashCode(this.postalCodeStartPosition);
    }

    public final void setCardDateSeparation$payments_core_release(int i11) {
        this.cardDateSeparation = i11;
    }

    public final void setCardTouchBufferLimit$payments_core_release(int i11) {
        this.cardTouchBufferLimit = i11;
    }

    public final void setCardWidth$payments_core_release(int i11) {
        this.cardWidth = i11;
    }

    public final void setCvcEndTouchBufferLimit$payments_core_release(int i11) {
        this.cvcEndTouchBufferLimit = i11;
    }

    public final void setCvcPostalCodeSeparation$payments_core_release(int i11) {
        this.cvcPostalCodeSeparation = i11;
    }

    public final void setCvcStartPosition$payments_core_release(int i11) {
        this.cvcStartPosition = i11;
    }

    public final void setCvcWidth$payments_core_release(int i11) {
        this.cvcWidth = i11;
    }

    public final void setDateCvcSeparation$payments_core_release(int i11) {
        this.dateCvcSeparation = i11;
    }

    public final void setDateEndTouchBufferLimit$payments_core_release(int i11) {
        this.dateEndTouchBufferLimit = i11;
    }

    public final void setDateStartPosition$payments_core_release(int i11) {
        this.dateStartPosition = i11;
    }

    public final void setDateWidth$payments_core_release(int i11) {
        this.dateWidth = i11;
    }

    public final void setHiddenCardWidth$payments_core_release(int i11) {
        this.hiddenCardWidth = i11;
    }

    public final void setPeekCardWidth$payments_core_release(int i11) {
        this.peekCardWidth = i11;
    }

    public final void setPostalCodeStartPosition$payments_core_release(int i11) {
        this.postalCodeStartPosition = i11;
    }

    public final void setPostalCodeWidth$payments_core_release(int i11) {
        this.postalCodeWidth = i11;
    }

    public final void setTotalLengthInPixels$payments_core_release(int i11) {
        this.totalLengthInPixels = i11;
    }

    public String toString() {
        return kotlin.jvm.internal.s.p("\n            TotalLengthInPixels = " + this.totalLengthInPixels + "\n            CardWidth = " + this.cardWidth + "\n            HiddenCardWidth = " + this.hiddenCardWidth + "\n            PeekCardWidth = " + this.peekCardWidth + "\n            CardDateSeparation = " + this.cardDateSeparation + "\n            DateWidth = " + this.dateWidth + "\n            DateCvcSeparation = " + this.dateCvcSeparation + "\n            CvcWidth = " + this.cvcWidth + "\n            CvcPostalCodeSeparation = " + this.cvcPostalCodeSeparation + "\n            PostalCodeWidth: " + this.postalCodeWidth + "\n            ", "\n            Touch Buffer Data:\n            CardTouchBufferLimit = " + this.cardTouchBufferLimit + "\n            DateStartPosition = " + this.dateStartPosition + "\n            DateEndTouchBufferLimit = " + this.dateEndTouchBufferLimit + "\n            CvcStartPosition = " + this.cvcStartPosition + "\n            CvcEndTouchBufferLimit = " + this.cvcEndTouchBufferLimit + "\n            PostalCodeStartPosition = " + this.postalCodeStartPosition + "\n            ");
    }

    public final /* synthetic */ void updateSpacing$payments_core_release(boolean z11, boolean z12, int i11, int i12) {
        if (z11) {
            int minimalValueIfNegative = toMinimalValueIfNegative((i12 - this.cardWidth) - this.dateWidth);
            this.cardDateSeparation = minimalValueIfNegative;
            int i13 = this.cardWidth;
            this.cardTouchBufferLimit = i11 + i13 + (minimalValueIfNegative / 2);
            this.dateStartPosition = i11 + i13 + minimalValueIfNegative;
        } else if (z12) {
            int i14 = i12 * 3;
            int minimalValueIfNegative2 = toMinimalValueIfNegative(((i14 / 10) - this.peekCardWidth) - (this.dateWidth / 4));
            this.cardDateSeparation = minimalValueIfNegative2;
            int minimalValueIfNegative3 = toMinimalValueIfNegative(((((i14 / 5) - this.peekCardWidth) - minimalValueIfNegative2) - this.dateWidth) - this.cvcWidth);
            this.dateCvcSeparation = minimalValueIfNegative3;
            int minimalValueIfNegative4 = toMinimalValueIfNegative((((((i12 - this.peekCardWidth) - this.cardDateSeparation) - this.dateWidth) - this.cvcWidth) - minimalValueIfNegative3) - this.postalCodeWidth);
            this.cvcPostalCodeSeparation = minimalValueIfNegative4;
            int i15 = i11 + this.peekCardWidth + this.cardDateSeparation;
            this.cardTouchBufferLimit = i15 / 3;
            this.dateStartPosition = i15;
            int i16 = i15 + this.dateWidth + this.dateCvcSeparation;
            this.dateEndTouchBufferLimit = i16 / 3;
            this.cvcStartPosition = i16;
            int i17 = i16 + this.cvcWidth + minimalValueIfNegative4;
            this.cvcEndTouchBufferLimit = i17 / 3;
            this.postalCodeStartPosition = i17;
        } else {
            int minimalValueIfNegative5 = toMinimalValueIfNegative(((i12 / 2) - this.peekCardWidth) - (this.dateWidth / 2));
            this.cardDateSeparation = minimalValueIfNegative5;
            int minimalValueIfNegative6 = toMinimalValueIfNegative((((i12 - this.peekCardWidth) - minimalValueIfNegative5) - this.dateWidth) - this.cvcWidth);
            this.dateCvcSeparation = minimalValueIfNegative6;
            int i18 = this.peekCardWidth;
            int i19 = this.cardDateSeparation;
            this.cardTouchBufferLimit = i11 + i18 + (i19 / 2);
            int i21 = i11 + i18 + i19;
            this.dateStartPosition = i21;
            int i22 = this.dateWidth;
            this.dateEndTouchBufferLimit = i21 + i22 + (minimalValueIfNegative6 / 2);
            this.cvcStartPosition = i21 + i22 + minimalValueIfNegative6;
        }
    }

    public /* synthetic */ CardInputWidgetPlacement(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, DefaultConstructorMarker defaultConstructorMarker) {
        this((i28 & 1) != 0 ? 0 : i11, (i28 & 2) != 0 ? 0 : i12, (i28 & 4) != 0 ? 0 : i13, (i28 & 8) != 0 ? 0 : i14, (i28 & 16) != 0 ? 0 : i15, (i28 & 32) != 0 ? 0 : i16, (i28 & 64) != 0 ? 0 : i17, (i28 & 128) != 0 ? 0 : i18, (i28 & 256) != 0 ? 0 : i19, (i28 & 512) != 0 ? 0 : i21, (i28 & 1024) != 0 ? 0 : i22, (i28 & 2048) != 0 ? 0 : i23, (i28 & 4096) != 0 ? 0 : i24, (i28 & PKIFailureInfo.certRevoked) != 0 ? 0 : i25, (i28 & 16384) != 0 ? 0 : i26, (i28 & 32768) != 0 ? 0 : i27);
    }
}