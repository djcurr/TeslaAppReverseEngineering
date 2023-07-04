package com.stripe.android.paymentsheet.flowcontroller;

import androidx.activity.ComponentActivity;
import androidx.activity.result.d;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class ActivityLauncherFactory {

    /* loaded from: classes6.dex */
    public static final class ActivityHost extends ActivityLauncherFactory {
        private final ComponentActivity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityHost(ComponentActivity activity) {
            super(null);
            s.g(activity, "activity");
            this.activity = activity;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory
        public <I, O> d<I> create(f.a<I, O> contract, androidx.activity.result.b<O> callback) {
            s.g(contract, "contract");
            s.g(callback, "callback");
            d<I> registerForActivityResult = this.activity.registerForActivityResult(contract, callback);
            s.f(registerForActivityResult, "activity.registerForActi…   callback\n            )");
            return registerForActivityResult;
        }
    }

    /* loaded from: classes6.dex */
    public static final class FragmentHost extends ActivityLauncherFactory {
        private final Fragment fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentHost(Fragment fragment) {
            super(null);
            s.g(fragment, "fragment");
            this.fragment = fragment;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory
        public <I, O> d<I> create(f.a<I, O> contract, androidx.activity.result.b<O> callback) {
            s.g(contract, "contract");
            s.g(callback, "callback");
            d<I> registerForActivityResult = this.fragment.registerForActivityResult(contract, callback);
            s.f(registerForActivityResult, "fragment.registerForActi…   callback\n            )");
            return registerForActivityResult;
        }
    }

    private ActivityLauncherFactory() {
    }

    public /* synthetic */ ActivityLauncherFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <I, O> d<I> create(f.a<I, O> aVar, androidx.activity.result.b<O> bVar);
}