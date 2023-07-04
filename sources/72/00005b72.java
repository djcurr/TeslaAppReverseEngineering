package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class TextFieldStateConstants {

    /* loaded from: classes6.dex */
    public static abstract class Valid implements TextFieldState {
        public static final int $stable = 0;

        /* loaded from: classes6.dex */
        public static final class Full extends Valid {
            public static final int $stable = 0;
            public static final Full INSTANCE = new Full();

            private Full() {
                super(null);
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean isFull() {
                return true;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Limitless extends Valid {
            public static final int $stable = 0;
            public static final Limitless INSTANCE = new Limitless();

            private Limitless() {
                super(null);
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean isFull() {
                return false;
            }
        }

        private Valid() {
        }

        public /* synthetic */ Valid(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.stripe.android.ui.core.elements.TextFieldState
        public FieldError getError() {
            return null;
        }

        @Override // com.stripe.android.ui.core.elements.TextFieldState
        public boolean isBlank() {
            return false;
        }

        @Override // com.stripe.android.ui.core.elements.TextFieldState
        public boolean isValid() {
            return true;
        }

        @Override // com.stripe.android.ui.core.elements.TextFieldState
        public boolean shouldShowError(boolean z11) {
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class Error implements TextFieldState {
        public static final int $stable = 8;
        private final int errorMessageResId;
        private final Object[] formatArgs;

        /* loaded from: classes6.dex */
        public static final class Blank extends Error {
            public static final int $stable = 0;
            public static final Blank INSTANCE = new Blank();

            private Blank() {
                super(R.string.blank_and_required, null, 2, null);
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean isBlank() {
                return true;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean shouldShowError(boolean z11) {
                return false;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Incomplete extends Error {
            public static final int $stable = 0;
            private final int errorMessageResId;

            public Incomplete(int i11) {
                super(i11, null, 2, null);
                this.errorMessageResId = i11;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldStateConstants.Error
            protected int getErrorMessageResId() {
                return this.errorMessageResId;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean isBlank() {
                return false;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean shouldShowError(boolean z11) {
                return !z11;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Invalid extends Error {
            public static final int $stable = 8;
            private final int errorMessageResId;
            private final Object[] formatArgs;

            public /* synthetic */ Invalid(int i11, Object[] objArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, (i12 & 2) != 0 ? null : objArr);
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldStateConstants.Error
            protected int getErrorMessageResId() {
                return this.errorMessageResId;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldStateConstants.Error
            protected Object[] getFormatArgs() {
                return this.formatArgs;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean isBlank() {
                return false;
            }

            @Override // com.stripe.android.ui.core.elements.TextFieldState
            public boolean shouldShowError(boolean z11) {
                return true;
            }

            public Invalid(int i11, Object[] objArr) {
                super(i11, objArr, null);
                this.errorMessageResId = i11;
                this.formatArgs = objArr;
            }
        }

        private Error(int i11, Object[] objArr) {
            this.errorMessageResId = i11;
            this.formatArgs = objArr;
        }

        public /* synthetic */ Error(int i11, Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, objArr);
        }

        @Override // com.stripe.android.ui.core.elements.TextFieldState
        public FieldError getError() {
            return new FieldError(getErrorMessageResId(), getFormatArgs());
        }

        protected int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        protected Object[] getFormatArgs() {
            return this.formatArgs;
        }

        @Override // com.stripe.android.ui.core.elements.TextFieldState
        public boolean isFull() {
            return false;
        }

        @Override // com.stripe.android.ui.core.elements.TextFieldState
        public boolean isValid() {
            return false;
        }

        public /* synthetic */ Error(int i11, Object[] objArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : objArr, null);
        }
    }
}