package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class AuthActivityStarterHost {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class ActivityHost extends AuthActivityStarterHost {
        private final ComponentActivity activity;
        private final Integer statusBarColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityHost(ComponentActivity activity, Integer num) {
            super(null);
            kotlin.jvm.internal.s.g(activity, "activity");
            this.activity = activity;
            this.statusBarColor = num;
        }

        public final ComponentActivity getActivity() {
            return this.activity;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public Integer getStatusBarColor$payments_core_release() {
            return this.statusBarColor;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public void startActivityForResult(Class<?> target, Bundle extras, int i11) {
            kotlin.jvm.internal.s.g(target, "target");
            kotlin.jvm.internal.s.g(extras, "extras");
            Intent putExtras = new Intent(this.activity, target).putExtras(extras);
            kotlin.jvm.internal.s.f(putExtras, "Intent(activity, target).putExtras(extras)");
            this.activity.startActivityForResult(putExtras, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class FragmentHost extends AuthActivityStarterHost {
        private final Fragment fragment;
        private final Integer statusBarColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentHost(Fragment fragment, Integer num) {
            super(null);
            kotlin.jvm.internal.s.g(fragment, "fragment");
            this.fragment = fragment;
            this.statusBarColor = num;
        }

        public final Fragment getFragment() {
            return this.fragment;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public Integer getStatusBarColor$payments_core_release() {
            return this.statusBarColor;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public void startActivityForResult(Class<?> target, Bundle extras, int i11) {
            kotlin.jvm.internal.s.g(target, "target");
            kotlin.jvm.internal.s.g(extras, "extras");
            Intent putExtras = new Intent(this.fragment.getActivity(), target).putExtras(extras);
            kotlin.jvm.internal.s.f(putExtras, "Intent(fragment.activity…target).putExtras(extras)");
            if (this.fragment.isAdded()) {
                this.fragment.startActivityForResult(putExtras, i11);
            }
        }
    }

    private AuthActivityStarterHost() {
    }

    public /* synthetic */ AuthActivityStarterHost(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer getStatusBarColor$payments_core_release();

    public abstract void startActivityForResult(Class<?> cls, Bundle bundle, int i11);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AuthActivityStarterHost create$payments_core_release(Fragment fragment) {
            kotlin.jvm.internal.s.g(fragment, "fragment");
            androidx.fragment.app.h requireActivity = fragment.requireActivity();
            kotlin.jvm.internal.s.f(requireActivity, "fragment.requireActivity()");
            Window window = requireActivity.getWindow();
            return new FragmentHost(fragment, window == null ? null : Integer.valueOf(window.getStatusBarColor()));
        }

        public final /* synthetic */ AuthActivityStarterHost create$payments_core_release(ComponentActivity activity) {
            kotlin.jvm.internal.s.g(activity, "activity");
            Window window = activity.getWindow();
            return new ActivityHost(activity, window == null ? null : Integer.valueOf(window.getStatusBarColor()));
        }
    }
}