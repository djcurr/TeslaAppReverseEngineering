package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface d<S> extends Parcelable {
    String C0(Context context);

    Collection<v3.d<Long, Long>> F0();

    void F1(long j11);

    View Z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);

    int a0(Context context);

    boolean p1();

    Collection<Long> v1();

    S y1();
}