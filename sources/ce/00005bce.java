package com.stripe.android.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.stripe.android.view.ActivityStarter.Args;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class ActivityStarter<TargetActivityType extends Activity, ArgsType extends Args> {
    public static final int $stable = 8;
    private final Activity activity;
    private final Fragment fragment;
    private final Integer intentFlags;
    private final int requestCode;
    private final Class<TargetActivityType> targetClass;

    /* loaded from: classes6.dex */
    public interface Args extends Parcelable {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EXTRA = "extra_activity_args";

        /* loaded from: classes6.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String EXTRA = "extra_activity_args";

            private Companion() {
            }

            public static /* synthetic */ void getEXTRA$annotations() {
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface Result extends Parcelable {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EXTRA = "extra_activity_result";

        /* loaded from: classes6.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String EXTRA = "extra_activity_result";

            private Companion() {
            }
        }

        Bundle toBundle();
    }

    public ActivityStarter(Activity activity, Fragment fragment, Class<TargetActivityType> targetClass, int i11, Integer num) {
        kotlin.jvm.internal.s.g(activity, "activity");
        kotlin.jvm.internal.s.g(targetClass, "targetClass");
        this.activity = activity;
        this.fragment = fragment;
        this.targetClass = targetClass;
        this.requestCode = i11;
        this.intentFlags = num;
    }

    public final void startForResult(ArgsType args) {
        kotlin.jvm.internal.s.g(args, "args");
        Intent putExtra = new Intent((Context) this.activity, (Class<?>) this.targetClass).putExtra("extra_activity_args", args);
        Integer num = this.intentFlags;
        if (num != null) {
            putExtra.addFlags(num.intValue());
        }
        kotlin.jvm.internal.s.f(putExtra, "Intent(activity, targetC…          }\n            }");
        Fragment fragment = this.fragment;
        if (fragment != null) {
            fragment.startActivityForResult(putExtra, this.requestCode);
        } else {
            this.activity.startActivityForResult(putExtra, this.requestCode);
        }
    }

    public /* synthetic */ ActivityStarter(Activity activity, Fragment fragment, Class cls, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i12 & 2) != 0 ? null : fragment, cls, i11, (i12 & 16) != 0 ? null : num);
    }

    public /* synthetic */ ActivityStarter(Activity activity, Class cls, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, cls, i11, (i12 & 8) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityStarter(Activity activity, Class<TargetActivityType> targetClass, int i11, Integer num) {
        this(activity, null, targetClass, i11, num);
        kotlin.jvm.internal.s.g(activity, "activity");
        kotlin.jvm.internal.s.g(targetClass, "targetClass");
    }

    public /* synthetic */ ActivityStarter(Fragment fragment, Class cls, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, cls, i11, (i12 & 8) != 0 ? null : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActivityStarter(androidx.fragment.app.Fragment r8, java.lang.Class<TargetActivityType> r9, int r10, java.lang.Integer r11) {
        /*
            r7 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "targetClass"
            kotlin.jvm.internal.s.g(r9, r0)
            androidx.fragment.app.h r2 = r8.requireActivity()
            java.lang.String r0 = "fragment.requireActivity()"
            kotlin.jvm.internal.s.f(r2, r0)
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.ActivityStarter.<init>(androidx.fragment.app.Fragment, java.lang.Class, int, java.lang.Integer):void");
    }
}