package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import ul.d;

/* loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: a  reason: collision with root package name */
    private final List<d<?>> f16461a;

    public DependencyCycleException(List<d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f16461a = list;
    }
}