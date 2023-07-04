package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.p;
import wz.v;

/* loaded from: classes6.dex */
public final class LayoutSpec {
    private final List<FormItemSpec> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LayoutSpec create(FormItemSpec... item) {
            List s02;
            s.g(item, "item");
            s02 = p.s0(item);
            return new LayoutSpec(s02);
        }

        public final LayoutSpec create() {
            List d11;
            d11 = v.d(EmptyFormSpec.INSTANCE);
            return new LayoutSpec(d11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutSpec(List<? extends FormItemSpec> items) {
        s.g(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutSpec copy$default(LayoutSpec layoutSpec, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = layoutSpec.items;
        }
        return layoutSpec.copy(list);
    }

    public final List<FormItemSpec> component1() {
        return this.items;
    }

    public final LayoutSpec copy(List<? extends FormItemSpec> items) {
        s.g(items, "items");
        return new LayoutSpec(items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutSpec) && s.c(this.items, ((LayoutSpec) obj).items);
    }

    public final List<FormItemSpec> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return "LayoutSpec(items=" + this.items + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}