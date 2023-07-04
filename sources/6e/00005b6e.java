package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class TextFieldIcon {
    public static final int $stable = 0;

    /* loaded from: classes6.dex */
    public static final class MultiTrailing extends TextFieldIcon {
        public static final int $stable = 8;
        private final List<Trailing> animatedIcons;
        private final List<Trailing> staticIcons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiTrailing(List<Trailing> staticIcons, List<Trailing> animatedIcons) {
            super(null);
            s.g(staticIcons, "staticIcons");
            s.g(animatedIcons, "animatedIcons");
            this.staticIcons = staticIcons;
            this.animatedIcons = animatedIcons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiTrailing copy$default(MultiTrailing multiTrailing, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = multiTrailing.staticIcons;
            }
            if ((i11 & 2) != 0) {
                list2 = multiTrailing.animatedIcons;
            }
            return multiTrailing.copy(list, list2);
        }

        public final List<Trailing> component1() {
            return this.staticIcons;
        }

        public final List<Trailing> component2() {
            return this.animatedIcons;
        }

        public final MultiTrailing copy(List<Trailing> staticIcons, List<Trailing> animatedIcons) {
            s.g(staticIcons, "staticIcons");
            s.g(animatedIcons, "animatedIcons");
            return new MultiTrailing(staticIcons, animatedIcons);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MultiTrailing) {
                MultiTrailing multiTrailing = (MultiTrailing) obj;
                return s.c(this.staticIcons, multiTrailing.staticIcons) && s.c(this.animatedIcons, multiTrailing.animatedIcons);
            }
            return false;
        }

        public final List<Trailing> getAnimatedIcons() {
            return this.animatedIcons;
        }

        public final List<Trailing> getStaticIcons() {
            return this.staticIcons;
        }

        public int hashCode() {
            return (this.staticIcons.hashCode() * 31) + this.animatedIcons.hashCode();
        }

        public String toString() {
            return "MultiTrailing(staticIcons=" + this.staticIcons + ", animatedIcons=" + this.animatedIcons + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Trailing extends TextFieldIcon {
        public static final int $stable = 0;
        private final Integer contentDescription;
        private final int idRes;
        private final boolean isTintable;

        public /* synthetic */ Trailing(int i11, Integer num, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : num, z11);
        }

        public static /* synthetic */ Trailing copy$default(Trailing trailing, int i11, Integer num, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = trailing.idRes;
            }
            if ((i12 & 2) != 0) {
                num = trailing.contentDescription;
            }
            if ((i12 & 4) != 0) {
                z11 = trailing.isTintable;
            }
            return trailing.copy(i11, num, z11);
        }

        public final int component1() {
            return this.idRes;
        }

        public final Integer component2() {
            return this.contentDescription;
        }

        public final boolean component3() {
            return this.isTintable;
        }

        public final Trailing copy(int i11, Integer num, boolean z11) {
            return new Trailing(i11, num, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Trailing) {
                Trailing trailing = (Trailing) obj;
                return this.idRes == trailing.idRes && s.c(this.contentDescription, trailing.contentDescription) && this.isTintable == trailing.isTintable;
            }
            return false;
        }

        public final Integer getContentDescription() {
            return this.contentDescription;
        }

        public final int getIdRes() {
            return this.idRes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.idRes) * 31;
            Integer num = this.contentDescription;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            boolean z11 = this.isTintable;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode2 + i11;
        }

        public final boolean isTintable() {
            return this.isTintable;
        }

        public String toString() {
            return "Trailing(idRes=" + this.idRes + ", contentDescription=" + this.contentDescription + ", isTintable=" + this.isTintable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public Trailing(int i11, Integer num, boolean z11) {
            super(null);
            this.idRes = i11;
            this.contentDescription = num;
            this.isTintable = z11;
        }
    }

    private TextFieldIcon() {
    }

    public /* synthetic */ TextFieldIcon(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}